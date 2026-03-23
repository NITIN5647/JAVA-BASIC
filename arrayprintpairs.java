import java.util.*;
public class arrayprintpairs {
    public static void printpairs(int numbers[]){ 
    int tp=0; 
    for(int i=0;i<numbers.length;i++){
    int curr=arr[i];
    for(int j=i+1;j<numbers.length;j++){
      System.out.println("("+ curr + "," + numbers[j] + ")");
      tp++;            

    }

    System.out.println();
    


    }  
    
    System.out.println("totalpairs=" +tp);
    
}
    public static void main(String args[]){
     int numbers[]={1,2,3,4,5,6};
      printpairs(numbers);   
    }

                


    }     

