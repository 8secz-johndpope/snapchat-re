package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: jxa */
public class jxa {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final List<jwg> f;
    public final List<jwg> g;
    public final jvz h;
    public final ajei i;

    /* renamed from: jxa$a */
    public static class a {
        boolean a = false;
        int b = -1;
        int c = -1;
        boolean d = false;
        boolean e = false;
        List<jwg> f;
        List<jwg> g;
        public jvz h;
        public ajei i;

        a(jxa jxa) {
            this.a = jxa.a;
            this.b = jxa.b;
            this.c = jxa.c;
            this.d = jxa.d;
            this.e = jxa.e;
            List list = null;
            this.f = jxa.f == null ? null : new ArrayList(jxa.f);
            if (jxa.g != null) {
                list = new ArrayList(jxa.g);
            }
            this.g = list;
            this.h = jxa.h;
            this.i = jxa.i;
        }

        public a a() {
            this.a = true;
            return this;
        }

        public a a(int i, int i2) {
            a(i, i2, false);
            return this;
        }

        public a a(int i, int i2, boolean z) {
            this.b = i;
            this.c = i2;
            this.d = z;
            return this;
        }

        public final a a(ajei ajei) {
            this.i = ajei;
            return this;
        }

        public a a(List<jwg> list) {
            this.f = list;
            return this;
        }

        public a a(boolean z) {
            this.e = z;
            this.d = z;
            return this;
        }

        public a a(jwg... jwgArr) {
            return a(Arrays.asList(jwgArr));
        }

        public a b(List<jwg> list) {
            this.g = list;
            return this;
        }

        public a b(jwg... jwgArr) {
            return b(Arrays.asList(jwgArr));
        }

        public jxa b() {
            return new jxa(this);
        }
    }

    public jxa(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
    }

    public a a() {
        return new a(this);
    }

    public final boolean b() {
        return this.b > 0 && this.c > 0;
    }
}
