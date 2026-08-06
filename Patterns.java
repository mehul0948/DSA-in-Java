// Day 1 to 3 of DSA >> Patterns

// Pattern no 1

/*
public class Patterns {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
//                                               >>             Output                <<


****
****
****
****

*/

// Pattern no 2

/*
public class Patterns {

    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

//                                               >>             Output                <<


*
**
***
****

*/

// Pattern no 3

/*
public class Patterns {

     public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//                                               >>             Output                <<


1
12
123
1234

*/

// Pattern no 4
/*

public class Patterns {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

//                                               >>             Output                <<

1
22
333
4444

*/

// pattern no 5

/*

public class Patterns {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=0;j<5-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//                                               >>             Output                <<

* * * * *
* * * *
* * *
* *
*

*/

// Pattern no 6

/*

public class Patterns {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//                                               >>             Output                <<

12345
1234
123
12
1

*/

 // Pattern no 7

 /*
public class Patterns {

    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4-i+1;j++){
                System.out.print("   "); 
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print(" * ");
            }
            for(int l=0;l<=4-i+1;l++){
                System.out.print("   "); 
            }
            System.out.println();
        }
    }
}

//                                               >>             Output                <<

            *                   
         *  *  *                
      *  *  *  *  *             
    *  *  *  *  *  *  *          
  *  *  *  *  *  *  *  *  *       

*/

// Pattern no 8

/*

public class Patterns {

    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("   "); 
            }
            for(int k=0;k<2*n-(2*i+1);k++){
                System.out.print(" * ");
            }
             for(int l=0;l<=i;l++){
                System.out.print("   "); 
            }
            System.out.println();
        }
    } 
}

//                                               >>             Output                <<

    *  *  *  *  *  *  *    
       *  *  *  *  *       
          *  *  *          
             *  

*/

// Pattern no 9

/*
public class Patterns {

    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<4-i+1;j++){
                System.out.print("   "); 
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print(" * ");
            }
            for(int l=0;l<4-i+1;l++){
                System.out.print("   "); 
            }
            System.out.println();
        }
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("   "); 
            }
            for(int k=0;k<2*n-(2*i+1);k++){
                System.out.print(" * ");
            }
             for(int l=0;l<=i;l++){
                System.out.print("   "); 
            }
            System.out.println();
        }

    }
}

//                                               >>             Output                <<

                *                
             *  *  *             
          *  *  *  *  *          
       *  *  *  *  *  *  *       
    *  *  *  *  *  *  *  *  *    
    *  *  *  *  *  *  *  *  *    
       *  *  *  *  *  *  *       
          *  *  *  *  *          
             *  *  *             
                *  

*/

// Pattern no 10

/*

public class Patterns {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i=0;i<=4;i++){
            for(int j=0;j<4-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//                                               >>             Output                <<


* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
*

*/

// Pattern no 11

/*

public class Patterns {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int start=1;
            if (i%2==0) {
                start=1;
            }
            else{
                start=0;
            }
            for(int j=1;j<=i;j++){
              System.out.print(start);
              start=1-start;
            }
            System.out.println();
        }
    }
}

//                                               >>             Output                <<

0
10
010
1010
01010

*/

// pattern no 12

/*

public class Patterns {

    public static void main(String[] args) {
        int space=2*(5-1);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
        
    }
}

//                                               >>             Output                <<

1        1
12      21
123    321
1234  4321
1234554321


*/

// Pattern no 13

/*
public class Patterns {

    public static void main(String[] args) {
        int number=1;
        for(int i = 1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number=number+1;
            }
            System.out.println();
            
        }
    }
}

//                                               >>             Output                <<

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

*/

// Pattern no 14

/*

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i = 0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
    
}

//                                               >>             Output                <<

A
AB
ABC
ABCD
ABCDE

*/


// Pattern no 15

/*

public class Patterns {

    public static void main(String[] args) {
        
        for(int i = 0;i<5;i++){
            for(char j = 'A';j<='A'-i+4;j++){
                System.out.print(j);
            }      
            System.out.println();  
        }
    }
}

//                                               >>             Output                <<

ABCDE
ABCD
ABC
AB
A

*/

// Pattern No 16

/*

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        char alpha = 'A';
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(alpha);
            }
            System.out.println();
            alpha+=1;
        }
        sc.close();
    } 
}

//                                               >>             Output                <<


A
BB
CCC
DDDD
EEEEE

*/

// Pattern no 17

/*
public class Patterns{
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<4-i+1;j++){
                System.out.print("   "); 
            }
            char character='A';
            int breakpoint = (2*i+1) / 2; 
            for(int k=0;k<2*i+1;k++){
                System.out.print(" "+character+" ");
                if(k<=breakpoint) character++;
                else character--;
            }
            for(int l=0;l<4-i+1;l++){
                System.out.print("   "); 
            }
            System.out.println();
        }
    }
}
//                                               >>             Output                <<

                A                
             A  B  C             
          A  B  C  D  C          
       A  B  C  D  E  D  C       
    A  B  C  D  E  F  E  D  C 

*/

// pattern no 18

/*

public class Patterns {
    public static void main(String[] args) {
        for(int i = 0;i<=4;i++){
            for(char ch = (char)('E'- i);ch<='E';ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

//                                               >>             Output                <<

E 
D E 
C D E 
B C D E 
A B C D E 

*/

// Pattern no 19

/*

public class Patterns{
    public static void main(String[] args){
        int space=0;
        for(int i = 0; i<=4;i++){
            for(int j = 0; j<=4-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<=4-i;j++){
                System.out.print("*");
            }
            space=space+2;
            System.out.println();
        }
        int space1=8;
        for(int i = 0; i<=4;i++){
            for(int j = 0; j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=space1;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i;j++){
                System.out.print("*");
            }
            space1=space1-2;
            System.out.println();
        }
    }
}

//                                               >>             Output                <<

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

// Pattern no 20
/*
import java.util.Scanner;

public class Patterns{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        

        for(int i=1;i<=2*n-1;i++){
            int stars=2*n-1;
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //space

            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
*/

// Pattern no 21

/*
import java.util.Scanner;

public class Patterns{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1||j==1||i==n||j==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

//                                               >>             Output             <<

*****
*   *
*   *
*   *
*****

*/