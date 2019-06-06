package defpackage;

import android.content.Context;
import com.snap.core.db.api.DbLogger;
import java.security.GeneralSecurityException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ibb */
public final class ibb {
    public final icl a;
    public final String b;
    public final hzx c;
    public final Lock d = this.f.readLock();
    public final Lock e = this.f.writeLock();
    private final ReadWriteLock f = new ReentrantReadWriteLock();
    private final ihh g = new ihl();

    public ibb(Context context, hys hys, String str, String str2, byte[] bArr, icl icl, zgb zgb, gqr gqr, ajwy<hyk> ajwy, DbLogger dbLogger, igb igb) {
        Throwable e;
        hys hys2 = hys;
        String str3 = str2;
        icl icl2 = icl;
        this.b = str3;
        boolean z = icl2 != null;
        try {
            hyr a = hys2.a(hyt.FIDELIUS_ENCRYPTED_FDU_LOAD_LATENCY).a();
            hyr a2 = hys2.a(hyt.FIDELIUS_FDU_WRITABLE_DB_LATENCY).a();
            zfw a3 = zgb.a(hyn.a.callsite("FideliusEncryptedDb"));
            hzr hzr = r8;
            hzr hzr2 = new hzr(context, gqr, zgb, a3.p(), a3.i(), new hzv(str3), this.g, dbLogger, igb);
            hzx hzx;
            try {
                this.c = new hzx(hzr, bArr, ajwy);
                long b = a2.b();
                ((hyk) ajwy.get()).b(a2, z);
                hyr a4 = hys2.a(hyt.FIDELIUS_FDU_USER_IDENTITY_LATENCY).a();
                if (z) {
                    this.a = icl2;
                    hzx = this.c;
                    String str4 = icl2.a;
                    byte[] bArr2 = icl2.b;
                    byte[] bArr3 = icl2.c;
                    hzx.a.throwIfNotDbScheduler();
                    hzx.c.d().a(hzx.h(str4), hzx.a(bArr2), hzx.a(bArr3));
                } else {
                    this.a = this.c.a(str);
                    if (this.a == null) {
                        throw new IllegalArgumentException("userIdentity could not be found on the device.");
                    }
                }
                long b2 = a4.b();
                ((hyk) ajwy.get()).c(a4, z);
                hyr a5 = hys2.a(hyt.FIDELIUS_FDU_SEK_FILTER_LATENCY).a();
                hzx hzx2 = this.c;
                Long valueOf = Long.valueOf(System.currentTimeMillis() - 2678400000L);
                hzx2.a.throwIfNotDbScheduler();
                hzx2.c.b().a(valueOf);
                long b3 = a5.b();
                ((hyk) ajwy.get()).d(a5, z);
                ((hyk) ajwy.get()).a(a, z, b, b2, b3);
            } catch (GeneralSecurityException e2) {
                ((hyk) hzx.d.get()).d(iab.a, abmt.a(e2));
                throw e2;
            } catch (GeneralSecurityException e3) {
                e = e3;
                ((hyk) ajwy.get()).n(abmt.a(e));
                throw new IllegalArgumentException(e);
            }
        } catch (GeneralSecurityException e4) {
            e = e4;
            ajwy<hyk> ajwy2 = ajwy;
            ((hyk) ajwy.get()).n(abmt.a(e));
            throw new IllegalArgumentException(e);
        }
    }

    public final hzx a() {
        return this.c;
    }

    public final Lock b() {
        return this.d;
    }
}
