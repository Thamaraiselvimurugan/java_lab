	class Thams{  
       private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
	  Thams obj=new Thams();  
	  Thams.Inner in=obj.new Inner();  
	  in.msg();  
	 }  
	}  
