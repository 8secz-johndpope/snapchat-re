package defpackage;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: akmy */
public final class akmy implements Serializable {
    private static final ConcurrentMap<g, String> f = new ConcurrentHashMap(7);
    final String a;
    final TimeZone b;
    final Locale c;
    public transient int d;
    private transient d[] e;

    /* renamed from: akmy$d */
    interface d {
        int a();

        void a(StringBuffer stringBuffer, Calendar calendar);
    }

    /* renamed from: akmy$g */
    static class g {
        private final TimeZone a;
        private final int b;
        private final Locale c;

        g(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.a = timeZone;
            if (z) {
                this.b = Integer.MIN_VALUE | i;
            } else {
                this.b = i;
            }
            this.c = locale;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.a.equals(gVar.a) && this.b == gVar.b && this.c.equals(gVar.c);
            }
        }

        public final int hashCode() {
            return (((this.b * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
        }
    }

    /* renamed from: akmy$a */
    static class a implements d {
        private final char a;

        a(char c) {
            this.a = c;
        }

        public final int a() {
            return 1;
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.a);
        }
    }

    /* renamed from: akmy$b */
    interface b extends d {
        void a(StringBuffer stringBuffer, int i);
    }

    /* renamed from: akmy$e */
    static class e implements d {
        private final String a;

        e(String str) {
            this.a = str;
        }

        public final int a() {
            return this.a.length();
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.a);
        }
    }

    /* renamed from: akmy$f */
    static class f implements d {
        private final int a;
        private final String[] b;

        f(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }

        public final int a() {
            int length = this.b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.b[calendar.get(this.a)]);
        }
    }

    /* renamed from: akmy$h */
    static class h implements d {
        private final Locale a;
        private final int b;
        private final String c;
        private final String d;

        h(TimeZone timeZone, Locale locale, int i) {
            this.a = locale;
            this.b = i;
            this.c = akmy.a(timeZone, false, i, locale);
            this.d = akmy.a(timeZone, true, i, locale);
        }

        public final int a() {
            return Math.max(this.c.length(), this.d.length());
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            TimeZone timeZone = calendar.getTimeZone();
            boolean z = timeZone.useDaylightTime() && calendar.get(16) != 0;
            stringBuffer.append(akmy.a(timeZone, z, this.b, this.a));
        }
    }

    /* renamed from: akmy$i */
    static class i implements d {
        static final i a = new i(true);
        static final i b = new i(false);
        private boolean c;

        private i(boolean z) {
            this.c = z;
        }

        public final int a() {
            return 5;
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                stringBuffer.append('-');
                i = -i;
            } else {
                stringBuffer.append('+');
            }
            int i2 = i / TelemetryConstants.ONE_HOUR_IN_MS;
            stringBuffer.append((char) ((i2 / 10) + 48));
            stringBuffer.append((char) ((i2 % 10) + 48));
            if (this.c) {
                stringBuffer.append(':');
            }
            i = (i / 60000) - (i2 * 60);
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }
    }

    /* renamed from: akmy$c */
    static class c implements b {
        private final int a;
        private final int b;

        c(int i, int i2) {
            if (i2 >= 3) {
                this.a = i;
                this.b = i2;
                return;
            }
            throw new IllegalArgumentException();
        }

        public final int a() {
            return 4;
        }

        public final void a(StringBuffer stringBuffer, int i) {
            int i2;
            if (i < 100) {
                i2 = this.b;
                while (true) {
                    i2--;
                    if (i2 >= 2) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append((char) ((i / 10) + 48));
                        stringBuffer.append((char) ((i % 10) + 48));
                        return;
                    }
                }
            }
            if (i < MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL) {
                i2 = 3;
            } else {
                akma.a(i >= 0, "Negative values should not be possible", (long) i);
                i2 = Integer.toString(i).length();
            }
            int i3 = this.b;
            while (true) {
                i3--;
                if (i3 >= i2) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append(Integer.toString(i));
                    return;
                }
            }
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(this.a));
        }
    }

    /* renamed from: akmy$j */
    static class j implements b {
        private final b a;

        j(b bVar) {
            this.a = bVar;
        }

        public final int a() {
            return this.a.a();
        }

        public final void a(StringBuffer stringBuffer, int i) {
            this.a.a(stringBuffer, i);
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            int i = calendar.get(10);
            if (i == 0) {
                i = calendar.getLeastMaximum(10) + 1;
            }
            this.a.a(stringBuffer, i);
        }
    }

    /* renamed from: akmy$k */
    static class k implements b {
        private final b a;

        k(b bVar) {
            this.a = bVar;
        }

        public final int a() {
            return this.a.a();
        }

        public final void a(StringBuffer stringBuffer, int i) {
            this.a.a(stringBuffer, i);
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            int i = calendar.get(11);
            if (i == 0) {
                i = calendar.getMaximum(11) + 1;
            }
            this.a.a(stringBuffer, i);
        }
    }

    /* renamed from: akmy$l */
    static class l implements b {
        static final l a = new l();

        l() {
        }

        public final int a() {
            return 2;
        }

        public final void a(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(2) + 1);
        }
    }

    /* renamed from: akmy$m */
    static class m implements b {
        private final int a;

        m(int i) {
            this.a = i;
        }

        public final int a() {
            return 2;
        }

        public final void a(StringBuffer stringBuffer, int i) {
            if (i < 100) {
                stringBuffer.append((char) ((i / 10) + 48));
                stringBuffer.append((char) ((i % 10) + 48));
                return;
            }
            stringBuffer.append(Integer.toString(i));
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(this.a));
        }
    }

    /* renamed from: akmy$n */
    static class n implements b {
        static final n a = new n();

        n() {
        }

        public final int a() {
            return 2;
        }

        public final void a(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(1) % 100);
        }
    }

    /* renamed from: akmy$o */
    static class o implements b {
        static final o a = new o();

        o() {
        }

        public final int a() {
            return 2;
        }

        public final void a(StringBuffer stringBuffer, int i) {
            if (i >= 10) {
                stringBuffer.append((char) ((i / 10) + 48));
                i %= 10;
            }
            stringBuffer.append((char) (i + 48));
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(2) + 1);
        }
    }

    /* renamed from: akmy$p */
    static class p implements b {
        private final int a;

        p(int i) {
            this.a = i;
        }

        public final int a() {
            return 4;
        }

        public final void a(StringBuffer stringBuffer, int i) {
            if (i < 10) {
                stringBuffer.append((char) (i + 48));
            } else if (i < 100) {
                stringBuffer.append((char) ((i / 10) + 48));
                stringBuffer.append((char) ((i % 10) + 48));
            } else {
                stringBuffer.append(Integer.toString(i));
            }
        }

        public final void a(StringBuffer stringBuffer, Calendar calendar) {
            a(stringBuffer, calendar.get(this.a));
        }
    }

    protected akmy(String str, TimeZone timeZone, Locale locale) {
        this.a = str;
        this.b = timeZone;
        this.c = locale;
        b();
    }

    private static b a(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? new c(i, i2) : new m(i) : new p(i);
    }

    private static String a(String str, int[] iArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            stringBuilder.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                stringBuilder.append(charAt);
                i = i2;
            }
        } else {
            stringBuilder.append('\'');
            int i3 = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 != '\'') {
                    if (i3 == 0 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    stringBuilder.append(charAt2);
                } else {
                    int i4 = i + 1;
                    if (i4 >= length || str.charAt(i4) != '\'') {
                        i3 ^= 1;
                    } else {
                        stringBuilder.append(charAt2);
                        i = i4;
                    }
                }
                i++;
            }
        }
        iArr[0] = i;
        return stringBuilder.toString();
    }

    static String a(TimeZone timeZone, boolean z, int i, Locale locale) {
        g gVar = new g(timeZone, z, i, locale);
        String str = (String) f.get(gVar);
        if (str != null) {
            return str;
        }
        str = timeZone.getDisplayName(z, i, locale);
        String str2 = (String) f.putIfAbsent(gVar, str);
        return str2 != null ? str2 : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x014e A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144 A:{LOOP_END, LOOP:1: B:62:0x0140->B:64:0x0144} */
    /* JADX WARNING: Missing block: B:21:0x007f, code skipped:
            r9 = defpackage.akmy.a(r9, r14);
     */
    private void b() {
        /*
        r16 = this;
        r0 = r16;
        r1 = new java.text.DateFormatSymbols;
        r2 = r0.c;
        r1.<init>(r2);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r1.getEras();
        r4 = r1.getMonths();
        r5 = r1.getShortMonths();
        r6 = r1.getWeekdays();
        r7 = r1.getShortWeekdays();
        r1 = r1.getAmPmStrings();
        r8 = r0.a;
        r8 = r8.length();
        r9 = 1;
        r10 = new int[r9];
        r11 = 0;
        r12 = 0;
    L_0x0031:
        if (r12 >= r8) goto L_0x012e;
    L_0x0033:
        r10[r11] = r12;
        r12 = r0.a;
        r12 = defpackage.akmy.a(r12, r10);
        r13 = r10[r11];
        r14 = r12.length();
        if (r14 == 0) goto L_0x012e;
    L_0x0043:
        r15 = r12.charAt(r11);
        r9 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r11 = 4;
        if (r15 == r9) goto L_0x0114;
    L_0x004c:
        r9 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r15 == r9) goto L_0x00fb;
    L_0x0050:
        r9 = 11;
        switch(r15) {
            case 39: goto L_0x00df;
            case 75: goto L_0x00dc;
            case 77: goto L_0x00c1;
            case 83: goto L_0x00be;
            case 87: goto L_0x00b9;
            case 90: goto L_0x00b0;
            case 97: goto L_0x00a8;
            case 100: goto L_0x00a6;
            case 104: goto L_0x009a;
            case 107: goto L_0x0090;
            case 109: goto L_0x008d;
            case 115: goto L_0x008a;
            case 119: goto L_0x0088;
            default: goto L_0x0055;
        };
    L_0x0055:
        switch(r15) {
            case 68: goto L_0x007e;
            case 69: goto L_0x0072;
            case 70: goto L_0x006f;
            case 71: goto L_0x0068;
            case 72: goto L_0x007f;
            default: goto L_0x0058;
        };
    L_0x0058:
        r1 = new java.lang.IllegalArgumentException;
        r2 = java.lang.String.valueOf(r12);
        r3 = "Illegal pattern component: ";
        r2 = r3.concat(r2);
        r1.<init>(r2);
        throw r1;
    L_0x0068:
        r9 = new akmy$f;
        r11 = 0;
        r9.<init>(r11, r3);
        goto L_0x0083;
    L_0x006f:
        r9 = 8;
        goto L_0x007f;
    L_0x0072:
        r9 = new akmy$f;
        r12 = 7;
        if (r14 >= r11) goto L_0x0079;
    L_0x0077:
        r11 = r7;
        goto L_0x007a;
    L_0x0079:
        r11 = r6;
    L_0x007a:
        r9.<init>(r12, r11);
        goto L_0x0083;
    L_0x007e:
        r9 = 6;
    L_0x007f:
        r9 = defpackage.akmy.a(r9, r14);
    L_0x0083:
        r11 = r9;
    L_0x0084:
        r9 = 1;
        r15 = 0;
        goto L_0x0126;
    L_0x0088:
        r9 = 3;
        goto L_0x007f;
    L_0x008a:
        r9 = 13;
        goto L_0x007f;
    L_0x008d:
        r9 = 12;
        goto L_0x007f;
    L_0x0090:
        r11 = new akmy$k;
        r9 = defpackage.akmy.a(r9, r14);
        r11.<init>(r9);
        goto L_0x0084;
    L_0x009a:
        r9 = new akmy$j;
        r11 = 10;
        r11 = defpackage.akmy.a(r11, r14);
        r9.<init>(r11);
        goto L_0x0083;
    L_0x00a6:
        r9 = 5;
        goto L_0x007f;
    L_0x00a8:
        r9 = new akmy$f;
        r11 = 9;
        r9.<init>(r11, r1);
        goto L_0x0083;
    L_0x00b0:
        r9 = 1;
        if (r14 != r9) goto L_0x00b6;
    L_0x00b3:
        r9 = defpackage.akmy.i.b;
        goto L_0x0083;
    L_0x00b6:
        r9 = defpackage.akmy.i.a;
        goto L_0x0083;
    L_0x00b9:
        r9 = defpackage.akmy.a(r11, r14);
        goto L_0x0083;
    L_0x00be:
        r9 = 14;
        goto L_0x007f;
    L_0x00c1:
        if (r14 < r11) goto L_0x00ca;
    L_0x00c3:
        r9 = new akmy$f;
        r11 = 2;
        r9.<init>(r11, r4);
        goto L_0x0083;
    L_0x00ca:
        r9 = 3;
        r11 = 2;
        if (r14 != r9) goto L_0x00d4;
    L_0x00ce:
        r9 = new akmy$f;
        r9.<init>(r11, r5);
        goto L_0x0083;
    L_0x00d4:
        if (r14 != r11) goto L_0x00d9;
    L_0x00d6:
        r9 = defpackage.akmy.l.a;
        goto L_0x0083;
    L_0x00d9:
        r9 = defpackage.akmy.o.a;
        goto L_0x0083;
    L_0x00dc:
        r9 = 10;
        goto L_0x007f;
    L_0x00df:
        r9 = 1;
        r11 = r12.substring(r9);
        r12 = r11.length();
        if (r12 != r9) goto L_0x00f5;
    L_0x00ea:
        r9 = new akmy$a;
        r12 = 0;
        r11 = r11.charAt(r12);
        r9.<init>(r11);
        goto L_0x0083;
    L_0x00f5:
        r9 = new akmy$e;
        r9.<init>(r11);
        goto L_0x0083;
    L_0x00fb:
        if (r14 < r11) goto L_0x0109;
    L_0x00fd:
        r9 = new akmy$h;
        r11 = r0.b;
        r12 = r0.c;
        r14 = 1;
        r9.<init>(r11, r12, r14);
        goto L_0x0083;
    L_0x0109:
        r9 = new akmy$h;
        r11 = r0.b;
        r12 = r0.c;
        r15 = 0;
        r9.<init>(r11, r12, r15);
        goto L_0x011a;
    L_0x0114:
        r9 = 2;
        r15 = 0;
        if (r14 != r9) goto L_0x011d;
    L_0x0118:
        r9 = defpackage.akmy.n.a;
    L_0x011a:
        r11 = r9;
        r9 = 1;
        goto L_0x0126;
    L_0x011d:
        if (r14 >= r11) goto L_0x0120;
    L_0x011f:
        goto L_0x0121;
    L_0x0120:
        r11 = r14;
    L_0x0121:
        r9 = 1;
        r11 = defpackage.akmy.a(r9, r11);
    L_0x0126:
        r2.add(r11);
        r12 = r13 + 1;
        r11 = 0;
        goto L_0x0031;
    L_0x012e:
        r15 = 0;
        r1 = r2.size();
        r1 = new defpackage.akmy.d[r1];
        r1 = r2.toArray(r1);
        r1 = (defpackage.akmy.d[]) r1;
        r0.e = r1;
        r1 = r0.e;
        r1 = r1.length;
    L_0x0140:
        r1 = r1 + -1;
        if (r1 < 0) goto L_0x014e;
    L_0x0144:
        r2 = r0.e;
        r2 = r2[r1];
        r2 = r2.a();
        r15 = r15 + r2;
        goto L_0x0140;
    L_0x014e:
        r0.d = r15;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akmy.b():void");
    }

    public final StringBuffer a(Calendar calendar, StringBuffer stringBuffer) {
        for (d a : this.e) {
            a.a(stringBuffer, calendar);
        }
        return stringBuffer;
    }

    public final StringBuffer a(Date date, StringBuffer stringBuffer) {
        Calendar a = a();
        a.setTime(date);
        return a(a, stringBuffer);
    }

    public final GregorianCalendar a() {
        return new GregorianCalendar(this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akmy)) {
            return false;
        }
        akmy akmy = (akmy) obj;
        return this.a.equals(akmy.a) && this.b.equals(akmy.b) && this.c.equals(akmy.c);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 13)) * 13);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FastDatePrinter[");
        stringBuilder.append(this.a);
        String str = ppy.b;
        stringBuilder.append(str);
        stringBuilder.append(this.c);
        stringBuilder.append(str);
        stringBuilder.append(this.b.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
