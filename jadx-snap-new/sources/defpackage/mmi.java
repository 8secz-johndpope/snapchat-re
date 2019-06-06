package defpackage;

import defpackage.mhs.b;
import java.util.Arrays;
import java.util.List;

/* renamed from: mmi */
public interface mmi {

    /* renamed from: mmi$c */
    public static abstract class c {

        /* renamed from: mmi$c$a */
        public static abstract class a extends c {
            public final b a;

            /* renamed from: mmi$c$a$d */
            public static final class d extends a {
                public final b b;

                public d(b bVar) {
                    akcr.b(bVar, "filterInfo");
                    super(bVar.a, (byte) 0);
                    this.b = bVar;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.mmi.c.a.d) r2).b) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.mmi.c.a.d;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.mmi.c.a.d) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mmi$c$a$d.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    b bVar = this.b;
                    return bVar != null ? bVar.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("TurnedOn(filterInfo=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: mmi$c$a$b */
            public static final class b extends a {
                public final b b;

                public b(b bVar) {
                    akcr.b(bVar, "filterInfo");
                    super(bVar.a, (byte) 0);
                    this.b = bVar;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.mmi.c.a.b) r2).b) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.mmi.c.a.b;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.mmi.c.a.b) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mmi$c$a$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    b bVar = this.b;
                    return bVar != null ? bVar.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Loaded(filterInfo=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: mmi$c$a$c */
            public static final class c extends a {
                public final b b;

                public c(b bVar) {
                    akcr.b(bVar, "filterInfo");
                    super(bVar.a, (byte) 0);
                    this.b = bVar;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.mmi.c.a.c) r2).b) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.mmi.c.a.c;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.mmi.c.a.c) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mmi$c$a$c.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    b bVar = this.b;
                    return bVar != null ? bVar.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("TurnedOff(filterInfo=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: mmi$c$a$a */
            public static final class a extends a {
                private final d b;

                public a(d dVar) {
                    akcr.b(dVar, "filterRequest");
                    super(dVar.a, (byte) 0);
                    this.b = dVar;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.mmi.c.a.a) r2).b) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.mmi.c.a.a;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.mmi.c.a.a) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mmi$c$a$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    d dVar = this.b;
                    return dVar != null ? dVar.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Initiated(filterRequest=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private a(b bVar) {
                super();
                this.a = bVar;
            }

            public /* synthetic */ a(b bVar, byte b) {
                this(bVar);
            }
        }

        /* renamed from: mmi$c$b */
        public static final class b extends c {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: mmi$d */
    public static final class d {
        public final b a;
        public final miq b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final miq f;
        public final String g;
        final byte[] h;

        public /* synthetic */ d(b bVar, miq miq, boolean z, miq miq2, String str, byte[] bArr, int i) {
            int i2 = i;
            this(bVar, miq, false, false, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? miq.b.a : miq2, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : bArr);
        }

        public d(b bVar, miq miq, boolean z, boolean z2, boolean z3, miq miq2, String str, byte[] bArr) {
            akcr.b(bVar, "id");
            akcr.b(miq, "contentUri");
            akcr.b(miq2, "overlayImageUri");
            this.a = bVar;
            this.b = miq;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = miq2;
            this.g = str;
            this.h = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                return false;
            }
            if (obj != null) {
                d dVar = (d) obj;
                return (akcr.a(this.a, dVar.a) ^ 1) == 0 && (akcr.a(this.b, dVar.b) ^ 1) == 0 && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && (akcr.a(this.f, dVar.f) ^ 1) == 0 && (akcr.a(this.g, dVar.g) ^ 1) == 0 && Arrays.equals(this.h, dVar.h);
            } else {
                throw new ajxt("null cannot be cast to non-null type com.snap.lenses.core.FilterApplicator.FilterRequest");
            }
        }

        public final int hashCode() {
            int hashCode = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.valueOf(this.c).hashCode()) * 31) + Boolean.valueOf(this.d).hashCode()) * 31) + Boolean.valueOf(this.e).hashCode()) * 31) + this.f.hashCode()) * 31;
            String str = this.g;
            int i = 0;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            byte[] bArr = this.h;
            if (bArr != null) {
                i = Arrays.hashCode(bArr);
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("FilterRequest(id=");
            stringBuilder.append(this.a);
            stringBuilder.append(", contentUri=");
            stringBuilder.append(this.b);
            stringBuilder.append(", thirdParty=");
            stringBuilder.append(this.c);
            stringBuilder.append(", watermark=");
            stringBuilder.append(this.d);
            stringBuilder.append(", async=");
            stringBuilder.append(this.e);
            stringBuilder.append(", overlayImageUri=");
            stringBuilder.append(this.f);
            stringBuilder.append(", configPath=");
            stringBuilder.append(this.g);
            stringBuilder.append(", launchData=");
            stringBuilder.append(Arrays.toString(this.h));
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mmi$b */
    public static final class b {
        public final defpackage.mhs.b a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final List<miq> j;

        public b(defpackage.mhs.b bVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, List<? extends miq> list) {
            akcr.b(bVar, "id");
            akcr.b(list, "presetImages");
            this.a = bVar;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = z5;
            this.g = z6;
            this.h = z7;
            this.i = z8;
            this.j = list;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (akcr.a(this.a, bVar.a)) {
                        if ((this.b == bVar.b ? 1 : null) != null) {
                            if ((this.c == bVar.c ? 1 : null) != null) {
                                if ((this.d == bVar.d ? 1 : null) != null) {
                                    if ((this.e == bVar.e ? 1 : null) != null) {
                                        if ((this.f == bVar.f ? 1 : null) != null) {
                                            if ((this.g == bVar.g ? 1 : null) != null) {
                                                if ((this.h == bVar.h ? 1 : null) != null) {
                                                    if ((this.i == bVar.i ? 1 : null) == null || !akcr.a(this.j, bVar.j)) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            defpackage.mhs.b bVar = this.a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            int i2 = this.b;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.c;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.d;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.e;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.f;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.g;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.h;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            i2 = this.i;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            List list = this.j;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("FilterInfo(id=");
            stringBuilder.append(this.a);
            stringBuilder.append(", supportsTouch=");
            stringBuilder.append(this.b);
            stringBuilder.append(", supportsPresets=");
            stringBuilder.append(this.c);
            stringBuilder.append(", supportsExternalImage=");
            stringBuilder.append(this.d);
            stringBuilder.append(", isFullTouchBlocking=");
            stringBuilder.append(this.e);
            stringBuilder.append(", hasAudioEffect=");
            stringBuilder.append(this.f);
            stringBuilder.append(", hasAudioAnalysis=");
            stringBuilder.append(this.g);
            stringBuilder.append(", isBitmojiRequired=");
            stringBuilder.append(this.h);
            stringBuilder.append(", isRedirectToBitmojiAppRequired=");
            stringBuilder.append(this.i);
            stringBuilder.append(", presetImages=");
            stringBuilder.append(this.j);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mmi$a */
    public static final class a {
        public static ajdp<c> a() {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }
    }

    mid<d, Boolean> a();

    ajdp<c> b();

    mid<Object, Boolean> c();

    mid<Object, Boolean> d();
}
