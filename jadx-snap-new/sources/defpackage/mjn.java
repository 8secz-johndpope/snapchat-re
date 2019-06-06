package defpackage;

import com.looksery.sdk.ProfilingSessionReceiver;
import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.b;

/* renamed from: mjn */
public interface mjn {

    /* renamed from: mjn$a */
    public static abstract class a {

        /* renamed from: mjn$a$a */
        public static final class a extends a {
            final b a;
            final c b;

            public a(b bVar, c cVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                akcr.b(cVar, "interfaceControl");
                super();
                this.a = bVar;
                this.b = cVar;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mjn.a.a;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mjn.a.a) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mjn$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                c cVar = this.b;
                if (cVar != null) {
                    i = cVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Trigger(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", interfaceControl=");
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
    }

    /* renamed from: mjn$b */
    public static final class b {
        public static ajdp<d> a() {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }
    }

    /* renamed from: mjn$c */
    public static abstract class c {

        /* renamed from: mjn$c$a */
        public static final class a extends c {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: mjn$c$b */
        public static final class b extends c {
            public final a a;

            /* renamed from: mjn$c$b$a */
            public enum a {
                ORIGINALS,
                FACES
            }

            public b(a aVar) {
                akcr.b(aVar, ProfilingSessionReceiver.EXTRA_STRING_FIELD_MODE);
                super();
                this.a = aVar;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mjn.c.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.mjn.c.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.mjn.c.b) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mjn$c$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                a aVar = this.a;
                return aVar != null ? aVar.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ImagePicker(mode=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mjn$c$c */
        public static final class c extends c {
            public static final c a = new c();

            private c() {
                super();
            }
        }

        /* renamed from: mjn$c$d */
        public static final class d extends c {
            public final String a;
            public final String b;

            public d(String str, String str2) {
                akcr.b(str, "headerId");
                akcr.b(str2, "descriptionId");
                super();
                this.a = str;
                this.b = str2;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mjn.c.d;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mjn.c.d) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mjn$c$d.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.b;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ModalDialog(headerId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", descriptionId=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mjn$c$e */
        public static final class e extends c {
            public final boolean a;

            public e(boolean z) {
                super();
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof e) {
                        if ((this.a == ((e) obj).a ? 1 : null) != null) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                boolean z = this.a;
                return z ? 1 : z;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Screen(dimmingEnabled=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mjn$c$f */
        public static final class f extends c {
            public static final f a = new f();

            private f() {
                super();
            }
        }

        /* renamed from: mjn$c$g */
        public static final class g extends c {
            public static final g a = new g();

            private g() {
                super();
            }
        }

        /* renamed from: mjn$c$h */
        public static final class h extends c {
            public static final h a = new h();

            private h() {
                super();
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: mjn$d */
    public static abstract class d {

        /* renamed from: mjn$d$a */
        public static final class a extends d {
            private final b a;
            private final c b;

            public a(b bVar, c cVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                akcr.b(cVar, "interfaceControl");
                super();
                this.a = bVar;
                this.b = cVar;
            }

            public final b a() {
                return this.a;
            }

            public final c b() {
                return this.b;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mjn.d.a;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mjn.d.a) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mjn$d$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                c cVar = this.b;
                if (cVar != null) {
                    i = cVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Hide(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", interfaceControl=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mjn$d$b */
        public static final class b extends d {
            private final defpackage.mhs.b a;
            private final c b;

            public b(defpackage.mhs.b bVar, c cVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                akcr.b(cVar, "interfaceControl");
                super();
                this.a = bVar;
                this.b = cVar;
            }

            public final defpackage.mhs.b a() {
                return this.a;
            }

            public final c b() {
                return this.b;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mjn.d.b;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mjn.d.b) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mjn$d$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                defpackage.mhs.b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                c cVar = this.b;
                if (cVar != null) {
                    i = cVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Show(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", interfaceControl=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: mjn$d$c */
        public static final class c extends d {
            private final b a;
            private final c b;

            public c(b bVar, c cVar) {
                akcr.b(bVar, DiscoverStorySnapModel.LENSID);
                akcr.b(cVar, "interfaceControl");
                super();
                this.a = bVar;
                this.b = cVar;
            }

            public final b a() {
                return this.a;
            }

            public final c b() {
                return this.b;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.mjn.d.c;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.mjn.d.c) r3;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mjn$d$c.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                b bVar = this.a;
                int i = 0;
                int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
                c cVar = this.b;
                if (cVar != null) {
                    i = cVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Trigger(lensId=");
                stringBuilder.append(this.a);
                stringBuilder.append(", interfaceControl=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private d() {
        }

        public /* synthetic */ d(byte b) {
            this();
        }

        public abstract b a();

        public abstract c b();
    }

    ajdp<d> a();

    mid<a, ajxw> b();
}
