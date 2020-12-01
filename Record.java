package assignment3guitest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

class Record implements Cloneable {

    private String CNAME;
    private ArrayList<Subject> eCores;
    private Major eMajor;
    private ArrayList<Subject> eElectives;
    private int totalCredit;
    private Status status;
    private ArrayList<Student> students;

    enum Status {
        ACTIVE, COMPLETE, NA
    };

    //Default Constructor
    public Record() {
        this.CNAME = "";
        this.eCores = new ArrayList<>();
        this.eMajor = new Major();
        this.eElectives = new ArrayList<>();
        this.totalCredit = 0;
        this.status = Status.NA;
    }
    //Parameterised Constructor

    public Record(String CNAME) {
        this.CNAME = CNAME;
        this.eCores = new ArrayList<>();
        this.eMajor = new Major();
        this.eElectives = new ArrayList<>();
        this.totalCredit = 0;
        this.status = Status.NA;
    }

    //Getters and Setters
    public String getCNAME() {
        return CNAME;
    }

    public void setCNAME(String CNAME) {
        this.CNAME = CNAME;
    }

    public ArrayList<Subject> geteCores() {
        return eCores;
    }

    public void seteCores(ArrayList<Subject> eCores) {
        this.eCores = eCores;
    }

    public Major geteMajor() {
        return eMajor;
    }

    public void seteMajor(Major eMajor) {
        this.eMajor = eMajor;
    }

    public ArrayList<Subject> geteElectives() {
        return eElectives;
    }

    public void seteElectives(ArrayList<Subject> eElectives) {
        this.eElectives = eElectives;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void enrolCores(ArrayList<Subject> cores) {
        for (Subject s : cores) {
            eCores.add(s);
        }
    }

    public void enrolMajor(Major major) {
        eMajor = major;
    }

    public void enrolElective(Subject electives) {
        eElectives.add(electives);

    }

    public boolean isEnrolled(Subject s) {
        if (eElectives.isEmpty()) {
            System.out.println("eElectives is Empty");
            return false;
        }
        for (Subject sub : eElectives) {
            if (sub.getSubjectName().equals(s)) {
                System.out.println("Found subject" + s.getSubjectName());
                return true;
            }
        }
        if (eCores.isEmpty()) {
            System.out.println("eCores is Empty");
            return false;
        }
        for (Subject sub : eCores) {
            if (sub.getSubjectName().equals(s)) {
                System.out.println("Found subject" + s.getSubjectName());
                return true;
            }
        }
        //for(Major m : eMajor)
        return false;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\nCourse Name: " + this.CNAME + "\t(" + this.status + ")" + "\nCores:\n" + this.geteCores() + "\n" + this.geteMajor() + "\n" + this.geteElectives();
    }

    public String getCourseName() {
        return "Course Name: " + this.CNAME;
    }

    @Override
    protected Record clone() throws CloneNotSupportedException {
        Record record = (Record) super.clone();
        record.eMajor = (Major) eMajor.clone();
        for (Subject s : eCores) {
            Subject s1 = (Subject) s.clone();
            record.eCores.add(s1);
        }
        for (Subject ss : eElectives) {
            Subject ss1 = (Subject) ss.clone();
            record.eElectives.add(ss1);
        }
        return record;
    }

    public String writeRecordFileUnderGrad(String fileName) {
        Formatter f = new Formatter(); //Create formatter method
        String cNameandStatus = this.CNAME + "\t(" + this.status + ")\n";
        String s = "";
        s += "\nCores:\n";
        for (Subject subj : eCores) {
            s += subj;
            s += "\n";
        }
        s += "\nMajor: " + this.geteMajor().getmName() + "\n";
        s += this.eMajor;
        s += "\nElectives:\n";
        for (Subject subj : eElectives) {
            s += subj;
            s += "\n";
        }
        s += "Total enrolled credit: " + this.getTotalCredit() + "pt";
        f.format("%s %s", cNameandStatus, s); //Format the Strings
        //System.out.print(f);
        BufferedWriter out = null;
        PrintWriter out1 = null;
        try {
            out = new BufferedWriter(new FileWriter(fileName, true));//create student.txt and make it true to write to the end of the file
            out1 = new PrintWriter(out);
            out1.write(f.toString());//Write the toString of formatter class, to convert to string
            out1.flush(); //Flush file
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

    public String writeRecordFilePostGrad(String fileName) {
        Formatter f = new Formatter(); //Create formatter method
        String cNameandStatus = this.CNAME + "\t(" + this.status + ")\n";
        String s = "";
        s += "\nCores:\n";
        for (Subject subj : eCores) {
            s += subj;
            s += "\n";
        }
        s += "\nMajor: " + this.geteMajor().getmName() + "\n";
        s += this.eMajor;
        s += "\nElectives:\n";
        for (Subject subj : eElectives) {
            s += subj;
            s += "\n";
        }
        s += "Total enrolled credit: " + this.getTotalCredit() + "pt";
        s += "\n";
        s += "Expected Master Graduation: Spring/2022";
        f.format("%s %s", cNameandStatus, s); //Format the Strings
        //System.out.print(f);
        BufferedWriter out = null;
        PrintWriter out1 = null;
        try {
            out = new BufferedWriter(new FileWriter(fileName, true));//create student.txt and make it true to write to the end of the file
            out1 = new PrintWriter(out);
            out1.write(f.toString());//Write the toString of formatter class, to convert to string
            out1.flush(); //Flush file
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
