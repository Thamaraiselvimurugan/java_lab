//Example of Method Overloading by changing the no. of arguments

	class manExp7{  

	  void sum(int a,int b){System.out.println(a+b);}  

	  void sum(int a,int b,int c){System.out.println(a+b+c);}  

	  

	  public static void main(String args[]){  

	  manExp7 obj=new manExp7();  

	  obj.sum(10,10,10);  

	  obj.sum(20,20);  

	  

	  }  

	}  