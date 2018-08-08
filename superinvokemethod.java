//super can be used to invoke parent class method

	class Student16{  

	void message(){System.out.println("welcome");}  

	}  

	  

	class thams extends Student16{  

	void message(){System.out.println("welcome to java");}  

	  

	void display(){  

	message();//will invoke current class message() method  

	super.message();//will invoke parent class message() method  

	}  

	  

	public static void main(String args[]){  

	thams s=new thams();  

	s.display();  

	}  

	}  