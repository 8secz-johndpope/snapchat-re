package defpackage;

import java.util.Comparator;

/* renamed from: kpj */
public final class kpj implements Comparator<kor> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        kor kor = (kor) obj;
        kor kor2 = (kor) obj2;
        int ordinal = kor.b.mPriority.ordinal();
        int ordinal2 = kor2.b.mPriority.ordinal();
        return ordinal == ordinal2 ? Long.compare(kor.e, kor2.e) : ordinal - ordinal2 > 0 ? 1 : -1;
    }
}
