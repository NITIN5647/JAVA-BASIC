import.java.util.*;
public class Arraytt {
 public static void maxsubarraysum(int numbers[]){
 int currsum=0;
 int maxsum=Integer.MIN_VALUE;
 prefix[]=numbers.length;
 prefix[0]=numbers[0];
 for(int i=0;i<prefix.length; i++){
  prefix[i]=prefix[i-1]+numbers[i];
 }

 for(int i=0;i<numbers.length;i++){
  int start=i;

 

 for(int j=0;j<numbers.length;j++){
    int end=j;  

   currsum=start==0?currsum=prefix[end]:currsum=prefix[end]-prefix[start-1];

    

 }

 if(currsum>maxsum){
    maxsum=currsum;
 }

}
 System.out.println("maxsum:" + maxsum);

 public static void main(String args[]){
  int numbers[]={1,2,3,4,5};
  maxsubarraysum(numbers);


 }




  

    
    

   

 


  
 
 
 


 








    
                                

 } 

    
}
