class thams{  

 int rollno;  

 String name;  

 String city;  

  

 thams(int rollno, String name, String city){  

 this.rollno=rollno;  

 this.name=name;  

 this.city=city;  

 }  

  

 public static void main(String args[]){  

   thams s1=new thams(101,"Raj","lucknow");  

   thams s2=new thams(102,"Vijay","ghaziabad");  

     

   System.out.println(s1);//compiler writes here s1.toString()  

   System.out.println(s2);//compiler writes here s2.toString()  

 }  

}  