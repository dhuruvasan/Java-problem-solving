import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class movezero {
    void fun(int n,int[] arr){
        int k=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                k=k+1;
            }
        }
        System.out.println(k);
        for (int i=0;i<k;i++){
            System.out.print("0");
        }
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                System.out.print(arr[i]);
            }
        }
    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter an element");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    movezero mov=new movezero();
    mov.fun(n,arr);
    }
}
