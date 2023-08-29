package com.bmdev.oop.lesson7;

public class Ram {
//1 privatny ozgormo
private int value;
//2 obektti initsializasia kyluuchy konstructor
    public Ram(int value) {
        this.value = value;

    }
    //3 getter генерируем для нашего поля value
    // талааларыбыздын значениясын(баасын => 20) алуу үчүн биз аталыштан турган гетер түзөбүз
    public  int getValue(){
        return value;
    }

//4
    public void setValue (int value){
        this.value = value;
    }



}
