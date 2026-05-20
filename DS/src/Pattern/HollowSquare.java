package Pattern;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i= sc.nextInt();
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                if(j==0 || k==0 || j==i-1 || k==i-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
