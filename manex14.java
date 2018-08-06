//Java Copy Constructor

	class manExp14{  

	    int id;  

	    String name;  

	    manExp14(int i,String n){  

	    id = i;  

	    name = n;  

	    }  

	      

	    manExp14(manExp14 s){  

	    id = s.id;  

	    name =s.name;  

	    }  

	    void display(){System.out.println(id+" "+name);}  

	   

	    public static void main(String args[]){  

	    manExp14 s1 = new Exp14(111,"thams");  

	    manExp14 s2 = new Exp14(s1);  

	    s1.display();  

	    s2.display();  

	   }  

	}  