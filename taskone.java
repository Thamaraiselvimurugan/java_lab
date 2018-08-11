class thams extends Thread{  

 public void run(){  

   System.out.println("task one");  

 }  

 public static void main(String args[]){  

  thams t1=new thams();  

  thams t2=new thams();  

  thams t3=new thams();  

  

  t1.start();  

  t2.start();  

  t3.start();  

 }  

}  