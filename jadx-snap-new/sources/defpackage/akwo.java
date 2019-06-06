package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.akhv.a;
import java.io.IOException;

/* renamed from: akwo */
final class akwo<T> implements akwh<T> {
    private final akwu<T, ?> a;
    private final Object[] b;
    private volatile boolean c;
    private akgx d;
    private Throwable e;
    private boolean f;

    /* renamed from: akwo$b */
    static final class b extends akhw {
        private final akho a;
        private final long b;

        b(akho akho, long j) {
            this.a = akho;
            this.b = j;
        }

        public final akho a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final akkf d() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* renamed from: akwo$a */
    static final class a extends akhw {
        IOException a;
        private final akhw b;

        a(akhw akhw) {
            this.b = akhw;
        }

        public final akho a() {
            return this.b.a();
        }

        public final long b() {
            return this.b.b();
        }

        public final void close() {
            this.b.close();
        }

        public final akkf d() {
            return akko.a(new akkj(this.b.d()) {
                public final long a(akkd akkd, long j) {
                    try {
                        return super.a(akkd, j);
                    } catch (IOException e) {
                        a.this.a = e;
                        throw e;
                    }
                }
            });
        }
    }

    akwo(akwu<T, ?> akwu, Object[] objArr) {
        this.a = akwu;
        this.b = objArr;
    }

    private akwo<T> e() {
        return new akwo(this.a, this.b);
    }

    private akgx f() {
        akgx newCall = this.a.c.newCall(this.a.a(this.b));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final akws<T> a() {
        akgx akgx;
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f = true;
            if (this.e == null) {
                akgx = this.d;
                if (akgx == null) {
                    try {
                        akgx = f();
                        this.d = akgx;
                    } catch (IOException | RuntimeException e) {
                        this.e = e;
                        throw e;
                    }
                }
            } else if (this.e instanceof IOException) {
                throw ((IOException) this.e);
            } else {
                throw ((RuntimeException) this.e);
            }
        }
        if (this.c) {
            akgx.c();
        }
        return a(akgx.b());
    }

    /* Access modifiers changed, original: final */
    public final akws<T> a(akhv akhv) {
        akhw akhw = akhv.g;
        a e = akhv.e();
        e.g = new b(akhw.a(), akhw.b());
        Object a = e.a();
        int i = a.c;
        akws<T> akws = Callback.DEFAULT_DRAG_ANIMATION_DURATION;
        if (i >= Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
            akws = MapboxConstants.ANIMATION_DURATION;
            if (i < MapboxConstants.ANIMATION_DURATION) {
                if (i == 204 || i == 205) {
                    akhw.close();
                    return akws.a(null, a);
                }
                try {
                    return akws.a(this.a.e.a(new a(akhw)), a);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        }
        try {
            Object a2 = akwv.a(akhw);
            akwv.a(a2, "body == null");
            akwv.a(a, "rawResponse == null");
            akws = a.c();
            if (akws == true) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            akws = new akws(a, null, a2);
            return akws;
        } finally {
            akhw.close();
        }
    }

    public final void a(final akwj<T> akwj) {
        akgx akgx;
        Throwable th;
        akwv.a((Object) akwj, "callback == null");
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f = true;
            akgx = this.d;
            th = this.e;
            if (akgx == null && th == null) {
                try {
                    akgx f = f();
                    this.d = f;
                    akgx = f;
                } catch (Throwable th2) {
                    th = th2;
                    this.e = th;
                }
            }
        }
        if (th != null) {
            akwj.a((akwh) this, th);
            return;
        }
        if (this.c) {
            akgx.c();
        }
        akgx.a(new akgy() {
            public final void onFailure(akgx akgx, IOException iOException) {
                try {
                    akwj.a(akwo.this, (Throwable) iOException);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }

            public final void onResponse(akgx akgx, akhv akhv) {
                try {
                    try {
                        akwj.a(akwo.this, akwo.this.a(akhv));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        });
    }

    public final void b() {
        akgx akgx;
        this.c = true;
        synchronized (this) {
            akgx = this.d;
        }
        if (akgx != null) {
            akgx.c();
        }
    }

    public final boolean c() {
        boolean z = true;
        if (this.c) {
            return true;
        }
        synchronized (this) {
            if (this.d == null || !this.d.d()) {
                z = false;
            }
        }
        return z;
    }

    public final /* synthetic */ Object clone() {
        return e();
    }

    public final /* synthetic */ akwh d() {
        return e();
    }
}
