package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: hoh */
public final class hoh {
    final long a = TimeUnit.HOURS.toMillis(24);
    final HashMap<String, abrj<agmh>> b;
    final Context c;
    final ihh d;
    private final zfw e;
    private final ajwy<hpv> f;

    /* renamed from: hoh$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hoh a;

        a(hoh hoh) {
            this.a = hoh;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (defpackage.agmh) r9;
            r0 = "linkableCheckResponse";
            defpackage.akcr.b(r9, r0);
            r0 = r9.a();
            r1 = 2;
            r2 = 1;
            if (r0 != 0) goto L_0x0010;
        L_0x000f:
            goto L_0x001c;
        L_0x0010:
            r3 = defpackage.hoi.a;
            r0 = r0.ordinal();
            r0 = r3[r0];
            if (r0 == r2) goto L_0x00a4;
        L_0x001a:
            if (r0 == r1) goto L_0x00a4;
        L_0x001c:
            r0 = new java.lang.IllegalStateException;
            r3 = r8.a;
            r4 = r9.a();
            r5 = 2131887033; // 0x7f1203b9 float:1.9408662E38 double:1.053292144E-314;
            r6 = 0;
            if (r4 != 0) goto L_0x002b;
        L_0x002a:
            goto L_0x0037;
        L_0x002b:
            r7 = defpackage.hoi.b;
            r4 = r4.ordinal();
            r4 = r7[r4];
            if (r4 == r2) goto L_0x0084;
        L_0x0035:
            if (r4 == r1) goto L_0x004d;
        L_0x0037:
            r9 = r3.c;
            r1 = new java.lang.Object[r2];
            r2 = defpackage.abpz.CONSTRUCTION_WORKER;
            r2 = defpackage.abqi.a(r2);
            r1[r6] = r2;
            r9 = r9.getString(r5, r1);
            r1 = "context.getString(\n     …oji.CONSTRUCTION_WORKER))";
        L_0x0049:
            defpackage.akcr.a(r9, r1);
            goto L_0x009a;
        L_0x004d:
            r9 = r9.f;
            if (r9 == 0) goto L_0x005e;
        L_0x0051:
            r9 = r9.a;
            if (r9 == 0) goto L_0x005e;
        L_0x0055:
            r9 = r9.isEmpty();
            r9 = java.lang.Boolean.valueOf(r9);
            goto L_0x005f;
        L_0x005e:
            r9 = 0;
        L_0x005f:
            r1 = java.lang.Boolean.FALSE;
            r9 = defpackage.akcr.a(r9, r1);
            if (r9 == 0) goto L_0x0078;
        L_0x0067:
            r9 = r3.c;
            r1 = new java.lang.Object[r2];
            r2 = defpackage.abpz.CONSTRUCTION_WORKER;
            r2 = defpackage.abqi.a(r2);
            r1[r6] = r2;
            r9 = r9.getString(r5, r1);
            goto L_0x0081;
        L_0x0078:
            r9 = r3.c;
            r1 = 2131887034; // 0x7f1203ba float:1.9408664E38 double:1.0532921443E-314;
            r9 = r9.getString(r1);
        L_0x0081:
            r1 = "when(response.channelLis…on_msg)\n                }";
            goto L_0x0049;
        L_0x0084:
            r9 = r3.c;
            r1 = 2131887035; // 0x7f1203bb float:1.9408666E38 double:1.053292145E-314;
            r2 = new java.lang.Object[r2];
            r3 = defpackage.abpz.MISCELLANEOUS_TECHNICAL;
            r3 = defpackage.abqi.a(r3);
            r2[r6] = r3;
            r9 = r9.getString(r1, r2);
            r1 = "context.getString(\n     …MISCELLANEOUS_TECHNICAL))";
            goto L_0x0049;
        L_0x009a:
            r0.<init>(r9);
            r0 = (java.lang.Throwable) r0;
            r9 = defpackage.ajdx.b(r0);
            return r9;
        L_0x00a4:
            r9 = defpackage.ajdx.b(r9);
            return r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hoh$a.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hoh$b */
    static final class b<T> implements ajfb<agmh> {
        private /* synthetic */ hoh a;
        private /* synthetic */ String b;

        b(hoh hoh, String str) {
            this.a = hoh;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b.put(this.b, new abrj((agmh) obj, this.a.d.a() + this.a.a));
        }
    }

    public hoh(ajwy<zgb> ajwy, Context context, ajwy<hpv> ajwy2, ihh ihh) {
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(context, "context");
        akcr.b(ajwy2, "storiesNetworkApi");
        akcr.b(ihh, "clock");
        this.c = context;
        this.f = ajwy2;
        this.d = ihh;
        ajwy.get();
        this.e = zgb.a(hbn.f, "DiscoverFeedDeeplinkValidator");
        this.b = new HashMap();
    }

    public final ajdx<agmh> a(String str) {
        Object c;
        String str2;
        akcr.b(str, "dsnapId");
        abrj abrj = (abrj) this.b.get(str);
        if (abrj == null || abrj.b() < this.d.a()) {
            Object b = ((hpv) this.f.get()).a(str).b((ajdw) this.e.g());
            akcr.a(b, "storiesNetworkApi.get()\n…eOn(schedulers.network())");
            b = b.a((ajfc) new a(this));
            akcr.a(b, "this.flatMap { linkableC…}\n            }\n        }");
            c = b.c((ajfb) new b(this, str));
            str2 = "storiesNetworkApi.get()\n…onTime)\n                }";
        } else {
            c = ajdx.b(abrj.a());
            str2 = "Single.just(cachedValue.value)";
        }
        akcr.a(c, str2);
        return c;
    }
}
