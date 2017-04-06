package com.serialization.persist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.serialization.entity.SerialClass;

//Class to persist the time in a flat file time.ser
public class PersistSerialClass {

  public static void main(String [] args) {
      String filename = "time.ser";

      if(args.length > 0){
          filename = args[0];
      }
		
      SerialClass time = new SerialClass();

      try (FileOutputStream fos = new FileOutputStream(filename);
    		  ObjectOutputStream out = new ObjectOutputStream(fos)){
          
          out.writeObject(time);
      } catch(IOException ex){
          ex.printStackTrace();
      }
   }
}
