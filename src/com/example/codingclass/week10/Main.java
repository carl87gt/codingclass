package com.example.codingclass.week10;

public class Main {

    public static void main(String[] args){

        Person person1 = new Person();
        person1.setName("Kevin");
        person1.setAge(58);
        System.out.println(person1.calculateAgeInDogYears());
        System.out.println(Person.convertStringToUppercase("hello"));

    }


}
