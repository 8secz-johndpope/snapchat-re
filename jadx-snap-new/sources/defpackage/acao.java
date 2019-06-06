package defpackage;

import defpackage.agqn.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: acao */
public final class acao {

    /* renamed from: acao$a */
    static final class a extends akcs implements akbl<acam, CharSequence> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            acam acam = (acam) obj;
            akcr.a((Object) acam, "it");
            if (acam.d()) {
                str = "geo_sticker/geo_sticker";
            } else {
                String f = acam.c() ? "bitmoji-search" : acam.b() ? "bitmoji-recent" : acam.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(f);
                stringBuilder.append('/');
                stringBuilder.append(abxz.b(acao.a(acam)));
                str = stringBuilder.toString();
            }
            return str;
        }
    }

    /* renamed from: acao$b */
    static final class b extends akcs implements akbl<acam, String> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            acam acam = (acam) obj;
            StringBuilder stringBuilder = new StringBuilder("contextual_sticker/");
            akcr.a((Object) acam, "it");
            stringBuilder.append(acao.b(acam));
            return stringBuilder.toString();
        }
    }

    /* renamed from: acao$c */
    static final class c extends akcs implements akbl<acam, String> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            acam acam = (acam) obj;
            akcr.a((Object) acam, "it");
            return acao.a(acam);
        }
    }

    /* renamed from: acao$d */
    static final class d extends akcs implements akbl<acam, String> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            acam acam = (acam) obj;
            StringBuilder stringBuilder = new StringBuilder();
            akcr.a((Object) acam, "it");
            stringBuilder.append(acam.f());
            stringBuilder.append('/');
            stringBuilder.append(abxz.b(acao.a(acam)));
            return stringBuilder.toString();
        }
    }

    /* renamed from: acao$e */
    static final class e extends akcs implements akbl<acam, String> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (acam) obj;
            StringBuilder stringBuilder = new StringBuilder();
            akcr.a(obj, "it");
            stringBuilder.append(obj.f());
            stringBuilder.append('/');
            stringBuilder.append(obj.g());
            return stringBuilder.toString();
        }
    }

    /* renamed from: acao$f */
    static final class f extends akcs implements akbl<String, String> {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return "infosticker/".concat(String.valueOf(str));
        }
    }

    /* renamed from: acao$g */
    static final class g extends akcs implements akbl<acam, String> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (acam) obj;
            StringBuilder stringBuilder = new StringBuilder();
            akcr.a(obj, "it");
            stringBuilder.append(obj.f());
            stringBuilder.append('/');
            stringBuilder.append(obj.g());
            return stringBuilder.toString();
        }
    }

    /* renamed from: acao$h */
    static final class h extends akcs implements akbl<acam, CharSequence> {
        public static final h a = new h();

        h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (acam) obj;
            akcr.a(obj, "it");
            String f = obj.f();
            return f != null ? f : "";
        }
    }

    /* renamed from: acao$i */
    static final class i extends akcs implements akbl<acam, String> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            acam acam = (acam) obj;
            StringBuilder stringBuilder = new StringBuilder("unlockable_sticker/");
            akcr.a((Object) acam, "it");
            stringBuilder.append(acao.b(acam));
            return stringBuilder.toString();
        }
    }

    /* renamed from: acao$j */
    static final class j extends akcs implements akbl<acam, String> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (acam) obj;
            akcr.a(obj, "it");
            agpd t = obj.t();
            Object obj2 = null;
            agpx agpx = t != null ? t.d : null;
            StringBuilder stringBuilder = new StringBuilder("rating/");
            stringBuilder.append(agpx != null ? agpx.b : null);
            stringBuilder.append('~');
            if (agpx != null) {
                obj2 = agpx.a;
            }
            stringBuilder.append(obj2);
            return stringBuilder.toString();
        }
    }

    public static final String a(acan acan) {
        akcr.b(acan, "receiver$0");
        Object a = acan.a();
        akcr.a(a, "stickerDataList");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) a) {
            Object obj = (acam) next;
            akcr.a(obj, "it");
            obj = (obj.g() == null || obj.a() != a.BITMOJI.ordinal()) ? null : 1;
            if (obj != null) {
                arrayList.add(next);
            }
        }
        return ajyu.a((Iterable) (List) arrayList, (CharSequence) ppy.b, null, null, 0, null, (akbl) a.a, 30);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0020 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014f  */
    public static final java.lang.String a(defpackage.acan r9, defpackage.aipn<defpackage.abss> r10) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r9, r0);
        r0 = "releaseManagerLazy";
        defpackage.akcr.b(r10, r0);
        r9 = r9.a();
        r0 = "stickerDataList";
        defpackage.akcr.a(r9, r0);
        r9 = (java.lang.Iterable) r9;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r9 = r9.iterator();
    L_0x0020:
        r1 = r9.hasNext();
        if (r1 == 0) goto L_0x0154;
    L_0x0026:
        r1 = r9.next();
        r1 = (defpackage.acam) r1;
        r2 = "it";
        defpackage.akcr.a(r1, r2);
        r2 = r1.s();
        r3 = r2;
        r3 = (java.lang.CharSequence) r3;
        r3 = android.text.TextUtils.isEmpty(r3);
        r4 = 0;
        if (r3 != 0) goto L_0x014c;
    L_0x003f:
        r3 = defpackage.acal.UNRECOGNIZED_VALUE;
        r3 = r3.name();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x004d;
    L_0x004b:
        goto L_0x014c;
    L_0x004d:
        r3 = defpackage.acal.BATTERY;
        r3 = r3.name();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x014d;
    L_0x0059:
        r3 = defpackage.acal.SPEED;
        r3 = r3.name();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x014d;
    L_0x0065:
        r3 = defpackage.acal.RATING;
        r3 = r3.name();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 != 0) goto L_0x014d;
    L_0x0071:
        r3 = defpackage.acal.MENTION;
        r3 = r3.name();
        r3 = defpackage.akcr.a(r2, r3);
        if (r3 == 0) goto L_0x007f;
    L_0x007d:
        goto L_0x014d;
    L_0x007f:
        r3 = r1.t();
        r5 = "releaseManagerLazy.get()";
        if (r3 != 0) goto L_0x00aa;
    L_0x0087:
        r2 = r10.get();
        defpackage.akcr.a(r2, r5);
        r2 = (defpackage.abss) r2;
        r2 = r2.k();
        if (r2 != 0) goto L_0x0098;
    L_0x0096:
        goto L_0x014c;
    L_0x0098:
        r9 = new java.lang.IllegalArgumentException;
        r10 = java.lang.String.valueOf(r1);
        r0 = "Missing info sticker style for sticker ";
        r10 = r0.concat(r10);
        r9.<init>(r10);
        r9 = (java.lang.Throwable) r9;
        throw r9;
    L_0x00aa:
        r1 = defpackage.acal.DATE;
        r1 = r1.name();
        r1 = defpackage.akcr.a(r2, r1);
        r6 = "_";
        if (r1 == 0) goto L_0x00cd;
    L_0x00b8:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r2);
        r1.append(r6);
        r2 = r3.a;
        if (r2 == 0) goto L_0x00c9;
    L_0x00c7:
        r4 = r2.a;
    L_0x00c9:
        r1.append(r4);
        goto L_0x0107;
    L_0x00cd:
        r1 = defpackage.acal.ALTITUDE;
        r1 = r1.name();
        r1 = defpackage.akcr.a(r2, r1);
        if (r1 == 0) goto L_0x00eb;
    L_0x00d9:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r2);
        r1.append(r6);
        r2 = r3.c;
        if (r2 == 0) goto L_0x00c9;
    L_0x00e8:
        r4 = r2.a;
        goto L_0x00c9;
    L_0x00eb:
        r1 = defpackage.acal.WEATHER;
        r1 = r1.name();
        r1 = defpackage.akcr.a(r2, r1);
        if (r1 == 0) goto L_0x010c;
    L_0x00f7:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r2);
        r1.append(r6);
        r2 = r3.b;
        r1.append(r2);
    L_0x0107:
        r2 = r1.toString();
        goto L_0x014d;
    L_0x010c:
        r1 = defpackage.acal.VENUE;
        r1 = r1.name();
        r1 = defpackage.akcr.a(r2, r1);
        if (r1 == 0) goto L_0x012a;
    L_0x0118:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r2);
        r1.append(r6);
        r2 = r3.e;
        if (r2 == 0) goto L_0x00c9;
    L_0x0127:
        r4 = r2.b;
        goto L_0x00c9;
    L_0x012a:
        r1 = r10.get();
        defpackage.akcr.a(r1, r5);
        r1 = (defpackage.abss) r1;
        r1 = r1.k();
        if (r1 != 0) goto L_0x013a;
    L_0x0139:
        goto L_0x014c;
    L_0x013a:
        r9 = new java.lang.IllegalArgumentException;
        r10 = java.lang.String.valueOf(r2);
        r0 = "Unknown info sticker type ";
        r10 = r0.concat(r10);
        r9.<init>(r10);
        r9 = (java.lang.Throwable) r9;
        throw r9;
    L_0x014c:
        r2 = r4;
    L_0x014d:
        if (r2 == 0) goto L_0x0020;
    L_0x014f:
        r0.add(r2);
        goto L_0x0020;
    L_0x0154:
        r0 = (java.util.List) r0;
        r1 = r0;
        r1 = (java.lang.Iterable) r1;
        r9 = ",";
        r2 = r9;
        r2 = (java.lang.CharSequence) r2;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r9 = defpackage.acao.f.a;
        r7 = r9;
        r7 = (defpackage.akbl) r7;
        r8 = 30;
        r9 = defpackage.ajyu.a(r1, r2, r3, r4, r5, r6, r7, r8);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acao.a(acan, aipn):java.lang.String");
    }

    public static final String b(acan acan) {
        akcr.b(acan, "receiver$0");
        Object a = acan.a();
        akcr.a(a, "stickerDataList");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) a) {
            if (acan.a((acam) next)) {
                arrayList.add(next);
            }
        }
        return ajyu.a((Iterable) (List) arrayList, (CharSequence) ppy.b, null, null, 0, null, (akbl) g.a, 30);
    }

    public static final String c(acan acan) {
        akcr.b(acan, "receiver$0");
        Object a = acan.a();
        akcr.a(a, "stickerDataList");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) a) {
            Object obj = (acam) next;
            akcr.a(obj, "it");
            obj = (obj.g() == null || obj.a() != a.EMOJI.ordinal()) ? null : 1;
            if (obj != null) {
                arrayList.add(next);
            }
        }
        return ajyu.a((Iterable) (List) arrayList, (CharSequence) ppy.b, null, null, 0, null, (akbl) c.a, 30);
    }

    public static final String d(acan acan) {
        akcr.b(acan, "receiver$0");
        Object a = acan.a();
        akcr.a(a, "stickerDataList");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) a) {
            Object obj = (acam) next;
            akcr.a(obj, "it");
            if (obj.u()) {
                arrayList.add(next);
            }
        }
        return ajyu.a((Iterable) (List) arrayList, (CharSequence) ppy.b, null, null, 0, null, (akbl) i.a, 30);
    }

    public static final String e(acan acan) {
        akcr.b(acan, "receiver$0");
        Object a = acan.a();
        akcr.a(a, "stickerDataList");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) a) {
            Object obj = (acam) next;
            akcr.a(obj, "it");
            if ((obj.a() == a.GIPHY.ordinal() ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        return ajyu.a((Iterable) (List) arrayList, (CharSequence) ppy.b, null, null, 0, null, (akbl) e.a, 30);
    }

    public static final String f(acan acan) {
        akcr.b(acan, "receiver$0");
        Object a = acan.a();
        akcr.a(a, "stickerDataList");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) a) {
            if (acan.b((acam) next)) {
                arrayList.add(next);
            }
        }
        return ajyu.a((Iterable) (List) arrayList, (CharSequence) ppy.b, null, null, 0, null, (akbl) b.a, 30);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x001b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    public static final java.lang.String g(defpackage.acan r9) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r9, r0);
        r9 = r9.a();
        r0 = "stickerDataList";
        defpackage.akcr.a(r9, r0);
        r9 = (java.lang.Iterable) r9;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r9 = r9.iterator();
    L_0x001b:
        r1 = r9.hasNext();
        if (r1 == 0) goto L_0x0048;
    L_0x0021:
        r1 = r9.next();
        r2 = r1;
        r2 = (defpackage.acam) r2;
        r3 = "it";
        defpackage.akcr.a(r2, r3);
        r3 = r2.t();
        if (r3 == 0) goto L_0x0041;
    L_0x0033:
        r2 = r2.t();
        if (r2 == 0) goto L_0x003c;
    L_0x0039:
        r2 = r2.d;
        goto L_0x003d;
    L_0x003c:
        r2 = 0;
    L_0x003d:
        if (r2 == 0) goto L_0x0041;
    L_0x003f:
        r2 = 1;
        goto L_0x0042;
    L_0x0041:
        r2 = 0;
    L_0x0042:
        if (r2 == 0) goto L_0x001b;
    L_0x0044:
        r0.add(r1);
        goto L_0x001b;
    L_0x0048:
        r0 = (java.util.List) r0;
        r1 = r0;
        r1 = (java.lang.Iterable) r1;
        r9 = ",";
        r2 = r9;
        r2 = (java.lang.CharSequence) r2;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r9 = defpackage.acao.j.a;
        r7 = r9;
        r7 = (defpackage.akbl) r7;
        r8 = 30;
        r9 = defpackage.ajyu.a(r1, r2, r3, r4, r5, r6, r7, r8);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acao.g(acan):java.lang.String");
    }

    public static final String h(acan acan) {
        akcr.b(acan, "receiver$0");
        Object a = acan.a();
        akcr.a(a, "stickerDataList");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) a) {
            Object obj = (acam) next;
            akcr.a(obj, "it");
            String f = obj.f();
            Object obj2 = null;
            if (f != null) {
                if ((((CharSequence) f).length() > 0 ? 1 : 0) == 1) {
                    obj2 = 1;
                }
            }
            if (obj2 != null) {
                arrayList.add(next);
            }
        }
        return ajyu.a((Iterable) (List) arrayList, (CharSequence) ppy.b, null, null, 0, null, (akbl) h.a, 30);
    }

    public static final String i(acan acan) {
        akcr.b(acan, "receiver$0");
        Object a = acan.a();
        akcr.a(a, "stickerDataList");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) a) {
            Object obj = (acam) next;
            akcr.a(obj, "it");
            obj = (obj.g() != null && obj.a() == a.BITMOJI.ordinal() && obj.d()) ? 1 : null;
            if (obj != null) {
                arrayList.add(next);
            }
        }
        return ajyu.a((Iterable) (List) arrayList, (CharSequence) ppy.b, null, null, 0, null, (akbl) d.a, 30);
    }
}
