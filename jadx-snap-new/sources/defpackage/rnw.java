package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.snap.core.db.query.LegacyFriendsFeedQueries.WithFriendAndStory;
import com.snapchat.android.R;
import defpackage.zgy.a;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: rnw */
public final class rnw extends ajed implements zma {
    final ajei a = new ajei();
    final Context b;
    final qnk c;
    final ihi d;
    final zfw e;
    private final achb<zjm, zjk> f;
    private final qxm g;

    /* renamed from: rnw$a */
    static final class a implements ajev {
        public static final a a = new a();

        a() {
        }

        public final void run() {
        }
    }

    /* renamed from: rnw$b */
    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ rnw a;
        private /* synthetic */ rod b;

        b(rnw rnw, rod rod) {
            this.a = rnw;
            this.b = rod;
        }

        public final /* synthetic */ void accept(Object obj) {
            Toast.makeText(this.a.b, R.string.messaging_settings_clear_failed_singular, 0).show();
        }
    }

    /* renamed from: rnw$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(list);
        }
    }

    /* renamed from: rnw$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ rnw a;

        f(rnw rnw) {
            this.a = rnw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            WithFriendAndStory withFriendAndStory = (WithFriendAndStory) obj;
            akcr.b(withFriendAndStory, "it");
            return new rod(withFriendAndStory, this.a.d);
        }
    }

    /* renamed from: rnw$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return znk.a(list);
        }
    }

    /* renamed from: rnw$e */
    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ rnw a;
        private /* synthetic */ rob b;
        private /* synthetic */ zjm c;

        e(rnw rnw, rob rob, zjm zjm) {
            this.a = rnw;
            this.b = rob;
            this.c = zjm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            rnw rnw = this.a;
            rod rod = this.b.a;
            ajej a = rnw.c.a(rod.b, rod.d).a((ajdw) rnw.e.l()).a((ajev) a.a, (ajfb) new b(rnw, rod));
            akcr.a((Object) a, "messagingClient\n        … $it\")\n                })");
            ajvv.a(a, rnw.a);
            return ajxw.a;
        }
    }

    /* renamed from: rnw$d */
    static final class d extends akcq implements akbl<znh<WithFriendAndStory>, ajdp<znh<zmy>>> {
        d(rnw rnw) {
            super(1, rnw);
        }

        public final String getName() {
            return "toViewModels";
        }

        public final akej getOwner() {
            return akde.a(rnw.class);
        }

        public final String getSignature() {
            return "toViewModels(Lcom/snap/ui/seeking/Seekable;)Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            znh znh = (znh) obj;
            akcr.b(znh, "p1");
            obj = ajdp.b((Iterable) znh).p(new f((rnw) this.receiver)).a(16).f(g.a).i();
            akcr.a(obj, "Observable.fromIterable(…          .toObservable()");
            return obj;
        }
    }

    public rnw(Context context, achb<zjm, zjk> achb, qxm qxm, qnk qnk, ihi ihi, zfw zfw) {
        akcr.b(context, "context");
        akcr.b(achb, "navigationHost");
        akcr.b(qxm, "friendsFeedDataProvider");
        akcr.b(qnk, "messagingClient");
        akcr.b(ihi, "dateTimeUtils");
        akcr.b(zfw, "schedulers");
        this.b = context;
        this.f = achb;
        this.g = qxm;
        this.c = qnk;
        this.d = ihi;
        this.e = zfw;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        Object u = this.g.a(Integer.MAX_VALUE).a((ajdw) this.e.h()).p(c.a).u(new rnx(new d(this)));
        akcr.a(u, "friendsFeedDataProvider\n…chMap(this::toViewModels)");
        return u;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClearConversationTapEvent(rob rob) {
        rob rob2 = rob;
        akcr.b(rob2, "event");
        zjm zjm = new zjm(qxo.b, "ClearConversationListSection", false, false, true, false, null, false, false, false, false, null, 4076);
        zgy a = a.a(new a(this.b, this.f, zjm, false, null, 24).a((int) R.string.messaging_settings_clear_confirm).b((int) R.string.messaging_settings_clear_confirm_subtext).a((int) R.string.settings_clear_conversation_action, (akbl) new e(this, rob2, zjm), true), null, false, null, null, null, 31).a();
        this.f.a((achd) a, a.a, null);
    }

    public final void onDispose() {
        this.a.dispose();
    }
}
