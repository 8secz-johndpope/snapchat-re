package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: aht */
public class aht<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {
    private boolean A;
    private Class<ModelType> a;
    private Context b;
    protected final ahx c;
    protected final Class<TranscodeType> d;
    private aob e;
    private anv f;
    private aoe<ModelType, DataType, ResourceType, TranscodeType> g;
    private ModelType h;
    private aio i;
    private boolean j;
    private int k;
    private int l;
    private aon<? super ModelType, TranscodeType> m;
    private aht<?, ?, ?, TranscodeType> n;
    private Float o;
    private Drawable p;
    private Drawable q;
    private aia r;
    private boolean s;
    private aov<TranscodeType> t;
    private int u;
    private int v;
    private ajd w;
    private ais<ResourceType> x;
    private boolean y;
    private boolean z;

    /* renamed from: aht$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[ScaleType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = android.widget.ImageView.ScaleType.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.widget.ImageView.ScaleType.FIT_CENTER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.widget.ImageView.ScaleType.FIT_START;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.widget.ImageView.ScaleType.FIT_END;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aht$1.<clinit>():void");
        }
    }

    aht(Context context, Class<ModelType> cls, aoj<ModelType, DataType, ResourceType, TranscodeType> aoj, Class<TranscodeType> cls2, ahx ahx, aob aob, anv anv) {
        this.i = apk.a;
        this.o = Float.valueOf(1.0f);
        aoe aoe = null;
        this.r = null;
        this.s = true;
        this.t = aow.b;
        this.u = -1;
        this.v = -1;
        this.x = (alt) alt.a;
        this.A = false;
        this.b = context;
        this.a = cls;
        this.d = cls2;
        this.c = ahx;
        this.w = ahx.g;
        this.e = aob;
        this.f = anv;
        if (aoj != null) {
            aoe = new aoe(aoj);
        }
        this.g = aoe;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        } else if (cls != null && aoj == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    aht(aoj<ModelType, DataType, ResourceType, TranscodeType> aoj, Class<TranscodeType> cls, aht<ModelType, ?, ?, ?> aht) {
        this(aht.b, aht.a, aoj, cls, aht.c, aht.e, aht.f);
        this.h = aht.h;
        this.j = aht.j;
        this.i = aht.i;
        this.w = aht.w;
        this.s = aht.s;
    }

    private aia a() {
        return this.r == aia.LOW ? aia.NORMAL : this.r == aia.NORMAL ? aia.HIGH : aia.IMMEDIATE;
    }

    private aol a(api<TranscodeType> api, float f, aia aia, aom aom) {
        api<TranscodeType> api2 = api;
        float f2 = f;
        aia aia2 = aia;
        aom aom2 = aom;
        aoe aoe = this.g;
        return aok.a(aoe, this.h, this.i, this.b, aia2, api2, f2, this.p, this.k, this.q, this.l, this.m, aom2, this.c.c, this.x, this.d, this.s, this.t, this.v, this.u, this.w, null);
    }

    private aol a(api<TranscodeType> api, aop aop) {
        aht aht = this.n;
        if (aht == null) {
            return a(api, this.o.floatValue(), this.r, aop);
        }
        if (this.z) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (aht.t.equals(aow.b)) {
            this.n.t = this.t;
        }
        aht = this.n;
        if (aht.r == null) {
            aht.r = a();
        }
        if (aps.a(this.v, this.u)) {
            aht = this.n;
            if (!aps.a(aht.v, aht.u)) {
                this.n.b(this.v, this.u);
            }
        }
        aop aop2 = new aop(aop);
        aol a = a(api, this.o.floatValue(), this.r, aop2);
        this.z = true;
        aol a2 = this.n.a(api, aop2);
        this.z = false;
        aop2.a(a, a2);
        return aop2;
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> a(aht<?, ?, ?, TranscodeType> aht) {
        if (equals(aht)) {
            throw new IllegalArgumentException("You cannot set a request as a thumbnail for itself. Consider using clone() on the request you are passing to thumbnail()");
        }
        this.n = aht;
        return this;
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> a(ain<DataType> ain) {
        aoe aoe = this.g;
        if (aoe != null) {
            aoe.b = ain;
        }
        return this;
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> a(aio aio) {
        if (aio != null) {
            this.i = aio;
            return this;
        }
        throw new NullPointerException("Signature must not be null");
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> a(ajd ajd) {
        this.w = ajd;
        return this;
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> a(aov<TranscodeType> aov) {
        if (aov != null) {
            this.t = aov;
            return this;
        }
        throw new NullPointerException("Animation factory must not be null!");
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> a(ModelType modelType) {
        this.h = modelType;
        this.j = true;
        return this;
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> a(boolean z) {
        this.s = z ^ 1;
        return this;
    }

    public api<TranscodeType> a(ImageView imageView) {
        aps.a();
        if (imageView != null) {
            api apc;
            if (!(this.y || imageView.getScaleType() == null)) {
                if (ahx.b) {
                    int i = 1.a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        c();
                    } else if (i == 2 || i == 3 || i == 4) {
                        b();
                    }
                } else {
                    e();
                }
            }
            Class cls = this.d;
            if (amo.class.isAssignableFrom(cls)) {
                apc = new apc(imageView);
            } else if (Bitmap.class.equals(cls)) {
                apc = new apa(imageView);
            } else if (Drawable.class.isAssignableFrom(cls)) {
                apc = new apb(imageView);
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unhandled class: ");
                stringBuilder.append(cls);
                stringBuilder.append(", try .as*(Class).transcode(ResourceTranscoder)");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return a(apc);
        }
        throw new IllegalArgumentException("You must pass in a non null View");
    }

    public final <Y extends api<TranscodeType>> Y a(Y y) {
        aps.a();
        if (this.j) {
            aob aob;
            aol e = y.e();
            if (e != null) {
                aob = this.e;
                aob.a.remove(e);
                aob.b.remove(e);
                e.c();
                e.a();
            }
            if (this.r == null) {
                this.r = aia.NORMAL;
            }
            e = a(y, null);
            y.a(e);
            this.f.a(y);
            aob = this.e;
            aob.a.add(e);
            if (aob.c) {
                aob.b.add(e);
            } else {
                e.b();
            }
            return y;
        }
        throw new IllegalArgumentException("You must first set a model (try #load())");
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> b(int i, int i2) {
        if (aps.a(i, i2)) {
            this.v = i;
            this.u = i2;
            return this;
        }
        throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> b(aiq<DataType, ResourceType> aiq) {
        aoe aoe = this.g;
        if (aoe != null) {
            aoe.a = aiq;
        }
        return this;
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> b(aon<? super ModelType, TranscodeType> aon) {
        this.m = aon;
        return this;
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> b(ais<ResourceType>... aisArr) {
        this.y = true;
        if (aisArr.length == 1) {
            this.x = aisArr[0];
        } else {
            this.x = new aip(aisArr);
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public void b() {
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> c(Drawable drawable) {
        this.q = drawable;
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public void c() {
    }

    /* renamed from: d */
    public aht<ModelType, DataType, ResourceType, TranscodeType> clone() {
        try {
            aht aht = (aht) super.clone();
            aht.g = this.g != null ? this.g.clone() : null;
            return aht;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> d(int i) {
        this.l = i;
        return this;
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> d(Drawable drawable) {
        this.p = drawable;
        return this;
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> e() {
        return b((alt) alt.a);
    }

    public aht<ModelType, DataType, ResourceType, TranscodeType> e(int i) {
        this.k = i;
        return this;
    }
}
