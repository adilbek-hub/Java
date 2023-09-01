package com.bmdev.oop.lesson7.practice;

public class Window {
private String title;
private Button button;

public Window(String title){
    this.title = title;
    this.button = new Button("Close");

}

public void close(){
    System.out.println("Window" + title + "Is Closed");
}
public  void clickCloseButton(){
    button.click();
}
}
