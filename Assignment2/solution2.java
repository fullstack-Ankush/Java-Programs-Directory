
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
    }
    
}