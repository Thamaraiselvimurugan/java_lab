class thams extends Thread{  

  public void run(){  

   System.out.println("running...");  

  }  

 public static void main(String args[]){  

  thams t1=new thams();  

  thams t2=new thams();  

  System.out.println("Name of t1:"+t1.getName());  

  System.out.println("Name of t2:"+t2.getName());  

   

  t1.start();  

  t2.start();  

  

  t1.setName("thamaraiselvi");  

  System.out.println("After changing name of t1:"+t1.getName());  

 }  

}  