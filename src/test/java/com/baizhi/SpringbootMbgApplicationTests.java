package com.baizhi;

import com.baizhi.entity.Emp;
import com.baizhi.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMbgApplicationTests {
    @Autowired
    EmpMapper mapper;
    @Test
    public void contextLoads() {
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);
        System.out.println("11");

    }

}
