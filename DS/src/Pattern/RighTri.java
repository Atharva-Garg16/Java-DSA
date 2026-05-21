package Pattern;

import java.util.Scanner;

public class RighTri {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m= scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
