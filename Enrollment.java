/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3guitest;

import java.util.ArrayList;

interface Enrollment {

    public void addRecord(Record record);

    public void deletedRecord(int r);

    public Record getRecord(int r);

    public ArrayList<Record> getRecords();
}
