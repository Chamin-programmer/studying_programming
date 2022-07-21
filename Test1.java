import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.print("要素を4つ入力してください > ");
        Scanner input = new Scanner(System.in);
        String[] yoso = new String[4];
        yoso[0] = input.next();
        yoso[1] = input.next();
        yoso[2] = input.next();
        yoso[3] = input.next();
        
        if (yoso[0].equals(yoso[1]) || yoso[2].equals(yoso[3])){
            System.out.println("等しい");
        }
        else if (yoso[0].equals(yoso[2]) || yoso[1].equals(yoso[3])){
          System.out.println("等しい");
        }
        else if (yoso[2].equals(yoso[3]) || yoso[0].equals(yoso[1])){
          System.out.println("等しい");
        }
        else if (yoso[1].equals(yoso[2]) || yoso[0].equals(yoso[3])){
          System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
        input.close();
    }
}
