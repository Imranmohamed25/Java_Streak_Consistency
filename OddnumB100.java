package For_loop;
//Write a program to print all odd number between 1 to 100
public class OddnumB100 {
    public static void main(String[] args){
        for(int i = 1; i < 100; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
