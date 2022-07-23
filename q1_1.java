import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class q1_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("入れる要素の数を入力してください > ");
        int con = scanner.nextInt();

        String[] yoso = new String[con];
        StringBuffer list = new StringBuffer();
        List<String> copyList = new ArrayList<>();
        // スキャンでリストに追加
        for (int i = 0; i < con; i++) {
            System.out.print((i + 1) + "つ目要素を入力してください > ");
            yoso[i] = input.next();
        }

        // 引数の個数表示
        for (int i = 0; i < con; i++) {
            num = yoso[i].length();
            System.out.println((i + 1) + "つ目の文字列の個数は:" + num);
        }

        // リストの中身が同じか確認
        for (int i = 0; i < con; i++) {
            for (int t = 0; t < con; t++) {

                if (i == t) {
                    continue;
                }

                if (yoso[i].equals(yoso[t])) {
                    yoso[t] = ""; // 要素の削除
                }
            }
        }
        // 連結
        for (int i = 0; i < con; i++){
            list.append(yoso[i]);
        }
        //　文字列をカウントした値をリストに入れる
        for (int i = 0; i < con; i++) {
              copyList.add(yoso[i]);
              copyList.remove("");
        }

        System.out.println("count = " + copyList.size());
        // 連結後の文字数をnum へ
        num = list.length();
        System.out.println("length = " + num);
        System.out.print("joined = ");
        // 文字を表示
        for (int i = 0; i < con; i++) {
            if (yoso[i].equals("")) {
                continue;
            }
            System.out.print(yoso[i]);
            if (i == (con - 1)) {
                break;
            }
            System.out.print(",");
        }
        System.out.print("\n");

        input.close();
        scanner.close();
    }
}
