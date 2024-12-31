package org.example;

import org.example.pryklady.Avtomobil;
import org.example.pryklady.Povidomlennya;
import org.example.pryklady.Student;
import org.example.pryklady.AvtomobilSQLGenerator;
import org.example.pryklady.PovidomlennyaSQLGenerator;
import org.example.pryklady.StudentSQLGenerator;

public class Main {
    public static void main(String[] args) {
        Avtomobil avto = new Avtomobil(1, "Toyota", 2020);

        String avtoCreateQuery = AvtomobilSQLGenerator.CREATE_QUERY;
        String avtoInsertQuery = AvtomobilSQLGenerator.generateInsertQuery(avto);
        String avtoUpdateQuery = AvtomobilSQLGenerator.generateUpdateQuery(avto);
        String avtoDeleteQuery = AvtomobilSQLGenerator.generateDeleteQuery(avto.getId());
        String avtoSelectQuery = AvtomobilSQLGenerator.SELECT_QUERY;

        System.out.println("Avtomobil:");
        System.out.println("CREATE: " + avtoCreateQuery);
        System.out.println("INSERT: " + avtoInsertQuery);
        System.out.println("UPDATE: " + avtoUpdateQuery);
        System.out.println("DELETE: " + avtoDeleteQuery);
        System.out.println("SELECT: " + avtoSelectQuery);
        System.out.println();


        Povidomlennya povidomlennya = new Povidomlennya();
        povidomlennya.setId(1);
        povidomlennya.setText("Happy New Year");
        povidomlennya.setDate("2024-12-31");

        String msgCreateQuery = PovidomlennyaSQLGenerator.CREATE_QUERY;
        String msgInsertQuery = PovidomlennyaSQLGenerator.generateInsertQuery(povidomlennya);
        String msgUpdateQuery = PovidomlennyaSQLGenerator.generateUpdateQuery(povidomlennya);
        String msgDeleteQuery = PovidomlennyaSQLGenerator.generateDeleteQuery(povidomlennya.getId());
        String msgSelectQuery = PovidomlennyaSQLGenerator.SELECT_QUERY;

        System.out.println("Запити для Povidomlennya:");
        System.out.println("CREATE: " + msgCreateQuery);
        System.out.println("INSERT: " + msgInsertQuery);
        System.out.println("UPDATE: " + msgUpdateQuery);
        System.out.println("DELETE: " + msgDeleteQuery);
        System.out.println("SELECT: " + msgSelectQuery);
        System.out.println();


        Student student = new Student();
        student.setId(1);
        student.setName("Koval Kostiantyn");
        student.setCourse(3);

        String studentCreateQuery = StudentSQLGenerator.CREATE_QUERY;
        String studentInsertQuery = StudentSQLGenerator.generateInsertQuery(student);
        String studentUpdateQuery = StudentSQLGenerator.generateUpdateQuery(student);
        String studentDeleteQuery = StudentSQLGenerator.generateDeleteQuery(student.getId());
        String studentSelectQuery = StudentSQLGenerator.SELECT_QUERY;

        System.out.println("Student:");
        System.out.println("CREATE: " + studentCreateQuery);
        System.out.println("INSERT: " + studentInsertQuery);
        System.out.println("UPDATE: " + studentUpdateQuery);
        System.out.println("DELETE: " + studentDeleteQuery);
        System.out.println("SELECT: " + studentSelectQuery);
    }
}