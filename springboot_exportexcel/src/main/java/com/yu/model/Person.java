package com.yu.model;

/**
 * Created by Administrator on 2019/8/3.
 */
public class Person {


    private Integer id;
    private String name;
    private String phoneNum;
    private String address;
    private String outcome;

    public Person(Integer id, String name, String phoneNum, String address, String outcome) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.outcome = outcome;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address='" + address + '\'' +
                ", outcome='" + outcome + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }
}
