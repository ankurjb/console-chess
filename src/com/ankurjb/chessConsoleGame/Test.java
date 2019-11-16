package com.ankurjb.chessConsoleGame;

public class Test {

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
        String[][] stringArr={{"R","K","B","Q","K","B","K","R"},{"P","P","P","P","P","P","P","P"},
                {"0","1","0","1","0","1","0","1"},{"1","0","1","0","1","0","1","0"},
                {"0","1","0","1","0","1","0","1"},{"1","0","1","0","1","0","1","0"},
                {"P","P","P","P","P","P","P","P"}, {"R","K","B","Q","K","B","K","R"}};
        System.out.print(PURPLE);
        System.out.println("   A B C D E F G H");
        System.out.println("   ----------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(PURPLE);
            System.out.print(i+1+" |");
            if (i<2)
                System.out.print(RED);
            for (int j = 0; j < 8; j++) {
                if(i>=2)
                    System.out.print(BLACK);
                if (i>=6)
                    System.out.print(GREEN);
                System.out.print(stringArr[i][j]+" ");
            }
            System.out.print(PURPLE);
            System.out.print("|"+(i+1));
            System.out.println();
        }
        System.out.println("   ----------------");
        System.out.println("   A B C D E F G H");
    }
    private static void boardPrint(char loc1,int loc2){
        System.out.println("   A B C D E F G H");
        System.out.println("   ----------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(i+1+" |");
            for (int j = 0; j < 8; j++) {
                System.out.print(((i+j)%2)+" ");
            }
            System.out.print("|"+(i+1));
            System.out.println();
        }
        System.out.println("   ----------------");
        System.out.println("   A B C D E F G H");
    }
    private static void defBoard(){
        String rook="R";
        String knight="K";
    }
}
