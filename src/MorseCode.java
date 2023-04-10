import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String a = sc.nextLine();
List <String> output = solution(a);
        Collections.sort(output);
        String result = String.join("\", \"",output);
        result = result.replaceAll("\\s+", "");
        if(result == "") System.out.println("[]");
        else System.out.println(result);
    }
    public static List<String> solution(String morsecode){
        List <String> ans = new ArrayList<>();
        for (int i = 0; i < morsecode.length(); i++) {
            if (i + 1 < morsecode.length() && morsecode.charAt(i) == '.' && morsecode.charAt(i + 1) == '.') {
                String newCode = morsecode.substring(0, i) + "--" + morsecode.substring(i + 2);
                ans.add(newCode);
            }
        }
        return ans;
    }
}
