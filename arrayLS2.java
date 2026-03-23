
import java.util.*;
public class arrayLS2 {
    
    public static int linearsearch(int numbers[], int key){
    for(int i=0;i<numbers.length;i++){
    if(numbers[i]==key){
        return i;
    }
    
}
return -1;
    
}
public static void main(String[] args) {
    int numbers[]={23,56,78,89,90};
    int key=89;
    int index=linearsearch(numbers,key);
    if(index==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("found at index:" + index);
    }
}
}
