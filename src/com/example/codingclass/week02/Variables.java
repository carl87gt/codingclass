package com.example.codingclass.week02;

public class Variables {

    Dog dog1 = new Dog();     // good!

    Cat dog2 = new Cat();        // bad!

    Pet myPet = new Pet();      // good!

    class Pet {

    }

    class Dog extends Pet {

    }

    class Cat extends Pet {

    }



}
