package com.myait.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.myait.model.User;
import com.myait.repository.UserRepository;
import com.myait.view.UserView;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> showAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User saveEmployee(User employee) {
		// TODO Auto-generated method stub
		return userRepository.save(employee);
	}

	@Override
	public User updateEmployee(User employee) {
		// TODO Auto-generated method stub
		return userRepository.save(employee);
	}

	@Override
	public Optional<User> getEmployeeById(int user_id) {
		// TODO Auto-generated method stub
		return userRepository.findById(user_id);
	}

	@Override
	public User findByAit_id(String id) {
		// TODO Auto-generated method stub
		return userRepository.findByAit_id(id);
	}

	@Override
	public UserView findByAit_id11(String id) {
		
		User user = userRepository.findByAit_id11(id);
		
		UserView list =new UserView();
		
		list.setAit_email(user.getAit_email());
		list.setContact_number(user.getContact_number());
		list.setDesgination(user.getDesignation());
		list.setFirst_name(user.getFirst_name());
		list.setLast_name(user.getLast_name());
		
		return list;
	}



}