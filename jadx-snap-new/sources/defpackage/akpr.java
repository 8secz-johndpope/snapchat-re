package defpackage;

import android.content.Context;
import java.net.IDN;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: akpr */
public abstract class akpr extends akpa {
    private static final Pattern o = Pattern.compile("^[0-9\\.]*$");
    public final Context a;
    public final List<b> b = new LinkedList();
    public final List<a> c = new LinkedList();
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public long l;
    public String m;
    protected long n;
    private boolean p;
    private int q = 20;

    /* renamed from: akpr$b */
    public static class b {
        public final String a;
        public final int b;
        public final int c;

        b(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }
    }

    /* renamed from: akpr$a */
    public static class a {
        public final String a;
        public final byte[][] b;
        public final boolean c;
        public final Date d;

        a(String str, byte[][] bArr, boolean z, Date date) {
            this.a = str;
            this.b = bArr;
            this.c = z;
            this.d = date;
        }
    }

    public akpr(Context context) {
        this.a = context.getApplicationContext();
        this.g = false;
        this.h = true;
        this.i = false;
        b(0, 0);
        this.p = false;
        this.d = true;
    }

    private akpr b(int i, long j) {
        if (i == 3 || i == 2) {
            if (this.f == null) {
                throw new IllegalArgumentException("Storage path must be set");
            }
        } else if (this.f != null) {
            throw new IllegalArgumentException("Storage path must not be set");
        }
        boolean z = i == 0 || i == 2;
        this.j = z;
        this.l = j;
        if (i == 0) {
            this.k = 0;
        } else if (i == 1) {
            this.k = 2;
        } else if (i == 2 || i == 3) {
            this.k = 1;
        } else {
            throw new IllegalArgumentException("Unknown cache mode");
        }
        return this;
    }

    private static String c(String str) {
        String str2 = "Hostname ";
        StringBuilder stringBuilder;
        if (o.matcher(str).matches()) {
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(str);
            stringBuilder.append(" is illegal. A hostname should not consist of digits and/or dots only.");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (str.length() <= 255) {
            try {
                str = IDN.toASCII(str, 2);
                return str;
            } catch (IllegalArgumentException unused) {
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(str);
                stringBuilder.append(" is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } else {
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(str);
            stringBuilder.append(" is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final int a(int i) {
        int i2 = this.q;
        return i2 == 20 ? i : i2;
    }

    public final /* bridge */ /* synthetic */ akpa a() {
        this.i = true;
        return this;
    }

    public final /* synthetic */ akpa a(int i, long j) {
        return b(i, j);
    }

    public final /* synthetic */ akpa a(String str, int i, int i2) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
        }
        this.b.add(new b(str, i, i2));
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0065 in {10, 12, 14, 16, 18, 20} preds:[]
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
    public final /* synthetic */ defpackage.akpa a(java.lang.String r5, java.util.Set r6, boolean r7, java.util.Date r8) {
        /*
        r4 = this;
        if (r5 == 0) goto L_0x005d;
        if (r6 == 0) goto L_0x0055;
        if (r8 == 0) goto L_0x004d;
        r5 = defpackage.akpr.c(r5);
        r0 = new java.util.HashSet;
        r1 = r6.size();
        r0.<init>(r1);
        r6 = r6.iterator();
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x0036;
        r1 = r6.next();
        r1 = (byte[]) r1;
        if (r1 == 0) goto L_0x002e;
        r2 = r1.length;
        r3 = 32;
        if (r2 != r3) goto L_0x002e;
        r0.add(r1);
        goto L_0x0017;
        r5 = new java.lang.IllegalArgumentException;
        r6 = "Public key pin is invalid";
        r5.<init>(r6);
        throw r5;
        r6 = r4.c;
        r1 = new akpr$a;
        r2 = r0.size();
        r2 = new byte[r2][];
        r0 = r0.toArray(r2);
        r0 = (byte[][]) r0;
        r1.<init>(r5, r0, r7, r8);
        r6.add(r1);
        return r4;
        r5 = new java.lang.NullPointerException;
        r6 = "The pin expiration date cannot be null";
        r5.<init>(r6);
        throw r5;
        r5 = new java.lang.NullPointerException;
        r6 = "The set of SHA256 pins cannot be null";
        r5.<init>(r6);
        throw r5;
        r5 = new java.lang.NullPointerException;
        r6 = "The hostname cannot be null";
        r5.<init>(r6);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akpr.a(java.lang.String, java.util.Set, boolean, java.util.Date):akpa");
    }
}
