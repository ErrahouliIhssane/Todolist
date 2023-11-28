package com.example.mylist;

import java.sql.Date;
import java.util.ArrayList;

public class Inscription {
    public String name;
    public Date Datte;
    public int number;
    public String Email;
    public String password;
    public String cofirm_passw;
    public ArrayList<Task> listTasq = new ArrayList();

    public Inscription(String name, Date Datte, int number, String Email, String password, String cofirm_passw) {
        this.name = name;
        this.Datte = Datte;
        this.number = number;
        this.Email = Email;
        this.password = password;
        this.cofirm_passw = cofirm_passw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDatte() {
        return Datte;
    }

    public void setDatte(Date datte) {
        Datte = datte;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCofirm_passw() {
        return cofirm_passw;
    }

    public void setCofirm_passw(String cofirm_passw) {
        this.cofirm_passw = cofirm_passw;
    }

    public ArrayList<Task> getListTasq() {
        return listTasq;
    }

    public void setListTasq(ArrayList<Task> listTasq) {
        this.listTasq = listTasq;
    }
}
