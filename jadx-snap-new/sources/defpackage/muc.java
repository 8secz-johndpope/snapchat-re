package defpackage;

import defpackage.mhs.b;

/* renamed from: muc */
public final class muc {
    public final b a;
    public final miq b;
    public final String c;
    public final b d;
    public final a e;
    private final int f;
    private final String g;

    /* renamed from: muc$b */
    public enum b {
        BITMOJI,
        BITMOJI_LIST,
        ASSET,
        BITMOJI_3D,
        AVATAR_ASSET,
        UNRECOGNIZED;
        
        public static final a Companion = null;

        /* renamed from: muc$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public static b a(String str) {
                akcr.b(str, "name");
                if (akgb.a(str, "bitmoji_3_d", true)) {
                    return b.BITMOJI_3D;
                }
                for (b bVar : b.values()) {
                    if (akgb.a(bVar.name(), str, true)) {
                        break;
                    }
                }
                b bVar2 = null;
                if (bVar2 == null) {
                    bVar2 = b.UNRECOGNIZED;
                }
                return bVar2;
            }
        }

        static {
            Companion = new a();
        }
    }

    /* renamed from: muc$a */
    public enum a {
        REQUESTED,
        REQUIRED,
        PRELOAD,
        ON_DEMAND,
        UNRECOGNIZED;
        
        public static final a Companion = null;

        /* renamed from: muc$a$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public static a a(String str) {
                akcr.b(str, "name");
                for (a aVar : a.values()) {
                    if (akgb.a(aVar.name(), str, true)) {
                        break;
                    }
                }
                a aVar2 = null;
                return aVar2 == null ? a.UNRECOGNIZED : aVar2;
            }
        }

        static {
            Companion = new a();
        }
    }

    public muc(b bVar, miq miq, String str, b bVar2, a aVar, int i, String str2) {
        akcr.b(bVar, "id");
        akcr.b(miq, "assetUri");
        akcr.b(bVar2, "type");
        akcr.b(aVar, "requestTiming");
        this.a = bVar;
        this.b = miq;
        this.c = str;
        this.d = bVar2;
        this.e = aVar;
        this.f = i;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof muc) {
                muc muc = (muc) obj;
                if (akcr.a(this.a, muc.a) && akcr.a(this.b, muc.b) && akcr.a(this.c, muc.c) && akcr.a(this.d, muc.d) && akcr.a(this.e, muc.e)) {
                    if ((this.f == muc.f ? 1 : null) == null || !akcr.a(this.g, muc.g)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        miq miq = this.b;
        hashCode = (hashCode + (miq != null ? miq.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        b bVar2 = this.d;
        hashCode = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        a aVar = this.e;
        hashCode = (((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f) * 31;
        str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AssetsManifestItem(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", assetUri=");
        stringBuilder.append(this.b);
        stringBuilder.append(", contentSignature=");
        stringBuilder.append(this.c);
        stringBuilder.append(", type=");
        stringBuilder.append(this.d);
        stringBuilder.append(", requestTiming=");
        stringBuilder.append(this.e);
        stringBuilder.append(", scale=");
        stringBuilder.append(this.f);
        stringBuilder.append(", originalFilename=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
