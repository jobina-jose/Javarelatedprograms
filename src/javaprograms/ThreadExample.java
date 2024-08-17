package javaprograms;

public class ThreadExample extends Thread {
    public static void main(String args[]){
        ThreadExample thread=new ThreadExample();
         thread.start();
        System.out.println("This code is out side of thread");
    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}
