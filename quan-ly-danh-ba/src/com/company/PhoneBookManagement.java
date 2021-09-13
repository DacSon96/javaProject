package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static com.company.Main.scanner;

public class PhoneBookManagement implements Serializable {
    List<Contract> phoneBook = new ArrayList<>();

    public PhoneBookManagement() {
        phoneBook.add(new Contract("0987655678","Gia dinh","Tuan","Male","Hanoi","abdc@gmail.com"));
        phoneBook.add(new Contract("0987632322","Ban be","Nhung","Female","Hanoi","abssc@gmail.com"));
    }

    public void addNewContract(Contract contract) {
        phoneBook.add(contract);
    }
    public int findByPhonenumber(String phoneNumber) {
        int index = -1;
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getPhoneNumber().equals(phoneNumber)) {
                index = i;
                break;
            }
        }
        return index;
    }
    public void removeContract(String phoneNumber){
        int index = findByPhonenumber(phoneNumber);
        if (index!= -1) {
            phoneBook.remove(index);
            System.out.println("Xóa thành công");
        }
        else {
            System.err.println("Không tồn tại số này");
        }
    }
    public void updateContract(Contract contract,int index) {
            phoneBook.set(index,contract);
            System.out.println("Sửa thành công");

    }
    public void showAll(){
        System.out.println("Tất cả danh bạ: ");
        int count = 0;
        for (Contract contract : phoneBook) {
            System.out.println(contract);
            count++;
            if (count == 5) {
                count=0;
                scanner.nextLine();
            }
        }
    }
    public void findContractByPhoneNumber(String phoneNumber){
        int index =findByPhonenumber(phoneNumber);
        if (index!=-1) {
            System.out.println(phoneBook.get(index));;
        } else {
            System.err.println("Không tồn tại số điện thaoij này trong danh bạ");
        }
    }
    public void findByName(String name) {
        for (Contract contract : phoneBook) {
            if(contract.getName().equals(name)) {
                System.out.println(contract);
            }
        }
    }
}
