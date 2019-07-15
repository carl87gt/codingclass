package com.example.codingclass.week2.access.two;

import com.example.codingclass.week2.access.one.Alpha;

public class Gamma {
    Alpha alpha = new Alpha();

    void foo(){
        alpha.publicMethod();
        //alpha.protectedMethod();
        //alpha.noModifierMethod();
        //alpha.privateMethod();
    }

}
