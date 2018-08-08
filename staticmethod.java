//Java static method

	//Program of changing the common property of all objects(static field).  

	  

	class thams{  

	     int rollno;  

	     String name;  

	     static String college = "ITS";  

	       

	     static void change(){  

	     college = "RIT";  

	     }  

	  

	     thams(int r, String n){  

	     rollno = r;  

	     name = n;  

	     }  

	  

	     void display (){System.out.println(rollno+" "+name+" "+college);}  

	  

	    public static void main(String args[]){  

	    thams.change();  

	  

	    thams s1 = new thams (111,"tham");  

	    thams s2 = new thams (222,"sheebs");  

	    thams s3 = new thams(333,"suf");  

	  

	    s1.display();  

	    s2.display();  

	    s3.display();  

	    }  

	}  