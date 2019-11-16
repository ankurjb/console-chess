package com.ankurjb.chessConsoleGame;

public class Player1 {
    private static String getKing(String string){
        if (string!=null) {
            String rookP1=String.valueOf(string.charAt(0))+""+String.valueOf(string.charAt(1));
        }
        else {
            return null;
        }
        return "";
    }
    private String members(String string ){
        String rookP1=String.valueOf(0)+","+String.valueOf(0);
        return rookP1;
    }
}
