package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.bitmoji.net.BitmojiFsnHttpInterface;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snapchat.android.R;
import defpackage.acie.a;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: dez */
public final class dez implements czl, gvn {
    final zfw a = zgb.a(ddg.l, "BitmojiAvatarChangeDeepLinkHandler");
    final ajwy<zjw> b;
    final ajwy<BitmojiFsnHttpInterface> c;
    final gpb d;
    final ajwy<ddd> e;
    final ajwy<dgp> f;
    final ajwy<ftl> g;
    private final List<String> h;
    private final Context i;
    private final dgo j;

    /* renamed from: dez$a */
    static final class a<V> implements Callable<T> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object call() {
            return new aedh();
        }
    }

    /* renamed from: dez$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ dez a;

        e(dez dez) {
            this.a = dez;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a.d;
        }
    }

    /* renamed from: dez$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ dez a;

        b(dez dez) {
            this.a = dez;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aedh aedh = (aedh) obj;
            akcr.b(aedh, "request");
            return ((BitmojiFsnHttpInterface) this.a.c.get()).confirmBitmojiLink(aedh);
        }
    }

    /* renamed from: dez$f */
    static final class f<T, R> implements ajfc<gpb, ajdb> {
        private /* synthetic */ aedn a;

        f(aedn aedn) {
            this.a = aedn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gpb gpb = (gpb) obj;
            akcr.b(gpb, "it");
            return gpb.a(this.a.a, null);
        }
    }

    /* renamed from: dez$g */
    static final class g implements ajev {
        private /* synthetic */ dez a;

        g(dez dez) {
            this.a = dez;
        }

        public final void run() {
            achb achb = ((zjw) this.a.b.get()).d;
            Object obj = achb.c ? (zjm) achb.h() : null;
            acio acio = akcr.a(obj, ddg.a) ? new acio(wnr.a) : (akcr.a(obj, upp.b) || akcr.a(obj, wnr.a)) ? new acid() : new acio(dnh.a);
            acig acig = acio;
            aaua aaua = akcr.a(obj, upp.b) ? aaua.PROFILE : akcr.a(obj, wnr.a) ? aaua.SETTINGS : aaua.EXTERNAL;
            achd zjf = new zjf(ddg.a, ((dgp) this.a.f.get()).a(aaua), acgv.a().a(ddg.c).a());
            obj = ddg.b;
            akcr.a(obj, "BitmojiFeature.BITMOJI_SETTINGS_PRESENT_DEFAULT");
            acip acip = new acip(achb, zjf, obj);
            zjw.a((zjw) this.a.b.get(), null, false, a.a(new acig[]{acig, acip}, null), null, 11);
        }
    }

    /* renamed from: dez$h */
    static final class h<T> implements ajfb<aaua> {
        private /* synthetic */ dez a;

        h(dez dez) {
            this.a = dez;
        }

        public final /* synthetic */ void accept(Object obj) {
            aaua aaua = (aaua) obj;
            akcr.b(aaua, "editSource");
            ((ddd) this.a.e.get()).a(aabp.BITMOJI_APP, null, aaua, aabq.AVATAR);
        }
    }

    /* renamed from: dez$c */
    static final class c extends akcq implements akbl<Throwable, ajxw> {
        c(dez dez) {
            super(1, dez);
        }

        public final String getName() {
            return "onConfirmBitmojiLinkFailure";
        }

        public final akej getOwner() {
            return akde.a(dez.class);
        }

        public final String getSignature() {
            return "onConfirmBitmojiLinkFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((dez) this.receiver).b();
            return ajxw.a;
        }
    }

    /* renamed from: dez$d */
    static final class d extends akcq implements akbl<aedn, ajcx> {
        d(dez dez) {
            super(1, dez);
        }

        public final String getName() {
            return "onConfirmBitmojiLinkSuccess";
        }

        public final akej getOwner() {
            return akde.a(dez.class);
        }

        public final String getSignature() {
            return "onConfirmBitmojiLinkSuccess(Lcom/snapchat/soju/android/BitmojiConfirmLinkResponse;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            aedn aedn = (aedn) obj;
            akcr.b(aedn, "p1");
            dez dez = (dez) this.receiver;
            if (aedn.a == null) {
                dez.b();
                obj = ajvo.a(ajhn.a);
                str = "Completable.complete()";
            } else {
                obj = ajdx.c((Callable) new e(dez)).a((ajdw) dez.a.h()).e((ajfc) new f(aedn)).a((ajdw) dez.a.l()).b((ajev) new g(dez)).b((ajdb) ((ftl) dez.g.get()).v(ddx.BITMOJI_EDIT_SOURCE).d(aaua.SETTINGS).b((ajdw) dez.a.i()).c((ajfb) new h(dez)).e());
                str = "Single.fromCallable { us…ement()\n                )";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    public dez(Context context, ajwy<zjw> ajwy, ajwy<BitmojiFsnHttpInterface> ajwy2, gpb gpb, zgb zgb, ajwy<ddd> ajwy3, ajwy<dgp> ajwy4, dgo dgo, ajwy<ftl> ajwy5) {
        akcr.b(context, "context");
        akcr.b(ajwy, "deepLinkNavigator");
        akcr.b(ajwy2, "bitmojiFsnHttpInterface");
        akcr.b(gpb, "userAuthStore");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy3, "bitmojiEventsAnalytics");
        akcr.b(ajwy4, "bitmojiFragmentFactory");
        akcr.b(dgo, "bitmojiDialogController");
        akcr.b(ajwy5, "configProvider");
        this.i = context;
        this.b = ajwy;
        this.c = ajwy2;
        this.d = gpb;
        this.e = ajwy3;
        this.f = ajwy4;
        this.j = dgo;
        this.g = ajwy5;
        Object of = ImmutableList.of("snapchat://bitmoji/avatar_change");
        akcr.a(of, "ImmutableList.of(\"snapch…//bitmoji/avatar_change\")");
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
        zgy a = zgy.a.a(dgo.a(new zjm(ddg.l, "bitmoji_avatar_confirm_link_failure_dialog", false, false, true, false, null, false, false, false, false, null, 4076), ((zjw) this.b.get()).d, this.i, true).a((int) R.string.bitmoji_please_try_again), null, false, null, null, null, 31).a();
        zjw.a((zjw) this.b.get(), null, false, new acip(((zjw) this.b.get()).d, a, a.a), null, 11);
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        dez dez = this;
        Object e = ajdx.c((Callable) a.a).a((ajfc) new b(this)).b((ajdw) this.a.g()).a((ajdw) this.a.l()).d((ajfb) new dfa(new c(dez))).e((ajfc) new dfb(new d(dez)));
        akcr.a(e, "Single.fromCallable { Au…onfirmBitmojiLinkSuccess)");
        return e;
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
