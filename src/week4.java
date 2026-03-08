import java.util.Scanner;

public class week4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int count=0;
        while (n>0){
            n/=3;
            count+=n;
        }
        System.out.println(count);
        scanner.close();
    }
}
