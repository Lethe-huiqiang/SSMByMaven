package com.maventossm.vip.service.impl;

import java.util.List;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.maventossm.vip.Dao.UserMapper;
import com.maventossm.vip.model.User;
import com.maventossm.vip.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	//DbUtil dbUtil=new DbUtil();
	//UserDaoImpl userDao=new UserDaoImpl();
	
	@Resource
	 private UserMapper userMapper;

	/**
	 * @return list
	 * @Override
	 */	

	public List<User> getUsers() {
		return userMapper.getUserList();
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
