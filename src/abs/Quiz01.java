package abs;

abstract class Abs1 {
    int a = 10;
    String str = "Test";

    public abstract int getA();

    public String getStr() {
        return str;
    }
}

abstract class Abs2 extends Abs1 {
    int b = 100;

    public abstract int getB();
}

class AbsMain extends Abs2 {
    @Override
    public int getA() {
        int a = super.a;
        return a;
    }

    @Override
    public int getB() {
        int b = super.b;
        return b;
    }
}

public class Quiz01 {
    public static void main(String[] args) {
        AbsMain am = new AbsMain();
        System.out.println(am.getA());
        System.out.println(am.getB());
    }
}
