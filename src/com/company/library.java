package com.company;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class library {
    SimpleDateFormat objSDF= new SimpleDateFormat("s=dd-mm-yyyy");
    public String title;
    public String author;
    public int year;
    public String publ;
    public double value;
    public String state;
    public Date date;

    library (String title, String author, int year, String publ,  double value, String state,Date date) {
        this.title=title;
        this.author=author;
        this.year=year;
        this.publ=publ;
        this.value=value;
        this.state=state;
        this.date=date;
    }
    public void librinfo () {
        System.out.println("Книга: " + title + "; Автор: " + author + "; Год: "+year+"; Издательство: "+publ+"; Цена: "+value+"; Состояние: " +state+"; Дата выдачи на руки: "+date);
    }
    public void newstate(String state){
        this.state=state;
        System.out.println("Книга: " + title + "; Автор: " + author + "; Год: "+year+"; Издательство: "+publ+"; Цена: "+value+"; Состояние(обновленно): " +state+"; Дата выдачи на руки: "+date);

    }
}
