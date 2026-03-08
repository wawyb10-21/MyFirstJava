import java.util.Scanner;

public class week6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        while(T-->0){
            int n=scanner.nextInt();
            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j||i+j==n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        scanner.close();
    }
}
