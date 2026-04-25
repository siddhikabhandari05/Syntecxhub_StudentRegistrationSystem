package com.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n--- Student Registration System---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Update Student Email");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.println("Choose: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("Name: ");
                    String name = sc.nextLine();
                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    System.out.println("Phone: ");
                    String phone = sc.nextLine();
                    System.out.println("Course: ");
                    String course = sc.nextLine();
                    dao.addStudent(new Student(name, email, phone, course));
                    break;
                case 2:
                    dao.getAllStudents();
                    break;
                case 3:
                    System.out.println("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("New Email: ");
                    String newEmail = sc.nextLine();
                    dao.updateStudent(id, newEmail);
                    break;
                case 4:
                    System.out.println("Enter Student ID to Delete: ");
                    dao.deleteStudent(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Thanks!!!");
                    return;
            }
        }
    }
}
