package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        if((firstName == null && lastName == null) || (firstName.isEmpty() && lastName.isEmpty())){
            return "";
        } else if((firstName == null) || (firstName.isEmpty())){
            return lastName;
        } else if((lastName == null) || (lastName.isEmpty())){
            return firstName;
        } else {
            return String.format("%1$s %2$s", this.firstName, this.lastName);
        }
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setAge(int age){
        if(age < 0 || age > 100){this.age = 0;} else {this.age = age;}
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }
}
