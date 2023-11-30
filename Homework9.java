import java.io.File;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Homework9 {
    public static void main(String[] args) {
        String id = null;
        boolean idExist;
        boolean success = false;
        Map<String, String> account = new HashMap<String, String>();
        try {
            Scanner read = new Scanner(new File("db.txt"));
            while (read.hasNext()) {
                String user = read.next();
                String passWord = read.next();
                account.put(user, passWord);
            }
        }
        catch (Exception e) { e.printStackTrace(); }
        Scanner sc = new Scanner(System.in);
        while(!success) {
            idExist = false;
            while(!idExist) {
                System.out.println("id와 password를 입력해주세요.");
                System.out.print("id : ");
                id = sc.next();
                id = id.trim();
                if (account.containsKey(id))
                    idExist = true;
                else
                    System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
            System.out.print("password : ");
            String pw = sc.next();
            pw = pw.trim();
            if(account.get(id).equals(pw)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                success = true;
            }
            else
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
        }
    }
}
