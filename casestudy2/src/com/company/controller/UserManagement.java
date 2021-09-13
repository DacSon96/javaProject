package com.company.controller;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements IGeneralManagement<User> {
    private List<User> users = new ArrayList<>();

    public UserManager() {
        users.add(new User("admin","1","admin","admin"));
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public void showAll() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public void addNew(User user) {
        users.add(user);
    }

    @Override
    public void updateById(String id, User user) {
        int index = findById(id);
        if (index != -1) {
            users.set(index, user);
            System.out.println("Update successfull");
        } else {
            System.err.println("User is not exist");
        }
    }

    @Override
    public void removeById(String id) {
        int index = findById(id);
        if (index != -1) {
            users.remove(index);
            System.out.println("Remove successfull");
        } else {
            System.err.println("User is not exist");
        }
    }

    @Override
    public int findById(String id) {
        int index = -1;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public User isLogin(User loginUser) {
        for (User user : users) {
            if ((user.getName().equals(loginUser.getName()))
                    && (user.getPassword().equals(loginUser.getPassword()))) {
                return user;
            }
        }
        return null;
    }

    public boolean isUserNameExist(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)){
                return true;
            }
        }
        return false;
    }
}
