package com.example.codingclass.week02.access.one;

public class Alpha {
    private static final String UGLY_COLOR = "orange";
    private String className = "Alpha";

    private String color = "blue";

    public String getColor(){

        return this.color;
    }

    public void setColor(String color){

        if(UGLY_COLOR.equals(color)){
            System.out.println("dude, seriously");
        }else{
            this.color = color;
        }
    }


    public void setColorAndName(String color, String name){
        setColor(color);
        setName(name);
    }

    private void setName(String name) {
        this.className = name;
    }

    public void publicMethod(){
        String methodName = "publicMethod";
        System.out.println("Class: " + this.className + "; " + "Method: " + methodName);
    }

    protected void protectedMethod(){
        String methodName = "protectedMethod";
        System.out.println("Class: " + this.className + "; " + "Method: " + methodName);
    }

    void noModifierMethod(){
        String methodName = "noModifierMethod";
        System.out.println("Class: " + this.className + "; " + "Method: " + methodName);
    }

    private void privateMethod(){
        String methodName = "privateMethod";
        System.out.println("Class: " + this.className + "; " + "Method: " + methodName);
    }

    void foo(){
        publicMethod();
        protectedMethod();
        noModifierMethod();
        privateMethod();
    }

}
