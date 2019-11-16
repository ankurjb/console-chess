package com.ankurjb.chessConsoleGame;

import java.util.Scanner;

public class Chess {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1: Rook");
        System.out.println("2: Bishop");
        System.out.println("3: King");
        int choice=scanner.nextInt();
        switch (choice){
            case 1: rook();
                    break;
            case 2: bishop();
                    break;
            case 3: king();
                    break;
            default:
                System.out.println("wrong response");
                break;
        }
        scanner.close();
    }
    private static void rook(){
        System.out.println("enter coordinates");
        System.out.println("enter x: ");
        int x=scanner.nextInt();
        System.out.println("enter y: ");
        int y=scanner.nextInt();
        int i=x;
        int j=y;
        if (i-1>-1)
            System.out.println("UP");
        while(i---1>-1){
            System.out.print("("+i+","+j+")");
        }
        System.out.println();
        if (i+1<8)
            System.out.println("DOWN");
            i=x;
            j=y;
        while(i+++1<8){
            System.out.print("("+i+","+j+")");
        }
        System.out.println();
        i=x;
        j=y;
        if (j+1<8)
            System.out.println("RIGHT");
        while(j+++1<8){
            System.out.print("("+i+","+j+")");
        }
        System.out.println();
        i=x;
        j=y;
        if (j-1>-1)
            System.out.println("LEFT");
        while(j---1>-1){
            System.out.print("("+i+","+j+")");
        }
    }
    private static void bishop(){
        System.out.println("enter coordinates");
        System.out.println("enter x: ");
        int x=scanner.nextInt();
        System.out.println("enter y: ");
        int y=scanner.nextInt();
        int i=x;
        int j=y;
        if((i-1>-1) &&(j-1>-1))
            System.out.println("TOP-LEFT");
        while ((i---1>-1) &&(j---1>-1)){
            System.out.print("("+i+","+j+")");
        }
        i=x;
        j=y;
        System.out.println();
        if((i-1>-1) &&(j+1<8))
            System.out.println("TOP-RIGHT");
        while ((i---1>-1) &&(j+++1<8)){
            System.out.print("("+i+","+j+")");
        }
        i=x;
        j=y;
        System.out.println();
        if((i+1<8) &&(j+1<8))
            System.out.println("BOTTOM-RIGHT");
        while ((i+++1<8) &&(j+++1<8)){
            System.out.print("("+i+","+j+")");
        }
        i=x;
        j=y;
        System.out.println();
        if((i+1<8) &&(j-1<8))
            System.out.println("BOTTOM-LEFT");
        while ((i+++1<8) &&(j---1<8)){
            System.out.print("("+i+","+j+")");
        }

    }
    private static void king(){
        System.out.println("enter coordinates");
        System.out.println("enter x: ");
        int x=scanner.nextInt();
        System.out.println("enter y: ");
        int y=scanner.nextInt();
        int i=x;
        int j=y;
        if((i-1>-1) &&(j-1>-1))
            System.out.println("TOP-LEFT");
        while ((i---1>-1) &&(j---1>-1)){
            System.out.print("("+i+","+j+")");
        }
        i=x;
        j=y;
        System.out.println();
        if((i-1>-1) &&(j+1<8))
            System.out.println("TOP-RIGHT");
        while ((i---1>-1) &&(j+++1<8)){
            System.out.print("("+i+","+j+")");
        }
        i=x;
        j=y;
        System.out.println();
        if((i+1<8) &&(j+1<8))
            System.out.println("BOTTOM-RIGHT");
        while ((i+++1<8) &&(j+++1<8)){
            System.out.print("("+i+","+j+")");
        }
        i=x;
        j=y;
        System.out.println();
        if((i+1<8) &&(j-1<8))
            System.out.println("BOTTOM-LEFT");
        while ((i+++1<8) &&(j---1<8)){
            System.out.print("("+i+","+j+")");
        }

        if (i-1>-1)
            System.out.println("UP");
        while(i---1>-1){
            System.out.print("("+i+","+j+")");
        }
        System.out.println();
        if (i+1<8)
            System.out.println("DOWN");
        i=x;
        j=y;
        while(i+++1<8){
            System.out.print("("+i+","+j+")");
        }
        System.out.println();
        i=x;
        j=y;
        if (j+1<8)
            System.out.println("RIGHT");
        while(j+++1<8){
            System.out.print("("+i+","+j+")");
        }
        System.out.println();
        i=x;
        j=y;
        if (j-1>-1)
            System.out.println("LEFT");
        while(j---1>-1){
            System.out.print("("+i+","+j+")");
        }

    }
}
