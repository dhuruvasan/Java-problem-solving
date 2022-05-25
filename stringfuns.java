import java.util.Arrays;
import java.util.Scanner;

public class stringfuns {
    public static void main(String args[]){
        System.out.println("hi");
        Scanner scanner=new Scanner(System.in);
        String num=scanner.nextLine();
        // String hi=scanner.next();
        System.out.println(num);
        String[] nam;
        nam=num.split("2");
        System.out.println(Arrays.toString(nam));
        for (String element : nam){
            System.out.println(element);
        }
        for (int i=0;i<nam.length;i++){
            System.out.println(nam[i]);
        }
    }
}
