package defpackage;

import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import java.util.Set;

/* renamed from: zss */
public abstract class zss {
    public final String a;

    /* renamed from: zss$h */
    public static abstract class h extends zss {

        /* renamed from: zss$h$c */
        public static final class c extends h {
            public static final c b = new c();

            private c() {
                super("Refetch", (byte) 0);
            }
        }

        /* renamed from: zss$h$a */
        public static final class a extends h {
            public static final a b = new a();

            private a() {
                super("Cached", (byte) 0);
            }
        }

        /* renamed from: zss$h$b */
        public static final class b extends h {
            public static final b b = new b();

            private b() {
                super("Invalidate", (byte) 0);
            }
        }

        private h(String str) {
            super("UnlockedLenses#".concat(String.valueOf(str)), (byte) 0);
        }

        public /* synthetic */ h(String str, byte b) {
            this(str);
        }
    }

    /* renamed from: zss$b */
    public static abstract class b extends zss {

        /* renamed from: zss$b$b */
        public static final class b extends b {
            public static final b b = new b();

            private b() {
                super("Filters", (byte) 0);
            }
        }

        /* renamed from: zss$b$a */
        public static final class a extends b {
            public static final a b = new a();

            private a() {
                super("CaptionStyles", (byte) 0);
            }
        }

        /* renamed from: zss$b$c */
        public static final class c extends b {
            public static final c b = new c();

            private c() {
                super("Lenses", (byte) 0);
            }
        }

        /* renamed from: zss$b$d */
        public static final class d extends b {
            public static final d b = new d();

            private d() {
                super("PrefetchLenses", (byte) 0);
            }
        }

        /* renamed from: zss$b$e */
        public static final class e extends b {
            public static final e b = new e();

            private e() {
                super("Stickers", (byte) 0);
            }
        }

        private b(String str) {
            super("ByType#".concat(String.valueOf(str)), (byte) 0);
        }

        public /* synthetic */ b(String str, byte b) {
            this(str);
        }
    }

    /* renamed from: zss$a */
    public static final class a extends zss {
        public final Set<Long> b;

        public a(Set<Long> set) {
            akcr.b(set, "unlockableIds");
            super("ByIds", (byte) 0);
            this.b = set;
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.zss.a) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.zss.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.zss.a) r2;
            r0 = r1.b;
            r2 = r2.b;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zss$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Set set = this.b;
            return set != null ? set.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ByIds(unlockableIds=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: zss$d */
    public static final class d extends zss {
        public static final d b = new d();

        private d() {
            super("Geofilters", (byte) 0);
        }
    }

    /* renamed from: zss$g */
    public static final class g extends zss {
        public static final g b = new g();

        private g() {
            super("UnlockedFilters", (byte) 0);
        }
    }

    /* renamed from: zss$e */
    public static final class e extends zss {
        public static final e b = new e();

        private e() {
            super("Geolenses", (byte) 0);
        }
    }

    /* renamed from: zss$f */
    public static final class f extends zss {
        public static final f b = new f();

        private f() {
            super("Geostickers", (byte) 0);
        }
    }

    /* renamed from: zss$c */
    public static final class c extends zss {
        public static final c b = new c();

        private c() {
            super("GeoCaptionStyles", (byte) 0);
        }
    }

    /* renamed from: zss$i */
    public static final class i extends zss {
        public static final i b = new i();

        private i() {
            super("UnlockedStickers", (byte) 0);
        }
    }

    private zss(String str) {
        this.a = str;
    }

    public /* synthetic */ zss(String str, byte b) {
        this(str);
    }

    public final PersistableUnlockableType a() {
        if (akcr.a((Object) this, d.b) || akcr.a((Object) this, g.b) || akcr.a((Object) this, b.b)) {
            return PersistableUnlockableType.FILTER;
        }
        if (akcr.a((Object) this, e.b) || (this instanceof h) || akcr.a((Object) this, c.b)) {
            return PersistableUnlockableType.LENS;
        }
        if (akcr.a((Object) this, f.b) || akcr.a((Object) this, i.b) || akcr.a((Object) this, e.b)) {
            return PersistableUnlockableType.STICKER_PACK;
        }
        if (akcr.a((Object) this, c.b) || akcr.a((Object) this, a.b)) {
            return PersistableUnlockableType.CAPTION_STYLE;
        }
        if (akcr.a((Object) this, d.b)) {
            return PersistableUnlockableType.PREFETCH_LENS;
        }
        throw new UnsupportedOperationException("Fail to extract unlockable type info from ".concat(String.valueOf(this)));
    }

    public final UnlockMechanism b() {
        if (akcr.a((Object) this, d.b) || akcr.a((Object) this, e.b) || akcr.a((Object) this, f.b) || akcr.a((Object) this, c.b)) {
            return UnlockMechanism.LOCATION;
        }
        if (akcr.a((Object) this, g.b) || (this instanceof h) || akcr.a((Object) this, i.b)) {
            return UnlockMechanism.SNAP_CODE;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this);
        stringBuilder.append(" may contain more than one unlocking mechanism");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
