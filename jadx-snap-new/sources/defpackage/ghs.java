package defpackage;

import android.net.Uri;
import com.brightcove.player.event.Event;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ggn.a;
import defpackage.ggn.b;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ghs */
public final class ghs implements git {
    final ConcurrentHashMap<Uri, giv> a = new ConcurrentHashMap();
    private final ifg b;
    private final ihh c;

    /* renamed from: ghs$a */
    public static final class a implements defpackage.git.a {
        private /* synthetic */ ghs a;
        private /* synthetic */ Uri b;

        a(ghs ghs, Uri uri) {
            this.a = ghs;
            this.b = uri;
        }

        public final void a() {
            this.a.a(this.b, (defpackage.git.a) this).d();
        }

        public final void a(gej gej) {
            akcr.b(gej, "result");
            giv a = this.a.a(this.b, (defpackage.git.a) this, gej);
            if (a != null) {
                a.d();
            }
        }
    }

    /* renamed from: ghs$d */
    static final class d extends akcs implements akbk<b> {
        private /* synthetic */ ggo a;

        d(ggo ggo) {
            this.a = ggo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new b(this.a);
        }
    }

    /* renamed from: ghs$c */
    static final class c extends akcs implements akbk<a> {
        private /* synthetic */ ggo a;

        c(ggo ggo) {
            this.a = ggo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(this.a);
        }
    }

    /* renamed from: ghs$b */
    static final class b<T> implements ajdr<T> {
        final /* synthetic */ ghs a;
        final /* synthetic */ Uri b;

        b(ghs ghs, Uri uri) {
            this.a = ghs;
            this.b = uri;
        }

        public final void subscribe(final ajdq<gfw> ajdq) {
            akcr.b(ajdq, Event.EMITTER);
            this.a.a(this.b, (ajdq) ajdq).d();
            ajdq.a(ajek.a((ajev) new ajev(this) {
                private /* synthetic */ b a;

                /* JADX WARNING: Removed duplicated region for block: B:9:? A:{SYNTHETIC, RETURN} */
                /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
                public final void run() {
                    /*
                    r4 = this;
                    r0 = r4.a;
                    r0 = r0.a;
                    r1 = r4.a;
                    r1 = r1.b;
                    r2 = r3;
                    r3 = r0.a;
                    r3 = r3.get(r1);
                    r3 = (defpackage.giv) r3;
                    if (r3 == 0) goto L_0x001d;
                L_0x0014:
                    r3 = r3.b;
                    if (r3 == 0) goto L_0x001d;
                L_0x0018:
                    r2 = r3.remove(r2);
                    goto L_0x001e;
                L_0x001d:
                    r2 = 0;
                L_0x001e:
                    if (r2 == 0) goto L_0x0023;
                L_0x0020:
                    r0.c(r1);
                L_0x0023:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ghs$b$1.run():void");
                }
            }));
        }
    }

    public ghs(ifg ifg, ihh ihh) {
        akcr.b(ifg, "netEventBus");
        akcr.b(ihh, "clock");
        this.b = ifg;
        this.c = ihh;
    }

    private static <T> void a(ggo ggo, akbk<? extends T> akbk) {
        ggo.a.a(akbk.invoke());
    }

    private final giv d(Uri uri) {
        giv giv = (giv) this.a.get(uri);
        if (giv != null) {
            return giv;
        }
        giv = new giv(uri);
        this.a.put(uri, giv);
        return giv;
    }

    public final ggo a(Uri uri, rzg rzg, Set<? extends gdy> set) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(rzg, "schedulingContext");
        akcr.b(set, "cacheAccessControls");
        return new ggo(this.b.a(), uri, rzg, set);
    }

    public final git.a a(Uri uri) {
        akcr.b(uri, "contentUri");
        return new a(this, uri);
    }

    /* Access modifiers changed, original: final */
    public final giv a(Uri uri, ajdq<gfw> ajdq) {
        giv d;
        synchronized (this.a) {
            d = d(uri);
            d.b.add(ajdq);
        }
        return d;
    }

    /* Access modifiers changed, original: final */
    public final giv a(Uri uri, git.a aVar) {
        giv d;
        synchronized (this.a) {
            d = d(uri);
            d.a.add(aVar);
        }
        return d;
    }

    /* Access modifiers changed, original: final */
    public final giv a(Uri uri, git.a aVar, gej gej) {
        giv giv = (giv) this.a.get(uri);
        if (giv != null) {
            giv a = giv.a(aVar, gej);
            if (a != null) {
                c(uri);
                return a;
            }
        }
        return null;
    }

    public final ifl a(ggo ggo) {
        akcr.b(ggo, "contentResolverTrackingInfo");
        ghs.a(ggo, (akbk) new d(ggo));
        return new ifl(this.c);
    }

    public final void a(geg geg) {
        akcr.b(geg, "contentRequest");
        Uri a = giu.a(geg);
        if (a != null) {
            Object obj = (giv) this.a.get(a);
            if (obj != null) {
                akcr.a(obj, "contentRequest.getConten…kerSource[it] } ?: return");
                obj.c().d();
            }
        }
    }

    public final void a(ggo ggo, ifl ifl, gej gej) {
        akcr.b(ggo, "trackingInfo");
        akcr.b(gej, "result");
        ggo ggo2 = new ggo(ggo.a, ggo.b, ggo.c, ggo.d, Long.valueOf(ifl != null ? new ifl(this.c).a(ifl) : -1), Long.valueOf(gej.f().c), Boolean.valueOf(gej.f().b), Boolean.valueOf(gej.a()));
        ghs.a(ggo2, (akbk) new c(ggo2));
    }

    public final ajdp<gfw> b(Uri uri) {
        akcr.b(uri, "contentUri");
        Object j = ajdp.a((ajdr) new b(this, uri)).j(ajfu.a);
        akcr.a(j, "Observable.create { emit… }.distinctUntilChanged()");
        return j;
    }

    public final void b(geg geg) {
        akcr.b(geg, "contentRequest");
        Uri a = giu.a(geg);
        if (a != null) {
            Object obj = (giv) this.a.get(a);
            if (obj != null) {
                akcr.a(obj, "contentRequest.getConten…kerSource[it] } ?: return");
                obj.b().d();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(Uri uri) {
        synchronized (this.a) {
            giv giv = (giv) this.a.get(uri);
            if (giv != null && giv.a()) {
                this.a.remove(uri);
            }
        }
    }
}
