package defpackage;

import com.google.common.base.Optional;
import com.snap.core.db.api.DbTransaction;
import com.snap.framework.developer.BuildConfigInfo;
import defpackage.tnx.b;
import defpackage.tnx.c;
import defpackage.tnx.d;
import defpackage.tnx.f;
import defpackage.tnx.g;
import defpackage.tnx.i;
import defpackage.tnx.j;
import defpackage.tnx.l;
import defpackage.zgs.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: tnj */
public class tnj {
    public final tnx a;
    public final aipn<zgs> b;
    final ajdx<iha> c;
    private final BuildConfigInfo d;

    /* renamed from: tnj$a */
    public class a {
        protected Map<fth, Object> a;
        protected Set<fth> b;
        protected boolean c;
        private Set<ftg> d;
        private tno e;

        private a(tno tno) {
            this.a = new HashMap();
            this.b = new HashSet();
            this.d = new HashSet();
            this.e = tno;
            this.c = false;
        }

        public /* synthetic */ a(tnj tnj, tno tno, byte b) {
            this(tno);
        }

        private void a(DbTransaction dbTransaction) {
            tnj.this.a.a(new -$$Lambda$tnj$a$pIaCVd1Fcji0LUFqxF0agK412m0(this), dbTransaction);
        }

        private void b(DbTransaction dbTransaction) {
            if (this.c) {
                tnj.this.a.b(this.a, this.e, dbTransaction);
                return;
            }
            tnx tnx;
            for (ftg a : this.d) {
                tnj.this.a.a(a, this.e);
            }
            if (!this.b.isEmpty()) {
                tnx = tnj.this.a;
                Set set = this.b;
                tnx.b((fth[]) set.toArray(new fth[set.size()]), this.e);
            }
            tnx = tnj.this.a;
            Map map = this.a;
            tno tno = this.e;
            akcr.b(map, "values");
            akcr.b(tno, "type");
            akcr.b(dbTransaction, "tx");
            tnx.a(tni.b(map), tno, dbTransaction);
        }

        private static /* synthetic */ void d() {
        }

        public ajej a(ajfb<? super Throwable> ajfb) {
            return c().a(-$$Lambda$tnj$a$Y7i5fIwgiqe4JO4_jC0WRchGlFc.INSTANCE, (ajfb) ajfb);
        }

        public final a a() {
            this.c = true;
            return this;
        }

        public final a a(fth fth) {
            this.a.remove(fth);
            this.b.add(fth);
            return this;
        }

        public final a a(fth fth, Boolean bool) {
            if (fth.a().b == fti.BOOLEAN) {
                return a(fth, (Object) bool);
            }
            StringBuilder stringBuilder = new StringBuilder("Wrong type key for setBoolean, found: ");
            stringBuilder.append(fth.a().b);
            stringBuilder.append(" key: ");
            stringBuilder.append(fth);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final a a(fth fth, Enum enumR) {
            if (fth.a().b != fti.STRING || fth.a().c == null) {
                StringBuilder stringBuilder = new StringBuilder("setEnum called on non enum type key: ");
                stringBuilder.append(fth);
                stringBuilder.append(" type: ");
                stringBuilder.append(fth.a().b);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (enumR == null) {
                return a(fth);
            } else {
                if (fth.a().c == enumR.getDeclaringClass()) {
                    return a(fth, enumR.name());
                }
                StringBuilder stringBuilder2 = new StringBuilder("setEnum called with enum of a different class: ");
                stringBuilder2.append(enumR);
                stringBuilder2.append(" is of type ");
                stringBuilder2.append(enumR.getClass());
                stringBuilder2.append(", but key ");
                stringBuilder2.append(fth);
                stringBuilder2.append(" has enumClass ");
                stringBuilder2.append(fth.a().c);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }

        public final a a(fth fth, Float f) {
            if (fth.a().b == fti.FLOAT) {
                return a(fth, (Object) f);
            }
            StringBuilder stringBuilder = new StringBuilder("Wrong type key for setFloat, found: ");
            stringBuilder.append(fth.a().b);
            stringBuilder.append(" key: ");
            stringBuilder.append(fth);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final a a(fth fth, Integer num) {
            if (fth.a().b == fti.INTEGER) {
                return a(fth, (Object) num);
            }
            StringBuilder stringBuilder = new StringBuilder("Wrong type key for setInteger, found: ");
            stringBuilder.append(fth.a().b);
            stringBuilder.append(" key: ");
            stringBuilder.append(fth);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final a a(fth fth, Long l) {
            if (fth.a().b == fti.LONG) {
                return a(fth, (Object) l);
            }
            StringBuilder stringBuilder = new StringBuilder("Wrong type key for setLong, found: ");
            stringBuilder.append(fth.a().b);
            stringBuilder.append(" key: ");
            stringBuilder.append(fth);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final a a(fth fth, Object obj) {
            if (obj == null || (fth.a().c != null && obj.equals("null"))) {
                a(fth);
            } else {
                this.b.remove(fth);
                this.a.put(fth, obj);
            }
            return this;
        }

        public final a a(fth fth, String str) {
            if (fth.a().b != fti.STRING) {
                StringBuilder stringBuilder = new StringBuilder("Wrong type key for setString, found: ");
                stringBuilder.append(fth.a().b);
                stringBuilder.append(" key: ");
                stringBuilder.append(fth);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (fth.a().c == null) {
                return a(fth, (Object) str);
            } else {
                throw new IllegalArgumentException("setString called on object type key: ".concat(String.valueOf(fth)));
            }
        }

        public ajej b() {
            return c().e();
        }

        public final a b(fth fth, Object obj) {
            if (fth.a().b == fti.STRING && fth.a().c != null) {
                return obj == null ? a(fth) : a(fth, ((iha) tnj.this.c.b()).a(obj, fth.a().c));
            } else {
                StringBuilder stringBuilder = new StringBuilder("setGsonObject called on non object type key: ");
                stringBuilder.append(fth);
                stringBuilder.append(" type: ");
                stringBuilder.append(fth.a().b);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        public ajcx c() {
            return tnj.this.a.a("Preferences:applyWithResult", new -$$Lambda$tnj$a$U_1fEvcuAPzQFudZzh5dgrs0VAg(this));
        }
    }

    /* renamed from: tnj$b */
    public class b {
        private Map<fth, hxp> a;
        private Set<fth> b;
        private Set<ftg> c;
        private tno d;

        private b(tno tno) {
            this.a = new HashMap();
            this.b = new HashSet();
            this.c = new HashSet();
            this.d = tno;
        }

        /* synthetic */ b(tnj tnj, tno tno, byte b) {
            this(tno);
        }

        private void a(DbTransaction dbTransaction) {
            tnj.this.a.a(new -$$Lambda$tnj$b$Q_82KbjqU9ArdY7ksUHrCh1F2Pk(this), dbTransaction);
        }

        private void b(DbTransaction dbTransaction) {
            for (ftg a : this.c) {
                tnj.this.a.a(a, this.d);
            }
            tnx tnx = tnj.this.a;
            Set set = this.b;
            tnx.b((fth[]) set.toArray(new fth[set.size()]), this.d);
            tnj.this.a.c(this.a, this.d, dbTransaction);
        }

        public final ajcx a() {
            return tnj.this.a.a("Preferences:ApplyChanges", new -$$Lambda$tnj$b$GhH1SR07HZb-uZBYycJWPaYkZVQ(this));
        }

        public final <T extends fth> b a(Map<T, hxp> map) {
            for (Entry entry : map.entrySet()) {
                fth fth = (fth) entry.getKey();
                hxp hxp = (hxp) entry.getValue();
                if (hxp == null) {
                    this.a.remove(fth);
                    this.b.add(fth);
                } else {
                    this.b.remove(fth);
                    this.a.put(fth, hxp);
                }
            }
            return this;
        }

        public final ajcx b() {
            return tnj.this.a.b("Preferences:applyLaterWithResult", new -$$Lambda$tnj$b$GhH1SR07HZb-uZBYycJWPaYkZVQ(this));
        }
    }

    /* renamed from: tnj$c */
    public class c extends a {
        private c() {
            super(tnj.this, tno.TWEAK, (byte) 0);
        }

        /* synthetic */ c(tnj tnj, byte b) {
            this();
        }

        private ajcx d() {
            ajcx b;
            ajdb a;
            if (this.c) {
                b = ajvo.a(ajhn.a).b(-$$Lambda$tnj$c$pLUJQOltDgv63rbF8OZxBVsCrww.INSTANCE);
                a = ((zgs) tnj.this.b.get()).a(this.a);
            } else {
                b = ajvo.a(ajhn.a).b(-$$Lambda$tnj$c$wfoDgeSXFijwR-c0eyPa8Y4QlL8.INSTANCE).b(((zgs) tnj.this.b.get()).a(this.b));
                a = ((zgs) tnj.this.b.get()).b(this.a);
            }
            return b.b(a).f(-$$Lambda$okHCdENVp9xIECQSnp-74f7edfo.INSTANCE);
        }

        private static /* synthetic */ void e() {
        }

        private static /* synthetic */ void f() {
        }

        private static /* synthetic */ void g() {
        }

        public final ajej a(ajfb<? super Throwable> ajfb) {
            return d().a(-$$Lambda$tnj$c$r4aywdMP_2raf96edFHWsgSWaw0.INSTANCE, (ajfb) ajfb);
        }

        public final ajej b() {
            return d().e();
        }

        public final ajcx c() {
            return d();
        }
    }

    public tnj(tnx tnx, aipn<zgs> aipn, ajdx<iha> ajdx, BuildConfigInfo buildConfigInfo) {
        this.a = tnx;
        this.c = ajdx;
        this.b = aipn;
        this.d = buildConfigInfo;
    }

    public static boolean a(tno tno) {
        return tno == tno.TWEAK;
    }

    /* Access modifiers changed, original: final */
    public final Boolean a(fth fth, tno tno) {
        if (tnj.a(tno)) {
            return ((zgs) this.b.get()).a(fth);
        }
        tnx tnx = this.a;
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return (Boolean) tnx.a(fth, tno, (akbk) new c(tnx, fth, tno));
    }

    public final Map<fth, Object> a(fth[] fthArr, tno tno) {
        return tnj.a(tno) ? ((zgs) this.b.get()).a(fthArr) : this.a.a(fthArr, tno);
    }

    public final void a() {
        tnx tnx = this.a;
        tnx.a("PreferencesRepository:cacheAllKeys", (ajfb) new b(tnx)).e();
        if (this.d.TWEAK_FLAG) {
            zgs zgs = (zgs) this.b.get();
            ajcx.a((ajev) new a(zgs)).b((ajdw) zgs.a.f()).e();
        }
    }

    /* Access modifiers changed, original: final */
    public final Long b(fth fth, tno tno) {
        if (tnj.a(tno)) {
            return ((zgs) this.b.get()).c(fth);
        }
        tnx tnx = this.a;
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return (Long) tnx.a(fth, tno, (akbk) new i(tnx, fth, tno));
    }

    public final a b() {
        return new a(this, tno.SETTING, (byte) 0);
    }

    /* Access modifiers changed, original: final */
    public final Integer c(fth fth, tno tno) {
        if (tnj.a(tno)) {
            return ((zgs) this.b.get()).e(fth);
        }
        tnx tnx = this.a;
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return (Integer) tnx.a(fth, tno, (akbk) new g(tnx, fth, tno));
    }

    public final a c() {
        return new c(this, (byte) 0);
    }

    /* Access modifiers changed, original: final */
    public final Float d(fth fth, tno tno) {
        if (tnj.a(tno)) {
            return ((zgs) this.b.get()).d(fth);
        }
        tnx tnx = this.a;
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return (Float) tnx.a(fth, tno, (akbk) new f(tnx, fth, tno));
    }

    public final a d() {
        return new a(this, tno.EXPERIMENT, (byte) 0);
    }

    /* Access modifiers changed, original: final */
    public final Double e(fth fth, tno tno) {
        if (tnj.a(tno)) {
            return ((zgs) this.b.get()).b(fth);
        }
        tnx tnx = this.a;
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return (Double) tnx.a(fth, tno, (akbk) new d(tnx, fth, tno));
    }

    /* Access modifiers changed, original: final */
    public final b e() {
        return new b(this, tno.FEATURE, (byte) 0);
    }

    /* Access modifiers changed, original: final */
    public final String f(fth fth, tno tno) {
        if (tnj.a(tno)) {
            return ((zgs) this.b.get()).f(fth);
        }
        tnx tnx = this.a;
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return (String) tnx.a(fth, tno, (akbk) new j(tnx, fth, tno));
    }

    /* Access modifiers changed, original: final */
    public final ajdp<Optional<Object>> g(fth fth, tno tno) {
        if (tnj.a(tno)) {
            return ((zgs) this.b.get()).g(fth);
        }
        tnx tnx = this.a;
        akcr.b(fth, "key");
        akcr.b(tno, "type");
        return tnx.b.a(tni.a(fth), tno, new l(tnx, fth, tno));
    }

    /* Access modifiers changed, original: final */
    public final hxp h(fth fth, tno tno) {
        if (!tnj.a(tno)) {
            return this.a.a(fth, tno);
        }
        this.b.get();
        akcr.b(fth, "key");
        return null;
    }
}
