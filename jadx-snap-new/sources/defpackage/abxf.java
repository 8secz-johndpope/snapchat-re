package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AtomicDouble;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abwb.b;
import defpackage.abwy.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: abxf */
public final class abxf extends abwy {
    final abwp c;
    final AtomicDouble d = new AtomicDouble(0.0d);
    final AtomicDouble e = new AtomicDouble(1.0d);
    Runnable f;
    private final abvv g;
    private final abwx h;
    private final abvt i;

    /* renamed from: abxf$f */
    static final class f implements Runnable {
        private /* synthetic */ View a;

        f(View view) {
            this.a = view;
        }

        public final void run() {
            this.a.postInvalidate();
        }
    }

    /* renamed from: abxf$5 */
    public static final class 5 implements abvt {
        5() {
        }

        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return true;
        }
    }

    /* renamed from: abxf$a */
    static final class a<T> implements Supplier<Float> {
        private /* synthetic */ abxf a;

        a(abxf abxf) {
            this.a = abxf;
        }

        public final /* synthetic */ Object get() {
            return Float.valueOf(Math.max(MapboxConstants.MINIMUM_ZOOM, ((float) this.a.c.c) - ((float) this.a.c.d)));
        }
    }

    /* renamed from: abxf$b */
    public static final class b extends a {
        public abwy d;
        public float e;
        public float f;
        float g = 1.0f;
        public abxq<Float> h;

        public final abwy b() {
            abwy abwy = this.d;
            if (abwy == null) {
                akcr.a("subElement");
            }
            return abwy;
        }

        /* renamed from: c */
        public final abxf a() {
            return new abxf(this);
        }
    }

    /* renamed from: abxf$c */
    static final class c extends akcs implements akbk<Float> {
        private /* synthetic */ b a;
        private /* synthetic */ AtomicDouble b;

        c(b bVar, AtomicDouble atomicDouble) {
            this.a = bVar;
            this.b = atomicDouble;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abxq abxq = this.a.h;
            if (abxq == null) {
                akcr.a();
            }
            return Float.valueOf(((Number) abxq.a()).floatValue() * ((float) this.b.get()));
        }
    }

    /* renamed from: abxf$d */
    static final class d extends akcs implements akbk<Float> {
        private /* synthetic */ b a;
        private /* synthetic */ AtomicDouble b;

        d(b bVar, AtomicDouble atomicDouble) {
            this.a = bVar;
            this.b = atomicDouble;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(this.a.g * ((float) this.b.get()));
        }
    }

    /* renamed from: abxf$e */
    static final class e extends akcs implements akbk<Float> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(MapboxConstants.MINIMUM_ZOOM);
        }
    }

    /* renamed from: abxf$g */
    static final class g extends akcs implements akbl<Float, ajxw> {
        private /* synthetic */ abxf a;
        private /* synthetic */ abwb b;
        private /* synthetic */ b c;
        private /* synthetic */ abwb d;
        private /* synthetic */ abvh e;

        g(abxf abxf, abwb abwb, b bVar, abwb abwb2, abvh abvh) {
            this.a = abxf;
            this.b = abwb;
            this.c = bVar;
            this.d = abwb2;
            this.e = abvh;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            float floatValue = ((Number) obj).floatValue();
            if (this.b != null) {
                this.a.d.set((double) (abpf.a(floatValue, (float) MapboxConstants.MINIMUM_ZOOM, this.c.e) / this.c.e));
            }
            if (this.d == null) {
                return null;
            }
            AtomicDouble atomicDouble = this.a.e;
            double a = this.e.d() > MapboxConstants.MINIMUM_ZOOM ? (double) abpf.a(((floatValue + ((float) this.a.c.d)) - ((float) this.a.c.c)) / (-this.c.f), (float) MapboxConstants.MINIMUM_ZOOM, 1.0f) : this.e.d() == MapboxConstants.MINIMUM_ZOOM ? 0.0d : 1.0d;
            atomicDouble.set(a);
            return ajxw.a;
        }
    }

    public abxf(b bVar) {
        abwb abwb;
        abvv abvv;
        b bVar2 = bVar;
        akcr.b(bVar2, "builder");
        super(bVar2);
        a(bVar.b());
        abwp abwp = new abwp();
        abwp.b = true;
        abwk a = bVar.b().a();
        akcr.b(a, "strategy");
        abwp.a = a;
        this.c = abwp;
        List arrayList = new ArrayList();
        arrayList.add(new abwd(new abwg(), bVar.b().b()));
        abwb abwb2 = null;
        if (bVar2.e != MapboxConstants.MINIMUM_ZOOM) {
            abwb abwb3 = new abwb(bVar2.e, -1, 0, b.VERTICAL, abwb.a.TOP_EDGE);
            abwb3.a = abxf.a(bVar2, this.d);
            arrayList.add(abwb3);
        } else {
            abwb = null;
        }
        if (bVar2.f != MapboxConstants.MINIMUM_ZOOM) {
            abwb abwb4 = new abwb(bVar2.f, 0, -1, b.VERTICAL, abwb.a.BOTTOM_EDGE);
            abwb4.a = abxf.a(bVar2, this.e);
            arrayList.add(abwb4);
        }
        if (arrayList.size() == 1) {
            abvv = (abvv) ajyu.f(arrayList);
        } else {
            Object[] toArray = arrayList.toArray(new abvv[0]);
            if (toArray != null) {
                abvv[] abvvArr = (abvv[]) toArray;
                abvv = new abwa((abvv[]) Arrays.copyOf(abvvArr, abvvArr.length));
            } else {
                throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.g = abvv;
        Context context = this.a;
        if (context == null) {
            akcr.a();
        }
        final int a2 = (int) abtp.a(500.0f, context);
        final abwu abwu = new abwu(this.a);
        this.h = abwu;
        abuz abuz = new abuz();
        abwu.a((abva) abuz);
        final abvh abvh = new abvh(this.a, true);
        abvh.c(MapboxConstants.MINIMUM_ZOOM);
        abvh.a((Supplier) new a(this));
        abvh.i();
        abvh.h();
        abuz.a(abvh);
        abwu.a((abwu.b) new abwu.b() {
            public final boolean a(int i, int i2) {
                i = a2;
                return i2 < (-i) || i2 > i;
            }

            public final boolean a(int i, int i2, int i3, int i4, int i5, MotionEvent motionEvent) {
                akcr.b(motionEvent, "event");
                i4 -= i2;
                return (i4 >= i5 && abvh.c() > abvh.e()) || (i4 <= (-i5) && abvh.c() < abvh.d());
            }
        });
        final akbl gVar = new g(this, abwb, bVar, abwb2, abvh);
        r7.b((akbk) new akbk<Float>() {
            public final /* synthetic */ Object invoke() {
                return Float.valueOf(-abvh.c());
            }
        });
        abvh.a((abvg) new abvg(this) {
            private /* synthetic */ abxf a;

            public final void a(float f) {
                gVar.invoke(Float.valueOf(f));
                Runnable runnable = this.a.f;
                if (runnable == null) {
                    akcr.a("refreshView");
                }
                runnable.run();
            }

            public final void b(int i) {
                if (i == 3 || i == 2) {
                    abwu.a(0);
                    return;
                }
                if (i == 0) {
                    abwu abwu = abwu;
                    Object obj = ViewConfiguration.get(this.a.a);
                    akcr.a(obj, "ViewConfiguration.get(context)");
                    abwu.a(obj.getScaledTouchSlop());
                }
            }
        });
        this.c.e = new akbk<ajxw>() {
            public final /* synthetic */ Object invoke() {
                gVar.invoke(Float.valueOf(abvh.c()));
                return ajxw.a;
            }
        };
        this.i = new 5();
    }

    private static akbk<Float> a(b bVar, AtomicDouble atomicDouble) {
        c cVar;
        if (bVar.h != null) {
            cVar = new c(bVar, atomicDouble);
        } else if (bVar.h != null) {
            return e.a;
        } else {
            cVar = new d(bVar, atomicDouble);
        }
        return cVar;
    }

    public final /* bridge */ /* synthetic */ abwk a() {
        return this.c;
    }

    public final void a(View view) {
        akcr.b(view, "v");
        super.a(view);
        this.f = new f(view);
    }

    public final abvv b() {
        return this.g;
    }

    public final /* synthetic */ abwx c() {
        return new abwt(super.c(), this.h);
    }

    public final abvt d() {
        return this.i;
    }
}
