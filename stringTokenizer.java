import java.util.StringTokenizer;  

public class thams{  

 public static void main(String args[]){  

   StringTokenizer st = new StringTokenizer("my name is thamarai"," ");  

     while (st.hasMoreTokens()) {  

         System.out.println(st.nextToken());  

     }  

   }  

}  