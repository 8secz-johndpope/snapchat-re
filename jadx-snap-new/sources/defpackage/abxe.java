package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abvh.c;
import defpackage.abwu.b;
import defpackage.abwy.a;
import defpackage.akdd.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: abxe */
public final class abxe<T> extends abwy implements ajej {
    final abqr c;
    Runnable d;
    private final abwk e;
    private final abvv f;
    private final abwx g;
    private final abvt h = new h();
    private final ajei i = new ajei();
    private final abqo j = new abqo();

    /* renamed from: abxe$c */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: abxe$d */
    public enum d {
        VERTICAL,
        HORIZONTAL
    }

    /* renamed from: abxe$i */
    static final class i implements Runnable {
        private /* synthetic */ View a;

        i(View view) {
            this.a = view;
        }

        public final void run() {
            this.a.requestLayout();
            this.a.postInvalidate();
        }
    }

    /* renamed from: abxe$a */
    public static final class a implements defpackage.abqr.a {
        private /* synthetic */ abxe a;

        a(abxe abxe) {
            this.a = abxe;
        }

        public final void a() {
            Runnable runnable = this.a.d;
            if (runnable != null) {
                runnable.run();
            }
        }

        public final void a(long j, float f) {
            Runnable runnable = this.a.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: abxe$b */
    public static class b<S> extends a {
        public akbl<? super S, ? extends abwy> d;
        public boolean e;
        public Float f;
        public Float g;
        public float h;
        public d i = d.VERTICAL;
        public S j;
        public akbw<? super S, ? super abwy, ajxw> k;
        public akbw<? super S, ? super abwy, ajxw> l;
        final ajdp<Iterable<S>> m;

        public b(ajdp<Iterable<S>> ajdp) {
            akcr.b(ajdp, Event.LIST);
            this.m = ajdp;
        }

        /* renamed from: b */
        public final abxe<S> a() {
            return new abxe(this);
        }
    }

    /* renamed from: abxe$e */
    public static final class e implements b {
        private /* synthetic */ int a;

        e(int i) {
            this.a = i;
        }

        public final boolean a(int i, int i2) {
            i2 = this.a;
            return i < (-i2) || i > i2;
        }

        public final boolean a(int i, int i2, int i3, int i4, int i5, MotionEvent motionEvent) {
            akcr.b(motionEvent, "event");
            return Math.abs(i - i3) >= i5;
        }
    }

    /* renamed from: abxe$h */
    public static final class h implements abvt {
        h() {
        }

        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return false;
        }
    }

    /* renamed from: abxe$f */
    static final class f extends akcs implements akca<d, Float, Float, Float> {
        private /* synthetic */ b a;

        f(b bVar) {
            this.a = bVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            d dVar = (d) obj;
            float floatValue = ((Number) obj2).floatValue();
            float floatValue2 = ((Number) obj3).floatValue();
            akcr.b(dVar, "orientation");
            return Float.valueOf(this.a.i == dVar ? (floatValue * floatValue2) + (this.a.h * floatValue2) : MapboxConstants.MINIMUM_ZOOM);
        }
    }

    /* renamed from: abxe$g */
    static final class g extends akcs implements akbk<ajxm<? extends T, ? extends abwy>> {
        private /* synthetic */ Map a;
        private /* synthetic */ abvh b;
        private /* synthetic */ Map c;

        g(Map map, abvh abvh, Map map2) {
            this.a = map;
            this.b = abvh;
            this.c = map2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object next;
            Iterator it = this.a.entrySet().iterator();
            if (it.hasNext()) {
                next = it.next();
                float abs = Math.abs(((Number) ((abwg) ((Entry) next).getValue()).a.invoke()).floatValue() - this.b.c());
                while (it.hasNext()) {
                    Object next2 = it.next();
                    float abs2 = Math.abs(((Number) ((abwg) ((Entry) next2).getValue()).a.invoke()).floatValue() - this.b.c());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                }
            } else {
                next = null;
            }
            Entry entry = (Entry) next;
            Object key = entry != null ? entry.getKey() : null;
            abwy abwy = (abwy) this.c.get(key);
            return (key == null || abwy == null) ? null : new ajxm(key, abwy);
        }
    }

    /* renamed from: abxe$j */
    static final class j extends akcs implements akbk<ajxw> {
        private /* synthetic */ b a;
        private /* synthetic */ akbk b;

        j(b bVar, akbk akbk) {
            this.a = bVar;
            this.b = akbk;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            akbw akbw = this.a.k;
            if (akbw != null) {
                ajxm ajxm = (ajxm) this.b.invoke();
                if (ajxm != null) {
                    akbw.invoke(ajxm.a, (abwy) ajxm.b);
                }
            }
            return ajxw.a;
        }
    }

    static {
        c cVar = new c();
    }

    public abxe(b<T> bVar) {
        final b<T> bVar2 = bVar;
        akcr.b(bVar2, "builder");
        super(bVar2);
        abqr abqr = new abqr();
        abqr.a((abqr.a) new a(this));
        this.c = abqr;
        if (bVar2.e) {
            final abwi abwi = new abwi();
            this.e = abwi;
            this.f = abwi;
            Map linkedHashMap = new LinkedHashMap();
            List arrayList = new ArrayList();
            final Map linkedHashMap2 = new LinkedHashMap();
            Map linkedHashMap3 = new LinkedHashMap();
            Map linkedHashMap4 = new LinkedHashMap();
            abvh abvh = new abvh(this.a, false);
            abvh.i();
            akca fVar = new f(bVar2);
            akbk gVar = new g(linkedHashMap2, abvh, linkedHashMap);
            akbk jVar = new j(bVar2, gVar);
            Context context = this.a;
            if (context == null) {
                akcr.a();
            }
            final abwu abwu = new abwu(this.a, new e((int) abtp.a(500.0f, context)));
            this.g = new abwt(abwi, abwu);
            abuz abuz = new abuz();
            abwu.a((abva) abuz);
            abuz.a(abvh);
            akdd.b bVar3 = new akdd.b();
            bVar3.a = MapboxConstants.MINIMUM_ZOOM;
            final akbk akbk = jVar;
            final akdd.b bVar4 = bVar3;
            Map map = linkedHashMap4;
            final akdd.b bVar5 = bVar3;
            final abvh abvh2 = abvh;
            akbk akbk2 = gVar;
            final b<T> bVar6 = bVar;
            Map map2 = linkedHashMap3;
            abvh abvh3 = abvh;
            final akbk akbk3 = akbk2;
            abvh3.a((abvg) new abvg(this) {
                private /* synthetic */ abxe a;

                public final void a(float f) {
                    Runnable runnable = this.a.d;
                    if (runnable != null) {
                        runnable.run();
                    }
                }

                public final void b(int i) {
                    if (i == 3 || i == 2) {
                        abwu.a(0);
                    } else if (i == 0) {
                        abwu abwu = abwu;
                        Object obj = ViewConfiguration.get(this.a.a);
                        akcr.a(obj, "ViewConfiguration.get(context)");
                        abwu.a(obj.getScaledTouchSlop());
                        akbk.invoke();
                    } else {
                        if (i == 1) {
                            bVar4.a = abvh2.c();
                            akbw akbw = bVar6.l;
                            if (akbw != null) {
                                ajxm ajxm = (ajxm) akbk3.invoke();
                                if (ajxm != null) {
                                    akbw.invoke(ajxm.a, (abwy) ajxm.b);
                                }
                            }
                        }
                    }
                }
            });
            abvh3.a((c) new c() {

                /* renamed from: abxe$2$a */
                static final class a extends akcs implements akbl<Float, Boolean> {
                    private /* synthetic */ float a;

                    a(float f) {
                        this.a = f;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        return Boolean.valueOf(((Number) obj).floatValue() < this.a);
                    }
                }

                /* renamed from: abxe$2$b */
                static final class b extends akcs implements akbl<Float, Boolean> {
                    private /* synthetic */ float a;

                    b(float f) {
                        this.a = f;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        return Boolean.valueOf(((Number) obj).floatValue() > this.a);
                    }
                }

                public final float a(float f) {
                    Object obj;
                    Map map = linkedHashMap2;
                    Collection arrayList = new ArrayList(map.size());
                    for (Entry value : map.entrySet()) {
                        arrayList.add(Float.valueOf(((Number) ((abwg) value.getValue()).a.invoke()).floatValue()));
                    }
                    Iterable iterable = (List) arrayList;
                    Iterator it = iterable.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        float abs = Math.abs(((Number) next).floatValue() - bVar5.a);
                        while (it.hasNext()) {
                            Object next2 = it.next();
                            float abs2 = Math.abs(((Number) next2).floatValue() - bVar5.a);
                            if (Float.compare(abs, abs2) > 0) {
                                next = next2;
                                abs = abs2;
                            }
                        }
                        obj = next;
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        akcr.a();
                    }
                    float floatValue = ((Number) obj).floatValue();
                    Float i = akfh.i(akfh.a(ajyu.v(iterable), (akbl) new b(floatValue)));
                    Float g = akfh.g(akfh.a(ajyu.v(iterable), (akbl) new a(floatValue)));
                    return (i == null || f <= ((i.floatValue() - floatValue) / 2.0f) + floatValue) ? (g == null || f >= floatValue - ((floatValue - g.floatValue()) / 2.0f)) ? floatValue : g.floatValue() : i.floatValue();
                }
            });
            final akdd.c cVar = new akdd.c();
            cVar.a = -1;
            this.i.a(bVar2.m.d((Object) ajyw.a).e((ajfb) new ajfb<Iterable<? extends T>>() {
                public final /* synthetic */ void accept(Object obj) {
                    int b;
                    obj = (Iterable) obj;
                    akdd.c cVar = cVar;
                    Object obj2 = bVar2.j;
                    if (obj2 != null) {
                        akcr.a(obj, Event.LIST);
                        b = ajyu.b((Iterable) obj, obj2);
                    } else {
                        b = -1;
                    }
                    cVar.a = b;
                }
            }));
            final d dVar = new d();
            dVar.a = 0;
            ajei ajei = this.i;
            final List list = arrayList;
            final Map map3 = linkedHashMap;
            final b<T> bVar7 = bVar;
            ajdp ajdp = bVar2.m;
            final akca akca = fVar;
            final abvh abvh4 = abvh3;
            linkedHashMap = map2;
            ajdp ajdp2 = ajdp;
            final Map map4 = linkedHashMap2;
            linkedHashMap2 = map;
            ajdp ajdp3 = ajdp2;
            final akbk akbk4 = jVar;
            ajei.a(ajdp3.f((ajfb) new ajfb<Iterable<? extends T>>(this) {
                final /* synthetic */ abxe a;

                /* renamed from: abxe$4$a */
                static final class a extends akcs implements akbk<Float> {
                    private /* synthetic */ 4 a;

                    a(4 4) {
                        this.a = 4;
                        super(0);
                    }

                    public final /* synthetic */ Object invoke() {
                        return Float.valueOf(-abvh4.c());
                    }
                }

                /* renamed from: abxe$4$b */
                static final class b extends akcs implements akbw<Float, Float, Float> {
                    private /* synthetic */ 4 a;

                    b(4 4) {
                        this.a = 4;
                        super(2);
                    }

                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        float floatValue = ((Number) obj).floatValue();
                        return Float.valueOf(floatValue + ((((Number) obj2).floatValue() - floatValue) * abpf.a(((float) (abqo.c() - dVar.a)) / 200.0f, (float) MapboxConstants.MINIMUM_ZOOM, 1.0f)));
                    }
                }

                public final /* synthetic */ void accept(Object obj) {
                    int i;
                    akca akca;
                    d dVar;
                    Float f;
                    float f2;
                    Iterable iterable = (Iterable) obj;
                    akcr.b(iterable, Event.LIST);
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if ((1 ^ list.contains(next)) != 0) {
                            arrayList.add(next);
                        }
                    }
                    List list = (List) arrayList;
                    List arrayList2 = new ArrayList();
                    List arrayList3 = new ArrayList();
                    Iterator it = list.iterator();
                    boolean z = false;
                    int i2 = 0;
                    while (true) {
                        i = -1;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next2 = it.next();
                        int b = ajyu.b(iterable, next2);
                        if (b == -1) {
                            arrayList2.add(next2);
                        } else if (b != i2) {
                            arrayList3.add(next2);
                        }
                        i2++;
                    }
                    for (Object next3 : list) {
                        Object obj2 = (abwy) map3.get(next3);
                        if (obj2 == null) {
                            akbl akbl = bVar7.d;
                            if (akbl == null) {
                                akcr.a("mapToElement");
                            }
                            obj2 = (abwy) akbl.invoke(next3);
                        }
                        map3.put(next3, obj2);
                        abwh abwh = new abwh();
                        abwh.a(z);
                        final abxn abxn = new abxn(Float.valueOf((float) ajyu.b(iterable, next3)), new b(this));
                        abwg abwg = new abwg();
                        abwg.a((akbk) cVar.a == i ? new akbk<Float>(this) {
                            private /* synthetic */ 4 a;

                            public final /* synthetic */ Object invoke() {
                                akca akca = akca;
                                d dVar = d.HORIZONTAL;
                                Float f = bVar7.f;
                                if (f == null) {
                                    akcr.a();
                                }
                                return Float.valueOf(((Number) akca.invoke(dVar, f, abxn.a())).floatValue());
                            }
                        } : new akbk<Float>(this) {
                            private /* synthetic */ 4 a;

                            public final /* synthetic */ Object invoke() {
                                akca akca = akca;
                                d dVar = d.HORIZONTAL;
                                Float f = bVar7.f;
                                if (f == null) {
                                    akcr.a();
                                }
                                return Float.valueOf(((Number) akca.invoke(dVar, f, Float.valueOf(((Number) abxn.a()).floatValue() - ((float) cVar.a)))).floatValue());
                            }
                        });
                        Float f3 = bVar7.f;
                        if (f3 == null) {
                            akcr.a();
                        }
                        abwh.a(f3.floatValue());
                        abwg.b((akbk) new akbk<Float>(this) {
                            private /* synthetic */ 4 a;

                            public final /* synthetic */ Object invoke() {
                                akca akca = akca;
                                d dVar = d.VERTICAL;
                                Float f = bVar7.g;
                                if (f == null) {
                                    akcr.a();
                                }
                                return Float.valueOf(((Number) akca.invoke(dVar, f, abxn.a())).floatValue());
                            }
                        });
                        f3 = bVar7.g;
                        if (f3 == null) {
                            akcr.a();
                        }
                        abwh.b(f3.floatValue());
                        new abwg().a((akbk) new a(this));
                        abwh.a(obj2.a(), obj2.b(), obj2.c());
                        abwi abwi = abwi;
                        abwk abwk = abwh;
                        abvv abwd = new abwd(r13, abwg, abwh);
                        abwt abwt = new abwt(abwh);
                        abww[] abwwArr = new abww[]{r13, abwg};
                        akcr.b(abwwArr, "touchModifier");
                        ajyr.a((Collection) abwt.a, (Object[]) abwwArr);
                        linkedHashMap.put(next3, Integer.valueOf(abwi.a(abwk, abwd, (abwx) abwt, 1)));
                        map4.put(next3, abwg);
                        linkedHashMap2.put(next3, abxn);
                        z = false;
                        i = -1;
                    }
                    dVar.a = abqo.c();
                    for (Object next32 : arrayList3) {
                        abxn abxn2 = (abxn) linkedHashMap2.get(next32);
                        if (abxn2 != null) {
                            Float valueOf = Float.valueOf((float) list.indexOf(next32));
                            Float valueOf2 = Float.valueOf((float) ajyu.b(iterable, next32));
                            abxn2.a = valueOf;
                            abxn2.b = valueOf2;
                        }
                    }
                    Iterable iterable2 = arrayList3;
                    akcr.b(iterable2, "receiver$0");
                    if ((((Collection) iterable2).isEmpty() ^ 1) != 0) {
                        this.a.c.a(200, 0, 200);
                        this.a.c.a();
                    }
                    for (Object next4 : arrayList2) {
                        Integer num = (Integer) linkedHashMap.get(next4);
                        if (num != null) {
                            abwi.a(num.intValue());
                        }
                        linkedHashMap.remove(next4);
                        map4.remove(next4);
                        linkedHashMap2.remove(next4);
                    }
                    list.clear();
                    ajyr.a((Collection) list, iterable);
                    this.a.b.clear();
                    for (Object next42 : list) {
                        abwy abwy = (abwy) map3.get(next42);
                        if (abwy != null) {
                            this.a.a(abwy);
                        }
                    }
                    float q = (float) ajyu.q(iterable);
                    abvh abvh = abvh4;
                    if (cVar.a != -1) {
                        akca = akca;
                        dVar = d.HORIZONTAL;
                        f = bVar7.f;
                        if (f == null) {
                            akcr.a();
                        }
                        f2 = -((Number) akca.invoke(dVar, f, Float.valueOf((float) cVar.a))).floatValue();
                    } else {
                        f2 = MapboxConstants.MINIMUM_ZOOM;
                    }
                    abvh.c(f2);
                    abvh = abvh4;
                    akca = akca;
                    dVar = d.HORIZONTAL;
                    f = bVar7.f;
                    if (f == null) {
                        akcr.a();
                    }
                    if (cVar.a != -1) {
                        q -= (float) cVar.a;
                    }
                    abvh.b(((Number) akca.invoke(dVar, f, Float.valueOf(q - 1.0f))).floatValue());
                    q = abpf.a(abvh4.c(), abvh4.e(), abvh4.d());
                    if (q != abvh4.c()) {
                        final float c = abvh4.c();
                        dVar.a = abqo.c();
                        this.a.c.a(200, 0, 200);
                        this.a.c.a();
                        this.a.c.a((abqr.a) new abqr.a(this) {
                            private /* synthetic */ 4 a;

                            public final void a() {
                                this.a.a.c.b(this);
                            }

                            public final void a(long j, float f) {
                                abvh abvh = abvh4;
                                float f2 = c;
                                abvh.a(f2 + ((q - f2) * abpf.a(((float) (abqo.c() - dVar.a)) / 200.0f, (float) MapboxConstants.MINIMUM_ZOOM, 1.0f)));
                            }
                        });
                    }
                    akbk4.invoke();
                }
            }));
            return;
        }
        throw new UnsupportedOperationException("unable to create list without fixed dimension yet");
    }

    public final abwk a() {
        return this.e;
    }

    public final void a(View view) {
        akcr.b(view, "v");
        super.a(view);
        this.d = new i(view);
    }

    public final abvv b() {
        return this.f;
    }

    public final /* synthetic */ abwx c() {
        return new abwt(super.c(), this.g);
    }

    public final abvt d() {
        return this.h;
    }

    public final void dispose() {
        this.i.dispose();
    }

    public final boolean isDisposed() {
        return this.i.isDisposed();
    }
}
