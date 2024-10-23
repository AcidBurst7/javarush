package com.javarush.task.pro.task10.task1008;

/* 
Зарплата
*/

public class Programmer {
    private int salary = 1000;

    //напишите тут ваш код
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int newSalary) {
        if (newSalary > this.salary) {
            this.salary = newSalary;
        }
    }
}
