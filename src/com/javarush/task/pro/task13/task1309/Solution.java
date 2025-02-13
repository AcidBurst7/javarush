package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Ivan Ivanov", 4.09d);
        grades.put("Petr Ivanov", 4.01d);
        grades.put("Lisa Markova", 3.45d);
        grades.put("Nik Safronov", 2.34d);
        grades.put("Gerda Durdeevich", 5.01d);

    }
}
