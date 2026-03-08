import java.util.Scanner;

public class week2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-->0){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int result = (A%100+B%100)%100;
            System.out.println(result);
        }
        scanner.close();
    }
}
