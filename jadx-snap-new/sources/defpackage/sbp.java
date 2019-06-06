package defpackage;

import com.snap.network.transport.impl.client.FilterChainClientEvents.OnRequestCancel;
import com.snap.network.transport.impl.client.FilterChainClientEvents.OnRequestFinishedInfo;
import com.snap.network.transport.impl.client.FilterChainClientEvents.OnRequestReceived;
import com.snap.network.transport.impl.client.FilterChainClientEvents.OnRequestStart;
import com.snap.network.transport.impl.client.FilterChainClientEvents.OnResponseEnd;
import com.snap.network.transport.impl.client.FilterChainClientEvents.OnResponseStart;

/* renamed from: sbp */
public final class sbp {

    /* renamed from: sbp$c */
    static final class c extends akcs implements akbk<OnRequestReceived> {
        private /* synthetic */ sal a;

        c(sal sal) {
            this.a = sal;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = this.a.b();
            akcr.a(b, "context.request");
            return new OnRequestReceived(b);
        }
    }

    /* renamed from: sbp$d */
    static final class d extends akcs implements akbk<OnRequestStart> {
        private /* synthetic */ sal a;

        d(sal sal) {
            this.a = sal;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = this.a.b();
            akcr.a(b, "context.request");
            return new OnRequestStart(b);
        }
    }

    /* renamed from: sbp$f */
    static final class f extends akcs implements akbk<OnResponseStart> {
        private /* synthetic */ sal a;

        f(sal sal) {
            this.a = sal;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object d = this.a.d();
            akcr.a(d, "context.response");
            return new OnResponseStart(d);
        }
    }

    /* renamed from: sbp$e */
    static final class e extends akcs implements akbk<OnResponseEnd> {
        private /* synthetic */ sal a;
        private /* synthetic */ Throwable b;
        private /* synthetic */ san c;

        e(sal sal, Throwable th, san san) {
            this.a = sal;
            this.b = th;
            this.c = san;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = this.a.b();
            akcr.a(b, "context.request");
            return new OnResponseEnd(b, this.b);
        }
    }

    /* renamed from: sbp$b */
    static final class b extends akcs implements akbk<OnRequestFinishedInfo> {
        private /* synthetic */ sao a;

        b(sao sao) {
            this.a = sao;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new OnRequestFinishedInfo(this.a);
        }
    }

    /* renamed from: sbp$a */
    static final class a extends akcs implements akbk<OnRequestCancel> {
        private /* synthetic */ sal a;

        a(sal sal) {
            this.a = sal;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = this.a.b();
            akcr.a(b, "context.request");
            return new OnRequestCancel(b);
        }
    }

    static <T> ajxw a(sal sal, akbk<? extends T> akbk) {
        Object b = sal.b();
        akcr.a(b, "context.request");
        ifi a = sbr.a(b);
        if (a == null) {
            return null;
        }
        a.a(akbk.invoke());
        return ajxw.a;
    }
}
