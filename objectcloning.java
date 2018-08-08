//Object cloning

	class thams implements Cloneable{  

	int rollno;  

	String name;  

	  

	thams(int rollno,String name){  

	this.rollno=rollno;  

	this.name=name;  

	}  

	  

	public Object clone()throws CloneNotSupportedException{  

	return super.clone();  

	}  

	  

	public static void main(String args[]){  

	try{  

	thams s1=new thams(101,"amit");  

	  

thams s2=(thams)s1.clone();  

	  

	System.out.println(s1.rollno+" "+s1.name);  

	System.out.println(s2.rollno+" "+s2.name);  

	  

	}catch(CloneNotSupportedException c){}  

	  

	}  

	}  