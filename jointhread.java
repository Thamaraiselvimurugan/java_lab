class thams extends Thread{  

 public void run(){  

  for(int i=1;i<=5;i++){  

   try{  

    Thread.sleep(500);  

   }catch(Exception e){System.out.println(e);}  

  System.out.println(i);  

  }  

 }  

public static void main(String args[]){  

 thams t1=new thams();  

 thams t2=new thams();  

 thams t3=new thams();  

 t1.start();  

 try{  

  t1.join();  

 }catch(Exception e){System.out.println(e);}  

  

 t2.start();  

 t3.start();  

 }  

}  