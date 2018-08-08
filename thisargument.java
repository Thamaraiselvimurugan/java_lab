//this keyword can be passed as an argument in the method.

	class thams{  

	  void m(thams obj){  

	  System.out.println("method is invoked");  

	  }  

	  void p(){  

	  m(this);  

	  }  

	    

	  public static void main(String args[]){  

	  thams s1 = new thams();  

	  s1.p();  

	  }  

	}  