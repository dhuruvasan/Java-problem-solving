import java.util.*;

public class babracket{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        babracket ba=new babracket();
        String str="((abc)))))((((((de))";
        ba.fun(str);
    }
    void fun(String str){
        char[] chr=str.toCharArray();
        int op=0,cl=0 ,m=chr.length;
        for(int i=0;i<chr.length;i++){
          m=m-1;
          if(chr[i]=='('){
              op=op+1;
          }
          else if(chr[i]==')'){
              op=op-1;
          }
          if(chr[m]==')'){
              cl=cl+1;
          }
          else if(chr[m]=='('){
              cl=cl-1;
          }
          if(op<0){
              chr[i]=0;
              op=0;
          }
          if(cl<0){
              chr[m]=0;
              cl=0;
          }
          
        }
        // System.out.print(chr);
        for(int i=0;i<chr.length;i++){
            if(chr[i]!=0){
                System.out.print(chr[i]);
            }
        }
    }
}