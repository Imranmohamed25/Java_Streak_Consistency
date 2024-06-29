package For_loop;// 1. Write a program to print all natural numbers from 1 to n
import java.util.Scanner;
class Natnums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        sc.close();
    }
}