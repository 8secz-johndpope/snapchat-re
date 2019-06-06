package defpackage;

import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: abxg */
public final class abxg extends abwy {
    private final abwk c;
    private final abvv d;
    private final abwx e;

    /* renamed from: abxg$b */
    public static final class b {
        public boolean a = true;
        float b = -1.0f;
        float c = -1.0f;
        public float d;
        final abwy e;

        /* renamed from: abxg$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public b(abwy abwy) {
            akcr.b(abwy, "element");
            this.e = abwy;
        }

        public final b a(float f) {
            b bVar = this;
            bVar.b = f;
            bVar.c = -1.0f;
            return bVar;
        }
    }

    /* renamed from: abxg$a */
    public static class a extends defpackage.abwy.a {
        final List<b> d = new ArrayList();

        public final b a(abwy abwy) {
            akcr.b(abwy, "element");
            b bVar = new b(abwy);
            this.d.add(bVar);
            return bVar;
        }

        /* renamed from: b */
        public final abxg a() {
            return new abxg(this);
        }
    }

    public abxg(a aVar) {
        akcr.b(aVar, "builder");
        super(aVar);
        abwi abwi = new abwi();
        this.c = abwi;
        this.d = abwi;
        this.e = abwi;
        List arrayList = new ArrayList();
        float f = MapboxConstants.MINIMUM_ZOOM;
        for (final b bVar : aVar.d) {
            Object abwp;
            float f2 = bVar.b;
            float f3 = bVar.c;
            a(bVar.e);
            abwh abwh = new abwh();
            if (f2 != -1.0f) {
                abwh.a(f2);
            }
            if (f3 != -1.0f) {
                abwh.b(f3);
            }
            abwh.a(bVar.a);
            Object obj = (f2 == -1.0f || f3 == -1.0f) ? 1 : null;
            abwk abwk = null;
            if (obj != null) {
                abwq abwq = new abwq();
                abwq.a = f2 == -1.0f;
                abwq.b = f3 == -1.0f;
                abwp = new abwp();
                abwk a = bVar.e.a();
                akcr.b(a, "<set-?>");
                abwp.a = a;
                abwq.a((abwk) abwp);
                abwk = abwq;
            } else {
                abwp = null;
            }
            if (obj == null) {
                abwk = bVar.e.a();
            } else if (abwk == null) {
                akcr.a();
            }
            abwh.a(abwk, bVar.e.b(), bVar.e.c());
            abwl abwl = new abwl();
            abwl.a(bVar.a);
            Object[] toArray = arrayList.toArray(new abwp[0]);
            if (toArray != null) {
                abwp[] abwpArr = (abwp[]) toArray;
                final List b = ajym.b((Object[]) (abwp[]) Arrays.copyOf(abwpArr, abwpArr.length));
                abwl.b((Supplier) new Supplier<Float>() {
                    public final /* synthetic */ Object get() {
                        float f = bVar.d + f;
                        int i = 0;
                        for (abwp abwp : b) {
                            i += abwp.c;
                        }
                        return Float.valueOf(f + ((float) i));
                    }
                });
                abwl.a((abwk) abwh);
                abwi.a((abwk) abwl, (abwx) abwl, 1);
                if (abwp != null) {
                    arrayList.add(abwp);
                }
                f += Math.max(bVar.c, MapboxConstants.MINIMUM_ZOOM) + bVar.d;
            } else {
                throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    public final abwk a() {
        return this.c;
    }

    public final abvv b() {
        return this.d;
    }

    public final /* synthetic */ abwx c() {
        return new abwt(this.e, super.c());
    }
}
