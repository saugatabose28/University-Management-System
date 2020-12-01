package assignment3guitest;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.text.NumberFormatter;

public class mainWindowUI extends javax.swing.JFrame {

    private ButtonGroup group;
    public static Course bcs, mcs = null;
    public static Subject[] cCores, cEles, cCoresM, cElesM;
    public static Major[] BCSMajors, MCSMajors;
    public static Subject[] bDataCores, cyberSecCores, digitalSysSecCores, gameMobDevCores, softEngCores, intSysCores, macLearBDCores, NetInfoSecCores, softEngMCores;
    public static Major bigData, cyberSec, digitalSysSec, gameMobDev, softEng, intSys, macLearBD, NetInfoSec, softEngM;
    public static Record record1, record2, record3;
    public static ArrayList<Subject> modifiedCEles;
    public static int coreCredit, majorCredit, electivesCredit, totalEnrolledCredit;

    /**
     * Creates new form mainWindowUI
     */
    private static boolean isValidDate(String input) {
        String formatString = "dd/MM/yyyy";

        try {
            SimpleDateFormat format = new SimpleDateFormat(formatString);
            format.setLenient(false);
            format.parse(input);
        } catch (ParseException e) {
            return false;
        }

        return true;
    }

    public mainWindowUI() {
        initComponents();
        add(maleButton);
        add(femaleButton);
        group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);
        this.maleButton.setActionCommand("Male");
        this.femaleButton.setActionCommand("Female");
        this.enrolledCreditValueLabel.setText("0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        studentNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coreSubjectsList = new javax.swing.JList<>();
        bcsButton = new javax.swing.JButton();
        displaySubjectLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        majorsList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        majorcoresTXT = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        majorsCoresList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        electivesList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        studNumberField = new javax.swing.JTextField();
        femaleButton = new javax.swing.JRadioButton();
        maleButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        dateofBirth = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        enrolButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        mcsButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        courseNameLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalCreditLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        enrolledCreditValueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student Name: ");

        studentNameTextField.setName("stidentNameTextField"); // NOI18N
        studentNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Core Subjects:");

        coreSubjectsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                coreSubjectsListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(coreSubjectsList);

        bcsButton.setText("Bachelor of Computer Science");
        bcsButton.setName("bcsButton"); // NOI18N
        bcsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcsButtonActionPerformed(evt);
            }
        });

        majorsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        majorsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                majorsListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(majorsList);

        jLabel3.setText("Majors:");

        majorcoresTXT.setText("Major Cores:");

        jScrollPane3.setViewportView(majorsCoresList);

        electivesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                electivesListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(electivesList);

        jLabel4.setText("Electives:");

        jLabel6.setText("Student Number: ");

        studNumberField.setMaximumSize(new java.awt.Dimension(175, 23));
        studNumberField.setMinimumSize(new java.awt.Dimension(175, 23));
        studNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studNumberFieldActionPerformed(evt);
            }
        });
        studNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studNumberFieldKeyPressed(evt);
            }
        });

        femaleButton.setText("Female");

        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Gender:");

        dateofBirth.setText("DOB:");

        dobField.setMaximumSize(new java.awt.Dimension(175, 23));
        dobField.setMinimumSize(new java.awt.Dimension(175, 23));
        dobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobFieldActionPerformed(evt);
            }
        });

        enrolButton.setText("Enrol");
        enrolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrolButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        mcsButton.setText("Master of Computer Science");
        mcsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcsButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Course Name:");

        jLabel9.setText("Total Credit:");

        jLabel10.setText("Enrolled Credit:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(54, 54, 54))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(18, 18, 18)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(femaleButton)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(maleButton))
                                                    .addComponent(studentNameTextField))))
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                                        .addGap(42, 42, 42)))
                                .addComponent(displaySubjectLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bcsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enrolButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(42, 42, 42))
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseNameLabel)
                                    .addComponent(totalCreditLabel))
                                .addGap(422, 422, 422))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enrolledCreditValueLabel)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mcsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(dateofBirth))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(studNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(dobField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(majorcoresTXT)
                                                .addGap(0, 477, Short.MAX_VALUE))
                                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(72, 72, 72))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(studNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femaleButton)
                    .addComponent(maleButton)
                    .addComponent(jLabel7)
                    .addComponent(dateofBirth)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bcsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(mcsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(courseNameLabel))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(totalCreditLabel))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(majorcoresTXT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(displaySubjectLabel)
                        .addGap(170, 170, 170))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(enrolledCreditValueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enrolButton)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //DefaultListModel<String> model = new DefaultListModel<>();
    private void bcsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcsButtonActionPerformed
        // TODO add your handling code here:
        this.courseNameLabel.setText(bcs.getCourseName());
        int totalCreditBCS = bcs.getCourseCredit();
        String str = String.valueOf(totalCreditBCS);
        this.totalCreditLabel.setText(str);

        coreCredit = 96;
        String coreCreditStr = String.valueOf(coreCredit);
        this.enrolledCreditValueLabel.setText(coreCreditStr);

        DefaultListModel<String> model = new DefaultListModel<>();

        for (Subject s : cCores) {
            coreSubjectsList.setModel(model);
            model.addElement(bcs.displayCores(s));
        }

        DefaultListModel<String> model2 = new DefaultListModel<>();

        for (Major m : BCSMajors) {
            majorsList.setModel(model2);
            model2.addElement(bcs.displayMajors(m));
        }

        DefaultListModel<String> model3 = new DefaultListModel<>();
        for (Subject s : cEles) {
            this.electivesList.setModel(model3);
            model3.addElement(bcs.displayElectives(s));
        }
        try {
            FileOutputStream fileOut = new FileOutputStream("bcs.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(bcs);
            out.close();
            fileOut.close();
            //System.out.printf("Serialized data is saved in bcs.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
        bcsButton.setSelected(true);


    }//GEN-LAST:event_bcsButtonActionPerformed

    private void coreSubjectsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_coreSubjectsListValueChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_coreSubjectsListValueChanged

    private void majorsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_majorsListValueChanged
        DefaultListModel<String> model = new DefaultListModel<>();
        modifiedCEles = new ArrayList<Subject>();
        majorsCoresList.setModel(model);
        //ArrayList<String> majorCores= new ArrayList<String>();
        String text1 = majorsList.getSelectedValue();
        String text = text1.replace("\n", "");
        for (Major m : BCSMajors) {

            if (text.equals(m.getmName())) {

                if (text.equals("Big Data")) {

                    for (Subject s : bDataCores) {

                        model.addElement(m.displaySubjects(s));
                        majorCredit = 24;
                        totalEnrolledCredit = coreCredit + majorCredit;
                        String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
                        this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);
                    }

                    ArrayList<Subject> copyCEles = new ArrayList<Subject>();

                    ArrayList<Integer> matchedIndices = new ArrayList<Integer>();

                    int index = 0;

                    //copy of cles
                    for (Subject s : cEles) {
                        copyCEles.add(s);
                    }

                    for (Subject s : bDataCores) {

                        for (Subject s1 : copyCEles) {

                            if ((s.getSubjectCode().equals(s1.getSubjectCode()))) {

                                //matchedIndices[index]=copyCEles.lastIndexOf(s1);
                                matchedIndices.add(copyCEles.lastIndexOf(s1));

                                index += 1;

                            }

                        }

                    }

                    //these 3 lines of code are necessary for deleting data from cEles list
                    Collections.sort(matchedIndices, Collections.reverseOrder());

                    for (int i : matchedIndices) {
                        copyCEles.remove(i);
                    }

                    DefaultListModel<String> model3 = new DefaultListModel<>();

                    for (Subject s1 : copyCEles) {

                        this.electivesList.setModel(model3);

                        model3.addElement(bcs.displayElectives(s1));

                    }

                }

                if (text.equals("Cyber Security")) {

                    for (Subject s : cyberSecCores) {

                        model.addElement(m.displaySubjects(s));
                        majorCredit = 24;
                        totalEnrolledCredit = coreCredit + majorCredit;
                        String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
                        this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);

                    }

                    ArrayList<Subject> copyCEles = new ArrayList<Subject>();

                    ArrayList<Integer> matchedIndices = new ArrayList<Integer>();

                    int index = 0;

                    //copy of cles
                    for (Subject s : cEles) {
                        copyCEles.add(s);
                    }

                    for (Subject s : cyberSecCores) {

                        for (Subject s1 : copyCEles) {

                            if ((s.getSubjectCode().equals(s1.getSubjectCode()))) {

                                //matchedIndices[index]=copyCEles.lastIndexOf(s1);
                                matchedIndices.add(copyCEles.lastIndexOf(s1));

                                index += 1;

                            }

                        }

                    }

                    //these 3 lines of code are necessary for deleting data from cEles list
                    Collections.sort(matchedIndices, Collections.reverseOrder());

                    for (int i : matchedIndices) {
                        copyCEles.remove(i);
                    }

                    DefaultListModel<String> model3 = new DefaultListModel<>();

                    for (Subject s1 : copyCEles) {

                        this.electivesList.setModel(model3);

                        model3.addElement(bcs.displayElectives(s1));

                    }
                }

                if (text.equals("Digital System Security")) {

                    for (Subject s : digitalSysSecCores) {

                        model.addElement(m.displaySubjects(s));
                        majorCredit = 24;
                        totalEnrolledCredit = coreCredit + majorCredit;
                        String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
                        this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);
                    }

                    ArrayList<Subject> copyCEles = new ArrayList<Subject>();

                    ArrayList<Integer> matchedIndices = new ArrayList<Integer>();

                    int index = 0;

                    //copy of cles
                    for (Subject s : cEles) {
                        copyCEles.add(s);
                    }

                    for (Subject s : digitalSysSecCores) {

                        for (Subject s1 : copyCEles) {

                            if ((s.getSubjectCode().equals(s1.getSubjectCode()))) {

                                //matchedIndices[index]=copyCEles.lastIndexOf(s1);
                                matchedIndices.add(copyCEles.lastIndexOf(s1));

                                index += 1;

                            }

                        }

                    }

                    //these 3 lines of code are necessary for deleting data from cEles list
                    Collections.sort(matchedIndices, Collections.reverseOrder());

                    for (int i : matchedIndices) {
                        copyCEles.remove(i);
                    }

                    DefaultListModel<String> model3 = new DefaultListModel<>();

                    for (Subject s1 : copyCEles) {

                        this.electivesList.setModel(model3);

                        model3.addElement(bcs.displayElectives(s1));

                    }

                }

                if (text.equals("Game and Mobile Development")) {

                    for (Subject s : gameMobDevCores) {
                        model.addElement(m.displaySubjects(s));
                        majorCredit = 24;
                        totalEnrolledCredit = coreCredit + majorCredit;
                        String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
                        this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);

                    }

                    ArrayList<Subject> copyCEles = new ArrayList<Subject>();

                    ArrayList<Integer> matchedIndices = new ArrayList<Integer>();

                    int index = 0;

                    //copy of cles
                    for (Subject s : cEles) {
                        copyCEles.add(s);
                    }

                    for (Subject s : gameMobDevCores) {

                        for (Subject s1 : copyCEles) {

                            if ((s.getSubjectCode().equals(s1.getSubjectCode()))) {

                                //matchedIndices[index]=copyCEles.lastIndexOf(s1);
                                matchedIndices.add(copyCEles.lastIndexOf(s1));

                                index += 1;

                            }

                        }

                    }

                    //these 3 lines of code are necessary for deleting data from cEles list
                    Collections.sort(matchedIndices, Collections.reverseOrder());

                    for (int i : matchedIndices) {
                        copyCEles.remove(i);
                    }

                    DefaultListModel<String> model3 = new DefaultListModel<>();

                    for (Subject s1 : copyCEles) {

                        this.electivesList.setModel(model3);

                        model3.addElement(bcs.displayElectives(s1));

                    }

                }

                if (text.equals("Software Engineering")) {

                    for (Subject s : softEngCores) {

                        model.addElement(m.displaySubjects(s));
                        majorCredit = 24;
                        totalEnrolledCredit = coreCredit + majorCredit;
                        String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
                        this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);

                    }
                    ArrayList<Subject> copyCEles = new ArrayList<Subject>();

                    ArrayList<Integer> matchedIndices = new ArrayList<Integer>();

                    int index = 0;

                    //copy of cles
                    for (Subject s : cEles) {
                        copyCEles.add(s);
                    }

                    for (Subject s : softEngCores) {

                        for (Subject s1 : copyCEles) {

                            if ((s.getSubjectCode().equals(s1.getSubjectCode()))) {

                                //matchedIndices[index]=copyCEles.lastIndexOf(s1);
                                matchedIndices.add(copyCEles.lastIndexOf(s1));

                                index += 1;

                            }

                        }

                    }

                    //these 3 lines of code are necessary for deleting data from cEles list
                    Collections.sort(matchedIndices, Collections.reverseOrder());

                    for (int i : matchedIndices) {
                        copyCEles.remove(i);
                    }

                    DefaultListModel<String> model3 = new DefaultListModel<>();

                    for (Subject s1 : copyCEles) {

                        this.electivesList.setModel(model3);

                        model3.addElement(bcs.displayElectives(s1));

                    }

                }
            }
        }

        for (Major m : MCSMajors) {

            if (text.equals(m.getmName())) {

                if (text.equals("Intelligent System")) {

                    for (Subject s : intSysCores) {

                        model.addElement(m.displaySubjects(s));
                        majorCredit = 18;
                        totalEnrolledCredit = coreCredit + majorCredit;
                        String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
                        this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);

                        record1.enrolMajor(intSys);

                    }
                    ArrayList<Subject> copyCElesM = new ArrayList<Subject>();

                    ArrayList<Integer> matchedIndicesM = new ArrayList<Integer>();

                    int index = 0;

                    //copy of cles
                    for (Subject s : cElesM) {
                        copyCElesM.add(s);
                    }

                    for (Subject s : intSysCores) {

                        for (Subject s1 : copyCElesM) {

                            if ((s.getSubjectCode().equals(s1.getSubjectCode()))) {

                                //matchedIndices[index]=copyCEles.lastIndexOf(s1);
                                matchedIndicesM.add(copyCElesM.lastIndexOf(s1));

                                index += 1;

                            }

                        }

                    }

                    //these 3 lines of code are necessary for deleting data from cEles list
                    Collections.sort(matchedIndicesM, Collections.reverseOrder());

                    for (int i : matchedIndicesM) {
                        copyCElesM.remove(i);
                    }

                    DefaultListModel<String> model3 = new DefaultListModel<>();

                    for (Subject s1 : copyCElesM) {

                        this.electivesList.setModel(model3);

                        model3.addElement(mcs.displayElectives(s1));

                    }

                }

                if (text.equals("Machine Learning and Big Data")) {

                    for (Subject s : macLearBDCores) {

                        model.addElement(m.displaySubjects(s));
                        majorCredit = 18;
                        totalEnrolledCredit = coreCredit + majorCredit;
                        String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
                        this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);

                        record1.enrolMajor(macLearBD);

                    }
                    ArrayList<Subject> copyCElesM = new ArrayList<Subject>();

                    ArrayList<Integer> matchedIndicesM = new ArrayList<Integer>();

                    int index = 0;

                    //copy of cles
                    for (Subject s : cElesM) {
                        copyCElesM.add(s);
                    }

                    for (Subject s : macLearBDCores) {

                        for (Subject s1 : copyCElesM) {

                            if ((s.getSubjectCode().equals(s1.getSubjectCode()))) {

                                //matchedIndices[index]=copyCEles.lastIndexOf(s1);
                                matchedIndicesM.add(copyCElesM.lastIndexOf(s1));

                                index += 1;

                            }

                        }

                    }

                    //these 3 lines of code are necessary for deleting data from cEles list
                    Collections.sort(matchedIndicesM, Collections.reverseOrder());

                    for (int i : matchedIndicesM) {
                        copyCElesM.remove(i);
                    }

                    DefaultListModel<String> model3 = new DefaultListModel<>();

                    for (Subject s1 : copyCElesM) {

                        this.electivesList.setModel(model3);

                        model3.addElement(mcs.displayElectives(s1));

                    }

                }

                if (text.equals("Network and Information Security")) {

                    for (Subject s : NetInfoSecCores) {

                        model.addElement(m.displaySubjects(s));
                        majorCredit = 18;
                        totalEnrolledCredit = coreCredit + majorCredit;
                        String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
                        this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);

                        record1.enrolMajor(NetInfoSec);

                    }
                    ArrayList<Subject> copyCElesM = new ArrayList<Subject>();

                    ArrayList<Integer> matchedIndicesM = new ArrayList<Integer>();

                    int index = 0;

                    //copy of cles
                    for (Subject s : cElesM) {
                        copyCElesM.add(s);
                    }

                    for (Subject s : NetInfoSecCores) {

                        for (Subject s1 : copyCElesM) {

                            if ((s.getSubjectCode().equals(s1.getSubjectCode()))) {

                                //matchedIndices[index]=copyCEles.lastIndexOf(s1);
                                matchedIndicesM.add(copyCElesM.lastIndexOf(s1));

                                index += 1;

                            }

                        }

                    }

                    //these 3 lines of code are necessary for deleting data from cEles list
                    Collections.sort(matchedIndicesM, Collections.reverseOrder());

                    for (int i : matchedIndicesM) {
                        copyCElesM.remove(i);
                    }

                    DefaultListModel<String> model3 = new DefaultListModel<>();

                    for (Subject s1 : copyCElesM) {

                        this.electivesList.setModel(model3);

                        model3.addElement(mcs.displayElectives(s1));

                    }

                }

                if (text.equals("Software Engineering")) {

                    for (Subject s : softEngMCores) {

                        model.addElement(m.displaySubjects(s));
                        majorCredit = 18;
                        totalEnrolledCredit = coreCredit + majorCredit;
                        String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
                        this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);

                        record1.enrolMajor(softEngM);

                    }
                    ArrayList<Subject> copyCElesM = new ArrayList<Subject>();

                    ArrayList<Integer> matchedIndicesM = new ArrayList<Integer>();

                    int index = 0;

                    //copy of cles
                    for (Subject s : cElesM) {
                        copyCElesM.add(s);
                    }

                    for (Subject s : softEngMCores) {

                        for (Subject s1 : copyCElesM) {

                            if ((s.getSubjectCode().equals(s1.getSubjectCode()))) {

                                //matchedIndices[index]=copyCEles.lastIndexOf(s1);
                                matchedIndicesM.add(copyCElesM.lastIndexOf(s1));

                                index += 1;

                            }

                        }

                    }

                    //these 3 lines of code are necessary for deleting data from cEles list
                    Collections.sort(matchedIndicesM, Collections.reverseOrder());

                    for (int i : matchedIndicesM) {
                        copyCElesM.remove(i);
                    }

                    DefaultListModel<String> model3 = new DefaultListModel<>();

                    for (Subject s1 : copyCElesM) {

                        this.electivesList.setModel(model3);

                        model3.addElement(mcs.displayElectives(s1));

                    }

                }

            }

        }

    }//GEN-LAST:event_majorsListValueChanged

    private void electivesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_electivesListValueChanged

        if (bcsButton.isSelected()) {
            record1 = new Record(bcs.getCourseName());
            ArrayList<String> textList = (ArrayList<String>) electivesList.getSelectedValuesList();
            DefaultListModel<String> model1 = new DefaultListModel<>();
            for (String s : textList) {
                model1.addElement(s);
            }
            electivesCredit = 6;
            totalEnrolledCredit = totalEnrolledCredit + electivesCredit / 2;
            String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
            this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);
            for (int i = 0; i < textList.size(); i++) {
                int index1 = textList.get(i).indexOf('(');
                String text1 = textList.get(i).substring(0, index1 - 1);
                for (Subject subj : cEles) {
                    if (text1.equals(subj.getSubjectCode())) {
                        record1.enrolElective(subj);
                    }
                }
            }
        }

        if (mcsButton.isSelected()) {
            record3 = new Record(mcs.getCourseName());
            ArrayList<String> textList = (ArrayList<String>) electivesList.getSelectedValuesList();
            DefaultListModel<String> model1 = new DefaultListModel<>();
            for (String s : textList) {
                model1.addElement(s);
            }
            electivesCredit = 6;
            totalEnrolledCredit = totalEnrolledCredit + electivesCredit / 2;
            String totalEnrolledCreditStr = String.valueOf(totalEnrolledCredit);
            this.enrolledCreditValueLabel.setText(totalEnrolledCreditStr);
            for (int i = 0; i < textList.size(); i++) {
                int index1 = textList.get(i).indexOf('(');
                String text1 = textList.get(i).substring(0, index1 - 1);
                for (Subject subj : cElesM) {
                    if (text1.equals(subj.getSubjectCode())) {
                        record3.enrolElective(subj);
                    }
                }
            }
        }

    }//GEN-LAST:event_electivesListValueChanged

    private void studentNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameTextFieldActionPerformed
        if (studentNameTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Java.util.InputMismatchException: Student name is not inputted", "Validation Checking", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_studentNameTextFieldActionPerformed

    private void studNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studNumberFieldActionPerformed
        if (studNumberField.getText().equals("")) {//If student number field is not filled in, throw exception
            JOptionPane.showMessageDialog(null, "Student number is not inputted" + studNumberField.getText(), "Validation Checking", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_studNumberFieldActionPerformed

    private void studNumberFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studNumberFieldKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {//Do not allow user to input numbers
            JOptionPane.showMessageDialog(null, "Input must be a number" + studNumberField.getText(), "Validation Checking", JOptionPane.ERROR_MESSAGE);//Get a message if user inputs numbers, warning them to use numbers only
        }


    }//GEN-LAST:event_studNumberFieldKeyPressed

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobFieldActionPerformed

        if (dobField.getText().equals("")) {//If no data is given, throw exception message
            JOptionPane.showMessageDialog(null, "Java.util.InputMismatchException: Student DOB is not inputted", "Validation Checking", JOptionPane.ERROR_MESSAGE);
        }
        boolean c = true;
        do {
            try {
                if (!isValidDate(dobField.getText())) { //Check for correct date format
                    JOptionPane.showMessageDialog(null, "DOBException: The DOB format is wrong: " + dobField.getText(), "Validation Checking", JOptionPane.ERROR_MESSAGE);
                }
                c = false;
            } catch (Exception exc) {
                JOptionPane.showMessageDialog(this, exc.getMessage());
            }
        } while (c);

    }//GEN-LAST:event_dobFieldActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        this.studentNameTextField.setText(null);//Clear student name field
        this.studNumberField.setText(null);//Clear student number field
        group.clearSelection();//Clear gender selection
        this.dobField.setText(null);//Clear DOB Field
        this.courseNameLabel.setText(null);//Clear course name
        this.totalCreditLabel.setText(null);//Clear total credit
        this.enrolledCreditValueLabel.setText("0");//Clear enrolled credit back to 0s

        //Clear electives list
        if (bcsButton.isSelected()) {
            //Clear core subjects
            DefaultListModel<String> model = new DefaultListModel<>();
            model.clear();
            this.coreSubjectsList.setModel(model);
            this.majorsList.setModel(model);
            model.clear();
            DefaultListModel<String> model2 = new DefaultListModel<>();
            this.electivesList.clearSelection();
            this.electivesList.setModel(model);
            //Clear major cores list
            DefaultListModel<String> model3 = new DefaultListModel<>();
            model3.clear();
            for (Major m : BCSMajors) {
                model3.removeAllElements();
            }

        }

        if (mcsButton.isSelected()) {
            //Clear core subjects
            DefaultListModel<String> model = new DefaultListModel<>();
            model.clear();
            this.coreSubjectsList.setModel(model);
            this.majorsList.setModel(model);
            model.clear();
            DefaultListModel<String> model2 = new DefaultListModel<>();
            this.electivesList.clearSelection();
            this.electivesList.setModel(model);
            //Clear major cores list
            DefaultListModel<String> model3 = new DefaultListModel<>();
            model3.clear();
            for (Major m : MCSMajors) {
                model3.removeAllElements();
            }
        }

    }//GEN-LAST:event_resetButtonActionPerformed

    private void mcsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcsButtonActionPerformed
        // TODO add your handling code here
        this.courseNameLabel.setText(mcs.getCourseName());
        int totalCreditMCS = mcs.getCourseCredit();
        String str = String.valueOf(totalCreditMCS);
        this.totalCreditLabel.setText(str);

        coreCredit = 54;
        String coreCreditStr = String.valueOf(coreCredit);
        this.enrolledCreditValueLabel.setText(coreCreditStr);

        DefaultListModel<String> mdl = new DefaultListModel<>();

        coreSubjectsList.setModel(mdl);
        for (Subject s : cCoresM) {
            mdl.addElement(mcs.displayCores(s));
        }

        DefaultListModel<String> mdl2 = new DefaultListModel<>();

        majorsList.setModel(mdl2);
        for (Major m : MCSMajors) {
            mdl2.addElement(mcs.displayMajors(m));
        }

        DefaultListModel<String> mdl3 = new DefaultListModel<>();
        this.electivesList.setModel(mdl3);
        for (Subject s : cElesM) {
            mdl3.addElement(mcs.displayElectives(s));
        }
        //Create mcs.ser file when mcs button is clicked
        try {
            FileOutputStream fileOut = new FileOutputStream("mcs.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(mcs);
            out.close();
            fileOut.close();
            //System.out.printf("\nSerialized data is saved in mcs.ser\n");
        } catch (IOException i) {
            i.printStackTrace();
        }

        mcsButton.setSelected(true);

    }//GEN-LAST:event_mcsButtonActionPerformed

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "The system is reset.", "System Reset", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_resetButtonMouseClicked


    private void enrolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrolButtonActionPerformed
       

        if (bcsButton.isSelected()) {
            //Add BCS Cores to record
            ArrayList<Subject> cores = new ArrayList<>(Arrays.asList(cCores));
            record1.enrolCores(cores);
            //Add BCS Majors to record
            DefaultListModel<String> model = new DefaultListModel<>();
            String text1 = majorsList.getSelectedValue();
            String text = text1.replace("\n", "");
            for (Major m : BCSMajors) {
                if (text.equals(m.getmName())) {
                    record1.enrolMajor(m);//Enrol majors if selected value equals major name
                }
            }
            String studentName = this.studentNameTextField.getText();
            String studNumber = this.studNumberField.getText();
            int studentNumber = Integer.parseInt(studNumber);
            String genderSelection = group.getSelection().getActionCommand();
            Student stud1 = new UnderGraduate(studentName, studentNumber, genderSelection, this.dobField.getText(), "");
            if (stud1 instanceof UnderGraduate) {
                ((UnderGraduate) stud1).writeFileUnderGrad(studentName + "_bcs.txt");
                record1.setStatus(Record.Status.ACTIVE);
                record1.setTotalCredit(totalEnrolledCredit);
                record1.writeRecordFileUnderGrad(studentName + "_bcs.txt");
            }
            JOptionPane.showMessageDialog(null, "The student's enrolnment record is saved.", "Save Enrolnment Record", JOptionPane.INFORMATION_MESSAGE);
        }

        if (mcsButton.isSelected()) {
            //Enrol student to MCS Course
            ArrayList<Subject> masterCores = new ArrayList<>(Arrays.asList(cCoresM));
            record3.enrolCores(masterCores);
            DefaultListModel<String> model = new DefaultListModel<>();
            String text1 = majorsList.getSelectedValue();
            String text = text1.replace("\n", "");
            for (Major m : MCSMajors) {
                if (text.equals(m.getmName())) {
                    record3.enrolMajor(m);//Enrol majors if selected value equals major name
                }
            }
            String studentName2 = this.studentNameTextField.getText();
            String studNumber2 = this.studNumberField.getText();
            int studentNumber2 = Integer.parseInt(studNumber2);
            String genderSelection2 = group.getSelection().getActionCommand();
            Student stud2 = new PostGraduate(studentName2, studentNumber2, genderSelection2, this.dobField.getText(), "", "Spring/2022");
            if (stud2 instanceof PostGraduate) {
                ((PostGraduate) stud2).writePostGradFile(studentName2 + "_mcs.txt");
                record3.setStatus(Record.Status.ACTIVE);
                record3.setTotalCredit(totalEnrolledCredit);
                record3.writeRecordFilePostGrad(studentName2 + "_mcs.txt");
            }
            JOptionPane.showMessageDialog(null, "The student's enrolnment record is saved.", "Save Enrolnment Record", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_enrolButtonActionPerformed

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainWindowUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindowUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindowUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindowUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindowUI().setVisible(true);
            }
        });
        //Creating subject objects

        Subject CSIT111 = new Subject("CSIT111", "Programming Fundamentals", 6);
        Subject CSIT113 = new Subject("CSIT113", "Problem Solving", 6);
        Subject CSIT114 = new Subject("CSIT114", "System Analysis", 6);
        Subject CSIT115 = new Subject("CSIT115", "Data Management and Security", 6);
        Subject CSIT121 = new Subject("CSIT121", "Object Oriented Design and Programming", 6);
        Subject CSIT127 = new Subject("CSIT127", "Networks and Communications", 6);
        Subject CSIT128 = new Subject("CSIT128", "Inroduction to Web Technology", 6);
        Subject CSCI235 = new Subject("CSCI235", "Database Systems", 6);
        Subject CSCI251 = new Subject("CSCI251", "Advanced Programming", 6);
        Subject CSIT214 = new Subject("CSIT214", "IT Project Management", 6);
        Subject MATH221 = new Subject("MATH221", "Mathematics for Computer Science", 6);
        Subject CSCI203 = new Subject("CSCI203", "Algorithms and Data Structures", 6);
        Subject CSIT226 = new Subject("CSIT226", "Human Computer Interaction", 6);
        Subject CSIT314 = new Subject("CSIT314", "Software Development Methodologies", 6);
        Subject CSIT321 = new Subject("CSIT321", "Project", 12);
        Subject CSCI317 = new Subject("CSCI317", "Database Performance Tuning", 6);
        Subject INFO411 = new Subject("INFO411", "Data Mining and Knowledge Discovery", 6);
        Subject CSCI316 = new Subject("CSCI316", "Big Data Mining Techniques and Implementation", 6);
        Subject ISIT312 = new Subject("ISIT312", "Big Data Management", 6);
        Subject CSCI301 = new Subject("CSCI301", "Contemporary Topics in Security", 6);
        Subject CSCI262 = new Subject("CSCI262", "System Security", 6);
        Subject CSCI369 = new Subject("CSCI369", "Ethical Hacking", 6);
        Subject CSIT302 = new Subject("CSIT302", "Cybersecurity", 6);
        Subject CSCI361 = new Subject("CSCI361", "Cryptography and Secure Applications", 6);
        Subject CSCI368 = new Subject("CSCI368", "Network Security", 6);
        Subject CSCI376 = new Subject("CSCI376", "Multicore and GPU Programming", 6);
        Subject CSCI236 = new Subject("CSCI236", "3D Modelling and Animation", 6);
        Subject CSCI336 = new Subject("CSCI336", "Interactive Computer Graphics", 6);
        Subject CSCI366 = new Subject("CSCI366", "Mobile Multimedia", 6);
        Subject CSCI356 = new Subject("CSCI356", "Game Engine Essentials", 6);
        Subject CSCI334 = new Subject("CSCI334", "Software Design", 6);
        Subject ISIT219 = new Subject("ISIT219", "Knowledge and Information Engineering", 6);
        Subject CSCI318 = new Subject("CSCI318", "Software Engineering Practices & Principles", 6);
        Subject ISIT315 = new Subject("ISIT315", "Semantic Web", 6);

        //Create big data major
        bigData = new Major("Big Data");
        bDataCores = new Subject[]{CSCI317, INFO411, CSCI316, ISIT312};
        bigData.addMCores(bDataCores);

        //Create cyber sec major
        cyberSec = new Major("Cyber Security");
        cyberSecCores = new Subject[]{CSCI301, CSCI262, CSCI369, CSIT302};
        cyberSec.addMCores(cyberSecCores);

        //Create digital sys sec major
        digitalSysSec = new Major("Digital System Security");
        digitalSysSecCores = new Subject[]{CSCI361, CSCI262, CSCI368, CSCI376};
        digitalSysSec.addMCores(digitalSysSecCores);

        //Create game mob dev major
        gameMobDev = new Major("Game and Mobile Development");
        gameMobDevCores = new Subject[]{CSCI236, CSCI336, CSCI366, CSCI356};
        gameMobDev.addMCores(gameMobDevCores);

        //Create soft eng major
        softEng = new Major("Software Engineering");
        softEngCores = new Subject[]{CSCI334, ISIT219, CSCI318, ISIT315};
        softEng.addMCores(softEngCores);

        BCSMajors = new Major[]{bigData, cyberSec, digitalSysSec, gameMobDev, softEng};

        //Course core objects
        cCores = new Subject[]{CSIT111, CSIT113, CSIT114, CSIT115, CSIT121,
            CSIT127, CSIT128, CSCI235, CSCI251,
            CSIT214, MATH221, CSCI203, CSIT226, CSIT314, CSIT321};
        //Course elective objects
        cEles = new Subject[]{CSCI317, INFO411, CSCI316, ISIT312, CSCI301, CSCI262,
            CSCI369, CSIT302, CSCI361, CSCI368, CSCI376, CSCI236, CSCI336, CSCI366, CSCI356,
            CSCI334, ISIT219, CSCI318, ISIT315};

        //Create Course Objects
        bcs = new Course("Bachelor of Computer Science", 144);
        bcs.addCores(cCores);
        bcs.addMajors(BCSMajors);
        bcs.addElectives(cEles);
        record1 = new Record(bcs.getCourseName());

        // create the master of comptuer science course
        Subject CSCI814 = new Subject("CSCI814", "IT Project Management", 6);
        Subject CSCI851 = new Subject("CSCI851", "Advanced Programming", 6);
        Subject CSCI803 = new Subject("CSCI803", "Algorithms and Data Structures", 6);
        Subject CSCI835 = new Subject("CSCI835", "Database Systems", 6);
        Subject CSCI862 = new Subject("CSCI862", "System Security", 6);
        Subject CSIT826 = new Subject("CSIT826", "Human Computer Interaction", 6);
        Subject MTS9302 = new Subject("MTS9302", "Corporate Network Management", 6);
        Subject ISIT925 = new Subject("ISIT925", "Strategic Network Design", 6);
        Subject CSIT940 = new Subject("CSIT940", "Research Methodology", 6);
        Subject CSCI920 = new Subject("CSCI920", "Contemporary Topics in Computer Science", 6);
        Subject CSCI992 = new Subject("CSCI992", "Professional Project", 12);
        Subject CSCI964 = new Subject("CSCI964", "Computational Intelligence", 6);
        Subject CSCI924 = new Subject("CSCI924", "Reasoning and Learning", 6);
        Subject CSCI944 = new Subject("CSCI944", "Perception and Planning", 6);
        Subject CSCI933 = new Subject("CSCI933", "Machine Learning Algorithms and Applications", 6);
        Subject CSCI935 = new Subject("CSCI935", "Computer Vision Algorithms and Systems", 6);
        Subject CSCI946 = new Subject("CSCI946", "Big Data Analytics", 6);
        Subject CSCI968 = new Subject("CSCI968", "Advanced Network Security", 6);
        Subject INFO912 = new Subject("INFO912", "Mathematics for Cryptography", 6);
        Subject CSCI971 = new Subject("CSCI971", "Advanced Computer Security", 6);
        Subject CSCI910 = new Subject("CSCI910", "Software Requirements, Specifications and Formal Methods", 6);
        Subject CSCI926 = new Subject("CSCI926", "Software Testing and Analysis", 6);
        Subject CSCI927 = new Subject("CSCI927", "Service-Oriented Software Engineering", 6);
        Subject ECTE903 = new Subject("ECTE903", "Image and Video Processing", 6);
        Subject INFO911 = new Subject("INFO911", "Data Mining and Knowledge Discovery", 6);
        Subject INFO913 = new Subject("INFO913", "Information Theory", 6);

        intSys = new Major("Intelligent System");
        intSysCores = new Subject[]{CSCI964, CSCI924, CSCI944};
        intSys.addMCores(intSysCores);

        macLearBD = new Major("Machine Learning and Big Data");
        macLearBDCores = new Subject[]{CSCI933, CSCI935, CSCI946};
        macLearBD.addMCores(macLearBDCores);

        NetInfoSec = new Major("Network and Information Security");
        NetInfoSecCores = new Subject[]{CSCI968, INFO912, CSCI971};
        NetInfoSec.addMCores(NetInfoSecCores);

        softEngM = new Major("Software Engineering");
        softEngMCores = new Subject[]{CSCI910, CSCI926, CSCI927};
        softEngM.addMCores(softEngMCores);

        MCSMajors = new Major[]{intSys, macLearBD, NetInfoSec, softEngM};

        cCoresM = new Subject[]{CSCI814, CSCI851, CSCI803, CSCI835, MTS9302, CSIT940, CSCI920, CSCI992};

        cElesM = new Subject[]{CSCI862, CSIT826, ISIT925, CSCI964, CSCI924, CSCI944, CSCI933,
            CSCI935, CSCI946, CSCI968, INFO912, CSCI971, CSCI910, CSCI926, CSCI927, ECTE903, INFO911, INFO913};

        mcs = new Course("Master of Computer Science", 96);
        mcs.addCores(cCoresM);
        mcs.addMajors(MCSMajors);
        mcs.addElectives(cElesM);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcsButton;
    private javax.swing.JList<String> coreSubjectsList;
    private javax.swing.JLabel courseNameLabel;
    private javax.swing.JLabel dateofBirth;
    private javax.swing.JLabel displaySubjectLabel;
    private javax.swing.JTextField dobField;
    private javax.swing.JList<String> electivesList;
    private javax.swing.JButton enrolButton;
    private javax.swing.JLabel enrolledCreditValueLabel;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel majorcoresTXT;
    private javax.swing.JList<String> majorsCoresList;
    private javax.swing.JList<String> majorsList;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JButton mcsButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField studNumberField;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JLabel totalCreditLabel;
    // End of variables declaration//GEN-END:variables
}
