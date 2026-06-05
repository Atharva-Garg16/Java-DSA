package Basics;
public class string {
    public static void main(String[] args) {
        String str="Atharva";
        String str1="Atharva";
        String str3=new String("Atharva");
        System.out.println(str==str1);
        System.out.println(str==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str));
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String s4="    ";
        System.out.println(s4.isEmpty());
        System.out.println(s4.isBlank());
        String b="   Ayyappa   ";
        System.out.println(b.trim());
        System.out.println(b.contains("yyapp"));
        System.out.println(b.substring(3,7));
        int k=1234;
        String s5=String.valueOf(k);
        System.out.println(str.startsWith("Ath"));
        System.out.println(str.endsWith("Ath"));
        str1=str1.replace("rva","bak");
        System.out.println(str1);
        System.out.println(str.toCharArray());
        String p1="love is my form";
        String[] st=new String[p1.split(" ").length];
        st=p1.split(" ");
        for (String s : st) {
            System.out.println(s);
        }
    }
}