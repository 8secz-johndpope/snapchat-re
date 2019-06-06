package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snapchat.android.R;

/* renamed from: ttw */
public final class ttw extends zly<tqj, tud> {
    TextView a;
    private final ajxe b = ajxh.a(new g(this));

    /* renamed from: ttw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ttw$b */
    static final class b<T> implements ajfl<MotionEvent> {
        private /* synthetic */ ttw a;

        b(ttw ttw) {
            this.a = ttw;
        }

        public final /* synthetic */ boolean test(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            akcr.b(motionEvent, "it");
            if (motionEvent.getAction() == 0) {
                ttw ttw = this.a;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                Rect rect = new Rect();
                TextView textView = ttw.a;
                if (textView != null) {
                    textView.getGlobalVisibleRect(rect);
                }
                if (rect.contains(x, y)) {
                    LinearLayoutManager linearLayoutManager = ((tqj) this.a.e()).a;
                    Object obj2 = null;
                    obj = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
                    LinearLayoutManager linearLayoutManager2 = ((tqj) this.a.e()).a;
                    if (linearLayoutManager2 != null) {
                        obj2 = Integer.valueOf(linearLayoutManager2.getPosition(this.a.getItemView()));
                    }
                    if (akcr.a(obj, obj2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: ttw$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ttw a;

        /* renamed from: ttw$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Optional optional = (Optional) obj;
                akcr.b(optional, "it");
                return (Boolean) optional.or(Boolean.FALSE);
            }
        }

        c(ttw ttw) {
            this.a = ttw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((MotionEvent) obj, "it");
            return ((tqj) this.a.e()).p.a(((tqj) this.a.e()).k, ifu.FILTERS_LOCATION_CAROUSEL, true).f(1.a);
        }
    }

    /* renamed from: ttw$d */
    static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ ttw a;

        d(ttw ttw) {
            this.a = ttw;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((tqj) this.a.e()).o.a((Boolean) obj);
        }
    }

    /* renamed from: ttw$e */
    static final class e<T> implements ajfb<Boolean> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ttw$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ttw$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ ttw a;

        g(ttw ttw) {
            this.a = ttw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((tqj) this.a.e()).m;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ttw.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    private final zfw a() {
        return (zfw) this.b.b();
    }

    public final /* synthetic */ void a(zlx zlx, View view) {
        akcr.b((tqj) zlx, "bindingContext");
        akcr.b(view, "itemView");
        this.a = (TextView) view.findViewById(R.id.filters_yes_view);
    }

    public final /* synthetic */ void onBind(zmy zmy, zmy zmy2) {
        akcr.b((tud) zmy, MapboxEvent.KEY_MODEL);
        ajej a = ((tqj) e()).g.a((ajfl) new b(this)).b((ajdw) a().f()).a((ajdw) a().l()).n(new c(this)).b((ajfb) new d(this)).a((ajfb) e.a, (ajfb) f.a);
        akcr.a((Object) a, "bindingContext.touchStat…age}\")\n                })");
        ajvv.a(a, ((tqj) e()).j);
    }
}
