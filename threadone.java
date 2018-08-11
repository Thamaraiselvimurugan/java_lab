class thams implements Runnable{  

public void run(){  

System.out.println("task one");  

}  

  

public static void main(String args[]){  

Thread t1 =new Thread(new thams());//passing annonymous object of thams class  

Thread t2 =new Thread(new thams());  

  

t1.start();  

t2.start();  

  

 }  

}  