class cse extends Thread{
    cse(){
        super("Cse thread");
        
        System.out.println("Cse thread :"+this);
        start();
      
    }
    public void run(){
        try{
            for(int i = 0; i<5; i++){
            System.out.println("CSE");
            Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.println("exiting cse thread");
    }
}
class week11{
    public static void main(String args[]){
        new cse();
        try{
            for(int i = 0; i<5;i++){
            System.out.println("BMS College of Engineering");
            Thread.sleep(10000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
