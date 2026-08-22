// checking Armstrong numbers

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to check the armstrong number");
        int x = sc.nextInt();
        int orgNum = x;
        int count = String.valueOf(x).length();
        double sum=0;
        while (x>0) {
            int ld = x%10;
            sum=sum+Math.pow(ld,count);
            x=x/10;
        }
        if (orgNum==sum) {
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}

