package com.example.codingclass.week02;

public class ObjectDatatypes {

    Byte myByte = 1;

    Short myShort = 2;

    Integer myInt = 3;

    float card = 4111111111111111f;

    Long myLong = 4L;          // notice the L (could be l but don't) - sometimes optional (this is a long, not integer!)

    Double myDouble = 6d;      // notice the d - optional (this is a double, not

    Boolean myBoolean;

    boolean myBoolean2;

    String myString = "a" + "lpha";         // notice the double

    // you can express floats/doubles in scientific notation
    Float myFloat = 123.4e3f;
    Double myDouble2 = 1.2346e6;

    // you can express ints/longs as binary (base 2)
    Integer intAsBinary = 0b11000111;
    Long longAsBinary = 0b00001111L;    // LONG CLASS REQUIRED THE L

    // or as octal (base 8)
    Integer intAsOctal = 011;   // 9 not 11
    // Why do programmers always mix up Halloween and Christmas?
    Long longAsOctal = 031L; // 24 not 31   // LONG CLASS REQUIRED THE L

    // or as hexadecimal (base 16)
    Integer intAsHex = 0x12;
    Long longAsHex = 0x3fL;    // so many letters in a number!

    // you can express chars as unicode values
    String myString2 = "\u0020";   // notice the single quotes

    // you can group long numbers with an underscore for readability (ignored by compiler)
    Long ssn = 555_55_5555L;   // LONG CLASS REQUIRED THE L
    Long creditCard = 4111_1111_1111_1111L;    // L required here!
    //Long studentId = _12345_;   // nope - not at beginning or end


    Dog dog1 = new Dog("Toto");

    class Dog{
        private String name;

        Dog(String name){
            this.name = name;
        }
    }

}
