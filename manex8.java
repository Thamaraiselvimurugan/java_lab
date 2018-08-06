//Example of Method Overloading by changing data type of argument

	class manExp8{  

	  void sum(int a,int b){System.out.println(a+b);}  

	  void sum(double a,double b){System.out.println(a+b);}  

	  

	  public static void main(String args[]){  

	  manExp8 obj=new manExp8();  

	  obj.sum(10.5,10.5);  

	  obj.sum(20,20);  

	  

	  }  

	}  