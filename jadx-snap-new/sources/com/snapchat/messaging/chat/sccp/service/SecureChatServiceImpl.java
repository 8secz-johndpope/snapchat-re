package com.snapchat.messaging.chat.sccp.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.common.base.Optional;
import defpackage.adpx;
import defpackage.adqi;
import defpackage.adqm;
import defpackage.adqn;
import defpackage.adqo;
import defpackage.adqp;
import defpackage.adqq;
import defpackage.aeie;
import defpackage.aesm;
import defpackage.aeuw;
import defpackage.aipp;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajej;
import defpackage.ajek;
import defpackage.ajfu;
import defpackage.ajwy;
import defpackage.gpb;
import defpackage.ifa;
import defpackage.igw;
import defpackage.iha;
import defpackage.ilv;
import defpackage.prr;
import defpackage.pry;
import defpackage.psw;
import defpackage.qqd;
import defpackage.qqe;
import defpackage.zgb;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SecureChatServiceImpl extends Service implements adqo {
    final Handler a = new Handler(Looper.getMainLooper());
    public ajwy<iha> b;
    public ajwy<adqi> c;
    public ajwy<ifa> d;
    public ajwy<zgb> e;
    public ajwy<ilv> f;
    public ajwy<psw> g;
    public ajwy<adqm> h;
    final Object i = new Object();
    volatile igw j = new igw();
    volatile boolean k = false;
    private final IBinder l = new adqn(this);
    private final Runnable m = new -$$Lambda$SecureChatServiceImpl$l9nG4DDMG6lRrCWws8Bx683F_hg(this);
    private final Set<defpackage.adqo.a> n = new CopyOnWriteArraySet();
    private volatile adqq o;
    private volatile ajej p = ajek.a(ajfu.b);
    private boolean q = true;
    private boolean r = false;
    private ajej s = null;

    class a implements adpx {
        private final ajwy<Map<Class<?>, ajdx<prr>>> a;

        public a(ajwy<Map<Class<?>, ajdx<prr>>> ajwy) {
            this.a = ajwy;
        }

        private /* synthetic */ void b(aesm aesm) {
            if (aesm instanceof aeuw) {
                for (Entry value : ((aeuw) aesm).a.entrySet()) {
                    ((Boolean) value.getValue()).booleanValue();
                }
            }
            if (!SecureChatServiceImpl.this.k) {
                ajdx ajdx = (ajdx) ((Map) this.a.get()).get(aesm.getClass());
                if (ajdx != null) {
                    synchronized (SecureChatServiceImpl.this.i) {
                        SecureChatServiceImpl.this.j.a(ajdx.e(new -$$Lambda$SecureChatServiceImpl$a$T1YdxMztJgogxKBxLjdPULEZN18(aesm)));
                    }
                }
            }
        }

        public final void a(aesm aesm) {
            if (aesm instanceof aeie) {
                SecureChatServiceImpl.this.a.post(new -$$Lambda$SecureChatServiceImpl$a$TMdtgSboM3XQkDiP0F9-jX4X3BU(this, aesm));
            }
            adqm adqm = (adqm) SecureChatServiceImpl.this.h.get();
            adqm.a = adqm.b.c();
        }
    }

    private /* synthetic */ void a(ajwy ajwy, ajwy ajwy2, ajwy ajwy3, ajwy ajwy4, Optional optional) {
        NetworkInfo networkInfo = (NetworkInfo) optional.orNull();
        if (networkInfo != null && networkInfo.isConnected()) {
            a(ajwy, ajwy2, ajwy3, ajwy4);
        }
    }

    private /* synthetic */ void c() {
        if (!this.q) {
            for (defpackage.adqo.a h : this.n) {
                h.h();
            }
            synchronized (this.i) {
                if (this.o != null) {
                    this.o.b.c();
                }
            }
            this.r = true;
            stopSelf();
        }
    }

    public final void a() {
        this.a.postDelayed(this.m, 90000);
    }

    public final void a(defpackage.adqo.a aVar) {
        this.n.add(aVar);
    }

    public final void a(aeie aeie, qqe qqe) {
        synchronized (this.i) {
            this.o.a();
            this.o.b.a(aeie, qqe);
        }
    }

    public final void a(ajwy<Context> ajwy, ajwy<adqp> ajwy2, ajwy<Map<Class<?>, ajdx<prr>>> ajwy3, ajwy<gpb> ajwy4) {
        synchronized (this.i) {
            if (this.o == null) {
                this.o = new adqq(ajwy, ajwy4, this.b, ajwy2, this.c, this.d, this.f);
                this.j = new igw();
                adqq adqq = this.o;
                adqq.a.add(new a(ajwy3));
                this.e.get();
                this.p = ((ifa) this.d.get()).e().j(ajfu.a).b((ajdw) zgb.a(pry.a, "SecureChatServiceImpl").b()).f(new -$$Lambda$SecureChatServiceImpl$0Znyz-VNYNoLZpr37vo9cd9Qq18(this, ajwy, ajwy2, ajwy3, ajwy4));
            }
            this.o.a();
        }
    }

    public final void a(boolean z) {
        this.a.removeCallbacks(this.m);
        this.q = z;
    }

    public final void b() {
        this.a.removeCallbacks(this.m);
        this.m.run();
    }

    public final void b(defpackage.adqo.a aVar) {
        this.n.remove(aVar);
    }

    public IBinder onBind(Intent intent) {
        this.a.removeCallbacks(null);
        return this.l;
    }

    public void onCreate() {
        aipp.a((Service) this);
        super.onCreate();
        this.a.removeCallbacks(null);
        this.r = false;
        ajdp j = ((psw) this.g.get()).c().j(ajfu.a);
        this.e.get();
        this.s = j.b((ajdw) zgb.a(pry.a, "SecureChatServiceImpl").i()).f(new -$$Lambda$SecureChatServiceImpl$mi4D69jBVYD8z6L82BcBKufeKAc(this));
    }

    public void onDestroy() {
        b();
        synchronized (this.i) {
            if (this.o != null) {
                adpx adpx = this.o;
                adpx.b.e();
                adpx.b.b((qqd) adpx);
                adpx.b.b(adpx);
                this.o.a.clear();
                this.o = null;
            }
            this.p.dispose();
            this.j.dispose();
        }
        ajej ajej = this.s;
        if (ajej != null) {
            ajej.dispose();
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
        }
        return 2;
    }
}
