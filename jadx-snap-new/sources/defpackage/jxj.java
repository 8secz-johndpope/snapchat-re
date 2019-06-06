package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: jxj */
public interface jxj {
    public static final b c = new a().b();
    public static final a d = new 1();

    /* renamed from: jxj$b */
    public static class b extends jxa {
        public final int j;
        public final Drawable k;
        public final int l;
        public final Drawable m;
        public final Uri n;
        public final boolean o;
        public final boolean p;
        public final float[] q;
        public final boolean r;
        public final boolean s;
        public final int t;
        public final boolean u;
        public final boolean v;
        public final int w;
        public final int x;

        /* renamed from: jxj$b$a */
        public static class a extends defpackage.jxa.a {
            public int j;
            Drawable k;
            public int l;
            Drawable m;
            Uri n;
            public boolean o = true;
            boolean p;
            float[] q;
            boolean r;
            boolean s;
            int t;
            boolean u;
            boolean v;
            int w;
            int x;

            public a() {
                this.j = -1;
                this.k = null;
                this.l = -1;
                this.m = null;
                this.n = null;
                this.q = null;
                this.t = MapboxConstants.ANIMATION_DURATION;
                this.v = false;
                this.w = 1;
                this.x = 1;
            }

            a(b bVar) {
                this.j = -1;
                List list = null;
                this.k = null;
                this.l = -1;
                this.m = null;
                this.n = null;
                this.q = null;
                this.t = MapboxConstants.ANIMATION_DURATION;
                this.v = false;
                this.w = 1;
                this.x = 1;
                this.b = bVar.b;
                this.c = bVar.c;
                this.d = bVar.d;
                this.e = bVar.e;
                this.f = bVar.f == null ? null : new ArrayList(bVar.f);
                if (bVar.g != null) {
                    list = new ArrayList(bVar.g);
                }
                this.g = list;
                this.h = bVar.h;
                this.j = bVar.j;
                this.k = bVar.k;
                this.l = bVar.l;
                this.m = bVar.m;
                this.n = bVar.n;
                this.o = bVar.o;
                this.p = bVar.p;
                this.q = bVar.q;
                this.r = bVar.r;
                this.s = bVar.s;
                this.t = bVar.t;
                this.u = bVar.u;
                this.v = bVar.v;
                this.w = bVar.w;
                this.x = bVar.x;
            }

            public final /* synthetic */ defpackage.jxa.a a() {
                throw new IllegalStateException("Image loads default to UI thread");
            }

            public final a a(float f) {
                Preconditions.checkArgument(Float.compare(f, MapboxConstants.MINIMUM_ZOOM) > 0, "Radius must be non-zero and positive");
                this.q = new float[8];
                Arrays.fill(this.q, f);
                return this;
            }

            public final a a(float f, float f2, float f3, float f4) {
                this.q = new float[8];
                float[] fArr = this.q;
                fArr[0] = f;
                fArr[1] = f;
                fArr[2] = f2;
                fArr[3] = f2;
                fArr[4] = f3;
                fArr[5] = f3;
                fArr[6] = f4;
                fArr[7] = f4;
                for (float f32 : fArr) {
                    Preconditions.checkArgument(Float.compare(f32, MapboxConstants.MINIMUM_ZOOM) >= 0, "Radius must be positive");
                }
                return this;
            }

            public final a a(int i) {
                this.j = i;
                return this;
            }

            public final a a(Drawable drawable) {
                this.k = (Drawable) Preconditions.checkNotNull(drawable);
                return this;
            }

            public final a a(Uri uri) {
                Preconditions.checkArgument(jxp.d(uri));
                this.n = uri;
                this.s = false;
                this.x = -1;
                return this;
            }

            public final a b(int i) {
                this.l = i;
                return this;
            }

            /* renamed from: b */
            public final a a(int i, int i2) {
                super.a(i, i2);
                return this;
            }

            /* renamed from: b */
            public final a a(int i, int i2, boolean z) {
                super.a(i, i2, z);
                return this;
            }

            public final a b(boolean z) {
                this.u = z;
                this.k = null;
                this.j = -1;
                return this;
            }

            public final a c() {
                this.r = true;
                this.t = MapboxConstants.ANIMATION_DURATION;
                return this;
            }

            public final a c(List<jwg> list) {
                super.a((List) list);
                return this;
            }

            public final a c(boolean z) {
                this.v = z;
                return this;
            }

            public final a c(jwg... jwgArr) {
                super.a(jwgArr);
                return this;
            }

            public final a d() {
                super.a(true);
                return this;
            }

            public final a d(boolean z) {
                this.o = z;
                return this;
            }

            public final a d(jwg... jwgArr) {
                super.b(jwgArr);
                return this;
            }

            public final a e() {
                this.w = 2;
                return this;
            }

            public final a e(boolean z) {
                this.p = z;
                return this;
            }

            public final a f(boolean z) {
                this.s = z;
                if (z) {
                    this.n = null;
                    this.g = null;
                }
                return this;
            }

            /* renamed from: f */
            public final b b() {
                return new b(this);
            }
        }

        public b(a aVar) {
            super(aVar);
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
            this.m = aVar.m;
            this.n = aVar.n;
            this.o = aVar.o;
            this.p = aVar.p;
            this.q = aVar.q;
            this.r = aVar.r;
            this.s = aVar.s;
            this.t = aVar.t;
            this.u = aVar.u;
            this.v = aVar.v;
            this.w = aVar.w;
            this.x = aVar.x;
        }

        /* renamed from: c */
        public final a a() {
            return new a(this);
        }

        public final boolean d() {
            return this.j != -1;
        }

        public final boolean e() {
            return this.k != null;
        }

        public final boolean f() {
            return this.l != -1;
        }

        public final boolean g() {
            return this.q != null;
        }

        public final boolean h() {
            return this.m != null;
        }
    }

    /* renamed from: jxj$a */
    public interface a {
        void onFailure(jwl jwl);

        void onImageReady(jwv jwv);
    }

    /* renamed from: jxj$1 */
    static class 1 implements a {
        1() {
        }

        public final void onFailure(jwl jwl) {
        }

        public final void onImageReady(jwv jwv) {
        }
    }

    static {
        new a().d().b();
    }

    void clear();

    Uri getImageUri();

    b getRequestOptions();

    idl getUiPage();

    void setImageUri(Uri uri, idl idl);

    void setRequestListener(a aVar);

    void setRequestOptions(b bVar);
}
