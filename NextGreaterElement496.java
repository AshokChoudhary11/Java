package Array;

import java.io.*; 

import java.util.*; 

public class NextGreaterElement496 {
    static void nextGreater(int nums1[], int nums2[]){
        for(int i=0; i<nums1.length ; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    if(nums2[j]<nums2[j+1]){
                        System.out.print(nums2[j+1]);
                    }
                    else{
                        System.out.print(-1);
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums1[] = new int[n];
        for(int i=0; i<n; i++){
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int nums2[] = new int[m];
        for(int i=0; i<m; i++){
            nums2[i]= sc.nextInt();
        }
        nextGreater(nums1, nums2);
    }

}
