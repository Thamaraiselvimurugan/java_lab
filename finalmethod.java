//Java final method

	 class Honda{  

	  final void run1(){System.out.println("running");}  

	}  

	     

	public class thams extends Honda{  

	   void run1(){System.out.println("running safely with 100kmph");}  

	     

	   public static void main(String args[]){  

	   thams honda= new thams();  

	   honda.run1();  

	   }  

	}  