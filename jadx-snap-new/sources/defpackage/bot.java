package defpackage;

import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;

/* renamed from: bot */
final class bot {
    private static final int[] a = new int[]{bzo.f("isom"), bzo.f("iso2"), bzo.f("iso3"), bzo.f("iso4"), bzo.f("iso5"), bzo.f("iso6"), bzo.f(VisualSampleEntry.TYPE3), bzo.f(VisualSampleEntry.TYPE6), bzo.f(VisualSampleEntry.TYPE7), bzo.f("mp41"), bzo.f("mp42"), bzo.f("3g2a"), bzo.f("3g2b"), bzo.f("3gr6"), bzo.f("3gs6"), bzo.f("3ge6"), bzo.f("3gg6"), bzo.f("M4V "), bzo.f("M4A "), bzo.f("f4v "), bzo.f("kddi"), bzo.f("M4VP"), bzo.f("qt  "), bzo.f("MSNV")};

    private static boolean a(int i) {
        if ((i >>> 8) == bzo.f("3gp")) {
            return true;
        }
        int[] iArr = a;
        for (int i2 = 0; i2 < 24; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    static boolean a(bnl bnl, boolean z) {
        boolean z2;
        bnl bnl2 = bnl;
        long d = bnl.d();
        long j = -1;
        if (d == -1 || d > 4096) {
            d = 4096;
        }
        int i = (int) d;
        bzc bzc = new bzc(64);
        int i2 = 0;
        Object obj = null;
        while (i2 < i) {
            long d2;
            bzc.a(8);
            bnl2.c(bzc.a, 0, 8);
            long h = bzc.h();
            int j2 = bzc.j();
            int i3 = 16;
            if (h == 1) {
                bnl2.c(bzc.a, 8, 8);
                bzc.b(16);
                h = bzc.q();
            } else {
                if (h == 0) {
                    d2 = bnl.d();
                    if (d2 != j) {
                        h = 8 + (d2 - bnl.c());
                    }
                }
                i3 = 8;
            }
            d2 = (long) i3;
            if (h >= d2) {
                i2 += i3;
                if (j2 != bol.B) {
                    if (j2 != bol.K && j2 != bol.M) {
                        if ((((long) i2) + h) - d2 >= ((long) i)) {
                            break;
                        }
                        int i4 = (int) (h - d2);
                        i2 += i4;
                        if (j2 == bol.a) {
                            if (i4 < 8) {
                                return false;
                            }
                            bzc.a(i4);
                            bnl2.c(bzc.a, 0, i4);
                            i4 /= 4;
                            for (int i5 = 0; i5 < i4; i5++) {
                                if (i5 == 1) {
                                    bzc.d(4);
                                } else if (bot.a(bzc.j())) {
                                    obj = 1;
                                    break;
                                }
                            }
                            if (obj == null) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            bnl2.c(i4);
                        }
                        j = -1;
                    } else {
                        z2 = true;
                        break;
                    }
                }
            } else {
                return false;
            }
        }
        z2 = false;
        return obj != null && z == z2;
    }
}
