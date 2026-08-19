// here we count all the digits which is given by user

import java.util.*;
public class Count_all_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int n=sc.nextInt();
        int count = 0;
        while (n>0) {
            count = count+1;
            n=n/10;
        }
        System.out.println(count);
        sc.close();
    }
}
