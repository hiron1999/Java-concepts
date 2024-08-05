
//Implimintation of thread by extending Thread class
public class Thread1 extends Thread{

    @Override
    public void run(){
        System.out.println(currentThread().getName() + " is running.....");
    }
    public static void main(String[] args) {
        
        Thread t =new Thread1();
        t.start();
        System.out.println(currentThread().getName() + " is running....");
    }
}