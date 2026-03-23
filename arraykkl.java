import java.util.*;
public class arraykkl {
    public static void selectionsort(int numbers[]){
    for(int i=0;i<numbers.length-1;i++){
     int minpos=i;
   for(int j= i+1;j<numbers.length-1;j++){
    if(numbers[minpos]>numbers[j]){
     minpos=j;
     int temp=numbers[minpos];
     numbers[minpos]=numbers[j];
     numbers[j]=temp;                   

     



    }

   }

    }  

    
}

public static void printnumbers(int numbers[]){
 for(int i=0;i<numbers.length;i++){
   System.out.print(numbers[i]); 

 }

}

public static void main(String args[]){
   int numbers[]={1,2,3,4,5};
   selectionsort(numbers);
   printnumbers(numbers);

}
    
}
