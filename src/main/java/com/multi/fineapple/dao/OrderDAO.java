package com.multi.fineapple.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDAO {

	@Autowired
	SqlSessionTemplate my;
}
