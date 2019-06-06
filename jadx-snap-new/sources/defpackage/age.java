package defpackage;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.util.Map;
import org.opencv.imgproc.Imgproc;

/* renamed from: age */
public abstract class age<T extends age<T>> implements Cloneable {
    float a = 1.0f;
    aal b = aal.c;
    protected yk c = yk.NORMAL;
    Drawable d;
    int e;
    Drawable f;
    int g;
    public boolean h = true;
    protected int i = -1;
    protected int j = -1;
    zd k = aha.b;
    boolean l;
    Drawable m;
    int n;
    public zf o = new zf();
    Map<Class<?>, zi<?>> p = new ahd();
    Class<?> q = Object.class;
    Theme r;
    boolean s;
    boolean t;
    boolean u = true;
    boolean v;
    private int w;
    private boolean x = true;
    private boolean y;
    private boolean z;

    private T a() {
        if (!this.y) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    private <Y> T a(Class<Y> cls, zi<Y> ziVar, boolean z) {
        age age = this;
        while (age.z) {
            age = age.clone();
        }
        String str = "Argument must not be null";
        ahl.a((Object) cls, str);
        ahl.a((Object) ziVar, str);
        age.p.put(cls, ziVar);
        age.w |= ItemAnimator.FLAG_MOVED;
        age.x = true;
        age.w |= Imgproc.FLOODFILL_FIXED_RANGE;
        age.u = false;
        age.w |= Imgproc.FLOODFILL_MASK_ONLY;
        age.l = true;
        return age.a();
    }

    private static boolean b(int i, int i2) {
        return (i & i2) != 0;
    }

    public T a(int i) {
        if (this.z) {
            return clone().a(i);
        }
        this.g = i;
        this.w |= 128;
        this.f = null;
        this.w &= -65;
        return a();
    }

    public T a(int i, int i2) {
        if (this.z) {
            return clone().a(i, i2);
        }
        this.j = i;
        this.i = i2;
        this.w |= RasterSource.DEFAULT_TILE_SIZE;
        return a();
    }

    public T a(aal aal) {
        if (this.z) {
            return clone().a(aal);
        }
        this.b = (aal) ahl.a((Object) aal, "Argument must not be null");
        this.w |= 4;
        return a();
    }

    public T a(adp adp) {
        return a(adp.f, ahl.a((Object) adp, "Argument must not be null"));
    }

    public T a(Drawable drawable) {
        if (this.z) {
            return clone().a(drawable);
        }
        this.f = drawable;
        this.w |= 64;
        this.g = 0;
        this.w &= -129;
        return a();
    }

    public T a(Class<?> cls) {
        if (this.z) {
            return clone().a((Class) cls);
        }
        this.q = (Class) ahl.a((Object) cls, "Argument must not be null");
        this.w |= 4096;
        return a();
    }

    public T a(yk ykVar) {
        if (this.z) {
            return clone().a(ykVar);
        }
        this.c = (yk) ahl.a((Object) ykVar, "Argument must not be null");
        this.w |= 8;
        return a();
    }

    public T a(yy yyVar) {
        ahl.a((Object) yyVar, "Argument must not be null");
        return a(adq.a, (Object) yyVar).a(aeu.a, (Object) yyVar);
    }

    public T a(zd zdVar) {
        if (this.z) {
            return clone().a(zdVar);
        }
        this.k = (zd) ahl.a((Object) zdVar, "Argument must not be null");
        this.w |= Imgproc.INTER_TAB_SIZE2;
        return a();
    }

    public <Y> T a(ze<Y> zeVar, Y y) {
        if (this.z) {
            return clone().a((ze) zeVar, (Object) y);
        }
        String str = "Argument must not be null";
        ahl.a((Object) zeVar, str);
        ahl.a((Object) y, str);
        this.o.a(zeVar, y);
        return a();
    }

    public T a(zi<Bitmap> ziVar) {
        age age = this;
        while (age.z) {
            age = age.clone();
        }
        ads ads = new ads(ziVar, true);
        age.a(Bitmap.class, ziVar, true);
        age.a(Drawable.class, ads, true);
        age.a(BitmapDrawable.class, ads, true);
        age.a(aeo.class, new aer(ziVar), true);
        return age.a();
    }

    public T a(boolean z) {
        if (this.z) {
            return clone().a(z);
        }
        this.v = z;
        this.w |= 1048576;
        return a();
    }

    /* renamed from: b */
    public T clone() {
        try {
            age age = (age) super.clone();
            age.o = new zf();
            age.o.a(this.o);
            age.p = new ahd();
            age.p.putAll(this.p);
            age.y = false;
            age.z = false;
            return age;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public T b(int i) {
        if (this.z) {
            return clone().b(i);
        }
        this.e = i;
        this.w |= 32;
        this.d = null;
        this.w &= -17;
        return a();
    }

    public T b(age<?> age) {
        if (this.z) {
            return clone().b((age) age);
        }
        if (age.b(age.w, 2)) {
            this.a = age.a;
        }
        if (age.b(age.w, 262144)) {
            this.s = age.s;
        }
        if (age.b(age.w, 1048576)) {
            this.v = age.v;
        }
        if (age.b(age.w, 4)) {
            this.b = age.b;
        }
        if (age.b(age.w, 8)) {
            this.c = age.c;
        }
        if (age.b(age.w, 16)) {
            this.d = age.d;
            this.e = 0;
            this.w &= -33;
        }
        if (age.b(age.w, 32)) {
            this.e = age.e;
            this.d = null;
            this.w &= -17;
        }
        if (age.b(age.w, 64)) {
            this.f = age.f;
            this.g = 0;
            this.w &= -129;
        }
        if (age.b(age.w, 128)) {
            this.g = age.g;
            this.f = null;
            this.w &= -65;
        }
        if (age.b(age.w, 256)) {
            this.h = age.h;
        }
        if (age.b(age.w, RasterSource.DEFAULT_TILE_SIZE)) {
            this.j = age.j;
            this.i = age.i;
        }
        if (age.b(age.w, Imgproc.INTER_TAB_SIZE2)) {
            this.k = age.k;
        }
        if (age.b(age.w, 4096)) {
            this.q = age.q;
        }
        if (age.b(age.w, 8192)) {
            this.m = age.m;
            this.n = 0;
            this.w &= -16385;
        }
        if (age.b(age.w, 16384)) {
            this.n = age.n;
            this.m = null;
            this.w &= -8193;
        }
        if (age.b(age.w, 32768)) {
            this.r = age.r;
        }
        if (age.b(age.w, Imgproc.FLOODFILL_FIXED_RANGE)) {
            this.x = age.x;
        }
        if (age.b(age.w, Imgproc.FLOODFILL_MASK_ONLY)) {
            this.l = age.l;
        }
        if (age.b(age.w, ItemAnimator.FLAG_MOVED)) {
            this.p.putAll(age.p);
            this.u = age.u;
        }
        if (age.b(age.w, 524288)) {
            this.t = age.t;
        }
        if (!this.x) {
            this.p.clear();
            this.w &= -2049;
            this.l = false;
            this.w &= -131073;
            this.u = true;
        }
        this.w |= age.w;
        this.o.a(age.o);
        return a();
    }

    public T b(Drawable drawable) {
        if (this.z) {
            return clone().b(drawable);
        }
        this.d = drawable;
        this.w |= 16;
        this.e = 0;
        this.w &= -33;
        return a();
    }

    public T b(boolean z) {
        if (this.z) {
            return clone().b(true);
        }
        this.h = z ^ 1;
        this.w |= 256;
        return a();
    }

    public T c() {
        if (this.z) {
            return clone().c();
        }
        this.p.clear();
        this.w &= -2049;
        this.l = false;
        this.w &= -131073;
        this.x = false;
        this.w |= Imgproc.FLOODFILL_FIXED_RANGE;
        this.u = true;
        return a();
    }

    public T d() {
        this.y = true;
        return this;
    }

    public T e() {
        if (!this.y || this.z) {
            this.z = true;
            return d();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public boolean equals(Object obj) {
        if (obj instanceof age) {
            age age = (age) obj;
            if (Float.compare(age.a, this.a) == 0 && this.e == age.e && ahm.a(this.d, age.d) && this.g == age.g && ahm.a(this.f, age.f) && this.n == age.n && ahm.a(this.m, age.m) && this.h == age.h && this.i == age.i && this.j == age.j && this.l == age.l && this.x == age.x && this.s == age.s && this.t == age.t && this.b.equals(age.b) && this.c == age.c && this.o.equals(age.o) && this.p.equals(age.p) && this.q.equals(age.q) && ahm.a(this.k, age.k) && ahm.a(this.r, age.r)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return ahm.a(this.j, this.i);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean g() {
        return age.b(this.w, 8);
    }

    public int hashCode() {
        return ahm.a(this.r, ahm.a(this.k, ahm.a(this.q, ahm.a(this.p, ahm.a(this.o, ahm.a(this.c, ahm.a(this.b, ahm.a(this.t, ahm.a(this.s, ahm.a(this.x, ahm.a(this.l, (((ahm.a(this.h, ahm.a(this.m, (ahm.a(this.f, (ahm.a(this.d, ((Float.floatToIntBits(this.a) + 527) * 31) + this.e) * 31) + this.g) * 31) + this.n)) * 31) + this.i) * 31) + this.j)))))))))));
    }
}
