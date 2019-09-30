package com.example.codingclass.datatypes.access.two;

import com.example.codingclass.datatypes.access.one.Alpha;

public class AlphaSub extends Alpha {

    void foo(){
        this.publicMethod();
        this.protectedMethod();
        //this.noModifierMethod();
        //this.privateMethod();
    }

}
