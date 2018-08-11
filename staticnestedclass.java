	class Thams{  
	  static int data=30;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
	  Thams.Inner obj=new Thams.Inner();  
	  obj.msg();  
	  }  
	}  

