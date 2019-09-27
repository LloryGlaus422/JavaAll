/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sugallo_sd2023
 */
public class Main{

    Scanner input = new Scanner(System.in);
    Student s = new Student();
    private int id = 1880;
    private int id2 = 0;
    private int id3 = 0;
    private String password;
    private String confirm;
    private String username;
    private String fname;
    private String lname;
    private String age;
    private String course;
    private String units;
    private String sched;

    void course() throws IOException {
        while (true) {

            try {
                System.out.print("Enter Course : ");
                course = s.getCourse();
                course = input.next();
                int a = parseInt(s.getCourse());
                System.out.println("Please Try Again!");
            } catch (Exception e) {
                break;
            }
        }
    }

    void units() throws IOException {
        while (true) {
            try {
                System.out.print("Enter Units: ");
                units = s.getUnits();
                units = input.next();
                int a = parseInt(units);
                break;
            } catch (Exception e) {
                System.out.println("Please Input a Number For Units!");

            }
        }
    }

    void sched() throws IOException {
        while (true) {
            try {
                System.out.print("Enter Schedule : ");
                sched = s.getSched();
                sched = input.next();
                int a = parseInt(s.getSched());
                System.out.println("Please Try Again!");
            } catch (Exception e) {
                break;
            }
        }
    }

    public void save3() throws IOException {
        BufferedReader reader;
        id2 = 1;
        reader = new BufferedReader(new FileReader("C:\\Users\\2ndyrGroupC\\Desktop\\course.txt"));
        String line = reader.readLine();
        while (line != null) {
            if (line.length() != 0) {
                ++id2;
            }
            line = reader.readLine();
        }

        try {
            FileWriter fWriter = new FileWriter("course.txt", true);
            try (PrintWriter writer = new PrintWriter(fWriter)) {
                writer.println(id2 + "\t" + id + "\t" + course + "\t" + units + "\t" + sched + "\n");
            }
            System.out.println("Your account  was been saved.");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        reader.close();

    }

    void name() throws IOException {
        while (true) {
            try {
                System.out.print("Enter First Name : ");
                fname = s.getFname();
                fname = input.next();
                int a = parseInt(s.getFname());
                System.out.println("Please Try Again!");
            } catch (Exception e) {
                break;
            }
        }
    }

    void last() throws IOException {
        while (true) {
            try {
                System.out.print("Enter Last name : ");
                lname = s.getLname();
                lname = input.next();
                int a = parseInt(s.getLname());
                System.out.println("Please Try Again!");
            } catch (Exception e) {
                break;
            }
        }
    }

    void age() {
        while (true) {
            try {
                System.out.print("Input your Age: ");
                age = s.getAge();
                age = input.nextLine();
                int i = Integer.parseInt(age);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Must Be a Number");

            }
        }
    }

    public void save2() throws IOException {
        BufferedReader reader;
        id3 = 1;
        reader = new BufferedReader(new FileReader("C:\\Users\\2ndyrGroupC\\Desktop\\info.txt"));
        String line = reader.readLine();
        while (line != null) {
            if (line.length() != 0) {
                ++id3;
            }
            line = reader.readLine();
        }

        try {
            FileWriter fWriter = new FileWriter("info.txt", true);
            try (PrintWriter writer = new PrintWriter(fWriter)) {
                writer.println(id3 + "\t" + id + "\t" + fname + "\t" + lname + "\t" + age + "\n");
            }
            System.out.println("Your account  was been saved.");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        reader.close();
    }

    void addUsername() throws IOException {

        while (true) {
            try {
                System.out.print("Enter username : ");
                username = s.getUsername();
                username = input.next();
                int a = parseInt(username);
                System.out.println("Please Try Again!");
            } catch (Exception e) {
                break;
            }
        }

    }

    void addPassword() throws IOException, Exception {
        while (true) {
            try {
                System.out.print("Enter password : ");
                password = s.getPassword();
                password = input.next();
                if (password.length() >= 8) {
                    break;
                } else {
                    throw new Exception("Password too short.");
                }
            } catch (Exception ex) {
                System.out.println("Password too short.");
            }
        }
        while (true) {
            try {
                System.out.print("Re-enter password : ");
                confirm = s.getConfirm();
                confirm = input.next();
                if (confirm == null ? password == null : confirm.equals(password)) {
                    break;
                } else {
                    throw new Exception("Password mismatch.");
                }
            } catch (Exception ex) {
                System.out.println("Password mismatch.");
            }
        }
    }

    public void save() throws IOException {
        BufferedReader reader;
        id = 1880;
        reader = new BufferedReader(new FileReader("C:\\Users\\2ndyrGroupC\\Desktop\\Accounts.txt"));
        String line = reader.readLine();
        while (line != null) {
            if (line.length() != 0) {
                ++id;
            }
            line = reader.readLine();
        }

        try {
            FileWriter fWriter = new FileWriter("Accounts.txt", true);
            try (PrintWriter writer = new PrintWriter(fWriter)) {
                writer.println(id + "\t" + username + "\t" + password + "\n");
            }
            System.out.println("Your account  was been saved.");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        reader.close();
    }

  
}
