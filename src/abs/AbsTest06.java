package abs;

import com.naver.model01.ShapeClass;
import com.naver.model02.Circ;
import com.naver.model02.Rect;
import com.naver.model02.Tria;

public class AbsTest06 {
    static void income(ShapeClass ref) {
        ref.draw();
    }

    static void income2(Circ c) {
        c.draw();
    }

    static void income2(Rect r) {
        r.draw();
    }

    static void income2(Tria t) {
        t.draw();
    }

    public static void main(String[] args) {
        ShapeClass[] arr = new ShapeClass[3];
        arr[0] = new Circ();
        arr[1] = new Rect();
        arr[2] = new Tria();

        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }
        System.out.println("\n================================");
        Circ c = new Circ();
        Rect r = new Rect();
        Tria t = new Tria();
        income(c);
        income(r);
        income(t);
        System.out.println("\n================================");
        income2(new Circ());
        income2(new Rect());
        income(new Tria());
    }
}
