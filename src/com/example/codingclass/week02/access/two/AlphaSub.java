package com.example.codingclass.week02.access.two;

import com.example.codingclass.week02.access.one.Alpha;

public class AlphaSub extends Alpha {

    void foo(){
        this.publicMethod();
        this.protectedMethod();
        //this.noModifierMethod();
        //this.privateMethod();
    }

}
