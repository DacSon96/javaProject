package com.company.controller;

import com.company.model.Staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaffManager implements IGeneralManagement<Staff>{
    protected List<Staff> stafflist = new ArrayList<>();

    public StaffManager() {
        stafflist.add(new Staff("1", "Hung", 22, "HaNoi", "FullTime"));
        stafflist.add(new Staff("2", "Quang", 23, "HaNam", "PartTime"));
        stafflist.add(new Staff("3", "Nhung", 21, "HaiPhong", "FullTime"));
        stafflist.add(new Staff("4", "Quan", 30, "DaNang", "FullTime"));
    }

    @Override
    public void showAll() {
        for (Staff staff : stafflist) {
            System.out.println(staff);
        }
    }

    @Override
    public void addNew(Staff staff) {
        stafflist.add(staff);
    }
    @Override
    public void updateById(String id, Staff staff) {
        int index = findById(id);
        if (index != -1) {
            stafflist.set(index, staff);
        } else {
            System.err.println("Wrong id");
        }
    }
    @Override
    public void removeById(String id) {
        int index = findById(id);
        if (index != -1) {
            stafflist.remove(index);
        } else {
            System.err.println("Wrong id");
        }
    }

    @Override
    public int findById(String id) {
        int index = -1;
        for (int i = 0; i < stafflist.size(); i++) {
            if (stafflist.get(i).equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }


}

