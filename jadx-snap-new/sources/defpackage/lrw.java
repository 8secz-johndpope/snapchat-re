package defpackage;

import defpackage.mhs.c;

/* renamed from: lrw */
public interface lrw extends ajfb<a> {

    /* renamed from: lrw$a */
    public static abstract class a {
        private final boolean a;
        private final boolean b;
        private final String c;
        private final mhs d;

        /* renamed from: lrw$a$c */
        public static final class c extends a {
            public final boolean a;
            private final String b;
            private final boolean c;

            public c() {
                this(false, false, 3);
            }

            public c(boolean z, boolean z2) {
                super(defpackage.mhs.c.a, (byte) 0);
                this.c = z;
                this.a = z2;
                this.b = "Original Lens";
            }

            public /* synthetic */ c(boolean z, boolean z2, int i) {
                if ((i & 1) != 0) {
                    z = true;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                this(z, z2);
            }

            public final boolean b() {
                return this.c;
            }

            public final String c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof c) {
                        c cVar = (c) obj;
                        if ((this.c == cVar.c ? 1 : null) != null) {
                            if ((this.a == cVar.a ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.c;
                int i2 = 1;
                if (i != 0) {
                    i = 1;
                }
                i *= 31;
                boolean z = this.a;
                if (!z) {
                    i2 = z;
                }
                return i + i2;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Original(visible=");
                stringBuilder.append(this.c);
                stringBuilder.append(", showIcon=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lrw$a$d */
        public static final class d extends a {
            private final String a;
            private final boolean b;
            private final boolean c;

            public d() {
                this(null, false, false, 7);
            }

            private d(String str, boolean z, boolean z2) {
                akcr.b(str, "contentDescription");
                super(c.a, (byte) 0);
                this.a = str;
                this.b = z;
                this.c = z2;
            }

            public /* synthetic */ d(String str, boolean z, boolean z2, int i) {
                if ((i & 1) != 0) {
                    str = "";
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                if ((i & 4) != 0) {
                    z2 = true;
                }
                this(str, z, z2);
            }

            public static /* synthetic */ d a(d dVar, String str, boolean z, boolean z2, int i) {
                Object str2;
                if ((i & 1) != 0) {
                    str2 = dVar.a;
                }
                if ((i & 2) != 0) {
                    z = dVar.b;
                }
                if ((i & 4) != 0) {
                    z2 = dVar.c;
                }
                akcr.b(str2, "contentDescription");
                return new d(str2, z, z2);
            }

            public final boolean a() {
                return this.b;
            }

            public final boolean b() {
                return this.c;
            }

            public final String c() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof d) {
                        d dVar = (d) obj;
                        if (akcr.a(this.a, dVar.a)) {
                            if ((this.b == dVar.b ? 1 : null) != null) {
                                if ((this.c == dVar.c ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                int i = this.b;
                if (i != 0) {
                    i = 1;
                }
                hashCode = (hashCode + i) * 31;
                i = this.c;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Placeholder(contentDescription=");
                stringBuilder.append(this.a);
                stringBuilder.append(", isInLeftSide=");
                stringBuilder.append(this.b);
                stringBuilder.append(", visible=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lrw$a$a */
        public static final class a extends a {
            public final boolean a;
            public final miq b;
            public final ajdp<b> c;
            private final mhs d;
            private final boolean e;
            private final boolean f;
            private final String g;

            public /* synthetic */ a(mhs mhs, boolean z, miq miq, String str, ajdp ajdp) {
                this(mhs, z, true, true, miq, str, ajdp);
            }

            private a(mhs mhs, boolean z, boolean z2, boolean z3, miq miq, String str, ajdp<b> ajdp) {
                akcr.b(mhs, "id");
                akcr.b(miq, "iconUri");
                akcr.b(str, "contentDescription");
                akcr.b(ajdp, "loadingState");
                super(mhs, (byte) 0);
                this.d = mhs;
                this.e = z;
                this.f = z2;
                this.a = z3;
                this.b = miq;
                this.g = str;
                this.c = ajdp;
            }

            public static /* synthetic */ a a(a aVar, mhs mhs, boolean z, boolean z2, boolean z3, miq miq, String str, ajdp ajdp, int i) {
                a aVar2 = aVar;
                mhs mhs2 = (i & 1) != 0 ? aVar2.d : mhs;
                boolean z4 = (i & 2) != 0 ? aVar2.e : z;
                boolean z5 = (i & 4) != 0 ? aVar2.f : z2;
                boolean z6 = (i & 8) != 0 ? aVar2.a : z3;
                miq miq2 = (i & 16) != 0 ? aVar2.b : miq;
                String str2 = (i & 32) != 0 ? aVar2.g : str;
                ajdp ajdp2 = (i & 64) != 0 ? aVar2.c : ajdp;
                akcr.b(mhs2, "id");
                akcr.b(miq2, "iconUri");
                akcr.b(str2, "contentDescription");
                akcr.b(ajdp2, "loadingState");
                return new a(mhs2, z4, z5, z6, miq2, str2, ajdp2);
            }

            public final boolean a() {
                return this.e;
            }

            public final boolean b() {
                return this.f;
            }

            public final String c() {
                return this.g;
            }

            public final mhs d() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                    return false;
                }
                if (obj != null) {
                    a aVar = (a) obj;
                    return (akcr.a(this.d, aVar.d) ^ 1) == 0 && this.e == aVar.e && this.f == aVar.f && this.a == aVar.a && (akcr.a(this.b, aVar.b) ^ 1) == 0 && (akcr.a(this.g, aVar.g) ^ 1) == 0;
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snap.lenses.camera.carousel.CarouselItemView.Model.Lens");
                }
            }

            public final int hashCode() {
                return (((((((((this.d.hashCode() * 31) + Boolean.valueOf(this.e).hashCode()) * 31) + Boolean.valueOf(this.f).hashCode()) * 31) + Boolean.valueOf(this.a).hashCode()) * 31) + this.b.hashCode()) * 31) + this.g.hashCode();
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Lens(id=");
                stringBuilder.append(this.d);
                stringBuilder.append(", isInLeftSide=");
                stringBuilder.append(this.e);
                stringBuilder.append(", visible=");
                stringBuilder.append(this.f);
                stringBuilder.append(", seen=");
                stringBuilder.append(this.a);
                stringBuilder.append(", iconUri=");
                stringBuilder.append(this.b);
                stringBuilder.append(", contentDescription=");
                stringBuilder.append(this.g);
                stringBuilder.append(", loadingState=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lrw$a$b */
        public enum b {
            IDLE,
            IN_PROGRESS,
            DONE
        }

        private a(mhs mhs) {
            this.d = mhs;
            this.b = true;
            this.c = "";
        }

        public /* synthetic */ a(mhs mhs, byte b) {
            this(mhs);
        }

        public boolean a() {
            return this.a;
        }

        public boolean b() {
            return true;
        }

        public String c() {
            return this.c;
        }

        public mhs d() {
            return this.d;
        }
    }
}
