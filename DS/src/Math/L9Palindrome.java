package Math;

import java.util.Scanner;

public class L9Palindrome {
    public static boolean isPalindrome(int x) {
        int rev=0; int y=x;
        if(x<0) return false;
        else{
            while(y!=0){
                rev=rev*10+y%10;
                y/=10;
            }
            return (rev==x);
        }}
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n) ? "palindrome" : "not palindrome");
    }
}
