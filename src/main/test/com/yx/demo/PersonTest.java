package com.yx.demo;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class PersonTest {

	@Test
	public void test1() {
        Person p = new Person();
        p.setName("yx");
        p.setAge(10);
//        toString 方法的运用，通常是用在需要输出的情况下
//
        System.out.println(p);

        String jsonStr = JSON.toJSONString(p);
        Person per = JSON.parseObject(jsonStr, Person.class);
        System.out.println(per);
	}
}
