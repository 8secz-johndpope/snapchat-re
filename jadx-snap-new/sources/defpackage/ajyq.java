package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: ajyq */
public class ajyq extends ajyp {
    public static final <T> void a(List<T> list, Comparator<? super T> comparator) {
        akcr.b(list, "receiver$0");
        akcr.b(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static final <T extends Comparable<? super T>> void c(List<T> list) {
        akcr.b(list, "receiver$0");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
