/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TrainerHistoryModel extends AbstractTableModel {
    
    private Trainer trainer;
    
    public TrainerHistoryModel(Trainer trainer) {
        setTrainer(trainer);
    }
    
    public String getColumnName(int col) {
        switch(col) {
            case 0:
                return "No";
            case 1:
                return "Session ID";
            case 2:
                return "Title";
            case 3:
                return "Date";
            case 4:
                return "Time";
            case 5:
                return "Type";
            default:
                return "Status";
        }
    }
    
    public Object getValueAt(int row, int col) {
        
        TrainingSession trainingsession = trainer.getTrainingsession().get(row);
        
        switch(col) {
            case 0:
                return row + 1;
            case 1:
                return trainingsession.getSessionID();
            case 2:
                return trainingsession.getTitle();
            case 3:
                return trainingsession.getDate();
            case 4:
                return trainingsession.getTime();
            case 5:
                if (trainingsession instanceof PersonalTraining)
                    return "Personal";
                else
                    return "Group";
            default:
                return trainingsession.getStatus();
        }
    }
    
    public int getRowCount() {
        return getTrainer().getTrainingsession().size();
    }
    
    public int getColumnCount() {
        return 7;
    }

    /**
     * @return the trainer
     */
    public Trainer getTrainer() {
        return trainer;
    }

    /**
     * @param trainer the trainer to set
     */
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
