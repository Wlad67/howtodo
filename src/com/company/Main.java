package com.company;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args)throws ParseException {
        Scanner name = new Scanner(System.in);
        Date daten=new Date();
        SimpleDateFormat objSDF= new SimpleDateFormat("dd-mm-yyyy");
        library[] library=new library[10];
        library [0] = new library("Зеленая миля", "Стивен Кинг", 1996, "Росмэн", 150, "Хорошое",objSDF.parse("24-07-2017"));
        library [1] = new library("Искусство программирования","Кнут Дональд",1968,"Addison–Wesley",85,"Отличное", objSDF.parse("08-04-2017"));
        library [2] = new library("Техника и философия хакерских атак","Крис Касперски",1999,"СОЛОН-Р",120,"Удовлетворительное",objSDF.parse("14-09-2017"));
        library [3] = new library("Алиса в Стране чудес","Льюис Кэрролл",1865,"Macmillan and Co",130,"Хорошое",objSDF.parse("07-05-2017"));
        library [4] = new library("2001: Космическая одиссея ","Артур Кларк",1968,"New American Library",95,"Отличное",objSDF.parse("23-06-2017"));
        library [5] = new library("Убийство в «Восточном экспрессе»","Агата Кристи",1934,"Collins Crime Club",140,"Хорошое",objSDF.parse("17-01-2017"));
        library [6] = new library("Сияние","Стивен Кинг",1977,"Doubleday",132,"Удовлетворительное",objSDF.parse("08-08-2017") );
        library [7] = new library("Оно","Стивен Кинг",1986,"Viking",88,"Хорощое",objSDF.parse("24-03- 2017"));
        library [8] = new library("Смерть в облаках","Агата Кристи",1935,"Эксмо-Пресс",90,"Отличное",objSDF.parse("05-06-2017"));
        library [9] = new library("11/22/63","Стивен Кинг",2011,"Charles Scribner's Sons",143,"Хорошое",objSDF.parse("19-04-2017" ));

        System.out.println("\nИзменить состояние книг, изданных больше N лет назад : \n");
        for(int i=0;i<10;i++){
            if(library[i].year<1990){library[i].newstate("Удовлетворительное");}
            else {}
        }
        System.out.println("\nВывести названия всех книг, цена на которые > 100 гривен :\n ");
        for(int i=0;i<10;i++){
            if(library[i].value>100){library[i].librinfo();}
            else {}
        }
        System.out.println("\nВывести названия всех книг данного автора :\n ");
        String aut = name.nextLine();
        for(int i=0;i<10;i++){
            if(library[i].author.equals(aut)){library[i].librinfo();}
            else {}
        }
        System.out.println("\nВывести информацию о книгах, которые находятся на руках дольше 3 месяцев :\n ");
        Date tod =objSDF.parse("01-11-2017");

        for(int i=0;i<10;i++){
            if(library[i].date.compareTo(tod)>-95){library[i].librinfo();}
            else {}
        }
    }
}
