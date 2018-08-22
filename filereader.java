import java.io.FileReader;  

public class Exp149 {  

	    public static void main(String args[])throws Exception{    

	          FileReader fr=new FileReader("Exp149.txt");    

	          int i;    

	          while((i=fr.read())!=-1)    

	          System.out.print((char)i);    

	          fr.close();    

	    }    

	

}