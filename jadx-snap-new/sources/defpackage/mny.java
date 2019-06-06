package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.b;
import defpackage.miq.e;
import java.util.Arrays;

/* renamed from: mny */
public interface mny extends mhu<a, b> {

    /* renamed from: mny$b */
    public static final class b {
        public final lny a;
        public final defpackage.mhs.b b;
        public final mhs c;
        public final defpackage.mhs.b d;
        public final byte[] e;
        public final byte[] f;

        public b(lny lny, defpackage.mhs.b bVar, mhs mhs, defpackage.mhs.b bVar2, byte[] bArr, byte[] bArr2) {
            akcr.b(lny, "assetSource");
            akcr.b(bVar, "assetId");
            akcr.b(mhs, "avatarId");
            akcr.b(bVar2, "effectId");
            this.a = lny;
            this.b = bVar;
            this.c = mhs;
            this.d = bVar2;
            this.e = bArr;
            this.f = bArr2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                return false;
            }
            if (obj != null) {
                b bVar = (b) obj;
                return (akcr.a(this.b, bVar.b) ^ 1) == 0 && (akcr.a(this.c, bVar.c) ^ 1) == 0 && (akcr.a(this.d, bVar.d) ^ 1) == 0 && Arrays.equals(this.e, bVar.e) && Arrays.equals(this.f, bVar.f);
            } else {
                throw new ajxt("null cannot be cast to non-null type com.snap.lenses.core.RemoteAssetsProcessor.RemoteAssetRequest");
            }
        }

        public final int hashCode() {
            int hashCode = ((((this.b.hashCode() * 31) + this.d.hashCode()) * 31) + this.c.hashCode()) * 31;
            byte[] bArr = this.e;
            int i = 0;
            hashCode = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            bArr = this.f;
            if (bArr != null) {
                i = Arrays.hashCode(bArr);
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("RemoteAssetRequest(assetSource=");
            stringBuilder.append(this.a);
            stringBuilder.append(", assetId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", avatarId=");
            stringBuilder.append(this.c);
            stringBuilder.append(", effectId=");
            stringBuilder.append(this.d);
            stringBuilder.append(", encryptionKey=");
            stringBuilder.append(Arrays.toString(this.e));
            stringBuilder.append(", encryptionIv=");
            stringBuilder.append(Arrays.toString(this.f));
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: mny$a */
    public static final class a {
        final lny a;
        final b b;
        final mhs c;
        final b d;
        final e e;

        public a(lny lny, b bVar, mhs mhs, b bVar2, e eVar) {
            akcr.b(lny, "assetSource");
            akcr.b(bVar, "assetId");
            akcr.b(mhs, "avatarId");
            akcr.b(bVar2, DiscoverStorySnapModel.LENSID);
            akcr.b(eVar, "assetUri");
            this.a = lny;
            this.b = bVar;
            this.c = mhs;
            this.d = bVar2;
            this.e = eVar;
        }

        /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x003d;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x003d;
        L_0x0002:
            r0 = r3 instanceof defpackage.mny.a;
            if (r0 == 0) goto L_0x003b;
        L_0x0006:
            r3 = (defpackage.mny.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0026:
            r0 = r2.d;
            r1 = r3.d;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0030:
            r0 = r2.e;
            r3 = r3.e;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x003b;
        L_0x003a:
            goto L_0x003d;
        L_0x003b:
            r3 = 0;
            return r3;
        L_0x003d:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mny$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            lny lny = this.a;
            int i = 0;
            int hashCode = (lny != null ? lny.hashCode() : 0) * 31;
            b bVar = this.b;
            hashCode = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            mhs mhs = this.c;
            hashCode = (hashCode + (mhs != null ? mhs.hashCode() : 0)) * 31;
            bVar = this.d;
            hashCode = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            e eVar = this.e;
            if (eVar != null) {
                i = eVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("RemoteAssetDescriptor(assetSource=");
            stringBuilder.append(this.a);
            stringBuilder.append(", assetId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", avatarId=");
            stringBuilder.append(this.c);
            stringBuilder.append(", lensId=");
            stringBuilder.append(this.d);
            stringBuilder.append(", assetUri=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    ajfb<a> a();

    ajdp<b> b();
}
