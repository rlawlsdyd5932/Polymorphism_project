package com.ohgiraffers.polymorphism;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        SmartPhone smartPhone1=new Apple();
        SmartPhone smartPhone2=new Samsung();


        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("========== 휴대폰의 기능 ===========");
            System.out.println("1. Apple");
            System.out.println("2. Samsung");
            System.out.println("3. 이전으로");
            System.out.println("4. 프로그램 종료");
            System.out.print("휴대폰을 선택해주세요 : ");
            int no=sc.nextInt();

            switch (no) {

                case 1 : smartPhone1.startUp(); break;
                case 2 : smartPhone2.startUp(); break;
                case 3 :
                    System.out.println("이전으로 돌아갑니다.");break;
                case 4 :
                    System.out.println("프로그램을 종료합니다."); break;
                default :
                    System.out.println("잘못된 번호를 선택하셨습니다."); break;
            }

            if (no == 4) {
                break;
            }

        }
    }
}

