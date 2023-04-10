package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class letterCobination {
    public static void main(String[] args) {
    String[] phoneNumbers = {"2", "3", "4", "5", "6", "7", "8", "9"};
        String [] phoneAlphabets = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ArrayList<String> possibleCombination = new ArrayList<>();
        ArrayList<String> possibleCombination2 = new ArrayList<>();
    String numb = "";
          String[] newNumb =  numb.split("");
             for (int i = 0; i < newNumb.length; i++) {
                 if(Objects.equals(newNumb[i], "1")
                         || Objects.equals(newNumb[i], "") || Objects.equals(newNumb[i], "0"))
                 {break;}

                 else {int n = Integer.parseInt(newNumb[i]) - 2;
                 possibleCombination.add(phoneAlphabets[n]);}}

                 if(possibleCombination.size() >1){
        int count = 0 ;
        while (count < possibleCombination.get(1).length()){
        for (int j = 0; j < possibleCombination.get(0).length(); j++) {
            possibleCombination2.add(possibleCombination.get(0).charAt(j) + "" + possibleCombination.get(1).charAt(count));
            }count++;

        }}else {
                     for (int j = 0; j < possibleCombination.get(0).length(); j++) {
                     possibleCombination2.add(String.valueOf(possibleCombination.get(0).charAt(j)));
                 }}

        System.out.println(possibleCombination2);  }}















