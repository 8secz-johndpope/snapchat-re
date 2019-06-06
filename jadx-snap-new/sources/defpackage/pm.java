package defpackage;

import android.os.Build.VERSION;

/* renamed from: pm */
public final class pm {
    public static final pm a = new pm(new a());
    public pr b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public pn i;

    /* renamed from: pm$a */
    public static final class a {
        pr a = pr.NOT_REQUIRED;
        long b = -1;
        long c = -1;
        pn d = new pn();
        private boolean e = false;
        private boolean f = false;
        private boolean g = false;
        private boolean h = false;
    }

    public pm() {
        this.b = pr.NOT_REQUIRED;
        this.g = -1;
        this.h = -1;
        this.i = new pn();
    }

    private pm(a aVar) {
        this.b = pr.NOT_REQUIRED;
        this.g = -1;
        this.h = -1;
        this.i = new pn();
        this.c = false;
        this.d = false;
        this.b = aVar.a;
        this.e = false;
        this.f = false;
        if (VERSION.SDK_INT >= 24) {
            this.i = aVar.d;
            this.g = aVar.b;
            this.h = aVar.c;
        }
    }

    public pm(pm pmVar) {
        this.b = pr.NOT_REQUIRED;
        this.g = -1;
        this.h = -1;
        this.i = new pn();
        this.c = pmVar.c;
        this.d = pmVar.d;
        this.b = pmVar.b;
        this.e = pmVar.e;
        this.f = pmVar.f;
        this.i = pmVar.i;
    }

    public final boolean a() {
        return this.i.a() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pm pmVar = (pm) obj;
        return (this.c == pmVar.c && this.d == pmVar.d && this.e == pmVar.e && this.f == pmVar.f && this.g == pmVar.g && this.h == pmVar.h && this.b == pmVar.b) ? this.i.equals(pmVar.i) : false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.b.hashCode() * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31;
        long j = this.g;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.h;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode();
    }
}
