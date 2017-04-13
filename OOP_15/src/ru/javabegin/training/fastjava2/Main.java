package ru.javabegin.training.fastjava2;

import ru.javabegin.training.fastjava2.objects.Phone;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone(1024,"Samsung","GSM");
        System.out.println("phone1.getType() = " + phone1.getType());
    }
}
