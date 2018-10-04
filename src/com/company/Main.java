package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.print("Menu\n");
        System.out.print("1.Ve tam giac\n");
        System.out.print("2.Ve hinh vuong\n");
        System.out.print("3.Ve hinh chu nhat\n");
        System.out.print("0.Exit\n");
        System.out.print("nhap vao lua chon cua ban:");
        choice = scanner.nextInt();
        switch(choice){
            case 1: System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("***");
                System.out.println("***");
                System.out.println("***");
                break;
            case 3:
                System.out.println("****");
                System.out.println("****");
            case 0:
                System.exit(0);
            default:
                System.out.println("no choice!");
        }

    }
}
