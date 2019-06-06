package defpackage;

import com.brightcove.player.media.MediaService;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: aimn */
public final class aimn {
    public final String a;
    public final int b;
    private final String c;
    private final String d;
    private final String e;
    private final List<String> f;
    private final List<String> g;
    private final String h;
    private final String i;

    /* renamed from: aimn$a */
    public static final class a {
        public String a;
        String b;
        String c;
        public String d;
        public int e = -1;
        final List<String> f = new ArrayList();

        public a() {
            String str = "";
            this.b = str;
            this.c = str;
            this.f.add(str);
        }

        public static String a(String str) {
            try {
                str = IDN.toASCII(str).toLowerCase(Locale.US);
                return str.isEmpty() ? null : str;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public static String a(byte[] bArr) {
            int i = 0;
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            while (i2 < bArr.length) {
                int i5 = i2;
                while (i5 < 16 && bArr[i5] == (byte) 0 && bArr[i5 + 1] == (byte) 0) {
                    i5 += 2;
                }
                int i6 = i5 - i2;
                if (i6 > i4) {
                    i3 = i2;
                    i4 = i6;
                }
                i2 = i5 + 2;
            }
            akkd akkd = new akkd();
            while (i < bArr.length) {
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
                    akkd.i((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return akkd.n();
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
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public static java.net.InetAddress a(java.lang.String r16, int r17) {
            /*
            r0 = r16;
            r1 = r17;
            r2 = 16;
            r3 = new byte[r2];
            r4 = -1;
            r5 = 1;
            r6 = 0;
            r7 = 1;
            r8 = 0;
            r9 = -1;
            r10 = -1;
            r11 = 0;
            if (r7 >= r1) goto L_0x00cc;
            if (r8 != r2) goto L_0x0015;
            return r11;
            r12 = r7 + 2;
            r13 = 4;
            if (r12 > r1) goto L_0x0030;
            r14 = 2;
            r15 = "::";
            r14 = r0.regionMatches(r7, r15, r6, r14);
            if (r14 == 0) goto L_0x0030;
            if (r9 == r4) goto L_0x0026;
            return r11;
            r8 = r8 + 2;
            if (r12 != r1) goto L_0x002d;
            r9 = r8;
            goto L_0x00cc;
            r9 = r8;
            r10 = r12;
            goto L_0x009e;
            if (r8 == 0) goto L_0x009d;
            r12 = ":";
            r12 = r0.regionMatches(r7, r12, r6, r5);
            if (r12 == 0) goto L_0x003d;
            r7 = r7 + 1;
            goto L_0x009d;
            r12 = ".";
            r7 = r0.regionMatches(r7, r12, r6, r5);
            if (r7 == 0) goto L_0x009c;
            r7 = r8 + -2;
            r12 = r7;
            if (r10 >= r1) goto L_0x0090;
            if (r12 != r2) goto L_0x004d;
            goto L_0x0096;
            if (r12 == r7) goto L_0x005a;
            r14 = r0.charAt(r10);
            r15 = 46;
            if (r14 == r15) goto L_0x0058;
            goto L_0x0096;
            r10 = r10 + 1;
            r14 = r10;
            r15 = 0;
            if (r14 >= r1) goto L_0x007f;
            r5 = r0.charAt(r14);
            r6 = 48;
            if (r5 < r6) goto L_0x007f;
            r2 = 57;
            if (r5 > r2) goto L_0x007f;
            if (r15 != 0) goto L_0x006f;
            if (r10 == r14) goto L_0x006f;
            goto L_0x0093;
            r15 = r15 * 10;
            r15 = r15 + r5;
            r15 = r15 - r6;
            r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
            if (r15 <= r2) goto L_0x0078;
            goto L_0x0093;
            r14 = r14 + 1;
            r2 = 16;
            r5 = 1;
            r6 = 0;
            goto L_0x005c;
            r2 = r14 - r10;
            if (r2 != 0) goto L_0x0084;
            goto L_0x0093;
            r2 = r12 + 1;
            r5 = (byte) r15;
            r3[r12] = r5;
            r12 = r2;
            r10 = r14;
            r2 = 16;
            r5 = 1;
            r6 = 0;
            goto L_0x0048;
            r7 = r7 + r13;
            if (r12 == r7) goto L_0x0095;
            r6 = 0;
            goto L_0x0096;
            r6 = 1;
            if (r6 != 0) goto L_0x0099;
            return r11;
            r8 = r8 + 2;
            goto L_0x00cc;
            return r11;
            r10 = r7;
            r7 = r10;
            r2 = 0;
            if (r7 >= r1) goto L_0x00b2;
            r5 = r0.charAt(r7);
            r5 = defpackage.aimn.a(r5);
            if (r5 == r4) goto L_0x00b2;
            r2 = r2 << 4;
            r2 = r2 + r5;
            r7 = r7 + 1;
            goto L_0x00a0;
            r5 = r7 - r10;
            if (r5 == 0) goto L_0x00cb;
            if (r5 <= r13) goto L_0x00b9;
            goto L_0x00cb;
            r5 = r8 + 1;
            r6 = r2 >>> 8;
            r6 = (byte) r6;
            r3[r8] = r6;
            r8 = r5 + 1;
            r2 = (byte) r2;
            r3[r5] = r2;
            r2 = 16;
            r5 = 1;
            r6 = 0;
            goto L_0x000f;
            return r11;
            r0 = 16;
            if (r8 == r0) goto L_0x00e1;
            if (r9 != r4) goto L_0x00d3;
            return r11;
            r1 = r8 - r9;
            r2 = 16 - r1;
            java.lang.System.arraycopy(r3, r9, r3, r2, r1);
            r2 = 16 - r8;
            r2 = r2 + r9;
            r0 = 0;
            java.util.Arrays.fill(r3, r9, r2, r0);
            r0 = java.net.InetAddress.getByAddress(r3);	 Catch:{ UnknownHostException -> 0x00e6 }
            return r0;
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aimn$a.a(java.lang.String, int):java.net.InetAddress");
        }

        /* Access modifiers changed, original: final */
        public final int a() {
            int i = this.e;
            return i != -1 ? i : aimn.a(this.a);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("://");
            if (!(this.b.isEmpty() && this.c.isEmpty())) {
                stringBuilder.append(this.b);
                if (!this.c.isEmpty()) {
                    stringBuilder.append(':');
                    stringBuilder.append(this.c);
                }
                stringBuilder.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                stringBuilder.append('[');
                stringBuilder.append(this.d);
                stringBuilder.append(']');
            } else {
                stringBuilder.append(this.d);
            }
            int a = a();
            if (a != aimn.a(this.a)) {
                stringBuilder.append(':');
                stringBuilder.append(a);
            }
            aimn.a(stringBuilder, this.f);
            return stringBuilder.toString();
        }
    }

    private aimn(a aVar) {
        this.c = aVar.a;
        this.d = aimn.b(aVar.b);
        this.e = aimn.b(aVar.c);
        this.a = aVar.d;
        this.b = aVar.a();
        this.f = aimn.a(aVar.f);
        this.g = null;
        this.h = null;
        this.i = aVar.toString();
    }

    public /* synthetic */ aimn(a aVar, byte b) {
        this(aVar);
    }

    static int a(char c) {
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

    public static int a(String str) {
        return str.equals(MediaService.DEFAULT_MEDIA_DELIVERY) ? 80 : str.equals("https") ? 443 : -1;
    }

    public static /* synthetic */ int a(String str, int i, String str2) {
        for (int i2 = 0; i2 < i; i2++) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
        }
        return i;
    }

    public static String a(String str, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (str.charAt(i2) == '%') {
                akkd akkd = new akkd();
                akkd.a(str, 0, i2);
                aimn.a(akkd, str, i2, i);
                return akkd.n();
            }
        }
        return str.substring(0, i);
    }

    private static List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(str != null ? aimn.b(str) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(akkd akkd, String str, int i, int i2) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = aimn.a(str.charAt(i + 1));
                    int a2 = aimn.a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        akkd.j((a << 4) + a2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                }
            }
            akkd.a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    static void a(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append('/');
            stringBuilder.append((String) list.get(i));
        }
    }

    private static String b(String str) {
        return aimn.a(str, str.length());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aimn) && ((aimn) obj).i.equals(this.i);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
