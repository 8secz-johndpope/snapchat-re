package defpackage;

import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;

/* renamed from: lvh */
public interface lvh extends mhu<a, c> {

    /* renamed from: lvh$a */
    public static abstract class a {

        /* renamed from: lvh$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: lvh$a$b */
        public static final class b extends a {
            final mhs a;

            public b(mhs mhs) {
                akcr.b(mhs, "identifier");
                super();
                this.a = mhs;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lvh.a.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lvh.a.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lvh.a.b) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lvh$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mhs mhs = this.a;
                return mhs != null ? mhs.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("SelectImage(identifier=");
                stringBuilder.append(this.a);
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

    /* renamed from: lvh$b */
    public static final class b {
        final mhs a;
        final miq b;
        final mht c;

        public b(mhs mhs, miq miq, mht mht) {
            akcr.b(mhs, "identifier");
            akcr.b(miq, MessageMediaRefModel.URI);
            akcr.b(mht, "transformation");
            this.a = mhs;
            this.b = miq;
            this.c = mht;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.lvh.b;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.lvh.b) r3;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lvh$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mhs mhs = this.a;
            int i = 0;
            int hashCode = (mhs != null ? mhs.hashCode() : 0) * 31;
            miq miq = this.b;
            hashCode = (hashCode + (miq != null ? miq.hashCode() : 0)) * 31;
            mht mht = this.c;
            if (mht != null) {
                i = mht.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Image(identifier=");
            stringBuilder.append(this.a);
            stringBuilder.append(", uri=");
            stringBuilder.append(this.b);
            stringBuilder.append(", transformation=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: lvh$c */
    public static abstract class c {

        /* renamed from: lvh$c$a */
        public static final class a extends c {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: lvh$c$b */
        public static final class b extends c {
            final int a;

            public b(int i) {
                super();
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof b) {
                        if ((this.a == ((b) obj).a ? 1 : null) != null) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return this.a;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Message(stringId=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lvh$c$c */
        public static abstract class c extends c {

            /* renamed from: lvh$c$c$a */
            public static final class a extends c {
                private final mhs a;
                private final List<b> b;

                public a(mhs mhs, List<b> list) {
                    akcr.b(mhs, "selected");
                    akcr.b(list, "images");
                    super();
                    this.a = mhs;
                    this.b = list;
                }

                public final mhs a() {
                    return this.a;
                }

                public final List<b> b() {
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
                    r0 = r3 instanceof defpackage.lvh.c.c.a;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (defpackage.lvh.c.c.a) r3;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lvh$c$c$a.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    mhs mhs = this.a;
                    int i = 0;
                    int hashCode = (mhs != null ? mhs.hashCode() : 0) * 31;
                    List list = this.b;
                    if (list != null) {
                        i = list.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Idle(selected=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", images=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: lvh$c$c$b */
            public static final class b extends c {
                private final mhs a;
                private final List<b> b;

                public b(mhs mhs, List<b> list) {
                    akcr.b(mhs, "selected");
                    akcr.b(list, "images");
                    super();
                    this.a = mhs;
                    this.b = list;
                }

                public final mhs a() {
                    return this.a;
                }

                public final List<b> b() {
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
                    r0 = r3 instanceof defpackage.lvh.c.c.b;
                    if (r0 == 0) goto L_0x001d;
                L_0x0006:
                    r3 = (defpackage.lvh.c.c.b) r3;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lvh$c$c$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    mhs mhs = this.a;
                    int i = 0;
                    int hashCode = (mhs != null ? mhs.hashCode() : 0) * 31;
                    List list = this.b;
                    if (list != null) {
                        i = list.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Processing(selected=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", images=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private c() {
                super();
            }

            public /* synthetic */ c(byte b) {
                this();
            }

            public abstract mhs a();

            public abstract List<b> b();
        }

        private c() {
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }
}
