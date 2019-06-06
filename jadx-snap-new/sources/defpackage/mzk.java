package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.b;
import java.util.Collection;
import java.util.Map;

/* renamed from: mzk */
public interface mzk {

    /* renamed from: mzk$a */
    public static final class a implements mzk {
        public static final a a = new a();

        private a() {
        }

        public final ajcx a(b bVar) {
            akcr.b(bVar, DiscoverStorySnapModel.LENSID);
            Object a = ajvo.a(ajhn.a);
            akcr.a(a, "Completable.complete()");
            return a;
        }

        public final ajdx<c> a(b bVar) {
            akcr.b(bVar, "criteria");
            if (akcr.a((Object) bVar, a.a) || (bVar instanceof b)) {
                Object b = ajdx.b(new a(ajyx.a));
                akcr.a(b, "Single.just(when (criter…on(emptyMap())\n        })");
                return b;
            }
            throw new ajxk();
        }
    }

    /* renamed from: mzk$d */
    public static abstract class d {
        private final b a;

        /* renamed from: mzk$d$a */
        public static final class a extends d {
            public final b a;
            public final int b;

            public a(b bVar, int i) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                super(bVar, (byte) 0);
                this.a = bVar;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (akcr.a(this.a, aVar.a)) {
                            if ((this.b == aVar.b ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                b bVar = this.a;
                return ((bVar != null ? bVar.hashCode() : 0) * 31) + this.b;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Impression(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", count=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private d(b bVar) {
            this.a = bVar;
        }

        public /* synthetic */ d(b bVar, byte b) {
            this(bVar);
        }
    }

    /* renamed from: mzk$b */
    public static abstract class b {

        /* renamed from: mzk$b$a */
        public static abstract class a extends b {

            /* renamed from: mzk$b$a$b */
            public static final class b extends a {
                public final Collection<defpackage.mhs.b> a;

                public b(Collection<defpackage.mhs.b> collection) {
                    akcr.b(collection, "ids");
                    super();
                    this.a = collection;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mzk.b.a.b) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.mzk.b.a.b;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.mzk.b.a.b) r2;
                    r0 = r1.a;
                    r2 = r2.a;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mzk$b$a$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    Collection collection = this.a;
                    return collection != null ? collection.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("ByIds(ids=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: mzk$b$a$a */
            public static final class a extends a {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            private a() {
                super();
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mzk$c */
    public static abstract class c {

        /* renamed from: mzk$c$a */
        public static final class a extends c {
            public final Map<b, a> a;

            public a(Map<b, a> map) {
                akcr.b(map, "impressions");
                super();
                this.a = map;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mzk.c.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.mzk.c.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.mzk.c.a) r2;
                r0 = r1.a;
                r2 = r2.a;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mzk$c$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Map map = this.a;
                return map != null ? map.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Impression(impressions=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    ajcx a(b bVar);

    ajdx<c> a(b bVar);
}
