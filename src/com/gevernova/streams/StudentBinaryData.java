package com.gevernova.streams;

import java.io.*;

public class StudentBinaryData {
    public static void main(String[] args) {
        String filename = "student_data.bin";

        // Writing student data
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(1);
            dos.writeUTF("Ravi");
            dos.writeDouble(8.4);

            dos.writeInt(2);
            dos.writeUTF("Sneha");
            dos.writeDouble(9.1);

            dos.close();
            fos.close();

            System.out.println("Data written successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Reading student data
        try {
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("\n--- Student Records ---");
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll No: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }

            dis.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
