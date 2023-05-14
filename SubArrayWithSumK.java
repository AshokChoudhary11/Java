package Array;

import java.util.HashMap;

public class SubArrayWithSumK {

    static void SubArray(int arr[],int sum){
        int Current_Sum =0;
        int start =0;
        int end = -1;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            Current_Sum += arr[i];
            if(Current_Sum -sum == 0){
                start =0;
                end =i;
                break;
            }
            if(hm.containsKey(Current_Sum-sum)){
                start = hm.get(Current_Sum-sum)+1;
                end = i;
                break;
            }
            hm.put(Current_Sum, i);
        }
        if(end==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(start+" "+end);
        } 
    }
    public static void main(String args[]){
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;

        SubArray(arr, sum);
        
    }
    
}
