package TicTacToe;

public class XandOManipulation {
    public static void main(String[] args) {
        char[][] xAndO= {{'O', 'O', 'O'}, {'O', 'O', 'X'}, {'X', 'O', 'O'}};
        printXandO(xAndO);
        replaceXandOWith1and0(xAndO);


    }
    public static void printXandO(char[][] xAndO ){
        for (char [] rows: xAndO) {
            System.out.println(rows);}
    }
    public static void replaceXandOWith1and0(char[][] xAndO ){
        for (char [] rows: xAndO) {
            for (char column: rows) {
                if(column == 'X'){column ='1';}
                else {column = '0'; }
                System.out.print(column);}
            System.out.println();
        }
    }
}
