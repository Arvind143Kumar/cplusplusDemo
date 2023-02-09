import java.util.Arrays;
import java.util.Scanner;
public class Array{
    public static void main(String [] args){
        int [] arr = new int[] {1,2,3,4,5,6};
        for(int i = 0;  i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("n is : " + n);

    }
}