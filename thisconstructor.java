//Where to use this() constructor call?

	class thams{  

	    int id;  

	    String name;  

	    String city;  

	      

	    thams(int id,String name){  

	    this.id = id;  

	    this.name = name;  

	    }  

	    thams(int id,String name,String city){  

	    this(id,name);//now no need to initialize id and name  

	    this.city=city;  

	    }  

	    void display(){System.out.println(id+" "+name+" "+city);}  

	      

	    public static void main(String args[]){  

	    thams e1 = new thams(111,"thams");  

	    thams e2 = new thams(222,"sheebs","Chennai");  

	    e1.display();  

	    e2.display();  

	   }  

	}  