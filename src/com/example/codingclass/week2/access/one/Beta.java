package com.example.codingclass.week2.access.one;

public class Beta {

    Alpha alpha = new Alpha();



    void foo(){
        String alphaColor = alpha.getColor();
        alpha.setColor("orange");
        alpha.setColor(null);


        alpha.publicMethod();
        alpha.protectedMethod();
        alpha.noModifierMethod();
        //alpha.privateMethod();
    }

}
