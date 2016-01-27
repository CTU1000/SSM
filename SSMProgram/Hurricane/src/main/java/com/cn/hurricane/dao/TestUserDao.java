package com.cn.hurricane.dao;

import com.cn.hurricane.pojo.TestUser;

public interface TestUserDao {
	
	int deleteByPrimaryKey(Integer id);

	int insert(TestUser record);

	int insertSelective(TestUser record);

	TestUser selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(TestUser record);

	int updateByPrimaryKey(TestUser record);
}
