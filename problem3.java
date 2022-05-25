import java.util.*;

public class problem3 {

    public void fun(ArrayList<Integer> arr,int m){
        // System.out.println(Arrays.toString(arr));
        int temp,i;
        for(int j=0;j<m;j++){
        temp=arr.get(0);
        for(i=0;i<arr.size()-1;i++){
            arr.set(i, arr.get(i+1));
        }arr.set(i, temp);
    }
    // System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        problem3 pr=new problem3();
        int n;
        int m;
        n=sc.nextInt();
        m=sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(i+1);
        }
        System.out.println(arr);
        while (m!=arr.size()) {
           System.out.print(arr.get(m-1));
           arr.remove(m-1);
           pr.fun(arr,m-1);
           System.out.println(arr);
        }
        System.out.print(arr.get(m-1));
    }
}
