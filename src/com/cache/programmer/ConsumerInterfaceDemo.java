package com.cache.programmer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {


    public static void main(String[] args) {
        Consumer<String> display = str -> System.out.println(str);
        display.accept("Jaggu");

        Consumer<Integer> displayInt = intVal -> System.out.println(intVal * intVal);
        displayInt.accept(2);


        Consumer<List<Integer>> multiplyList =   inputList->{
          for(int i =0;i<inputList.size();i++){
              inputList.set(i,2*inputList.get(i));
          }
        };

        Consumer<List<Integer>> displayList = inputList->{
            inputList.stream().forEach(element->System.out.print(element + " "));
        };

        List<Integer> inputList = Arrays.asList(1,2,3,4,5);
        multiplyList.accept(inputList);
        displayList.accept(inputList);
        System.out.println();

       /* Consumer<StringBuffer> toUpperString = str-> str.toString().toUpperCase();
        Consumer<StringBuffer> displayString = str-> System.out.println(str);

        StringBuffer str =new StringBuffer("this");
        toUpperString.andThen(displayString).accept(str);*/

        List<Integer> listModified = Arrays.asList(2);
        Consumer<Integer> num = val->{

            for(int i =0;i<listModified.size();i++){
                listModified.set(i,listModified.get(i)*20);
            }
        };
        Consumer<Integer> numDisp = val-> {

            for (int i = 0; i < listModified.size(); i++) {
                listModified.set(i, listModified.get(i) - 1);
            }
        };

        num.andThen(numDisp).accept(2);

        for(int i : listModified){
            System.out.println(i);
        }


           Consumer<Integer> consumerInterface = i-> System.out.println("the multiplication val with 1000: "+i*1000);
          consumerInterface.accept(2);
        Consumer<String> ci = i-> System.out.println("the multiplication val with 1000: "+i);


           List<Integer> list = Arrays.asList(1,2,3,4,5);
        //Consumer<List<Integer>> listConsumer =

        list.stream().forEach(consumerInterface);
    }







}
