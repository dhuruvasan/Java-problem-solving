import java.util.Scanner;

public class jnew {
    public static void main(String[] args) {
        int n,sum=0;
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
