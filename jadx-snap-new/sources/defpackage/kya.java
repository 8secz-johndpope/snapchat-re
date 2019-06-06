package defpackage;

import com.google.common.io.BaseEncoding;
import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.c;

/* renamed from: kya */
public final class kya {
    static final kya c = new kya(c.a);
    final mhs a;
    final String b;
    private final ajxe d;

    /* renamed from: kya$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: kya$b */
    static final class b extends akcs implements akbk<algd> {
        private /* synthetic */ kya a;

        b(kya kya) {
            this.a = kya;
            super(0);
        }

        private algd a() {
            algd algd = null;
            if (this.a.b == null) {
                return null;
            }
            try {
                algd = algd.a(BaseEncoding.base64().decode(this.a.b));
            } catch (Exception unused) {
            }
            return algd;
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(kya.class), "snappableMessage", "getSnappableMessage()Lsnapchat/lenses/snappable/nano/SnappableMessage;");
        a aVar = new a();
    }

    private /* synthetic */ kya(mhs mhs) {
        this(mhs, null);
    }

    public kya(mhs mhs, String str) {
        akcr.b(mhs, DiscoverStorySnapModel.LENSID);
        this.a = mhs;
        this.b = str;
        this.d = ajxh.a(new b(this));
    }

    public final algd a() {
        return (algd) this.d.b();
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.kya;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.kya) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kya.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        mhs mhs = this.a;
        int i = 0;
        int hashCode = (mhs != null ? mhs.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensesCameraExternalMetadata(lensId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
