package Array;


import java.util.*;

public class DiagonalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int p=0; p<n; p++){
            for(int j=0; j<n; j++){
                arr[p][j] = sc.nextInt();
            }
        int pd = 0;
        int sd = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    pd += arr[i][j];
                }
                if((i+j)==(n-1)){
                    sd += arr[i][j];
                }
            }
        }
        System.out.println(pd+" "+sd);
        }
    }
}
