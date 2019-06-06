package defpackage;

import java.io.PrintWriter;

/* renamed from: jj */
public final class jj {
    private static final Object a = new Object();
    private static char[] b = new char[24];

    private static int a(char[] cArr, int i, char c, int i2, boolean z) {
        if (!z && i <= 0) {
            return i2;
        }
        int i3;
        if (i > 99) {
            int i4 = i / 100;
            cArr[i2] = (char) (i4 + 48);
            i3 = i2 + 1;
            i -= i4 * 100;
        } else {
            i3 = i2;
        }
        if (i > 9 || i2 != i3) {
            i2 = i / 10;
            cArr[i3] = (char) (i2 + 48);
            i3++;
            i -= i2 * 10;
        }
        cArr[i3] = (char) (i + 48);
        i3++;
        cArr[i3] = c;
        return i3 + 1;
    }

    public static void a(long j, PrintWriter printWriter) {
        synchronized (a) {
            if (b.length < 0) {
                b = new char[0];
            }
            char[] cArr = b;
            int i = 1;
            if (j == 0) {
                cArr[0] = '0';
            } else {
                char c;
                int i2;
                int i3;
                int i4;
                if (j > 0) {
                    c = '+';
                } else {
                    c = '-';
                    j = -j;
                }
                int i5 = (int) (j % 1000);
                int floor = (int) Math.floor((double) (j / 1000));
                if (floor > 86400) {
                    i2 = floor / 86400;
                    floor -= 86400 * i2;
                } else {
                    i2 = 0;
                }
                if (floor > 3600) {
                    i3 = floor / 3600;
                    floor -= i3 * 3600;
                } else {
                    i3 = 0;
                }
                if (floor > 60) {
                    i4 = floor / 60;
                    floor -= i4 * 60;
                } else {
                    i4 = 0;
                }
                cArr[0] = c;
                int a = jj.a(cArr, i2, 'd', 1, false);
                i3 = jj.a(cArr, i3, 'h', a, a != 1);
                i3 = jj.a(cArr, i4, 'm', i3, i3 != 1);
                floor = jj.a(cArr, i5, 'm', jj.a(cArr, floor, 's', i3, i3 != 1), true);
                cArr[floor] = 's';
                i = 1 + floor;
            }
            printWriter.print(new String(b, 0, i));
        }
    }
}
