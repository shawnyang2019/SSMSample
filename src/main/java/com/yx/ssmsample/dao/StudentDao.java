package com.yx.ssmsample.dao;


import com.yx.ssmsample.entity.StudentEntity;

public interface StudentDao {

    StudentEntity queryObject(String sno);

    void delete (String sname);

    void save (StudentEntity studentEntity);
}
