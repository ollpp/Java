package org.example;

public class loop {

    public static void main(String[] args) {

        int sum = 1;

        for(int i=0;i<10;i++) {
            sum += i;
        }

        System.out.println("for 문 : " + sum);

        // 배열 생성
        String[] days = {"Mon", "Tue", "Wed", "Thur"};

        for (String day:days) {
            System.out.println("for-each 문 : " + day);
        }


        // while 문
        int i = 0;
        int sumWhile = 0;
        while (i<10) {
            sumWhile += i;
            i += 1;
        }

        System.out.println("while 문 : " + sumWhile);
    }

}
