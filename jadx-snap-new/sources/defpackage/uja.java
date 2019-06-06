package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: uja */
public final class uja {
    static final String f = f;
    public zmf a;
    public boolean b;
    public final Context c;
    public final ajei d;
    public final RecyclerView e;
    private final ajxe g = ajxh.a(b.a);
    private final ajxe h = ajxh.a(new h(this));
    private ujc i = ujc.DEFAULT;
    private final ajxe j = ajxh.a(c.a);
    private Uri k;
    private final zgb l;

    /* renamed from: uja$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: uja$f */
    static final class f<V> implements Callable<T> {
        private /* synthetic */ uja a;

        f(uja uja) {
            this.a = uja;
        }

        public final /* synthetic */ Object call() {
            ujc[] a = this.a.a();
            Collection arrayList = new ArrayList(a.length);
            for (ujc a2 : a) {
                arrayList.add(uja.a(this.a, a2));
            }
            return new znf((List) arrayList);
        }
    }

    /* renamed from: uja$i */
    static final class i<V> implements Callable<T> {
        private /* synthetic */ uja a;

        i(uja uja) {
            this.a = uja;
        }

        public final /* synthetic */ Object call() {
            ujc[] a = this.a.a();
            Collection arrayList = new ArrayList(a.length);
            for (ujc a2 : a) {
                arrayList.add(uja.a(this.a, a2));
            }
            return new znf((List) arrayList);
        }
    }

    /* renamed from: uja$d */
    public static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ uja a;

        public d(uja uja) {
            this.a = uja;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ujc[] ujcArr = (ujc[]) obj;
            akcr.b(ujcArr, "it");
            Collection arrayList = new ArrayList(ujcArr.length);
            for (ujc a : ujcArr) {
                arrayList.add(uja.a(this.a, a));
            }
            return new znf((List) arrayList);
        }
    }

    /* renamed from: uja$e */
    public static final class e<T> implements ajfb<znf<uji>> {
        private /* synthetic */ uja a;

        public e(uja uja) {
            this.a = uja;
        }

        public final /* synthetic */ void accept(Object obj) {
            uja.a(this.a).a((znh) (znf) obj);
        }
    }

    /* renamed from: uja$g */
    static final class g<T> implements ajfb<znf<uji>> {
        private /* synthetic */ uja a;

        g(uja uja) {
            this.a = uja;
        }

        public final /* synthetic */ void accept(Object obj) {
            uja.a(this.a).a((znh) (znf) obj);
        }
    }

    /* renamed from: uja$j */
    static final class j<T> implements ajfb<znf<uji>> {
        private /* synthetic */ uja a;

        j(uja uja) {
            this.a = uja;
        }

        public final /* synthetic */ void accept(Object obj) {
            uja.a(this.a).a((znh) (znf) obj);
        }
    }

    /* renamed from: uja$b */
    static final class b extends akcs implements akbk<ujc[]> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ujc.values();
        }
    }

    /* renamed from: uja$c */
    static final class c extends akcs implements akbk<HashMap<ujc, Integer>> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            r0 = new ajxm[6];
            ujc ujc = ujc.BRUSH;
            Integer valueOf = Integer.valueOf(R.drawable.brush_picker_brush);
            r0[1] = ajxs.a(ujc, valueOf);
            r0[2] = ajxs.a(ujc.GLOW, Integer.valueOf(R.drawable.brush_picker_glow));
            r0[3] = ajxs.a(ujc.EMOJI, valueOf);
            r0[4] = ajxs.a(ujc.RAINBOW, Integer.valueOf(R.drawable.brush_picker_rainbow));
            r0[5] = ajxs.a(ujc.ERASER, Integer.valueOf(R.drawable.brush_picker_eraser));
            return ajzm.c(r0);
        }
    }

    /* renamed from: uja$h */
    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ uja a;

        h(uja uja) {
            this.a = uja;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d.callsite(uja.f));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(uja.class), "brushStyles", "getBrushStyles()[Lcom/snap/previewtools/drawv2/ui/BrushType;"), new akdc(akde.a(uja.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(uja.class), "brushStylesToIcons", "getBrushStylesToIcons()Ljava/util/HashMap;")};
        a aVar = new a();
    }

    public uja(Context context, zgb zgb, ajei ajei, RecyclerView recyclerView) {
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajei, "toolDisposal");
        akcr.b(recyclerView, "recyclerView");
        this.c = context;
        this.l = zgb;
        this.d = ajei;
        this.e = recyclerView;
    }

    public static final /* synthetic */ uji a(uja uja, ujc ujc) {
        boolean z = false;
        if (ujb.a[ujc.ordinal()] != 1) {
            Integer num = (Integer) ((HashMap) uja.j.b()).get(ujc);
            if (num == null) {
                num = null;
            }
            if (ujc == uja.i) {
                z = true;
            }
            return new uji(ujc, num, null, z);
        }
        Uri uri = uja.k;
        if (ujc == uja.i) {
            z = true;
        }
        return new uji(ujc, null, uri, z);
    }

    public final void a(int i) {
        if (this.e.getVisibility() != i) {
            this.e.setVisibility(i);
        }
    }

    public final void a(abqd abqd) {
        akcr.b(abqd, "emojiIdentifier");
        this.k = ftu.a(abqd);
        ajej e = ajdx.c((Callable) new i(this)).b((ajdw) b().h()).a((ajdw) b().l()).e((ajfb) new j(this));
        akcr.a((Object) e, "Single.fromCallable {\n  …er.updateViewModels(it) }");
        ajvv.a(e, this.d);
    }

    public final ujc[] a() {
        return (ujc[]) this.g.b();
    }

    public final zfw b() {
        return (zfw) this.h.b();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onBrushItemClicked(ujg ujg) {
        akcr.b(ujg, "event");
        if (this.i == ujg.a.a) {
            return;
        }
        if (this.b || ujg.a.a != ujc.ERASER) {
            this.i = ujg.a.a;
            ajej e = ajdx.c((Callable) new f(this)).b((ajdw) b().h()).a((ajdw) b().l()).e((ajfb) new g(this));
            akcr.a((Object) e, "Single.fromCallable {\n  …er.updateViewModels(it) }");
            ajvv.a(e, this.d);
        }
    }
}
