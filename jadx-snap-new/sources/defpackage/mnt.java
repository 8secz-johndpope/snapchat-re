package defpackage;

import com.snap.core.db.record.MessageMediaRefModel;

/* renamed from: mnt */
public interface mnt {

    /* renamed from: mnt$a */
    public static abstract class a {

        /* renamed from: mnt$a$a */
        public static abstract class a extends a {

            /* renamed from: mnt$a$a$a */
            public static final class a extends a {
                private final miq a;
                private final int b;
                private final int c;
                private final mij d;

                public a(miq miq, int i, int i2, mij mij) {
                    akcr.b(miq, MessageMediaRefModel.URI);
                    akcr.b(mij, "rotation");
                    super();
                    this.a = miq;
                    this.b = i;
                    this.c = i2;
                    this.d = mij;
                }

                public final miq a() {
                    return this.a;
                }

                public final int b() {
                    return this.b;
                }

                public final mij c() {
                    return this.d;
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof a) {
                            a aVar = (a) obj;
                            if (akcr.a(this.a, aVar.a)) {
                                if ((this.b == aVar.b ? 1 : null) != null) {
                                    if ((this.c == aVar.c ? 1 : null) == null || !akcr.a(this.d, aVar.d)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    miq miq = this.a;
                    int i = 0;
                    int hashCode = (((((miq != null ? miq.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
                    mij mij = this.d;
                    if (mij != null) {
                        i = mij.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Original(uri=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(", height=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", width=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(", rotation=");
                    stringBuilder.append(this.d);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: mnt$a$a$b */
            public static final class b extends a {
                final mhq a;
                private final miq b;
                private final int c;
                private final int d;
                private final mij e;

                public b(miq miq, int i, int i2, mij mij, mhq mhq) {
                    akcr.b(miq, MessageMediaRefModel.URI);
                    akcr.b(mij, "rotation");
                    akcr.b(mhq, "face");
                    super();
                    this.b = miq;
                    this.c = i;
                    this.d = i2;
                    this.e = mij;
                    this.a = mhq;
                }

                public final miq a() {
                    return this.b;
                }

                public final int b() {
                    return this.c;
                }

                public final mij c() {
                    return this.e;
                }

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof b) {
                            b bVar = (b) obj;
                            if (akcr.a(this.b, bVar.b)) {
                                if ((this.c == bVar.c ? 1 : null) != null) {
                                    if (!((this.d == bVar.d ? 1 : null) != null && akcr.a(this.e, bVar.e) && akcr.a(this.a, bVar.a))) {
                                        return false;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    miq miq = this.b;
                    int i = 0;
                    int hashCode = (((((miq != null ? miq.hashCode() : 0) * 31) + this.c) * 31) + this.d) * 31;
                    mij mij = this.e;
                    hashCode = (hashCode + (mij != null ? mij.hashCode() : 0)) * 31;
                    mhq mhq = this.a;
                    if (mhq != null) {
                        i = mhq.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("WithFace(uri=");
                    stringBuilder.append(this.b);
                    stringBuilder.append(", height=");
                    stringBuilder.append(this.c);
                    stringBuilder.append(", width=");
                    stringBuilder.append(this.d);
                    stringBuilder.append(", rotation=");
                    stringBuilder.append(this.e);
                    stringBuilder.append(", face=");
                    stringBuilder.append(this.a);
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

            public abstract miq a();

            public abstract int b();

            public abstract mij c();
        }

        /* renamed from: mnt$a$b */
        public static final class b extends a {
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
                StringBuilder stringBuilder = new StringBuilder("Preset(index=");
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

    mid<a, ajxw> a();
}
