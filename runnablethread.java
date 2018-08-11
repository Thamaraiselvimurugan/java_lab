class thams implements Runnable{  

public void run(){  

System.out.println("thread is running...");  

}  

  

public static void main(String args[]){  

thams m1=new thams();  

Thread t1 =new Thread(m1);  

t1.start();  

 }  

}  