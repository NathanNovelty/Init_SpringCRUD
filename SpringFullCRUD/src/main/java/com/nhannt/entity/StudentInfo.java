package com.nhannt.entity;


import javax.persistence.*;

@Entity
@Table(name = "StudentInfo")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_Id")
    private int student_id;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Full_Name")
    private String fullName;

    @Column(name = "Student_Email")
    private String student_email;

    public StudentInfo() {
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }
}
