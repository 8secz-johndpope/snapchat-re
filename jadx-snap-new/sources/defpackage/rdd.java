package defpackage;

import android.content.Context;
import android.view.View;
import com.snap.core.db.record.MultiRecipientSendingSnapRecord.SendingMessage;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: rdd */
public final class rdd extends ajed implements zma {
    final WeakReference<Context> a;
    private final ajdp<znh<SendingMessage>> b;

    /* renamed from: rdd$a */
    static final class a<T> implements ajfb<znh<SendingMessage>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: rdd$c */
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

    /* renamed from: rdd$d */
    static final class d<T> implements ajfb<znh<zmy>> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: rdd$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ rdd a;

        e(rdd rdd) {
            this.a = rdd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SendingMessage sendingMessage = (SendingMessage) obj;
            akcr.b(sendingMessage, "it");
            return new rec(this.a.a, sendingMessage);
        }
    }

    /* renamed from: rdd$b */
    static final class b extends akcq implements akbl<znh<SendingMessage>, ajdp<List<? extends zmy>>> {
        b(rdd rdd) {
            super(1, rdd);
        }

        public final String getName() {
            return "toViewModels";
        }

        public final akej getOwner() {
            return akde.a(rdd.class);
        }

        public final String getSignature() {
            return "toViewModels(Lcom/snap/ui/seeking/Seekable;)Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            znh znh = (znh) obj;
            akcr.b(znh, "p1");
            rdd rdd = (rdd) this.receiver;
            akcr.b(znh, "feeds");
            obj = ajdp.b((Iterable) znh).p(new e(rdd)).a(16).i();
            akcr.a(obj, "Observable.fromIterable<…          .toObservable()");
            return obj;
        }
    }

    public rdd(Context context, ajdp<znh<SendingMessage>> ajdp) {
        akcr.b(context, "context");
        akcr.b(ajdp, "source");
        this.b = ajdp;
        this.a = new WeakReference(context);
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        return this.b.d((ajfb) a.a).k((ajfc) new rde(new b(this))).p(c.a).d((ajfb) d.a);
    }

    public final void onDispose() {
    }
}
