package defpackage;

import java.util.List;

/* renamed from: vlp */
public interface vlp {

    /* renamed from: vlp$a */
    public static abstract class a {

        /* renamed from: vlp$a$a */
        public static final class a extends a {
            final vjm a;
            private int b = 95;

            public a(vjm vjm) {
                akcr.b(vjm, "exportType");
                super();
                this.a = vjm;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.vlp.a.a) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.vlp.a.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.vlp.a.a) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vlp$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                vjm vjm = this.a;
                return (vjm != null ? vjm.hashCode() : 0) + 2945;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Export(jpegEncodingQuality=95, exportType=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: vlp$a$b */
        public static final class b extends a {
            final abtl a;
            final List<Long> b;
            final defpackage.admm.a c;
            final boolean d;

            private b(abtl abtl, List<Long> list, defpackage.admm.a aVar, boolean z) {
                akcr.b(abtl, "resolutionHint");
                akcr.b(list, "frameOffsetMsList");
                akcr.b(aVar, "frameRetrieverCodecStrategy");
                super();
                this.a = abtl;
                this.b = list;
                this.c = aVar;
                this.d = z;
            }

            public /* synthetic */ b(abtl abtl, List list, defpackage.admm.a aVar, boolean z, int i) {
                if ((i & 2) != 0) {
                    list = ajyl.a(Long.valueOf(0));
                }
                if ((i & 4) != 0) {
                    aVar = defpackage.admm.a.SOFTWARE_FIRST;
                }
                if ((i & 8) != 0) {
                    z = true;
                }
                this(abtl, list, aVar, z);
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (akcr.a(this.a, bVar.a) && akcr.a(this.b, bVar.b) && akcr.a(this.c, bVar.c)) {
                            if ((this.d == bVar.d ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                abtl abtl = this.a;
                int i = 0;
                int hashCode = (abtl != null ? abtl.hashCode() : 0) * 31;
                List list = this.b;
                hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
                defpackage.admm.a aVar = this.c;
                if (aVar != null) {
                    i = aVar.hashCode();
                }
                hashCode = (hashCode + i) * 31;
                i = this.d;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("MediaThumbnailGenerate(resolutionHint=");
                stringBuilder.append(this.a);
                stringBuilder.append(", frameOffsetMsList=");
                stringBuilder.append(this.b);
                stringBuilder.append(", frameRetrieverCodecStrategy=");
                stringBuilder.append(this.c);
                stringBuilder.append(", flattenEdits=");
                stringBuilder.append(this.d);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: vlp$a$c */
        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super();
            }
        }

        /* renamed from: vlp$a$d */
        public static final class d extends a {
            final abtl a;
            final int b;

            public d(abtl abtl, int i) {
                akcr.b(abtl, "resolutionHint");
                super();
                this.a = abtl;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof d) {
                        d dVar = (d) obj;
                        if (akcr.a(this.a, dVar.a)) {
                            if ((this.b == dVar.b ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                abtl abtl = this.a;
                return ((abtl != null ? abtl.hashCode() : 0) * 31) + this.b;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("SendOrPostSnap(resolutionHint=");
                stringBuilder.append(this.a);
                stringBuilder.append(", jpegEncodingQuality=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final vjm a() {
            return this instanceof a ? ((a) this).a : vjm.DEFAULT;
        }
    }

    ajdp<kaz<jwj>> a(idd idd, a aVar, abyi abyi, ajei ajei);

    ajdx<abyi> a(idd idd, a aVar, abyi abyi);
}
