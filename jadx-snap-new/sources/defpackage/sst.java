package defpackage;

import android.content.Context;
import defpackage.sjg.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sst */
public final class sst {
    final b a;
    public final ajei b;
    final Context c;
    public final ftl d;
    public final zfw e;
    final snv f;

    /* renamed from: sst$b */
    public static final class b {
        final List<a> a = new ArrayList();
        AtomicBoolean b = new AtomicBoolean(false);
        private final long c = this.e.c();
        private final ajdw d;
        private final ihh e;

        /* renamed from: sst$b$a */
        public static final class a {
            final String a;
            final akbk<ajxw> b;
            private final String c;

            public /* synthetic */ a(String str, akbk akbk) {
                this(str, akbk, null);
            }

            public a(String str, akbk<ajxw> akbk, String str2) {
                akcr.b(str, "tag");
                akcr.b(akbk, "task");
                this.a = str;
                this.b = akbk;
                this.c = str2;
            }

            /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x0029;
            L_0x0002:
                r0 = r3 instanceof defpackage.sst.b.a;
                if (r0 == 0) goto L_0x0027;
            L_0x0006:
                r3 = (defpackage.sst.b.a) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x0012:
                r0 = r2.b;
                r1 = r3.b;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x001c:
                r0 = r2.c;
                r3 = r3.c;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x0027;
            L_0x0026:
                goto L_0x0029;
            L_0x0027:
                r3 = 0;
                return r3;
            L_0x0029:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.sst$b$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                akbk akbk = this.b;
                hashCode = (hashCode + (akbk != null ? akbk.hashCode() : 0)) * 31;
                String str2 = this.c;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Task(tag=");
                stringBuilder.append(this.a);
                stringBuilder.append(", task=");
                stringBuilder.append(this.b);
                stringBuilder.append(", description=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: sst$b$c */
        static final class c implements Runnable {
            private /* synthetic */ b a;

            c(b bVar) {
                this.a = bVar;
            }

            public final void run() {
                int isEmpty;
                if (this.a.b.compareAndSet(false, true)) {
                    b bVar = this.a;
                    a a = b.a(bVar.a);
                    if (a != null) {
                        akbk bVar2 = new b(a, bVar);
                        akcr.b(a.a, "subTag");
                        akcr.b(bVar2, "section");
                        bVar2.invoke();
                    }
                    this.a.b.set(false);
                }
                synchronized (this.a.a) {
                    isEmpty = 1 ^ this.a.a.isEmpty();
                }
                if (isEmpty != 0) {
                    this.a.a();
                }
            }
        }

        /* renamed from: sst$b$b */
        static final class b extends akcs implements akbk<ajxw> {
            private /* synthetic */ a a;
            private /* synthetic */ b b;

            b(a aVar, b bVar) {
                this.a = aVar;
                this.b = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                (this.b.e.c() - this.b.c);
                this.a.b.invoke();
                (this.b.e.c() - this.b.c);
                return ajxw.a;
            }
        }

        public b(ajdw ajdw, ihh ihh) {
            akcr.b(ajdw, "idleScheduler");
            akcr.b(ihh, "clock");
            this.d = ajdw;
            this.e = ihh;
        }

        static a a(List<a> list) {
            a aVar;
            synchronized (list) {
                aVar = (((Collection) list).isEmpty() ^ 1) != 0 ? (a) list.remove(0) : null;
            }
            return aVar;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            this.d.a((Runnable) new c(this));
        }

        public final void a(String str, akbk<ajxw> akbk) {
            akcr.b(str, "tag");
            akcr.b(akbk, "task");
            a(new a(str, akbk));
        }

        public final void a(a aVar) {
            Object obj;
            akcr.b(aVar, "task");
            synchronized (this.a) {
                this.a.add(aVar);
                obj = 1;
                if (this.a.size() != 1) {
                    obj = null;
                }
            }
            if (obj != null) {
                a();
            }
        }
    }

    /* renamed from: sst$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sst$k */
    public static final class k<T> implements ajfb<Boolean> {
        private /* synthetic */ sst a;

        public k(sst sst) {
            this.a = sst;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            sst sst = this.a;
            akcr.a(obj, "enabled");
            if (obj.booleanValue()) {
                sst.a.a("layers", c.a);
                sst.a.a("exoplayerCache", new d(sst));
                sst.a.a("recyclerBG", new e(sst));
                sst.a.a("codecInstances", new f(sst));
            }
        }
    }

    /* renamed from: sst$c */
    static final class c extends akcs implements akbk<ajxw> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            sjg.a();
            return ajxw.a;
        }
    }

    /* renamed from: sst$d */
    static final class d extends akcs implements akbk<ajxw> {
        private /* synthetic */ sst a;

        d(sst sst) {
            this.a = sst;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            sxs.a();
            return ajxw.a;
        }
    }

    /* renamed from: sst$e */
    static final class e extends akcs implements akbk<ajxw> {
        private /* synthetic */ sst a;

        e(sst sst) {
            this.a = sst;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String str;
            String str2;
            String str3;
            int i;
            sst sst = this.a;
            Context context = sst.c;
            snv snv = this.a.f;
            List arrayList = new ArrayList();
            Object a = new a().a();
            akcr.a(a, "OperaLayerConfiguration.Builder().build()");
            Object b = a.b();
            akcr.a(b, "layerConfiguration.registeredLayerFactories");
            Iterator it = ((Iterable) b).iterator();
            while (true) {
                str = "registration.factory.layerClass";
                str2 = "registration";
                str3 = "registration.factory";
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object obj = (spz) it.next();
                akbk gVar = new g(obj, context, arrayList);
                akcr.a(obj, str2);
                int b2 = obj.b();
                while (i < b2) {
                    Object d = obj.d();
                    akcr.a(d, str3);
                    d = d.a();
                    akcr.a(d, str);
                    arrayList.add(new j(d, b2, gVar));
                    i++;
                }
            }
            a = a.c();
            akcr.a(a, "layerConfiguration.float…LayerFactoryRegistrations");
            for (Object b3 : (Iterable) a) {
                akbk hVar = new h(b3, context, snv, arrayList);
                akcr.a(b3, str2);
                Object a2 = b3.a();
                akcr.a(a2, str3);
                int b4 = snv.b(a2.b());
                for (int i2 = 0; i2 < b4; i2++) {
                    Object a3 = b3.a();
                    akcr.a(a3, str3);
                    a3 = a3.b();
                    akcr.a(a3, str);
                    arrayList.add(new j(a3, b4, hVar));
                }
            }
            for (Object next : arrayList) {
                int i3 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                j jVar = (j) next;
                b bVar = sst.a;
                String concat = "recyclerBG:".concat(String.valueOf(i));
                StringBuilder stringBuilder = new StringBuilder("layer ");
                stringBuilder.append(jVar.a);
                str = stringBuilder.toString();
                akbk iVar = new i(jVar, sst, snv);
                akcr.b(concat, "tag");
                akcr.b(iVar, "task");
                bVar.a(new a(concat, iVar, str));
                i = i3;
            }
            return ajxw.a;
        }
    }

    /* renamed from: sst$f */
    static final class f extends akcs implements akbk<ajxw> {
        private /* synthetic */ sst a;

        f(sst sst) {
            this.a = sst;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            sxh.a("video/avc");
            return ajxw.a;
        }
    }

    /* renamed from: sst$g */
    static final class g extends akcs implements akbk<slm> {
        private /* synthetic */ spz a;
        private /* synthetic */ Context b;
        private /* synthetic */ List c;

        g(spz spz, Context context, List list) {
            this.a = spz;
            this.b = context;
            this.c = list;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a;
            akcr.a(obj, "registration");
            return obj.d().a(this.b);
        }
    }

    /* renamed from: sst$j */
    public static final class j {
        final Class<? extends slk> a;
        final int b;
        final akbk<slk> c;

        public j(Class<? extends slk> cls, int i, akbk<? extends slk> akbk) {
            akcr.b(cls, "layerClass");
            akcr.b(akbk, "createFunction");
            this.a = cls;
            this.b = i;
            this.c = akbk;
        }
    }

    /* renamed from: sst$i */
    static final class i extends akcs implements akbk<ajxw> {
        private /* synthetic */ j a;
        private /* synthetic */ sst b;
        private /* synthetic */ snv c;

        i(j jVar, sst sst, snv snv) {
            this.a = jVar;
            this.b = sst;
            this.c = snv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if ((this.c.b(this.a.a) <= this.a.b ? 1 : null) != null) {
                this.c.a((slk) this.a.c.invoke());
            }
            return ajxw.a;
        }
    }

    /* renamed from: sst$h */
    static final class h extends akcs implements akbk<sjr> {
        private /* synthetic */ spt a;
        private /* synthetic */ Context b;
        private /* synthetic */ snv c;
        private /* synthetic */ List d;

        h(spt spt, Context context, snv snv, List list) {
            this.a = spt;
            this.b = context;
            this.c = snv;
            this.d = list;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a;
            akcr.a(obj, "registration");
            return obj.a().a(this.b);
        }
    }

    static {
        a aVar = new a();
    }

    private sst(Context context, ftl ftl, zfw zfw, snv snv, ihh ihh) {
        akcr.b(context, "context");
        akcr.b(ftl, "experimentConfigProvider");
        akcr.b(zfw, "schedulers");
        akcr.b(snv, "recycler");
        akcr.b(ihh, "clock");
        this.c = context;
        this.d = ftl;
        this.e = zfw;
        this.f = snv;
        this.a = new b(this.e.j(), ihh);
        this.b = new ajei();
    }

    public sst(Context context, ftl ftl, zgb zgb, sxd sxd, ihh ihh) {
        akcr.b(context, "context");
        akcr.b(ftl, "experimentConfigProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(sxd, "recycler");
        akcr.b(ihh, "clock");
        this(context, ftl, zgb.a(ssl.a.callsite("OperaWarmup")), sxd.a, ihh);
    }
}
