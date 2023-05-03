package com.nhannt.dao;

import com.nhannt.entity.StudentInfo;

import java.util.List;

interface StudentInfoDAO {
    public List<StudentInfo> getListStudentInfo();

    public  void saveStudentInfo( StudentInfo studentInfo);

    public StudentInfo getStudentInfo(int theId);

    public void deleteStudentInfo(int theId);
}
