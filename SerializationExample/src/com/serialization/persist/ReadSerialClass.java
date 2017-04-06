package com.serialization.persist;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;

import com.serialization.entity.SerialClass;

//Class to read the time from a flat file time.ser
public class ReadSerialClass {

    public static void main(String [] args) {
        String filename = "time.ser";

        if(args.length > 0){
            filename = args[0];
        }
		
        SerialClass serialClass = null;

        try (FileInputStream fis = new FileInputStream(filename);
        		ObjectInputStream in = new ObjectInputStream(fis)) {
            serialClass = (SerialClass)in.readObject();
        }
        catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }

        // print out restored time
        System.out.println("Restored time: " + serialClass.getTime());

        // print out the current time
        System.out.println("Current time: " + Calendar.getInstance().getTime());

        System.out.println("syso - person name: " + serialClass.getPersonList().get(0).getName());
        System.out.println("syso - person surname: " + serialClass.getPersonList().get(0).getSurname());
        System.out.println("syso - person school number: " + serialClass.getStudent().getSchoolNumber());
        
        System.out.println("syso - book title: " + serialClass.getBook().getTitle());
        
        System.out.println("syso - list-size(): " + serialClass.getTestList().size());
        System.out.println("syso - treeNode Data: " + serialClass.getTreeNode().getData().toString());
        
     }
}
