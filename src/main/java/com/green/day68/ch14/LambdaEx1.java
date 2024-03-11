package com.green.day68.ch14;

@FunctionalInterface // 추상메소드가 오직 하나인 interface
interface MyFunction {
    void run();
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction mf0 = () -> { System.out.println("mf0 - run !!"); }; // 케이스 1) 람다식 작성법
        // 메소드가 하나만 있기 때문에 run이라는 메소드명 쓰지 않아도 됨
        // 파라미터가 1개면 () 생략가능, 파라미터가 0개거나 2개 이상일 때는 소괄호 필수
        // 람다식은 타입을 적지 않아도 됨. 이미 적혀있기 때문에 따른다
        // 명령어가 1개이면 {} 생략가능. 2개 이상 시 중괄호 필수

        MyFunction mf1 = new MyFunction() { // 케이스 2) 짧게 적을 수 있고, 클래스명을 작성하지 않아도 됨
            // MyFunction을 객체화하는 것이 아니고, MyFunction을 implements한 익명 클래스를 객체화한 것
            public void run() {
                System.out.println("mf1 - run");
            }
        };
        MyFunction mf2 = new MyFunctionClass();
    }
}

class MyFunctionClass implements MyFunction { // 케이스 3) 똑같은 내용의 객체를 여러개 만들 때는 유용
    public void run() {
        System.out.println("class name - run !!");
    }
}