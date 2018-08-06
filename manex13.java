//Java parameterized constructor

	class manExp13{  

	    int id;  

	    String name;  

	      

	    manExp13(int i,String n){  

	    id = i;  

	    name = n;  

	    }  

	    void display(){System.out.println(id+" "+name);}  

	   

	    public static void main(String args[]){  

	    manExp13 s1 = new manExp13(111,"thams");  

	    manExp13 s2 = new manExp13(222,"suf");  

	    s1.display();  

	    s2.display();  

	   }  

	}  