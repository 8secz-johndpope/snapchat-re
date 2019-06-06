package defpackage;

/* renamed from: mjf */
public interface mjf {

    /* renamed from: mjf$a */
    public static final class a {
        public static ajdp<b> a() {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }
    }

    /* renamed from: mjf$b */
    public static abstract class b {

        /* renamed from: mjf$b$a */
        public static final class a extends b {
            public final String a;
            public final int b;
            public final String c;
            public final int d;
            public final boolean e;
            private final int f;
            private final double g;
            private final double h;

            public a(String str, int i, int i2, double d, double d2, String str2, int i3, boolean z) {
                akcr.b(str, "interactionName");
                akcr.b(str2, "interactionValue");
                super();
                this.a = str;
                this.b = i;
                this.f = i2;
                this.g = d;
                this.h = d2;
                this.c = str2;
                this.d = i3;
                this.e = z;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (akcr.a(this.a, aVar.a)) {
                            if ((this.b == aVar.b ? 1 : null) != null) {
                                if ((this.f == aVar.f ? 1 : null) != null && Double.compare(this.g, aVar.g) == 0 && Double.compare(this.h, aVar.h) == 0 && akcr.a(this.c, aVar.c)) {
                                    if ((this.d == aVar.d ? 1 : null) != null) {
                                        if ((this.e == aVar.e ? 1 : null) != null) {
                                            return true;
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
                String str = this.a;
                int i = 0;
                int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.f) * 31;
                long doubleToLongBits = Double.doubleToLongBits(this.g);
                hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
                doubleToLongBits = Double.doubleToLongBits(this.h);
                hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
                String str2 = this.c;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                hashCode = (((hashCode + i) * 31) + this.d) * 31;
                i = this.e;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("CoreEvent(interactionName=");
                stringBuilder.append(this.a);
                stringBuilder.append(", count=");
                stringBuilder.append(this.b);
                stringBuilder.append(", maxTimeCount=");
                stringBuilder.append(this.f);
                stringBuilder.append(", totalTime=");
                stringBuilder.append(this.g);
                stringBuilder.append(", maxTime=");
                stringBuilder.append(this.h);
                stringBuilder.append(", interactionValue=");
                stringBuilder.append(this.c);
                stringBuilder.append(", sequence=");
                stringBuilder.append(this.d);
                stringBuilder.append(", isFrontFacedCamera=");
                stringBuilder.append(this.e);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    ajdp<b> a();
}
