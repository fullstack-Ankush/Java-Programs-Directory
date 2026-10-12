
package Assignment2;

/**
 * solution2
 */
public class solution2 {
    public static void main(){
        //1 . print unit digit of a program
        int x = 35;
        int result = x%10;
        System.out.println(result);

        // 2. print a number without its   last digit 
        int y = 123;
        result = y/10;     
        System.out.println(result);

        //3. swap two numbers without using third variable
        int a = 5;
        int b = 10;

        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10
        System.out.println("After swapping: a = " + a + ", b = " + b);

        //4. swap two number using third variables
        int temp;
        a = 20;
        b = 30;
        temp = a;
        a = b ; 
        b = temp;
        System.err.println("a:"+a+"b:"+b);

        //5 . I Don't know 
        // 6. float x = 3.4; --> Don't use float instead use double that store floating number

        // 7. what is the result of 35&83; ==> 3

        System.err.println(35&83);

        // 8. what is the result of 47 | 29 ==> 63
        System.err.println(47 | 29);

        // 9. What is the result of 76 ^ 108 ==> 32
        System.err.println(76 ^ 108);

        // 10 .rotate the digits by one through right
        int z = 134; // we need to convert into 143
        temp = z;
        x = temp%10;
        temp = z/10;
        y = temp%10;
        temp = temp/10;
        temp = temp*100 + x*10 +  y;
        System.err.println(temp);



    }
    
}