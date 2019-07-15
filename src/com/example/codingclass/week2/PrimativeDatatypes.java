package com.example.codingclass.week2;

public class PrimativeDatatypes {

    byte myByte = 1;

    short myShort = 2;

    int myInt = 3;

    long myLong = 4L;          // notice the L (could be l but don't) - sometimes optional (this is a long, not integer!)

    double myDouble = 6d;      // notice the d - optional (this is a double, not

    boolean myBoolean = true;

    char myChar = 'a';         // notice the single quotes

    // you can express floats/doubles in scientific notation
    float myFloat = 123.4e3f;
    double myDouble2 = 1.2346e6d;

    // you can express ints/longs as binary (base 2)
    int intAsBinary = 0b11000111;
    long longAsBinary = 0b00001111;

    // or as octal (base 8)
    int intAsOctal = 011;   // 9 not 11
    // Why do programmers always mix up Halloween and Christmas?
    long longAsOctal = 031; // 25 not 31

    // or as hexadecimal (base 16)
    int intAsHex = 0x12;
    long longAsHex = 0x3fL;    // so many letters in a number!

    // you can express chars as unicode values
    // https://en.wikipedia.org/wiki/List_of_Unicode_characters
    char myChar2 = '\u0020';   // 0020 is a space notice the single quotes

    // you can group long numbers with an underscore for readability (ignored by compiler)
    long ssn = 555_55_5555;
    long creditCard = 4111_1111_1111_1111L;    // L required here!
    //long studentId = _12345_;   // nope - not at beginning or end

}
