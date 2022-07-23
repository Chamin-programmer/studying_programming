import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	List<String> list = new ArrayList<String>();
        try {
            FileWriter file = new FileWriter("output.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));
            for (;;){
                String txt = scanner.next();
		list.add(txt + "\n");
		String error = "￥" + txt;
                if (txt.equals("￥save")){;
                    list.remove(list.get(list.size() - 1));
                    pw.println(list);
                }
                else if (txt.equals("￥quit")){
                    pw.close();
                    break;
                }
		else if (txt.equals("￥")){
	            System.out.println("無効なコマンドです。");
		}
	        else{
		   continue;
		}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
