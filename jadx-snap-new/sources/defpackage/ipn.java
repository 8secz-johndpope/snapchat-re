package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snap.ui.avatar.AvatarView;
import com.snapchat.android.R;

/* renamed from: ipn */
public final class ipn {
    final LayoutInflater a;
    final ViewGroup b;
    final ipi c;
    private final SparseArray<View> d = new SparseArray();
    private final SparseArray<ajej> e = new SparseArray();
    private final ajxe f;
    private final ajxe g;
    private final ipv h;
    private final zgk<b> i;

    /* renamed from: ipn$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        d(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(ipk.a.callsite("prefetch"));
        }
    }

    /* renamed from: ipn$c */
    static final class c extends akcs implements akbk<zmv> {
        private /* synthetic */ ipn a;

        c(ipn ipn) {
            this.a = ipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zmv(this.a.a().h(), this.a.a, this.a.b);
        }
    }

    /* renamed from: ipn$a */
    static final class a<T> implements ajfb<View> {
        private /* synthetic */ ipn a;
        private /* synthetic */ int b;

        a(ipn ipn, int i) {
            this.a = ipn;
            this.b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (View) obj;
            ipn ipn = this.a;
            int i = this.b;
            akcr.a(obj, "view");
            ipn.a(i, obj);
        }
    }

    /* renamed from: ipn$b */
    static final class b<T> implements ajfb<View> {
        private /* synthetic */ ipn a;
        private /* synthetic */ zjm b;

        b(ipn ipn, zjm zjm) {
            this.a = ipn;
            this.b = zjm;
        }

        public final /* synthetic */ void accept(Object obj) {
            AvatarView avatarView = (AvatarView) ((View) obj).findViewById(R.id.neon_header_avatar);
            if (avatarView != null) {
                this.a.c.a(avatarView, this.b);
            }
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ipn.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ipn.class), "prefetcher", "getPrefetcher()Lcom/snap/ui/recycling/prefetch/CompletableViewPrefetcher;")};
    }

    public ipn(Context context, ViewGroup viewGroup, ipv ipv, ipi ipi, zgb zgb, zgk<b> zgk) {
        akcr.b(context, "context");
        akcr.b(viewGroup, "parent");
        akcr.b(ipv, "specs");
        akcr.b(ipi, "avatarAndStoriesManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "scoper");
        this.b = viewGroup;
        this.h = ipv;
        this.c = ipi;
        this.i = zgk;
        Object from = LayoutInflater.from(context);
        akcr.a(from, "LayoutInflater.from(context)");
        this.a = from;
        this.f = ajxh.a(new d(zgb));
        this.g = ajxh.a(new c(this));
    }

    public final synchronized View a(int i) {
        if (this.d.get(i) != null) {
            Object obj = this.d.get(i);
            akcr.a(obj, "inflatedViews[layoutId]");
            return (View) obj;
        }
        if (this.e.get(i) != null) {
            ((ajej) this.e.get(i)).dispose();
            this.e.remove(i);
        }
        Object inflate = this.a.inflate(i, this.b, false);
        this.d.put(i, inflate);
        akcr.a(inflate, "view");
        return inflate;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.f.b();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(int i, View view) {
        if (this.d.get(i) == null) {
            this.d.put(i, view);
        }
        this.e.remove(i);
    }

    /* JADX WARNING: Missing block: B:13:0x0067, code skipped:
            return;
     */
    public final synchronized void a(defpackage.zjm r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = "pageType";
        defpackage.akcr.b(r4, r0);	 Catch:{ all -> 0x0068 }
        r0 = r3.h;	 Catch:{ all -> 0x0068 }
        r0 = r0.b(r4);	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x0066;
    L_0x000e:
        r1 = r3.e;	 Catch:{ all -> 0x0068 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0068 }
        if (r1 != 0) goto L_0x0066;
    L_0x0016:
        r1 = r3.d;	 Catch:{ all -> 0x0068 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0068 }
        if (r1 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0066;
    L_0x001f:
        r1 = r3.g;	 Catch:{ all -> 0x0068 }
        r1 = r1.b();	 Catch:{ all -> 0x0068 }
        r1 = (defpackage.zmv) r1;	 Catch:{ all -> 0x0068 }
        r1 = r1.b(r0);	 Catch:{ all -> 0x0068 }
        r2 = new ipn$a;	 Catch:{ all -> 0x0068 }
        r2.<init>(r3, r0);	 Catch:{ all -> 0x0068 }
        r2 = (defpackage.ajfb) r2;	 Catch:{ all -> 0x0068 }
        r1 = r1.c(r2);	 Catch:{ all -> 0x0068 }
        r2 = r3.a();	 Catch:{ all -> 0x0068 }
        r2 = r2.l();	 Catch:{ all -> 0x0068 }
        r2 = (defpackage.zfr) r2;	 Catch:{ all -> 0x0068 }
        r2 = (defpackage.ajdw) r2;	 Catch:{ all -> 0x0068 }
        r1 = r1.a(r2);	 Catch:{ all -> 0x0068 }
        r2 = new ipn$b;	 Catch:{ all -> 0x0068 }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x0068 }
        r2 = (defpackage.ajfb) r2;	 Catch:{ all -> 0x0068 }
        r4 = r1.e(r2);	 Catch:{ all -> 0x0068 }
        r1 = "prefetcher.load<View>(la…      }\n                }";
        defpackage.akcr.a(r4, r1);	 Catch:{ all -> 0x0068 }
        r1 = r3.e;	 Catch:{ all -> 0x0068 }
        r1.put(r0, r4);	 Catch:{ all -> 0x0068 }
        r0 = r3.i;	 Catch:{ all -> 0x0068 }
        r1 = com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY;	 Catch:{ all -> 0x0068 }
        r2 = "hova-prefetch";
        defpackage.ipo.a(r4, r0, r1, r2);	 Catch:{ all -> 0x0068 }
        monitor-exit(r3);
        return;
    L_0x0066:
        monitor-exit(r3);
        return;
    L_0x0068:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipn.a(zjm):void");
    }

    public final synchronized void b(int i) {
        this.d.remove(i);
    }
}
