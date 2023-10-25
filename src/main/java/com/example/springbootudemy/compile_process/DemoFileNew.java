package com.example.springbootudemy.compile_process;

import java.util.Date;

/**
 * The type Demo file new.
 *
 * @author DuyND
 * @name DemoFile.java
 * @date 30 /09/2023
 */
public class DemoFileNew {

    private final int age;

    private final String name;

    private final Date birthDay;

    public DemoFileNew(int age, String name, Date birthDay) {
        this.age = age;
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "DemoFile{" +
                "age=" + age +
                ", name=" + name +
                ", birthDay=" + birthDay +
                '}';
    }


    public static void test(){
        int[] myArray = new int[5];
        for(int i =1;i<10;i++){
            myArray[i] = i;
            System.out.println("asdad");
        }
    }

    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        new DemoFileNew(20, "Trần Sơn Giang", date);
        test();
    }
}
