package defpackage;

import defpackage.adiu.a;
import defpackage.adiu.b;
import java.nio.ByteBuffer;

/* renamed from: txq */
public final class txq implements b {
    adne a;
    private final ajws<txr> b;
    private ByteBuffer c;

    /* renamed from: txq$a */
    static final class a<T> implements ajfb<ajej> {
        private /* synthetic */ txq a;

        a(txq txq) {
            this.a = txq;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (this.a.a != null) {
                adne adne = this.a.a;
                if (adne == null) {
                    akcr.a("dirtyVideoFlag");
                }
                adne.a();
            }
        }
    }

    public txq() {
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.b = (ajws) ajwo;
    }

    public final ajdp<txr> a() {
        Object e = this.b.e((ajfb) new a(this));
        akcr.a(e, "subject.doOnSubscribe {\n…deoFlag.markDirty()\n    }");
        return e;
    }

    /* JADX WARNING: Missing block: B:7:0x0018, code skipped:
            if (r3.capacity() != r2) goto L_0x001a;
     */
    public final java.nio.ByteBuffer a(int r2, int r3) {
        /*
        r1 = this;
        r0 = r1.b;
        r0 = r0.n();
        if (r0 == 0) goto L_0x002c;
    L_0x0008:
        r2 = r2 * r3;
        r2 = r2 << 2;
        r3 = r1.c;
        if (r3 == 0) goto L_0x001a;
    L_0x000f:
        if (r3 != 0) goto L_0x0014;
    L_0x0011:
        defpackage.akcr.a();
    L_0x0014:
        r3 = r3.capacity();
        if (r3 == r2) goto L_0x0020;
    L_0x001a:
        r2 = java.nio.ByteBuffer.allocate(r2);
        r1.c = r2;
    L_0x0020:
        r2 = r1.c;
        if (r2 != 0) goto L_0x0027;
    L_0x0024:
        defpackage.akcr.a();
    L_0x0027:
        r3 = 0;
        r2.position(r3);
        goto L_0x002f;
    L_0x002c:
        r2 = 0;
        r1.c = r2;
    L_0x002f:
        r2 = r1.c;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txq.a(int, int):java.nio.ByteBuffer");
    }

    public final void a(long j, a aVar) {
        akcr.b(aVar, "framePixels");
        this.b.a((Object) new txr(aVar, j));
    }

    public final void a(adne adne) {
        if (adne != null) {
            this.a = adne;
        }
    }
}
