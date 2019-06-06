package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aimm */
public final class aimm {
    public final String[] a;

    /* renamed from: aimm$a */
    public static final class a {
        final List<String> a = new ArrayList(20);

        public final a a(String str) {
            int i = 0;
            while (i < this.a.size()) {
                if (str.equalsIgnoreCase((String) this.a.get(i))) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }
    }

    private aimm(a aVar) {
        this.a = (String[]) aVar.a.toArray(new String[aVar.a.size()]);
    }

    /* synthetic */ aimm(a aVar, byte b) {
        this(aVar);
    }

    public final String a(int i) {
        i <<= 1;
        if (i >= 0) {
            String[] strArr = this.a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return null;
    }

    public final String b(int i) {
        i = (i << 1) + 1;
        if (i >= 0) {
            String[] strArr = this.a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(a(i));
            stringBuilder.append(": ");
            stringBuilder.append(b(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
