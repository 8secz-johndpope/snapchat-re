package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.addlive.impl.video.AndroidVideoService;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.snapchat.talkcorev3.CognacSession;
import com.snapchat.talkcorev3.Logger;
import com.snapchat.talkcorev3.PresenceService;
import com.snapchat.talkcorev3.Session;
import com.snapchat.talkcorev3.TalkCore;
import defpackage.abiq.a;
import defpackage.yxk.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yxv */
public class yxv implements b, yyt {
    private d A;
    private abjh B = new 2();
    final Handler a;
    final Map<String, yxj> b = new ConcurrentHashMap();
    PresenceService c;
    TalkCore d;
    final igw e = new igw();
    private final zgb f;
    private final abjo g;
    private final abjm h;
    private final gqr i;
    private final Context j;
    private final List<c> k = new ArrayList(2);
    private final Map<String, ywx> l = new ConcurrentHashMap();
    private final AndroidVideoService m = new AndroidVideoService();
    private final yxy n = new yxy();
    private final ajwl<Map<String, abie>> o = new ajwl();
    private boolean p;
    private final String q;
    private final abji r;
    private final abjn s;
    private final abjq t;
    private final abjd u;
    private final abju v;
    private final abpo<yxb> w;
    private boolean x;
    private yxr y;
    private exs z;

    /* renamed from: yxv$2 */
    class 2 implements abjh {
        2() {
        }

        private <T> ArrayList<T> a(List<T> list) {
            return (list == null || (list instanceof ArrayList)) ? (ArrayList) list : Lists.newArrayList((Iterable) list);
        }

        private static <K, V> HashMap<K, V> a(Map<K, V> map) {
            return (map == null || (map instanceof HashMap)) ? (HashMap) map : Maps.newHashMap(map);
        }

        private static /* synthetic */ void a(abjb abjb, String str, boolean z, abip abip) {
            abip.a(abjb.b(), str, z);
            abip.c();
        }

        public final void a(abjb abjb, String str, boolean z) {
            yxv.this.e.a(yxv.this.b(abjb.a()).a(new -$$Lambda$yxv$2$ib7tJljmr0BeBp54AXv1clV_dBw(abjb, str, z), -$$Lambda$yxv$2$clYhnFfb2M8yqjdDpAEpCvYYm94.INSTANCE));
        }

        public final void a(abjf abjf) {
            yxv.this.a.post(new -$$Lambda$yxv$2$SKrbmzkKYsxP87b5aAXozN79ccA(this, abjf));
        }

        public final void a(String str, List<String> list) {
            yxj yxj = (yxj) yxv.this.b.get(str);
            if (yxj != null) {
                yxj.a((List) list);
            }
        }

        public final void a(boolean z) {
            yxv.this.a.post(new -$$Lambda$yxv$2$tqJbEji5UgqI6TYqBkK-wBUCdq0(this, z));
        }
    }

    /* renamed from: yxv$d */
    public static class d extends Logger {
        private final Handler a;

        d(Handler handler) {
            this.a = handler;
        }

        private /* synthetic */ void a(String str, String str2) {
        }

        public final void log(String str, String str2) {
            this.a.post(new -$$Lambda$yxv$d$nw4B478ZVszC2C6QrUUIUaGedfk(this, str, str2));
        }
    }

    /* renamed from: yxv$c */
    interface c {
        void create(TalkCore talkCore);
    }

    /* renamed from: yxv$a */
    class a implements ywe {
        private /* synthetic */ abjt a;

        a(abjt abjt) {
            this.a = abjt;
        }

        public final Iterable<abjv> a() {
            return this.a.a();
        }

        public final void a(akbk<ajxw> akbk) {
            abjt abjt = this.a;
            akbk.getClass();
            abjt.a(new -$$Lambda$vlaJzo87s9Xz3G6Z_B3UcSjZSiE(akbk));
        }

        public final Iterable<abjv> b() {
            return this.a.b();
        }

        public final abin c() {
            return this.a.d();
        }
    }

    /* renamed from: yxv$b */
    static abstract class b<T> implements a<T> {
        private final ajdy<T> a;

        private b(ajdy<T> ajdy) {
            this.a = ajdy;
        }

        /* synthetic */ b(ajdy ajdy, byte b) {
            this(ajdy);
        }

        static <T> b<T> a(ajdy<T> ajdy, final akbl<T, ajxw> akbl) {
            return new b<T>(ajdy) {
                /* Access modifiers changed, original: final */
                public final void a(T t) {
                    akbl.invoke(t);
                }
            };
        }

        static <T> void a(a<T> aVar, Runnable runnable) {
            if (aVar instanceof b) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    acbm.a(th).a("TalkManagerImpl");
                    ((b) aVar).a.a(th);
                    return;
                }
            }
            runnable.run();
        }

        public abstract void a(T t);

        public void onSessionCreated(T t) {
            if (this.a.isDisposed()) {
                a(t);
            } else {
                this.a.a((Object) t);
            }
        }
    }

    public yxv(Context context, abjo abjo, abjm abjm, gqr gqr, abji abji, abjd abjd, abjq abjq, abjn abjn, String str, Object obj, abju abju, zgb zgb, exs exs) {
        this.g = abjo;
        this.h = abjm;
        this.i = gqr;
        HandlerThread handlerThread = new HandlerThread("TalkCoreHandlerThread");
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
        this.f = zgb;
        AndroidVideoService.setSharedEglLock(obj);
        this.j = context.getApplicationContext();
        this.w = abpo.a(new -$$Lambda$yxv$bgA9Fx2_ZbdufCTRXeugc0aR_uo(abjd, abju));
        this.r = abji;
        this.r.a(this.B);
        this.u = abjd;
        yxy yxy = this.n;
        AndroidVideoService androidVideoService = this.m;
        abjd abjd2 = this.u;
        yxy.b = androidVideoService;
        yxy.c = abjd2;
        yxy.b.setFrameReceiverListener(yxy.d);
        this.t = abjq;
        this.s = abjn;
        this.q = str;
        this.v = abju;
        this.z = exs;
    }

    private yxj a(String str, TalkCore talkCore, boolean z, abjo abjo) {
        String str2 = str;
        yxj yxj = (yxj) this.b.get(str);
        if (yxj != null) {
            return yxj;
        }
        Session createSession = talkCore.createSession(str, z);
        Handler handler = this.a;
        String str3 = this.q;
        abjt a = abjo.a(str);
        abji abji = this.r;
        abjn abjn = this.s;
        ywx ywx = (ywx) this.l.get(str);
        if (ywx == null) {
            ywx = new ywx();
            this.l.put(str, ywx);
        }
        yxk yxk = new yxk(str, createSession, handler, str3, a, abji, abjn, ywx, this, z);
        this.b.put(str, yxk);
        return yxk;
    }

    private /* synthetic */ void a(String str, String str2, abjt abjt, boolean z, abiz abiz, abjl abjl, abix abix, gqr gqr, a aVar, TalkCore talkCore) {
        abjt abjt2 = abjt;
        String str3 = str;
        String str4 = str2;
        CognacSession createCognacSession = talkCore.createCognacSession(str, str2);
        Handler handler = this.a;
        a aVar2 = new a(abjt2);
        zgb zgb = this.f;
        ajej[] ajejArr = new ajej[1];
        abjt.getClass();
        ajejArr[0] = ajek.a(new -$$Lambda$48vFeFVT4d0I25RHN0yAgeO_hqU(abjt2));
        aVar.onSessionCreated(new ywo(z, abiz, abjl, createCognacSession, handler, aVar2, abix, zgb, gqr, new ajei(ajejArr)));
    }

    private /* synthetic */ void a(String str, String str2, boolean z, abiz abiz, abjl abjl, abix abix, gqr gqr, a aVar) {
        String str3 = str2;
        this.k.add(new -$$Lambda$yxv$XwdEiatjmRnTQ9sb-z-iR6rjm18(this, str, str3, this.g.a(str, str3), z, abiz, abjl, abix, gqr, aVar));
        if (g()) {
            f();
        }
    }

    private /* synthetic */ void b(a aVar, String str) {
        this.k.add(new -$$Lambda$yxv$bp7IUzMoaNZuqjoYGPqvkk8bQyA(this, aVar, str));
        if (g()) {
            f();
        }
    }

    private /* synthetic */ void b(a aVar, String str, boolean z, abio abio) {
        this.k.add(new -$$Lambda$yxv$d7vl8JxWd_oVvDFvWrVR2Ep-oJ4(this, aVar, str, z, abio));
        if (g()) {
            f();
        }
    }

    private List<String> d(String str) {
        abie abie = (abie) e().get(str);
        return abie == null ? Collections.emptyList() : abie.b();
    }

    private Map<String, abie> e() {
        PresenceService presenceService = this.c;
        if (presenceService != null) {
            return Maps.transformValues(presenceService.getActiveConversations(), new -$$Lambda$yxv$XGhUsJhCSLHvWKNtlEuCEygNzXg(this));
        }
        this.a.post(new -$$Lambda$yxv$NACyzx1FxoLfWvZqueiB2VUXP8Q(this));
        return Collections.emptyMap();
    }

    private /* synthetic */ void e(String str) {
        this.b.remove(str);
        ywx ywx = (ywx) this.l.get(str);
        if (ywx != null && !ywx.a() && !this.b.containsKey(str)) {
            this.l.remove(str);
        }
    }

    private void f() {
        if (!(this.x || this.k.isEmpty())) {
            this.x = true;
            yxb yxb = (yxb) this.w.get();
            TalkCore talkCore = this.d;
            talkCore.setProperty("global.media.enableHwVP8Enc", yxb.a(yxb.a));
            talkCore.setProperty("global.media.enableHwVP8Dec", yxb.a(yxb.d));
            talkCore.setProperty("global.media.enableH264Enc", yxb.a(yxb.b));
            talkCore.setProperty("global.media.enableH264Dec", yxb.a(yxb.e));
            talkCore.setProperty("global.media.enableH265Enc", yxb.a(yxb.c));
            talkCore.setProperty("global.media.enableH265Dec", yxb.a(yxb.f));
        }
        for (c create : this.k) {
            create.create(this.d);
        }
        this.k.clear();
    }

    private boolean g() {
        if (this.d != null || this.y != null) {
            return this.y == null;
        } else {
            this.y = new yxr();
            this.A = new d(this.a);
            yxr yxr = this.y;
            Context context = this.j;
            Handler handler = this.a;
            this.e.a(yxr.a(context, handler, this.z, this.q, new yxq(this, handler), new yxc(this, this.a, this.r), this.A, new yxs(this.t), this.m, this.v, new -$$Lambda$yxv$SEY7c0bZO7aORzs1dpoqQjh0D8c(this)));
            return false;
        }
    }

    private /* synthetic */ void h() {
        boolean z;
        yxy yxy;
        TalkCore talkCore = this.d;
        if (talkCore != null) {
            talkCore.dispose();
            this.e.dispose();
            this.d = null;
            this.c = null;
            z = false;
        } else {
            if (this.y != null) {
                z = true;
            }
            this.y = null;
            yxy = this.n;
            yxy.a.clear();
            yxy.b.setFrameReceiverListener(null);
            yxy.b = null;
            yxy.c = null;
            this.b.clear();
            this.k.clear();
            this.l.clear();
        }
        this.p = z;
        this.y = null;
        yxy = this.n;
        yxy.a.clear();
        yxy.b.setFrameReceiverListener(null);
        yxy.b = null;
        yxy.c = null;
        this.b.clear();
        this.k.clear();
        this.l.clear();
    }

    public final ajdx<abit> a(String str, boolean z, abio abio) {
        return ajdx.a(new -$$Lambda$yxv$qXvU-M54-yj0L3U_Cis_-u0CB8g(this, str, z, abio));
    }

    public final ajdx<yyq> a(String str, boolean z, yyu yyu) {
        return ajdx.a(new -$$Lambda$yxv$GDxqCe6EoTsVm94eAig6Ni23cNI(this, str, z, yyu));
    }

    public final void a() {
        this.a.post(new -$$Lambda$yxv$HdPyyYgN52ItUKLrifgxZL83SGA(this));
    }

    public final void a(String str) {
        this.a.post(new -$$Lambda$yxv$UszOFpgNCyzmBFx7Ccrg-MtXtpQ(this, str));
    }

    public final void a(String str, String str2, abjl abjl, abix abix, abiz abiz, gqr gqr, a<abih> aVar) {
        this.a.post(new -$$Lambda$yxv$ogmVMd8REnQpKe3A8ZpXRH2CkRI(this, str, str2, true, abiz, abjl, abix, gqr, aVar));
    }

    public final ajdx<abip> b(String str) {
        return ajdx.a(new -$$Lambda$yxv$wBfJz9RVnkxDzUciC665i-vGVpI(this, str));
    }

    public final boolean b() {
        for (yxj h : this.b.values()) {
            if (h.h()) {
                return true;
            }
        }
        return false;
    }

    public ajdp<Map<String, abie>> c() {
        if (this.c == null) {
            this.a.post(new -$$Lambda$yxv$NACyzx1FxoLfWvZqueiB2VUXP8Q(this));
        }
        return this.o;
    }

    public final Map<String, abjv> c(String str) {
        yxj yxj = (yxj) this.b.get(str);
        return ajyu.b(yxj == null ? this.h.a(str) : yxj.j().b(), (akbl) -$$Lambda$6HMkYueKtZwFoTxRVozf_PiKtKk.INSTANCE);
    }

    public final void d() {
        this.o.a(e());
    }
}
