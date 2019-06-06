package defpackage;

/* renamed from: mud */
public final class mud {
    static final mud d = new mud();
    public final String a;
    public final String b;
    public final boolean c;
    private final boolean e;

    /* renamed from: mud$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    private /* synthetic */ mud() {
        this(null, null, false, false);
    }

    public mud(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mud) {
                mud mud = (mud) obj;
                if (akcr.a(this.a, mud.a) && akcr.a(this.b, mud.b)) {
                    if ((this.c == mud.c ? 1 : null) != null) {
                        if ((this.e == mud.e ? 1 : null) != null) {
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
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.c;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.e;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CommunityInfo(creatorUsername=");
        stringBuilder.append(this.a);
        stringBuilder.append(", scannableData=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isStudioPreview=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isThirdParty=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
