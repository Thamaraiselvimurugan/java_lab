class thams extends Thread{  

public void run(){  

System.out.println("thread is running...");  

}  

public static void main(String args[]){  

thams t1=new thams();  

t1.start();  

 }  

} 