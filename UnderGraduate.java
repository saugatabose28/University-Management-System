
package assignment3guitest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

class UnderGraduate extends Student {

    private String bachelorCompletion;

    //Default Constructor
    public UnderGraduate() {
        super();
        this.bachelorCompletion = "";
    }

    public UnderGraduate(String stName, int stNum, String gender, String DOB, String bachelorCompletion) {
        super(stName, stNum, gender, DOB);
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
        this.bachelorCompletion = data;
    }

    @Override
    public String getExpectedCompletion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.bachelorCompletion;
    }
    
       public String writeFileUnderGrad(String fileName) {
        //return "Student: " + super.getStudentName() + "(" + super.getStudentNumber() + ", " + super.getStudentSex() + ", " + super.getStudentDOB() + ")";
        Formatter f = new Formatter();//Use Formatter
        f.format("%s (%d, %s, %s)%n", super.getStudentName(), super.getStudentNumber(), super.getStudentSex(), super.getStudentDOB());//Format Student Output
        //System.out.println(f);
        BufferedWriter out = null; //BufferedWriter
        PrintWriter out1 = null; //Use PrintWriter
        //Try and Catch method to create the txt file, flush and close
        try {

            out = new BufferedWriter(new FileWriter(fileName, true));
            out1 = new PrintWriter(out);
            out1.write(f.toString());
            out1.flush();//Flush text file
        } catch (IOException e) {
            System.out.println("Exception ");
        } finally {
            try {
                out.close();
                out1.close();
            } catch (IOException ex) {
                Logger.getLogger(UnderGraduate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "";

    }


}
