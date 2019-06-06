package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rpj */
public final class rpj {
    final akbk<ajxw> a;
    final akbl<Throwable, ajxw> b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private final List<String> g = new ArrayList();
    private final String h;
    private final Handler i;
    private final Integer j;

    /* renamed from: rpj$a */
    static final class a implements Runnable {
        private /* synthetic */ rpj a;

        a(rpj rpj) {
            this.a = rpj;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0020 in {1, 3, 11, 13} preds:[]
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
        public final void run() {
            /*
            r2 = this;
            r0 = r2.a;	 Catch:{ Throwable -> 0x000f }
            r0 = r0.a;	 Catch:{ Throwable -> 0x000f }
            r0.invoke();	 Catch:{ Throwable -> 0x000f }
            r0 = r2.a;
            r0.b();
            return;
            r0 = move-exception;
            goto L_0x001a;
            r0 = move-exception;
            r1 = r2.a;	 Catch:{ all -> 0x000d }
            r1 = r1.b;	 Catch:{ all -> 0x000d }
            if (r1 == 0) goto L_0x0007;	 Catch:{ all -> 0x000d }
            r1.invoke(r0);	 Catch:{ all -> 0x000d }
            goto L_0x0007;
            r1 = r2.a;
            r1.b();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rpj$a.run():void");
        }
    }

    public rpj(String str, Handler handler, akbk<ajxw> akbk, Integer num, akbl<? super Throwable, ajxw> akbl) {
        akcr.b(str, "tag");
        akcr.b(handler, "handler");
        akcr.b(akbk, "callback");
        this.h = str;
        this.i = handler;
        this.a = akbk;
        this.j = num;
        this.b = akbl;
    }

    private final synchronized void c() {
        if (!this.e) {
            if (this.j == null || akcr.a(this.f, this.j.intValue()) < 0) {
                this.c = true;
                this.d = false;
                this.i.post(new a(this));
                return;
            }
            akbl akbl = this.b;
            if (akbl != null) {
                StringBuilder stringBuilder = new StringBuilder("Maximum of ");
                stringBuilder.append(this.j);
                stringBuilder.append(" consecutive runs reached for ");
                stringBuilder.append(this.h);
                stringBuilder.append("! Requests leading to this: ");
                stringBuilder.append(ajyu.a((Iterable) this.g, null, null, null, 0, null, null, 63));
                akbl.invoke(new IllegalStateException(stringBuilder.toString()));
            }
        }
    }

    public final synchronized void a() {
        this.e = true;
    }

    public final synchronized void a(String str) {
        akcr.b(str, "callsite");
        if (!this.e) {
            this.g.add(str);
            if (this.c) {
                this.d = true;
            } else {
                c();
            }
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        if (!this.e) {
            this.c = false;
            if (this.d) {
                this.f++;
                c();
                return;
            }
            this.f = 0;
            this.g.clear();
        }
    }
}
