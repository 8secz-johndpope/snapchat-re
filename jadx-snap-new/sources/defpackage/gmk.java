package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.net.MediaType;
import defpackage.akht.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: gmk */
public final class gmk {

    /* renamed from: gmk$b */
    public static class b {
        public final sai a;
        public final Boolean b;

        b(sai sai, Boolean bool) {
            this.a = sai;
            this.b = bool;
        }
    }

    /* renamed from: gmk$a */
    static class a extends sbl implements gjo {
        private final Map<String, String> a;

        public a(MediaType mediaType, long j, sbd sbd, Map<String, String> map) {
            super(mediaType, j, sbd);
            this.a = new HashMap(map);
        }

        public final Map<String, String> a() {
            return this.a;
        }
    }

    /* renamed from: gmk$1 */
    static class 1 extends akhu {
        private /* synthetic */ sai a;
        private /* synthetic */ akho b;

        1(sai sai, akho akho) {
            this.a = sai;
            this.b = akho;
        }

        public final long contentLength() {
            return this.a.c();
        }

        public final akho contentType() {
            return this.b;
        }

        public final void writeTo(akke akke) {
            akke.a(akko.a(this.a.e()));
        }
    }

    static akho a(MediaType mediaType) {
        return mediaType == null ? null : akho.a(mediaType.toString());
    }

    public static a a(a aVar, Map<String, String> map) {
        for (Entry entry : map.entrySet()) {
            aVar.b((String) entry.getKey(), (String) entry.getValue());
        }
        return aVar;
    }

    public static akhv a(akht akht, saq<sai> saq, sar sar) {
        if (((saq) Preconditions.checkNotNull(saq)).f == null) {
            try {
                akhv.a aVar = new akhv.a();
                aVar.a = (akht) Preconditions.checkNotNull(akht);
                aVar.c = saq.b;
                sai sai = (sai) saq.h;
                aVar.g = sai == null ? null : akhw.a(gmk.a(sai.b()), sai.c(), akko.a(akko.a(sai.e())));
                aVar = aVar.a(akhl.a(saq.a));
                String str = saq.e;
                Object obj = "";
                if (str == null) {
                    str = auh.a(obj);
                }
                aVar.d = str;
                aVar.l = sar.f.c;
                aVar.k = sar.e.c;
                aVar.b = akhr.HTTP_1_1;
                return aVar.a();
            } catch (Exception e) {
                throw gmk.a(akht, e);
            }
        }
        throw gmk.a((akht) Preconditions.checkNotNull(akht), saq.f);
    }

    static MediaType a(akho akho) {
        return akho == null ? null : MediaType.parse(akho.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x00a1 in {4, 13, 14, 17, 18, 23, 24, 26, 28, 31} preds:[]
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
    public static defpackage.gmk.b a(defpackage.akhu r9) {
        /*
        r0 = "isauth";
        r1 = 0;
        if (r9 != 0) goto L_0x000b;
        r9 = new gmk$b;	 Catch:{ IOException -> 0x009a }
        r9.<init>(r1, r1);	 Catch:{ IOException -> 0x009a }
        return r9;	 Catch:{ IOException -> 0x009a }
        r2 = r9.contentType();	 Catch:{ IOException -> 0x009a }
        r2 = defpackage.gmk.a(r2);	 Catch:{ IOException -> 0x009a }
        if (r2 == 0) goto L_0x005d;	 Catch:{ IOException -> 0x009a }
        r3 = r2.parameters();	 Catch:{ IOException -> 0x009a }
        r4 = r3.containsKey(r0);	 Catch:{ IOException -> 0x009a }
        if (r4 == 0) goto L_0x005d;	 Catch:{ IOException -> 0x009a }
        r4 = r2.parameters();	 Catch:{ IOException -> 0x009a }
        r0 = r4.get(r0);	 Catch:{ IOException -> 0x009a }
        r4 = r0.isEmpty();	 Catch:{ IOException -> 0x009a }
        if (r4 != 0) goto L_0x0053;	 Catch:{ IOException -> 0x009a }
        r4 = 0;	 Catch:{ IOException -> 0x009a }
        r0 = r0.get(r4);	 Catch:{ IOException -> 0x009a }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x009a }
        r4 = java.lang.Boolean.TRUE;	 Catch:{ IOException -> 0x009a }
        r4 = r4.toString();	 Catch:{ IOException -> 0x009a }
        r4 = r0.equalsIgnoreCase(r4);	 Catch:{ IOException -> 0x009a }
        if (r4 == 0) goto L_0x0044;	 Catch:{ IOException -> 0x009a }
        r0 = java.lang.Boolean.TRUE;	 Catch:{ IOException -> 0x009a }
        r1 = r0;	 Catch:{ IOException -> 0x009a }
        goto L_0x0053;	 Catch:{ IOException -> 0x009a }
        r4 = java.lang.Boolean.FALSE;	 Catch:{ IOException -> 0x009a }
        r4 = r4.toString();	 Catch:{ IOException -> 0x009a }
        r0 = r0.equalsIgnoreCase(r4);	 Catch:{ IOException -> 0x009a }
        if (r0 == 0) goto L_0x0053;	 Catch:{ IOException -> 0x009a }
        r0 = java.lang.Boolean.FALSE;	 Catch:{ IOException -> 0x009a }
        goto L_0x0042;	 Catch:{ IOException -> 0x009a }
        r0 = defpackage.-$$Lambda$gmk$-6MFwfFsZ53sUyOigRG4hovFu1o.INSTANCE;	 Catch:{ IOException -> 0x009a }
        r0 = com.google.common.collect.Multimaps.filterKeys(r3, r0);	 Catch:{ IOException -> 0x009a }
        r2 = r2.withParameters(r0);	 Catch:{ IOException -> 0x009a }
        r6 = r1;	 Catch:{ IOException -> 0x009a }
        r1 = r2;	 Catch:{ IOException -> 0x009a }
        r2 = r9.contentLength();	 Catch:{ IOException -> 0x009a }
        r0 = new akkd;	 Catch:{ IOException -> 0x009a }
        r0.<init>();	 Catch:{ IOException -> 0x009a }
        r9.writeTo(r0);	 Catch:{ IOException -> 0x009a }
        r4 = defpackage.sbe.a.a(r0);	 Catch:{ IOException -> 0x009a }
        r0 = r9 instanceof defpackage.gjo;	 Catch:{ IOException -> 0x009a }
        if (r0 == 0) goto L_0x008f;	 Catch:{ IOException -> 0x009a }
        r7 = new gmk$b;	 Catch:{ IOException -> 0x009a }
        r8 = new gmk$a;	 Catch:{ IOException -> 0x009a }
        r0 = r9 instanceof defpackage.gjo;	 Catch:{ IOException -> 0x009a }
        if (r0 == 0) goto L_0x0082;	 Catch:{ IOException -> 0x009a }
        r9 = (defpackage.gjo) r9;	 Catch:{ IOException -> 0x009a }
        r9 = r9.a();	 Catch:{ IOException -> 0x009a }
        goto L_0x0086;	 Catch:{ IOException -> 0x009a }
        r9 = java.util.Collections.emptyMap();	 Catch:{ IOException -> 0x009a }
        r5 = r9;	 Catch:{ IOException -> 0x009a }
        r0 = r8;	 Catch:{ IOException -> 0x009a }
        r0.<init>(r1, r2, r4, r5);	 Catch:{ IOException -> 0x009a }
        r7.<init>(r8, r6);	 Catch:{ IOException -> 0x009a }
        return r7;	 Catch:{ IOException -> 0x009a }
        r9 = new gmk$b;	 Catch:{ IOException -> 0x009a }
        r0 = new sbl;	 Catch:{ IOException -> 0x009a }
        r0.<init>(r1, r2, r4);	 Catch:{ IOException -> 0x009a }
        r9.<init>(r0, r6);	 Catch:{ IOException -> 0x009a }
        return r9;
        r9 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r9);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmk.a(akhu):gmk$b");
    }

    public static IOException a(akht akht, Throwable th) {
        List list = akht.a.d;
        return new gly(String.format("request fail: %s/%s/%s", new Object[]{akht.a.b, gmk.a(list, 0), gmk.a(list, 1)}), th);
    }

    private static String a(List<String> list, int i) {
        return i < list.size() ? (String) list.get(i) : null;
    }

    public static rzt a(Map<String, String> map) {
        akgw a = akgw.a(akhl.a((Map) map));
        return new rzt(a.a, a.b, a.c, a.d, a.e, a.f, a.g, a.h, a.i, a.j, a.k, a.l);
    }
}
