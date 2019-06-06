package defpackage;

import org.joda.convert.ToString;

/* renamed from: aksg */
public abstract class aksg implements akry {
    protected aksg() {
    }

    public final int a(akrg akrg) {
        int b = b().b(akrg);
        return b == -1 ? 0 : c(b);
    }

    public final int[] a() {
        int[] iArr = new int[d()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = c(i);
        }
        return iArr;
    }

    public final akrg b(int i) {
        return b().d[i];
    }

    public final int d() {
        return b().d.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akry)) {
            return false;
        }
        akry akry = (akry) obj;
        if (d() != akry.d()) {
            return false;
        }
        int d = d();
        int i = 0;
        while (i < d) {
            if (c(i) != akry.c(i) || b(i) != akry.b(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < d(); i2++) {
            i = (((i * 27) + c(i2)) * 27) + b(i2).hashCode();
        }
        return i;
    }

    @ToString
    public String toString() {
        akuj a = akuf.a();
        if (a.a != null) {
            akum akum = a.a;
            StringBuffer stringBuffer = new StringBuffer(akum.a(this, a.c));
            akum.a(stringBuffer, (akry) this, a.c);
            return stringBuffer.toString();
        }
        throw new UnsupportedOperationException("Printing not supported");
    }
}
