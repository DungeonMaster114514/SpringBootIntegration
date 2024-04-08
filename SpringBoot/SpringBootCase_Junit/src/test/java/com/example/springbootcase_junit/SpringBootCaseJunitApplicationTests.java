package com.example.springbootcase_junit;

import com.example.springbootcase_junit.mapper.BookMapperImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootCaseJunitApplicationTests {

    //1，自动注入要测试的对象
    @Autowired
    private BookMapperImpl bookMapper;

    @Test
    void contextLoads() {
        //2. 执行测试对象中的方法
        bookMapper.Msg();
    }

}
