package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: akfr */
public final class akfr implements Serializable {
    private final Pattern a;

    /* renamed from: akfr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public akfr(String str) {
        akcr.b(str, "pattern");
        Pattern compile = Pattern.compile(str);
        akcr.a((Object) compile, "Pattern.compile(pattern)");
        this(compile);
    }

    private akfr(Pattern pattern) {
        akcr.b(pattern, "nativePattern");
        this.a = pattern;
    }

    public final String a() {
        Object pattern = this.a.pattern();
        akcr.a(pattern, "nativePattern.pattern()");
        return pattern;
    }

    public final String a(CharSequence charSequence, String str) {
        akcr.b(charSequence, "input");
        akcr.b(str, "replacement");
        Object replaceAll = this.a.matcher(charSequence).replaceAll(str);
        akcr.a(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0087 in {2, 3, 8, 11, 16, 18, 20, 22, 24} preds:[]
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
    public final java.util.List<java.lang.String> a(java.lang.CharSequence r5, int r6) {
        /*
        r4 = this;
        r0 = "input";
        defpackage.akcr.b(r5, r0);
        r0 = 1;
        r1 = 0;
        if (r6 < 0) goto L_0x000b;
        r2 = 1;
        goto L_0x000c;
        r2 = 0;
        if (r2 == 0) goto L_0x0068;
        r2 = r4.a;
        r2 = r2.matcher(r5);
        r3 = r2.find();
        if (r3 == 0) goto L_0x005f;
        if (r6 != r0) goto L_0x001d;
        goto L_0x005f;
        r0 = new java.util.ArrayList;
        r3 = 10;
        if (r6 <= 0) goto L_0x0027;
        r3 = defpackage.akef.c(r6, r3);
        r0.<init>(r3);
        r6 = r6 + -1;
        r3 = r2.start();
        r1 = r5.subSequence(r1, r3);
        r1 = r1.toString();
        r0.add(r1);
        r1 = r2.end();
        if (r6 < 0) goto L_0x0047;
        r3 = r0.size();
        if (r3 == r6) goto L_0x004d;
        r3 = r2.find();
        if (r3 != 0) goto L_0x002c;
        r6 = r5.length();
        r5 = r5.subSequence(r1, r6);
        r5 = r5.toString();
        r0.add(r5);
        r0 = (java.util.List) r0;
        return r0;
        r5 = r5.toString();
        r5 = defpackage.ajyl.a(r5);
        return r5;
        r5 = new java.lang.StringBuilder;
        r0 = "Limit must be non-negative, but was ";
        r5.<init>(r0);
        r5.append(r6);
        r6 = 46;
        r5.append(r6);
        r5 = r5.toString();
        r6 = new java.lang.IllegalArgumentException;
        r5 = r5.toString();
        r6.<init>(r5);
        r6 = (java.lang.Throwable) r6;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfr.a(java.lang.CharSequence, int):java.util.List");
    }

    public final boolean a(CharSequence charSequence) {
        akcr.b(charSequence, "input");
        return this.a.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        akcr.b(charSequence, "input");
        akcr.b(str, "replacement");
        Object replaceFirst = this.a.matcher(charSequence).replaceFirst(str);
        akcr.a(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final String toString() {
        Object pattern = this.a.toString();
        akcr.a(pattern, "nativePattern.toString()");
        return pattern;
    }
}
