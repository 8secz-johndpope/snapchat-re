package defpackage;

import com.snap.core.net.content.impl.ContentManagerEvents.OnBoltRequestStart;
import com.snap.core.net.content.impl.ContentManagerEvents.OnCacheEnd;
import com.snap.core.net.content.impl.ContentManagerEvents.OnCacheStart;
import com.snap.core.net.content.impl.ContentManagerEvents.OnImportRequestEnd;
import com.snap.core.net.content.impl.ContentManagerEvents.OnImportRequestStart;
import com.snap.core.net.content.impl.ContentManagerEvents.OnNetworkRequestMutate;
import com.snap.core.net.content.impl.ContentManagerEvents.OnNetworkRequestStart;
import com.snap.core.net.content.impl.ContentManagerEvents.OnNetworkResponseEnd;
import com.snap.core.net.content.impl.ContentManagerEvents.OnNetworkResponseStart;
import com.snap.core.net.content.impl.ContentManagerEvents.OnRequestComplete;
import com.snap.core.net.content.impl.ContentManagerEvents.OnRequestReceived;
import com.snap.core.net.content.impl.ContentManagerEvents.OnRequestStart;
import defpackage.ghx.a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ggk */
public final class ggk {
    final AtomicLong a = new AtomicLong(0);
    final git b;

    /* renamed from: ggk$k */
    static final class k extends akcs implements akbk<OnRequestReceived> {
        private /* synthetic */ geg a;

        k(geg geg) {
            this.a = geg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnRequestReceived(this.a);
        }
    }

    /* renamed from: ggk$l */
    static final class l implements ajev {
        private /* synthetic */ ggk a;
        private /* synthetic */ long b;
        private /* synthetic */ geg c;
        private /* synthetic */ String d;

        l(ggk ggk, long j, geg geg, String str) {
            this.a = ggk;
            this.b = j;
            this.c = geg;
            this.d = str;
        }

        public final void run() {
            geg geg = this.c;
            ggk.a(geg, (akbk) new j(geg, a.a(geg)));
        }
    }

    /* renamed from: ggk$m */
    static final class m<T> implements ajfb<gej> {
        private /* synthetic */ ggk a;
        private /* synthetic */ long b;
        private /* synthetic */ geg c;
        private /* synthetic */ String d;

        m(ggk ggk, long j, geg geg, String str) {
            this.a = ggk;
            this.b = j;
            this.c = geg;
            this.d = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            gej gej = (gej) obj;
            geg geg = this.c;
            akcr.a((Object) gej, "contentResult");
            ggk.a(geg, (akbk) new j(geg, gej));
        }
    }

    /* renamed from: ggk$n */
    static final class n<T> implements ajfb<ajej> {
        private /* synthetic */ ggk a;
        private /* synthetic */ geg b;

        n(ggk ggk, geg geg) {
            this.a = ggk;
            this.b = geg;
        }

        public final /* synthetic */ void accept(Object obj) {
            geg geg = this.b;
            ggk.a(geg, (akbk) new o(geg));
        }
    }

    /* renamed from: ggk$o */
    static final class o extends akcs implements akbk<OnRequestStart> {
        private /* synthetic */ geg a;

        o(geg geg) {
            this.a = geg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnRequestStart(this.a);
        }
    }

    /* renamed from: ggk$c */
    static final class c extends akcs implements akbk<OnCacheStart> {
        private /* synthetic */ geg a;

        c(geg geg) {
            this.a = geg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnCacheStart(this.a);
        }
    }

    /* renamed from: ggk$b */
    static final class b extends akcs implements akbk<OnCacheEnd> {
        private /* synthetic */ geg a;
        private /* synthetic */ gej b;

        b(geg geg, gej gej) {
            this.a = geg;
            this.b = gej;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnCacheEnd(this.a, this.b);
        }
    }

    /* renamed from: ggk$g */
    static final class g extends akcs implements akbk<OnNetworkRequestStart> {
        private /* synthetic */ geg a;
        private /* synthetic */ ryz b;

        g(geg geg, ryz ryz) {
            this.a = geg;
            this.b = ryz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnNetworkRequestStart(this.a, this.b);
        }
    }

    /* renamed from: ggk$f */
    static final class f extends akcs implements akbk<OnNetworkRequestMutate> {
        private /* synthetic */ geg a;
        private /* synthetic */ ryz b;

        f(geg geg, ryz ryz) {
            this.a = geg;
            this.b = ryz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnNetworkRequestMutate(this.a, this.b);
        }
    }

    /* renamed from: ggk$i */
    static final class i extends akcs implements akbk<OnNetworkResponseStart> {
        private /* synthetic */ geg a;
        private /* synthetic */ sat b;

        i(geg geg, sat sat) {
            this.a = geg;
            this.b = sat;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnNetworkResponseStart(this.a, this.b);
        }
    }

    /* renamed from: ggk$h */
    static final class h extends akcs implements akbk<OnNetworkResponseEnd> {
        private /* synthetic */ geg a;
        private /* synthetic */ sat b;

        h(geg geg, sat sat) {
            this.a = geg;
            this.b = sat;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnNetworkResponseEnd(this.a, this.b);
        }
    }

    /* renamed from: ggk$j */
    static final class j extends akcs implements akbk<OnRequestComplete> {
        private /* synthetic */ geg a;
        private /* synthetic */ gej b;

        j(geg geg, gej gej) {
            this.a = geg;
            this.b = gej;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnRequestComplete(this.a, this.b);
        }
    }

    /* renamed from: ggk$e */
    static final class e extends akcs implements akbk<OnImportRequestStart> {
        private /* synthetic */ geg a;

        e(geg geg) {
            this.a = geg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnImportRequestStart(this.a);
        }
    }

    /* renamed from: ggk$d */
    static final class d extends akcs implements akbk<OnImportRequestEnd> {
        private /* synthetic */ geg a;
        private /* synthetic */ gej b;

        d(geg geg, gej gej) {
            this.a = geg;
            this.b = gej;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnImportRequestEnd(this.a, this.b);
        }
    }

    /* renamed from: ggk$a */
    static final class a extends akcs implements akbk<OnBoltRequestStart> {
        private /* synthetic */ geg a;

        a(geg geg) {
            this.a = geg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnBoltRequestStart(this.a);
        }
    }

    public ggk(git git) {
        akcr.b(git, "snapContentStatusMonitor");
        this.b = git;
    }

    public static ajxw a(geg geg) {
        akcr.b(geg, "contentRequest");
        return ggk.a(geg, (akbk) new c(geg));
    }

    static <T> ajxw a(geg geg, akbk<? extends T> akbk) {
        ifi i = geg.i();
        if (i == null) {
            return null;
        }
        i.a(akbk.invoke());
        return ajxw.a;
    }

    public static ajxw a(geg geg, gej gej) {
        akcr.b(geg, "contentRequest");
        return ggk.a(geg, (akbk) new b(geg, gej));
    }

    public static void a(geg geg, ryz ryz) {
        akcr.b(geg, "contentRequest");
        akcr.b(ryz, "networkRequest");
        ggk.a(geg, (akbk) new g(geg, ryz));
    }

    public static ajxw b(geg geg, ryz ryz) {
        akcr.b(geg, "contentRequest");
        akcr.b(ryz, "networkRequest");
        return ggk.a(geg, (akbk) new f(geg, ryz));
    }

    public static ajxw b(geg geg, sat<sai> sat) {
        akcr.b(geg, "contentRequest");
        akcr.b(sat, "networkResult");
        return ggk.a(geg, (akbk) new h(geg, sat));
    }

    public final void a(geg geg, sat<sai> sat) {
        akcr.b(geg, "contentRequest");
        akcr.b(sat, "networkResult");
        this.b.a(geg);
        ggk.a(geg, (akbk) new i(geg, sat));
    }
}
