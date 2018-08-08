//super is used to invoke parent class constructor.

	class Bike5{  

	  Bike5(){System.out.println("Vehicle is created");}  

	}  

	  

	class thams extends Bike5{  

	  thams(){  

	   super();//will invoke parent class constructor  

	   System.out.println("Bike is created");  

	  }  

	  public static void main(String args[]){  

	   thams b=new thams();  

	        

	}  

	}  