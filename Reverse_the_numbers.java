// Reverse the numbers from the input which is giver by the user

import java.util.*;

public class Reverse_the_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digits");
        int n=sc.nextInt();
        int revnum=0;
        while (n>0) {
            n=n%10;
            System.out.print(n);
        }
    }
}
