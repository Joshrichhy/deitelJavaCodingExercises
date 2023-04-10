package LeetCode;

import Assignment.NokiaE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainclass {
    public static String[] possibleCodes(String morsecode) {
        List<String> codes = new ArrayList<>();
        for (int i = 0; i < morsecode.length(); i++) {
        if (i + 1 < morsecode.length() && morsecode.charAt(i) == '.' && morsecode.charAt(i + 1) == '.') {
            String newCode = morsecode.substring(0, i) + "--" + morsecode.substring(i + 2);
            codes.add(newCode);
        }
    }
        return codes.toArray(new String[codes.size()]);
}

    public static void main(String[] args) {
        String morsecode = "....";
//        String[] possibleCodes = possibleCodes(morsecode);
//        for (String code : possibleCodes) {
//            System.out.println(code);
//        }



    }
}


