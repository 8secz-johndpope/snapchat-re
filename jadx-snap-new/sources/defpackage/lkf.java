package defpackage;

import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.mmf.b;
import defpackage.mov.a;
import defpackage.mov.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lkf */
public final class lkf extends adii implements ajdt<mmt> {
    private final Supplier<mmf> a;
    private final ajws<mmt> b;
    private final ajei e = new ajei();
    private adic f;
    private adne g;
    private adnw h;
    private adie i;
    private adie j;
    private mmf k = b.a;
    private adie l = new adie();

    public lkf(Supplier<mmf> supplier) {
        akcr.b(supplier, "lensCoreSupplier");
        Object r = new ajwl().r();
        akcr.a(r, "BehaviorSubject.create<LensCore>().toSerialized()");
        this.b = r;
        this.a = supplier;
    }

    private final ajdp<mmt> g() {
        if (this.k.isDisposed()) {
            Object obj = (mmf) this.a.get();
            akcr.a(obj, "it");
            this.k = obj;
            this.b.a(obj);
        }
        return this.b;
    }

    public final adie a(adie adie, adie adie2) {
        return this.l;
    }

    public final void a(int i, int i2, adic adic) {
        akcr.b(adic, "inputTextureType");
        super.a(i, i2, adic);
        Object adnw = new adnw(i, i2);
        Object obj = this.h;
        if (obj == null) {
            akcr.a("processingSize");
        }
        if (akcr.a(adnw, obj)) {
            i = adic.a();
            adic adic2 = this.f;
            if (adic2 == null) {
                akcr.a("textureType");
            }
            if (i == adic2.a()) {
                return;
            }
        }
        if (!this.k.isDisposed()) {
            this.k.dispose();
            this.e.a();
        }
        this.f = adic;
        this.h = adnw;
    }

    public final void a(int i, long j, adie adie, adhu adhu) {
        ajxw ajxw;
        adie adie2;
        adne adne;
        akcr.b(adie, "texCoordTransformationMatrix");
        akcr.b(adhu, "outputSurfaceProperties");
        mmf mmf = this.k;
        String str = "dirtyVideoFlag";
        if (mmf.isDisposed()) {
            ajxw = null;
        } else {
            mmt mmt = mmf;
            adic adic = this.f;
            if (adic == null) {
                akcr.a("textureType");
            }
            int a = adic.a();
            long j2 = j * 1000;
            Object a2 = adie.a();
            akcr.a(a2, "texCoordTransformationMatrix.floats");
            adie2 = this.i;
            if (adie2 == null) {
                akcr.a("quadTransform");
            }
            Object a3 = adie2.a();
            akcr.a(a3, "quadTransform.floats");
            adnw adnw = this.h;
            String str2 = "processingSize";
            if (adnw == null) {
                akcr.a(str2);
            }
            int i2 = adnw.a;
            adnw adnw2 = this.h;
            if (adnw2 == null) {
                akcr.a(str2);
            }
            a a4 = mox.a(i, a, j2, a2, a3, i2, adnw2.b, adhu.a(), adhu.b(), 41.0f, MapboxConstants.MINIMUM_ZOOM, 0, true, mov.b.PREVIEW);
            mmt.r().a().a(a4);
            a4.o();
            i2 = ((Number) mmt.r().b().a(new ajxm(Integer.valueOf(0), Boolean.FALSE))).intValue();
            Object a5 = new adie().a();
            akcr.a(a5, "TransformationMatrix().floats");
            c a6 = moz.a(0, a5, false, false);
            mmt.r().c().a(a6);
            this.l = new adie(a6.b());
            adhu.c();
            super.a(i2, j, new adie(), adhu);
            a6.e();
            adne = this.g;
            if (adne == null) {
                akcr.a(str);
            }
            adne.a();
            ajxw = ajxw.a;
        }
        if (ajxw == null) {
            lkf lkf = this;
            adhu.c();
            adie2 = lkf.j;
            if (adie2 == null) {
                akcr.a("defaultTransformationMatrix");
            }
            lkf.l = adie2;
            super.a(i, j, adie, adhu);
            adne = lkf.g;
            if (adne == null) {
                akcr.a(str);
            }
            adne.a();
        }
    }

    public final void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        akcr.b(adie, "inputTransformationMatrix");
        akcr.b(adie2, "outputTransformationMatrix");
        akcr.b(adic, "inputTextureType");
        akcr.b(adhz, "shaderCache");
        super.a(adie, adie2, i, i2, adic, adne, adhz);
        if (adne == null) {
            adne = new adne(new AtomicBoolean(false));
        }
        this.g = adne;
        this.h = i > i2 ? new adnw(i2, i) : new adnw(i, i2);
        this.f = adic;
        Object c = new adie().a(adie).a(adie2).c();
        akcr.a(c, "TransformationMatrix()\n …          .flipVertical()");
        this.i = c;
        Object a = adie.clone().a(adie2);
        akcr.a(a, "inputTransformationMatri…tputTransformationMatrix)");
        this.j = a;
        if (this.b.n()) {
            g();
        }
    }

    public final void a(ajdv<? super mmt> ajdv) {
        akcr.b(ajdv, "observer");
        g().a((ajdv) ajdv);
    }

    public final void e() {
        super.e();
        if (!this.k.isDisposed()) {
            this.k.dispose();
            this.e.a();
        }
    }
}
