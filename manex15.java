//Program of counter without static variable

	class manExp15{  

	int count=0;//will get memory when instance is created  

	  

	manExp15(){  

	count++;  

	System.out.println(count);  

	}  

	  

	public static void main(String args[]){  

	  

	manExp15 c1=new manExp15();  

	manExp15 c2=new manExp15();  

	manExp15 c3=new manExp15();  

	  

	 }  

	}  