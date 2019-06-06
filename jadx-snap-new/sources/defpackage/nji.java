package defpackage;

import android.content.Context;
import com.brightcove.player.event.EventType;
import com.snap.map.core.SnapMapHttpInterface;
import com.snap.map.core.SnapMapHttpInterface.DefaultImpls;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: nji */
public final class nji implements acri {
    final aipn<SnapMapHttpInterface> a;
    private final String b;
    private final ajdw c;
    private final ajei d = new ajei();

    /* renamed from: nji$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ alhn a;

        a(alhn alhn) {
            this.a = alhn;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: nji$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ nji a;

        b(nji nji) {
            this.a = nji;
        }

        public final /* synthetic */ Object apply(Object obj) {
            alhn alhn = (alhn) obj;
            akcr.b(alhn, "req");
            return DefaultImpls.getFriendClusters$default((SnapMapHttpInterface) this.a.a.get(), alhn, null, 2, null);
        }
    }

    /* renamed from: nji$c */
    static final class c<T> implements ajfb<alho> {
        private /* synthetic */ acrj a;

        c(acrj acrj) {
            this.a = acrj;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (alho) obj;
            acrj acrj = this.a;
            acrd acrd = new acrd(true, false, false, null);
            alhm[] alhmArr = obj.a;
            List j = alhmArr != null ? ajyi.j(alhmArr) : new ArrayList();
            akcr.a(obj, EventType.RESPONSE);
            acrj.a(acrd, j, obj.a());
        }
    }

    /* renamed from: nji$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ acrj a;

        d(acrj acrj) {
            this.a = acrj;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(new acrd(false, true, true, new Exception((Throwable) obj)), null, -1.0d);
        }
    }

    public nji(Context context, aipn<SnapMapHttpInterface> aipn, ide ide, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(aipn, "snapMapApi");
        akcr.b(ide, "feature");
        akcr.b(zgb, "schedulersProvider");
        this.a = aipn;
        Object resources = context.getResources();
        akcr.a(resources, "context.resources");
        resources = resources.getConfiguration().locale;
        akcr.a(resources, "context.resources.configuration.locale");
        this.b = resources.getLanguage();
        this.c = zgb.a(ide.callsite("locationFetcher")).g();
    }

    public final void a() {
        this.d.a();
    }

    public final void a(acrj acrj) {
        akcr.b(acrj, "callback");
        alhn alhn = new alhn();
        String str = this.b;
        if (str != null) {
            alhn.a(str);
        }
        ajej a = ajdx.c((Callable) new a(alhn)).a((ajfc) new b(this)).b(this.c).a(this.c).a((ajfb) new c(acrj), (ajfb) new d(acrj));
        akcr.a((Object) a, "Single.fromCallable<Frie… -1.0)\n                })");
        ajvv.a(a, this.d);
    }
}
