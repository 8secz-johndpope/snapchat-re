package defpackage;

import android.net.Uri;
import defpackage.myl.a.a;
import defpackage.twa.b;
import defpackage.twa.c;

/* renamed from: lkv */
public final class lkv implements twa {
    final akbl<String, Uri> a;
    private final ajdp<b> b;
    private final ajfb<c> c;

    /* renamed from: lkv$1 */
    static final class 1 extends akcq implements akbl<String, Uri> {
        public static final 1 a = new 1();

        1() {
            super(1);
        }

        public final String getName() {
            return "parse";
        }

        public final akej getOwner() {
            return akde.a(Uri.class);
        }

        public final String getSignature() {
            return "parse(Ljava/lang/String;)Landroid/net/Uri;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Uri.parse((String) obj);
        }
    }

    /* renamed from: lkv$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ lkv a;

        a(lkv lkv) {
            this.a = lkv;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0073 in {7, 8, 9, 12, 13, 15, 17} preds:[]
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
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (defpackage.myl.b) r7;
            r0 = "result";
            defpackage.akcr.b(r7, r0);
            r0 = r7 instanceof defpackage.myl.b.a;
            if (r0 == 0) goto L_0x006d;
            r7 = (defpackage.myl.b.a) r7;
            r0 = r7.b;
            r0 = (java.lang.Iterable) r0;
            r1 = new java.util.ArrayList;
            r2 = 10;
            r2 = defpackage.ajyn.a(r0, r2);
            r1.<init>(r2);
            r1 = (java.util.Collection) r1;
            r0 = r0.iterator();
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x0059;
            r2 = r0.next();
            r2 = (defpackage.mux) r2;
            r3 = r6.a;
            r4 = r2.a;
            r4 = r4.a;
            r2 = r2.f;
            r5 = r2 instanceof defpackage.miq.e;
            if (r5 == 0) goto L_0x0049;
            r3 = r3.a;
            r2 = (defpackage.miq.e) r2;
            r2 = r2.a();
            r2 = r3.invoke(r2);
            r2 = (android.net.Uri) r2;
            goto L_0x004b;
            r2 = android.net.Uri.EMPTY;
            r3 = "iconUri.let {\n          …          }\n            }";
            defpackage.akcr.a(r2, r3);
            r3 = new twa$a;
            r3.<init>(r4, r2);
            r1.add(r3);
            goto L_0x0022;
            r1 = (java.util.List) r1;
            r7 = r7.a;
            r0 = r7 instanceof defpackage.mhs.b;
            if (r0 == 0) goto L_0x0066;
            r7 = (defpackage.mhs.b) r7;
            r7 = r7.a;
            goto L_0x0067;
            r7 = 0;
            r0 = new twa$b;
            r0.<init>(r1, r7);
            return r0;
            r7 = new ajxk;
            r7.<init>();
            throw r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lkv$a.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: lkv$b */
    static final class b<T> implements ajfb<c> {
        private /* synthetic */ myl a;

        b(myl myl) {
            this.a = myl;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a().accept(new a(new defpackage.mhs.b(((c) obj).a)));
        }
    }

    public /* synthetic */ lkv(myl myl) {
        this(myl, 1.a);
    }

    private lkv(myl myl, akbl<? super String, ? extends Uri> akbl) {
        akcr.b(myl, "carouselUseCase");
        akcr.b(akbl, "uriParser");
        this.a = akbl;
        this.b = myl.b().p(new a(this));
        this.c = new b(myl);
    }

    public final ajdp<b> a() {
        return this.b;
    }

    public final ajfb<c> b() {
        return this.c;
    }
}
