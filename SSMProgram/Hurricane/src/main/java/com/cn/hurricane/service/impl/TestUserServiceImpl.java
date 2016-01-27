package com.cn.hurricane.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cn.hurricane.dao.TestUserDao;
import com.cn.hurricane.pojo.TestUser;
import com.cn.hurricane.service.TestUserService;

@Service("testUserService")
public class TestUserServiceImpl implements TestUserService {

	@Resource
	private TestUserDao testUserDao;
	
	public TestUser getUserById(int userId) {
		return this.testUserDao.selectByPrimaryKey(userId);
	}

}
