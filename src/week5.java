import java.util.Scanner;

public class week5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String name= scanner.nextLine();
            int value=0;
            for (char c:name.toCharArray()){
                if(c>='a'&&c<='z'){
                    value+=c-'a'+1;
                }
            }
            System.out.println(value);
        }
        scanner.close();
    }
}
