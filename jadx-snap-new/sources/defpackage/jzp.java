package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.jwh.a;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jzp */
public final class jzp implements aon<Object, Object>, a {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private volatile long b = -1;
    private volatile jwt c;
    private volatile ajxm<? extends Throwable, Integer> d;
    private volatile ajej e;
    private final jxj.a f;
    private final String g;
    private final idd h;
    private final ajwy<jwn> i;
    private final ajwy<jwk> j;
    private final ihh k;

    /* renamed from: jzp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public jzp(jxj.a aVar, String str, idd idd, ajwy<jwn> ajwy, ajwy<jwk> ajwy2, ihh ihh) {
        akcr.b(str, "id");
        akcr.b(idd, "attribution");
        akcr.b(ihh, "clock");
        this.f = aVar;
        this.g = str;
        this.h = idd;
        this.i = ajwy;
        this.j = ajwy2;
        this.k = ihh;
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        this.e = obj;
    }

    private final void a(jwl jwl) {
        jxj.a aVar = this.f;
        if (aVar != null) {
            aVar.onFailure(jwl);
        }
        ajwy ajwy = this.i;
        if (ajwy != null) {
            jwn jwn = (jwn) ajwy.get();
            if (jwn != null) {
                jwn.a(this.h.a.getName(), jwl);
            }
        }
    }

    public final void a() {
        if (this.b == -1) {
            this.b = this.k.c();
            return;
        }
        throw new IllegalStateException("onLoadStarted already called");
    }

    public final void a(Throwable th, int i) {
        akcr.b(th, "throwable");
        if (this.d == null) {
            this.d = ajxs.a(th, Integer.valueOf(i));
        }
    }

    public final void a(jwt jwt) {
        akcr.b(jwt, "loadSource");
        if (this.c == null) {
            this.c = jwt;
        }
    }

    public final boolean a(Exception exception, Object obj) {
        if (this.a.compareAndSet(false, true)) {
            ajxm ajxm = this.d;
            if (ajxm != null) {
                a(new jwl(jwm.DATA_SOURCE, (Throwable) ajxm.a, ((Number) ajxm.b).intValue()));
            } else {
                jzp jzp = this;
                if (exception == null) {
                    Object obj2 = Locale.US;
                    akcr.a(obj2, "Locale.US");
                    String str = "Unable to decode %s";
                    obj2 = String.format(obj2, str, Arrays.copyOf(new Object[]{String.valueOf(obj)}, 1));
                    akcr.a(obj2, "java.lang.String.format(locale, format, *args)");
                    exception = new IllegalArgumentException(obj2);
                }
                jzp.a(new jwl(jwm.IMAGE_DECODING, exception));
            }
        }
        return false;
    }

    public final boolean a(Object obj, boolean z) {
        Object obj2 = obj;
        if (this.a.compareAndSet(false, true)) {
            if (this.b != -1) {
                int width;
                int height;
                jwt jwt;
                long c = this.k.c();
                boolean z2 = obj2 instanceof Bitmap;
                int i = -1;
                if (z2) {
                    Bitmap bitmap = (Bitmap) obj2;
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                } else if (obj2 instanceof Drawable) {
                    Drawable drawable = (Drawable) obj2;
                    width = drawable.getIntrinsicWidth();
                    height = drawable.getIntrinsicHeight();
                } else {
                    height = -1;
                    width = -1;
                }
                jzx jzx = new jzx(width, height);
                int i2 = jzx.a;
                int i3 = jzx.b;
                if (z) {
                    jwt = jwt.MEMORY_CACHE;
                } else {
                    jwt = this.c;
                    if (jwt == null) {
                        jwt = jwt.UNKNOWN;
                    }
                }
                jwv jwv = new jwv(i2, i3, jwt, c - this.b);
                jxj.a aVar = this.f;
                if (aVar != null) {
                    aVar.onImageReady(jwv);
                }
                ajwy ajwy = this.i;
                if (ajwy != null) {
                    jwn jwn = (jwn) ajwy.get();
                    if (jwn != null) {
                        jwn.a(this.h.a.getName(), jwv);
                    }
                }
                ajwy = this.j;
                if (ajwy != null) {
                    Bitmap bitmap2;
                    jwk jwk = (jwk) ajwy.get();
                    jwj jzz = new jzz();
                    if (z2) {
                        bitmap2 = (Bitmap) obj2;
                    } else {
                        if (obj2 instanceof BitmapDrawable) {
                            obj2 = ((BitmapDrawable) obj2).getBitmap();
                            akcr.a(obj2, "resource.bitmap");
                        }
                        this.e = jwk.a(jzz, i, this.h);
                    }
                    i = bitmap2.getAllocationByteCount();
                    this.e = jwk.a(jzz, i, this.h);
                }
            } else {
                throw new IllegalStateException("onLoadStarted was not called");
            }
        }
        return false;
    }

    public final void b() {
        this.e.dispose();
    }
}
