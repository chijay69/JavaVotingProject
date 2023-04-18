package org.example.tutorials;

public class Student {
    private String firstname;
    private String lastname;
    private Integer age;
    private Integer grade;
    private String address;

    public Student(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGrade() {
        return grade;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return (this.getFirstname() + " "+ this.getLastname() + " is a student with grade "+this.getGrade()+ " aged "+
                this.getAge()+ " living at " + this.getAddress());
    }
}
