package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.snapchat.messaging.chat.sccp.service.SecureChatServiceImpl;
import defpackage.adqo.a;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: qew */
public final class qew implements a, pqt {
    adqo a;
    final Object b = new Object();
    volatile ajdx<pqs> c;
    final Object d = new Object();
    volatile ServiceConnection e;
    boolean f;
    final ajwy<Context> g;
    final zfw h;
    final ajwy<adqp> i;
    final ajwy<Map<Class<?>, ajdx<prr>>> j;
    final ajwy<gpb> k;
    private final ajxe l = ajxh.a(new b(this));
    private final ajxe m = ajxh.a(new a(this));

    /* renamed from: qew$b */
    static final class b extends akcs implements akbk<Context> {
        private /* synthetic */ qew a;

        b(qew qew) {
            this.a = qew;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Context) this.a.g.get();
        }
    }

    /* renamed from: qew$a */
    static final class a extends akcs implements akbk<Intent> {
        private /* synthetic */ qew a;

        a(qew qew) {
            this.a = qew;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Intent(this.a.e(), SecureChatServiceImpl.class);
        }
    }

    /* renamed from: qew$e */
    public static final class e implements ServiceConnection {
        final /* synthetic */ qew a;
        final /* synthetic */ ajdy b;

        e(qew qew, ajdy ajdy) {
            this.a = qew;
            this.b = ajdy;
        }

        public final void onBindingDied(ComponentName componentName) {
            if (!this.b.b(new IOException("Chat Service Binding died!"))) {
                synchronized (this.a.b) {
                    this.a.c = null;
                }
            }
        }

        public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            this.a.h.b().a((Runnable) new Runnable(this) {
                private /* synthetic */ e a;

                public final void run() {
                    if (iBinder instanceof adqn) {
                        qew qew = this.a.a;
                        Object a = ((adqn) iBinder).a();
                        a.a(this.a.a.g, this.a.a.i, this.a.a.j, this.a.a.k);
                        ajdy ajdy = this.a.b;
                        akcr.a(a, "this");
                        ajdy.a(new qev(a));
                        a.a((a) this.a.a);
                        qew.a = a;
                    }
                }
            });
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (!this.b.b(new IOException("Chat Service Disconnected!"))) {
                synchronized (this.a.b) {
                    this.a.c = null;
                }
            }
        }
    }

    /* renamed from: qew$c */
    static final class c<V> implements Callable<T> {
        final /* synthetic */ qew a;

        /* renamed from: qew$c$b */
        static final class b extends akcq implements akbl<ajdy<pqs>, ajxw> {
            b(qew qew) {
                super(1, qew);
            }

            public final String getName() {
                return "startService";
            }

            public final akej getOwner() {
                return akde.a(qew.class);
            }

            public final String getSignature() {
                return "startService(Lio/reactivex/SingleEmitter;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ajdy ajdy = (ajdy) obj;
                akcr.b(ajdy, "p1");
                qew qew = (qew) this.receiver;
                synchronized (qew.d) {
                    qew.g();
                    qew.e = new e(qew, ajdy);
                    qew.e().startService(qew.f());
                    Context e = qew.e();
                    Intent f = qew.f();
                    ServiceConnection serviceConnection = qew.e;
                    if (serviceConnection == null) {
                        akcr.a();
                    }
                    if (e.bindService(f, serviceConnection, 1)) {
                        qew.f = true;
                    } else {
                        qew.e = null;
                        qew.e().stopService(qew.f());
                        ajdy.a((Throwable) new IOException("Failed to bind to chat service"));
                    }
                }
                return ajxw.a;
            }
        }

        /* renamed from: qew$c$a */
        static final class a<T> implements ajfb<Throwable> {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                synchronized (this.a.a.b) {
                    this.a.a.c = null;
                }
            }
        }

        c(qew qew) {
            this.a = qew;
        }

        private ajdx<pqs> a() {
            ajdx<pqs> ajdx;
            synchronized (this.a.b) {
                ajdx = this.a.c;
                if (ajdx == null) {
                    new StringBuilder("No existing chat session, creating a new one. SccpChatSessionController: ").append(this.a);
                    this.a.c = ajdx.a((ajea) new qex(new b(this.a))).b((ajdw) this.a.h.b()).a().d((ajfb) new a(this));
                    ajdx = this.a.c;
                    if (ajdx == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
            }
            return ajdx;
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: qew$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdx ajdx = (ajdx) obj;
            akcr.b(ajdx, "it");
            return ajdx;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(qew.class), "context", "getContext()Landroid/content/Context;"), new akdc(akde.a(qew.class), "chatIntent", "getChatIntent()Landroid/content/Intent;")};
    }

    public qew(ajwy<Context> ajwy, zfw zfw, ajwy<adqp> ajwy2, ajwy<Map<Class<?>, ajdx<prr>>> ajwy3, ajwy<gpb> ajwy4) {
        akcr.b(ajwy, "contextProvider");
        akcr.b(zfw, "schedulers");
        akcr.b(ajwy2, "userMessagingGatewayService");
        akcr.b(ajwy3, "messageReceiverMap");
        akcr.b(ajwy4, "userAuthStore");
        this.g = ajwy;
        this.h = zfw;
        this.i = ajwy2;
        this.j = ajwy3;
        this.k = ajwy4;
    }

    public final ajdx<pqs> a() {
        Object c = ajdx.c((Callable) new c(this)).a((ajfc) d.a).c(20, TimeUnit.SECONDS);
        akcr.a(c, "Single.fromCallable {\n  …out(20, TimeUnit.SECONDS)");
        return c;
    }

    public final void b() {
        adqo adqo = this.a;
        if (adqo != null) {
            adqo.a(true);
        }
    }

    public final void c() {
        adqo adqo = this.a;
        if (adqo != null) {
            adqo.a(false);
            adqo.a();
        }
    }

    public final void d() {
        adqo adqo = this.a;
        if (adqo != null) {
            adqo.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final Context e() {
        return (Context) this.l.b();
    }

    /* Access modifiers changed, original: final */
    public final Intent f() {
        return (Intent) this.m.b();
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        synchronized (this.d) {
            if (this.e != null && this.f) {
                Context e = e();
                ServiceConnection serviceConnection = this.e;
                if (serviceConnection == null) {
                    akcr.a();
                }
                e.unbindService(serviceConnection);
                this.e = null;
                this.f = false;
            }
        }
    }

    public final void h() {
        g();
        synchronized (this.b) {
            this.c = null;
        }
        adqo adqo = this.a;
        if (adqo != null) {
            adqo.b(this);
        }
    }
}
