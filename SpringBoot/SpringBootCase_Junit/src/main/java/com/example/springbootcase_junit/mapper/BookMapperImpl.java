package com.example.springbootcase_junit.mapper;

import org.springframework.stereotype.Repository;

@Repository
public class BookMapperImpl implements BookMapper{
    @Override
    public void Msg() {
        System.out.println("书名: Smolder With Me 的日记");
    }
}
