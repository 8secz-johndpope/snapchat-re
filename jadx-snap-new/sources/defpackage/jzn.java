package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import defpackage.jxj.a;
import defpackage.jxj.b;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jzn */
final class jzn implements OnAttachStateChangeListener, jxj {
    final WeakReference<aib> a;
    final ImageView b;
    b e;
    ahq<?> f;
    protected idl g;
    private final jzr h;
    private a i;
    private Uri j;
    private jzp k;
    private Uri l;
    private ku m;
    private ajej n;

    public jzn(ImageView imageView) {
        aib b = ahx.b(imageView.getContext().getApplicationContext());
        Context context = imageView.getContext();
        ihl ihl = new ihl();
        jwq jwq = jvx.a().d;
        ajwy ajwy = jwq == null ? null : jwq.h;
        jwq = jvx.a().d;
        ajwy ajwy2 = jwq == null ? null : jwq.i;
        jwq = jvx.a().d;
        ajwy ajwy3 = jwq == null ? null : jwq.c;
        jwq = jvx.a().d;
        ajwy ajwy4 = jwq == null ? null : jwq.f;
        jwq = jvx.a().d;
        this(imageView, b, new jzr(context, ihl, ajwy, ajwy2, ajwy3, ajwy4, jwq == null ? null : jwq.j));
    }

    private jzn(ImageView imageView, aib aib, jzr jzr) {
        this.e = jxj.c;
        this.i = jxj.d;
        this.n = ajfq.INSTANCE;
        setRequestListener(jxj.d);
        this.b = imageView;
        this.b.addOnAttachStateChangeListener(this);
        this.a = new WeakReference(aib);
        this.h = jzr;
    }

    static /* synthetic */ ahq a(jzn jzn, Object obj, int i) {
        ahq a = jzn.h.a((aib) Preconditions.checkNotNull(jzn.a.get()), obj, jzn.e, i);
        if (jzn.e.r) {
            a.a(jzn.e.t);
        }
        if (jzn.e.d()) {
            a.b(jzn.e.j);
        } else {
            Drawable drawable;
            if (jzn.e.e()) {
                drawable = jzn.e.k;
            } else if (jzn.e.u) {
                drawable = jzn.a();
            }
            a.a(drawable);
        }
        if (jzn.e.f()) {
            a.c(jzn.e.l);
        } else if (jzn.e.h()) {
            a.b(jzn.e.m);
        }
        return a;
    }

    private <T> void a(final T t, final jzp jzp) {
        jzn.c();
        Optional a = this.h.a((Object) t, idf.b(this.g));
        ajcx a2 = ajvo.a(ajhn.a);
        if (a.isPresent() && this.e.n == null && !this.e.s) {
            if (this.e.d()) {
                this.b.setImageResource(this.e.j);
            } else {
                ImageView imageView;
                Drawable drawable;
                if (this.e.e()) {
                    imageView = this.b;
                    drawable = this.e.k;
                } else if (this.e.u) {
                    imageView = this.b;
                    drawable = a();
                } else {
                    imageView = this.b;
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
            }
            a2 = (ajcx) a.get();
        }
        final ajei ajei = new ajei();
        Runnable 2 = new Runnable() {
            public final void run() {
                abmr.a();
                jzn.this.b();
                if (!ajei.isDisposed()) {
                    if (jzn.this.e.p) {
                        jzn jzn = jzn.this;
                        Object obj = t;
                        aon aon = jzp;
                        jzn.c();
                        ahs a = ((aib) Preconditions.checkNotNull(jzn.a.get())).a(obj);
                        ahw ahw = new ahw(a, a.a, a.b);
                        ahw.a(aon);
                        if (jzn.e.r) {
                            ahw.a(jzn.e.t);
                        }
                        if (jzn.e.d()) {
                            ahw.b(jzn.e.j);
                        } else {
                            Drawable drawable;
                            if (jzn.e.e()) {
                                drawable = jzn.e.k;
                            } else if (jzn.e.u) {
                                drawable = jzn.a();
                            }
                            ahw.a(drawable);
                        }
                        if (jzn.e.f()) {
                            ahw.c(jzn.e.l);
                        } else if (jzn.e.h()) {
                            ahw.b(jzn.e.m);
                        }
                        ahw.a(jzn.b);
                        return;
                    }
                    ahq ahq = jzn.this.f;
                    jzn jzn2 = jzn.this;
                    jzn2.f = jzn.a(jzn2, t, 1);
                    if (jzn.this.e.s && ahq != null) {
                        ahq.a(null);
                        ahq.a(null);
                        jzn.this.f.a((ahp) ahq);
                    }
                    if (jzn.this.e.n != null) {
                        jzn.this.f.a((ahp) jzn.a(jzn.this, new jwh(jzn.this.e.n, (idl) Preconditions.checkNotNull(jzn.this.g), jzn.this.e.x), 2));
                    }
                    jzn.this.f.a((aon) jzp);
                    jzn.this.f.a(jzn.this.b);
                }
            }
        };
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ajei.a(igs.a(a2, atomicBoolean).b(ajcx.a(2)).a(ajfu.g).c(new -$$Lambda$jzn$io5TBL1J5SLq3UK2VI5N6gtzs04(atomicBoolean)).e());
        this.n = ajei;
    }

    private void a(jzp jzp) {
        jzn.c();
        aht a = this.h.a((aib) Preconditions.checkNotNull(this.a.get()), (Uri) Preconditions.checkNotNull(this.l));
        a.b((aon) jzp);
        a.a(this.b);
    }

    static void c() {
        Preconditions.checkState(Thread.currentThread() == Looper.getMainLooper().getThread(), "This method must be called on the main thread");
    }

    private void d() {
        jzn.c();
        b();
        ahx.a(this.b);
        f();
        jzp jzp = this.k;
        if (jzp != null) {
            jzp.b();
        }
        this.k = null;
        this.l = null;
    }

    private void e() {
        jzn.c();
        this.l = (Uri) Preconditions.checkNotNull(this.j);
        f();
        this.k = this.h.a(this.i, (Uri) Preconditions.checkNotNull(this.l), idf.a((idl) Preconditions.checkNotNull(this.g)));
        this.k.a();
        if (this.h.a() && jxp.d(this.l)) {
            a(new jwh(this.l, this.g, this.e.w, this.k), this.k);
        } else if (jxp.b(this.l)) {
            a(Integer.valueOf(jxp.f(this.l)), this.k);
        } else if (jxp.c(this.l)) {
            a(this.k);
        } else if (jxp.e(this.l)) {
            a(jxp.g(this.l), this.k);
        } else {
            a(this.l, this.k);
        }
    }

    private void f() {
        this.n.dispose();
        this.n = ajfq.INSTANCE;
    }

    /* Access modifiers changed, original: final */
    public final ku a() {
        b();
        this.m = new ku(this.b.getContext());
        this.m.a(-3355444);
        this.m.a(5.0f);
        this.m.b(30.0f);
        this.m.start();
        return this.m;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        abmr.a();
        Drawable drawable = this.b.getDrawable();
        if (drawable != this.m && (drawable instanceof Animatable)) {
            ((Animatable) drawable).stop();
        }
        ku kuVar = this.m;
        if (kuVar != null) {
            kuVar.stop();
        }
        this.m = null;
    }

    public final void clear() {
        d();
        this.b.setImageDrawable(null);
        this.f = null;
        this.j = null;
        this.g = null;
    }

    public final Uri getImageUri() {
        return this.j;
    }

    public final b getRequestOptions() {
        return this.e;
    }

    public final idl getUiPage() {
        return this.g;
    }

    public final void onViewAttachedToWindow(View view) {
        if (!this.e.v && this.j != null && this.l == null) {
            e();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (!this.e.v) {
            d();
        }
    }

    public final void setImageUri(Uri uri, idl idl) {
        if (!uri.equals(this.j)) {
            this.j = uri;
            this.g = idl;
            e();
        }
    }

    public final void setRequestListener(final a aVar) {
        this.i = new a() {
            public final void onFailure(jwl jwl) {
                jzn.this.clear();
                aVar.onFailure(jwl);
            }

            public final void onImageReady(jwv jwv) {
                aVar.onImageReady(jwv);
            }
        };
    }

    public final void setRequestOptions(b bVar) {
        this.e = bVar;
    }
}
