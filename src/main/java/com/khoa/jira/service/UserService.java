package com.khoa.jira.service;

import com.khoa.jira.modal.User;

import java.util.List;

public interface UserService {

    User getUserProfile(String jwt);

    List<User> getAllUsers();
}
