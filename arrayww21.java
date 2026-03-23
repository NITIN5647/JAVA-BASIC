import java.util.*;
public class arrayww21 {
    public static void maxsubarraysum(int numbers[]){
     int currsum=0;
     int maxsum=Integer.MIN_VALUE;
     for(int i=0;i<numbers.length;i++){
        int start=i;

    for(int j=0;j<numbers.length;j++){
        int end=j;
     
    for(int k=start;k<=end;k++ ){
      currsum+=numbers[k]; 
      
        
    } 
    
    System.out.println("currsum: " + currsum);
if(currsum>maxsum){
   maxsum=currsum; 
    


}


}   
   System.out.println("maxsum" + maxsum); 
}


public static void main(String args[]){
 int numbers[]={1,2,3,4,5};
 maxsubarraysum(numbers);   


}







     }    
    }
    

