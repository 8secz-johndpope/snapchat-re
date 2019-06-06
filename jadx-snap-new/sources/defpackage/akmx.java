package defpackage;

import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

/* renamed from: akmx */
public final class akmx implements Serializable {
    private static final c A = new b(14);
    private static Locale i;
    private static final Pattern k = Pattern.compile("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
    private static final ConcurrentMap<Locale, c>[] l = new ConcurrentMap[17];
    private static final c m = new 1();
    private static final c n = new 2();
    private static final c o = new b(1);
    private static final c p = new b(3);
    private static final c q = new b(4);
    private static final c r = new b(6);
    private static final c s = new b(5);
    private static final c t = new b(8);
    private static final c u = new b(11);
    private static final c v = new 3();
    private static final c w = new 4();
    private static final c x = new b(10);
    private static final c y = new b(12);
    private static final c z = new b(13);
    final TimeZone a;
    final Locale b;
    final int c;
    final int d;
    transient Pattern e;
    transient c[] f;
    transient String g;
    transient c h;
    private final String j;

    /* renamed from: akmx$c */
    static abstract class c {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        public void a(akmx akmx, Calendar calendar, String str) {
        }

        /* Access modifiers changed, original: 0000 */
        public boolean a() {
            return false;
        }

        public abstract boolean a(akmx akmx, StringBuilder stringBuilder);
    }

    /* renamed from: akmx$a */
    static class a extends c {
        private final String a;

        a(String str) {
            super();
            this.a = str;
        }

        /* Access modifiers changed, original: final */
        public final boolean a() {
            char charAt = this.a.charAt(0);
            if (charAt == '\'') {
                charAt = this.a.charAt(1);
            }
            return Character.isDigit(charAt);
        }

        /* Access modifiers changed, original: final */
        public final boolean a(akmx akmx, StringBuilder stringBuilder) {
            akmx.a(stringBuilder, this.a, true);
            return false;
        }
    }

    /* renamed from: akmx$b */
    static class b extends c {
        private final int a;

        b(int i) {
            super();
            this.a = i;
        }

        /* Access modifiers changed, original: 0000 */
        public int a(int i) {
            return i;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(akmx akmx, Calendar calendar, String str) {
            calendar.set(this.a, a(Integer.parseInt(str)));
        }

        /* Access modifiers changed, original: final */
        public final boolean a() {
            return true;
        }

        /* Access modifiers changed, original: final */
        public final boolean a(akmx akmx, StringBuilder stringBuilder) {
            String str;
            Object obj = (akmx.h == null || !akmx.h.a()) ? null : 1;
            if (obj != null) {
                stringBuilder.append("(\\p{Nd}{");
                stringBuilder.append(akmx.g.length());
                str = "}+)";
            } else {
                str = "(\\p{Nd}++)";
            }
            stringBuilder.append(str);
            return true;
        }
    }

    /* renamed from: akmx$d */
    static class d extends c {
        private final int a;
        private final Map<String, Integer> b;

        d(int i, Calendar calendar, Locale locale) {
            super();
            this.a = i;
            this.b = calendar.getDisplayNames(i, 0, locale);
        }

        /* Access modifiers changed, original: final */
        public final void a(akmx akmx, Calendar calendar, String str) {
            Integer num = (Integer) this.b.get(str);
            if (num == null) {
                StringBuilder stringBuilder = new StringBuilder(str);
                stringBuilder.append(" not in (");
                for (String str2 : this.b.keySet()) {
                    stringBuilder.append(str2);
                    stringBuilder.append(' ');
                }
                stringBuilder.setCharAt(stringBuilder.length() - 1, ')');
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            calendar.set(this.a, num.intValue());
        }

        /* Access modifiers changed, original: final */
        public final boolean a(akmx akmx, StringBuilder stringBuilder) {
            stringBuilder.append('(');
            for (String a : this.b.keySet()) {
                akmx.a(stringBuilder, a, false).append('|');
            }
            stringBuilder.setCharAt(stringBuilder.length() - 1, ')');
            return true;
        }
    }

    /* renamed from: akmx$e */
    static class e extends c {
        private final String a;
        private final SortedMap<String, TimeZone> b = new TreeMap(String.CASE_INSENSITIVE_ORDER);

        e(Locale locale) {
            super();
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                if (!strArr[0].startsWith("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(strArr[0]);
                    if (!this.b.containsKey(strArr[1])) {
                        this.b.put(strArr[1], timeZone);
                    }
                    if (!this.b.containsKey(strArr[2])) {
                        this.b.put(strArr[2], timeZone);
                    }
                    if (timeZone.useDaylightTime()) {
                        if (!this.b.containsKey(strArr[3])) {
                            this.b.put(strArr[3], timeZone);
                        }
                        if (!this.b.containsKey(strArr[4])) {
                            this.b.put(strArr[4], timeZone);
                        }
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
            for (String a : this.b.keySet()) {
                akmx.a(stringBuilder, a, false).append('|');
            }
            stringBuilder.setCharAt(stringBuilder.length() - 1, ')');
            this.a = stringBuilder.toString();
        }

        /* Access modifiers changed, original: final */
        public final void a(akmx akmx, Calendar calendar, String str) {
            TimeZone timeZone;
            String str2 = "GMT";
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                timeZone = TimeZone.getTimeZone(str2.concat(String.valueOf(str)));
            } else if (str.startsWith(str2)) {
                timeZone = TimeZone.getTimeZone(str);
            } else {
                timeZone = (TimeZone) this.b.get(str);
                if (timeZone == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(" is not a supported timezone name");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            calendar.setTimeZone(timeZone);
        }

        /* Access modifiers changed, original: final */
        public final boolean a(akmx akmx, StringBuilder stringBuilder) {
            stringBuilder.append(this.a);
            return true;
        }
    }

    /* renamed from: akmx$1 */
    static class 1 extends b {
        1() {
            super(1);
        }

        /* Access modifiers changed, original: final */
        public final void a(akmx akmx, Calendar calendar, String str) {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 100) {
                int i = akmx.c + parseInt;
                if (parseInt < akmx.d) {
                    i += 100;
                }
                parseInt = i;
            }
            calendar.set(1, parseInt);
        }
    }

    /* renamed from: akmx$2 */
    static class 2 extends b {
        2() {
            super(2);
        }

        /* Access modifiers changed, original: final */
        public final int a(int i) {
            return i - 1;
        }
    }

    /* renamed from: akmx$3 */
    static class 3 extends b {
        3() {
            super(11);
        }

        /* Access modifiers changed, original: final */
        public final int a(int i) {
            return i % 24;
        }
    }

    /* renamed from: akmx$4 */
    static class 4 extends b {
        4() {
            super(10);
        }

        /* Access modifiers changed, original: final */
        public final int a(int i) {
            return i % 12;
        }
    }

    static {
        String str = "JP";
        i = new Locale("ja", str, str);
    }

    protected akmx(String str, TimeZone timeZone, Locale locale) {
        int i;
        this.j = str;
        this.a = timeZone;
        this.b = locale;
        Calendar instance = Calendar.getInstance(timeZone, locale);
        if (locale.equals(i)) {
            i = 0;
        } else {
            instance.setTime(new Date());
            i = instance.get(1) - 80;
        }
        this.c = (i / 100) * 100;
        this.d = i - this.c;
        a(instance);
    }

    private c a(int i, Calendar calendar) {
        ConcurrentMap a = akmx.a(i);
        c cVar = (c) a.get(this.b);
        if (cVar == null) {
            cVar = i == 15 ? new e(this.b) : new d(i, calendar, this.b);
            c cVar2 = (c) a.putIfAbsent(this.b, cVar);
            if (cVar2 != null) {
                return cVar2;
            }
        }
        return cVar;
    }

    /* JADX WARNING: Missing block: B:47:0x0071, code skipped:
            return new defpackage.akmx.a(r5);
     */
    private defpackage.akmx.c a(java.lang.String r5, java.util.Calendar r6) {
        /*
        r4 = this;
        r0 = 0;
        r1 = r5.charAt(r0);
        r2 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r3 = 2;
        if (r1 == r2) goto L_0x0075;
    L_0x000a:
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r1 == r2) goto L_0x0072;
    L_0x000e:
        switch(r1) {
            case 39: goto L_0x0056;
            case 75: goto L_0x0053;
            case 77: goto L_0x0044;
            case 83: goto L_0x0041;
            case 87: goto L_0x003e;
            case 90: goto L_0x0072;
            case 97: goto L_0x003b;
            case 100: goto L_0x0038;
            case 104: goto L_0x0035;
            case 107: goto L_0x0032;
            case 109: goto L_0x002f;
            case 115: goto L_0x002c;
            case 119: goto L_0x0029;
            default: goto L_0x0011;
        };
    L_0x0011:
        switch(r1) {
            case 68: goto L_0x0026;
            case 69: goto L_0x0020;
            case 70: goto L_0x001d;
            case 71: goto L_0x0018;
            case 72: goto L_0x0015;
            default: goto L_0x0014;
        };
    L_0x0014:
        goto L_0x006c;
    L_0x0015:
        r5 = v;
        return r5;
    L_0x0018:
        r5 = r4.a(r0, r6);
        return r5;
    L_0x001d:
        r5 = t;
        return r5;
    L_0x0020:
        r5 = 7;
    L_0x0021:
        r5 = r4.a(r5, r6);
        return r5;
    L_0x0026:
        r5 = r;
        return r5;
    L_0x0029:
        r5 = p;
        return r5;
    L_0x002c:
        r5 = z;
        return r5;
    L_0x002f:
        r5 = y;
        return r5;
    L_0x0032:
        r5 = u;
        return r5;
    L_0x0035:
        r5 = w;
        return r5;
    L_0x0038:
        r5 = s;
        return r5;
    L_0x003b:
        r5 = 9;
        goto L_0x0021;
    L_0x003e:
        r5 = q;
        return r5;
    L_0x0041:
        r5 = A;
        return r5;
    L_0x0044:
        r5 = r5.length();
        r0 = 3;
        if (r5 < r0) goto L_0x0050;
    L_0x004b:
        r5 = r4.a(r3, r6);
        return r5;
    L_0x0050:
        r5 = n;
        return r5;
    L_0x0053:
        r5 = x;
        return r5;
    L_0x0056:
        r6 = r5.length();
        if (r6 <= r3) goto L_0x006c;
    L_0x005c:
        r6 = new akmx$a;
        r0 = r5.length();
        r1 = 1;
        r0 = r0 - r1;
        r5 = r5.substring(r1, r0);
        r6.<init>(r5);
        return r6;
    L_0x006c:
        r6 = new akmx$a;
        r6.<init>(r5);
        return r6;
    L_0x0072:
        r5 = 15;
        goto L_0x0021;
    L_0x0075:
        r5 = r5.length();
        if (r5 <= r3) goto L_0x007e;
    L_0x007b:
        r5 = o;
        return r5;
    L_0x007e:
        r5 = m;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akmx.a(java.lang.String, java.util.Calendar):akmx$c");
    }

    static /* synthetic */ StringBuilder a(StringBuilder stringBuilder, String str, boolean z) {
        stringBuilder.append("\\Q");
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '\'') {
                if (charAt == '\\') {
                    i++;
                    if (i != str.length()) {
                        stringBuilder.append(charAt);
                        charAt = str.charAt(i);
                        if (charAt == 'E') {
                            stringBuilder.append("E\\\\E\\");
                            charAt = 'Q';
                        }
                    }
                }
            } else if (z) {
                i++;
                if (i == str.length()) {
                    return stringBuilder;
                }
                charAt = str.charAt(i);
            } else {
                continue;
            }
            stringBuilder.append(charAt);
            i++;
        }
        stringBuilder.append("\\E");
        return stringBuilder;
    }

    private static ConcurrentMap<Locale, c> a(int i) {
        ConcurrentMap<Locale, c> concurrentMap;
        synchronized (l) {
            if (l[i] == null) {
                l[i] = new ConcurrentHashMap(3);
            }
            concurrentMap = l[i];
        }
        return concurrentMap;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x00c3 in {9, 11, 13, 16, 17, 19} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void a(java.util.Calendar r7) {
        /*
        r6 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = k;
        r3 = r6.j;
        r2 = r2.matcher(r3);
        r3 = r2.lookingAt();
        if (r3 == 0) goto L_0x00a0;
        r3 = r2.group();
        r6.g = r3;
        r3 = r6.g;
        r3 = r6.a(r3, r7);
        r4 = r2.end();
        r5 = r2.regionEnd();
        r2.region(r4, r5);
        r4 = r2.lookingAt();
        if (r4 != 0) goto L_0x0088;
        r7 = 0;
        r6.h = r7;
        r4 = r2.regionStart();
        r5 = r2.regionEnd();
        if (r4 != r5) goto L_0x0066;
        r2 = r3.a(r6, r0);
        if (r2 == 0) goto L_0x004b;
        r1.add(r3);
        r6.g = r7;
        r7 = r1.size();
        r7 = new defpackage.akmx.c[r7];
        r7 = r1.toArray(r7);
        r7 = (defpackage.akmx.c[]) r7;
        r6.f = r7;
        r7 = r0.toString();
        r7 = java.util.regex.Pattern.compile(r7);
        r6.e = r7;
        return;
        r7 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "Failed to parse \"";
        r0.<init>(r1);
        r1 = r6.j;
        r0.append(r1);
        r1 = "\" ; gave up at index ";
        r0.append(r1);
        r1 = r2.regionStart();
        r0.append(r1);
        r0 = r0.toString();
        r7.<init>(r0);
        throw r7;
        r4 = r2.group();
        r5 = r6.a(r4, r7);
        r6.h = r5;
        r5 = r3.a(r6, r0);
        if (r5 == 0) goto L_0x009b;
        r1.add(r3);
        r6.g = r4;
        r3 = r6.h;
        goto L_0x0024;
        r7 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "Illegal pattern character '";
        r0.<init>(r1);
        r1 = r6.j;
        r2 = r2.regionStart();
        r1 = r1.charAt(r2);
        r0.append(r1);
        r1 = "'";
        r0.append(r1);
        r0 = r0.toString();
        r7.<init>(r0);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akmx.a(java.util.Calendar):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akmx)) {
            return false;
        }
        akmx akmx = (akmx) obj;
        return this.j.equals(akmx.j) && this.a.equals(akmx.a) && this.b.equals(akmx.b);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.a.hashCode() + (this.b.hashCode() * 13)) * 13);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FastDateParser[");
        stringBuilder.append(this.j);
        String str = ppy.b;
        stringBuilder.append(str);
        stringBuilder.append(this.b);
        stringBuilder.append(str);
        stringBuilder.append(this.a.getID());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
