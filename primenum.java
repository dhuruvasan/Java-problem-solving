import java.util.*;
public class primenum {
    void fun(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        int k=2;
        while(n!=arr.size()){
            int p=0,o,q,i=0;
            o=k;
            if (k>9){
                while(o!=0){
                    q=o%10;
                    p=p+q;
                    o=o/10;
                }
                if(isprime(p) && isprime(k)){
                    arr.add(k);
                    i=i+1;
                }
            }
            else{
                if(isprime(k)){
                    arr.add(k);
                }
            }k=k+1;
        }System.out.println(arr);
    }
    boolean isprime(int m){
        int n=0;
        for(int i=1;i<m;i++){
            if(m%i==0){
                n=n+1;
            }
        }
        if(n>1){
            return false;
        }
        else{ return true;}
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        primenum pn=new primenum();
        int n=10;
        pn.fun(n);
    }
    
}
