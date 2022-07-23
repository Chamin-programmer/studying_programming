mport java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] yoso = new String[4];
        StringBuilder sb = new StringBuilder();
      
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "つ目要素を4つ入力してください > ");
            yoso[i] = input.next();
        }

        if (yoso[0].equals(yoso[1])){
            for (int i = 0; i < 4; i++) {
                yoso[1]="";
                sb.append(yoso[i]);
                System.out.println("length = " + sb.length());
                System.out.println("count = " + yoso.length);
                System.out.println("joined = " + yoso[0] + "," + yoso[1] + "," + yoso[2] + "," + yoso[3]);
            }
        }
        else if (yoso[2].equals(yoso[3])){
             for (int i = 0; i < 4; i++) {
                yoso[3]="";
                sb.append(yoso[i]);
                System.out.println("length = " + sb.length());
                System.out.println("count = " + yoso.length);
                System.out.println("joined = " + yoso[0] + "," + yoso[1] + "," + yoso[2] + "," + yoso[3]);
            }
        }
        else if (yoso[0].equals(yoso[2])){
             for (int i = 0; i < 4; i++) {
                yoso[2]="";
                sb.append(yoso[i]);
                System.out.println("length = " + sb.length());

                System.out.println("joined = " + yoso[0] + "," + yoso[1] + "," + yoso[2] + "," + yoso[3]);
               if (yoso[2]==""){
                 continue;
               }
               System.out.println("count = " + yoso.length);
            }
        }
        else if (yoso[1].equals(yoso[3])){
             for (int i = 0; i < 4; i++) {
                yoso[3]="";
                sb.append(yoso[i]);
                System.out.println("length = " + sb.length());

                System.out.println("count = " + yoso.length);
                System.out.println("joined = " + yoso[0] + "," + yoso[1] + "," + yoso[2] + "," + yoso[3]);
            }
          
        }
        else if (yoso[1].equals(yoso[2])){
            for (int i = 0; i < 4; i++) {
                yoso[2]=""; 
                sb.append(yoso[i]);
                System.out.println("length = " + sb.length());

                System.out.println("count = " + yoso.length);
                System.out.println("joined = " + yoso[0] + "," + yoso[1] + "," + yoso[2] + "," + yoso[3]);
            }
        } else {
            for (int i = 0; i < 4; i++) {
                sb.append(yoso[i]);
                System.out.println("length = " + sb.length());
                System.out.println("count = " + yoso.length);
                System.out.println("joined = " + yoso[0] + "," + yoso[1] + "," + yoso[2] + "," + yoso[3]);
            }
        }
        input.close();
    }
}
