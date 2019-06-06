package defpackage;

import android.content.Context;
import android.view.View;
import com.snap.core.db.record.FriendRecord.DisplayInfo;
import com.snapchat.android.R;
import defpackage.zgy.a;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jlu */
public final class jlu extends ajed implements zma {
    final ajei a = new ajei();
    final ira b;
    final zfw c;
    private final ajdp<znh<DisplayInfo>> d;
    private final Context e;
    private final achb<zjm, zjk> f;

    /* renamed from: jlu$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list.isEmpty() ? znk.a(new jma()) : znk.a(list);
        }
    }

    /* renamed from: jlu$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            DisplayInfo displayInfo = (DisplayInfo) obj;
            akcr.b(displayInfo, "it");
            return new jly(displayInfo);
        }
    }

    /* renamed from: jlu$c */
    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ jlu a;
        private /* synthetic */ jmc b;

        /* renamed from: jlu$c$1 */
        static final class 1<T> implements ajfb<agzs> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: jlu$c$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        c(jlu jlu, jmc jmc) {
            this.a = jlu;
            this.b = jmc;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a.a(this.a.b.a(new itf(this.b.a, this.b.b, this.b.c, this.b.d != 0, this.b.e != 0)).a((ajdw) this.a.c.l()).a((ajfb) 1.a, (ajfb) 2.a));
            return ajxw.a;
        }
    }

    /* renamed from: jlu$a */
    static final class a extends akcq implements akbl<znh<DisplayInfo>, ajdp<List<? extends zmy>>> {
        a(jlu jlu) {
            super(1, jlu);
        }

        public final String getName() {
            return "toViewModels";
        }

        public final akej getOwner() {
            return akde.a(jlu.class);
        }

        public final String getSignature() {
            return "toViewModels(Lcom/snap/ui/seeking/Seekable;)Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            znh znh = (znh) obj;
            akcr.b(znh, "p1");
            obj = ajdp.b((Iterable) znh).p(d.a).a(16).i();
            akcr.a(obj, "Observable.fromIterable(…          .toObservable()");
            return obj;
        }
    }

    public jlu(ajdp<znh<DisplayInfo>> ajdp, Context context, achb<zjm, zjk> achb, ira ira, zfw zfw) {
        akcr.b(ajdp, "source");
        akcr.b(context, "context");
        akcr.b(achb, "navigationHost");
        akcr.b(ira, "identityApi");
        akcr.b(zfw, "schedulers");
        this.d = ajdp;
        this.e = context;
        this.f = achb;
        this.b = ira;
        this.c = zfw;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        Object p = this.d.u(new jlv(new a(this))).p(b.a);
        akcr.a(p, "source.switchMap(this::t…  }\n                    }");
        return p;
    }

    public final void onDispose() {
        this.a.dispose();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onUnBlockUsersEvent(jmc jmc) {
        jmc jmc2 = jmc;
        akcr.b(jmc2, "event");
        zgy a = a.a(new a(this.e, this.f, new zjm(irc.t, "block_user", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).b((int) R.string.dialog_confirm_unblock_action).a((int) R.string.unblock_yes, (akbl) new c(this, jmc2), true), null, false, Integer.valueOf(R.string.unblock_no), null, null, 27).a();
        this.f.a((achd) a, a.a, null);
    }
}
