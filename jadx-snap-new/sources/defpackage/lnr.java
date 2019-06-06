package defpackage;

import defpackage.miq.c.a;
import java.util.Arrays;

/* renamed from: lnr */
public interface lnr {

    /* renamed from: lnr$a */
    public static final class a implements lnr {
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

    /* renamed from: lnr$b */
    public static final class b {
        public final String a;
        public final a b;
        public final byte[] c;
        public final byte[] d;
        public final boolean e;

        public b(String str, a aVar, byte[] bArr, byte[] bArr2, boolean z) {
            akcr.b(str, "uuid");
            akcr.b(aVar, "assetsFile");
            akcr.b(bArr, "encryptionKey");
            akcr.b(bArr2, "encryptionIv");
            this.a = str;
            this.b = aVar;
            this.c = bArr;
            this.d = bArr2;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (akcr.a(this.a, bVar.a) && akcr.a(this.b, bVar.b) && akcr.a(this.c, bVar.c) && akcr.a(this.d, bVar.d)) {
                        if ((this.e == bVar.e ? 1 : null) != null) {
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
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            a aVar = this.b;
            hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            byte[] bArr = this.c;
            hashCode = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            bArr = this.d;
            if (bArr != null) {
                i = Arrays.hashCode(bArr);
            }
            hashCode = (hashCode + i) * 31;
            i = this.e;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Request(uuid=");
            stringBuilder.append(this.a);
            stringBuilder.append(", assetsFile=");
            stringBuilder.append(this.b);
            stringBuilder.append(", encryptionKey=");
            stringBuilder.append(Arrays.toString(this.c));
            stringBuilder.append(", encryptionIv=");
            stringBuilder.append(Arrays.toString(this.d));
            stringBuilder.append(", deleteAfterUploading=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    ajcx a(b bVar);
}
