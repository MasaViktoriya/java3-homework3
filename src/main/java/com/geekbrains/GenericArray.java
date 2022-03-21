package com.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T... array){
        this.array = array;
        System.out.println("Массив: " + Arrays.toString(array));
    }

    public void elementChange(int el1, int el2){
        if (el1 < array.length && el1 >= 0 &&  el2 < array.length && el2 >=0) {
            T element1 = array[el1];
            T element2 = array[el2];
            array[el1] = element2;
            array[el2] = element1;
            System.out.println("Меняем местами элементы " + el1 + " и " + el2 + ": " + Arrays.toString(array));
        }else {
            System.out.println("Индекс за пределами массива!");
        }
    }

    public void arrayToArraylist(){
        ArrayList<T> arrList = new ArrayList<>();
        Collections.addAll(arrList, array);
        System.out.println("Преобразованный из массива ArrayList: "+ arrList);
    }

    public static void main(String[] args) {
        GenericArray<Integer> arrayInt = new GenericArray<>(1, 2, 3, 4, 5, 6, 7, 8);
        arrayInt.elementChange(2, 3);
        GenericArray<String> arrayStr = new GenericArray<>("a", "b", "c", "d");
        arrayStr.elementChange(0, 3);

        arrayStr.arrayToArraylist();
    }
}
