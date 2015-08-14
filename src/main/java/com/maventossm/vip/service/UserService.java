package com.maventossm.vip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maventossm.vip.model.User;

import net.sf.json.JSONArray;

public interface UserService {
	 List<User> getUsers();
	 User getUserById(int id);
}
