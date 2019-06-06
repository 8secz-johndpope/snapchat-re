package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.Closeable;

/* renamed from: akhv */
public final class akhv implements Closeable {
    public final akht a;
    public final akhr b;
    public final int c;
    public final String d;
    public final akhk e;
    public final akhl f;
    public final akhw g;
    final akhv h;
    final akhv i;
    public final akhv j;
    public final long k;
    public final long l;
    private volatile akgw m;

    /* renamed from: akhv$a */
    public static class a {
        public akht a;
        public akhr b;
        public int c;
        public String d;
        public akhk e;
        defpackage.akhl.a f;
        public akhw g;
        akhv h;
        akhv i;
        public akhv j;
        public long k;
        public long l;

        public a() {
            this.c = -1;
            this.f = new defpackage.akhl.a();
        }

        a(akhv akhv) {
            this.c = -1;
            this.a = akhv.a;
            this.b = akhv.b;
            this.c = akhv.c;
            this.d = akhv.d;
            this.e = akhv.e;
            this.f = akhv.f.a();
            this.g = akhv.g;
            this.h = akhv.h;
            this.i = akhv.i;
            this.j = akhv.j;
            this.k = akhv.k;
            this.l = akhv.l;
        }

        private static void a(String str, akhv akhv) {
            StringBuilder stringBuilder;
            if (akhv.g != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".body != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (akhv.h != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".networkResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (akhv.i != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".cacheResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (akhv.j != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".priorResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        public final a a(akhl akhl) {
            this.f = akhl.a();
            return this;
        }

        public final a a(akhv akhv) {
            if (akhv != null) {
                a.a("networkResponse", akhv);
            }
            this.h = akhv;
            return this;
        }

        public final a a(akhw akhw) {
            this.g = akhw;
            return this;
        }

        public final a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public final akhv a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c < 0) {
                StringBuilder stringBuilder = new StringBuilder("code < 0: ");
                stringBuilder.append(this.c);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d != null) {
                return new akhv(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public final a b(akhv akhv) {
            if (akhv != null) {
                a.a("cacheResponse", akhv);
            }
            this.i = akhv;
            return this;
        }
    }

    akhv(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f.a();
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }

    public final akht a() {
        return this.a;
    }

    public final String a(String str) {
        return b(str);
    }

    public final int b() {
        return this.c;
    }

    public final String b(String str) {
        str = this.f.a(str);
        return str != null ? str : null;
    }

    public final boolean c() {
        int i = this.c;
        return i >= Callback.DEFAULT_DRAG_ANIMATION_DURATION && i < MapboxConstants.ANIMATION_DURATION;
    }

    public final void close() {
        akhw akhw = this.g;
        if (akhw != null) {
            akhw.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final akhw d() {
        return this.g;
    }

    public final a e() {
        return new a(this);
    }

    public final akgw f() {
        akgw akgw = this.m;
        if (akgw != null) {
            return akgw;
        }
        akgw = akgw.a(this.f);
        this.m = akgw;
        return akgw;
    }

    public final long g() {
        return this.k;
    }

    public final long h() {
        return this.l;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Response{protocol=");
        stringBuilder.append(this.b);
        stringBuilder.append(", code=");
        stringBuilder.append(this.c);
        stringBuilder.append(", message=");
        stringBuilder.append(this.d);
        stringBuilder.append(", url=");
        stringBuilder.append(this.a.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
