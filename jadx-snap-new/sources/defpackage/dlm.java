package defpackage;

import java.util.Comparator;

/* renamed from: dlm */
public final class dlm {
    public static final a d = new a();
    final String a;
    final dla b;
    final long c;
    private final String e;
    private final ygk f;
    private final int g;
    private final long h;

    /* renamed from: dlm$a */
    public static final class a implements Comparator<dlm> {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            dlm dlm = (dlm) obj;
            dlm dlm2 = (dlm) obj2;
            akcr.b(dlm, "a");
            akcr.b(dlm2, "b");
            int compare = Integer.compare(dlm.b.ordinal(), dlm2.b.ordinal());
            return compare != 0 ? compare : (dlm.c > dlm2.c ? 1 : (dlm.c == dlm2.c ? 0 : -1));
        }
    }

    public dlm(dla dla, String str, long j, ygk ygk, int i, long j2) {
        akcr.b(dla, "tier");
        akcr.b(str, "queueName");
        akcr.b(ygk, "fileType");
        this.b = dla;
        this.e = str;
        this.c = j;
        this.f = ygk;
        this.g = i;
        this.h = j2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.tierName);
        stringBuilder.append('_');
        stringBuilder.append(this.c);
        stringBuilder.append('_');
        stringBuilder.append(this.e);
        stringBuilder.append('_');
        stringBuilder.append(this.g);
        stringBuilder.append('_');
        stringBuilder.append(this.h);
        stringBuilder.append(this.f.a());
        this.a = stringBuilder.toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FileName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", eventCount=");
        stringBuilder.append(this.g);
        return stringBuilder.toString();
    }
}
