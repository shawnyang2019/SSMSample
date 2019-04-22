package com.yx.demo;

import com.yx.ssmsample.dao.StudentDao;
import com.yx.ssmsample.entity.StudentEntity;
import com.yx.ssmsample.service.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


public class StudentServiceTest {


    @Test
    public void queryObject(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl ssi=applicationContext.getBean(StudentServiceImpl.class);
        StudentEntity studentEntity=ssi.queryObject("11");
        System.out.println(studentEntity);

    }
    @Test
    public  void studentDaoTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao sd=applicationContext.getBean(StudentDao.class);
        StudentEntity entity = new StudentEntity();
        entity.setSno("111");
        entity.setSage("222");
        entity.setSdept("dept");
        sd.save(entity);
    }
}
