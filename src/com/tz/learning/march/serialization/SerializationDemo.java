package com.tz.learning.march.serialization;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Student student = new Student();
        student.SetName("LiXiaoLong");
        student.SetAge(20);
        student.SetScore(100);
        student.SetDescription("Perfect!");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();

        //File file = new File("student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream (new FileInputStream("student.txt"));
        Student currentStudent = (Student)objectInputStream.readObject();
        System.out.println(currentStudent);
        objectInputStream.close();
    }
}
