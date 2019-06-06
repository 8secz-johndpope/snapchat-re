package defpackage;

import android.os.Bundle;
import com.firebase.jobdispatcher.JobService;

/* renamed from: bao */
public final class bao implements bas {
    final String a;
    final String b;
    final bau c;
    private final bax d;
    private final int e;
    private final boolean f;
    private final int[] g;
    private final boolean h;
    private final Bundle i;

    /* renamed from: bao$a */
    public static final class a implements bas {
        String a;
        Bundle b;
        String c;
        bau d = bay.a;
        int e = 1;
        int[] f;
        bax g = bax.a;
        public boolean h = false;
        boolean i = false;
        private final bba j;

        a(bba bba) {
            this.j = bba;
        }

        public a(bba bba, bas bas) {
            this.j = bba;
            this.c = bas.e();
            this.a = bas.i();
            this.d = bas.f();
            this.i = bas.h();
            this.e = bas.g();
            this.f = bas.a();
            this.b = bas.b();
            this.g = bas.c();
        }

        public final a a(bau bau) {
            this.d = bau;
            return this;
        }

        public final a a(bax bax) {
            this.g = bax;
            return this;
        }

        public final a a(Class<? extends JobService> cls) {
            this.a = cls.getName();
            return this;
        }

        public final a a(String str) {
            this.c = str;
            return this;
        }

        public final int[] a() {
            int[] iArr = this.f;
            return iArr == null ? new int[0] : iArr;
        }

        public final Bundle b() {
            return this.b;
        }

        public final bax c() {
            return this.g;
        }

        public final boolean d() {
            return this.h;
        }

        public final String e() {
            return this.c;
        }

        public final bau f() {
            return this.d;
        }

        public final int g() {
            return this.e;
        }

        public final boolean h() {
            return this.i;
        }

        public final String i() {
            return this.a;
        }

        public final a j() {
            this.h = true;
            return this;
        }

        public final bao k() {
            this.j.b(this);
            return new bao(this, (byte) 0);
        }

        public final a l() {
            this.e = 2;
            return this;
        }

        public final a m() {
            this.i = true;
            return this;
        }
    }

    private bao(a aVar) {
        this.a = aVar.a;
        this.i = aVar.b == null ? null : new Bundle(aVar.b);
        this.b = aVar.c;
        this.c = aVar.d;
        this.d = aVar.g;
        this.e = aVar.e;
        this.f = aVar.i;
        this.g = aVar.f != null ? aVar.f : new int[0];
        this.h = aVar.h;
    }

    /* synthetic */ bao(a aVar, byte b) {
        this(aVar);
    }

    public final int[] a() {
        return this.g;
    }

    public final Bundle b() {
        return this.i;
    }

    public final bax c() {
        return this.d;
    }

    public final boolean d() {
        return this.h;
    }

    public final String e() {
        return this.b;
    }

    public final bau f() {
        return this.c;
    }

    public final int g() {
        return this.e;
    }

    public final boolean h() {
        return this.f;
    }

    public final String i() {
        return this.a;
    }
}
