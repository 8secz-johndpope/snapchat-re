package defpackage;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: akrb */
public final class akrb {
    public static final AtomicReference<Map<String, akrc>> a = new AtomicReference();
    private static volatile a b = new b();

    /* renamed from: akrb$a */
    public interface a {
        long a();
    }

    /* renamed from: akrb$b */
    static class b implements a {
        b() {
        }

        public final long a() {
            return System.currentTimeMillis();
        }
    }

    public static final long a() {
        return b.a();
    }

    public static final long a(akrw akrw) {
        return akrw == null ? akrb.a() : akrw.b();
    }

    public static final akqx a(akqx akqx) {
        return akqx == null ? aktc.b(akrc.a()) : akqx;
    }

    public static final akrc a(akrc akrc) {
        return akrc == null ? akrc.a() : akrc;
    }

    public static final DateFormatSymbols a(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", new Class[]{Locale.class}).invoke(null, new Object[]{locale});
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static void a(Map<String, akrc> map, String str, String str2) {
        try {
            map.put(str, akrc.a(str2));
        } catch (RuntimeException unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0038 in {9, 10, 11, 13, 15} preds:[]
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
    public static final boolean a(defpackage.akrx r5) {
        /*
        if (r5 == 0) goto L_0x0030;
        r0 = 0;
        r1 = 0;
        r2 = r0;
        r0 = 0;
        r3 = r5.a();
        if (r0 >= r3) goto L_0x002e;
        r3 = r5.d(r0);
        if (r0 <= 0) goto L_0x0023;
        r4 = r3.e();
        if (r4 == 0) goto L_0x0022;
        r4 = r3.e();
        r4 = r4.a();
        if (r4 == r2) goto L_0x0023;
        return r1;
        r2 = r3.d();
        r2 = r2.a();
        r0 = r0 + 1;
        goto L_0x0006;
        r5 = 1;
        return r5;
        r5 = new java.lang.IllegalArgumentException;
        r0 = "Partial must not be null";
        r5.<init>(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akrb.a(akrx):boolean");
    }

    public static final akqx b(akrw akrw) {
        if (akrw != null) {
            akqx c = akrw.c();
            if (c != null) {
                return c;
            }
        }
        return aktc.b(akrc.a());
    }

    public static final akrr b() {
        akrr akrr = akrr.b;
        if (akrr != null) {
            return akrr;
        }
        String str = "Standard";
        akrr = new akrr(str, new akrg[]{akrg.d, akrg.e, akrg.f, akrg.g, akrg.i, akrg.j, akrg.k, akrg.l}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        akrr.b = akrr;
        return akrr;
    }
}
