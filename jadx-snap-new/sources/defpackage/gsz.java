package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: gsz */
public final class gsz implements gqy {
    final Context a;
    final ajwy<gte> b;
    final ajwy<abkm> c;
    private final ajwy<gtd> d;

    /* renamed from: gsz$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ gsz a;
        private /* synthetic */ File b;
        private /* synthetic */ File c;
        private /* synthetic */ String d;

        a(gsz gsz, File file, File file2, String str) {
            this.a = gsz;
            this.b = file;
            this.c = file2;
            this.d = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x00ae in {2, 5, 7, 9} preds:[]
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
        public final /* synthetic */ java.lang.Object call() {
            /*
            r19 = this;
            r0 = r19;
            r1 = new java.io.ByteArrayOutputStream;
            r1.<init>();
            r2 = new abri;
            r3 = r1;
            r3 = (java.io.OutputStream) r3;
            r2.<init>(r3);
            r3 = r0.b;
            r3 = r3.getName();
            r4 = r0.b;
            r4 = r4.getPath();
            r2.a(r3, r4);
            r2.close();
            r1 = r1.toByteArray();
            r2 = 2;
            r7 = android.util.Base64.encodeToString(r1, r2);
            r1 = r0.c;
            r1 = r1.exists();
            r2 = 1;
            if (r1 != r2) goto L_0x003f;
            r1 = r0.c;
            r2 = java.nio.charset.Charset.defaultCharset();
            r1 = defpackage.akkz.a(r1, r2);
            r10 = r1;
            goto L_0x0044;
            if (r1 != 0) goto L_0x00a8;
            r1 = "";
            goto L_0x003d;
            r4 = r0.d;
            r5 = defpackage.ailp.NATIVE;
            r1 = "encodedCrashDumpFile";
            defpackage.akcr.a(r7, r1);
            r8 = java.lang.System.currentTimeMillis();
            r1 = new java.util.ArrayList;
            r1.<init>();
            r11 = r1;
            r11 = (java.util.List) r11;
            r1 = new java.util.ArrayList;
            r1.<init>();
            r12 = r1;
            r12 = (java.util.List) r12;
            r1 = r0.a;
            r1 = r1.a;
            r13 = defpackage.absh.a(r1);
            r1 = "ScApplicationInfo.getVersionName(context)";
            defpackage.akcr.a(r13, r1);
            r1 = r0.a;
            r1 = r1.b;
            r1 = r1.get();
            r1 = (defpackage.gte) r1;
            r14 = r1.a();
            r1 = r0.a;
            r1 = r1.b;
            r1 = r1.get();
            r1 = (defpackage.gte) r1;
            r15 = r1.b();
            r1 = r0.a;
            r1 = r1.c;
            r1 = r1.get();
            r2 = "crashUserDataProvider.get()";
            defpackage.akcr.a(r1, r2);
            r1 = (defpackage.abkm) r1;
            r17 = r1.c();
            r1 = new gtb;
            r18 = 0;
            r6 = "Native Crash";
            r3 = r1;
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r17, r18);
            return r1;
            r1 = new ajxk;
            r1.<init>();
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gsz$a.call():java.lang.Object");
        }
    }

    /* renamed from: gsz$b */
    static final class b<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ gsz a;
        private /* synthetic */ String b;
        private /* synthetic */ File c;
        private /* synthetic */ File d;

        /* renamed from: gsz$b$1 */
        static final class 1<T, R> implements ajfc<gtb, ajdb> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                gtb gtb = (gtb) obj;
                akcr.b(gtb, "it");
                return ((gte) this.a.a.b.get()).a(gtb);
            }
        }

        b(gsz gsz, String str, File file, File file2) {
            this.a = gsz;
            this.b = str;
            this.c = file;
            this.d = file2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx e;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            if (bool.booleanValue()) {
                obj = ajdx.c((Callable) new a(this.a, this.c, this.d, this.b));
                akcr.a(obj, "Single.fromCallable {\n  …l\n            )\n        }");
                e = obj.e((ajfc) new 1(this));
            } else {
                e = ajvo.a(ajhn.a);
            }
            return e;
        }
    }

    public gsz(Context context, ajwy<gtd> ajwy, ajwy<gte> ajwy2, ajwy<abkm> ajwy3) {
        akcr.b(context, "context");
        akcr.b(ajwy, "snapAirCrashReportGating");
        akcr.b(ajwy2, "snapAirCrashReporter");
        akcr.b(ajwy3, "crashUserDataProvider");
        this.a = context;
        this.d = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
    }

    public final ajcx a(String str, File file, File file2) {
        akcr.b(str, "crashId");
        akcr.b(file, "breakpadReportFile");
        akcr.b(file2, "ferriteReportFile");
        Object e = ((gtd) this.d.get()).a().e((ajfc) new b(this, str, file, file2));
        akcr.a(e, "snapAirCrashReportGating…      }\n                }");
        return e;
    }
}
