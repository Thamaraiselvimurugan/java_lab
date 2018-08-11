class thams extends Thread{  

 public void run(){  

  for(int i=1;i<5;i++){  

    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  

    System.out.println(i);  

  }  

 }  

 public static void main(String args[]){  

  thams t1=new thams();  

  thams t2=new thams();  

   

  t1.start();  

  t2.start();  

 }  

}  