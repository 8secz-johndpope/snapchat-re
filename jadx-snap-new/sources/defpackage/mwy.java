package defpackage;

import defpackage.mhs.c;

/* renamed from: mwy */
public interface mwy {

    /* renamed from: mwy$a */
    public static final class a implements mwy {
        public static final a a = new a();

        private a() {
        }

        public final ajcx a(b bVar) {
            akcr.b(bVar, "request");
            Object a = ajvo.a(ajhn.a);
            akcr.a(a, "Completable.complete()");
            return a;
        }
    }

    /* renamed from: mwy$b */
    public static final class b {
        public final miq a;
        public final String b;
        public final mhs c;
        public final String d;
        public final mhs e;
        public final boolean f;
        public final String g;
        public final ajev h;

        /* renamed from: mwy$b$1 */
        static final class 1 implements ajev {
            public static final 1 a = new 1();

            1() {
            }

            public final void run() {
            }
        }

        public b() {
            this(null, null, null, null, null, false, null, null, 255);
        }

        private b(miq miq, String str, mhs mhs, String str2, mhs mhs2, boolean z, String str3, ajev ajev) {
            akcr.b(miq, "iconUri");
            akcr.b(mhs, "fallbackHeaderTextId");
            akcr.b(mhs2, "fallbackDescriptionTextId");
            akcr.b(ajev, "confirmButtonAction");
            this.a = miq;
            this.b = str;
            this.c = mhs;
            this.d = str2;
            this.e = mhs2;
            this.f = z;
            this.g = str3;
            this.h = ajev;
        }

        public /* synthetic */ b(miq miq, String str, mhs mhs, String str2, mhs mhs2, boolean z, String str3, ajev ajev, int i) {
            int i2 = i;
            miq miq2 = (i2 & 1) != 0 ? defpackage.miq.b.a : miq;
            String str4 = null;
            String str5 = (i2 & 2) != 0 ? null : str;
            mhs mhs3 = (i2 & 4) != 0 ? c.a : mhs;
            String str6 = (i2 & 8) != 0 ? null : str2;
            mhs mhs4 = (i2 & 16) != 0 ? c.a : mhs2;
            boolean z2 = (i2 & 32) != 0 ? false : z;
            if ((i2 & 64) == 0) {
                str4 = str3;
            }
            this(miq2, str5, mhs3, str6, mhs4, z2, str4, (i2 & 128) != 0 ? 1.a : ajev);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (akcr.a(this.a, bVar.a) && akcr.a(this.b, bVar.b) && akcr.a(this.c, bVar.c) && akcr.a(this.d, bVar.d) && akcr.a(this.e, bVar.e)) {
                        if (!((this.f == bVar.f ? 1 : null) != null && akcr.a(this.g, bVar.g) && akcr.a(this.h, bVar.h))) {
                            return false;
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
            int hashCode = (miq != null ? miq.hashCode() : 0) * 31;
            String str = this.b;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            mhs mhs = this.c;
            hashCode = (hashCode + (mhs != null ? mhs.hashCode() : 0)) * 31;
            str = this.d;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            mhs = this.e;
            hashCode = (hashCode + (mhs != null ? mhs.hashCode() : 0)) * 31;
            int i2 = this.f;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            str = this.g;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            ajev ajev = this.h;
            if (ajev != null) {
                i = ajev.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Request(iconUri=");
            stringBuilder.append(this.a);
            stringBuilder.append(", headerText=");
            stringBuilder.append(this.b);
            stringBuilder.append(", fallbackHeaderTextId=");
            stringBuilder.append(this.c);
            stringBuilder.append(", descriptionText=");
            stringBuilder.append(this.d);
            stringBuilder.append(", fallbackDescriptionTextId=");
            stringBuilder.append(this.e);
            stringBuilder.append(", withCancelButton=");
            stringBuilder.append(this.f);
            stringBuilder.append(", confirmButtonCustomText=");
            stringBuilder.append(this.g);
            stringBuilder.append(", confirmButtonAction=");
            stringBuilder.append(this.h);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    ajcx a(b bVar);
}
