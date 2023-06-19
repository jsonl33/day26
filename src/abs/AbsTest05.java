package abs;

import com.naver.model01.ShapeClass;
import com.naver.model02.Circ;
import com.naver.model02.Rect;
import com.naver.model02.Tria;

public class AbsTest05 {
    public static void main(String[] args) {
        Circ c = new Circ();
        Rect r = new Rect();
        Tria t = new Tria();
        c.draw();
        r.draw();
        t.draw();
        System.out.println("===================================");

        ShapeClass ref;
        ref = new Circ();
        ref.draw();

        ref = new Rect();
        ref.draw();

        ref = new Tria();
        ref.draw();
    }

}
