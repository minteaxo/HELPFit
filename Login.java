
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mint
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Left.setBackground(new Color(0,0,0,200));
        this.setLocationRelativeTo(null);
        helpfit = new HELPFit();
        signupBtn.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Signup = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        userF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        passF = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        createBtn = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TrainerSeperator = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        emailF = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        MemberSeperator = new javax.swing.JSeparator();
        LabelChanger = new javax.swing.JLabel();
        specialtyBox = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        levelBox = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        nameF = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        Right = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameF = new javax.swing.JTextField();
        passwordF = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        signupBtn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        Signup.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Signup.setAlwaysOnTop(true);
        Signup.setResizable(false);
        Signup.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(25, 24, 28));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(242, 146, 22));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 146, 22));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TRAINER");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 170, 40));

        userF.setBackground(new java.awt.Color(25, 24, 28));
        userF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        userF.setForeground(new java.awt.Color(255, 255, 255));
        userF.setText("Enter your username");
        userF.setBorder(null);
        userF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userFMouseClicked(evt);
            }
        });
        jPanel3.add(userF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 343, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("PASSWORD");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        passF.setBackground(new java.awt.Color(25, 24, 28));
        passF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        passF.setForeground(new java.awt.Color(255, 255, 255));
        passF.setText("jPasswordField1");
        passF.setBorder(null);
        passF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passFMouseClicked(evt);
            }
        });
        jPanel3.add(passF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 343, 30));

        jPanel4.setBackground(new java.awt.Color(25, 24, 28));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(242, 146, 22)));

        createBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 255));
        createBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createBtn.setText("Create New Account");
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 340, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SIGN UP");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        TrainerSeperator.setBackground(new java.awt.Color(242, 146, 22));
        TrainerSeperator.setForeground(new java.awt.Color(242, 146, 22));
        jPanel3.add(TrainerSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 170, 10));

        jSeparator6.setBackground(new java.awt.Color(242, 146, 22));
        jSeparator6.setForeground(new java.awt.Color(242, 146, 22));
        jSeparator6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 340, 10));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("EMAIL ADDRESS");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        emailF.setBackground(new java.awt.Color(25, 24, 28));
        emailF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        emailF.setForeground(new java.awt.Color(255, 255, 255));
        emailF.setText("jsmith@example.com");
        emailF.setBorder(null);
        emailF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailFMouseClicked(evt);
            }
        });
        jPanel3.add(emailF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 343, 30));

        jSeparator7.setBackground(new java.awt.Color(242, 146, 22));
        jSeparator7.setForeground(new java.awt.Color(242, 146, 22));
        jSeparator7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 340, 10));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("USERNAME");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel18.setBackground(new java.awt.Color(242, 146, 22));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(242, 146, 22));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MEMBER");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, 40));

        jSeparator8.setBackground(new java.awt.Color(242, 146, 22));
        jSeparator8.setForeground(new java.awt.Color(242, 146, 22));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 340, 10));

        MemberSeperator.setBackground(new java.awt.Color(242, 146, 22));
        MemberSeperator.setForeground(new java.awt.Color(242, 146, 22));
        jPanel3.add(MemberSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, 10));

        LabelChanger.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        LabelChanger.setForeground(new java.awt.Color(153, 153, 153));
        LabelChanger.setText("LEVEL");
        jPanel3.add(LabelChanger, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        specialtyBox.setBackground(new java.awt.Color(25, 24, 28));
        specialtyBox.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        specialtyBox.setForeground(new java.awt.Color(255, 255, 255));
        specialtyBox.setText("Taekwondo, Yoga...");
        specialtyBox.setBorder(null);
        specialtyBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                specialtyBoxMouseClicked(evt);
            }
        });
        jPanel3.add(specialtyBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 343, 30));

        jSeparator9.setBackground(new java.awt.Color(242, 146, 22));
        jSeparator9.setForeground(new java.awt.Color(242, 146, 22));
        jSeparator9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 340, 10));

        levelBox.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        levelBox.setForeground(new java.awt.Color(255, 255, 255));
        levelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beginner", "Intermediate", "Expert" }));
        jPanel3.add(levelBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 340, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("FULL NAME");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        nameF.setBackground(new java.awt.Color(25, 24, 28));
        nameF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nameF.setForeground(new java.awt.Color(255, 255, 255));
        nameF.setText("John Smith");
        nameF.setBorder(null);
        nameF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFMouseClicked(evt);
            }
        });
        jPanel3.add(nameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 343, 30));

        jSeparator10.setBackground(new java.awt.Color(242, 146, 22));
        jSeparator10.setForeground(new java.awt.Color(242, 146, 22));
        jSeparator10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 340, 10));

        Signup.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 610));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Right.setBackground(new java.awt.Color(25, 24, 28));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 146, 22));
        jLabel4.setText("WELCOME BACK TO HELPFIT.");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("USERNAME");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("PASSWORD");

        usernameF.setBackground(new java.awt.Color(25, 24, 28));
        usernameF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        usernameF.setForeground(new java.awt.Color(255, 255, 255));
        usernameF.setText("Enter your username");
        usernameF.setBorder(null);
        usernameF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameFMouseClicked(evt);
            }
        });

        passwordF.setBackground(new java.awt.Color(25, 24, 28));
        passwordF.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        passwordF.setForeground(new java.awt.Color(255, 255, 255));
        passwordF.setText("jPasswordField1");
        passwordF.setBorder(null);
        passwordF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFMouseClicked(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(242, 146, 22));
        jSeparator3.setForeground(new java.awt.Color(242, 146, 22));

        jSeparator4.setBackground(new java.awt.Color(242, 146, 22));
        jSeparator4.setForeground(new java.awt.Color(242, 146, 22));
        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(25, 24, 28));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(242, 146, 22)));

        loginBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("LOGIN");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SIGN IN");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(225, 225, 225))
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordF)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3)
                    .addComponent(usernameF)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel9)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(usernameF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        getContentPane().add(Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 570, 630));

        Left.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HELPFit");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Don't have an account yet?");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(242, 146, 22)));

        signupBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupBtn.setText("SIGN UP");
        signupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("We help you to keep fit.");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        getContentPane().add(Left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 630));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg_4.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, -1, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseClicked
        Signup.pack();
        MemberSeperator.setVisible(true);
        userF.setText("Enter your username");
        passF.setText("enteryourpassword");
        emailF.setText("jsmith@example.com");
        nameF.setText("John Smith");
        specialtyBox.setText("Taekwondo, Yoga...");
        LabelChanger.setText("LEVEL");
        levelBox.setSelectedIndex(0);
        levelBox.setVisible(true);
        jSeparator9.setVisible(false);
        Signup.setVisible(true);
        TrainerSeperator.setVisible(false);
        specialtyBox.setVisible(false);
        Signup.setLocationRelativeTo(null);
    }//GEN-LAST:event_signupBtnMouseClicked

    private void signupBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseEntered
        signupBtn.setForeground(new Color(242,146,22));
    }//GEN-LAST:event_signupBtnMouseEntered

    private void signupBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseExited
        signupBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_signupBtnMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setForeground(new Color(242,146,22));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_loginBtnMouseExited

    private void createBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseEntered
        createBtn.setForeground(new Color(242,146,22));
    }//GEN-LAST:event_createBtnMouseEntered

    private void createBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseExited
        createBtn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_createBtnMouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        TrainerSeperator.setVisible(true);
        MemberSeperator.setVisible(false);
        LabelChanger.setText("SPECIALTY");
        levelBox.setVisible(false);
        specialtyBox.setVisible(true);
        jSeparator9.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        TrainerSeperator.setVisible(false);
        MemberSeperator.setVisible(true);
        LabelChanger.setText("LEVEL");
        levelBox.setVisible(true);
        specialtyBox.setVisible(false);
        jSeparator9.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void createBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBtnMouseClicked
        for (User aUser:getHelpfit().getUser()){
            if (aUser.getUsername().equalsIgnoreCase(userF.getText())){
                JOptionPane.showMessageDialog(Signup, "Username has been taken!");
                return;
            }
        }
        
        Signup.setVisible(false);
        
        if (MemberSeperator.isVisible()){
            getHelpfit().getUser().add(new Member(userF.getText(),passF.getText(),
            nameF.getText(),emailF.getText(),
                    levelBox.getSelectedItem().toString()));
        }
        else{
            getHelpfit().getUser().add(new Trainer(userF.getText(),passF.getText(),
            nameF.getText(),emailF.getText(),specialtyBox.getText()));
        }
    }//GEN-LAST:event_createBtnMouseClicked

    private void usernameFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFMouseClicked
        usernameF.setText("");
    }//GEN-LAST:event_usernameFMouseClicked

    private void passwordFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFMouseClicked
        passwordF.setText("");
    }//GEN-LAST:event_passwordFMouseClicked

    private void userFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userFMouseClicked
        userF.setText("");
    }//GEN-LAST:event_userFMouseClicked

    private void nameFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFMouseClicked
        nameF.setText("");
    }//GEN-LAST:event_nameFMouseClicked

    private void passFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passFMouseClicked
        passF.setText("");
    }//GEN-LAST:event_passFMouseClicked

    private void specialtyBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_specialtyBoxMouseClicked
        specialtyBox.setText("");
    }//GEN-LAST:event_specialtyBoxMouseClicked

    private void emailFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFMouseClicked
        emailF.setText("");
    }//GEN-LAST:event_emailFMouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        if (getHelpfit().getUser().isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Please register an account first.");
            return;
        }
        boolean authentication = false;
        
        for (User aUser: getHelpfit().getUser()){
            if(usernameF.getText().equalsIgnoreCase(aUser.getUsername()) &&
                    passwordF.getText().equals(aUser.getPassword())){
                authentication = true;
                loginUser = aUser;
            }
        }
        if (authentication == false){
            JOptionPane.showMessageDialog(this, "Invalid details.");
            return;
        }
        this.setVisible(false);
        
        if (loginUser instanceof Trainer){
            TrainerHome homepage = new TrainerHome(helpfit,
                    usernameF.getText(), this);
            homepage.setLocationRelativeTo(null);
            homepage.setVisible(true);
        }
        else{
            MemberHome homepage = new MemberHome(helpfit,
                    usernameF.getText(), this);
            homepage.setLocationRelativeTo(null);
            homepage.setVisible(true);
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private User loginUser;
    private HELPFit helpfit;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelChanger;
    private javax.swing.JPanel Left;
    private javax.swing.JSeparator MemberSeperator;
    private javax.swing.JPanel Right;
    private javax.swing.JDialog Signup;
    private javax.swing.JSeparator TrainerSeperator;
    private javax.swing.JLabel createBtn;
    private javax.swing.JTextField emailF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> levelBox;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JTextField nameF;
    private javax.swing.JPasswordField passF;
    private javax.swing.JPasswordField passwordF;
    private javax.swing.JLabel signupBtn;
    private javax.swing.JTextField specialtyBox;
    private javax.swing.JTextField userF;
    private javax.swing.JTextField usernameF;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the helpfit
     */
    public HELPFit getHelpfit() {
        return helpfit;
    }

    /**
     * @param helpfit the helpfit to set
     */
    public void setHelpfit(HELPFit helpfit) {
        this.helpfit = helpfit;
    }
}
