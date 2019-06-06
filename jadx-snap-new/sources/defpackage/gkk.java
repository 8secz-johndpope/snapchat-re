package defpackage;

import com.google.gson.JsonParser;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: gkk */
public final class gkk {
    static final List<String> d = ajym.b((Object[]) new String[]{"https://app.snapchat.com", "https://se.snapchat.com", "https://mvm.snapchat.com", "https://cf.sc-cdn.net", "https://goog.sc-cdn.net", "https://gcdn.sc-cdn.net", "https://storage.googleapis.com", "https://us-east1-aws.api.snapchat.com"});
    final ajxe a = ajxh.a(d.a);
    volatile HashSet<c> b;
    final ajwy<gqr> c;
    private final ajei e = new ajei();
    private final ajxe f;

    /* renamed from: gkk$d */
    static final class d extends akcs implements akbk<JsonParser> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new JsonParser();
        }
    }

    /* renamed from: gkk$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        static String a(String str, String str2) {
            Object obj = Locale.US;
            akcr.a(obj, "Locale.US");
            Object[] objArr = new Object[]{str, str2};
            Object format = String.format(obj, "%s://%s", Arrays.copyOf(objArr, 2));
            akcr.a(format, "java.lang.String.format(locale, format, *args)");
            return format;
        }
    }

    /* renamed from: gkk$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(iew.a, "RoutingRulesManager");
        }
    }

    /* renamed from: gkk$1 */
    static final class 1<T> implements ajfb<String> {
        private /* synthetic */ gkk a;

        1(gkk gkk) {
            this.a = gkk;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x00bd in {6, 7, 8, 12, 23, 24, 27, 28, 29, 31} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ void accept(java.lang.Object r12) {
            /*
            r11 = this;
            r0 = "retryStrategy";
            r1 = "path";
            r2 = "hostname";
            r12 = (java.lang.String) r12;
            r3 = r11.a;
            r4 = r12;	 Catch:{ all -> 0x00bb }
            r4 = (java.lang.CharSequence) r4;	 Catch:{ all -> 0x00bb }
            r5 = 0;	 Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x0019;	 Catch:{ all -> 0x00bb }
            r4 = r4.length();	 Catch:{ all -> 0x00bb }
            if (r4 != 0) goto L_0x0017;	 Catch:{ all -> 0x00bb }
            goto L_0x0019;	 Catch:{ all -> 0x00bb }
            r4 = 0;	 Catch:{ all -> 0x00bb }
            goto L_0x001a;	 Catch:{ all -> 0x00bb }
            r4 = 1;	 Catch:{ all -> 0x00bb }
            if (r4 != 0) goto L_0x00ba;	 Catch:{ all -> 0x00bb }
            r4 = "[]";	 Catch:{ all -> 0x00bb }
            r4 = r12.equals(r4);	 Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x0026;	 Catch:{ all -> 0x00bb }
            goto L_0x00ba;	 Catch:{ all -> 0x00bb }
            r4 = new java.util.HashSet;	 Catch:{ all -> 0x00bb }
            r4.<init>();	 Catch:{ all -> 0x00bb }
            r6 = r3.a;	 Catch:{ Exception -> 0x00a0 }
            r6 = r6.b();	 Catch:{ Exception -> 0x00a0 }
            r6 = (com.google.gson.JsonParser) r6;	 Catch:{ Exception -> 0x00a0 }
            r12 = r6.parse(r12);	 Catch:{ Exception -> 0x00a0 }
            r6 = "parser.parse(newRequestRoutingConfig)";	 Catch:{ Exception -> 0x00a0 }
            defpackage.akcr.a(r12, r6);	 Catch:{ Exception -> 0x00a0 }
            r12 = r12.getAsJsonArray();	 Catch:{ Exception -> 0x00a0 }
            r6 = r12.size();	 Catch:{ Exception -> 0x00a0 }
            if (r5 >= r6) goto L_0x00b8;	 Catch:{ Exception -> 0x00a0 }
            r7 = r12.get(r5);	 Catch:{ Exception -> 0x00a0 }
            r8 = "element";	 Catch:{ Exception -> 0x00a0 }
            defpackage.akcr.a(r7, r8);	 Catch:{ Exception -> 0x00a0 }
            r7 = r7.getAsJsonObject();	 Catch:{ Exception -> 0x00a0 }
            r8 = r7.get(r2);	 Catch:{ Exception -> 0x00a0 }
            r9 = r7.get(r1);	 Catch:{ Exception -> 0x00a0 }
            r7 = r7.get(r0);	 Catch:{ Exception -> 0x00a0 }
            if (r9 == 0) goto L_0x009d;	 Catch:{ Exception -> 0x00a0 }
            if (r8 == 0) goto L_0x009d;	 Catch:{ Exception -> 0x00a0 }
            if (r7 == 0) goto L_0x009d;	 Catch:{ Exception -> 0x00a0 }
            r8 = r8.getAsString();	 Catch:{ Exception -> 0x00a0 }
            r9 = r9.getAsString();	 Catch:{ Exception -> 0x00a0 }
            r10 = defpackage.gkk.b.class;	 Catch:{ Exception -> 0x00a0 }
            r7 = r7.getAsString();	 Catch:{ Exception -> 0x00a0 }
            r7 = defpackage.aklt.a(r10, r7);	 Catch:{ Exception -> 0x00a0 }
            r10 = defpackage.gkk.b.NONE;	 Catch:{ Exception -> 0x00a0 }
            r7 = com.google.common.base.MoreObjects.firstNonNull(r7, r10);	 Catch:{ Exception -> 0x00a0 }
            r7 = (defpackage.gkk.b) r7;	 Catch:{ Exception -> 0x00a0 }
            r10 = defpackage.gkk.d;	 Catch:{ Exception -> 0x00a0 }
            r10 = r10.contains(r8);	 Catch:{ Exception -> 0x00a0 }
            if (r10 == 0) goto L_0x009d;	 Catch:{ Exception -> 0x00a0 }
            defpackage.akcr.a(r9, r1);	 Catch:{ Exception -> 0x00a0 }
            r10 = new akfr;	 Catch:{ Exception -> 0x00a0 }
            r10.<init>(r9);	 Catch:{ Exception -> 0x00a0 }
            defpackage.akcr.a(r8, r2);	 Catch:{ Exception -> 0x00a0 }
            defpackage.akcr.a(r7, r0);	 Catch:{ Exception -> 0x00a0 }
            r9 = new gkk$c;	 Catch:{ Exception -> 0x00a0 }
            r9.<init>(r10, r8, r7);	 Catch:{ Exception -> 0x00a0 }
            r4.add(r9);	 Catch:{ Exception -> 0x00a0 }
            r5 = r5 + 1;
            goto L_0x0044;
            r12 = move-exception;
            r0 = r3.c;	 Catch:{ all -> 0x00bb }
            r0 = r0.get();	 Catch:{ all -> 0x00bb }
            r0 = (defpackage.gqr) r0;	 Catch:{ all -> 0x00bb }
            r1 = defpackage.gqt.HIGH;	 Catch:{ all -> 0x00bb }
            r12 = (java.lang.Throwable) r12;	 Catch:{ all -> 0x00bb }
            r2 = defpackage.iew.a;	 Catch:{ all -> 0x00bb }
            r5 = "RoutingRulesManager";	 Catch:{ all -> 0x00bb }
            r2 = r2.callsite(r5);	 Catch:{ all -> 0x00bb }
            r0.a(r1, r12, r2);	 Catch:{ all -> 0x00bb }
            r3.b = r4;	 Catch:{ all -> 0x00bb }
            return;
            r12 = move-exception;
            throw r12;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gkk$1.accept(java.lang.Object):void");
        }
    }

    /* renamed from: gkk$2 */
    static final class 2<T> implements ajfb<Throwable> {
        public static final 2 a = new 2();

        2() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: gkk$b */
    public enum b {
        NONE,
        FAIL_OVER_TO_DEFAULT
    }

    /* renamed from: gkk$c */
    public static final class c {
        final akfr a;
        final b b;
        private final String c;

        public c(akfr akfr, String str, b bVar) {
            akcr.b(akfr, "path");
            akcr.b(str, "hostname");
            akcr.b(bVar, "retryStrategy");
            this.a = akfr;
            this.c = str;
            this.b = bVar;
        }

        public final String a(String str) {
            akcr.b(str, "originalUrl");
            try {
                URL url = new URL(str);
                Object protocol = url.getProtocol();
                akcr.a(protocol, "url.protocol");
                Object host = url.getHost();
                akcr.a(host, "url.host");
                str = akgb.a(str, a.a(protocol, host), this.c, false);
                return str;
            } catch (MalformedURLException unused) {
                return str;
            }
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.gkk.c;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.gkk.c) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gkk$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            akfr akfr = this.a;
            int i = 0;
            int hashCode = (akfr != null ? akfr.hashCode() : 0) * 31;
            String str = this.c;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            b bVar = this.b;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("RoutingRule(path=");
            stringBuilder.append(this.a);
            stringBuilder.append(", hostname=");
            stringBuilder.append(this.c);
            stringBuilder.append(", retryStrategy=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gkk.class), "parser", "getParser()Lcom/google/gson/JsonParser;"), new akdc(akde.a(gkk.class), "qualifiedScheduler", "getQualifiedScheduler()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
        a aVar = new a();
    }

    public gkk(ftl ftl, zgb zgb, ajwy<gqr> ajwy) {
        akcr.b(ftl, "configurationProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "exceptionTracker");
        this.c = ajwy;
        this.f = ajxh.a(new e(zgb));
        ajej a = ftl.u(rxp.REQUEST_ROUTING_RULES).j(ajfu.a).a((ajdw) ((zfw) this.f.b()).b()).a((ajfb) new 1(this), (ajfb) 2.a);
        akcr.a((Object) a, "configurationProvider.ob… Routing rules config\")})");
        ajvv.a(a, this.e);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0073 in {14, 17, 19, 21} preds:[]
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
    public final defpackage.gkk.c a(java.lang.String r6) {
        /*
        r5 = this;
        r0 = "requestUrl";
        defpackage.akcr.b(r6, r0);
        r0 = r5.b;	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x006f;	 Catch:{ all -> 0x0071 }
        r1 = r0.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r1 != 0) goto L_0x006f;
        r1 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x0057 }
        r1.<init>(r6);	 Catch:{ MalformedURLException -> 0x0057 }
        r2 = r1.getPath();	 Catch:{ MalformedURLException -> 0x0057 }
        r3 = r1.getProtocol();	 Catch:{ MalformedURLException -> 0x0057 }
        r4 = "url.protocol";	 Catch:{ MalformedURLException -> 0x0057 }
        defpackage.akcr.a(r3, r4);	 Catch:{ MalformedURLException -> 0x0057 }
        r1 = r1.getHost();	 Catch:{ MalformedURLException -> 0x0057 }
        r4 = "url.host";	 Catch:{ MalformedURLException -> 0x0057 }
        defpackage.akcr.a(r1, r4);	 Catch:{ MalformedURLException -> 0x0057 }
        r1 = defpackage.gkk.a.a(r3, r1);	 Catch:{ MalformedURLException -> 0x0057 }
        r3 = d;	 Catch:{ MalformedURLException -> 0x0057 }
        r1 = r3.contains(r1);	 Catch:{ MalformedURLException -> 0x0057 }
        if (r1 == 0) goto L_0x006f;	 Catch:{ MalformedURLException -> 0x0057 }
        r0 = r0.iterator();	 Catch:{ MalformedURLException -> 0x0057 }
        r1 = r0.hasNext();	 Catch:{ MalformedURLException -> 0x0057 }
        if (r1 == 0) goto L_0x006f;	 Catch:{ MalformedURLException -> 0x0057 }
        r1 = r0.next();	 Catch:{ MalformedURLException -> 0x0057 }
        r1 = (defpackage.gkk.c) r1;	 Catch:{ MalformedURLException -> 0x0057 }
        r3 = "path";	 Catch:{ MalformedURLException -> 0x0057 }
        defpackage.akcr.a(r2, r3);	 Catch:{ MalformedURLException -> 0x0057 }
        r3 = r2;	 Catch:{ MalformedURLException -> 0x0057 }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ MalformedURLException -> 0x0057 }
        r4 = r1.a;	 Catch:{ MalformedURLException -> 0x0057 }
        r3 = r4.a(r3);	 Catch:{ MalformedURLException -> 0x0057 }
        if (r3 == 0) goto L_0x003a;
        return r1;
        r0 = move-exception;
        r1 = r5.c;	 Catch:{ all -> 0x0071 }
        r1 = r1.get();	 Catch:{ all -> 0x0071 }
        r1 = (defpackage.gqr) r1;	 Catch:{ all -> 0x0071 }
        r2 = defpackage.gqt.HIGH;	 Catch:{ all -> 0x0071 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x0071 }
        r3 = defpackage.iew.a;	 Catch:{ all -> 0x0071 }
        r4 = "RoutingRulesManager";	 Catch:{ all -> 0x0071 }
        r3 = r3.callsite(r4);	 Catch:{ all -> 0x0071 }
        r1.a(r2, r0, r3, r6);	 Catch:{ all -> 0x0071 }
        r6 = 0;
        return r6;
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkk.a(java.lang.String):gkk$c");
    }
}
