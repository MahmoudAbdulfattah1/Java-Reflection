package com.company;

import java.lang.reflect.*;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)  {
        Student student = new Student();
        Class studentClass = student.getClass();
        Field[] classField = studentClass.getDeclaredFields();
        for (Field field:classField) {
            System.out.println(Modifier.toString(field.getModifiers())+" " +field.getType()+" "+field.getName() );

        }
    }
}
