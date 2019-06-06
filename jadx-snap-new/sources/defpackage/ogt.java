package defpackage;

import com.google.common.base.Optional;
import com.snap.core.db.record.StorySyncStateModel;
import defpackage.oha.a;
import defpackage.oha.b;
import defpackage.oha.c;
import defpackage.oha.d;
import java.io.File;
import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.concurrent.Callable;

/* renamed from: ogt */
public final class ogt implements odt {
    private oha a;
    private boolean b;
    private final idd c;
    private final ajwy<oha> d;
    private final ogw e;

    public ogt(idd idd, ajwy<oha> ajwy, ogw ogw) {
        akcr.b(idd, "caller");
        akcr.b(ajwy, "writerProvider");
        akcr.b(ogw, "mediaPackageManager");
        this.c = idd;
        this.d = ajwy;
        this.e = ogw;
    }

    private final synchronized oha f() {
        oha oha;
        oha = this.a;
        if (oha == null) {
            throw new IllegalStateException("Builder is not open.");
        }
        return oha;
    }

    public final synchronized odt a() {
        if (this.a == null) {
            this.a = (oha) this.d.get();
        }
        return this;
    }

    public final odt a(abye abye) {
        akcr.b(abye, "encryption");
        f();
        oha oha = this.a;
        if (oha != null) {
            oha.a(abye);
        }
        return this;
    }

    public final odt a(abyl abyl) {
        akcr.b(abyl, "transformation");
        f();
        oha oha = this.a;
        if (oha != null) {
            oha.a(abyl);
        }
        return this;
    }

    public final odt a(abyo abyo) {
        akcr.b(abyo, "segmentInfo");
        f();
        oha oha = this.a;
        if (oha != null) {
            oha.a(abyo);
        }
        return this;
    }

    public final odt a(abyy abyy) {
        akcr.b(abyy, "edits");
        f();
        oha oha = this.a;
        if (oha != null) {
            oha = oha.e();
            if (oha != null) {
                oha.c = abyy;
            }
        }
        return this;
    }

    public final odt a(aeew aeew) {
        akcr.b(aeew, StorySyncStateModel.METADATA);
        f();
        oha oha = this.a;
        if (oha != null) {
            oha.a(aeew);
        }
        return this;
    }

    public final odt a(Map<Integer, ? extends kaz<jwj>> map) {
        f();
        if (map == null) {
            return this;
        }
        oha oha = this.a;
        if (oha != null) {
            NavigableMap navigableMap = oha.b;
            for (Entry entry : map.entrySet()) {
                navigableMap.put(Integer.valueOf(((Number) entry.getKey()).intValue()), ((kaz) entry.getValue()).a("MediaPackageManagerImpl"));
            }
        }
        return this;
    }

    public final synchronized odt a(kaz<jwj> kaz, ohy ohy) {
        akcr.b(kaz, "bitmap");
        akcr.b(ohy, "tag");
        f();
        oha oha = this.a;
        if (oha != null) {
            oha = oha.e();
            if (oha != null) {
                Map map = oha.a;
                idd idd = this.c;
                Object a = kaz.a("MediaPackageManagerImpl");
                akcr.a(a, "bitmap.clone(TAG)");
                map.put(ohy, new ohx(idd, a, ohy));
            }
        }
        return this;
    }

    public final odt a(ohz ohz) {
        akcr.b(ohz, "overlayBlob");
        f();
        oha oha = this.a;
        if (oha != null) {
            oha = oha.e();
            if (oha != null) {
                Map map = oha.a;
                for (ohx ohx : ohz.a.values()) {
                    map.put(ohx.d, ohx.a(this.c));
                }
            }
        }
        return this;
    }

    public final odt a(boolean z) {
        f();
        oha oha = this.a;
        if (oha != null) {
            oha.h = z;
        }
        return this;
    }

    public final File b() {
        Object c = f().f().c();
        akcr.a(c, "writer.editMedia().dirtyFile");
        return c;
    }

    public final OutputStream c() {
        Object d = f().f().d();
        akcr.a(d, "writer.editMedia().newOutputStream()");
        return (OutputStream) d;
    }

    public final synchronized void close() {
        oha oha = this.a;
        if (!(oha == null || oha.e)) {
            oha.m();
        }
        this.a = null;
    }

    public final odt d() {
        f();
        this.b = true;
        return this;
    }

    public final synchronized abyi e() {
        abyi k;
        oha f = f();
        abmr.b();
        Object ogv = new ogv(f.c(), f.d(), this.c, this.e.g);
        synchronized (this.e.a) {
            if (this.b) {
                f.e = true;
                ajdx c = ajdx.c((Callable) new a(f));
                akcr.a((Object) c, "Single.fromCallable {\n  …        write()\n        }");
                f.g = igs.a(c, (akbl) new b(f)).b(f.j).a((ajfb) new c(f), (ajfb) new d(f));
                k = f.k();
                this.e.e.put(k.b, f);
            } else if (f.h) {
                StringBuilder stringBuilder = new StringBuilder("[");
                stringBuilder.append(this.c);
                stringBuilder.append("]: A recoverable media package that is recoverable must be persisted asynchronously");
                throw new IllegalStateException(stringBuilder.toString());
            } else {
                try {
                    k = f.l();
                } finally {
                    f.m();
                }
            }
        }
        synchronized (this.e.a) {
            Object obj = ((Optional) this.e.a(this.c, k.a, ajyl.a(k), true).b()).get();
            if (obj != null) {
                ohs ohs = (ohs) obj;
                if (ohs != null) {
                    ohs.a.add((ieo) ogv);
                } else {
                    throw new IllegalArgumentException("Failed to create new session");
                }
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.media.manager.model.MediaPackageSessionImpl");
        }
        close();
        return k;
    }
}
