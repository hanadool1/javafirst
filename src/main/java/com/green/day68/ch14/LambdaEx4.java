package com.green.day68.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 10);
        }
        for (Integer val : list) {
            System.out.println(val);
        }

        System.out.println("------------");

        list.forEach(new MyConsumer<Integer>());
        // <T>의 리턴타입이 Integer로 결정됨
        // 케이스 1)

        System.out.println("------------");

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("MyConsumer(2) : " + o);
            }
        });
        // 케이스 2) 익명클래스

        System.out.println("------------");

        list.forEach(i -> System.out.println("MyConsumer(3) : " + i));
        // 케이스 3) 람다식

        System.out.println("------------");

        list.removeIf((i) -> { return i % 2 == 0; });
        // removeIf는 반환 타입이 boolean임 (true / false)
        // removeIf는 Predicate라는 추상메소드를 implements한 메소드의 주소값을 반환해야함
        // 중괄호 생략 시 return이 자동으로 붙음.
        // 중괄호 사용 시 return, ;(세미콜론) 작성해야함
        // void 메소드인 경우 한 줄 일때 중괄호 생략 가능
        // return 메소드인 경우 한 줄 일때 자동으로 return이 들어감

        System.out.println(list);

        /* 파괴메소드임  > 원본은 건들기 때문에 한개는 주석 처리(위의 것과 같음)
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
        });
        */

        list.removeIf(v -> v % 2 == 0);
        System.out.println(list);
        list.replaceAll( (v) -> {
            return (v <= 15? v * 2: v);});
        System.out.println(list);

        System.out.println("------------");

        Map<String,String> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("age", "23");
        map.put("height", "172cm");
        map.forEach( (k,v) -> {
            System.out.printf("%s: %s\n", k, v);
        });

    }
}

class MyConsumer<T> implements Consumer<T>{
    // 객체화될 때 리턴타입이 결정됨. 유연한 프로그래밍이 가능해짐
    @Override
    public void accept(T o) {
        System.out.println("MyConsumer(1) : " + o);
    }
}