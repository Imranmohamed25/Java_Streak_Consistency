package For_loop;

import java.util.Scanner;

//Write a program to find sum of all even numbers between 1 to n
public class EvenSumofNatnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
