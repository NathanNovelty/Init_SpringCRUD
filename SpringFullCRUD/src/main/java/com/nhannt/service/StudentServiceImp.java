package com.nhannt.service;

import com.nhannt.entity.StudentInfo;

import javax.transaction.Transactional;
import java.util.List;

public class StudentServiceImp implements StudentService{
    @Override
    @Transactional
    public List<StudentInfo> getListStudent() {
        return null;
    }

    @Override
    @Transactional
    public void saveStudent() {

    }

    @Override
    @Transactional
    public StudentInfo getStudentInfo(int theId) {
        return null;
    }

    @Override
    @Transactional
    public void deleteStudent(int theId) {

    }
}
