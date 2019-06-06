package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: akib */
public final class akib {
    public static final byte[] a = new byte[0];
    public static final String[] b = new String[0];
    public static final akhw c = akhw.a(null, 0, new akkd().c(a));
    public static final Charset d = Charset.forName("UTF-8");
    public static final TimeZone e = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> f = new 1();
    private static final akkg g = akkg.c("efbbbf");
    private static final akkg h = akkg.c("feff");
    private static final akkg i = akkg.c("fffe");
    private static final akkg j = akkg.c("0000ffff");
    private static final akkg k = akkg.c("ffff0000");
    private static final Charset l = Charset.forName("UTF-16BE");
    private static final Charset m = Charset.forName("UTF-16LE");
    private static final Charset n = Charset.forName("UTF-32BE");
    private static final Charset o = Charset.forName("UTF-32LE");
    private static final Pattern p = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: akib$1 */
    class 1 implements Comparator<String> {
        1() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    }

    static {
        akhu.create(null, a);
        Charset.forName("ISO-8859-1");
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        int i = 97;
        if (c < 'a' || c > 'f') {
            i = 65;
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - i) + 10;
    }

    public static int a(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, long j, TimeUnit timeUnit) {
        StringBuilder stringBuilder;
        if (j < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" < 0");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (timeUnit != null) {
            long toMillis = timeUnit.toMillis(j);
            if (toMillis > 2147483647L) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" too large.");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (toMillis != 0 || j <= 0) {
                return (int) toMillis;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" too small.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static AssertionError a(String str, Exception exception) {
        return (AssertionError) new AssertionError(str).initCause(exception);
    }

    public static String a(akhm akhm, boolean z) {
        String stringBuilder;
        String str = ":";
        if (akhm.b.contains(str)) {
            StringBuilder stringBuilder2 = new StringBuilder("[");
            stringBuilder2.append(akhm.b);
            stringBuilder2.append("]");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = akhm.b;
        }
        if (!z && akhm.c == akhm.a(akhm.a)) {
            return stringBuilder;
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder);
        stringBuilder3.append(str);
        stringBuilder3.append(akhm.c);
        return stringBuilder3.toString();
    }

    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                akkd akkd = new akkd();
                akkd.a(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    int i2 = (codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2;
                    akkd.a(i2);
                    i += Character.charCount(codePointAt2);
                }
                return akkd.n();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(akkf akkf, Charset charset) {
        if (akkf.b(g)) {
            akkf.f((long) g.g());
            return d;
        } else if (akkf.b(h)) {
            akkf.f((long) h.g());
            return l;
        } else if (akkf.b(i)) {
            akkf.f((long) i.g());
            return m;
        } else if (akkf.b(j)) {
            akkf.f((long) j.g());
            return n;
        } else if (!akkf.b(k)) {
            return charset;
        } else {
            akkf.f((long) k.g());
            return o;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(final String str, final boolean z) {
        return new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!akib.a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(akkv akkv, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c = akkv.a().at_() ? akkv.a().c() - nanoTime : Long.MAX_VALUE;
        akkv.a().a(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            akkd akkd = new akkd();
            while (akkv.a(akkd, 8192) != -1) {
                akkd.r();
            }
            if (c == Long.MAX_VALUE) {
                akkv.a().e();
            } else {
                akkv.a().a(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                akkv.a().e();
            } else {
                akkv.a().a(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                akkv.a().e();
            } else {
                akkv.a().a(nanoTime + c);
            }
            throw th;
        }
    }

    public static boolean a(akkv akkv, TimeUnit timeUnit) {
        try {
            return akib.a(akkv, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : strArr) {
            for (Object compare : strArr2) {
                if (comparator.compare(obj, compare) == 0) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int b(String str, int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return i;
            }
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2 + 1;
            }
        }
    }

    public static String b(String str) {
        if (str.contains(":")) {
            int i = 0;
            InetAddress d = (str.startsWith("[") && str.endsWith("]")) ? akib.d(str, 1, str.length() - 1) : akib.d(str, 0, str.length());
            if (d == null) {
                return null;
            }
            byte[] address = d.getAddress();
            if (address.length == 16) {
                int i2 = 0;
                int i3 = -1;
                int i4 = 0;
                while (i2 < address.length) {
                    int i5 = i2;
                    while (i5 < 16 && address[i5] == (byte) 0 && address[i5 + 1] == (byte) 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i2;
                    if (i6 > i4 && i6 >= 4) {
                        i3 = i2;
                        i4 = i6;
                    }
                    i2 = i5 + 2;
                }
                akkd akkd = new akkd();
                while (i < address.length) {
                    if (i == i3) {
                        akkd.j(58);
                        i += i4;
                        if (i == 16) {
                            akkd.j(58);
                        }
                    } else {
                        if (i > 0) {
                            akkd.j(58);
                        }
                        akkd.i((long) (((address[i] & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return akkd.n();
            }
            StringBuilder stringBuilder = new StringBuilder("Invalid IPv6 address: '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            throw new AssertionError(stringBuilder.toString());
        }
        try {
            str = IDN.toASCII(str).toLowerCase(Locale.US);
            return (str.isEmpty() || akib.e(str)) ? null : str;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (Object obj : strArr) {
                for (Object compare : strArr2) {
                    if (comparator.compare(obj, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static String c(String str, int i, int i2) {
        i = akib.a(str, i, i2);
        return str.substring(i, akib.b(str, i, i2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:78:0x00ec in {4, 10, 13, 14, 18, 24, 28, 29, 38, 41, 42, 45, 46, 49, 50, 52, 53, 54, 55, 60, 64, 65, 66, 70, 71, 74, 77} preds:[]
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
    private static java.net.InetAddress d(java.lang.String r16, int r17, int r18) {
        /*
        r0 = r16;
        r1 = r18;
        r2 = 16;
        r3 = new byte[r2];
        r4 = -1;
        r5 = 0;
        r6 = r17;
        r7 = 0;
        r8 = -1;
        r9 = -1;
        r10 = 0;
        if (r6 >= r1) goto L_0x00cc;
        if (r7 != r2) goto L_0x0015;
        return r10;
        r11 = r6 + 2;
        r12 = 4;
        if (r11 > r1) goto L_0x0030;
        r13 = 2;
        r14 = "::";
        r13 = r0.regionMatches(r6, r14, r5, r13);
        if (r13 == 0) goto L_0x0030;
        if (r8 == r4) goto L_0x0026;
        return r10;
        r7 = r7 + 2;
        if (r11 != r1) goto L_0x002d;
        r8 = r7;
        goto L_0x00cc;
        r8 = r7;
        r9 = r11;
        goto L_0x009f;
        if (r7 == 0) goto L_0x009e;
        r11 = 1;
        r13 = ":";
        r13 = r0.regionMatches(r6, r13, r5, r11);
        if (r13 == 0) goto L_0x003e;
        r6 = r6 + 1;
        goto L_0x009e;
        r13 = ".";
        r6 = r0.regionMatches(r6, r13, r5, r11);
        if (r6 == 0) goto L_0x009d;
        r6 = r7 + -2;
        r13 = r6;
        if (r9 >= r1) goto L_0x0091;
        if (r13 != r2) goto L_0x004e;
        goto L_0x0097;
        if (r13 == r6) goto L_0x005b;
        r14 = r0.charAt(r9);
        r15 = 46;
        if (r14 == r15) goto L_0x0059;
        goto L_0x0097;
        r9 = r9 + 1;
        r14 = r9;
        r15 = 0;
        if (r14 >= r1) goto L_0x0080;
        r11 = r0.charAt(r14);
        r5 = 48;
        if (r11 < r5) goto L_0x0080;
        r2 = 57;
        if (r11 > r2) goto L_0x0080;
        if (r15 != 0) goto L_0x0070;
        if (r9 == r14) goto L_0x0070;
        goto L_0x0094;
        r15 = r15 * 10;
        r15 = r15 + r11;
        r15 = r15 - r5;
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r15 <= r2) goto L_0x0079;
        goto L_0x0094;
        r14 = r14 + 1;
        r2 = 16;
        r5 = 0;
        r11 = 1;
        goto L_0x005d;
        r2 = r14 - r9;
        if (r2 != 0) goto L_0x0085;
        goto L_0x0094;
        r2 = r13 + 1;
        r5 = (byte) r15;
        r3[r13] = r5;
        r13 = r2;
        r9 = r14;
        r2 = 16;
        r5 = 0;
        r11 = 1;
        goto L_0x0049;
        r6 = r6 + r12;
        if (r13 == r6) goto L_0x0096;
        r5 = 0;
        goto L_0x0097;
        r5 = 1;
        if (r5 != 0) goto L_0x009a;
        return r10;
        r7 = r7 + 2;
        goto L_0x00cc;
        return r10;
        r9 = r6;
        r6 = r9;
        r2 = 0;
        if (r6 >= r1) goto L_0x00b3;
        r5 = r0.charAt(r6);
        r5 = defpackage.akib.a(r5);
        if (r5 == r4) goto L_0x00b3;
        r2 = r2 << 4;
        r2 = r2 + r5;
        r6 = r6 + 1;
        goto L_0x00a1;
        r5 = r6 - r9;
        if (r5 == 0) goto L_0x00cb;
        if (r5 <= r12) goto L_0x00ba;
        goto L_0x00cb;
        r5 = r7 + 1;
        r10 = r2 >>> 8;
        r10 = (byte) r10;
        r3[r7] = r10;
        r7 = r5 + 1;
        r2 = (byte) r2;
        r3[r5] = r2;
        r2 = 16;
        r5 = 0;
        goto L_0x000f;
        return r10;
        r0 = 16;
        if (r7 == r0) goto L_0x00e1;
        if (r8 != r4) goto L_0x00d3;
        return r10;
        r1 = r7 - r8;
        r2 = 16 - r1;
        java.lang.System.arraycopy(r3, r8, r3, r2, r1);
        r2 = 16 - r7;
        r2 = r2 + r8;
        r0 = 0;
        java.util.Arrays.fill(r3, r8, r2, r0);
        r0 = java.net.InetAddress.getByAddress(r3);	 Catch:{ UnknownHostException -> 0x00e6 }
        return r0;
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akib.d(java.lang.String, int, int):java.net.InetAddress");
    }

    public static boolean d(String str) {
        return p.matcher(str).matches();
    }

    /* JADX WARNING: Missing block: B:11:0x0023, code skipped:
            return true;
     */
    private static boolean e(java.lang.String r5) {
        /*
        r0 = 0;
        r1 = 0;
    L_0x0002:
        r2 = r5.length();
        if (r1 >= r2) goto L_0x0024;
    L_0x0008:
        r2 = r5.charAt(r1);
        r3 = 31;
        r4 = 1;
        if (r2 <= r3) goto L_0x0023;
    L_0x0011:
        r3 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r2 < r3) goto L_0x0016;
    L_0x0015:
        goto L_0x0023;
    L_0x0016:
        r3 = " #%/:?@[\\]";
        r2 = r3.indexOf(r2);
        r3 = -1;
        if (r2 == r3) goto L_0x0020;
    L_0x001f:
        return r4;
    L_0x0020:
        r1 = r1 + 1;
        goto L_0x0002;
    L_0x0023:
        return r4;
    L_0x0024:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akib.e(java.lang.String):boolean");
    }
}
