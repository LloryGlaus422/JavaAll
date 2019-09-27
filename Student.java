/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3;

/**
 *
 * @author sugallo_sd2023
 */
public class Student {
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

    public Student(String password, String confirm, String username, String fname, String lname, String age, String course, String units, String sched) {
        this.password = password;
        this.confirm = confirm;
        this.username = username;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.course = course;
        this.units = units;
        this.sched = sched;
    }

    public Student() {
    }

    public Student(String password, String confirm, String username) {
        this.password = password;
        this.confirm = confirm;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public int getId3() {
        return id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getSched() {
        return sched;
    }

    public void setSched(String sched) {
        this.sched = sched;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", password=" + password + ", confirm=" + confirm + ", username=" + username + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", course=" + course + ", units=" + units + ", sched=" + sched + '}';
    }
    
    
    
    
}
