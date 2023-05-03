package com.nhannt.dao;

import com.nhannt.entity.StudentInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentInfoDAOImp implements StudentInfoDAO{
    @Override
    public List<StudentInfo> getListStudentInfo() {
        return null;
    }

    @Override
    public void saveStudentInfo(StudentInfo studentInfo) {

    }

    @Override
    public StudentInfo getStudentInfo(int theId) {
        return null;
    }

    @Override
    public void deleteStudentInfo(int theId) {

    }
}
