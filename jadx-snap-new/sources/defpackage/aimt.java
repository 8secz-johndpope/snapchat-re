package defpackage;

import java.net.ProtocolException;

/* renamed from: aimt */
public final class aimt {
    public final int a;
    public final String b;
    private aimo c;

    private aimt(aimo aimo, int i, String str) {
        this.c = aimo;
        this.a = i;
        this.b = str;
    }

    public static aimt a(String str) {
        aimo aimo;
        int i = 9;
        String str2 = "Unexpected status line: ";
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(str2.concat(String.valueOf(str)));
            }
            int charAt = str.charAt(7) - 48;
            if (charAt == 0) {
                aimo = aimo.HTTP_1_0;
            } else if (charAt == 1) {
                aimo = aimo.HTTP_1_1;
            } else {
                throw new ProtocolException(str2.concat(String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            aimo = aimo.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException(str2.concat(String.valueOf(str)));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str = "";
                } else if (str.charAt(i2) == ' ') {
                    str = str.substring(i + 4);
                } else {
                    throw new ProtocolException(str2.concat(String.valueOf(str)));
                }
                return new aimt(aimo, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(str2.concat(String.valueOf(str)));
            }
        }
        throw new ProtocolException(str2.concat(String.valueOf(str)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c == aimo.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        stringBuilder.append(' ');
        stringBuilder.append(this.a);
        if (this.b != null) {
            stringBuilder.append(' ');
            stringBuilder.append(this.b);
        }
        return stringBuilder.toString();
    }
}
