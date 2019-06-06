package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.bitmoji.net.BitmojiFsnHttpInterface;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snapchat.android.R;
import defpackage.ddt.a;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: dew */
public final class dew implements czl, gvn {
    final zfw a = zgb.a(ddg.l, "BitmojiAuthSuccessDeepLinkHandler");
    final aipn<zjw> b;
    final aipn<BitmojiFsnHttpInterface> c;
    final aipn<ddd> d;
    final ddt e;
    final gpb f;
    final aipn<dgp> g;
    private final List<String> h;
    private final Context i;
    private final zgb j;
    private final dgo k;

    /* renamed from: dew$a */
    static final class a<V> implements Callable<T> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object call() {
            return new aedh();
        }
    }

    /* renamed from: dew$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ dew a;

        e(dew dew) {
            this.a = dew;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a.f;
        }
    }

    /* renamed from: dew$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ dew a;

        b(dew dew) {
            this.a = dew;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aedh aedh = (aedh) obj;
            akcr.b(aedh, "request");
            return ((BitmojiFsnHttpInterface) this.a.c.get()).confirmBitmojiLink(aedh);
        }
    }

    /* renamed from: dew$f */
    static final class f<T, R> implements ajfc<gpb, ajdb> {
        private /* synthetic */ aedn a;

        f(aedn aedn) {
            this.a = aedn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gpb gpb = (gpb) obj;
            akcr.b(gpb, "it");
            return gpb.a(this.a.a, ddq.a());
        }
    }

    /* renamed from: dew$g */
    static final class g implements ajev {
        private /* synthetic */ dew a;
        private /* synthetic */ aedn b;

        g(dew dew, aedn aedn) {
            this.a = dew;
            this.b = aedn;
        }

        public final void run() {
            ddd ddd = (ddd) this.a.d.get();
            ddt ddt = this.a.e;
            a aVar = a.AUTH;
            akcr.b(aVar, "toBitmojiAction");
            aaua aaua = (aaua) ddt.a.get(aVar);
            if (aaua == null) {
                aaua = aaua.EXTERNAL;
            }
            ddd.b(aaua);
            zjf zjf = new zjf(ddg.a, ((dgp) this.a.g.get()).a(this.b.b), acgv.a().a(ddg.c).a());
            achb achb = ((zjw) this.a.b.get()).d;
            Object obj = achb.c ? (zjm) achb.h() : null;
            acio acio = akcr.a(obj, ddg.a) ? new acio(wnr.a) : (akcr.a(obj, upp.b) || akcr.a(obj, wnr.a)) ? new acid() : new acio(dnh.a);
            acig acig = acio;
            achd achd = zjf;
            Object obj2 = ddg.b;
            akcr.a(obj2, "BitmojiFeature.BITMOJI_SETTINGS_PRESENT_DEFAULT");
            acip acip = new acip(achb, achd, obj2);
            zjw.a((zjw) this.a.b.get(), null, false, acie.a.a(new acig[]{acig, acip}, null), null, 11);
        }
    }

    /* renamed from: dew$c */
    static final class c extends akcq implements akbl<aedn, ajcx> {
        c(dew dew) {
            super(1, dew);
        }

        public final String getName() {
            return "onConfirmBitmojiLinkSuccess";
        }

        public final akej getOwner() {
            return akde.a(dew.class);
        }

        public final String getSignature() {
            return "onConfirmBitmojiLinkSuccess(Lcom/snapchat/soju/android/BitmojiConfirmLinkResponse;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            aedn aedn = (aedn) obj;
            akcr.b(aedn, "p1");
            dew dew = (dew) this.receiver;
            if (aedn.a == null) {
                dew.b();
                obj = ajvo.a(ajhn.a);
                str = "Completable.complete()";
            } else {
                obj = ajdx.c((Callable) new e(dew)).a((ajdw) dew.a.h()).e((ajfc) new f(aedn)).a((ajdw) dew.a.l()).b((ajev) new g(dew, aedn));
                str = "Single.fromCallable { us…igable)\n                }";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: dew$d */
    static final class d extends akcq implements akbl<Throwable, ajxw> {
        d(dew dew) {
            super(1, dew);
        }

        public final String getName() {
            return "onConfirmBitmojiLinkFailure";
        }

        public final akej getOwner() {
            return akde.a(dew.class);
        }

        public final String getSignature() {
            return "onConfirmBitmojiLinkFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((dew) this.receiver).b();
            return ajxw.a;
        }
    }

    public dew(Context context, aipn<zjw> aipn, aipn<BitmojiFsnHttpInterface> aipn2, aipn<ddd> aipn3, ddt ddt, zgb zgb, gpb gpb, aipn<dgp> aipn4, dgo dgo) {
        akcr.b(context, "context");
        akcr.b(aipn, "deepLinkNavigator");
        akcr.b(aipn2, "bitmojiFsnHttpInterface");
        akcr.b(aipn3, "bitmojiEventsAnalytics");
        akcr.b(ddt, "bitmojiUtils");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(gpb, "userAuthStore");
        akcr.b(aipn4, "bitmojiFragmentFactory");
        akcr.b(dgo, "bitmojiDialogController");
        this.i = context;
        this.b = aipn;
        this.c = aipn2;
        this.d = aipn3;
        this.e = ddt;
        this.j = zgb;
        this.f = gpb;
        this.g = aipn4;
        this.k = dgo;
        Object of = ImmutableList.of("snapchat://bitmoji/auth_success");
        akcr.a(of, "ImmutableList.of(\"snapch…://bitmoji/auth_success\")");
        this.h = (List) of;
    }

    public final aahz a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return aahz.BITMOJI;
    }

    public final List<String> a() {
        return this.h;
    }

    public final aahz b(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        zgy a = zgy.a.a(dgo.a(new zjm(ddg.l, "bitmoji_auth_confirm_link_failure_dialog", false, false, true, false, null, false, false, false, false, null, 4076), ((zjw) this.b.get()).d, this.i, true).a((int) R.string.bitmoji_please_try_again), null, false, null, null, null, 31).a();
        zjw.a((zjw) this.b.get(), null, false, new acip(((zjw) this.b.get()).d, a, a.a), null, 11);
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        dew dew = this;
        Object a = ajdx.c((Callable) a.a).a((ajfc) new b(this)).b((ajdw) this.a.g()).a((ajdw) this.a.l()).e((ajfc) new dey(new c(dew))).a((ajfb) new dex(new d(dew)));
        akcr.a(a, "Single.fromCallable<Auth…onfirmBitmojiLinkFailure)");
        return a;
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
