package defpackage;

import defpackage.brf.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bno */
public final class bno {
    public static final a a = new 1();
    private static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int b = -1;
    public int c = -1;

    /* renamed from: bno$1 */
    static class 1 implements a {
        1() {
        }

        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2);
        }
    }

    private boolean a(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.b = parseInt;
                    this.c = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a() {
        return (this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean a(bqp bqp) {
        for (bqp.a aVar : bqp.a) {
            String str = "iTunSMPB";
            if (aVar instanceof brd) {
                brd brd = (brd) aVar;
                if (str.equals(brd.a) && a(brd.b)) {
                    return true;
                }
            } else if (aVar instanceof brh) {
                brh brh = (brh) aVar;
                if ("com.apple.iTunes".equals(brh.a) && str.equals(brh.b) && a(brh.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
