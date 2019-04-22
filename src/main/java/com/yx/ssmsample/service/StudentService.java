package com.yx.ssmsample.service;

import com.yx.ssmsample.entity.StudentEntity;

public interface StudentService {

    public StudentEntity queryObject(String sno);

    public void delete (String sname);

    void save (StudentEntity studentEntity);
}
