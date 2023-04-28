package com.zkrallah.adapterdemo;

public class Employee {
    String name;
    String jobTitle;
    Double salary;
    int img;

    public Employee(String name, String jobTitle, Double salary, int img) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
