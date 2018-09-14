package com.examples.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileWithByteStreamEx {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("D:\\Temp\\input.txt");
         out = new FileOutputStream("D:\\Temp\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
        	 System.out.println(c);
            out.write(c);
         }
         
         System.out.println("File copied successfully.");         
         
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}