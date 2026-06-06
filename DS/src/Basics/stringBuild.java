package Basics;

public class stringBuild {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("Swami");
        System.out.println(sb);
        sb.insert(0,"A ");
        System.out.println(sb);
        sb.delete(3,6);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(0,1,"ATHArvA");
        System.out.println(sb);
        String s1=sb.substring(0,3);
        System.out.println(s1);
        String s2=sb.toString();
        System.out.println(s2);
        System.out.println(sb.indexOf("ATH"));
        System.out.println(sb.equals(s2));
        System.out.println(s2.contentEquals(sb));
    }
}
