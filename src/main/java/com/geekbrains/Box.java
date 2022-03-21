package com.geekbrains;

import java.util.ArrayList;

public class Box<T extends  Fruit>{
    public ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void addFruit(T fruit){
        list.add(fruit);
    }
    public void printBox (String boxname){
        System.out.println("Содержимое коробки " + boxname + ": " + list.toString());
    }

    public float getBoxWeight(){
        return list.size() * list.get(0).getWeight();
    }

    public boolean compare (Box boxname) {
        if (this.getBoxWeight() == boxname.getBoxWeight()) {
            System.out.println("Веса коробок равны");
            return true;
        } else {
            System.out.println("Вес коробок разный");
            return  false;
        }
    }

    public void moveFruits(Box boxname){
        boxname.list.addAll(list);
        list.clear();
    }

    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Apple a4 = new Apple();
        appleBox1.addFruit(a1);
        appleBox1.addFruit(a2);
        appleBox1.addFruit(a3);
        appleBox1.addFruit(a4);
        appleBox1.printBox("Яблоки 1");
        System.out.println("Вес коробки: " + appleBox1.getBoxWeight());

        Box<Apple> appleBox2 = new Box<>();
        Apple a5 = new Apple();
        appleBox2.addFruit(a5);
        appleBox2.printBox("Яблоки 2");
        System.out.println("Вес коробки: " + appleBox2.getBoxWeight());

        Box<Orange> orangeBox1 = new Box<>();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        orangeBox1.addFruit(o1);
        orangeBox1.addFruit(o2);
        orangeBox1.printBox("Апельсины 1");
        System.out.println("Вес коробки: " + orangeBox1.getBoxWeight());

        Box<Orange> orangeBox2 = new Box<>();
        Orange o3 = new Orange();
        Orange o4 = new Orange();
        orangeBox2.addFruit(o3);
        orangeBox2.addFruit(o4);
        orangeBox2.printBox("Апельсины 2");
        System.out.println("Вес коробки: " + orangeBox2.getBoxWeight());

        System.out.println("Сравним вес коробок Яблоки 1 и Яблоки 2:");
        appleBox1.compare(appleBox2);
        System.out.println("Сравним вес коробок Апельсины 1 и Апельсины 2:");
        orangeBox1.compare(orangeBox2);
        System.out.println("Сравним вес коробок Яблоки 1 и Апельсины 1:");
        appleBox1.compare(orangeBox1);

        System.out.println("Пересыпем всё содержимое из коробки Яблоки 1 в коробку Яблоки 2");
        appleBox1.moveFruits(appleBox2);
        appleBox1.printBox("Яблоки 1");
        appleBox2.printBox("Яблоки 2");
        System.out.println("Вес коробки: " + appleBox2.getBoxWeight());
    }
}
