/*Write a Java program that takes a number as input and prints its multiplication table upto 10*/
import java.util.Scanner ;
public class TimeTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter a number");
        int number = in.nextInt();

        for(int i =1 ; i<=10 ; i++)
            System.out.println(number + " * " + i + " = " + (number*i) );
    }
}