package com.yx.ssmsample.service;

import com.yx.ssmsample.dao.StudentDao;
import com.yx.ssmsample.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;
    @Override
    public StudentEntity queryObject(String sno) {
        return  studentDao.queryObject(sno);
    }

    @Override
    public void delete(String sname) {
          studentDao.delete(sname);
    }

    @Override
    public void save(StudentEntity studentEntity) {
         studentDao.save(studentEntity);
    }
}
