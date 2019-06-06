package defpackage;

import android.util.Pair;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: abpy */
public final class abpy implements abqa {
    private final List<Pair<Integer, Integer>> a;
    private final Comparator<Pair<Integer, Integer>> b;

    /* renamed from: abpy$a */
    static class a {
        static final abpy a = new abpy();
    }

    /* renamed from: abpy$1 */
    class 1 implements Comparator<Pair<Integer, Integer>> {
        1() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Pair pair = (Pair) obj;
            Pair pair2 = (Pair) obj2;
            if (!(abpy.a(pair, pair2) || abpy.a(pair2, pair))) {
                if (((Integer) pair.first).intValue() > ((Integer) pair2.first).intValue()) {
                    return 1;
                }
                if (((Integer) pair.first).intValue() < ((Integer) pair2.first).intValue()) {
                    return -1;
                }
            }
            return 0;
        }
    }

    private abpy() {
        this.b = new 1();
        this.a = abqb.a;
    }

    /* synthetic */ abpy(byte b) {
        this();
    }

    static /* synthetic */ boolean a(Pair pair, Pair pair2) {
        return ((Integer) pair.second).intValue() == -1 && ((Integer) pair.first).intValue() >= ((Integer) pair2.first).intValue() && ((Integer) pair.first).intValue() <= ((Integer) pair2.second).intValue();
    }

    public final boolean a(int i) {
        return i < 8252 ? i == 169 || i == 174 : Collections.binarySearch(this.a, new Pair(Integer.valueOf(i), Integer.valueOf(-1)), this.b) >= 0;
    }
}
