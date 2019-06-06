package defpackage;

import android.annotation.TargetApi;
import android.graphics.PointF;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.acum.a;
import defpackage.acup.b;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: acvj */
public final class acvj {
    private final HashMap<String, acvh> a = new HashMap();
    private final a<acvh> b = new 1();

    /* renamed from: acvj$1 */
    class 1 implements a<acvh> {
        1() {
        }

        public final int a() {
            return 4;
        }

        public final void a(float[] fArr, Iterable<acvh> iterable) {
            int i = 0;
            for (acvh acvh : iterable) {
                int i2 = i + 1;
                fArr[i] = acvh.b;
                i = i2 + 1;
                fArr[i2] = acvh.c;
                i2 = i + 1;
                fArr[i] = acvh.d;
                i = i2 + 1;
                fArr[i2] = acvh.e;
            }
        }
    }

    @TargetApi(21)
    public final HashMap<String, acvh> a(acmj acmj, b bVar, List<acvh> list, acum acum, adaf adaf) {
        acvj acvj = this;
        b bVar2 = bVar;
        List<acvh> list2 = list;
        acvj.a.clear();
        if (list2 != null) {
            float[] a = acum.a(acmj, bVar2.d, list2, acvj.b);
            Iterator it = list.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                PointF pointF;
                PointF pointF2;
                Object obj;
                float a2;
                int i3;
                float f;
                acvh acvh;
                acyg acyg;
                acvf.a aVar;
                acvf.a aVar2;
                boolean z;
                acvh acvh2 = (acvh) it.next();
                float f2 = a[i2];
                int i4 = i2 + 2;
                float f3 = a[i4];
                float pow = ((float) (Math.pow(2.0d, acmj.i()) * (Math.abs(1.0d) * 512.0d))) * bVar2.d;
                float f4 = acvh2.c;
                float f5 = acvh2.e;
                Object obj2 = (f4 <= f5 ? f5 - f4 >= 180.0f : f4 - f5 <= 180.0f) ? null : 1;
                if (obj2 != null) {
                    if (f2 > f3) {
                        a[i2] = a[i2] - pow;
                    }
                } else if (f2 < f3) {
                    a[i2] = a[i2] + pow;
                }
                adaf.a aVar3 = adaf.a;
                int i5 = acvh2.a;
                acuh acuh = acvh2.h;
                acvf.a aVar4 = acvh2.i;
                aVar3.h[i] = a[i2];
                aVar3.h[1] = a[i2 + 1];
                aVar3.i[i] = a[i4];
                aVar3.i[1] = a[i2 + 3];
                aVar3.j = i5;
                aVar3.l = acuh;
                aVar3.k = bVar2;
                acvi acvi = aVar3.b;
                float[] fArr = aVar3.e;
                int i6 = aVar3.j;
                float[] fArr2 = aVar3.h;
                float[] fArr3 = aVar3.i;
                Iterator it2 = it;
                acvi.a.x = fArr2[i];
                acvi.a.y = fArr2[1];
                acvi.b.x = fArr3[i];
                acvi.b.y = fArr3[1];
                if (acvi.a.x < acvi.b.x) {
                    pointF = acvi.b;
                    pointF2 = acvi.a;
                    obj = 1;
                } else {
                    pointF = acvi.a;
                    pointF2 = acvi.b;
                    obj = null;
                }
                acvi.c.x = pointF.x;
                acvi.c.y = pointF.y;
                acvi.d.x = pointF2.x;
                acvi.d.y = pointF2.y;
                float[] fArr4 = a;
                acvi.e.x = (acvi.d.x - acvi.c.x) / 2.0f;
                acvi.e.y = (acvi.d.y - acvi.c.y) / 2.0f;
                acvi.f.x = -acvi.e.x;
                acvi.f.y = -acvi.e.y;
                float a3 = acvi.a(1.0471976f, acvi.e.x, acvi.e.y);
                float b = acvi.b(1.0471976f, acvi.e.x, acvi.e.y);
                f4 = (i6 == 1 || i6 == 2) ? -60.0f : 60.0f;
                acvi acvi2 = acvi;
                double d = (double) (f4 / 180.0f);
                Double.isNaN(d);
                float f6 = (float) (d * 3.141592653589793d);
                acvi = acvi2;
                f4 = acvi.a(f6, acvi.f.x, acvi.f.y);
                f6 = acvi.b(f6, acvi.f.x, acvi.f.y);
                acvi.g.x = pointF.x + a3;
                acvi.g.y = pointF.y + b;
                acvi.h.x = pointF2.x + f4;
                acvi.h.y = pointF2.y + f6;
                acvd acvd;
                if (obj != null) {
                    acvd = new acvd(fArr, pointF2.x, pointF2.y, pointF.x, pointF.y, acvi.h.x, acvi.h.y, acvi.g.x, acvi.g.y);
                } else {
                    acvd = new acvd(fArr, pointF.x, pointF.y, pointF2.x, pointF2.y, acvi.g.x, acvi.g.y, acvi.h.x, acvi.h.y);
                }
                if (aVar3.l != null) {
                    if (!aVar3.l.a()) {
                        aVar3.l.a(aVar3.d.b);
                    }
                    a2 = aVar3.d.a(aVar3.l, MapboxConstants.MINIMUM_ZOOM);
                } else {
                    a2 = MapboxConstants.MINIMUM_ZOOM;
                }
                aVar3.f.add(aVar4);
                acvf acvf = aVar3.a;
                float f7 = aVar3.k.d * 30.0f;
                b bVar3 = aVar3.k;
                acyj acyj = aVar3.c;
                if (aVar4.g == null || aVar4.g.a.capacity() < 296) {
                    if (aVar4.g != null) {
                        acyj.a(aVar4.g);
                    }
                    aVar4.g = acyj.b(296);
                }
                acyg acyg2 = aVar4.g;
                acyg2.a.position(0);
                FloatBuffer floatBuffer = acyg2.a;
                acvk acvk = null;
                i5 = 0;
                f4 = MapboxConstants.MINIMUM_ZOOM;
                while (i5 < 37) {
                    acvd acvd2;
                    b bVar4;
                    acvk acvk2;
                    acvf acvf2;
                    float f8;
                    float f9;
                    acvk acvk3 = acvf.d;
                    float[] fArr5 = acvf.c;
                    i3 = i4;
                    f = ((float) i5) / 36.0f;
                    float f10 = 1.0f - f;
                    acvh = acvh2;
                    acyg = acyg2;
                    float f11 = (((((r3.a[1] * f10) * f10) * f10) + ((((r3.a[5] * 3.0f) * f10) * f10) * f)) + ((((r3.a[7] * 3.0f) * f10) * f) * f)) + (((r3.a[3] * f) * f) * f);
                    acvk3.a[2] = (((((r3.a[0] * f10) * f10) * f10) + ((((r3.a[4] * 3.0f) * f10) * f10) * f)) + ((((r3.a[6] * 3.0f) * f10) * f) * f)) + (((r3.a[2] * f) * f) * f);
                    acvk3.a[3] = f11;
                    float f12 = (f * 3.0f) * f;
                    f2 = (1.0f - (4.0f * f)) + f12;
                    float f13 = (f * 2.0f) - f12;
                    float f14 = (((((r3.a[0] * -3.0f) * f10) * f10) + ((r3.a[4] * 3.0f) * f2)) + ((r3.a[6] * 3.0f) * f13)) + (((r3.a[2] * 3.0f) * f) * f);
                    aVar = aVar4;
                    fArr5[0] = -((((((r3.a[1] * -3.0f) * f10) * f10) + ((r3.a[5] * 3.0f) * f2)) + ((r3.a[7] * 3.0f) * f13)) + (((r3.a[3] * 3.0f) * f) * f));
                    fArr5[1] = f14;
                    f = a2;
                    f11 = (float) Math.sqrt((double) ((fArr5[0] * fArr5[0]) + (fArr5[1] * fArr5[1])));
                    if (f11 != MapboxConstants.MINIMUM_ZOOM) {
                        acvk3.a(fArr5[0] / f11, fArr5[1] / f11);
                    }
                    if (r3.a[0] > r3.a[2]) {
                        acvk3.a(-acvk3.a[0], -acvk3.a[1]);
                    }
                    a2 = f7 / 2.0f;
                    float f15 = (((acvk3.a[2] + (acvk3.a[0] * a2)) / bVar3.a) * 2.0f) - 1.0f;
                    f14 = 1.0f - (((acvk3.a[3] + (acvk3.a[1] * a2)) / bVar3.b) * 2.0f);
                    f2 = (((acvk3.a[2] - (acvk3.a[0] * a2)) / bVar3.a) * 2.0f) - 1.0f;
                    f11 = 1.0f - (((acvk3.a[3] - (acvk3.a[1] * a2)) / bVar3.b) * 2.0f);
                    if (acvk != null) {
                        acvd2 = r3;
                        bVar4 = bVar3;
                        acvk2 = acvk3;
                        acvf2 = acvf;
                        f8 = f11;
                        f9 = a2;
                        f4 += (float) Math.sqrt(Math.pow((double) (acvk.a[2] - acvk3.a[2]), 2.0d) + Math.pow((double) (acvk.a[3] - acvk3.a[3]), 2.0d));
                    } else {
                        f8 = f11;
                        f9 = a2;
                        acvd2 = r3;
                        acvf2 = acvf;
                        bVar4 = bVar3;
                        acvk2 = acvk3;
                    }
                    floatBuffer.put(f15).put(f14).put(f4).put((-f7) / 2.0f);
                    floatBuffer.put(f2).put(f8).put(f4).put(f9);
                    acvf acvf3 = acvf2;
                    acvf3.d = acvf3.d == acvf3.a ? acvf3.b : acvf3.a;
                    i5++;
                    acvf = acvf3;
                    a2 = f;
                    acvk = acvk2;
                    i4 = i3;
                    acvd acvd3 = acvd2;
                    acvh2 = acvh;
                    aVar4 = aVar;
                    bVar3 = bVar4;
                    acyg2 = acyg;
                }
                acvh = acvh2;
                acyg = acyg2;
                i3 = i4;
                aVar = aVar4;
                f = a2;
                if (f > MapboxConstants.MINIMUM_ZOOM) {
                    Object obj3;
                    if (f < 1.0f) {
                        a2 = f4 * f;
                        for (int i7 = 0; i7 < 74; i7 += 2) {
                            int i8 = i7 * 4;
                            if (floatBuffer.get(i8 + 2) >= a2) {
                                aVar2 = aVar;
                                aVar2.a = floatBuffer.get(i8);
                                aVar2.b = floatBuffer.get(i8 + 1);
                                obj3 = 1;
                                break;
                            }
                            aVar2 = aVar;
                        }
                    }
                    aVar2 = aVar;
                    obj3 = null;
                    if (obj3 == null) {
                        aVar2.a = floatBuffer.get(288);
                        aVar2.b = floatBuffer.get(289);
                    }
                    z = true;
                } else {
                    aVar2 = aVar;
                    aVar2.a = floatBuffer.get(0);
                    z = true;
                    aVar2.b = floatBuffer.get(1);
                }
                aVar2.c = f4;
                acyg acyg3 = acyg;
                aVar2.g = acyg3;
                aVar2.d = f;
                aVar2.f = 37;
                aVar2.e = f7;
                if (floatBuffer.get(288) <= floatBuffer.get(0)) {
                    z = false;
                }
                aVar2.h = z;
                acyg3.a.position(0);
                acvj = this;
                acvh2 = acvh;
                acvj.a.put(acvh2.f, acvh2);
                acmj acmj2 = acmj;
                bVar2 = bVar;
                i2 = i3;
                it = it2;
                a = fArr4;
                i = 0;
            }
        }
        return acvj.a;
    }
}
