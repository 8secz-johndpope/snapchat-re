package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;

/* renamed from: nrx */
public final class nrx implements gvn {
    final nmn a;
    final aipn<achb<zjm, zjk>> b;
    final zjw c;
    private final List<String> d;

    /* renamed from: nrx$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ nrx a;

        a(nrx nrx) {
            this.a = nrx;
        }

        public final /* synthetic */ Object call() {
            achb achb = (achb) this.a.b.get();
            if (achb.c) {
                acgu acgu = nnc.b;
                akcr.a((Object) acgu, "MapPassportFeature.PRESENT_DEFAULT");
                achb.a((acig) new acii(acgu));
            }
            return ajxw.a;
        }
    }

    /* renamed from: nrx$b */
    static final class b<V> implements Callable<Object> {
        private /* synthetic */ nrx a;
        private /* synthetic */ nmj b;

        b(nrx nrx, nmj nmj) {
            this.a = nrx;
            this.b = nmj;
        }

        public final /* synthetic */ Object call() {
            achb achb = (achb) this.a.b.get();
            acig acig = null;
            if (achb.c) {
                aciv i = achb.i();
                if (i != null) {
                    acig = (zjk) i.d();
                }
                if (acig instanceof nmx) {
                    nmx nmx = (nmx) acig;
                    Object obj = this.b;
                    akcr.b(obj, "mapScreenPayload");
                    nmx.a.a(obj);
                } else {
                    achb.a((achg) adcw.a, true, (acih) this.b);
                }
            } else {
                this.a.c.a(adcw.a, false, null, this.b);
            }
            return ajxw.a;
        }
    }

    /* renamed from: nrx$c */
    static final class c implements Runnable {
        private /* synthetic */ nrx a;
        private /* synthetic */ abbd b;

        c(nrx nrx, abbd abbd) {
            this.a = nrx;
            this.b = abbd;
        }

        public final void run() {
            achb achb = (achb) this.a.b.get();
            if (!achb.c) {
                zjw.a(this.a.c, adcw.a, false, nrx.a(this.a, this.b), null, 8);
                this.a.a.a(this.b);
            } else if ((akcr.a((zjm) achb.h(), nmo.a) ^ 1) != 0) {
                achb.a((acig) nrx.a(this.a, this.b));
            }
        }
    }

    public nrx(nmn nmn, aipn<achb<zjm, zjk>> aipn, zjw zjw) {
        akcr.b(nmn, "settingsPageFactory");
        akcr.b(aipn, "navigationHost");
        akcr.b(zjw, "deepLinkNavigator");
        this.a = nmn;
        this.b = aipn;
        this.c = zjw;
        Object of = ImmutableList.of("snapchat://map", "snapchat://map/..*", "snapchat://map?..*", "https://www.snapchat.com/maps/..*", "http://www.snapchat.com/maps/..*");
        akcr.a(of, "ImmutableList.of(\n      …w.snapchat.com/maps/..*\")");
        this.d = (List) of;
    }

    public static final /* synthetic */ acip a(nrx nrx, abbd abbd) {
        Object obj = abbd == abbd.PROFILE ? nmo.c : nmo.b;
        Object obj2 = nrx.b.get();
        akcr.a(obj2, "navigationHost.get()");
        achb achb = (achb) obj2;
        achd a = nrx.a.a(abbd);
        akcr.a(obj, "navigationAction");
        return new acip(achb, a, obj);
    }

    /* JADX WARNING: Missing block: B:5:0x0041, code skipped:
            if (r15 == null) goto L_0x0043;
     */
    private final defpackage.ajcx a(android.net.Uri r15) {
        /*
        r14 = this;
        r0 = defpackage.nrx.b(r15);
        r1 = "Completable.complete()";
        if (r0 == 0) goto L_0x004e;
    L_0x0008:
        r0 = (java.lang.Number) r0;
        r3 = r0.doubleValue();
        r0 = defpackage.nrx.e(r15);
        if (r0 == 0) goto L_0x0043;
    L_0x0014:
        r0 = (java.lang.Number) r0;
        r5 = r0.doubleValue();
        r7 = defpackage.nrx.f(r15);
        r0 = new nmj;
        r11 = defpackage.nmd.FROM_DEEP_LINK;
        r12 = defpackage.nrx.g(r15);
        r13 = new nmt;
        r2 = "display";
        r9 = r15.getQueryParameter(r2);
        r2 = "poiid";
        r10 = r15.getQueryParameter(r2);
        r2 = r13;
        r2.<init>(r3, r5, r7, r9, r10);
        r13 = (defpackage.nmi) r13;
        r0.<init>(r11, r12, r13);
        r15 = r14.a(r0);
        if (r15 != 0) goto L_0x004c;
    L_0x0043:
        r15 = defpackage.ajhn.a;
        r15 = defpackage.ajvo.a(r15);
        defpackage.akcr.a(r15, r1);
    L_0x004c:
        if (r15 != 0) goto L_0x0057;
    L_0x004e:
        r15 = defpackage.ajhn.a;
        r15 = defpackage.ajvo.a(r15);
        defpackage.akcr.a(r15, r1);
    L_0x0057:
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrx.a(android.net.Uri):ajcx");
    }

    private final ajcx a(List<String> list) {
        if (list.size() != 1) {
            return a(new nmj(nmd.FROM_DEEP_LINK));
        }
        Matcher matcher = nry.a().matcher((String) list.get(0));
        if ((matcher.find() && matcher.groupCount() == 2) || matcher.groupCount() == 3) {
            String group;
            double c;
            if (matcher.groupCount() == 3) {
                group = matcher.group(3);
                akcr.a((Object) group, "matcher.group(3)");
                c = nrx.c(group);
            } else {
                c = 14.0d;
            }
            double d = c;
            group = matcher.group(1);
            akcr.a((Object) group, "matcher.group(1)");
            Double a = nrx.a(group);
            if (a != null) {
                double doubleValue = a.doubleValue();
                String group2 = matcher.group(2);
                akcr.a((Object) group2, "matcher.group(2)");
                Double b = nrx.b(group2);
                if (b != null) {
                    return a(new nmj(nmd.FROM_DEEP_LINK, null, new nmt(doubleValue, b.doubleValue(), d)));
                }
            }
        }
        Object a2 = ajvo.a(ajhn.a);
        akcr.a(a2, "Completable.complete()");
        return a2;
    }

    private final ajcx a(nmj nmj) {
        Object b = ajcx.b((Callable) new b(this, nmj));
        akcr.a(b, "Completable.fromCallable…nPayload)\n        }\n    }");
        return b;
    }

    private static Double a(String str) {
        Double c = akfz.c(str);
        if (c != null) {
            double doubleValue = c.doubleValue();
            if (doubleValue >= -90.0d && doubleValue <= 90.0d) {
                return Double.valueOf(doubleValue);
            }
        }
        return null;
    }

    private static Double b(Uri uri) {
        String queryParameter = uri.getQueryParameter("lat");
        return queryParameter != null ? nrx.a(queryParameter) : null;
    }

    private static Double b(String str) {
        Double c = akfz.c(str);
        if (c != null) {
            double doubleValue = c.doubleValue();
            if (doubleValue >= -180.0d && doubleValue <= 180.0d) {
                return Double.valueOf(doubleValue);
            }
        }
        return null;
    }

    private static double c(String str) {
        Double c = akfz.c(str);
        if (c != null) {
            double doubleValue = c.doubleValue();
            return (doubleValue < 0.0d || doubleValue > 20.0d) ? 14.0d : doubleValue;
        }
    }

    private static Double e(Uri uri) {
        String queryParameter = uri.getQueryParameter("lng");
        return queryParameter != null ? nrx.b(queryParameter) : null;
    }

    private static double f(Uri uri) {
        String queryParameter = uri.getQueryParameter(MapboxEvent.KEY_ZOOM);
        return queryParameter != null ? nrx.c(queryParameter) : 14.0d;
    }

    private static abbd g(Uri uri) {
        String queryParameter = uri.getQueryParameter("open_source");
        CharSequence charSequence = queryParameter;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        abbd abbd = null;
        if (obj != null) {
            return null;
        }
        if (queryParameter != null) {
            try {
                abbd = abbd.valueOf(queryParameter);
            } catch (IllegalArgumentException unused) {
            }
        }
        return abbd;
    }

    public final List<String> a() {
        return this.d;
    }

    /* JADX WARNING: Missing block: B:27:0x00c0, code skipped:
            if (r10 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Missing block: B:43:0x010a, code skipped:
            if (r10 == null) goto L_0x010c;
     */
    public final defpackage.ajcx c(android.net.Uri r10) {
        /*
        r9 = this;
        r0 = "uri";
        defpackage.akcr.b(r10, r0);
        r0 = r10.getScheme();
        r1 = "Completable.complete()";
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        goto L_0x016d;
    L_0x000f:
        r2 = r0.hashCode();
        r3 = 3213448; // 0x310888 float:4.503E-39 double:1.5876543E-317;
        r4 = "uri.pathSegments";
        if (r2 == r3) goto L_0x0159;
    L_0x001a:
        r3 = 99617003; // 0x5f008eb float:2.2572767E-35 double:4.9217339E-316;
        if (r2 == r3) goto L_0x0145;
    L_0x001f:
        r3 = 284397090; // 0x10f38e22 float:9.606559E-29 double:1.40510832E-315;
        if (r2 == r3) goto L_0x0026;
    L_0x0024:
        goto L_0x016d;
    L_0x0026:
        r2 = "snapchat";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x016d;
    L_0x002e:
        r0 = r10.getPathSegments();
        defpackage.akcr.a(r0, r4);
        r0 = defpackage.ajyu.g(r0);
        r0 = (java.lang.String) r0;
        if (r0 != 0) goto L_0x003f;
    L_0x003d:
        goto L_0x0139;
    L_0x003f:
        r2 = r0.hashCode();
        r3 = "userid";
        switch(r2) {
            case -1309148525: goto L_0x0116;
            case -1266283874: goto L_0x00e6;
            case 111178: goto L_0x00d9;
            case 94845685: goto L_0x00cc;
            case 98629247: goto L_0x0080;
            case 1216777234: goto L_0x0067;
            case 1434631203: goto L_0x004a;
            default: goto L_0x0048;
        };
    L_0x0048:
        goto L_0x0139;
    L_0x004a:
        r1 = "settings";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0139;
    L_0x0052:
        r10 = defpackage.nrx.g(r10);
        r0 = new nrx$c;
        r0.<init>(r9, r10);
        r0 = (java.lang.Runnable) r0;
        r10 = defpackage.ajcx.a(r0);
        r0 = "Completable.fromRunnable…enSource)\n        }\n    }";
        defpackage.akcr.a(r10, r0);
        return r10;
    L_0x0067:
        r10 = "passport";
        r10 = r0.equals(r10);
        if (r10 == 0) goto L_0x0139;
    L_0x006f:
        r10 = new nrx$a;
        r10.<init>(r9);
        r10 = (java.util.concurrent.Callable) r10;
        r10 = defpackage.ajcx.b(r10);
        r0 = "Completable.fromCallable…DEFAULT))\n        }\n    }";
        defpackage.akcr.a(r10, r0);
        return r10;
    L_0x0080:
        r2 = "group";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0139;
    L_0x0088:
        r0 = "group_member_ids";
        r0 = r10.getQueryParameter(r0);
        if (r0 == 0) goto L_0x00c2;
    L_0x0090:
        r2 = new nmj;
        r3 = defpackage.nmd.FROM_DEEP_LINK;
        r4 = defpackage.nrx.g(r10);
        r5 = new nmv;
        r0 = (java.lang.CharSequence) r0;
        r6 = 1;
        r6 = new char[r6];
        r7 = 0;
        r8 = 95;
        r6[r7] = r8;
        r0 = defpackage.akgc.b(r0, r6);
        r6 = "group_display_name";
        r6 = r10.getQueryParameter(r6);
        r7 = "feedid";
        r10 = r10.getQueryParameter(r7);
        r5.<init>(r0, r6, r10);
        r5 = (defpackage.nmi) r5;
        r2.<init>(r3, r4, r5);
        r10 = r9.a(r2);
        if (r10 != 0) goto L_0x00cb;
    L_0x00c2:
        r10 = defpackage.ajhn.a;
        r10 = defpackage.ajvo.a(r10);
        defpackage.akcr.a(r10, r1);
    L_0x00cb:
        return r10;
    L_0x00cc:
        r1 = "coord";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0139;
    L_0x00d4:
        r10 = r9.a(r10);
        return r10;
    L_0x00d9:
        r1 = "poi";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0139;
    L_0x00e1:
        r10 = r9.a(r10);
        return r10;
    L_0x00e6:
        r2 = "friend";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0139;
    L_0x00ee:
        r0 = r10.getQueryParameter(r3);
        if (r0 == 0) goto L_0x010c;
    L_0x00f4:
        r2 = new nmj;
        r3 = defpackage.nmd.FROM_DEEP_LINK;
        r10 = defpackage.nrx.g(r10);
        r4 = new nmu;
        r4.<init>(r0);
        r4 = (defpackage.nmi) r4;
        r2.<init>(r3, r10, r4);
        r10 = r9.a(r2);
        if (r10 != 0) goto L_0x0115;
    L_0x010c:
        r10 = defpackage.ajhn.a;
        r10 = defpackage.ajvo.a(r10);
        defpackage.akcr.a(r10, r1);
    L_0x0115:
        return r10;
    L_0x0116:
        r1 = "explore";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0139;
    L_0x011e:
        r0 = new nmj;
        r1 = defpackage.nmd.FROM_DEEP_LINK;
        r2 = defpackage.nrx.g(r10);
        r4 = new nms;
        r10 = r10.getQueryParameter(r3);
        r4.<init>(r10);
        r4 = (defpackage.nmi) r4;
        r0.<init>(r1, r2, r4);
        r10 = r9.a(r0);
        return r10;
    L_0x0139:
        r10 = new nmj;
        r0 = defpackage.nmd.FROM_DEEP_LINK;
        r10.<init>(r0);
        r10 = r9.a(r10);
        return r10;
    L_0x0145:
        r2 = "https";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x016d;
    L_0x014d:
        r10 = r10.getPathSegments();
        defpackage.akcr.a(r10, r4);
        r10 = r9.a(r10);
        return r10;
    L_0x0159:
        r2 = "http";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x016d;
    L_0x0161:
        r10 = r10.getPathSegments();
        defpackage.akcr.a(r10, r4);
        r10 = r9.a(r10);
        return r10;
    L_0x016d:
        r10 = defpackage.ajhn.a;
        r10 = defpackage.ajvo.a(r10);
        defpackage.akcr.a(r10, r1);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrx.c(android.net.Uri):ajcx");
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
