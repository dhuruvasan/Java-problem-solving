import java.util.*;

public class nextlarge {
    public void fun(int n,int[] arr){
        // find max
        // int max=arr[0];
        // for (int i : arr){
        //     if (i>max){
        //         max=i;
        //     }
        // }System.out.println(max);
        // find next large
        for (int i=0;i<n;i++){
            ArrayList<Integer> arr2=new ArrayList<>();
            for(int j=0;j<n;j++){
                if (arr[i]<arr[j]){
                    arr2.add(arr[j]);
                }
            }
            if (arr2.size()==0){
                System.out.print(arr[i]+"-> ");
            }
            else{
                int mi=Collections.min(arr2);
                System.out.print(arr[i]+"->"+mi+ " ");
            }
        }
    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nextlarge ne=new nextlarge();
        ne.fun(n,arr);
    }
}
