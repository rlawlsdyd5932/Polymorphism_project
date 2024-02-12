package com.ohgiraffers.polymorphism;

import java.util.Scanner;

public class Apple extends SmartPhone {

    private boolean isOn;

    private boolean set;
    private int number;
    private int speed;


    Scanner sc = new Scanner(System.in);

    @Override
    public void setOn() {
        if (set == false) {
            System.out.println("1.안면인식");
            System.out.println("2.건강 모니터링");
            System.out.println("3.이전으로");
            System.out.println("4.프로그램 종료   ");
            System.out.println("메뉴를 선택해주세요: ");
        }
    }

    @Override
    public void startUp() {
        if (isOn == false) {
            System.out.println("Apple 휴대폰 전원을 켭니다. 안면인식 프로그램을 선택해주세요.");
            setOn();
            this.number = sc.nextInt();
            switch (number) {
                case 1:
                    faceRecognition();
                    break;
                case 2:
                    System.out.println("먼저 안면인식 활성화를 해주세요");
                    startUp();
                    break;
                case 3:
                    System.out.println("이전메뉴로 돌아갑니다.");
                    break;
                case 4:
                    turnOff();
                    break;
                default:
                    System.out.println("다시 선택해 주세요.");
                    break;
            }
        }
    }

    @Override
    public void faceRecognition() {
        if (isOn == false) {
            System.out.println("안면인식이 활성화가 됬습니다. 건강 모니터링을 실행해 주세요.");
            setOn();
            this.number = sc.nextInt();
            switch (number) {
                case 1:
                    faceRecognition();
                    break;
                case 2:
                    healthCareMonitoring();
                    break;
                case 3:
                    System.out.println("이전메뉴로 돌아갑니다.");
                    startUp();
                    break;
                case 4:
                    turnOff();
                    break;
                default:
                    System.out.println("다시 선택해 주세요.");
                    break;

            }
        }
    }


    @Override
    public void healthCareMonitoring() {
        if (isOn == false) {
            this.speed += 10;
            if (speed >= 60 && speed <= 100) {
                System.out.println("건강 모니터링이 활성화 됩니다. 현재 BPM은 " + this.speed + "이므로 정상입니다.");
            } else {
                System.out.println("건강 모니터링이 활성화 됩니다. 현재 BPM은 " + this.speed + "이므로 비정상입니다.");
            }
            setOn();
            this.number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("건강 모니터링이 활성화 되고있습니다. 안면인식은 이전으로 돌아가 주세요 ");
                    healthCareMonitoring();
                    setOn();
                    this.number = sc.nextInt();

                    break;
                case 2:
                    healthCareMonitoring();
                    break;
                case 3:
                    System.out.println("이전메뉴로 돌아갑니다.");
                    startUp();
                    break;
                case 4:
                    turnOff();
                    break;
                default:
                    System.out.println("다시 선택해 주세요.");
                    break;
            }
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            this.number = sc.nextInt();
            switch (number) {
                case 1:
                    faceRecognition();
                    break;
                case 2:
                    return;
                case 3:
                    System.out.println("이전메뉴로 돌아갑니다.");
                    startUp();
                    break;
                case 4:
                    turnOff();
                    break;
                default:
                    System.out.println("다시 선택해 주세요.");
                    break;
            }
        } else {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}


























