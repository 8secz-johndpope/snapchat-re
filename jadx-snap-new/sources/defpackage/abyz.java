package defpackage;

import defpackage.agqn.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: abyz */
public final class abyz {
    public static final double a(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        Object a = abyy.a();
        double d = 1.0d;
        if (a == null) {
            return 1.0d;
        }
        akcr.a(a, "filters ?: return playbackRate");
        if (a.i()) {
            d = -1.0d;
        }
        acaa l = a.l();
        if (l == null) {
            return d;
        }
        a = l.a();
        akcr.a(a, "speedMotionFilterData.type");
        double a2 = a.a();
        if (a2 > 0.0d) {
            d *= a2;
        }
        return d;
    }

    private static final long a(abzg abzg) {
        if (abzg == null) {
            return 0;
        }
        int a = abzg.a();
        if (a == abzk.REGULAR.a()) {
            return 1;
        }
        if (a == abzk.BIGTEXT.a()) {
            return 2;
        }
        if (a == abzk.BIGTEXT_CENTER.a()) {
            return 3;
        }
        if (a == abzk.BIGTEXT_RIGHT.a()) {
            return 4;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid caption type: ");
        stringBuilder.append(abzg.a());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static final aalw a(abzv abzv) {
        if (abzv == null) {
            return null;
        }
        abzw a = abzw.a(abzv.b());
        if (a != null) {
            int i = abza.b[a.ordinal()];
            if (i == 1) {
                return aalw.WEATHER;
            }
            if (i == 2) {
                return aalw.SPEED;
            }
            if (i == 3) {
                return aalw.BATTERY;
            }
            if (i == 4) {
                return aalw.TIMESTAMP;
            }
            if (i == 5) {
                return aalw.ALTITUDE;
            }
        }
        return null;
    }

    private static final aama a(int i, List<? extends acaa> list) {
        if (i < 0 || i >= list.size()) {
            return aama.NORMAL;
        }
        abzx a = ((acaa) list.get(i)).a();
        if (a != null) {
            i = abza.a[a.ordinal()];
            if (i == 1) {
                return aama.FAST;
            }
            if (i == 2) {
                return aama.SLOW;
            }
        }
        return aama.NORMAL;
    }

    private static final aamf a(acae acae) {
        if (acae == null) {
            return null;
        }
        int i = abza.c[acae.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : aamf.FACE_SMOOTHING : aamf.GRAYSCALE : aamf.MISS_ETIKATE : aamf.INSTASNAP;
    }

    public static final abzc a(abyy abyy, aipn<abss> aipn) {
        akcr.b(abyy, "receiver$0");
        akcr.b(aipn, "releaseManagerLazy");
        return abyz.a(abyy.f(), (aipn) aipn);
    }

    public static final abzc a(acan acan, aipn<abss> aipn) {
        acan acan2 = acan;
        akcr.b(aipn, "releaseManagerLazy");
        if (acan2 == null) {
            return null;
        }
        abzc abzc = r3;
        abzc abzc2 = new abzc((long) acan.e(), (long) acan2.a(a.BITMOJI), (long) acan2.c(a.BITMOJI), acao.a(acan), (long) acan.i(), (long) acan2.c(a.CHAT), acao.b(acan), (long) acan2.a(a.EMOJI), (long) acan2.c(a.EMOJI), acao.c(acan), (long) acan2.a(a.CUSTOM_STICKER), (long) acan2.c(a.CUSTOM_STICKER), acan.o(), acao.a(acan, aipn), acan.h(), acao.f(acan), acao.g(acan), acan.j(), acao.d(acan), (long) acan2.a(a.GIPHY), acao.e(acan), acan.g(), (long) acan2.b(a.BITMOJI), (long) acan2.d(a.BITMOJI), acao.i(acan), acao.h(acan), acan.m(), acan.n(), (long) acan.d(), (long) acan.l());
        return abzc;
    }

    private static final String a(aeht aeht, String str) {
        if (!(aeht == null || str == null)) {
            Object obj = aeht.a;
            akcr.a(obj, "contextFilterMetadata.skies");
            for (Object next : (Iterable) obj) {
                if (akcr.a(((aehv) next).a, (Object) str)) {
                    break;
                }
            }
            Object next2 = null;
            aehv aehv = (aehv) next2;
            if (aehv != null) {
                return aehv.c;
            }
        }
        return null;
    }

    private static final String a(List<? extends abzg> list) {
        if (list != null) {
            int i = 1;
            if ((list.isEmpty() ^ 1) != 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(abyz.b((abzg) list.get(0)));
                int size = list.size();
                while (i < size) {
                    stringBuilder.append(ppy.b);
                    stringBuilder.append(abyz.b((abzg) list.get(i)));
                    i++;
                }
                return stringBuilder.toString();
            }
        }
        return null;
    }

    private static final StringBuilder a(String str, int i, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('/');
        if (i != 0) {
            stringBuilder.append(Integer.toString(i & 16777215));
        } else {
            stringBuilder.append(str2);
        }
        stringBuilder.append('/');
        return stringBuilder;
    }

    public static final double b(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        if (abyy.p() < 0) {
            return (double) abyy.p();
        }
        double p = (double) abyy.p();
        Double.isNaN(p);
        return p / 1000.0d;
    }

    /* JADX WARNING: Missing block: B:16:0x003f, code skipped:
            if (r1 == null) goto L_0x0041;
     */
    private static final java.lang.String b(defpackage.abzg r13) {
        /*
        r0 = 0;
        if (r13 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r13.p();
        r2 = "fontColorString";
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r4 = 1;
        if (r1 == 0) goto L_0x004a;
    L_0x0010:
        r1 = r13.p();
        r1 = r1.a;
        if (r1 == 0) goto L_0x004a;
    L_0x0018:
        r1 = r13.p();
        r1 = r1.b;
        if (r1 == 0) goto L_0x004a;
    L_0x0020:
        r0 = r13.p();
        r1 = r0.c;
        if (r1 == 0) goto L_0x0041;
    L_0x0028:
        r1 = r1.c;
        if (r1 == 0) goto L_0x0041;
    L_0x002c:
        r1 = r1.a;
        if (r1 == 0) goto L_0x0041;
    L_0x0030:
        r5 = r1;
        r5 = (java.lang.Iterable) r5;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 63;
        r1 = defpackage.ajyu.a(r5, r6, r7, r8, r9, r10, r11, r12);
        if (r1 != 0) goto L_0x0045;
    L_0x0041:
        r1 = java.lang.Integer.toString(r3);
    L_0x0045:
        r0 = r0.b;
        r3 = "dynamicCaptionStyle.displayName";
        goto L_0x008d;
    L_0x004a:
        r1 = r13.o();
        if (r1 == 0) goto L_0x0109;
    L_0x0050:
        r1 = r13.o();
        r1 = r1.a;
        if (r1 == 0) goto L_0x0109;
    L_0x0058:
        r0 = r13.o();
        r1 = r0.j;
        if (r1 == 0) goto L_0x0085;
    L_0x0060:
        r1 = r0.j;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0085;
    L_0x0068:
        r1 = r0.j;
        r3 = r0.j;
        r3 = r3.size();
        r3 = r3 - r4;
        r1 = r1.get(r3);
        r3 = "captionStyle.fontColor[c…Style.fontColor.size - 1]";
        defpackage.akcr.a(r1, r3);
        r1 = (java.lang.Number) r1;
        r1 = r1.intValue();
        r1 = java.lang.Integer.toString(r1);
        goto L_0x0089;
    L_0x0085:
        r1 = java.lang.Integer.toString(r3);
    L_0x0089:
        r0 = r0.a;
        r3 = "captionStyle.name";
    L_0x008d:
        defpackage.akcr.a(r0, r3);
        r3 = r13.n();
        defpackage.akcr.a(r1, r2);
        r0 = defpackage.abyz.a(r0, r3, r1);
        r13 = r13.d();
        if (r13 == 0) goto L_0x0104;
    L_0x00a1:
        r1 = defpackage.abzi.a.BOLD;
        r1 = r13.get(r1);
        r1 = (java.util.List) r1;
        r2 = 0;
        if (r1 == 0) goto L_0x00b6;
    L_0x00ac:
        r1 = (java.util.Collection) r1;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x00b6;
    L_0x00b4:
        r1 = 1;
        goto L_0x00b7;
    L_0x00b6:
        r1 = 0;
    L_0x00b7:
        r3 = defpackage.abzi.a.ITALIC;
        r3 = r13.get(r3);
        r3 = (java.util.List) r3;
        if (r3 == 0) goto L_0x00cb;
    L_0x00c1:
        r3 = (java.util.Collection) r3;
        r3 = r3.isEmpty();
        if (r3 != 0) goto L_0x00cb;
    L_0x00c9:
        r3 = 1;
        goto L_0x00cc;
    L_0x00cb:
        r3 = 0;
    L_0x00cc:
        r5 = defpackage.abzi.a.UNDERLINE;
        r13 = r13.get(r5);
        r13 = (java.util.List) r13;
        if (r13 == 0) goto L_0x00df;
    L_0x00d6:
        r13 = (java.util.Collection) r13;
        r13 = r13.isEmpty();
        if (r13 != 0) goto L_0x00df;
    L_0x00de:
        r2 = 1;
    L_0x00df:
        if (r1 == 0) goto L_0x00f3;
    L_0x00e1:
        if (r3 == 0) goto L_0x00eb;
    L_0x00e3:
        if (r2 == 0) goto L_0x00e8;
    L_0x00e5:
        r13 = "bold_italics_underline";
        goto L_0x0101;
    L_0x00e8:
        r13 = "bold_italics";
        goto L_0x0101;
    L_0x00eb:
        if (r2 == 0) goto L_0x00f0;
    L_0x00ed:
        r13 = "bold_underline";
        goto L_0x0101;
    L_0x00f0:
        r13 = "bold";
        goto L_0x0101;
    L_0x00f3:
        if (r3 == 0) goto L_0x00fd;
    L_0x00f5:
        if (r2 == 0) goto L_0x00fa;
    L_0x00f7:
        r13 = "italics_underline";
        goto L_0x0101;
    L_0x00fa:
        r13 = "italics";
        goto L_0x0101;
    L_0x00fd:
        if (r2 == 0) goto L_0x0104;
    L_0x00ff:
        r13 = "underline";
    L_0x0101:
        r0.append(r13);
    L_0x0104:
        r13 = r0.toString();
        return r13;
    L_0x0109:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyz.b(abzg):java.lang.String");
    }

    private static final boolean b(List<? extends abzg> list) {
        if (list != null) {
            Iterable<abzg> iterable = list;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (abzg c : iterable) {
                if (abyz.c(c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean c(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        abzt a = abyy.a();
        return a != null ? a.t() : false;
    }

    private static final boolean c(abzg abzg) {
        if (abzg != null) {
            String b = abzg.b();
            if (b != null) {
                if ((((CharSequence) b).length() == 0 ? 1 : null) == 1) {
                    return false;
                }
            }
            for (abzi.a aVar : abzg.d().keySet()) {
                List list = (List) abzg.d().get(aVar);
                if (list != null && (list.isEmpty() ^ 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean c(List<? extends abzg> list) {
        if (list != null) {
            Iterable<abzg> iterable = list;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (abzg i : iterable) {
                if (i.i()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:3:0x000f, code skipped:
            if (r0 == null) goto L_0x0011;
     */
    public static final defpackage.abyw d(defpackage.abyy r10) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r10, r0);
        r0 = r10.b();
        if (r0 == 0) goto L_0x0011;
    L_0x000b:
        r0 = defpackage.ajyl.a(r0);
        if (r0 != 0) goto L_0x0015;
    L_0x0011:
        r0 = r10.c();
    L_0x0015:
        if (r0 == 0) goto L_0x003a;
    L_0x0017:
        r10 = defpackage.ajyu.g(r0);
        r10 = (defpackage.abzg) r10;
        r2 = defpackage.abyz.a(r10);
        r4 = defpackage.abyz.b(r0);
        r5 = defpackage.abyz.c(r0);
        r6 = defpackage.abyz.a(r0);
        r10 = r0.size();
        r7 = (long) r10;
        r10 = new abyw;
        r9 = 0;
        r1 = r10;
        r1.<init>(r2, r4, r5, r6, r7, r9);
        return r10;
    L_0x003a:
        r10 = 0;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyz.d(abyy):abyw");
    }

    public static final abyx e(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        Object d = abyy.d();
        if (d == null) {
            return new abyx();
        }
        akcr.a(d, "it");
        Object a = d.a();
        akcr.a(a, "it.strokes");
        return new abyx(((Collection) a).isEmpty() ^ 1, d.c(), Long.valueOf((long) d.b()));
    }

    public static final Long f(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        List<Object> c = abyy.c();
        if (c == null) {
            return null;
        }
        Collection arrayList = new ArrayList();
        for (Object obj : c) {
            akcr.a(obj, "it");
            List q = obj.q();
            Object obj2 = q != null ? Integer.valueOf(q.size()) : null;
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        int i = 0;
        for (Number intValue : (List) arrayList) {
            i += intValue.intValue();
        }
        return Long.valueOf((long) i);
    }

    public static final abzb g(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        Object a = abyy.a();
        abzb abzb = null;
        if (a == null) {
            return null;
        }
        akcr.a(a, "it");
        int k = a.k();
        List j = a.j();
        akcr.a((Object) j, "it.speedMotionFilterDataList");
        aama a2 = abyz.a(k, j);
        boolean i = a.i();
        aalw a3 = abyz.a(a.d());
        aamf a4 = abyz.a(a.a());
        if (a.h() != -1) {
            abzy abzy = (abzy) a.e().get(a.h());
            if (abzy != null) {
                abzb = abzy.a();
            }
        }
        return new abzb(a2, i, a3, a4, abzb, a.u(), a.s(), abyz.a(a.r(), a.s()), a.f() ? 1 : 0);
    }

    public static final boolean h(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        return !acaj.b(abyy.n());
    }

    public static final boolean i(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        abze g = abyy.g();
        if (g != null) {
            abzd a = g.a();
            if (a != null) {
                List a2 = a.a();
                if (!(a2 == null || a2.isEmpty())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String j(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        acak i = abyy.i();
        return i != null ? i.a() : null;
    }

    public static final boolean k(abyy abyy) {
        akcr.b(abyy, "receiver$0");
        return abyy.z() != acae.UNFILTERED;
    }
}
