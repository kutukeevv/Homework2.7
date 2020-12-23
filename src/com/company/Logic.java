package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Logic {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();

    Iterator<String> iter = list.iterator();
    Iterator<String> iter2 = list1.iterator();
    Iterator<String> iter3 = list2.iterator();

    String userInput;
    private int numOfInputs;

    public void start(){
        myScanner();
    }

    private  void myScanner(){


        while(true){
            System.out.println("\nВведите слово");
            userInput = sc.next();

            list.add(userInput);
            numOfInputs++;
            if(numOfInputs == 5 ){
                break;
            }
        }

        System.out.println(" Список номер А");
        iter = list.iterator();
        while(iter.hasNext()){
            String e = iter.next();
            System.out.println(e);
        }


        while (true){
            System.out.println("\nВведите слово");
            userInput = sc.next();

            list1.add(userInput);
            numOfInputs++;
            if (numOfInputs == 10){
                break;
            }
        }

        System.out.println("список номер Б");
        iter2 = list1.iterator();
        while(iter2.hasNext()){
            String e = iter2.next();
            System.out.println(e);
        }



        Collections.reverse(list1);

        HERE:
        for (String temp : list){
            list2.add(temp);
            for (String temp1 :list1){
                list2.add(temp1);
                list1.remove(temp1);
                break;
            }
        }
        System.out.println("\nсписок обьеденен следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}");

        iter3 = list2.iterator();
        while(iter3.hasNext()){
            String e = iter3.next();
            System.out.println(e);
        }


        System.out.println(" список сортирован по длине ");
        Collections.sort(list2, new Realise());


        iter3 = list2.iterator();
        while(iter3.hasNext()){
            String e = iter3.next();
            System.out.println(e);
        }
    }
}
