public class Thread2 implements Runnable{
    private final String name;
    public  Thread2(String name){
        this.name =name;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){

            System.out.println(name+" "+i);
        }
    }
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Thread2("child 1"),"Thread 1");
        
        Thread t2 = new Thread(new Thread2("child 2"),"Thread 2");
        t1.start();
        t2.start();


    }
}
