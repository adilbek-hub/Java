package com.bmdev.oop.lesson7.practice;

public class Button {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public void click(){
        System.out.println("Button"  + label + "Clicked");
    }
}
