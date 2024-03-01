package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        //use the Runnable interface instancing the class
        MyRunnable runnable1 = new MyRunnable();
        //create a thread with runnable's instance as an argument
        Thread thread2 = new Thread(runnable1);


    }
}




