package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.vse.b;
import defpackage.vse.c;

/* renamed from: vpl */
public interface vpl {

    /* renamed from: vpl$a */
    public static abstract class a {

        /* renamed from: vpl$a$a */
        public static abstract class a extends a {

            /* renamed from: vpl$a$a$a */
            public static final class a extends a {
                public final b a;
                public final boolean b;
                public final aenr c;

                private a(b bVar) {
                    akcr.b(bVar, "id");
                    super();
                    this.a = bVar;
                    this.b = true;
                    this.c = null;
                }

                public /* synthetic */ a(b bVar, byte b) {
                    this(bVar);
                }

                /* JADX WARNING: Missing block: B:6:0x0017, code skipped:
            if (defpackage.akcr.a(null, null) != false) goto L_0x001c;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x001c;
                L_0x0002:
                    r0 = r2 instanceof defpackage.vpl.a.a.a;
                    if (r0 == 0) goto L_0x001a;
                L_0x0006:
                    r2 = (defpackage.vpl.a.a.a) r2;
                    r0 = r1.a;
                    r2 = r2.a;
                    r2 = defpackage.akcr.a(r0, r2);
                    if (r2 == 0) goto L_0x001a;
                L_0x0012:
                    r2 = 0;
                    r2 = defpackage.akcr.a(r2, r2);
                    if (r2 == 0) goto L_0x001a;
                L_0x0019:
                    goto L_0x001c;
                L_0x001a:
                    r2 = 0;
                    return r2;
                L_0x001c:
                    r2 = 1;
                    return r2;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vpl$a$a$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    b bVar = this.a;
                    return (((bVar != null ? bVar.hashCode() : 0) * 31) + 1) * 31;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("ById(id=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", forceSync=true");
                    stringBuilder.append(", response=");
                    stringBuilder.append(null);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: vpl$a$a$b */
            public static final class b extends a {
                public final defpackage.vse.b a;
                public final int b;

                public b(defpackage.vse.b bVar, int i) {
                    akcr.b(bVar, "uuid");
                    super();
                    this.a = bVar;
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof b) {
                            b bVar = (b) obj;
                            if (akcr.a(this.a, bVar.a)) {
                                if ((this.b == bVar.b ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    defpackage.vse.b bVar = this.a;
                    return ((bVar != null ? bVar.hashCode() : 0) * 31) + this.b;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("ByUuid(uuid=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", metadata=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private a() {
                super();
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: vpl$b */
    public static abstract class b {

        /* renamed from: vpl$b$a */
        public static abstract class a extends b {

            /* renamed from: vpl$b$a$a */
            public static final class a extends a {
                public final defpackage.vse.b a;
                public final vse b;

                public /* synthetic */ a(defpackage.vse.b bVar) {
                    this(bVar, c.a);
                }

                private a(defpackage.vse.b bVar, vse vse) {
                    akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                    akcr.b(vse, "scannableId");
                    super();
                    this.a = bVar;
                    this.b = vse;
                }

                /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
                public final boolean equals(java.lang.Object r3) {
                    /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f;
                L_0x0002:
                    r0 = r3 instanceof defpackage.vpl.b.a.a;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (defpackage.vpl.b.a.a) r3;
                    r0 = r2.a;
                    r1 = r3.a;
                    r0 = defpackage.akcr.a(r0, r1);
                    if (r0 == 0) goto L_0x001d;
                L_0x0012:
                    r0 = r2.b;
                    r3 = r3.b;
                    r3 = defpackage.akcr.a(r0, r3);
                    if (r3 == 0) goto L_0x001d;
                L_0x001c:
                    goto L_0x001f;
                L_0x001d:
                    r3 = 0;
                    return r3;
                L_0x001f:
                    r3 = 1;
                    return r3;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vpl$b$a$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    defpackage.vse.b bVar = this.a;
                    int i = 0;
                    int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                    vse vse = this.b;
                    if (vse != null) {
                        i = vse.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Lens(lensId=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", scannableId=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
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

    ajdj<b> a(a aVar);
}
