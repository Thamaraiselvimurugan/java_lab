public class thams extends Thread{  

 public void run(){  

  if(Thread.currentThread().isDaemon()){//checking for daemon thread  

   System.out.println("daemon thread work");  

  }  

  else{  

  System.out.println("user thread work");  

 }  

 }  

 public static void main(String[] args){  

  thams t1=new thams();//creating thread  

  thams t2=new thams();  

  thams t3=new thams();  

  

  t1.setDaemon(true);//now t1 is daemon thread  

    

  t1.start();//starting threads  

  t2.start();  

  t3.start();  

 }  

}  