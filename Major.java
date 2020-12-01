package assignment3guitest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

class Major implements Cloneable, Serializable {

    private String mName;
    private ArrayList<Subject> mCores;

    public Major() {
        this.mCores = new ArrayList<>();
        this.mName = "";
    }

    public Major(String mName) {
        this.mName = mName;
        this.mCores = new ArrayList<>();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public ArrayList<Subject> getmCores() {
        return mCores;
    }

    public void setmCores(ArrayList<Subject> mCores) {
        this.mCores = mCores;
    }

    public void addMCores(Subject[] mCore) {
        for (Subject s : mCore) {
            mCores.add(s);
        }
    }

    public boolean isIncluded(Subject subj) {
        if (mCores.contains(subj)) {
            return true;
        }
        return false;
    }

    @Override
    protected Major clone() throws CloneNotSupportedException {
        Major major1 = (Major) super.clone();
        /*Iterator<Subject> s = mCores.iterator();
        while(s.hasNext()) {
            Subject s1 = s.next();
            Subject s2=(Subject) s1.clone();
            major1.mCores.add(s2);
    // your code
        }*/
        Subject s1 = null;
        Iterator<Subject> iterator = mCores.iterator();
        while (iterator.hasNext()) {
            Subject s = iterator.next();
            s1 = (Subject) s.clone();
            major1.mCores.add(s1);
        }
        return major1;

    }

    public String toString() {
        /*for (Subject s : mCores) {
            System.out.println(s);
        }
        return ("\n");*/
        String s1 = "";
        for (Subject s : mCores) {
            s1 += s;
            s1 += "\n";
        }
        return s1;

    }

    String displaySubjects(Subject s) {
        String s1 = "";
        s1 += s;
        return s1;
    }

}
