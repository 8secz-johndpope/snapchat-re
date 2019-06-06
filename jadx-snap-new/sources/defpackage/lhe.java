package defpackage;

import java.util.Comparator;

/* renamed from: lhe */
public final class lhe {
    static final Comparator<aenr> a = a.a;

    /* renamed from: lhe$a */
    static final class a<T> implements Comparator<aenr> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            aenr aenr = (aenr) obj;
            Integer num = ((aenr) obj2).j;
            int i = 0;
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = aenr.j;
            if (num2 != null) {
                i = num2.intValue();
            }
            return Integer.compare(intValue, i);
        }
    }
}
