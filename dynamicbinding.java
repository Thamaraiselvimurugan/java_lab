class Animal{  

 void eat(){System.out.println("animal is eating...");}  

}  

  

class thams extends Animal{  

 void eat(){System.out.println("dog is eating...");}  

  

 public static void main(String args[]){  

  Animal a=new thams();  

  a.eat();  

 }  

}  