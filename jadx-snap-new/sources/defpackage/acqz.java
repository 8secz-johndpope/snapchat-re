package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: acqz */
public final class acqz {
    private static final alkj[] a = new alkj[0];
    private final Comparator<acxe> b = new acrb();
    private final List<acxe> c = new ArrayList();
    private final List<acxd> d = new ArrayList();
    private final float[] e = new float[2];
    private final ja<List<acxf>> f = new ja();
    private final acxe[][] g = new acxe[4][];
    private final acxd[][] h = new acxd[4][];

    private static Long a(alkj alkj) {
        return Long.valueOf(((((long) (alkj.c & 255)) << 48) | (((long) (alkj.a & 16777215)) << 24)) | ((long) (alkj.b & 16777215)));
    }

    public final acra a(acxs acxs, double d, double d2, alkj[] alkjArr, double d3, alkj[] alkjArr2, cgi cgi, cgi cgi2, double d4) {
        int i;
        acxf a;
        int i2;
        alkj alkj;
        int i3;
        double pow;
        int i4;
        int i5;
        double d5;
        double d6;
        double d7;
        int length;
        int i6;
        acxs acxs2 = acxs;
        alkj[] alkjArr3 = alkjArr;
        alkj[] alkjArr4 = alkjArr2;
        this.d.clear();
        this.c.clear();
        this.f.b();
        int length2 = alkjArr3.length;
        int i7 = 0;
        while (true) {
            i = 4;
            int i8 = 1;
            if (i7 >= length2) {
                break;
            }
            a = acxs2.a(alkjArr3[i7]);
            if (a != null) {
                i2 = 0;
                while (i2 < i) {
                    int i9;
                    acxf acxf = a.e[i2];
                    alkj alkj2 = acxf.b;
                    alkj = new alkj();
                    alkj.c(alkj2.c + i8);
                    alkj.a((alkj2.a << i8) + (i2 % 2));
                    alkj.b((alkj2.b << i8) + (i2 / 2));
                    if (cgi.getLongitude() > cgi2.getLongitude()) {
                        i9 = length2;
                        i3 = i7;
                    } else {
                        i3 = i7;
                        pow = Math.pow(2.0d, (double) alkj.c);
                        i4 = alkj.a;
                        i5 = alkj.b;
                        d5 = (double) i4;
                        Double.isNaN(d5);
                        d5 = ((d5 / pow) * 360.0d) - 180.0d;
                        d6 = (double) (i4 + 1);
                        Double.isNaN(d6);
                        d6 = ((d6 / pow) * 360.0d) - 180.0d;
                        i9 = length2;
                        d7 = (double) (i5 + 1);
                        Double.isNaN(d7);
                        d7 = 3.141592653589793d - ((d7 * 6.283185307179586d) / pow);
                        double atan = Math.atan((Math.exp(d7) - Math.exp(-d7)) * 0.5d) * 57.29577951308232d;
                        d7 = (double) i5;
                        Double.isNaN(d7);
                        d7 = 3.141592653589793d - ((d7 * 6.283185307179586d) / pow);
                        i8 = (d5 >= cgi2.getLongitude() || d6 <= cgi.getLongitude() || Math.atan((Math.exp(d7) - Math.exp(-d7)) * 0.5d) * 57.29577951308232d <= cgi.getLatitude() || atan >= cgi2.getLatitude()) ? 0 : 1;
                    }
                    if (i8 != 0) {
                        Long a2 = acqz.a(alkj);
                        List list = (List) this.f.b(a2.longValue());
                        if (list == null) {
                            list = new ArrayList();
                            this.f.a(a2.longValue(), (Object) list);
                        }
                        list.add(acxf);
                    }
                    i2++;
                    acxs2 = acxs;
                    alkjArr3 = alkjArr;
                    alkjArr4 = alkjArr2;
                    i7 = i3;
                    length2 = i9;
                    i = 4;
                    i8 = 1;
                }
            }
            i7++;
            acxs2 = acxs;
            alkjArr3 = alkjArr;
            alkjArr4 = alkjArr2;
            length2 = length2;
        }
        int min = Math.min(15, ((int) Math.ceil(d)) + 1);
        alkjArr3 = alkjArr2;
        int length3 = alkjArr3.length;
        int i10 = 0;
        ja jaVar = null;
        while (i10 < length3) {
            alkj alkj3 = alkjArr3[i10];
            acxs acxs3 = acxs;
            a = acxs3.a(alkj3);
            if (a == null) {
                if (jaVar == null) {
                    jaVar = new ja();
                    double d8 = (double) min;
                    alkj[] a3 = d8 != d3 ? adbu.a(cgi, cgi2, d8, d4) : a;
                    if (a3 != null) {
                        length = a3.length;
                        i4 = 0;
                        while (i4 < length) {
                            alkj = a3[i4];
                            Object a4 = acxs3.a(alkj);
                            if (a4 != null) {
                                i3 = i10;
                                jaVar.a(acqz.a(alkj).longValue(), a4);
                            } else {
                                i3 = i10;
                            }
                            i4++;
                            i10 = i3;
                        }
                    }
                }
                i3 = i10;
                alkj alkj4 = new alkj();
                i2 = 0;
                length = 0;
                for (i10 = 0; i10 < 4; i10++) {
                    alkj4.c(alkj3.c + 1);
                    alkj4.a((alkj3.a << 1) + (i10 / 2));
                    alkj4.b((alkj3.b << 1) + (i10 % 2));
                    acxf acxf2 = (acxf) jaVar.a(acqz.a(alkj4).longValue());
                    if (acxf2 != null) {
                        this.g[i10] = acxf2.c;
                        this.h[i10] = acxf2.d;
                        i2 += acxf2.c.length;
                        length += acxf2.d.length;
                    } else {
                        this.g[i10] = null;
                        this.h[i10] = null;
                    }
                }
                if (i2 > 0 || length > 0) {
                    a = new acxf(null, alkj3);
                    a.c = new acxe[i2];
                    a.d = new acxd[length];
                    i10 = 0;
                    i = 0;
                    for (length2 = 0; length2 < 4; length2++) {
                        Object obj = this.g[length2];
                        if (obj != null) {
                            i6 = 0;
                            System.arraycopy(obj, 0, a.c, i10, obj.length);
                            i10 += obj.length;
                        } else {
                            i6 = 0;
                        }
                        obj = this.h[length2];
                        if (obj != null) {
                            System.arraycopy(obj, i6, a.d, i, obj.length);
                            i += obj.length;
                        }
                    }
                }
            } else {
                i3 = i10;
            }
            if (a != null) {
                Long a5 = acqz.a(a.b);
                List list2 = (List) this.f.a(a5.longValue());
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.f.a(a5.longValue(), (Object) list2);
                }
                list2.add(a);
            }
            i10 = i3 + 1;
        }
        this.e[0] = (float) Math.min(1.0d, Math.max(0.0d, 1.0d - Math.pow(d - d2, 1.5d)));
        this.e[1] = (float) Math.min(1.0d, Math.max(0.0d, 1.0d - Math.pow(d3 - d, 1.5d)));
        d6 = cgi2.getLatitude() + 0.0045000045000045d;
        pow = cgi.getLatitude() - 0.0045000045000045d;
        d7 = cgi2.getLongitude() + adbu.a(d6);
        d5 = cgi.getLongitude() - adbu.a(pow);
        int i11 = 0;
        while (i11 < this.f.a()) {
            int i12;
            ja jaVar2 = this.f;
            List list3 = (List) jaVar2.a(jaVar2.b(i11));
            i4 = 2;
            if (list3.size() == 2) {
                length = 0;
                while (length < i4) {
                    List list4;
                    acxe[] acxeArr = ((acxf) list3.get(length)).c;
                    i5 = acxeArr.length;
                    i6 = 0;
                    while (i6 < i5) {
                        acxe acxe = acxeArr[i6];
                        i3 = i5;
                        i12 = i11;
                        acxe.d = acxe.c * this.e[length];
                        i6++;
                        i5 = i3;
                        i11 = i12;
                    }
                    i12 = i11;
                    this.c.addAll(Arrays.asList(acxeArr));
                    acxd[] acxdArr = ((acxf) list3.get(length)).d;
                    i4 = acxdArr.length;
                    int i13 = 0;
                    while (i13 < i4) {
                        acxd acxd = acxdArr[i13];
                        acxd[] acxdArr2 = acxdArr;
                        list4 = list3;
                        if (((double) acxd.a) >= pow && ((double) acxd.a) <= d6 && ((double) acxd.b) >= d5 && ((double) acxd.b) <= d7) {
                            acxd.d = this.e[length];
                            this.d.add(acxd);
                        }
                        i13++;
                        list3 = list4;
                        acxdArr = acxdArr2;
                    }
                    list4 = list3;
                    length++;
                    i11 = i12;
                    i4 = 2;
                }
                i12 = i11;
            } else {
                i12 = i11;
                acxe[] acxeArr2 = ((acxf) list3.get(0)).c;
                for (acxe acxe2 : acxeArr2) {
                    acxe2.d = acxe2.c;
                }
                this.c.addAll(Arrays.asList(acxeArr2));
                for (acxd acxd2 : ((acxf) list3.get(0)).d) {
                    if (((double) acxd2.a) >= pow && ((double) acxd2.a) <= d6 && ((double) acxd2.b) >= d5 && ((double) acxd2.b) <= d7) {
                        acxd2.d = 1.0f;
                        this.d.add(acxd2);
                    }
                }
            }
            i11 = i12 + 1;
        }
        Collections.sort(this.c, this.b);
        return new acra(this.c, this.d);
    }
}
