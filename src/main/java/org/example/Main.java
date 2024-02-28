package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());
//        Thread.currentThread().setName("Practice0");
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setPriority(1);
//        System.out.println(Thread.currentThread().getPriority());

//        System.out.println(Thread.currentThread().isAlive());

        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done");
    }
}




