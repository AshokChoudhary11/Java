package Array;

import java.util.*;

public class FindElementIn2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int Target = sc.nextInt();

        int arr[][] = new int[m][n];
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
                hm.add(arr[i][j]);
            }
        } 
        if(hm.contains(Target)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
