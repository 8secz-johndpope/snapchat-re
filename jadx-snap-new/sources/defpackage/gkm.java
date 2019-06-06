package defpackage;

import com.brightcove.player.event.EventType;
import com.google.common.base.Optional;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/* renamed from: gkm */
public final class gkm extends saa {
    final Optional<ftk> a;
    private final HashMap<String, Long> b = new HashMap();
    private final ajxe c = ajxh.a(new a(this));

    /* renamed from: gkm$a */
    static final class a extends akcs implements akbk<Long> {
        private /* synthetic */ gkm a;

        a(gkm gkm) {
            this.a = gkm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean isPresent = this.a.a.isPresent();
            Object valueOf = Long.valueOf(3145728);
            return isPresent ? (Long) ((ftk) this.a.a.get()).e(fxm.STATUS_413_FILTER_MAX_MIN_BYTES).or(valueOf) : valueOf;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gkm.class), "maxMinBytes", "getMaxMinBytes()Ljava/lang/Long;");
    }

    public gkm(Optional<ftk> optional) {
        akcr.b(optional, "config");
        this.a = optional;
    }

    private final long a(long j) {
        Object a = a();
        akcr.a(a, "maxMinBytes");
        return Math.max(a.longValue(), j);
    }

    private final Long a() {
        return (Long) this.c.b();
    }

    /* JADX WARNING: Missing block: B:6:0x002a, code skipped:
            if (r1 == null) goto L_0x002c;
     */
    private final java.lang.Long a(java.lang.String r6, long r7) {
        /*
        r5 = this;
        r0 = r5.b;
        monitor-enter(r0);
        r1 = r5.b;	 Catch:{ all -> 0x003f }
        r1 = r1.get(r6);	 Catch:{ all -> 0x003f }
        r1 = (java.lang.Long) r1;	 Catch:{ all -> 0x003f }
        if (r1 == 0) goto L_0x002c;
    L_0x000d:
        r2 = r5.b;	 Catch:{ all -> 0x003f }
        r3 = "maxRequestSize";
        defpackage.akcr.a(r1, r3);	 Catch:{ all -> 0x003f }
        r3 = r1.longValue();	 Catch:{ all -> 0x003f }
        r3 = java.lang.Math.min(r3, r7);	 Catch:{ all -> 0x003f }
        r3 = r5.a(r3);	 Catch:{ all -> 0x003f }
        r1 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x003f }
        r1 = r2.put(r6, r1);	 Catch:{ all -> 0x003f }
        r1 = (java.lang.Long) r1;	 Catch:{ all -> 0x003f }
        if (r1 != 0) goto L_0x003d;
    L_0x002c:
        r1 = r5.b;	 Catch:{ all -> 0x003f }
        r7 = r5.a(r7);	 Catch:{ all -> 0x003f }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x003f }
        r6 = r1.put(r6, r7);	 Catch:{ all -> 0x003f }
        r1 = r6;
        r1 = (java.lang.Long) r1;	 Catch:{ all -> 0x003f }
    L_0x003d:
        monitor-exit(r0);
        return r1;
    L_0x003f:
        r6 = move-exception;
        monitor-exit(r0);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkm.a(java.lang.String, long):java.lang.Long");
    }

    private static String a(sak<sai> sak) {
        try {
            URL url = new URL(sak.i());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(url.getHost());
            stringBuilder.append(url.getPath());
            return stringBuilder.toString();
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private static boolean b(sak<sai> sak) {
        return sak.k() == sac.PUT || sak.k() == sac.POST;
    }

    public final void a(sak<sai> sak, sab sab) {
        akcr.b(sak, "request");
        akcr.b(sab, "chain");
        if (gkm.b(sak)) {
            String a = gkm.a((sak) sak);
            if (a != null) {
                Object obj = (Long) this.b.get(a);
                if (obj != null) {
                    sai sai = (sai) sak.n();
                    if (sai != null) {
                        long c = sai.c();
                        akcr.a(obj, "maxRequestSize");
                        if (c >= obj.longValue()) {
                            StringBuilder stringBuilder = new StringBuilder("Request size ");
                            stringBuilder.append(c);
                            stringBuilder.append(" is larger than ");
                            stringBuilder.append(obj);
                            saq a2 = sbj.a(new IllegalArgumentException(stringBuilder.toString()));
                            if (a2 != null) {
                                super.a(a2, sab);
                                return;
                            }
                            throw new ajxt("null cannot be cast to non-null type com.snap.network.transport.api.Response<com.snap.network.transport.api.Payload>");
                        }
                    }
                }
            }
        }
        super.a((sak) sak, sab);
    }

    public final void a(saq<sai> saq, sab sab) {
        akcr.b(saq, EventType.RESPONSE);
        akcr.b(sab, "chain");
        if (saq.a() == 413) {
            Object a = sab.a();
            String str = "chain.context()";
            akcr.a(a, str);
            a = a.b();
            String str2 = "chain.context().request";
            akcr.a(a, str2);
            if (gkm.b(a)) {
                a = sab.a();
                akcr.a(a, str);
                sak b = a.b();
                akcr.a((Object) b, str2);
                String a2 = gkm.a(b);
                if (a2 != null) {
                    Object a3 = sab.a();
                    akcr.a(a3, str);
                    Object b2 = a3.b();
                    akcr.a(b2, str2);
                    sai sai = (sai) b2.n();
                    if (sai != null) {
                        a(a2, sai.c());
                    }
                }
            }
        }
        super.a((saq) saq, sab);
    }
}
