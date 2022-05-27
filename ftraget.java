import java.util.*;

public class ftraget {

    public void fun(int[] arr,int n,int m){
        boolean l=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]+arr[j+1]==m){
                    l=true;
                }
            }
        }
        System.out.print(l);
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        ftraget ft=new ftraget();
        int n=4,m=26;
        int[] arr={2,7,11,15};
        ft.fun(arr,n,m);
    }
}
