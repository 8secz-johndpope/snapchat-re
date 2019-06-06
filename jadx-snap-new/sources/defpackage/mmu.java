package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import java.util.Set;

/* renamed from: mmu */
public final class mmu {
    final Context a;
    final mhk b;
    final zfw c;
    final Supplier<iha> d;
    final mpf e;
    final miw f;
    final boolean g;
    final mka h;
    final mng i;
    final mns j;
    final lnr k;
    final Set<akbl<mmt, mph>> l;
    final mio m;
    final boolean n;
    final mmh o;
    final Supplier<kpc> p;
    final boolean q;
    final boolean r;

    public mmu(Context context, mhk mhk, zfw zfw, Supplier<iha> supplier, mpf mpf, miw miw, boolean z, mka mka, mng mng, mns mns, lnr lnr, Set<? extends akbl<? super mmt, ? extends mph>> set, mio mio, boolean z2, mmh mmh, Supplier<kpc> supplier2, boolean z3, boolean z4) {
        Context context2 = context;
        mhk mhk2 = mhk;
        zfw zfw2 = zfw;
        Supplier<iha> supplier3 = supplier;
        mpf mpf2 = mpf;
        miw miw2 = miw;
        mka mka2 = mka;
        lnr lnr2 = lnr;
        Set<? extends akbl<? super mmt, ? extends mph>> set2 = set;
        mio mio2 = mio;
        mmh mmh2 = mmh;
        Supplier<kpc> supplier4 = supplier2;
        akcr.b(context, "context");
        akcr.b(mhk2, "clock");
        akcr.b(zfw2, "qualifiedSchedulers");
        akcr.b(supplier3, "serializationHelperSupplier");
        akcr.b(mpf2, "trackingDataRepository");
        akcr.b(miw2, "configurationRepository");
        akcr.b(mka2, "coreResourceManager");
        akcr.b(lnr2, "assetUploader");
        akcr.b(set2, "uriDataHandlerFactories");
        akcr.b(mio2, "systemUiElementsPositionProvider");
        akcr.b(mmh2, "fallbackGestureHandler");
        akcr.b(supplier4, "codecLeasingEngineSupplier");
        this.a = context2;
        this.b = mhk2;
        this.c = zfw2;
        this.d = supplier3;
        this.e = mpf2;
        this.f = miw2;
        this.g = z;
        this.h = mka2;
        this.i = mng;
        this.j = mns;
        this.k = lnr2;
        this.l = set2;
        this.m = mio2;
        this.n = z2;
        this.o = mmh2;
        this.p = supplier4;
        this.q = z3;
        this.r = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mmu) {
                mmu mmu = (mmu) obj;
                if (akcr.a(this.a, mmu.a) && akcr.a(this.b, mmu.b) && akcr.a(this.c, mmu.c) && akcr.a(this.d, mmu.d) && akcr.a(this.e, mmu.e) && akcr.a(this.f, mmu.f)) {
                    if ((this.g == mmu.g ? 1 : null) != null && akcr.a(this.h, mmu.h) && akcr.a(this.i, mmu.i) && akcr.a(this.j, mmu.j) && akcr.a(this.k, mmu.k) && akcr.a(this.l, mmu.l) && akcr.a(this.m, mmu.m)) {
                        if ((this.n == mmu.n ? 1 : null) != null && akcr.a(this.o, mmu.o) && akcr.a(this.p, mmu.p)) {
                            if ((this.q == mmu.q ? 1 : null) != null) {
                                if ((this.r == mmu.r ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Context context = this.a;
        int i = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        mhk mhk = this.b;
        hashCode = (hashCode + (mhk != null ? mhk.hashCode() : 0)) * 31;
        zfw zfw = this.c;
        hashCode = (hashCode + (zfw != null ? zfw.hashCode() : 0)) * 31;
        Supplier supplier = this.d;
        hashCode = (hashCode + (supplier != null ? supplier.hashCode() : 0)) * 31;
        mpf mpf = this.e;
        hashCode = (hashCode + (mpf != null ? mpf.hashCode() : 0)) * 31;
        miw miw = this.f;
        hashCode = (hashCode + (miw != null ? miw.hashCode() : 0)) * 31;
        int i2 = this.g;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        mka mka = this.h;
        hashCode = (hashCode + (mka != null ? mka.hashCode() : 0)) * 31;
        mng mng = this.i;
        hashCode = (hashCode + (mng != null ? mng.hashCode() : 0)) * 31;
        mns mns = this.j;
        hashCode = (hashCode + (mns != null ? mns.hashCode() : 0)) * 31;
        lnr lnr = this.k;
        hashCode = (hashCode + (lnr != null ? lnr.hashCode() : 0)) * 31;
        Set set = this.l;
        hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        mio mio = this.m;
        hashCode = (hashCode + (mio != null ? mio.hashCode() : 0)) * 31;
        i2 = this.n;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        mmh mmh = this.o;
        hashCode = (hashCode + (mmh != null ? mmh.hashCode() : 0)) * 31;
        supplier = this.p;
        if (supplier != null) {
            i = supplier.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.q;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.r;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensCoreConfiguration(context=");
        stringBuilder.append(this.a);
        stringBuilder.append(", clock=");
        stringBuilder.append(this.b);
        stringBuilder.append(", qualifiedSchedulers=");
        stringBuilder.append(this.c);
        stringBuilder.append(", serializationHelperSupplier=");
        stringBuilder.append(this.d);
        stringBuilder.append(", trackingDataRepository=");
        stringBuilder.append(this.e);
        stringBuilder.append(", configurationRepository=");
        stringBuilder.append(this.f);
        stringBuilder.append(", preferGmsFaceDetector=");
        stringBuilder.append(this.g);
        stringBuilder.append(", coreResourceManager=");
        stringBuilder.append(this.h);
        stringBuilder.append(", nativeExceptionHandler=");
        stringBuilder.append(this.i);
        stringBuilder.append(", possibleNativeCrashCrumbPicker=");
        stringBuilder.append(this.j);
        stringBuilder.append(", assetUploader=");
        stringBuilder.append(this.k);
        stringBuilder.append(", uriDataHandlerFactories=");
        stringBuilder.append(this.l);
        stringBuilder.append(", systemUiElementsPositionProvider=");
        stringBuilder.append(this.m);
        stringBuilder.append(", enableProfilingSupport=");
        stringBuilder.append(this.n);
        stringBuilder.append(", fallbackGestureHandler=");
        stringBuilder.append(this.o);
        stringBuilder.append(", codecLeasingEngineSupplier=");
        stringBuilder.append(this.p);
        stringBuilder.append(", enableTimestampCorrection=");
        stringBuilder.append(this.q);
        stringBuilder.append(", enableOnlineMotionTrackerByDefault=");
        stringBuilder.append(this.r);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
