import java.util.Scanner;

public class week3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();
        double total=a+b+c;
        double postage=0.0;
        if(a<9.9)postage +=0.99;
        if(b<9.9)postage +=0.99;
        if(c<9.9)postage +=0.99;
        double finelTotal=total+postage;
        System.out.printf("%.2f\n",finelTotal);
        scanner.close();
    }
}
