package com.nhannt.service;

import com.nhannt.entity.StudentInfo;

import java.util.List;

public interface StudentService {
    public List<StudentInfo> getListStudent();

    public void saveStudent();

    public StudentInfo getStudentInfo( int theId);

    public void deleteStudent( int theId);
}
