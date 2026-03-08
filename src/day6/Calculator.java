package day6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个整数；");
        int a=scanner.nextInt();
        System.out.println("请输入第二个整数");
        int b= scanner.nextInt();
        int sum=a+b;
        int diff=a-b;
        int product=a*b;
        double quotient=(double)a/b;
        System.out.println(a+"+"+b+"="+sum);
        System.out.println(a+"-"+b+"="+diff);
        System.out.println(a+"*"+b+"="+product);
        System.out.println(a+"/"+b+"="+quotient);
        scanner.close();
    }
}
