package defpackage;

import java.util.Locale;

/* renamed from: kqj */
public final class kqj {
    static final kqj c = new kqj("", 0);
    public final String a;
    final long b;

    /* renamed from: kqj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static kqj a() {
            Object uuid = abpu.a().toString();
            akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
            Object obj = Locale.US;
            akcr.a(obj, "Locale.US");
            if (uuid != null) {
                uuid = uuid.toUpperCase(obj);
                akcr.a(uuid, "(this as java.lang.String).toUpperCase(locale)");
                return new kqj(uuid, 0);
            }
            throw new ajxt("null cannot be cast to non-null type java.lang.String");
        }
    }

    static {
        a aVar = new a();
    }

    public kqj(String str, long j) {
        akcr.b(str, "sessionId");
        this.a = str;
        this.b = j;
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('~');
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kqj) {
                kqj kqj = (kqj) obj;
                if (akcr.a(this.a, kqj.a)) {
                    if ((this.b == kqj.b ? 1 : null) != null) {
                        return true;
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
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnalyticsSessionIdentifier(sessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", previewOpenedCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
