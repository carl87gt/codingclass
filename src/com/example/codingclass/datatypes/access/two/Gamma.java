package com.example.codingclass.datatypes.access.two;

import com.example.codingclass.datatypes.access.one.Alpha;

public class Gamma {
    Alpha alpha = new Alpha();

    void foo(){
        alpha.publicMethod();
        //alpha.protectedMethod();
        //alpha.noModifierMethod();
        //alpha.privateMethod();
    }

}
