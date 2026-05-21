package Pattern;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print("   ");
            }
            System.out.print(" * ");
                for (int j = 0; j <2*i-1 ; j++) {
                    System.out.print("   ");
                }
                if(i!=0){
                    System.out.print(" * ");
                }
            System.out.println();
        }

        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("   ");
            }
            System.out.print(" * ");
            if(i!=n-2){
                for (int j = 1; j <2*(n-i)-4 ; j++) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
