import java.util.*;

public class arraynew2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int marks[]=new int[100];
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    System.out.println("physics marks=" + marks[0]);
    System.out.println("chemistry marks=" + marks[1]);
    
    System.out.println("math marks=" + marks[2]);
    
    marks[2]=marks[2]+1;
    System.out.println("chemistry marks = " + marks[2]);
    }
}




    
        
    
    

