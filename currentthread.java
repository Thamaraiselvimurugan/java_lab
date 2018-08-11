class thams extends Thread{  

 public void run(){  

  System.out.println(Thread.currentThread().getName());  

 }  

 public static void main(String args[]){  

  thams t1=new thams();  

  thams t2=new thams();  

  

  t1.start();  

  t2.start();  

 }  

}  