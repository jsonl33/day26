package abs;

abstract class Abs01 {
    abstract void m01();

    void m02() {
        System.out.println("일반 메서드 m02");
    }
}

class SubClass03 extends Abs01 {
    @Override
    void m01() {
        System.out.println("추상메서드를 오버라이딩한 m01() 메서드");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Abs01 abs;
        abs = new SubClass03();
        abs.m01();
        abs.m02();
    }
}