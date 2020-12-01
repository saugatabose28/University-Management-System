package assignment3guitest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

class PostGraduate extends Student {

    //Postgraduate Variables
    private String bachelorCompletion;
    private String masterCompletion;

    //Default Constructor
    public PostGraduate() {
        this.bachelorCompletion = "";
        this.masterCompletion = "";
    }
    //Parameterised Constructor

    public PostGraduate(String bachelorCompletion, String masterCompletion) {
        this.bachelorCompletion = bachelorCompletion;
        this.masterCompletion = masterCompletion;
    }

    public PostGraduate(String stName, int stNum, String gender, String DOB, String bachelorCompletion, String masterCompletion) {
        super(stName, stNum, gender, DOB);
        this.bachelorCompletion = bachelorCompletion;
        this.masterCompletion = masterCompletion;
    }

    //Accessors and Mutators
    public String getBachelorCompletion() {
        return bachelorCompletion;
    }

    public void setBachelorCompletion(String bachelorCompletion) {
        this.bachelorCompletion = bachelorCompletion;
    }

    //toString
    @Override
    public String toString() {
        return "Student: " + super.getStudentName() + "(" + super.getStudentNumber() + ", " + super.getStudentSex() + ", " + super.getStudentDOB() + ")";
    }

    @Override
    public void setExpectedCompletion(String data) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.masterCompletion = data;
    }

    @Override
    public String getExpectedCompletion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.masterCompletion;
    }
    
     public String writePostGradFile(String fileName) {
        // return "Student: " + super.getStudentName() + "(" + super.getStudentNumber() + ", " + super.getStudentSex() + ", " + super.getStudentDOB() + ")";
        Formatter f1 = new Formatter();
        f1.format("%s (%d, %s, %s)%n", super.getStudentName(), super.getStudentNumber(), super.getStudentSex(), super.getStudentDOB());
        //System.out.println(f1);
        BufferedWriter out = null;//BufferedWriter
        PrintWriter out1 = null;//Use PrintWriter
        //Try and Catch method to create the txt file, flush and close
        try {

            out = new BufferedWriter(new FileWriter(fileName, true));
            out1 = new PrintWriter(out);
            out1.write(f1.toString());
            out1.flush();
        } catch (IOException e) {
            System.out.println("Exception ");
        } finally {
            try {
                out.close();
                out1.close();
            } catch (IOException ex) {
                Logger.getLogger(PostGraduate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return "";
    }
}
