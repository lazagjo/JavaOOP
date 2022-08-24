package com.example;


public class JavaOOP {
    public static void main(String[] args) {
        Student attr = new Student();

        attr.setName("Joseph");
        attr.setAge(26);
        attr.setId_No(2103);

        System.out.println("Student Name: " + attr.getName() );
        System.out.println("Student Age: " + attr.getAge() );
        System.out.println("Student ID NO.: " + attr.getId_No() );
    }
}
