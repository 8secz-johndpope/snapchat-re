package defpackage;

import java.util.Date;

/* renamed from: mpl */
public interface mpl extends ajfb<c> {

    /* renamed from: mpl$a */
    public static final class a {
        public static ajdp<b> a() {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }
    }

    /* renamed from: mpl$b */
    public static final class b {
        public static final b a = new b();

        private b() {
        }
    }

    /* renamed from: mpl$c */
    public static final class c {
        final String a;
        final String b;
        final long c;
        final Date d;
        final String e;

        public c(String str, String str2, long j, Date date, String str3) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = date;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (akcr.a(this.a, cVar.a) && akcr.a(this.b, cVar.b)) {
                        if (!((this.c == cVar.c ? 1 : null) != null && akcr.a(this.d, cVar.d) && akcr.a(this.e, cVar.e))) {
                            return false;
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
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            Date date = this.d;
            hashCode = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
            str2 = this.e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Result(userName=");
            stringBuilder.append(this.a);
            stringBuilder.append(", displayName=");
            stringBuilder.append(this.b);
            stringBuilder.append(", score=");
            stringBuilder.append(this.c);
            stringBuilder.append(", birthDate=");
            stringBuilder.append(this.d);
            stringBuilder.append(", countryCode=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    ajdp<b> a();

    void a(c cVar);
}
