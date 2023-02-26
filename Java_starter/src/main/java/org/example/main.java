package org.example;

abstract class abstractClass {
    private int x, y, z;

    // 생성자
    public abstractClass() {}

    public void printLocation() {
        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ")");
    }

    // 각 클래스마다 정의될 flyable 함수
    // 따로 기능을 정의해두진 않는다.
    abstract boolean flyable(int z);

    void fly(int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다.");
        this.x = x;     // 입력되는 값으로 좌표를 지정해준다.
        this.y = y;
        if (flyable(z)) {
            this.z = z;
        } else {
            System.out.println("그 높이로는 날 수 없습니다.");
        }

        printLocation();
    }
}


class Pigeon extends abstractClass {

    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}

class Peacock extends abstractClass {

    @Override
    boolean flyable(int z) {
        return false;
    }
}


public class main {
    public static void main(String[] args) {
        abstractClass pigeon = new Pigeon();
        pigeon.fly(1, 1, 5);
        pigeon.fly(1, 1, 1000000);
    }
}