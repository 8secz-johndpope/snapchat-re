package defpackage;

import defpackage.acvm.c;
import defpackage.alhh.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: acqe */
public final class acqe {

    /* renamed from: acqe$b */
    public static final class b<T> implements ajfb<algn> {
        private /* synthetic */ acpv a;
        private /* synthetic */ adbg b;
        private /* synthetic */ zfw c;
        private /* synthetic */ ajei d;

        public b(acpv acpv, adbg adbg, zfw zfw, ajei ajei) {
            this.a = acpv;
            this.b = adbg;
            this.c = zfw;
            this.d = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c();
        }
    }

    /* renamed from: acqe$c */
    public static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acqe$a */
    static final class a extends akcs implements akbl<String, String> {
        private /* synthetic */ njw a;

        a(njw njw) {
            this.a = njw;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            String str2 = "userId";
            akcr.b(str, str2);
            njw njw = this.a;
            akcr.b(njw, "friendProvider");
            akcr.b(str, str2);
            nkh d = njw.d(str);
            return d != null ? nkb.b(d) : null;
        }
    }

    public static final acpw a(acqq acqq, Map<String, alhq> map) {
        akcr.b(acqq, "receiver$0");
        akcr.b(map, "usersToEndLocationMap");
        alhm alhm = new alhm();
        alhm.e = new alhq[map.size()];
        int i = 0;
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            alhq alhq = (alhq) entry.getValue();
            String str2 = "";
            acqq.a(acqq.a(str, str, alhq, false), alhq, str2, str2);
            if (i == 0) {
                alhm.a(alhq.c());
                alhm.b(alhq.d());
            }
            int i2 = i + 1;
            alhm.e[i] = alhq;
            i = i2;
        }
        return new acpw(ajyl.a(alhm), ajyu.k(map.keySet()));
    }

    public static final acpx a(alhh alhh, nbo nbo) {
        alhh alhh2 = alhh;
        nbo nbo2 = nbo;
        akcr.b(alhh2, "receiver$0");
        if (alhh2.c != null) {
            Object obj = alhh2.c;
            String str = "statusData";
            akcr.a(obj, str);
            int i = 1;
            if ((obj.length == 0 ? 1 : null) == null) {
                HashMap hashMap = new HashMap();
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                a[] aVarArr = alhh2.c;
                int length = aVarArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj2 = aVarArr[i2];
                    if (obj2.e != null) {
                        Object obj3 = obj2.e;
                        String str2 = "statusData.locations";
                        akcr.a(obj3, str2);
                        if ((obj3.length == 0 ? 1 : null) == null) {
                            Object obj4;
                            obj3 = obj2.e[obj2.e.length - i];
                            alhq alhq = new alhq();
                            akcr.a(obj2, str);
                            alhq.a(obj2.d());
                            akcr.a(obj3, "endLocation");
                            alhq.a((float) obj3.b());
                            alhq.b((float) obj3.c());
                            alhq.a(obj2.c());
                            algk algk = new algk();
                            String d = obj2.d();
                            if (obj2.g == null) {
                                alhq a = nbo2 != null ? nbo2.a(d) : null;
                                if (a != null) {
                                    algk.c(a.h());
                                    algk.d(a.i());
                                    d = a.j();
                                } else {
                                    algk.c(c.LEFT.a());
                                    algk.d(c.LEFT.a());
                                    d = c.RIGHT.a();
                                }
                            } else {
                                obj4 = obj2.g;
                                String str3 = "statusData.sticker";
                                akcr.a(obj4, str3);
                                algk.c(obj4.a());
                                obj4 = obj2.g;
                                akcr.a(obj4, str3);
                                algk.d(obj4.b());
                                obj4 = obj2.g;
                                akcr.a(obj4, str3);
                                d = obj4.c();
                            }
                            algk.e(d);
                            alhq.g = algk;
                            Map map = hashMap;
                            obj4 = obj2.d();
                            akcr.a(obj4, "statusData.userId");
                            map.put(obj4, alhq);
                            Object obj5 = obj2.e;
                            akcr.a(obj5, str2);
                            arrayList.addAll(ajyi.i(obj5));
                            arrayList2.addAll(acqe.a(obj2));
                        }
                    }
                    i2++;
                    i = 1;
                }
                return new acpx(hashMap, arrayList, arrayList2);
            }
        }
        return null;
    }

    public static final String a(alhh alhh, akbl<? super String, String> akbl) {
        akcr.b(akbl, "transform");
        if (alhh == null) {
            return null;
        }
        int i;
        String format;
        String a = alhh.a();
        if (a == null) {
            i = 0;
        } else {
            int i2 = 0;
            i = 0;
            while (i2 != -1) {
                i2 = akgc.a((CharSequence) a, "%s", i2, false, 4);
                if (i2 != -1) {
                    i++;
                    i2 += 2;
                }
            }
        }
        List arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < alhh.c.length && i3 < i) {
            Object obj = alhh.c[i3];
            akcr.a(obj, "statusData[i]");
            obj = obj.d();
            akcr.a(obj, "statusData[i].userId");
            String str = (String) akbl.invoke(obj);
            if (str != null) {
                arrayList.add(str);
            }
            i3++;
        }
        if (a != null) {
            try {
                if (i == arrayList.size()) {
                    Object[] toArray = arrayList.toArray(new String[0]);
                    if (toArray != null) {
                        toArray = Arrays.copyOf(toArray, toArray.length);
                        format = String.format(a, Arrays.copyOf(toArray, toArray.length));
                        akcr.a((Object) format, "java.lang.String.format(format, *args)");
                        return format;
                    }
                    throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } catch (IllegalFormatException unused) {
            }
        }
        format = a;
        return format;
    }

    public static final String a(alhh alhh, njw njw) {
        akcr.b(njw, "friendProvider");
        return acqe.a(alhh, (akbl) new a(njw));
    }

    private static List<acvh> a(a aVar) {
        akcr.b(aVar, "receiver$0");
        Object obj = aVar.e[aVar.e.length - 1];
        if (aVar.e.length <= 1) {
            return ajyw.a;
        }
        int i;
        int e = aVar.e();
        if (e == 1) {
            i = 3;
        } else if (e == 2) {
            i = 1;
        } else if (e != 3) {
            return ajyw.a;
        } else {
            i = 2;
        }
        boolean z = aVar.f() == 3 || aVar.f() == 1;
        Object obj2 = aVar.e[0];
        akcr.a(obj2, "startLocation");
        obj2 = cgo.a(obj2.b(), obj2.c());
        akcr.a(obj, "endLocation");
        obj = cgo.a(obj.b(), obj.c());
        String d = aVar.d();
        akcr.a(obj2, "startLatLng");
        float latitude = (float) obj2.getLatitude();
        float longitude = (float) obj2.getLongitude();
        akcr.a(obj, "endLatLng");
        return ajyl.a(new acvh(d, latitude, longitude, (float) obj.getLatitude(), (float) obj.getLongitude(), i, z));
    }

    public static final boolean a(a aVar, alhq alhq) {
        akcr.b(aVar, "receiver$0");
        akcr.b(alhq, "friendLocation");
        if (!aVar.h() || aVar.j == null) {
            return false;
        }
        Object obj;
        ales ales = aVar.j.a;
        String str = "liveCancellationInfo";
        if (ales != null) {
            double a = adbu.a(ales.b(), ales.c(), (double) alhq.c(), (double) alhq.d()) * 1000.0d;
            obj = aVar.j;
            akcr.a(obj, str);
            if (a > obj.a()) {
                return false;
            }
        }
        obj = aVar.j;
        akcr.a(obj, str);
        return aVar.c() + obj.b() >= System.currentTimeMillis();
    }
}
