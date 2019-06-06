package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.common.base.Optional;

/* renamed from: gdi */
public final class gdi implements ifb {
    final Context a;
    final Optional<aabe> b;
    private final ajxe c = ajxh.a(new d(this));
    private final ajxe d = ajxh.a(new a(this));
    private final ajxe e = ajxh.a(new b(this));
    private final ajxe f = ajxh.a(new c(this));
    private final ajxe g = ajxh.a(new f(this));
    private final ajxe h = ajxh.a(new e(this));

    /* renamed from: gdi$d */
    static final class d extends akcs implements akbk<Context> {
        private /* synthetic */ gdi a;

        d(gdi gdi) {
            this.a = gdi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getApplicationContext();
        }
    }

    /* renamed from: gdi$a */
    static final class a extends akcs implements akbk<String> {
        private /* synthetic */ gdi a;

        a(gdi gdi) {
            this.a = gdi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aabe aabe = (aabe) this.a.b.orNull();
            if (aabe != null) {
                String name = aabe.name();
                if (name != null) {
                    return name;
                }
            }
            return "UNKNOWN";
        }
    }

    /* renamed from: gdi$b */
    static final class b extends akcs implements akbk<String> {
        private /* synthetic */ gdi a;

        b(gdi gdi) {
            this.a = gdi;
            super(0);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x006c in {7, 8, 10, 11, 15, 17} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke() {
            /*
            r5 = this;
            r0 = r5.a;
            r0 = r0.a();
            r1 = "versionName";
            defpackage.akcr.a(r0, r1);
            r0 = (java.lang.CharSequence) r0;
            r1 = " ";
            r1 = new java.lang.String[]{r1};
            r2 = 0;
            r3 = 6;
            r0 = defpackage.akgc.a(r0, r1, r2, r3);
            r1 = r0.isEmpty();
            if (r1 != 0) goto L_0x004d;
            r1 = r0.size();
            r1 = r0.listIterator(r1);
            r3 = r1.hasPrevious();
            if (r3 == 0) goto L_0x004d;
            r3 = r1.previous();
            r3 = (java.lang.String) r3;
            r3 = (java.lang.CharSequence) r3;
            r3 = r3.length();
            r4 = 1;
            if (r3 != 0) goto L_0x003e;
            r3 = 1;
            goto L_0x003f;
            r3 = 0;
            if (r3 != 0) goto L_0x0027;
            r0 = (java.lang.Iterable) r0;
            r1 = r1.nextIndex();
            r1 = r1 + r4;
            r0 = defpackage.ajyu.c(r0, r1);
            goto L_0x0051;
            r0 = defpackage.ajyw.a;
            r0 = (java.util.List) r0;
            r0 = r0.get(r2);
            r0 = (java.lang.String) r0;
            if (r0 == 0) goto L_0x0064;
            r0 = (java.lang.CharSequence) r0;
            r0 = defpackage.akgc.b(r0);
            r0 = r0.toString();
            return r0;
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type kotlin.CharSequence";
            r0.<init>(r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gdi$b.invoke():java.lang.Object");
        }
    }

    /* renamed from: gdi$c */
    static final class c extends akcs implements akbk<String> {
        private /* synthetic */ gdi a;

        c(gdi gdi) {
            this.a = gdi;
            super(0);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x007d in {7, 8, 10, 11, 15, 17} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke() {
            /*
            r10 = this;
            r0 = r10.a;
            r0 = r0.a();
            r1 = "versionName";
            defpackage.akcr.a(r0, r1);
            r0 = (java.lang.CharSequence) r0;
            r1 = " ";
            r2 = new java.lang.String[]{r1};
            r3 = 0;
            r4 = 6;
            r0 = defpackage.akgc.a(r0, r2, r3, r4);
            r2 = r0.isEmpty();
            r4 = 1;
            if (r2 != 0) goto L_0x004d;
            r2 = r0.size();
            r2 = r0.listIterator(r2);
            r5 = r2.hasPrevious();
            if (r5 == 0) goto L_0x004d;
            r5 = r2.previous();
            r5 = (java.lang.String) r5;
            r5 = (java.lang.CharSequence) r5;
            r5 = r5.length();
            if (r5 != 0) goto L_0x003e;
            r5 = 1;
            goto L_0x003f;
            r5 = 0;
            if (r5 != 0) goto L_0x0028;
            r0 = (java.lang.Iterable) r0;
            r2 = r2.nextIndex();
            r2 = r2 + r4;
            r0 = defpackage.ajyu.c(r0, r2);
            goto L_0x0051;
            r0 = defpackage.ajyw.a;
            r0 = (java.util.List) r0;
            r0 = (java.lang.Iterable) r0;
            r0 = defpackage.ajyu.b(r0, r4);
            r2 = r0;
            r2 = (java.lang.Iterable) r2;
            r3 = r1;
            r3 = (java.lang.CharSequence) r3;
            r4 = 0;
            r5 = 0;
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r9 = 62;
            r0 = defpackage.ajyu.a(r2, r3, r4, r5, r6, r7, r8, r9);
            if (r0 == 0) goto L_0x0075;
            r0 = (java.lang.CharSequence) r0;
            r0 = defpackage.akgc.b(r0);
            r0 = r0.toString();
            return r0;
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type kotlin.CharSequence";
            r0.<init>(r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gdi$c.invoke():java.lang.Object");
        }
    }

    /* renamed from: gdi$f */
    static final class f extends akcs implements akbk<String> {
        private /* synthetic */ gdi a;

        f(gdi gdi) {
            this.a = gdi;
            super(0);
        }

        private String a() {
            try {
                return ((Context) this.a.c.b()).getPackageManager().getPackageInfo(((Context) this.a.c.b()).getPackageName(), 0).versionName;
            } catch (Exception e) {
                if ((e instanceof NameNotFoundException) || (e instanceof NullPointerException)) {
                    return "3.0.2";
                }
                throw e;
            }
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: gdi$e */
    static final class e extends akcs implements akbk<String> {
        private /* synthetic */ gdi a;

        e(gdi gdi) {
            this.a = gdi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String str;
            if (!this.a.b.isPresent() || ((aabe) this.a.b.get()) == aabe.OG) {
                str = "";
            } else {
                StringBuilder stringBuilder = new StringBuilder("V/");
                stringBuilder.append((aabe) this.a.b.get());
                str = stringBuilder.toString();
            }
            StringBuilder stringBuilder2 = new StringBuilder("Snapchat/");
            stringBuilder2.append(this.a.a());
            stringBuilder2.append(" (");
            stringBuilder2.append(Build.MODEL);
            stringBuilder2.append("; Android ");
            stringBuilder2.append(VERSION.RELEASE);
            stringBuilder2.append('#');
            stringBuilder2.append(VERSION.INCREMENTAL);
            stringBuilder2.append('#');
            stringBuilder2.append(VERSION.SDK_INT);
            stringBuilder2.append("; gzip) ");
            stringBuilder2.append(str);
            str = stringBuilder2.toString();
            if (str != null) {
                return akgc.b(str).toString();
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gdi.class), "context", "getContext()Landroid/content/Context;"), new akdc(akde.a(gdi.class), "appVariantValue", "getAppVariantValue()Ljava/lang/String;"), new akdc(akde.a(gdi.class), "appVersionNumberValue", "getAppVersionNumberValue()Ljava/lang/String;"), new akdc(akde.a(gdi.class), "appVersionSuffixValue", "getAppVersionSuffixValue()Ljava/lang/String;"), new akdc(akde.a(gdi.class), "versionName", "getVersionName()Ljava/lang/String;"), new akdc(akde.a(gdi.class), "userAgentStringValue", "getUserAgentStringValue()Ljava/lang/String;")};
    }

    public gdi(Context context, Optional<aabe> optional) {
        akcr.b(context, "applicationContext");
        akcr.b(optional, "appVariantOptional");
        this.a = context;
        this.b = optional;
    }

    public final String a() {
        return (String) this.g.b();
    }

    public final String b() {
        return (String) this.h.b();
    }

    public final String c() {
        return (String) this.d.b();
    }

    public final String d() {
        return acbr.JAVASCRIPT_INTERFACE_NAME;
    }

    public final String e() {
        return Build.MODEL;
    }

    public final String f() {
        return VERSION.RELEASE;
    }

    public final String g() {
        return VERSION.INCREMENTAL;
    }

    public final String h() {
        return (String) this.e.b();
    }

    public final String i() {
        return (String) this.f.b();
    }

    public final String j() {
        return b();
    }

    public final String k() {
        CharSequence i = i();
        Object obj = (i == null || akgb.a(i)) ? 1 : null;
        return obj != null ? "PROD" : i();
    }
}
