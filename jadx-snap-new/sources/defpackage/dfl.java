package defpackage;

import android.content.Context;
import com.brightcove.player.event.EventType;
import com.snap.bitmoji.net.BitmojiFsnHttpInterface;
import com.snapchat.android.R;
import defpackage.ddt.a;
import java.util.concurrent.Callable;

/* renamed from: dfl */
public final class dfl implements ddj {
    final ddt a;
    final ajwy<BitmojiFsnHttpInterface> b;
    private final ajxe c;
    private final Context d;
    private final achb<zjm, zjk> e;

    /* renamed from: dfl$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        g(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(ddg.l, "DefaultBitmojiLinkageDelegate");
        }
    }

    /* renamed from: dfl$d */
    static final class d<V> implements Callable<T> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object call() {
            return new aedh();
        }
    }

    /* renamed from: dfl$b */
    static final class b<T> implements ajfb<ddn> {
        private /* synthetic */ dfl a;
        private /* synthetic */ aaua b;

        b(dfl dfl, aaua aaua) {
            this.a = dfl;
            this.b = aaua;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ddn) obj;
            dfl dfl = this.a;
            akcr.a(obj, "resp");
            aaua aaua = this.b;
            CharSequence charSequence = obj.a;
            Object obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            if (obj2 != null) {
                dfl.b();
                return;
            }
            ddt ddt = dfl.a;
            a aVar = a.AUTH;
            String str = obj.a;
            if (str == null) {
                akcr.a();
            }
            ddt.a(aVar, str, aaua);
        }
    }

    /* renamed from: dfl$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ dfl a;

        e(dfl dfl) {
            this.a = dfl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aedh aedh = (aedh) obj;
            akcr.b(aedh, "request");
            return ((BitmojiFsnHttpInterface) this.a.b.get()).getBitmojiRequestToken(aedh);
        }
    }

    /* renamed from: dfl$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            aeeh aeeh = (aeeh) obj;
            akcr.b(aeeh, EventType.RESPONSE);
            return new ddn(aeeh.a);
        }
    }

    /* renamed from: dfl$a */
    static final class a extends akcq implements akbk<ajxw> {
        a(ddt ddt) {
            super(0, ddt);
        }

        public final String getName() {
            return "goToPlayStoreForBitmoji";
        }

        public final akej getOwner() {
            return akde.a(ddt.class);
        }

        public final String getSignature() {
            return "goToPlayStoreForBitmoji()V";
        }

        public final /* synthetic */ Object invoke() {
            ((ddt) this.receiver).b();
            return ajxw.a;
        }
    }

    /* renamed from: dfl$c */
    static final class c extends akcq implements akbl<Throwable, ajxw> {
        c(dfl dfl) {
            super(1, dfl);
        }

        public final String getName() {
            return "onCreateBitmojiRequestTokenFailure";
        }

        public final akej getOwner() {
            return akde.a(dfl.class);
        }

        public final String getSignature() {
            return "onCreateBitmojiRequestTokenFailure(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((dfl) this.receiver).b();
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(dfl.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public dfl(Context context, ddt ddt, achb<zjm, zjk> achb, ajwy<BitmojiFsnHttpInterface> ajwy, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(ddt, "bitmojiUtils");
        akcr.b(achb, "navigationHost");
        akcr.b(ajwy, "bitmojiFsnHttpInterface");
        akcr.b(zgb, "schedulersProvider");
        this.d = context;
        this.a = ddt;
        this.e = achb;
        this.b = ajwy;
        this.c = ajxh.a(new g(zgb));
    }

    private final zfw c() {
        return (zfw) this.c.b();
    }

    public final ajcx a(aaua aaua) {
        Object e;
        String str;
        akcr.b(aaua, "pageType");
        if (this.a.a()) {
            e = a().c((ajfb) new b(this, aaua)).d((ajfb) new dfn(new c(this))).e();
            str = "retrieveBitmojiToken()\n …         .ignoreElement()";
        } else {
            e = ajcx.a((ajev) new dfm(new a(this.a)));
            str = "Completable.fromAction(b…:goToPlayStoreForBitmoji)";
        }
        akcr.a(e, str);
        return e;
    }

    public final ajdx<ddn> a() {
        Object a = ajdx.c((Callable) d.a).a((ajfc) new e(this)).f(f.a).b((ajdw) c().g()).a((ajdw) c().l());
        akcr.a(a, "Single.fromCallable { Au…(schedulers.mainThread())");
        return a;
    }

    public final void b() {
        zjm zjm = new zjm(ddg.l, "create_bitmoji_please_try_again", false, false, true, false, null, false, false, false, false, null, 4076);
        achb achb = this.e;
        zgy a = zgy.a.a(new zgy.a(this.d, achb, zjm, false, null, 24).a((int) R.string.bitmoji_please_try_again), null, false, null, null, null, 31).a();
        achb.a((achd) a, a.a, null);
    }
}
