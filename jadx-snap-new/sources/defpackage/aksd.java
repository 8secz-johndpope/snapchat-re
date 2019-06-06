package defpackage;

import java.io.IOException;
import org.joda.convert.ToString;

/* renamed from: aksd */
public abstract class aksd implements akrv {
    protected aksd() {
    }

    public /* synthetic */ int compareTo(Object obj) {
        akrv akrv = (akrv) obj;
        long a = a();
        long a2 = akrv.a();
        return a < a2 ? -1 : a > a2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akrv)) {
            return false;
        }
        return a() == ((akrv) obj).a();
    }

    public int hashCode() {
        long a = a();
        return (int) (a ^ (a >>> 32));
    }

    @ToString
    public String toString() {
        long a = a();
        Appendable stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        Object obj = a < 0 ? 1 : null;
        int i = (int) a;
        if (((long) i) == a) {
            try {
                akud.a(stringBuffer, i);
            } catch (IOException unused) {
            }
        } else {
            stringBuffer.append(Long.toString(a));
        }
        while (true) {
            int i2 = 3;
            if (stringBuffer.length() >= (obj != null ? 7 : 6)) {
                break;
            }
            if (obj == null) {
                i2 = 2;
            }
            stringBuffer.insert(i2, "0");
        }
        if ((a / 1000) * 1000 == a) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
