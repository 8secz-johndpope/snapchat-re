package defpackage;

import java.net.ProtocolException;

/* renamed from: akiy */
public final class akiy {
    public final akhr a;
    public final int b;
    public final String c;

    private akiy(akhr akhr, int i, String str) {
        this.a = akhr;
        this.b = i;
        this.c = str;
    }

    public static akiy a(String str) {
        akhr akhr;
        int i = 9;
        String str2 = "Unexpected status line: ";
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(str2.concat(String.valueOf(str)));
            }
            int charAt = str.charAt(7) - 48;
            if (charAt == 0) {
                akhr = akhr.HTTP_1_0;
            } else if (charAt == 1) {
                akhr = akhr.HTTP_1_1;
            } else {
                throw new ProtocolException(str2.concat(String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            akhr = akhr.HTTP_1_0;
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
                return new akiy(akhr, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(str2.concat(String.valueOf(str)));
            }
        }
        throw new ProtocolException(str2.concat(String.valueOf(str)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a == akhr.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        stringBuilder.append(' ');
        stringBuilder.append(this.b);
        if (this.c != null) {
            stringBuilder.append(' ');
            stringBuilder.append(this.c);
        }
        return stringBuilder.toString();
    }
}
