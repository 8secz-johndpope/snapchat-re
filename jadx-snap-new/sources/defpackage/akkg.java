package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: akkg */
public class akkg implements Serializable, Comparable<akkg> {
    public static final akkg a = akkg.a(new byte[0]);
    private static char[] c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    transient int b;
    private byte[] d;
    private transient String e;

    akkg(byte[] bArr) {
        this.d = bArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x002f in {5, 9, 11, 16, 18} preds:[]
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
    private static int a(char r2) {
        /*
        r0 = 48;
        if (r2 < r0) goto L_0x000a;
        r1 = 57;
        if (r2 > r1) goto L_0x000a;
        r2 = r2 - r0;
        return r2;
        r0 = 97;
        if (r2 < r0) goto L_0x0016;
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r2 > r1) goto L_0x0016;
        r2 = r2 - r0;
        r2 = r2 + 10;
        return r2;
        r0 = 65;
        if (r2 < r0) goto L_0x001f;
        r1 = 70;
        if (r2 > r1) goto L_0x001f;
        goto L_0x0012;
        r0 = new java.lang.IllegalArgumentException;
        r2 = java.lang.String.valueOf(r2);
        r1 = "Unexpected hex digit: ";
        r2 = r1.concat(r2);
        r0.<init>(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkg.a(char):int");
    }

    public static akkg a(String str) {
        if (str != null) {
            akkg akkg = new akkg(str.getBytes(akkx.a));
            akkg.e = str;
            return akkg;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static akkg a(byte... bArr) {
        if (bArr != null) {
            return new akkg((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static akkg b(String str) {
        if (str != null) {
            byte[] a = akkc.a(str);
            return a != null ? new akkg(a) : null;
        } else {
            throw new IllegalArgumentException("base64 == null");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0046 in {5, 7, 9} preds:[]
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
    public static defpackage.akkg c(java.lang.String r4) {
        /*
        r0 = r4.length();
        r0 = r0 % 2;
        if (r0 != 0) goto L_0x0036;
        r0 = r4.length();
        r0 = r0 / 2;
        r0 = new byte[r0];
        r1 = 0;
        r2 = r0.length;
        if (r1 >= r2) goto L_0x0031;
        r2 = r1 << 1;
        r3 = r4.charAt(r2);
        r3 = defpackage.akkg.a(r3);
        r3 = r3 << 4;
        r2 = r2 + 1;
        r2 = r4.charAt(r2);
        r2 = defpackage.akkg.a(r2);
        r3 = r3 + r2;
        r2 = (byte) r3;
        r0[r1] = r2;
        r1 = r1 + 1;
        goto L_0x0011;
        r4 = defpackage.akkg.a(r0);
        return r4;
        r0 = new java.lang.IllegalArgumentException;
        r4 = java.lang.String.valueOf(r4);
        r1 = "Unexpected hex string: ";
        r4 = r1.concat(r4);
        r0.<init>(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akkg.c(java.lang.String):akkg");
    }

    private akkg d(String str) {
        try {
            return akkg.a(MessageDigest.getInstance(str).digest(this.d));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public byte a(int i) {
        return this.d[i];
    }

    public akkg a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.d;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.d, i, bArr2, 0, i3);
                    return new akkg(bArr2);
                }
            }
            StringBuilder stringBuilder = new StringBuilder("endIndex > length(");
            stringBuilder.append(this.d.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        str = new String(this.d, akkx.a);
        this.e = str;
        return str;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(akkd akkd) {
        byte[] bArr = this.d;
        akkd.c(bArr, 0, bArr.length);
    }

    public boolean a(int i, akkg akkg, int i2, int i3) {
        return akkg.a(0, this.d, 0, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.d;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && akkx.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public String b() {
        return akkc.a(this.d, akkc.a);
    }

    public akkg c() {
        return d("SHA-1");
    }

    public /* synthetic */ int compareTo(Object obj) {
        akkg akkg = (akkg) obj;
        int g = g();
        int g2 = akkg.g();
        int min = Math.min(g, g2);
        int i = 0;
        while (i < min) {
            int a = a(i) & 255;
            int a2 = akkg.a(i) & 255;
            if (a != a2) {
                return a < a2 ? -1 : 1;
            } else {
                i++;
            }
        }
        return g == g2 ? 0 : g < g2 ? -1 : 1;
    }

    public akkg d() {
        return d("SHA-256");
    }

    public String e() {
        byte[] bArr = this.d;
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = c;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akkg) {
            akkg akkg = (akkg) obj;
            int g = akkg.g();
            byte[] bArr = this.d;
            return g == bArr.length && akkg.a(0, bArr, 0, bArr.length);
        }
    }

    public akkg f() {
        int i = 0;
        while (true) {
            byte[] bArr = this.d;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < (byte) 65 || b > (byte) 90) {
                i++;
            } else {
                bArr = (byte[]) bArr.clone();
                bArr[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr.length; i2++) {
                    byte b2 = bArr[i2];
                    if (b2 >= (byte) 65 && b2 <= (byte) 90) {
                        bArr[i2] = (byte) (b2 + 32);
                    }
                }
                return new akkg(bArr);
            }
        }
    }

    public int g() {
        return this.d.length;
    }

    public byte[] h() {
        return (byte[]) this.d.clone();
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.d);
        this.b = i;
        return i;
    }

    public String toString() {
        if (this.d.length == 0) {
            return "[size=0]";
        }
        StringBuilder stringBuilder;
        String a = a();
        int length = a.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 != 64) {
                int codePointAt = a.codePointAt(i);
                if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                    i = -1;
                    break;
                }
                i2++;
                i += Character.charCount(codePointAt);
            } else {
                break;
            }
        }
        i = a.length();
        String str = "…]";
        String str2 = "[size=";
        String str3 = "]";
        String replace;
        if (i != -1) {
            replace = a.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a.length()) {
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(this.d.length);
                stringBuilder.append(" text=");
                stringBuilder.append(replace);
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
            stringBuilder = new StringBuilder("[text=");
            stringBuilder.append(replace);
        } else if (this.d.length <= 64) {
            stringBuilder = new StringBuilder("[hex=");
            stringBuilder.append(e());
        } else {
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(this.d.length);
            stringBuilder.append(" hex=");
            replace = a(0, 64).e();
            stringBuilder.append(replace);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }
}
