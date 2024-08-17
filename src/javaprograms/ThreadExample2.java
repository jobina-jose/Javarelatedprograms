package javaprograms;

public class ThreadExample2 implements Runnable {
    public static void main (String args[]){
           ThreadExample2 thread=new ThreadExample2();
           Thread obj=new Thread(thread);
           obj.start();
    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}
