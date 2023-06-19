package javaClass;

abstract class Abs02 {
    abstract void m01();

    void m02() {
        System.out.println("일반메서드 m02()");
    }
}

abstract class MiddleClass extends Abs02 {
    void m03() {
        System.out.println("일반메서드 m03()");
    }
}

class Subclass04 extends MiddleClass {
    @Override
    void m01() {
        System.out.println("부모의 추상메서드를 오버라이딩한 m01() 메서드");
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Subclass04 s = new Subclass04();
        s.m01();
        s.m02();
        s.m03();
    }
}