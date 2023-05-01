package DSA;

public class DigitCount {
    public static void main(String[] args) {
        String [] letters = {"Ab1396", "Q2RBS", "G381ac"};


    }
    public static int countDigit(String[] letters){
        int count = 0;
        for (String n: letters ) {

            for (int i = 0; i < n.length(); i++) {
                char a =n.charAt(i);
                if(Character.isDigit(a)){count++;} }}
        return count;
    }
}
