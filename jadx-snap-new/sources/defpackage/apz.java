package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.Log;
import com.brightcove.player.captioning.preferences.CaptionConstants;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.TakeSnapButton;
import defpackage.apt.e;
import defpackage.apy.a;
import defpackage.apy.aa;
import defpackage.apy.ab;
import defpackage.apy.ac;
import defpackage.apy.ad;
import defpackage.apy.ad.b;
import defpackage.apy.ad.c;
import defpackage.apy.ad.d;
import defpackage.apy.ae;
import defpackage.apy.af;
import defpackage.apy.ai;
import defpackage.apy.aj;
import defpackage.apy.ak;
import defpackage.apy.al;
import defpackage.apy.am;
import defpackage.apy.an;
import defpackage.apy.ap;
import defpackage.apy.ar;
import defpackage.apy.av;
import defpackage.apy.ax;
import defpackage.apy.ay;
import defpackage.apy.bb;
import defpackage.apy.bc;
import defpackage.apy.bd;
import defpackage.apy.f;
import defpackage.apy.h;
import defpackage.apy.i;
import defpackage.apy.j;
import defpackage.apy.k;
import defpackage.apy.l;
import defpackage.apy.o;
import defpackage.apy.r;
import defpackage.apy.t;
import defpackage.apy.u;
import defpackage.apy.v;
import defpackage.apy.w;
import defpackage.apy.x;
import defpackage.apy.y;
import defpackage.apy.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* renamed from: apz */
public final class apz {
    private static HashSet<String> l;
    Canvas a;
    float b;
    g c;
    private a d;
    private boolean e;
    private apy f;
    private Stack<g> g;
    private Stack<ai> h;
    private Stack<Matrix> i;
    private Stack<Canvas> j;
    private Stack<Bitmap> k;

    /* renamed from: apz$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] b = new int[c.a().length];
        static final /* synthetic */ int[] c = new int[d.a().length];
        static final /* synthetic */ int[] d = new int[ad.a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0037 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0087 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        static {
            /*
            r0 = defpackage.apy.ad.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            d = r0;
            r0 = 1;
            r1 = d;	 Catch:{ NoSuchFieldError -> 0x000e }
            r1[r0] = r0;	 Catch:{ NoSuchFieldError -> 0x000e }
        L_0x000e:
            r1 = 0;
            r2 = 2;
            r3 = d;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r3[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r3 = defpackage.apy.ad.d.a();
            r3 = r3.length;
            r3 = new int[r3];
            c = r3;
            r3 = c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r3 = c;	 Catch:{ NoSuchFieldError -> 0x0025 }
            r3[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x0025 }
        L_0x0025:
            r3 = 3;
            r4 = c;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r4 = defpackage.apy.ad.c.a();
            r4 = r4.length;
            r4 = new int[r4];
            b = r4;
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0037 }
            r4[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0037 }
        L_0x0037:
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x003b }
            r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x003b }
        L_0x003b:
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x003f }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x003f }
        L_0x003f:
            r1 = defpackage.apw.a.values();
            r1 = r1.length;
            r1 = new int[r1];
            a = r1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = defpackage.apw.a.XMidYMin;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r1[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = defpackage.apw.a.XMidYMid;	 Catch:{ NoSuchFieldError -> 0x005c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r1 = defpackage.apw.a.XMidYMax;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0066 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0066 }
        L_0x0066:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = defpackage.apw.a.XMaxYMin;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0071 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0071 }
        L_0x0071:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = defpackage.apw.a.XMaxYMid;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007c }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007c }
        L_0x007c:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = defpackage.apw.a.XMaxYMax;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0087 }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0087 }
        L_0x0087:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r1 = defpackage.apw.a.XMinYMid;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0092 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0092 }
        L_0x0092:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x009e }
            r1 = defpackage.apw.a.XMinYMax;	 Catch:{ NoSuchFieldError -> 0x009e }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x009e }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x009e }
        L_0x009e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.apz$1.<clinit>():void");
        }
    }

    /* renamed from: apz$b */
    class b {
        public float a;
        public float b;
        public float c = MapboxConstants.MINIMUM_ZOOM;
        public float d = MapboxConstants.MINIMUM_ZOOM;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != 0.0d) {
                double d = (double) f3;
                Double.isNaN(d);
                this.c = (float) (d / sqrt);
                d = (double) f4;
                Double.isNaN(d);
                this.d = (float) (d / sqrt);
            }
        }

        public final void a(float f, float f2) {
            f -= this.a;
            f2 -= this.b;
            double sqrt = Math.sqrt((double) ((f * f) + (f2 * f2)));
            if (sqrt != 0.0d) {
                float f3 = this.c;
                double d = (double) f;
                Double.isNaN(d);
                this.c = f3 + ((float) (d / sqrt));
                f = this.d;
                double d2 = (double) f2;
                Double.isNaN(d2);
                this.d = f + ((float) (d2 / sqrt));
            }
        }

        public final void a(b bVar) {
            this.c += bVar.c;
            this.d += bVar.d;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("(");
            stringBuilder.append(this.a);
            String str = ppy.b;
            stringBuilder.append(str);
            stringBuilder.append(this.b);
            stringBuilder.append(" ");
            stringBuilder.append(this.c);
            stringBuilder.append(str);
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: apz$g */
    class g implements Cloneable {
        public ad a;
        public boolean b;
        public boolean c;
        public Paint d = new Paint();
        public Paint e;
        public a f;
        public a g;
        public boolean h;
        public boolean i;

        public g() {
            this.d.setFlags(385);
            this.d.setStyle(Style.FILL);
            this.d.setTypeface(Typeface.DEFAULT);
            this.e = new Paint();
            this.e.setFlags(385);
            this.e.setStyle(Style.STROKE);
            this.e.setTypeface(Typeface.DEFAULT);
            this.a = ad.a();
        }

        /* Access modifiers changed, original: protected|final */
        public final Object clone() {
            try {
                g gVar = (g) super.clone();
                gVar.a = (ad) this.a.clone();
                gVar.d = new Paint(this.d);
                gVar.e = new Paint(this.e);
                return gVar;
            } catch (CloneNotSupportedException e) {
                throw new InternalError(e.toString());
            }
        }
    }

    /* renamed from: apz$i */
    abstract class i {
        private i() {
        }

        /* synthetic */ i(apz apz, byte b) {
            this();
        }

        public abstract void a(String str);

        public boolean a(ax axVar) {
            return true;
        }
    }

    /* renamed from: apz$a */
    class a implements w {
        List<b> a = new ArrayList();
        private float b;
        private float c;
        private b d = null;
        private boolean e = false;
        private boolean f = true;
        private int g = -1;
        private boolean h;

        public a(v vVar) {
            if (vVar != null) {
                vVar.a((w) this);
                if (this.h) {
                    this.d.a((b) this.a.get(this.g));
                    this.a.set(this.g, this.d);
                    this.h = false;
                }
                b bVar = this.d;
                if (bVar != null) {
                    this.a.add(bVar);
                }
            }
        }

        public final void a() {
            this.a.add(this.d);
            b(this.b, this.c);
            this.h = true;
        }

        public final void a(float f, float f2) {
            if (this.h) {
                this.d.a((b) this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = false;
            }
            b bVar = this.d;
            if (bVar != null) {
                this.a.add(bVar);
            }
            this.b = f;
            this.c = f2;
            this.d = new b(f, f2, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
            this.g = this.a.size();
        }

        public final void a(float f, float f2, float f3, float f4) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.d = new b(f3, f4, f3 - f, f4 - f2);
            this.h = false;
        }

        public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f || this.e) {
                this.d.a(f, f2);
                this.a.add(this.d);
                this.e = false;
            }
            this.d = new b(f5, f6, f5 - f3, f6 - f4);
            this.h = false;
        }

        public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.e = true;
            this.f = false;
            apz.a(this.d.a, this.d.b, f, f2, f3, z, z2, f4, f5, this);
            this.f = true;
            this.h = false;
        }

        public final void b(float f, float f2) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.d = new b(f, f2, f - this.d.a, f2 - this.d.b);
            this.h = false;
        }
    }

    /* renamed from: apz$c */
    class c implements w {
        Path a = new Path();
        private float b;
        private float c;

        public c(v vVar) {
            if (vVar != null) {
                vVar.a((w) this);
            }
        }

        public final void a() {
            this.a.close();
        }

        public final void a(float f, float f2) {
            this.a.moveTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        public final void a(float f, float f2, float f3, float f4) {
            this.a.quadTo(f, f2, f3, f4);
            this.b = f3;
            this.c = f4;
        }

        public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a.cubicTo(f, f2, f3, f4, f5, f6);
            this.b = f5;
            this.c = f6;
        }

        public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            apz.a(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.b = f4;
            this.c = f5;
        }

        public final void b(float f, float f2) {
            this.a.lineTo(f, f2);
            this.b = f;
            this.c = f2;
        }
    }

    /* renamed from: apz$e */
    class e extends i {
        public float a;
        public float b;

        public e(float f, float f2) {
            super(apz.this, (byte) 0);
            this.a = f;
            this.b = f2;
        }

        public void a(String str) {
            if (apz.this.c()) {
                if (apz.this.c.b) {
                    apz.this.a.drawText(str, this.a, this.b, apz.this.c.d);
                }
                if (apz.this.c.c) {
                    apz.this.a.drawText(str, this.a, this.b, apz.this.c.e);
                }
            }
            this.a += apz.this.c.d.measureText(str);
        }
    }

    /* renamed from: apz$f */
    class f extends i {
        private float a;
        private float b;
        private Path c;

        public f(float f, float f2, Path path) {
            super(apz.this, (byte) 0);
            this.a = f;
            this.b = f2;
            this.c = path;
        }

        public final void a(String str) {
            if (apz.this.c()) {
                Path path = new Path();
                apz.this.c.d.getTextPath(str, 0, str.length(), this.a, this.b, path);
                this.c.addPath(path);
            }
            this.a += apz.this.c.d.measureText(str);
        }

        public final boolean a(ax axVar) {
            if (!(axVar instanceof ay)) {
                return true;
            }
            apz.a("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }
    }

    /* renamed from: apz$h */
    class h extends i {
        RectF a = new RectF();
        private float b;
        private float c;

        public h(float f, float f2) {
            super(apz.this, (byte) 0);
            this.b = f;
            this.c = f2;
        }

        public final void a(String str) {
            if (apz.this.c()) {
                Rect rect = new Rect();
                apz.this.c.d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.b, this.c);
                this.a.union(rectF);
            }
            this.b += apz.this.c.d.measureText(str);
        }

        public final boolean a(ax axVar) {
            if (!(axVar instanceof ay)) {
                return true;
            }
            am b = axVar.p.b(((ay) axVar).a);
            if (b == null) {
                apz.b("TextPath path reference '%s' not found", r0.a);
                return false;
            }
            u uVar = (u) b;
            Path path = new c(uVar.a).a;
            if (uVar.e != null) {
                path.transform(uVar.e);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.a.union(rectF);
            return false;
        }
    }

    /* renamed from: apz$j */
    class j extends i {
        public float a;

        private j() {
            super(apz.this, (byte) 0);
            this.a = MapboxConstants.MINIMUM_ZOOM;
        }

        /* synthetic */ j(apz apz, byte b) {
            this();
        }

        public final void a(String str) {
            this.a += apz.this.c.d.measureText(str);
        }
    }

    /* renamed from: apz$d */
    class d extends e {
        private Path c;

        public d(Path path, float f) {
            super(f, MapboxConstants.MINIMUM_ZOOM);
            this.c = path;
        }

        public final void a(String str) {
            if (apz.this.c()) {
                if (apz.this.c.b) {
                    apz.this.a.drawTextOnPath(str, this.c, this.a, this.b, apz.this.c.d);
                }
                if (apz.this.c.c) {
                    apz.this.a.drawTextOnPath(str, this.c, this.a, this.b, apz.this.c.e);
                }
            }
            this.a += apz.this.c.d.measureText(str);
        }
    }

    protected apz(Canvas canvas, a aVar, float f) {
        this.a = canvas;
        this.b = f;
        this.d = aVar;
    }

    private float a(ax axVar) {
        i jVar = new j(this, (byte) 0);
        a(axVar, jVar);
        return jVar.a;
    }

    private static int a(float f) {
        int i = (int) (f * 256.0f);
        return i < 0 ? 0 : i > 255 ? 255 : i;
    }

    /* JADX WARNING: Missing block: B:17:0x005f, code skipped:
            r3 = r3 - r7;
     */
    /* JADX WARNING: Missing block: B:29:0x007a, code skipped:
            if (r11 != 8) goto L_0x0086;
     */
    private static android.graphics.Matrix a(defpackage.apy.a r9, defpackage.apy.a r10, defpackage.apw r11) {
        /*
        r0 = new android.graphics.Matrix;
        r0.<init>();
        if (r11 == 0) goto L_0x0091;
    L_0x0007:
        r1 = r11.a;
        if (r1 != 0) goto L_0x000d;
    L_0x000b:
        goto L_0x0091;
    L_0x000d:
        r1 = r9.c;
        r2 = r10.c;
        r1 = r1 / r2;
        r2 = r9.d;
        r3 = r10.d;
        r2 = r2 / r3;
        r3 = r10.a;
        r3 = -r3;
        r4 = r10.b;
        r4 = -r4;
        r5 = defpackage.apw.c;
        r5 = r11.equals(r5);
        if (r5 == 0) goto L_0x0033;
    L_0x0025:
        r10 = r9.a;
        r9 = r9.b;
        r0.preTranslate(r10, r9);
        r0.preScale(r1, r2);
    L_0x002f:
        r0.preTranslate(r3, r4);
        return r0;
    L_0x0033:
        r5 = r11.b;
        r6 = 2;
        if (r5 != r6) goto L_0x003d;
    L_0x0038:
        r1 = java.lang.Math.max(r1, r2);
        goto L_0x0041;
    L_0x003d:
        r1 = java.lang.Math.min(r1, r2);
    L_0x0041:
        r2 = r9.c;
        r2 = r2 / r1;
        r5 = r9.d;
        r5 = r5 / r1;
        r7 = defpackage.apz.1.a;
        r8 = r11.a;
        r8 = r8.ordinal();
        r7 = r7[r8];
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        switch(r7) {
            case 1: goto L_0x005b;
            case 2: goto L_0x005b;
            case 3: goto L_0x005b;
            case 4: goto L_0x0057;
            case 5: goto L_0x0057;
            case 6: goto L_0x0057;
            default: goto L_0x0056;
        };
    L_0x0056:
        goto L_0x0060;
    L_0x0057:
        r7 = r10.c;
        r7 = r7 - r2;
        goto L_0x005f;
    L_0x005b:
        r7 = r10.c;
        r7 = r7 - r2;
        r7 = r7 / r8;
    L_0x005f:
        r3 = r3 - r7;
    L_0x0060:
        r2 = defpackage.apz.1.a;
        r11 = r11.a;
        r11 = r11.ordinal();
        r11 = r2[r11];
        if (r11 == r6) goto L_0x0081;
    L_0x006c:
        r2 = 3;
        if (r11 == r2) goto L_0x007d;
    L_0x006f:
        r2 = 5;
        if (r11 == r2) goto L_0x0081;
    L_0x0072:
        r2 = 6;
        if (r11 == r2) goto L_0x007d;
    L_0x0075:
        r2 = 7;
        if (r11 == r2) goto L_0x0081;
    L_0x0078:
        r2 = 8;
        if (r11 == r2) goto L_0x007d;
    L_0x007c:
        goto L_0x0086;
    L_0x007d:
        r10 = r10.d;
        r10 = r10 - r5;
        goto L_0x0085;
    L_0x0081:
        r10 = r10.d;
        r10 = r10 - r5;
        r10 = r10 / r8;
    L_0x0085:
        r4 = r4 - r10;
    L_0x0086:
        r10 = r9.a;
        r9 = r9.b;
        r0.preTranslate(r10, r9);
        r0.preScale(r1, r1);
        goto L_0x002f;
    L_0x0091:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apz.a(apy$a, apy$a, apw):android.graphics.Matrix");
    }

    private Path a(aa aaVar) {
        float f;
        float f2;
        Path path;
        aa aaVar2 = aaVar;
        if (aaVar2.f == null && aaVar2.g == null) {
            f = MapboxConstants.MINIMUM_ZOOM;
            f2 = MapboxConstants.MINIMUM_ZOOM;
        } else {
            if (aaVar2.f == null) {
                f = aaVar2.g.b(this);
            } else if (aaVar2.g == null) {
                f = aaVar2.f.a(this);
            } else {
                f = aaVar2.f.a(this);
                f2 = aaVar2.g.b(this);
            }
            f2 = f;
        }
        f = Math.min(f, aaVar2.c.a(this) / 2.0f);
        f2 = Math.min(f2, aaVar2.d.b(this) / 2.0f);
        float a = aaVar2.a != null ? aaVar2.a.a(this) : MapboxConstants.MINIMUM_ZOOM;
        float b = aaVar2.b != null ? aaVar2.b.b(this) : MapboxConstants.MINIMUM_ZOOM;
        float a2 = aaVar2.c.a(this);
        float b2 = aaVar2.d.b(this);
        if (aaVar2.j == null) {
            aaVar2.j = new a(a, b, a2, b2);
        }
        float f3 = a + a2;
        float f4 = b + b2;
        Path path2 = new Path();
        if (f == MapboxConstants.MINIMUM_ZOOM || f2 == MapboxConstants.MINIMUM_ZOOM) {
            path = path2;
            path.moveTo(a, b);
            path.lineTo(f3, b);
            path.lineTo(f3, f4);
            path.lineTo(a, f4);
        } else {
            float f5 = f * 0.5522848f;
            float f6 = 0.5522848f * f2;
            float f7 = b + f2;
            path2.moveTo(a, f7);
            float f8 = f7 - f6;
            float f9 = a + f;
            float f10 = f9 - f5;
            float f11 = f9;
            float f12 = f7;
            path2.cubicTo(a, f8, f10, b, f9, b);
            f = f3 - f;
            path2.lineTo(f, b);
            a2 = f + f5;
            b = f12;
            path2.cubicTo(a2, b, f3, f8, f3, b);
            f7 = f4 - f2;
            path2.lineTo(f3, f7);
            f6 += f7;
            path = path2;
            path2.cubicTo(f3, f6, a2, f4, f, f4);
            path.lineTo(f11, f4);
            path.cubicTo(f10, f4, a, f6, a, f7);
        }
        path.lineTo(a, b);
        path.close();
        return path;
    }

    private Path a(apy.c cVar) {
        apy.c cVar2 = cVar;
        o oVar = cVar2.a;
        float f = MapboxConstants.MINIMUM_ZOOM;
        float a = oVar != null ? cVar2.a.a(this) : MapboxConstants.MINIMUM_ZOOM;
        if (cVar2.b != null) {
            f = cVar2.b.b(this);
        }
        float c = cVar2.c.c(this);
        float f2 = a - c;
        float f3 = f - c;
        float f4 = a + c;
        float f5 = f + c;
        if (cVar2.j == null) {
            float f6 = 2.0f * c;
            cVar2.j = new a(f2, f3, f6, f6);
        }
        float f7 = 0.5522848f * c;
        Path path = new Path();
        path.moveTo(a, f3);
        float f8 = a + f7;
        float f9 = f - f7;
        Path path2 = path;
        path2.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path2.cubicTo(f4, f10, f8, f5, a, f5);
        f7 = a - f7;
        path2.cubicTo(f7, f5, f2, f10, f2, f);
        path2.cubicTo(f2, f9, f7, f3, a, f3);
        path.close();
        return path;
    }

    private Path a(h hVar) {
        h hVar2 = hVar;
        o oVar = hVar2.a;
        float f = MapboxConstants.MINIMUM_ZOOM;
        float a = oVar != null ? hVar2.a.a(this) : MapboxConstants.MINIMUM_ZOOM;
        if (hVar2.b != null) {
            f = hVar2.b.b(this);
        }
        float a2 = hVar2.c.a(this);
        float b = hVar2.d.b(this);
        float f2 = a - a2;
        float f3 = f - b;
        float f4 = a + a2;
        float f5 = f + b;
        if (hVar2.j == null) {
            hVar2.j = new a(f2, f3, a2 * 2.0f, 2.0f * b);
        }
        float f6 = a2 * 0.5522848f;
        float f7 = 0.5522848f * b;
        Path path = new Path();
        path.moveTo(a, f3);
        float f8 = a + f6;
        float f9 = f - f7;
        Path path2 = path;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        f7 += f;
        Path path3 = path2;
        path3.cubicTo(f4, f7, f8, f5, a, f5);
        f4 = a - f6;
        path3.cubicTo(f4, f5, f2, f7, f2, f);
        path3.cubicTo(f2, f9, f4, f3, a, f3);
        path2.close();
        return path2;
    }

    private static Typeface a(String str, Integer num, int i) {
        Typeface typeface;
        int i2 = 1;
        Object obj = i == b.b ? 1 : null;
        if (num.intValue() <= TakeSnapButton.LONG_PRESS_TIME) {
            i2 = obj != null ? 2 : 0;
        } else if (obj != null) {
            i2 = 3;
        }
        if (str.equals("serif")) {
            typeface = Typeface.SERIF;
        } else {
            if (!str.equals(CaptionConstants.DEFAULT_TYPEFACE)) {
                if (str.equals("monospace")) {
                    typeface = Typeface.MONOSPACE;
                } else if (!(str.equals("cursive") || str.equals("fantasy"))) {
                    return null;
                }
            }
            typeface = Typeface.SANS_SERIF;
        }
        return Typeface.create(typeface, i2);
    }

    private g a(am amVar, g gVar) {
        ArrayList<ak> arrayList = new ArrayList();
        while (true) {
            if (amVar instanceof ak) {
                arrayList.add(0, (ak) amVar);
            }
            if (amVar.q == null) {
                break;
            }
            amVar = (am) amVar.q;
        }
        for (ak a : arrayList) {
            a(gVar, a);
        }
        gVar.g = this.f.a.s;
        if (gVar.g == null) {
            gVar.g = this.d;
        }
        gVar.f = this.d;
        gVar.i = this.c.i;
        return gVar;
    }

    private String a(String str, boolean z, boolean z2) {
        String str2;
        String str3 = " ";
        if (this.c.h) {
            str2 = "[\\n\\t]";
        } else {
            String str4 = "";
            str = str.replaceAll("\\n", str4).replaceAll("\\t", str3);
            if (z) {
                str = str.replaceAll("^\\s+", str4);
            }
            if (z2) {
                str = str.replaceAll("\\s+$", str4);
            }
            str2 = "\\s{2,}";
        }
        return str.replaceAll(str2, str3);
    }

    private List<b> a(y yVar) {
        y yVar2 = yVar;
        int length = yVar2.a.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        b bVar;
        ArrayList arrayList = new ArrayList();
        b bVar2 = new b(yVar2.a[0], yVar2.a[1], MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
        float f = MapboxConstants.MINIMUM_ZOOM;
        float f2 = MapboxConstants.MINIMUM_ZOOM;
        while (i < length) {
            f = yVar2.a[i];
            f2 = yVar2.a[i + 1];
            bVar.a(f, f2);
            arrayList.add(bVar);
            i += 2;
            bVar = new b(f, f2, f - bVar.a, f2 - bVar.b);
        }
        if (!(yVar2 instanceof z)) {
            arrayList.add(bVar);
        } else if (!(f == yVar2.a[0] || f2 == yVar2.a[1])) {
            float f3 = yVar2.a[0];
            float f4 = yVar2.a[1];
            bVar.a(f3, f4);
            arrayList.add(bVar);
            bVar2 = new b(f3, f4, f3 - bVar.a, f4 - bVar.b);
            bVar2.a((b) arrayList.get(0));
            arrayList.add(bVar2);
            arrayList.set(0, bVar2);
        }
        return arrayList;
    }

    private void a(float f, float f2, float f3, float f4) {
        f3 += f;
        f4 += f2;
        if (this.c.a.w != null) {
            f += this.c.a.w.d.a(this);
            f2 += this.c.a.w.a.b(this);
            f3 -= this.c.a.w.b.a(this);
            f4 -= this.c.a.w.c.b(this);
        }
        this.a.clipRect(f, f2, f3, f4);
    }

    static /* synthetic */ void a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, w wVar) {
        float f8 = f5;
        boolean z3 = z2;
        float f9 = f6;
        float f10 = f7;
        if (!(f == f9 && f2 == f10)) {
            float f11;
            w wVar2;
            if (f3 == MapboxConstants.MINIMUM_ZOOM) {
                f11 = f9;
                wVar2 = wVar;
            } else if (f4 == MapboxConstants.MINIMUM_ZOOM) {
                wVar2 = wVar;
                f11 = f9;
            } else {
                double d;
                float f12;
                float f13;
                float abs = Math.abs(f3);
                float abs2 = Math.abs(f4);
                double d2 = (double) f8;
                Double.isNaN(d2);
                d2 = (double) ((float) Math.toRadians(d2 % 360.0d));
                float cos = (float) Math.cos(d2);
                float sin = (float) Math.sin(d2);
                float f14 = (f - f9) / 2.0f;
                float f15 = (f2 - f10) / 2.0f;
                float f16 = (cos * f14) + (sin * f15);
                float f17 = ((-sin) * f14) + (f15 * cos);
                f14 = abs * abs;
                f15 = abs2 * abs2;
                float f18 = f16 * f16;
                float f19 = f17 * f17;
                float f20 = (f18 / f14) + (f19 / f15);
                if (f20 > 1.0f) {
                    d = (double) f20;
                    f12 = cos;
                    abs *= (float) Math.sqrt(d);
                    abs2 *= (float) Math.sqrt(d);
                    f14 = abs * abs;
                    f15 = abs2 * abs2;
                } else {
                    f12 = cos;
                }
                f20 = z == z3 ? -1.0f : 1.0f;
                cos = f14 * f15;
                f14 *= f19;
                f15 *= f18;
                f14 = ((cos - f14) - f15) / (f14 + f15);
                if (f14 < MapboxConstants.MINIMUM_ZOOM) {
                    f14 = MapboxConstants.MINIMUM_ZOOM;
                }
                double d3 = (double) f20;
                d = Math.sqrt((double) f14);
                Double.isNaN(d3);
                f14 = (float) (d3 * d);
                f20 = ((abs * f17) / abs2) * f14;
                f14 *= -((abs2 * f16) / abs);
                float f21 = ((f + f9) / 2.0f) + ((f12 * f20) - (sin * f14));
                cos = ((f2 + f10) / 2.0f) + ((sin * f20) + (f12 * f14));
                sin = (f16 - f20) / abs;
                float f22 = (f17 - f14) / abs2;
                f20 = ((-f17) - f14) / abs2;
                f14 = (sin * sin) + (f22 * f22);
                f = ((-f16) - f20) / abs;
                double d4 = (double) (f22 < MapboxConstants.MINIMUM_ZOOM ? -1.0f : 1.0f);
                f19 = abs;
                double acos = Math.acos((double) (sin / ((float) Math.sqrt((double) f14))));
                Double.isNaN(d4);
                float toDegrees = (float) Math.toDegrees(d4 * acos);
                f16 = (sin * f) + (f22 * f20);
                d2 = (double) ((sin * f20) - (f22 * f) < MapboxConstants.MINIMUM_ZOOM ? -1.0f : 1.0f);
                double acos2 = Math.acos((double) (f16 / ((float) Math.sqrt((double) (f14 * ((f * f) + (f20 * f20)))))));
                Double.isNaN(d2);
                d2 = Math.toDegrees(d2 * acos2);
                if (z3 || d2 <= 0.0d) {
                    d4 = 360.0d;
                    if (z3 && d2 < 0.0d) {
                        d2 += 360.0d;
                    }
                } else {
                    d4 = 360.0d;
                    d2 -= 360.0d;
                }
                d2 %= d4;
                int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
                acos = Math.toRadians((double) (toDegrees % 360.0f));
                d2 = Math.toRadians(d2);
                acos2 = (double) ceil;
                Double.isNaN(acos2);
                sin = (float) (d2 / acos2);
                acos2 = (double) sin;
                Double.isNaN(acos2);
                d4 = acos2 / 2.0d;
                double sin2 = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
                float[] fArr = new float[(ceil * 6)];
                int i = 0;
                int i2 = 0;
                while (i < ceil) {
                    int i3 = ceil;
                    double d5 = (double) (((float) i) * sin);
                    Double.isNaN(d5);
                    d5 += acos;
                    double cos2 = Math.cos(d5);
                    double sin3 = Math.sin(d5);
                    int i4 = i2 + 1;
                    double d6 = acos;
                    fArr[i2] = (float) (cos2 - (sin2 * sin3));
                    int i5 = i4 + 1;
                    f4 = f21;
                    f13 = cos;
                    fArr[i4] = (float) (sin3 + (cos2 * sin2));
                    Double.isNaN(acos2);
                    d5 += acos2;
                    double cos3 = Math.cos(d5);
                    d5 = Math.sin(d5);
                    int i6 = i5 + 1;
                    sin3 = acos2;
                    fArr[i5] = (float) (cos3 + (sin2 * d5));
                    i5 = i6 + 1;
                    fArr[i6] = (float) (d5 - (sin2 * cos3));
                    i6 = i5 + 1;
                    fArr[i5] = (float) cos3;
                    i2 = i6 + 1;
                    fArr[i6] = (float) d5;
                    i++;
                    acos = d6;
                    f21 = f4;
                    cos = f13;
                    f9 = f6;
                    ceil = i3;
                    acos2 = sin3;
                }
                f4 = f21;
                f13 = cos;
                Matrix matrix = new Matrix();
                matrix.postScale(f19, abs2);
                matrix.postRotate(f8);
                matrix.postTranslate(f21, cos);
                matrix.mapPoints(fArr);
                fArr[fArr.length - 2] = f6;
                fArr[fArr.length - 1] = f10;
                for (int i7 = 0; i7 < fArr.length; i7 += 6) {
                    wVar.a(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
                }
            }
            wVar2.b(f11, f10);
        }
    }

    private void a(Path path) {
        if (this.c.a.L == 2) {
            Matrix matrix = this.a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.a.setMatrix(new Matrix());
            Shader shader = this.c.e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.a.drawPath(path2, this.c.e);
            this.a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
            }
            return;
        }
        this.a.drawPath(path, this.c.e);
    }

    private void a(ae aeVar, o oVar, o oVar2) {
        a(aeVar, oVar, oVar2, aeVar.s, aeVar.r);
    }

    private void a(ae aeVar, o oVar, o oVar2, a aVar, apw apw) {
        if ((oVar == null || !oVar.a()) && (oVar2 == null || !oVar2.a())) {
            if (apw == null) {
                apw = aeVar.r != null ? aeVar.r : apw.d;
            }
            a(this.c, (ak) aeVar);
            if (m()) {
                float a;
                ai aiVar = aeVar.q;
                float f = MapboxConstants.MINIMUM_ZOOM;
                if (aiVar != null) {
                    a = aeVar.a != null ? aeVar.a.a(this) : MapboxConstants.MINIMUM_ZOOM;
                    if (aeVar.b != null) {
                        f = aeVar.b.b(this);
                    }
                } else {
                    a = MapboxConstants.MINIMUM_ZOOM;
                }
                a b = b();
                this.c.f = new a(a, f, oVar != null ? oVar.a(this) : b.c, oVar2 != null ? oVar2.b(this) : b.d);
                if (!this.c.a.v.booleanValue()) {
                    a(this.c.f.a, this.c.f.b, this.c.f.c, this.c.f.d);
                }
                a((aj) aeVar, this.c.f);
                if (aVar != null) {
                    this.a.concat(apz.a(this.c.f, aVar, apw));
                    this.c.g = aeVar.s;
                } else {
                    this.a.translate(a, f);
                }
                boolean g = g();
                n();
                a((ai) aeVar, true);
                if (g) {
                    b((aj) aeVar);
                }
                a((aj) aeVar);
            }
        }
    }

    private void a(ai aiVar) {
        this.h.push(aiVar);
        this.i.push(this.a.getMatrix());
    }

    private void a(ai aiVar, boolean z) {
        if (z) {
            a(aiVar);
        }
        for (am a : aiVar.a()) {
            a(a);
        }
        if (z) {
            f();
        }
    }

    private void a(aj ajVar) {
        if (ajVar.q != null && ajVar.j != null) {
            Matrix matrix = new Matrix();
            if (((Matrix) this.i.peek()).invert(matrix)) {
                r1 = new float[8];
                int i = 2;
                r1[2] = ajVar.j.a();
                r1[3] = ajVar.j.b;
                r1[4] = ajVar.j.a();
                r1[5] = ajVar.j.b();
                r1[6] = ajVar.j.a;
                r1[7] = ajVar.j.b();
                matrix.preConcat(this.a.getMatrix());
                matrix.mapPoints(r1);
                RectF rectF = new RectF(r1[0], r1[1], r1[0], r1[1]);
                while (i <= 6) {
                    if (r1[i] < rectF.left) {
                        rectF.left = r1[i];
                    }
                    if (r1[i] > rectF.right) {
                        rectF.right = r1[i];
                    }
                    int i2 = i + 1;
                    if (r1[i2] < rectF.top) {
                        rectF.top = r1[i2];
                    }
                    if (r1[i2] > rectF.bottom) {
                        rectF.bottom = r1[i2];
                    }
                    i += 2;
                }
                aj ajVar2 = (aj) this.h.peek();
                if (ajVar2.j == null) {
                    ajVar2.j = a.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
                ajVar2.j.a(a.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private void a(aj ajVar, Path path) {
        if (this.c.a.b instanceof t) {
            am b = this.f.b(((t) this.c.a.b).a);
            if (b instanceof x) {
                a(ajVar, path, (x) b);
                return;
            }
        }
        this.a.drawPath(path, this.c.d);
    }

    private void a(aj ajVar, Path path, x xVar) {
        float a;
        float b;
        float a2;
        float f;
        aj ajVar2 = ajVar;
        aj ajVar3 = xVar;
        Object obj = (ajVar3.a == null || !ajVar3.a.booleanValue()) ? null : 1;
        if (ajVar3.h != null) {
            apz.a((x) ajVar3, ajVar3.h);
        }
        if (obj != null) {
            a = ajVar3.d != null ? ajVar3.d.a(this) : MapboxConstants.MINIMUM_ZOOM;
            b = ajVar3.e != null ? ajVar3.e.b(this) : MapboxConstants.MINIMUM_ZOOM;
            a2 = ajVar3.f != null ? ajVar3.f.a(this) : MapboxConstants.MINIMUM_ZOOM;
            f = b;
            b = ajVar3.g != null ? ajVar3.g.b(this) : MapboxConstants.MINIMUM_ZOOM;
        } else {
            a = ((ajVar3.d != null ? ajVar3.d.a(this, 1.0f) : MapboxConstants.MINIMUM_ZOOM) * ajVar2.j.c) + ajVar2.j.a;
            b = (ajVar3.g != null ? ajVar3.g.a(this, 1.0f) : MapboxConstants.MINIMUM_ZOOM) * ajVar2.j.d;
            f = ((ajVar3.e != null ? ajVar3.e.a(this, 1.0f) : MapboxConstants.MINIMUM_ZOOM) * ajVar2.j.d) + ajVar2.j.b;
            a2 = (ajVar3.f != null ? ajVar3.f.a(this, 1.0f) : MapboxConstants.MINIMUM_ZOOM) * ajVar2.j.c;
        }
        if (a2 != MapboxConstants.MINIMUM_ZOOM && b != MapboxConstants.MINIMUM_ZOOM) {
            apw apw = ajVar3.r != null ? ajVar3.r : apw.d;
            d();
            this.a.clipPath(path);
            g gVar = new g();
            a(gVar, ad.a());
            gVar.a.v = Boolean.FALSE;
            this.c = a((am) ajVar3, gVar);
            a aVar = ajVar2.j;
            if (ajVar3.c != null) {
                this.a.concat(ajVar3.c);
                Matrix matrix = new Matrix();
                if (ajVar3.c.invert(matrix)) {
                    float[] fArr = new float[]{ajVar2.j.a, ajVar2.j.b, ajVar2.j.a(), ajVar2.j.b, ajVar2.j.a(), ajVar2.j.b(), ajVar2.j.a, ajVar2.j.b()};
                    matrix.mapPoints(fArr);
                    RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                    for (int i = 2; i <= 6; i += 2) {
                        if (fArr[i] < rectF.left) {
                            rectF.left = fArr[i];
                        }
                        if (fArr[i] > rectF.right) {
                            rectF.right = fArr[i];
                        }
                        int i2 = i + 1;
                        if (fArr[i2] < rectF.top) {
                            rectF.top = fArr[i2];
                        }
                        if (fArr[i2] > rectF.bottom) {
                            rectF.bottom = fArr[i2];
                        }
                    }
                    aVar = new a(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                }
            }
            a += ((float) Math.floor((double) ((aVar.a - a) / a2))) * a2;
            float a3 = aVar.a();
            float b2 = aVar.b();
            aVar = new a(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, a2, b);
            for (f += ((float) Math.floor((double) ((aVar.b - f) / b))) * b; f < b2; f += b) {
                for (float f2 = a; f2 < a3; f2 += a2) {
                    aVar.a = f2;
                    aVar.b = f;
                    d();
                    if (!this.c.a.v.booleanValue()) {
                        a(aVar.a, aVar.b, aVar.c, aVar.d);
                    }
                    if (ajVar3.s != null) {
                        this.a.concat(apz.a(aVar, ajVar3.s, apw));
                    } else {
                        Object obj2 = (ajVar3.b == null || ajVar3.b.booleanValue()) ? 1 : null;
                        this.a.translate(f2, f);
                        if (obj2 == null) {
                            this.a.scale(ajVar2.j.c, ajVar2.j.d);
                        }
                    }
                    boolean g = g();
                    for (am a4 : ajVar3.i) {
                        a(a4);
                    }
                    if (g) {
                        b(ajVar3);
                    }
                    e();
                }
            }
            e();
        }
    }

    private void a(aj ajVar, a aVar) {
        if (this.c.a.E != null) {
            am b = ajVar.p.b(this.c.a.E);
            if (b == null) {
                apz.b("ClipPath reference '%s' not found", this.c.a.E);
                return;
            }
            b = (apy.d) b;
            if (b.i.isEmpty()) {
                this.a.clipRect(0, 0, 0, 0);
                return;
            }
            Object obj = (b.a == null || b.a.booleanValue()) ? 1 : null;
            if ((ajVar instanceof l) && obj == null) {
                apz.a("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", ajVar.getClass().getSimpleName());
                return;
            }
            o();
            if (obj == null) {
                Matrix matrix = new Matrix();
                matrix.preTranslate(aVar.a, aVar.b);
                matrix.preScale(aVar.c, aVar.d);
                this.a.concat(matrix);
            }
            if (b.b != null) {
                this.a.concat(b.b);
            }
            this.c = c(b);
            d(b);
            Path path = new Path();
            for (am b2 : b2.i) {
                a(b2, true, path, new Matrix());
            }
            this.a.clipPath(path);
            p();
        }
    }

    private static void a(al alVar, al alVar2) {
        if (alVar.f == null) {
            alVar.f = alVar2.f;
        }
        if (alVar.g == null) {
            alVar.g = alVar2.g;
        }
        if (alVar.h == null) {
            alVar.h = alVar2.h;
        }
        if (alVar.i == null) {
            alVar.i = alVar2.i;
        }
    }

    /* JADX WARNING: Missing block: B:85:0x017d, code skipped:
            if (r1 == false) goto L_0x0182;
     */
    /* JADX WARNING: Missing block: B:86:0x017f, code skipped:
            b(r10);
     */
    /* JADX WARNING: Missing block: B:87:0x0182, code skipped:
            a(r10);
     */
    /* JADX WARNING: Missing block: B:96:0x01ad, code skipped:
            if (r0 != false) goto L_0x017f;
     */
    /* JADX WARNING: Missing block: B:105:0x01d6, code skipped:
            if (r0 != false) goto L_0x017f;
     */
    /* JADX WARNING: Missing block: B:155:0x02fb, code skipped:
            if (r0 != false) goto L_0x06ce;
     */
    /* JADX WARNING: Missing block: B:187:0x0384, code skipped:
            if (r1 != false) goto L_0x06ce;
     */
    /* JADX WARNING: Missing block: B:211:0x03e7, code skipped:
            if (r1 != false) goto L_0x06ce;
     */
    /* JADX WARNING: Missing block: B:231:0x043e, code skipped:
            if (r1 != false) goto L_0x06ce;
     */
    /* JADX WARNING: Missing block: B:255:0x04a1, code skipped:
            if (r1 != false) goto L_0x06ce;
     */
    /* JADX WARNING: Missing block: B:286:0x0539, code skipped:
            if (r0 != false) goto L_0x06ce;
     */
    /* JADX WARNING: Missing block: B:309:0x0597, code skipped:
            if (r1 != false) goto L_0x06ce;
     */
    /* JADX WARNING: Missing block: B:332:0x05f4, code skipped:
            if (r1 != false) goto L_0x06ce;
     */
    /* JADX WARNING: Missing block: B:373:0x06cc, code skipped:
            if (r1 != false) goto L_0x06ce;
     */
    private void a(defpackage.apy.am r10) {
        /*
        r9 = this;
        r0 = r10 instanceof defpackage.apy.s;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r9.d();
        r9.b(r10);
        r0 = r10 instanceof defpackage.apy.ae;
        if (r0 == 0) goto L_0x001a;
    L_0x000f:
        r10 = (defpackage.apy.ae) r10;
        r0 = r10.c;
        r1 = r10.d;
        r9.a(r10, r0, r1);
        goto L_0x06d1;
    L_0x001a:
        r0 = r10 instanceof defpackage.apy.bd;
        r1 = 0;
        r2 = 1;
        r3 = 0;
        if (r0 == 0) goto L_0x0187;
    L_0x0021:
        r10 = (defpackage.apy.bd) r10;
        r0 = r10.e;
        if (r0 == 0) goto L_0x002f;
    L_0x0027:
        r0 = r10.e;
        r0 = r0.a();
        if (r0 != 0) goto L_0x06d1;
    L_0x002f:
        r0 = r10.f;
        if (r0 == 0) goto L_0x003d;
    L_0x0033:
        r0 = r10.f;
        r0 = r0.a();
        if (r0 == 0) goto L_0x003d;
    L_0x003b:
        goto L_0x06d1;
    L_0x003d:
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x0048:
        r0 = r10.p;
        r4 = r10.a;
        r0 = r0.b(r4);
        if (r0 != 0) goto L_0x005f;
    L_0x0052:
        r0 = new java.lang.Object[r2];
        r10 = r10.a;
        r0[r1] = r10;
        r10 = "Use reference '%s' not found";
    L_0x005a:
        defpackage.apz.b(r10, r0);
        goto L_0x06d1;
    L_0x005f:
        r1 = r10.b;
        if (r1 == 0) goto L_0x006a;
    L_0x0063:
        r1 = r9.a;
        r4 = r10.b;
        r1.concat(r4);
    L_0x006a:
        r1 = new android.graphics.Matrix;
        r1.<init>();
        r4 = r10.c;
        if (r4 == 0) goto L_0x007a;
    L_0x0073:
        r4 = r10.c;
        r4 = r4.a(r9);
        goto L_0x007b;
    L_0x007a:
        r4 = 0;
    L_0x007b:
        r5 = r10.d;
        if (r5 == 0) goto L_0x0086;
    L_0x007f:
        r5 = r10.d;
        r5 = r5.b(r9);
        goto L_0x0087;
    L_0x0086:
        r5 = 0;
    L_0x0087:
        r1.preTranslate(r4, r5);
        r4 = r9.a;
        r4.concat(r1);
        r9.d(r10);
        r1 = r9.g();
        r9.a(r10);
        r4 = r0 instanceof defpackage.apy.ae;
        if (r4 == 0) goto L_0x00bc;
    L_0x009d:
        r9.d();
        r0 = (defpackage.apy.ae) r0;
        r2 = r10.e;
        if (r2 == 0) goto L_0x00a9;
    L_0x00a6:
        r2 = r10.e;
        goto L_0x00ab;
    L_0x00a9:
        r2 = r0.c;
    L_0x00ab:
        r3 = r10.f;
        if (r3 == 0) goto L_0x00b2;
    L_0x00af:
        r3 = r10.f;
        goto L_0x00b4;
    L_0x00b2:
        r3 = r0.d;
    L_0x00b4:
        r9.a(r0, r2, r3);
    L_0x00b7:
        r9.e();
        goto L_0x017a;
    L_0x00bc:
        r4 = r0 instanceof defpackage.apy.as;
        if (r4 == 0) goto L_0x0177;
    L_0x00c0:
        r4 = r10.e;
        r5 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        if (r4 == 0) goto L_0x00c9;
    L_0x00c6:
        r4 = r10.e;
        goto L_0x00d0;
    L_0x00c9:
        r4 = new apy$o;
        r6 = defpackage.apy.bc.percent;
        r4.<init>(r5, r6);
    L_0x00d0:
        r6 = r10.f;
        if (r6 == 0) goto L_0x00d7;
    L_0x00d4:
        r5 = r10.f;
        goto L_0x00df;
    L_0x00d7:
        r6 = new apy$o;
        r7 = defpackage.apy.bc.percent;
        r6.<init>(r5, r7);
        r5 = r6;
    L_0x00df:
        r9.d();
        r0 = (defpackage.apy.as) r0;
        if (r4 == 0) goto L_0x00ec;
    L_0x00e6:
        r6 = r4.a();
        if (r6 != 0) goto L_0x00b7;
    L_0x00ec:
        if (r5 == 0) goto L_0x00f5;
    L_0x00ee:
        r6 = r5.a();
        if (r6 == 0) goto L_0x00f5;
    L_0x00f4:
        goto L_0x00b7;
    L_0x00f5:
        r6 = r0.r;
        if (r6 == 0) goto L_0x00fc;
    L_0x00f9:
        r6 = r0.r;
        goto L_0x00fe;
    L_0x00fc:
        r6 = defpackage.apw.d;
    L_0x00fe:
        r7 = r9.c;
        r9.a(r7, r0);
        if (r4 == 0) goto L_0x010a;
    L_0x0105:
        r4 = r4.a(r9);
        goto L_0x0110;
    L_0x010a:
        r4 = r9.c;
        r4 = r4.f;
        r4 = r4.c;
    L_0x0110:
        if (r5 == 0) goto L_0x0117;
    L_0x0112:
        r5 = r5.a(r9);
        goto L_0x011d;
    L_0x0117:
        r5 = r9.c;
        r5 = r5.f;
        r5 = r5.d;
    L_0x011d:
        r7 = r9.c;
        r8 = new apy$a;
        r8.<init>(r3, r3, r4, r5);
        r7.f = r8;
        r3 = r9.c;
        r3 = r3.a;
        r3 = r3.v;
        r3 = r3.booleanValue();
        if (r3 != 0) goto L_0x014d;
    L_0x0132:
        r3 = r9.c;
        r3 = r3.f;
        r3 = r3.a;
        r4 = r9.c;
        r4 = r4.f;
        r4 = r4.b;
        r5 = r9.c;
        r5 = r5.f;
        r5 = r5.c;
        r7 = r9.c;
        r7 = r7.f;
        r7 = r7.d;
        r9.a(r3, r4, r5, r7);
    L_0x014d:
        r3 = r0.s;
        if (r3 == 0) goto L_0x0166;
    L_0x0151:
        r3 = r9.a;
        r4 = r9.c;
        r4 = r4.f;
        r5 = r0.s;
        r4 = defpackage.apz.a(r4, r5, r6);
        r3.concat(r4);
        r3 = r9.c;
        r4 = r0.s;
        r3.g = r4;
    L_0x0166:
        r3 = r9.g();
        r9.a(r0, r2);
        if (r3 == 0) goto L_0x0172;
    L_0x016f:
        r9.b(r0);
    L_0x0172:
        r9.a(r0);
        goto L_0x00b7;
    L_0x0177:
        r9.a(r0);
    L_0x017a:
        r9.f();
        if (r1 == 0) goto L_0x0182;
    L_0x017f:
        r9.b(r10);
    L_0x0182:
        r9.a(r10);
        goto L_0x06d1;
    L_0x0187:
        r0 = r10 instanceof defpackage.apy.ar;
        if (r0 == 0) goto L_0x01b0;
    L_0x018b:
        r10 = (defpackage.apy.ar) r10;
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x0198:
        r0 = r10.b;
        if (r0 == 0) goto L_0x01a3;
    L_0x019c:
        r0 = r9.a;
        r1 = r10.b;
        r0.concat(r1);
    L_0x01a3:
        r9.d(r10);
        r0 = r9.g();
        r9.a(r10);
        if (r0 == 0) goto L_0x0182;
    L_0x01af:
        goto L_0x017f;
    L_0x01b0:
        r0 = r10 instanceof defpackage.apy.l;
        if (r0 == 0) goto L_0x01d9;
    L_0x01b4:
        r10 = (defpackage.apy.l) r10;
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x01c1:
        r0 = r10.b;
        if (r0 == 0) goto L_0x01cc;
    L_0x01c5:
        r0 = r9.a;
        r1 = r10.b;
        r0.concat(r1);
    L_0x01cc:
        r9.d(r10);
        r0 = r9.g();
        r9.a(r10, r2);
        if (r0 == 0) goto L_0x0182;
    L_0x01d8:
        goto L_0x017f;
    L_0x01d9:
        r0 = r10 instanceof defpackage.apy.n;
        if (r0 == 0) goto L_0x02ff;
    L_0x01dd:
        r10 = (defpackage.apy.n) r10;
        r0 = r10.d;
        if (r0 == 0) goto L_0x06d1;
    L_0x01e3:
        r0 = r10.d;
        r0 = r0.a();
        if (r0 != 0) goto L_0x06d1;
    L_0x01eb:
        r0 = r10.e;
        if (r0 == 0) goto L_0x06d1;
    L_0x01ef:
        r0 = r10.e;
        r0 = r0.a();
        if (r0 == 0) goto L_0x01f9;
    L_0x01f7:
        goto L_0x06d1;
    L_0x01f9:
        r0 = r10.a;
        if (r0 == 0) goto L_0x06d1;
    L_0x01fd:
        r0 = r10.r;
        if (r0 == 0) goto L_0x0204;
    L_0x0201:
        r0 = r10.r;
        goto L_0x0206;
    L_0x0204:
        r0 = defpackage.apw.d;
    L_0x0206:
        r4 = r10.a;
        r5 = "data:";
        r5 = r4.startsWith(r5);
        r6 = 0;
        if (r5 != 0) goto L_0x0212;
    L_0x0211:
        goto L_0x0246;
    L_0x0212:
        r5 = r4.length();
        r7 = 14;
        if (r5 >= r7) goto L_0x021b;
    L_0x021a:
        goto L_0x0246;
    L_0x021b:
        r5 = 44;
        r5 = r4.indexOf(r5);
        r7 = -1;
        if (r5 == r7) goto L_0x0246;
    L_0x0224:
        r7 = 12;
        if (r5 >= r7) goto L_0x0229;
    L_0x0228:
        goto L_0x0246;
    L_0x0229:
        r7 = r5 + -7;
        r7 = r4.substring(r7, r5);
        r8 = ";base64";
        r7 = r8.equals(r7);
        if (r7 != 0) goto L_0x0238;
    L_0x0237:
        goto L_0x0246;
    L_0x0238:
        r5 = r5 + r2;
        r4 = r4.substring(r5);
        r4 = android.util.Base64.decode(r4, r1);
        r5 = r4.length;
        r6 = android.graphics.BitmapFactory.decodeByteArray(r4, r1, r5);
    L_0x0246:
        if (r6 == 0) goto L_0x06d1;
    L_0x0248:
        if (r6 != 0) goto L_0x0254;
    L_0x024a:
        r0 = new java.lang.Object[r2];
        r10 = r10.a;
        r0[r1] = r10;
        r10 = "Could not locate image '%s'";
        goto L_0x005a;
    L_0x0254:
        r1 = r9.c;
        r9.a(r1, r10);
        r1 = r9.m();
        if (r1 == 0) goto L_0x06d1;
    L_0x025f:
        r1 = r9.c();
        if (r1 == 0) goto L_0x06d1;
    L_0x0265:
        r1 = r10.f;
        if (r1 == 0) goto L_0x0270;
    L_0x0269:
        r1 = r9.a;
        r2 = r10.f;
        r1.concat(r2);
    L_0x0270:
        r1 = r10.b;
        if (r1 == 0) goto L_0x027b;
    L_0x0274:
        r1 = r10.b;
        r1 = r1.a(r9);
        goto L_0x027c;
    L_0x027b:
        r1 = 0;
    L_0x027c:
        r2 = r10.c;
        if (r2 == 0) goto L_0x0287;
    L_0x0280:
        r2 = r10.c;
        r2 = r2.b(r9);
        goto L_0x0288;
    L_0x0287:
        r2 = 0;
    L_0x0288:
        r4 = r10.d;
        r4 = r4.a(r9);
        r5 = r10.e;
        r5 = r5.a(r9);
        r7 = r9.c;
        r8 = new apy$a;
        r8.<init>(r1, r2, r4, r5);
        r7.f = r8;
        r1 = r9.c;
        r1 = r1.a;
        r1 = r1.v;
        r1 = r1.booleanValue();
        if (r1 != 0) goto L_0x02c4;
    L_0x02a9:
        r1 = r9.c;
        r1 = r1.f;
        r1 = r1.a;
        r2 = r9.c;
        r2 = r2.f;
        r2 = r2.b;
        r4 = r9.c;
        r4 = r4.f;
        r4 = r4.c;
        r5 = r9.c;
        r5 = r5.f;
        r5 = r5.d;
        r9.a(r1, r2, r4, r5);
    L_0x02c4:
        r1 = new apy$a;
        r2 = r6.getWidth();
        r2 = (float) r2;
        r4 = r6.getHeight();
        r4 = (float) r4;
        r1.<init>(r3, r3, r2, r4);
        r10.j = r1;
        r1 = r9.a;
        r2 = r9.c;
        r2 = r2.f;
        r4 = r10.j;
        r0 = defpackage.apz.a(r2, r4, r0);
        r1.concat(r0);
        r9.a(r10);
        r9.d(r10);
        r0 = r9.g();
        r9.n();
        r1 = r9.a;
        r2 = new android.graphics.Paint;
        r2.<init>();
        r1.drawBitmap(r6, r3, r3, r2);
        if (r0 == 0) goto L_0x06d1;
    L_0x02fd:
        goto L_0x06ce;
    L_0x02ff:
        r0 = r10 instanceof defpackage.apy.u;
        if (r0 == 0) goto L_0x0388;
    L_0x0303:
        r10 = (defpackage.apy.u) r10;
        r0 = r10.a;
        if (r0 == 0) goto L_0x06d1;
    L_0x0309:
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x0314:
        r0 = r9.c();
        if (r0 == 0) goto L_0x06d1;
    L_0x031a:
        r0 = r9.c;
        r0 = r0.c;
        if (r0 != 0) goto L_0x0326;
    L_0x0320:
        r0 = r9.c;
        r0 = r0.b;
        if (r0 == 0) goto L_0x06d1;
    L_0x0326:
        r0 = r10.e;
        if (r0 == 0) goto L_0x0331;
    L_0x032a:
        r0 = r9.a;
        r1 = r10.e;
        r0.concat(r1);
    L_0x0331:
        r0 = new apz$c;
        r1 = r10.a;
        r0.<init>(r1);
        r0 = r0.a;
        r1 = r10.j;
        if (r1 != 0) goto L_0x0344;
    L_0x033e:
        r1 = defpackage.apz.b(r0);
        r10.j = r1;
    L_0x0344:
        r9.a(r10);
        r9.c(r10);
        r9.d(r10);
        r1 = r9.g();
        r3 = r9.c;
        r3 = r3.b;
        if (r3 == 0) goto L_0x0378;
    L_0x0357:
        r3 = r9.c;
        r3 = r3.a;
        r3 = r3.c;
        if (r3 == 0) goto L_0x0370;
    L_0x035f:
        r3 = defpackage.apz.1.d;
        r4 = r9.c;
        r4 = r4.a;
        r4 = r4.c;
        r4 = r4 - r2;
        r3 = r3[r4];
        if (r3 == r2) goto L_0x036d;
    L_0x036c:
        goto L_0x0370;
    L_0x036d:
        r2 = android.graphics.Path.FillType.EVEN_ODD;
        goto L_0x0372;
    L_0x0370:
        r2 = android.graphics.Path.FillType.WINDING;
    L_0x0372:
        r0.setFillType(r2);
        r9.a(r10, r0);
    L_0x0378:
        r2 = r9.c;
        r2 = r2.c;
        if (r2 == 0) goto L_0x0381;
    L_0x037e:
        r9.a(r0);
    L_0x0381:
        r9.a(r10);
        if (r1 == 0) goto L_0x06d1;
    L_0x0386:
        goto L_0x06ce;
    L_0x0388:
        r0 = r10 instanceof defpackage.apy.aa;
        if (r0 == 0) goto L_0x03eb;
    L_0x038c:
        r10 = (defpackage.apy.aa) r10;
        r0 = r10.c;
        if (r0 == 0) goto L_0x06d1;
    L_0x0392:
        r0 = r10.d;
        if (r0 == 0) goto L_0x06d1;
    L_0x0396:
        r0 = r10.c;
        r0 = r0.a();
        if (r0 != 0) goto L_0x06d1;
    L_0x039e:
        r0 = r10.d;
        r0 = r0.a();
        if (r0 == 0) goto L_0x03a8;
    L_0x03a6:
        goto L_0x06d1;
    L_0x03a8:
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x03b3:
        r0 = r9.c();
        if (r0 == 0) goto L_0x06d1;
    L_0x03b9:
        r0 = r10.e;
        if (r0 == 0) goto L_0x03c4;
    L_0x03bd:
        r0 = r9.a;
        r1 = r10.e;
        r0.concat(r1);
    L_0x03c4:
        r0 = r9.a(r10);
        r9.a(r10);
        r9.c(r10);
        r9.d(r10);
        r1 = r9.g();
        r2 = r9.c;
        r2 = r2.b;
        if (r2 == 0) goto L_0x03de;
    L_0x03db:
        r9.a(r10, r0);
    L_0x03de:
        r2 = r9.c;
        r2 = r2.c;
        if (r2 == 0) goto L_0x03e7;
    L_0x03e4:
        r9.a(r0);
    L_0x03e7:
        if (r1 == 0) goto L_0x06d1;
    L_0x03e9:
        goto L_0x06ce;
    L_0x03eb:
        r0 = r10 instanceof defpackage.apy.c;
        if (r0 == 0) goto L_0x0442;
    L_0x03ef:
        r10 = (defpackage.apy.c) r10;
        r0 = r10.c;
        if (r0 == 0) goto L_0x06d1;
    L_0x03f5:
        r0 = r10.c;
        r0 = r0.a();
        if (r0 == 0) goto L_0x03ff;
    L_0x03fd:
        goto L_0x06d1;
    L_0x03ff:
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x040a:
        r0 = r9.c();
        if (r0 == 0) goto L_0x06d1;
    L_0x0410:
        r0 = r10.e;
        if (r0 == 0) goto L_0x041b;
    L_0x0414:
        r0 = r9.a;
        r1 = r10.e;
        r0.concat(r1);
    L_0x041b:
        r0 = r9.a(r10);
        r9.a(r10);
        r9.c(r10);
        r9.d(r10);
        r1 = r9.g();
        r2 = r9.c;
        r2 = r2.b;
        if (r2 == 0) goto L_0x0435;
    L_0x0432:
        r9.a(r10, r0);
    L_0x0435:
        r2 = r9.c;
        r2 = r2.c;
        if (r2 == 0) goto L_0x043e;
    L_0x043b:
        r9.a(r0);
    L_0x043e:
        if (r1 == 0) goto L_0x06d1;
    L_0x0440:
        goto L_0x06ce;
    L_0x0442:
        r0 = r10 instanceof defpackage.apy.h;
        if (r0 == 0) goto L_0x04a5;
    L_0x0446:
        r10 = (defpackage.apy.h) r10;
        r0 = r10.c;
        if (r0 == 0) goto L_0x06d1;
    L_0x044c:
        r0 = r10.d;
        if (r0 == 0) goto L_0x06d1;
    L_0x0450:
        r0 = r10.c;
        r0 = r0.a();
        if (r0 != 0) goto L_0x06d1;
    L_0x0458:
        r0 = r10.d;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0462;
    L_0x0460:
        goto L_0x06d1;
    L_0x0462:
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x046d:
        r0 = r9.c();
        if (r0 == 0) goto L_0x06d1;
    L_0x0473:
        r0 = r10.e;
        if (r0 == 0) goto L_0x047e;
    L_0x0477:
        r0 = r9.a;
        r1 = r10.e;
        r0.concat(r1);
    L_0x047e:
        r0 = r9.a(r10);
        r9.a(r10);
        r9.c(r10);
        r9.d(r10);
        r1 = r9.g();
        r2 = r9.c;
        r2 = r2.b;
        if (r2 == 0) goto L_0x0498;
    L_0x0495:
        r9.a(r10, r0);
    L_0x0498:
        r2 = r9.c;
        r2 = r2.c;
        if (r2 == 0) goto L_0x04a1;
    L_0x049e:
        r9.a(r0);
    L_0x04a1:
        if (r1 == 0) goto L_0x06d1;
    L_0x04a3:
        goto L_0x06ce;
    L_0x04a5:
        r0 = r10 instanceof defpackage.apy.p;
        if (r0 == 0) goto L_0x053d;
    L_0x04a9:
        r10 = (defpackage.apy.p) r10;
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x04b6:
        r0 = r9.c();
        if (r0 == 0) goto L_0x06d1;
    L_0x04bc:
        r0 = r9.c;
        r0 = r0.c;
        if (r0 == 0) goto L_0x06d1;
    L_0x04c2:
        r0 = r10.e;
        if (r0 == 0) goto L_0x04cd;
    L_0x04c6:
        r0 = r9.a;
        r1 = r10.e;
        r0.concat(r1);
    L_0x04cd:
        r0 = r10.a;
        if (r0 != 0) goto L_0x04d3;
    L_0x04d1:
        r0 = 0;
        goto L_0x04d9;
    L_0x04d3:
        r0 = r10.a;
        r0 = r0.a(r9);
    L_0x04d9:
        r1 = r10.b;
        if (r1 != 0) goto L_0x04df;
    L_0x04dd:
        r1 = 0;
        goto L_0x04e5;
    L_0x04df:
        r1 = r10.b;
        r1 = r1.b(r9);
    L_0x04e5:
        r2 = r10.c;
        if (r2 != 0) goto L_0x04eb;
    L_0x04e9:
        r2 = 0;
        goto L_0x04f1;
    L_0x04eb:
        r2 = r10.c;
        r2 = r2.a(r9);
    L_0x04f1:
        r4 = r10.d;
        if (r4 != 0) goto L_0x04f6;
    L_0x04f5:
        goto L_0x04fc;
    L_0x04f6:
        r3 = r10.d;
        r3 = r3.b(r9);
    L_0x04fc:
        r4 = r10.j;
        if (r4 != 0) goto L_0x051b;
    L_0x0500:
        r4 = new apy$a;
        r5 = java.lang.Math.min(r0, r1);
        r6 = java.lang.Math.min(r1, r3);
        r7 = r2 - r0;
        r7 = java.lang.Math.abs(r7);
        r8 = r3 - r1;
        r8 = java.lang.Math.abs(r8);
        r4.<init>(r5, r6, r7, r8);
        r10.j = r4;
    L_0x051b:
        r4 = new android.graphics.Path;
        r4.<init>();
        r4.moveTo(r0, r1);
        r4.lineTo(r2, r3);
        r9.a(r10);
        r9.c(r10);
        r9.d(r10);
        r0 = r9.g();
        r9.a(r4);
        r9.a(r10);
        if (r0 == 0) goto L_0x06d1;
    L_0x053b:
        goto L_0x06ce;
    L_0x053d:
        r0 = r10 instanceof defpackage.apy.z;
        r4 = 2;
        if (r0 == 0) goto L_0x059b;
    L_0x0542:
        r10 = (defpackage.apy.z) r10;
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x054f:
        r0 = r9.c();
        if (r0 == 0) goto L_0x06d1;
    L_0x0555:
        r0 = r9.c;
        r0 = r0.c;
        if (r0 != 0) goto L_0x0561;
    L_0x055b:
        r0 = r9.c;
        r0 = r0.b;
        if (r0 == 0) goto L_0x06d1;
    L_0x0561:
        r0 = r10.e;
        if (r0 == 0) goto L_0x056c;
    L_0x0565:
        r0 = r9.a;
        r1 = r10.e;
        r0.concat(r1);
    L_0x056c:
        r0 = r10.a;
        r0 = r0.length;
        if (r0 < r4) goto L_0x06d1;
    L_0x0571:
        r0 = r9.b(r10);
        r9.a(r10);
        r9.c(r10);
        r9.d(r10);
        r1 = r9.g();
        r2 = r9.c;
        r2 = r2.b;
        if (r2 == 0) goto L_0x058b;
    L_0x0588:
        r9.a(r10, r0);
    L_0x058b:
        r2 = r9.c;
        r2 = r2.c;
        if (r2 == 0) goto L_0x0594;
    L_0x0591:
        r9.a(r0);
    L_0x0594:
        r9.a(r10);
        if (r1 == 0) goto L_0x06d1;
    L_0x0599:
        goto L_0x06ce;
    L_0x059b:
        r0 = r10 instanceof defpackage.apy.y;
        if (r0 == 0) goto L_0x05f8;
    L_0x059f:
        r10 = (defpackage.apy.y) r10;
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x05ac:
        r0 = r9.c();
        if (r0 == 0) goto L_0x06d1;
    L_0x05b2:
        r0 = r9.c;
        r0 = r0.c;
        if (r0 != 0) goto L_0x05be;
    L_0x05b8:
        r0 = r9.c;
        r0 = r0.b;
        if (r0 == 0) goto L_0x06d1;
    L_0x05be:
        r0 = r10.e;
        if (r0 == 0) goto L_0x05c9;
    L_0x05c2:
        r0 = r9.a;
        r1 = r10.e;
        r0.concat(r1);
    L_0x05c9:
        r0 = r10.a;
        r0 = r0.length;
        if (r0 < r4) goto L_0x06d1;
    L_0x05ce:
        r0 = r9.b(r10);
        r9.a(r10);
        r9.c(r10);
        r9.d(r10);
        r1 = r9.g();
        r2 = r9.c;
        r2 = r2.b;
        if (r2 == 0) goto L_0x05e8;
    L_0x05e5:
        r9.a(r10, r0);
    L_0x05e8:
        r2 = r9.c;
        r2 = r2.c;
        if (r2 == 0) goto L_0x05f1;
    L_0x05ee:
        r9.a(r0);
    L_0x05f1:
        r9.a(r10);
        if (r1 == 0) goto L_0x06d1;
    L_0x05f6:
        goto L_0x06ce;
    L_0x05f8:
        r0 = r10 instanceof defpackage.apy.av;
        if (r0 == 0) goto L_0x06d1;
    L_0x05fc:
        r10 = (defpackage.apy.av) r10;
        r0 = r9.c;
        r9.a(r0, r10);
        r0 = r9.m();
        if (r0 == 0) goto L_0x06d1;
    L_0x0609:
        r0 = r10.a;
        if (r0 == 0) goto L_0x0614;
    L_0x060d:
        r0 = r9.a;
        r5 = r10.a;
        r0.concat(r5);
    L_0x0614:
        r0 = r10.b;
        if (r0 == 0) goto L_0x062e;
    L_0x0618:
        r0 = r10.b;
        r0 = r0.size();
        if (r0 != 0) goto L_0x0621;
    L_0x0620:
        goto L_0x062e;
    L_0x0621:
        r0 = r10.b;
        r0 = r0.get(r1);
        r0 = (defpackage.apy.o) r0;
        r0 = r0.a(r9);
        goto L_0x062f;
    L_0x062e:
        r0 = 0;
    L_0x062f:
        r5 = r10.c;
        if (r5 == 0) goto L_0x0649;
    L_0x0633:
        r5 = r10.c;
        r5 = r5.size();
        if (r5 != 0) goto L_0x063c;
    L_0x063b:
        goto L_0x0649;
    L_0x063c:
        r5 = r10.c;
        r5 = r5.get(r1);
        r5 = (defpackage.apy.o) r5;
        r5 = r5.b(r9);
        goto L_0x064a;
    L_0x0649:
        r5 = 0;
    L_0x064a:
        r6 = r10.d;
        if (r6 == 0) goto L_0x0664;
    L_0x064e:
        r6 = r10.d;
        r6 = r6.size();
        if (r6 != 0) goto L_0x0657;
    L_0x0656:
        goto L_0x0664;
    L_0x0657:
        r6 = r10.d;
        r6 = r6.get(r1);
        r6 = (defpackage.apy.o) r6;
        r6 = r6.a(r9);
        goto L_0x0665;
    L_0x0664:
        r6 = 0;
    L_0x0665:
        r7 = r10.e;
        if (r7 == 0) goto L_0x067e;
    L_0x0669:
        r7 = r10.e;
        r7 = r7.size();
        if (r7 != 0) goto L_0x0672;
    L_0x0671:
        goto L_0x067e;
    L_0x0672:
        r3 = r10.e;
        r1 = r3.get(r1);
        r1 = (defpackage.apy.o) r1;
        r3 = r1.b(r9);
    L_0x067e:
        r1 = r9.l();
        if (r1 == r2) goto L_0x068e;
    L_0x0684:
        r2 = r9.a(r10);
        if (r1 != r4) goto L_0x068d;
    L_0x068a:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r1;
    L_0x068d:
        r0 = r0 - r2;
    L_0x068e:
        r1 = r10.j;
        if (r1 != 0) goto L_0x06b5;
    L_0x0692:
        r1 = new apz$h;
        r1.<init>(r0, r5);
        r9.a(r10, r1);
        r2 = new apy$a;
        r4 = r1.a;
        r4 = r4.left;
        r7 = r1.a;
        r7 = r7.top;
        r8 = r1.a;
        r8 = r8.width();
        r1 = r1.a;
        r1 = r1.height();
        r2.<init>(r4, r7, r8, r1);
        r10.j = r2;
    L_0x06b5:
        r9.a(r10);
        r9.c(r10);
        r9.d(r10);
        r1 = r9.g();
        r2 = new apz$e;
        r0 = r0 + r6;
        r5 = r5 + r3;
        r2.<init>(r0, r5);
        r9.a(r10, r2);
        if (r1 == 0) goto L_0x06d1;
    L_0x06ce:
        r9.b(r10);
    L_0x06d1:
        r9.e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apz.a(apy$am):void");
    }

    private void a(am amVar, boolean z, Path path, Matrix matrix) {
        if (m()) {
            o();
            if (amVar instanceof bd) {
                if (z) {
                    a((bd) amVar, path, matrix);
                } else {
                    apz.b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (amVar instanceof u) {
                a((u) amVar, path, matrix);
            } else if (amVar instanceof av) {
                a((av) amVar, path, matrix);
            } else if (amVar instanceof k) {
                a((k) amVar, path, matrix);
            } else {
                apz.b("Invalid %s element found in clipPath definition", amVar.getClass().getSimpleName());
            }
            p();
        }
    }

    private static void a(ap apVar, ap apVar2) {
        if (apVar.f == null) {
            apVar.f = apVar2.f;
        }
        if (apVar.g == null) {
            apVar.g = apVar2.g;
        }
        if (apVar.h == null) {
            apVar.h = apVar2.h;
        }
        if (apVar.i == null) {
            apVar.i = apVar2.i;
        }
        if (apVar.j == null) {
            apVar.j = apVar2.j;
        }
    }

    private void a(ar arVar) {
        String language = Locale.getDefault().getLanguage();
        for (am amVar : arVar.i) {
            if (amVar instanceof af) {
                af afVar = (af) amVar;
                if (afVar.c() == null) {
                    Set d = afVar.d();
                    if (d == null || (!d.isEmpty() && d.contains(language))) {
                        d = afVar.b();
                        if (d != null) {
                            if (l == null) {
                                apz.k();
                            }
                            if (d.isEmpty()) {
                                continue;
                            } else if (!l.containsAll(d)) {
                                continue;
                            }
                        }
                        d = afVar.e();
                        boolean isEmpty;
                        if (d != null) {
                            isEmpty = d.isEmpty();
                        } else {
                            Set f = afVar.f();
                            if (f != null) {
                                isEmpty = f.isEmpty();
                            } else {
                                a(amVar);
                                return;
                            }
                        }
                    }
                }
                continue;
            }
        }
    }

    private void a(av avVar, Path path, Matrix matrix) {
        a(this.c, (ak) avVar);
        if (m()) {
            if (avVar.a != null) {
                matrix.preConcat(avVar.a);
            }
            List list = avVar.b;
            float f = MapboxConstants.MINIMUM_ZOOM;
            float a = (list == null || avVar.b.size() == 0) ? MapboxConstants.MINIMUM_ZOOM : ((o) avVar.b.get(0)).a(this);
            float b = (avVar.c == null || avVar.c.size() == 0) ? MapboxConstants.MINIMUM_ZOOM : ((o) avVar.c.get(0)).b(this);
            float a2 = (avVar.d == null || avVar.d.size() == 0) ? MapboxConstants.MINIMUM_ZOOM : ((o) avVar.d.get(0)).a(this);
            if (!(avVar.e == null || avVar.e.size() == 0)) {
                f = ((o) avVar.e.get(0)).b(this);
            }
            if (this.c.a.u != 1) {
                float a3 = a((ax) avVar);
                if (this.c.a.u == 2) {
                    a3 /= 2.0f;
                }
                a -= a3;
            }
            if (avVar.j == null) {
                i hVar = new h(a, b);
                a((ax) avVar, hVar);
                avVar.j = new a(hVar.a.left, hVar.a.top, hVar.a.width(), hVar.a.height());
            }
            d(avVar);
            Path path2 = new Path();
            a((ax) avVar, new f(a + a2, b + f, path2));
            path.setFillType(q());
            path.addPath(path2, matrix);
        }
    }

    /* JADX WARNING: Missing block: B:33:0x00b8, code skipped:
            if (r2 != false) goto L_0x0168;
     */
    /* JADX WARNING: Missing block: B:69:0x0166, code skipped:
            if (r2 != false) goto L_0x0168;
     */
    private void a(defpackage.apy.ax r11, defpackage.apz.i r12) {
        /*
        r10 = this;
        r0 = r10.m();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r11 = r11.i;
        r11 = r11.iterator();
        r0 = 1;
        r1 = 0;
        r2 = 1;
    L_0x0010:
        r3 = r11.hasNext();
        if (r3 == 0) goto L_0x01c0;
    L_0x0016:
        r3 = r11.next();
        r3 = (defpackage.apy.am) r3;
        r4 = r3 instanceof defpackage.apy.bb;
        if (r4 == 0) goto L_0x0032;
    L_0x0020:
        r3 = (defpackage.apy.bb) r3;
        r3 = r3.a;
        r4 = r11.hasNext();
        r4 = r4 ^ r0;
        r2 = r10.a(r3, r2, r4);
        r12.a(r2);
        goto L_0x01bd;
    L_0x0032:
        r2 = r3;
        r2 = (defpackage.apy.ax) r2;
        r2 = r12.a(r2);
        if (r2 == 0) goto L_0x01bd;
    L_0x003b:
        r2 = r3 instanceof defpackage.apy.ay;
        r4 = 0;
        if (r2 == 0) goto L_0x00bc;
    L_0x0040:
        r10.d();
        r3 = (defpackage.apy.ay) r3;
        r2 = r10.c;
        r10.a(r2, r3);
        r2 = r10.m();
        if (r2 == 0) goto L_0x016b;
    L_0x0050:
        r2 = r10.c();
        if (r2 == 0) goto L_0x016b;
    L_0x0056:
        r2 = r3.p;
        r5 = r3.a;
        r2 = r2.b(r5);
        if (r2 != 0) goto L_0x006d;
    L_0x0060:
        r2 = new java.lang.Object[r0];
        r3 = r3.a;
        r2[r1] = r3;
        r3 = "TextPath reference '%s' not found";
        defpackage.apz.b(r3, r2);
        goto L_0x016b;
    L_0x006d:
        r2 = (defpackage.apy.u) r2;
        r5 = new apz$c;
        r6 = r2.a;
        r5.<init>(r6);
        r5 = r5.a;
        r6 = r2.e;
        if (r6 == 0) goto L_0x0081;
    L_0x007c:
        r2 = r2.e;
        r5.transform(r2);
    L_0x0081:
        r2 = new android.graphics.PathMeasure;
        r2.<init>(r5, r1);
        r6 = r3.b;
        if (r6 == 0) goto L_0x0094;
    L_0x008a:
        r4 = r3.b;
        r2 = r2.getLength();
        r4 = r4.a(r10, r2);
    L_0x0094:
        r2 = r10.l();
        if (r2 == r0) goto L_0x00a5;
    L_0x009a:
        r6 = r10.a(r3);
        r7 = 2;
        if (r2 != r7) goto L_0x00a4;
    L_0x00a1:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 / r2;
    L_0x00a4:
        r4 = r4 - r6;
    L_0x00a5:
        r2 = r3.c;
        r2 = (defpackage.apy.aj) r2;
        r10.c(r2);
        r2 = r10.g();
        r6 = new apz$d;
        r6.<init>(r5, r4);
        r10.a(r3, r6);
        if (r2 == 0) goto L_0x016b;
    L_0x00ba:
        goto L_0x0168;
    L_0x00bc:
        r2 = r3 instanceof defpackage.apy.au;
        if (r2 == 0) goto L_0x016f;
    L_0x00c0:
        r10.d();
        r3 = (defpackage.apy.au) r3;
        r2 = r10.c;
        r10.a(r2, r3);
        r2 = r10.m();
        if (r2 == 0) goto L_0x016b;
    L_0x00d0:
        r2 = r12 instanceof defpackage.apz.e;
        if (r2 == 0) goto L_0x014a;
    L_0x00d4:
        r5 = r3.b;
        if (r5 == 0) goto L_0x00ee;
    L_0x00d8:
        r5 = r3.b;
        r5 = r5.size();
        if (r5 != 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00ee;
    L_0x00e1:
        r5 = r3.b;
        r5 = r5.get(r1);
        r5 = (defpackage.apy.o) r5;
        r5 = r5.a(r10);
        goto L_0x00f3;
    L_0x00ee:
        r5 = r12;
        r5 = (defpackage.apz.e) r5;
        r5 = r5.a;
    L_0x00f3:
        r6 = r3.c;
        if (r6 == 0) goto L_0x010d;
    L_0x00f7:
        r6 = r3.c;
        r6 = r6.size();
        if (r6 != 0) goto L_0x0100;
    L_0x00ff:
        goto L_0x010d;
    L_0x0100:
        r6 = r3.c;
        r6 = r6.get(r1);
        r6 = (defpackage.apy.o) r6;
        r6 = r6.b(r10);
        goto L_0x0112;
    L_0x010d:
        r6 = r12;
        r6 = (defpackage.apz.e) r6;
        r6 = r6.b;
    L_0x0112:
        r7 = r3.d;
        if (r7 == 0) goto L_0x012c;
    L_0x0116:
        r7 = r3.d;
        r7 = r7.size();
        if (r7 != 0) goto L_0x011f;
    L_0x011e:
        goto L_0x012c;
    L_0x011f:
        r7 = r3.d;
        r7 = r7.get(r1);
        r7 = (defpackage.apy.o) r7;
        r7 = r7.a(r10);
        goto L_0x012d;
    L_0x012c:
        r7 = 0;
    L_0x012d:
        r8 = r3.e;
        if (r8 == 0) goto L_0x0146;
    L_0x0131:
        r8 = r3.e;
        r8 = r8.size();
        if (r8 != 0) goto L_0x013a;
    L_0x0139:
        goto L_0x0146;
    L_0x013a:
        r4 = r3.e;
        r4 = r4.get(r1);
        r4 = (defpackage.apy.o) r4;
        r4 = r4.b(r10);
    L_0x0146:
        r9 = r5;
        r5 = r4;
        r4 = r9;
        goto L_0x014d;
    L_0x014a:
        r5 = 0;
        r6 = 0;
        r7 = 0;
    L_0x014d:
        r8 = r3.a;
        r8 = (defpackage.apy.aj) r8;
        r10.c(r8);
        if (r2 == 0) goto L_0x015f;
    L_0x0156:
        r2 = r12;
        r2 = (defpackage.apz.e) r2;
        r4 = r4 + r7;
        r2.a = r4;
        r6 = r6 + r5;
        r2.b = r6;
    L_0x015f:
        r2 = r10.g();
        r10.a(r3, r12);
        if (r2 == 0) goto L_0x016b;
    L_0x0168:
        r10.b(r3);
    L_0x016b:
        r10.e();
        goto L_0x01bd;
    L_0x016f:
        r2 = r3 instanceof defpackage.apy.at;
        if (r2 == 0) goto L_0x01bd;
    L_0x0173:
        r10.d();
        r2 = r3;
        r2 = (defpackage.apy.at) r2;
        r4 = r10.c;
        r10.a(r4, r2);
        r4 = r10.m();
        if (r4 == 0) goto L_0x016b;
    L_0x0184:
        r4 = r2.b;
        r4 = (defpackage.apy.aj) r4;
        r10.c(r4);
        r3 = r3.p;
        r4 = r2.a;
        r3 = r3.b(r4);
        if (r3 == 0) goto L_0x01b1;
    L_0x0195:
        r4 = r3 instanceof defpackage.apy.ax;
        if (r4 == 0) goto L_0x01b1;
    L_0x0199:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = (defpackage.apy.ax) r3;
        r10.a(r3, r2);
        r3 = r2.length();
        if (r3 <= 0) goto L_0x016b;
    L_0x01a9:
        r2 = r2.toString();
        r12.a(r2);
        goto L_0x016b;
    L_0x01b1:
        r3 = new java.lang.Object[r0];
        r2 = r2.a;
        r3[r1] = r2;
        r2 = "Tref reference '%s' not found";
        defpackage.apz.b(r2, r3);
        goto L_0x016b;
    L_0x01bd:
        r2 = 0;
        goto L_0x0010;
    L_0x01c0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apz.a(apy$ax, apz$i):void");
    }

    private void a(ax axVar, StringBuilder stringBuilder) {
        Iterator it = axVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof ax) {
                a((ax) amVar, stringBuilder);
            } else if (amVar instanceof bb) {
                stringBuilder.append(a(((bb) amVar).a, z, it.hasNext() ^ 1));
            }
            z = false;
        }
    }

    private void a(bd bdVar, Path path, Matrix matrix) {
        a(this.c, (ak) bdVar);
        if (m() && c()) {
            if (bdVar.b != null) {
                matrix.preConcat(bdVar.b);
            }
            am b = bdVar.p.b(bdVar.a);
            if (b == null) {
                apz.b("Use reference '%s' not found", bdVar.a);
                return;
            }
            d(bdVar);
            a(b, false, path, matrix);
        }
    }

    private static void a(i iVar, String str) {
        while (true) {
            am b = iVar.p.b(str);
            if (b == null) {
                apz.a("Gradient reference '%s' not found", str);
                return;
            } else if (!(b instanceof i)) {
                apz.b("Gradient href attributes must point to other gradient elements", new Object[0]);
                return;
            } else if (b == iVar) {
                apz.b("Circular reference in gradient href attribute '%s'", str);
                return;
            } else {
                i iVar2 = (i) b;
                if (iVar.b == null) {
                    iVar.b = iVar2.b;
                }
                if (iVar.c == null) {
                    iVar.c = iVar2.c;
                }
                if (iVar.d == null) {
                    iVar.d = iVar2.d;
                }
                if (iVar.a.isEmpty()) {
                    iVar.a = iVar2.a;
                }
                try {
                    if (iVar instanceof al) {
                        apz.a((al) iVar, (al) b);
                    } else {
                        apz.a((ap) iVar, (ap) b);
                    }
                } catch (ClassCastException unused) {
                }
                if (iVar2.e != null) {
                    str = iVar2.e;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0116 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0116 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0116 A:{RETURN} */
    private void a(defpackage.apy.k r19) {
        /*
        r18 = this;
        r6 = r18;
        r0 = r19;
        r1 = r6.c;
        r1 = r1.a;
        r1 = r1.x;
        if (r1 != 0) goto L_0x001d;
    L_0x000c:
        r1 = r6.c;
        r1 = r1.a;
        r1 = r1.y;
        if (r1 != 0) goto L_0x001d;
    L_0x0014:
        r1 = r6.c;
        r1 = r1.a;
        r1 = r1.z;
        if (r1 != 0) goto L_0x001d;
    L_0x001c:
        return;
    L_0x001d:
        r1 = r6.c;
        r1 = r1.a;
        r1 = r1.x;
        r2 = "Marker reference '%s' not found";
        r7 = 0;
        r8 = 0;
        r9 = 1;
        if (r1 == 0) goto L_0x0049;
    L_0x002a:
        r1 = r0.p;
        r3 = r6.c;
        r3 = r3.a;
        r3 = r3.x;
        r1 = r1.b(r3);
        if (r1 == 0) goto L_0x003c;
    L_0x0038:
        r1 = (defpackage.apy.q) r1;
        r10 = r1;
        goto L_0x004a;
    L_0x003c:
        r1 = new java.lang.Object[r9];
        r3 = r6.c;
        r3 = r3.a;
        r3 = r3.x;
        r1[r7] = r3;
        defpackage.apz.b(r2, r1);
    L_0x0049:
        r10 = r8;
    L_0x004a:
        r1 = r6.c;
        r1 = r1.a;
        r1 = r1.y;
        if (r1 == 0) goto L_0x0071;
    L_0x0052:
        r1 = r0.p;
        r3 = r6.c;
        r3 = r3.a;
        r3 = r3.y;
        r1 = r1.b(r3);
        if (r1 == 0) goto L_0x0064;
    L_0x0060:
        r1 = (defpackage.apy.q) r1;
        r11 = r1;
        goto L_0x0072;
    L_0x0064:
        r1 = new java.lang.Object[r9];
        r3 = r6.c;
        r3 = r3.a;
        r3 = r3.y;
        r1[r7] = r3;
        defpackage.apz.b(r2, r1);
    L_0x0071:
        r11 = r8;
    L_0x0072:
        r1 = r6.c;
        r1 = r1.a;
        r1 = r1.z;
        if (r1 == 0) goto L_0x0099;
    L_0x007a:
        r1 = r0.p;
        r3 = r6.c;
        r3 = r3.a;
        r3 = r3.z;
        r1 = r1.b(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0088:
        r1 = (defpackage.apy.q) r1;
        r12 = r1;
        goto L_0x009a;
    L_0x008c:
        r1 = new java.lang.Object[r9];
        r3 = r6.c;
        r3 = r3.a;
        r3 = r3.z;
        r1[r7] = r3;
        defpackage.apz.b(r2, r1);
    L_0x0099:
        r12 = r8;
    L_0x009a:
        r1 = r0 instanceof defpackage.apy.u;
        if (r1 == 0) goto L_0x00aa;
    L_0x009e:
        r1 = new apz$a;
        r0 = (defpackage.apy.u) r0;
        r0 = r0.a;
        r1.<init>(r0);
        r0 = r1.a;
        goto L_0x0114;
    L_0x00aa:
        r1 = r0 instanceof defpackage.apy.p;
        if (r1 == 0) goto L_0x010e;
    L_0x00ae:
        r0 = (defpackage.apy.p) r0;
        r1 = r0.a;
        r2 = 0;
        if (r1 == 0) goto L_0x00bd;
    L_0x00b5:
        r1 = r0.a;
        r1 = r1.a(r6);
        r3 = r1;
        goto L_0x00be;
    L_0x00bd:
        r3 = 0;
    L_0x00be:
        r1 = r0.b;
        if (r1 == 0) goto L_0x00ca;
    L_0x00c2:
        r1 = r0.b;
        r1 = r1.b(r6);
        r4 = r1;
        goto L_0x00cb;
    L_0x00ca:
        r4 = 0;
    L_0x00cb:
        r1 = r0.c;
        if (r1 == 0) goto L_0x00d7;
    L_0x00cf:
        r1 = r0.c;
        r1 = r1.a(r6);
        r13 = r1;
        goto L_0x00d8;
    L_0x00d7:
        r13 = 0;
    L_0x00d8:
        r1 = r0.d;
        if (r1 == 0) goto L_0x00e4;
    L_0x00dc:
        r0 = r0.d;
        r0 = r0.b(r6);
        r14 = r0;
        goto L_0x00e5;
    L_0x00e4:
        r14 = 0;
    L_0x00e5:
        r15 = new java.util.ArrayList;
        r0 = 2;
        r15.<init>(r0);
        r5 = new apz$b;
        r16 = r13 - r3;
        r17 = r14 - r4;
        r0 = r5;
        r1 = r18;
        r2 = r3;
        r3 = r4;
        r4 = r16;
        r9 = r5;
        r5 = r17;
        r0.<init>(r2, r3, r4, r5);
        r15.add(r9);
        r9 = new apz$b;
        r0 = r9;
        r2 = r13;
        r3 = r14;
        r0.<init>(r2, r3, r4, r5);
        r15.add(r9);
        r0 = r15;
        goto L_0x0114;
    L_0x010e:
        r0 = (defpackage.apy.y) r0;
        r0 = r6.a(r0);
    L_0x0114:
        if (r0 != 0) goto L_0x0117;
    L_0x0116:
        return;
    L_0x0117:
        r1 = r0.size();
        if (r1 != 0) goto L_0x011e;
    L_0x011d:
        return;
    L_0x011e:
        r2 = r6.c;
        r2 = r2.a;
        r3 = r6.c;
        r3 = r3.a;
        r4 = r6.c;
        r4 = r4.a;
        r4.z = r8;
        r3.y = r8;
        r2.x = r8;
        if (r10 == 0) goto L_0x013b;
    L_0x0132:
        r2 = r0.get(r7);
        r2 = (defpackage.apz.b) r2;
        r6.a(r10, r2);
    L_0x013b:
        if (r11 == 0) goto L_0x014e;
    L_0x013d:
        r2 = 1;
    L_0x013e:
        r3 = r1 + -1;
        if (r2 >= r3) goto L_0x014e;
    L_0x0142:
        r3 = r0.get(r2);
        r3 = (defpackage.apz.b) r3;
        r6.a(r11, r3);
        r2 = r2 + 1;
        goto L_0x013e;
    L_0x014e:
        if (r12 == 0) goto L_0x015b;
    L_0x0150:
        r2 = 1;
        r1 = r1 - r2;
        r0 = r0.get(r1);
        r0 = (defpackage.apz.b) r0;
        r6.a(r12, r0);
    L_0x015b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apz.a(apy$k):void");
    }

    private void a(k kVar, Path path, Matrix matrix) {
        a(this.c, (ak) kVar);
        if (m() && c()) {
            Path a;
            if (kVar.e != null) {
                matrix.preConcat(kVar.e);
            }
            if (kVar instanceof aa) {
                a = a((aa) kVar);
            } else if (kVar instanceof apy.c) {
                a = a((apy.c) kVar);
            } else if (kVar instanceof h) {
                a = a((h) kVar);
            } else {
                if (kVar instanceof y) {
                    a = b((y) kVar);
                }
            }
            d(kVar);
            path.setFillType(a.getFillType());
            path.addPath(a, matrix);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARNING: Missing block: B:48:0x00f1, code skipped:
            r13 = com.mapbox.mapboxsdk.constants.MapboxConstants.MINIMUM_ZOOM - r13;
     */
    /* JADX WARNING: Missing block: B:49:0x00f3, code skipped:
            r7 = defpackage.apz.1.a[r7.a.ordinal()];
     */
    /* JADX WARNING: Missing block: B:50:0x00fd, code skipped:
            if (r7 == 2) goto L_0x0113;
     */
    /* JADX WARNING: Missing block: B:52:0x0100, code skipped:
            if (r7 == 3) goto L_0x0110;
     */
    /* JADX WARNING: Missing block: B:54:0x0103, code skipped:
            if (r7 == 5) goto L_0x0113;
     */
    /* JADX WARNING: Missing block: B:56:0x0106, code skipped:
            if (r7 == 6) goto L_0x0110;
     */
    /* JADX WARNING: Missing block: B:58:0x0109, code skipped:
            if (r7 == 7) goto L_0x0113;
     */
    /* JADX WARNING: Missing block: B:60:0x010d, code skipped:
            if (r7 == 8) goto L_0x0110;
     */
    /* JADX WARNING: Missing block: B:61:0x0110, code skipped:
            r0 = r4 - r0;
     */
    /* JADX WARNING: Missing block: B:62:0x0113, code skipped:
            r0 = (r4 - r0) / 2.0f;
     */
    /* JADX WARNING: Missing block: B:63:0x0116, code skipped:
            r1 = com.mapbox.mapboxsdk.constants.MapboxConstants.MINIMUM_ZOOM - r0;
     */
    /* JADX WARNING: Missing block: B:65:0x0121, code skipped:
            if (r11.c.a.v.booleanValue() != false) goto L_0x0126;
     */
    /* JADX WARNING: Missing block: B:66:0x0123, code skipped:
            a(r13, r1, r2, r4);
     */
    /* JADX WARNING: Missing block: B:67:0x0126, code skipped:
            r3.reset();
            r3.preScale(r5, r6);
            r11.a.concat(r3);
     */
    private void a(defpackage.apy.q r12, defpackage.apz.b r13) {
        /*
        r11 = this;
        r11.d();
        r0 = r12.f;
        r1 = 0;
        if (r0 == 0) goto L_0x0037;
    L_0x0008:
        r0 = r12.f;
        r0 = r0.floatValue();
        r0 = java.lang.Float.isNaN(r0);
        if (r0 == 0) goto L_0x0030;
    L_0x0014:
        r0 = r13.c;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 != 0) goto L_0x0020;
    L_0x001a:
        r0 = r13.d;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 == 0) goto L_0x0037;
    L_0x0020:
        r0 = r13.d;
        r2 = (double) r0;
        r0 = r13.c;
        r4 = (double) r0;
        r2 = java.lang.Math.atan2(r2, r4);
        r2 = java.lang.Math.toDegrees(r2);
        r0 = (float) r2;
        goto L_0x0038;
    L_0x0030:
        r0 = r12.f;
        r0 = r0.floatValue();
        goto L_0x0038;
    L_0x0037:
        r0 = 0;
    L_0x0038:
        r2 = r12.a;
        if (r2 == 0) goto L_0x003f;
    L_0x003c:
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x004b;
    L_0x003f:
        r2 = r11.c;
        r2 = r2.a;
        r2 = r2.g;
        r3 = r11.b;
        r2 = r2.a(r3);
    L_0x004b:
        r3 = r11.c(r12);
        r11.c = r3;
        r3 = new android.graphics.Matrix;
        r3.<init>();
        r4 = r13.a;
        r13 = r13.b;
        r3.preTranslate(r4, r13);
        r3.preRotate(r0);
        r3.preScale(r2, r2);
        r13 = r12.b;
        if (r13 == 0) goto L_0x006e;
    L_0x0067:
        r13 = r12.b;
        r13 = r13.a(r11);
        goto L_0x006f;
    L_0x006e:
        r13 = 0;
    L_0x006f:
        r0 = r12.c;
        if (r0 == 0) goto L_0x007a;
    L_0x0073:
        r0 = r12.c;
        r0 = r0.b(r11);
        goto L_0x007b;
    L_0x007a:
        r0 = 0;
    L_0x007b:
        r2 = r12.d;
        r4 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        if (r2 == 0) goto L_0x0088;
    L_0x0081:
        r2 = r12.d;
        r2 = r2.a(r11);
        goto L_0x008a;
    L_0x0088:
        r2 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
    L_0x008a:
        r5 = r12.e;
        if (r5 == 0) goto L_0x0094;
    L_0x008e:
        r4 = r12.e;
        r4 = r4.b(r11);
    L_0x0094:
        r5 = r12.s;
        if (r5 == 0) goto L_0x0132;
    L_0x0098:
        r5 = r12.s;
        r5 = r5.c;
        r5 = r2 / r5;
        r6 = r12.s;
        r6 = r6.d;
        r6 = r4 / r6;
        r7 = r12.r;
        if (r7 == 0) goto L_0x00ab;
    L_0x00a8:
        r7 = r12.r;
        goto L_0x00ad;
    L_0x00ab:
        r7 = defpackage.apw.d;
    L_0x00ad:
        r8 = defpackage.apw.c;
        r8 = r7.equals(r8);
        r9 = 2;
        if (r8 != 0) goto L_0x00c4;
    L_0x00b6:
        r8 = r7.b;
        if (r8 != r9) goto L_0x00bf;
    L_0x00ba:
        r5 = java.lang.Math.max(r5, r6);
        goto L_0x00c3;
    L_0x00bf:
        r5 = java.lang.Math.min(r5, r6);
    L_0x00c3:
        r6 = r5;
    L_0x00c4:
        r13 = -r13;
        r13 = r13 * r5;
        r0 = -r0;
        r0 = r0 * r6;
        r3.preTranslate(r13, r0);
        r13 = r11.a;
        r13.concat(r3);
        r13 = r12.s;
        r13 = r13.c;
        r13 = r13 * r5;
        r0 = r12.s;
        r0 = r0.d;
        r0 = r0 * r6;
        r8 = defpackage.apz.1.a;
        r10 = r7.a;
        r10 = r10.ordinal();
        r8 = r8[r10];
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        switch(r8) {
            case 1: goto L_0x00ee;
            case 2: goto L_0x00ee;
            case 3: goto L_0x00ee;
            case 4: goto L_0x00eb;
            case 5: goto L_0x00eb;
            case 6: goto L_0x00eb;
            default: goto L_0x00e9;
        };
    L_0x00e9:
        r13 = 0;
        goto L_0x00f3;
    L_0x00eb:
        r13 = r2 - r13;
        goto L_0x00f1;
    L_0x00ee:
        r13 = r2 - r13;
        r13 = r13 / r10;
    L_0x00f1:
        r13 = r1 - r13;
    L_0x00f3:
        r8 = defpackage.apz.1.a;
        r7 = r7.a;
        r7 = r7.ordinal();
        r7 = r8[r7];
        if (r7 == r9) goto L_0x0113;
    L_0x00ff:
        r8 = 3;
        if (r7 == r8) goto L_0x0110;
    L_0x0102:
        r8 = 5;
        if (r7 == r8) goto L_0x0113;
    L_0x0105:
        r8 = 6;
        if (r7 == r8) goto L_0x0110;
    L_0x0108:
        r8 = 7;
        if (r7 == r8) goto L_0x0113;
    L_0x010b:
        r8 = 8;
        if (r7 == r8) goto L_0x0110;
    L_0x010f:
        goto L_0x0117;
    L_0x0110:
        r0 = r4 - r0;
        goto L_0x0116;
    L_0x0113:
        r0 = r4 - r0;
        r0 = r0 / r10;
    L_0x0116:
        r1 = r1 - r0;
    L_0x0117:
        r0 = r11.c;
        r0 = r0.a;
        r0 = r0.v;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0126;
    L_0x0123:
        r11.a(r13, r1, r2, r4);
    L_0x0126:
        r3.reset();
        r3.preScale(r5, r6);
        r13 = r11.a;
        r13.concat(r3);
        goto L_0x014b;
    L_0x0132:
        r13 = -r13;
        r0 = -r0;
        r3.preTranslate(r13, r0);
        r13 = r11.a;
        r13.concat(r3);
        r13 = r11.c;
        r13 = r13.a;
        r13 = r13.v;
        r13 = r13.booleanValue();
        if (r13 != 0) goto L_0x014b;
    L_0x0148:
        r11.a(r1, r1, r2, r4);
    L_0x014b:
        r13 = r11.g();
        r0 = 0;
        r11.a(r12, r0);
        if (r13 == 0) goto L_0x0158;
    L_0x0155:
        r11.b(r12);
    L_0x0158:
        r11.e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apz.a(apy$q, apz$b):void");
    }

    private void a(r rVar, aj ajVar) {
        float a;
        Object obj = 1;
        Object obj2 = (rVar.a == null || !rVar.a.booleanValue()) ? null : 1;
        float b;
        if (obj2 != null) {
            a = rVar.e != null ? rVar.e.a(this) : ajVar.j.c;
            b = rVar.f != null ? rVar.f.b(this) : ajVar.j.d;
            if (rVar.c != null) {
                rVar.c.a(this);
            }
            if (rVar.d != null) {
                rVar.d.b(this);
            }
        } else {
            if (rVar.c != null) {
                rVar.c.a(this, 1.0f);
            }
            if (rVar.d != null) {
                rVar.d.a(this, 1.0f);
            }
            b = 1.2f;
            a = rVar.e != null ? rVar.e.a(this, 1.0f) : 1.2f;
            if (rVar.f != null) {
                b = rVar.f.a(this, 1.0f);
            }
            a *= ajVar.j.c;
            b *= ajVar.j.d;
        }
        if (a != MapboxConstants.MINIMUM_ZOOM && b != MapboxConstants.MINIMUM_ZOOM) {
            d();
            this.c = c((am) rVar);
            this.c.a.m = Float.valueOf(1.0f);
            if (!(rVar.b == null || rVar.b.booleanValue())) {
                obj = null;
            }
            if (obj == null) {
                this.a.translate(ajVar.j.a, ajVar.j.b);
                this.a.scale(ajVar.j.c, ajVar.j.d);
            }
            a((ai) rVar, false);
            e();
        }
    }

    private void a(u uVar, Path path, Matrix matrix) {
        a(this.c, (ak) uVar);
        if (m() && c()) {
            if (uVar.e != null) {
                matrix.preConcat(uVar.e);
            }
            Path path2 = new c(uVar.a).a;
            if (uVar.j == null) {
                uVar.j = apz.b(path2);
            }
            d(uVar);
            path.setFillType(q());
            path.addPath(path2, matrix);
        }
    }

    private static void a(x xVar, String str) {
        while (true) {
            am b = xVar.p.b(str);
            if (b == null) {
                apz.a("Pattern reference '%s' not found", str);
                return;
            } else if (!(b instanceof x)) {
                apz.b("Pattern href attributes must point to other pattern elements", new Object[0]);
                return;
            } else if (b == xVar) {
                apz.b("Circular reference in pattern href attribute '%s'", str);
                return;
            } else {
                x xVar2 = (x) b;
                if (xVar.a == null) {
                    xVar.a = xVar2.a;
                }
                if (xVar.b == null) {
                    xVar.b = xVar2.b;
                }
                if (xVar.c == null) {
                    xVar.c = xVar2.c;
                }
                if (xVar.d == null) {
                    xVar.d = xVar2.d;
                }
                if (xVar.e == null) {
                    xVar.e = xVar2.e;
                }
                if (xVar.f == null) {
                    xVar.f = xVar2.f;
                }
                if (xVar.g == null) {
                    xVar.g = xVar2.g;
                }
                if (xVar.i.isEmpty()) {
                    xVar.i = xVar2.i;
                }
                if (xVar.s == null) {
                    xVar.s = xVar2.s;
                }
                if (xVar.r == null) {
                    xVar.r = xVar2.r;
                }
                if (xVar2.h != null) {
                    str = xVar2.h;
                } else {
                    return;
                }
            }
        }
    }

    private void a(g gVar, ad adVar) {
        int i;
        Paint paint;
        int i2;
        float c;
        if (apz.a(adVar, 4096)) {
            gVar.a.n = adVar.n;
        }
        if (apz.a(adVar, 2048)) {
            gVar.a.m = adVar.m;
        }
        boolean z = false;
        if (apz.a(adVar, 1)) {
            gVar.a.b = adVar.b;
            gVar.b = adVar.b != null;
        }
        if (apz.a(adVar, 4)) {
            gVar.a.d = adVar.d;
        }
        if (apz.a(adVar, 6149)) {
            apz.a(gVar, true, gVar.a.b);
        }
        if (apz.a(adVar, 2)) {
            gVar.a.c = adVar.c;
        }
        if (apz.a(adVar, 8)) {
            gVar.a.e = adVar.e;
            gVar.c = adVar.e != null;
        }
        if (apz.a(adVar, 16)) {
            gVar.a.f = adVar.f;
        }
        if (apz.a(adVar, 6168)) {
            apz.a(gVar, false, gVar.a.e);
        }
        if (apz.a(adVar, 34359738368L)) {
            gVar.a.L = adVar.L;
        }
        if (apz.a(adVar, 32)) {
            gVar.a.g = adVar.g;
            gVar.e.setStrokeWidth(gVar.a.g.c(this));
        }
        if (apz.a(adVar, 64)) {
            Cap cap;
            gVar.a.h = adVar.h;
            i = 1.b[adVar.h - 1];
            if (i == 1) {
                paint = gVar.e;
                cap = Cap.BUTT;
            } else if (i == 2) {
                paint = gVar.e;
                cap = Cap.ROUND;
            } else if (i == 3) {
                paint = gVar.e;
                cap = Cap.SQUARE;
            }
            paint.setStrokeCap(cap);
        }
        if (apz.a(adVar, 128)) {
            Join join;
            gVar.a.i = adVar.i;
            i = 1.c[adVar.i - 1];
            if (i == 1) {
                paint = gVar.e;
                join = Join.MITER;
            } else if (i == 2) {
                paint = gVar.e;
                join = Join.ROUND;
            } else if (i == 3) {
                paint = gVar.e;
                join = Join.BEVEL;
            }
            paint.setStrokeJoin(join);
        }
        if (apz.a(adVar, 256)) {
            gVar.a.j = adVar.j;
            gVar.e.setStrokeMiter(adVar.j.floatValue());
        }
        if (apz.a(adVar, 512)) {
            gVar.a.k = adVar.k;
        }
        if (apz.a(adVar, 1024)) {
            gVar.a.l = adVar.l;
        }
        Typeface typeface = null;
        if (apz.a(adVar, 1536)) {
            if (gVar.a.k != null) {
                i = gVar.a.k.length;
                i2 = i % 2 == 0 ? i : i << 1;
                float[] fArr = new float[i2];
                float f = MapboxConstants.MINIMUM_ZOOM;
                for (int i3 = 0; i3 < i2; i3++) {
                    fArr[i3] = gVar.a.k[i3 % i].c(this);
                    f += fArr[i3];
                }
                if (f != MapboxConstants.MINIMUM_ZOOM) {
                    c = gVar.a.l.c(this);
                    if (c < MapboxConstants.MINIMUM_ZOOM) {
                        c = (c % f) + f;
                    }
                    gVar.e.setPathEffect(new DashPathEffect(fArr, c));
                }
            }
            gVar.e.setPathEffect(null);
        }
        if (apz.a(adVar, 16384)) {
            c = a();
            gVar.a.p = adVar.p;
            gVar.d.setTextSize(adVar.p.a(this, c));
            gVar.e.setTextSize(adVar.p.a(this, c));
        }
        if (apz.a(adVar, 8192)) {
            gVar.a.o = adVar.o;
        }
        if (apz.a(adVar, 32768)) {
            ad adVar2;
            Integer num;
            if (adVar.q.intValue() == -1 && gVar.a.q.intValue() > 100) {
                adVar2 = gVar.a;
                i2 = adVar2.q.intValue() - 100;
            } else if (adVar.q.intValue() != 1 || gVar.a.q.intValue() >= 900) {
                adVar2 = gVar.a;
                num = adVar.q;
                adVar2.q = num;
            } else {
                adVar2 = gVar.a;
                i2 = adVar2.q.intValue() + 100;
            }
            num = Integer.valueOf(i2);
            adVar2.q = num;
        }
        if (apz.a(adVar, 65536)) {
            gVar.a.r = adVar.r;
        }
        if (apz.a(adVar, 106496)) {
            if (gVar.a.o != null && this.f != null) {
                for (String a : gVar.a.o) {
                    typeface = apz.a(a, gVar.a.q, gVar.a.r);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                typeface = apz.a(CaptionConstants.DEFAULT_TYPEFACE, gVar.a.q, gVar.a.r);
            }
            gVar.d.setTypeface(typeface);
            gVar.e.setTypeface(typeface);
        }
        if (apz.a(adVar, 131072)) {
            gVar.a.s = adVar.s;
            gVar.d.setStrikeThruText(adVar.s == 4);
            gVar.d.setUnderlineText(adVar.s == 2);
            if (VERSION.SDK_INT >= 17) {
                gVar.e.setStrikeThruText(adVar.s == 4);
                paint = gVar.e;
                if (adVar.s == 2) {
                    z = true;
                }
                paint.setUnderlineText(z);
            }
        }
        if (apz.a(adVar, 68719476736L)) {
            gVar.a.t = adVar.t;
        }
        if (apz.a(adVar, 262144)) {
            gVar.a.u = adVar.u;
        }
        if (apz.a(adVar, 524288)) {
            gVar.a.v = adVar.v;
        }
        if (apz.a(adVar, 2097152)) {
            gVar.a.x = adVar.x;
        }
        if (apz.a(adVar, 4194304)) {
            gVar.a.y = adVar.y;
        }
        if (apz.a(adVar, 8388608)) {
            gVar.a.z = adVar.z;
        }
        if (apz.a(adVar, 16777216)) {
            gVar.a.A = adVar.A;
        }
        if (apz.a(adVar, 33554432)) {
            gVar.a.B = adVar.B;
        }
        if (apz.a(adVar, 1048576)) {
            gVar.a.w = adVar.w;
        }
        if (apz.a(adVar, 268435456)) {
            gVar.a.E = adVar.E;
        }
        if (apz.a(adVar, 536870912)) {
            gVar.a.F = adVar.F;
        }
        if (apz.a(adVar, 1073741824)) {
            gVar.a.G = adVar.G;
        }
        if (apz.a(adVar, 67108864)) {
            gVar.a.C = adVar.C;
        }
        if (apz.a(adVar, 134217728)) {
            gVar.a.D = adVar.D;
        }
        if (apz.a(adVar, 8589934592L)) {
            gVar.a.J = adVar.J;
        }
        if (apz.a(adVar, 17179869184L)) {
            gVar.a.K = adVar.K;
        }
    }

    private void a(g gVar, ak akVar) {
        gVar.a.a(akVar.q == null);
        if (akVar.m != null) {
            a(gVar, akVar.m);
        }
        if (this.f.b()) {
            for (e eVar : this.f.d.a) {
                if (apt.a(eVar.a, akVar)) {
                    a(gVar, eVar.b);
                }
            }
        }
        if (akVar.n != null) {
            a(gVar, akVar.n);
        }
    }

    private static void a(g gVar, boolean z, an anVar) {
        apy.e eVar;
        float floatValue = (z ? gVar.a.d : gVar.a.f).floatValue();
        if (anVar instanceof apy.e) {
            eVar = (apy.e) anVar;
        } else if (anVar instanceof f) {
            eVar = gVar.a.n;
        } else {
            return;
        }
        (z ? gVar.d : gVar.e).setColor(eVar.a | (apz.a(floatValue) << 24));
    }

    static void a(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void a(boolean z, a aVar, al alVar) {
        float a;
        float f;
        float f2;
        float f3;
        float f4;
        a aVar2 = aVar;
        am amVar = alVar;
        if (amVar.e != null) {
            apz.a((i) amVar, amVar.e);
        }
        int i = 0;
        Object obj = (amVar.b == null || !amVar.b.booleanValue()) ? null : 1;
        Paint paint = z ? this.c.d : this.c.e;
        float f5 = MapboxConstants.MINIMUM_ZOOM;
        float b;
        float a2;
        if (obj != null) {
            a b2 = b();
            a = amVar.f != null ? amVar.f.a(this) : MapboxConstants.MINIMUM_ZOOM;
            b = amVar.g != null ? amVar.g.b(this) : MapboxConstants.MINIMUM_ZOOM;
            a2 = amVar.h != null ? amVar.h.a(this) : b2.c;
            if (amVar.i != null) {
                f5 = amVar.i.b(this);
            }
            f = f5;
            f2 = a2;
            f3 = a;
            f4 = b;
        } else {
            a2 = amVar.f != null ? amVar.f.a(this, 1.0f) : MapboxConstants.MINIMUM_ZOOM;
            b = amVar.g != null ? amVar.g.a(this, 1.0f) : MapboxConstants.MINIMUM_ZOOM;
            float a3 = amVar.h != null ? amVar.h.a(this, 1.0f) : 1.0f;
            if (amVar.i != null) {
                f5 = amVar.i.a(this, 1.0f);
            }
            f = f5;
            f3 = a2;
            f4 = b;
            f2 = a3;
        }
        d();
        this.c = c(amVar);
        Matrix matrix = new Matrix();
        if (obj == null) {
            matrix.preTranslate(aVar2.a, aVar2.b);
            matrix.preScale(aVar2.c, aVar2.d);
        }
        if (amVar.c != null) {
            matrix.preConcat(amVar.c);
        }
        int size = amVar.a.size();
        if (size == 0) {
            e();
            if (z) {
                this.c.b = false;
                return;
            } else {
                this.c.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        a = -1.0f;
        for (am amVar2 : amVar.a) {
            ak akVar = (ac) amVar2;
            if (i == 0 || akVar.a.floatValue() >= a) {
                fArr[i] = akVar.a.floatValue();
                a = akVar.a.floatValue();
            } else {
                fArr[i] = a;
            }
            d();
            a(this.c, akVar);
            apy.e eVar = (apy.e) this.c.a.C;
            if (eVar == null) {
                eVar = apy.e.b;
            }
            iArr[i] = eVar.a | (apz.a(this.c.a.D.floatValue()) << 24);
            i++;
            e();
        }
        if ((f3 == f2 && f4 == f) || size == 1) {
            e();
            paint.setColor(iArr[size - 1]);
            return;
        }
        TileMode tileMode = TileMode.CLAMP;
        if (amVar.d != null) {
            if (amVar.d == j.reflect) {
                tileMode = TileMode.MIRROR;
            } else if (amVar.d == j.repeat) {
                tileMode = TileMode.REPEAT;
            }
        }
        TileMode tileMode2 = tileMode;
        e();
        LinearGradient linearGradient = new LinearGradient(f3, f4, f2, f, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
    }

    private void a(boolean z, a aVar, ap apVar) {
        float a;
        float c;
        float f;
        float f2;
        a aVar2 = aVar;
        am amVar = apVar;
        if (amVar.e != null) {
            apz.a((i) amVar, amVar.e);
        }
        int i = 0;
        Object obj = (amVar.b == null || !amVar.b.booleanValue()) ? null : 1;
        Paint paint = z ? this.c.d : this.c.e;
        if (obj != null) {
            o oVar = new o(50.0f, bc.percent);
            a = amVar.f != null ? amVar.f.a(this) : oVar.a(this);
            float b = amVar.g != null ? amVar.g.b(this) : oVar.b(this);
            if (amVar.h != null) {
                oVar = amVar.h;
            }
            c = oVar.c(this);
            f = a;
            f2 = b;
        } else {
            f = amVar.f != null ? amVar.f.a(this, 1.0f) : 0.5f;
            c = amVar.h != null ? amVar.h.a(this, 1.0f) : 0.5f;
            f2 = amVar.g != null ? amVar.g.a(this, 1.0f) : 0.5f;
        }
        d();
        this.c = c(amVar);
        Matrix matrix = new Matrix();
        if (obj == null) {
            matrix.preTranslate(aVar2.a, aVar2.b);
            matrix.preScale(aVar2.c, aVar2.d);
        }
        if (amVar.c != null) {
            matrix.preConcat(amVar.c);
        }
        int size = amVar.a.size();
        if (size == 0) {
            e();
            if (z) {
                this.c.b = false;
                return;
            } else {
                this.c.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        a = -1.0f;
        for (am amVar2 : amVar.a) {
            ak akVar = (ac) amVar2;
            if (i == 0 || akVar.a.floatValue() >= a) {
                fArr[i] = akVar.a.floatValue();
                a = akVar.a.floatValue();
            } else {
                fArr[i] = a;
            }
            d();
            a(this.c, akVar);
            apy.e eVar = (apy.e) this.c.a.C;
            if (eVar == null) {
                eVar = apy.e.b;
            }
            iArr[i] = eVar.a | (apz.a(this.c.a.D.floatValue()) << 24);
            i++;
            e();
        }
        if (c == MapboxConstants.MINIMUM_ZOOM || size == 1) {
            e();
            paint.setColor(iArr[size - 1]);
            return;
        }
        TileMode tileMode = TileMode.CLAMP;
        if (amVar.d != null) {
            if (amVar.d == j.reflect) {
                tileMode = TileMode.MIRROR;
            } else if (amVar.d == j.repeat) {
                tileMode = TileMode.REPEAT;
            }
        }
        TileMode tileMode2 = tileMode;
        e();
        RadialGradient radialGradient = new RadialGradient(f, f2, c, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
    }

    private void a(boolean z, a aVar, t tVar) {
        am b = this.f.b(tVar.a);
        if (b == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = tVar.a;
            apz.b("%s reference '%s' not found", objArr);
            if (tVar.b != null) {
                apz.a(this.c, z, tVar.b);
                return;
            } else if (z) {
                this.c.b = false;
                return;
            } else {
                this.c.c = false;
                return;
            }
        }
        if (b instanceof al) {
            a(z, aVar, (al) b);
        }
        if (b instanceof ap) {
            a(z, aVar, (ap) b);
        }
        if (b instanceof ab) {
            a(z, (ab) b);
        }
    }

    private void a(boolean z, ab abVar) {
        boolean z2 = true;
        g gVar;
        g gVar2;
        if (z) {
            if (apz.a(abVar.m, 2147483648L)) {
                this.c.a.b = abVar.m.H;
                gVar = this.c;
                if (abVar.m.H == null) {
                    z2 = false;
                }
                gVar.b = z2;
            }
            if (apz.a(abVar.m, 4294967296L)) {
                this.c.a.d = abVar.m.I;
            }
            if (apz.a(abVar.m, 6442450944L)) {
                gVar2 = this.c;
                apz.a(gVar2, z, gVar2.a.b);
                return;
            }
        }
        if (apz.a(abVar.m, 2147483648L)) {
            this.c.a.e = abVar.m.H;
            gVar = this.c;
            if (abVar.m.H == null) {
                z2 = false;
            }
            gVar.c = z2;
        }
        if (apz.a(abVar.m, 4294967296L)) {
            this.c.a.f = abVar.m.I;
        }
        if (apz.a(abVar.m, 6442450944L)) {
            gVar2 = this.c;
            apz.a(gVar2, z, gVar2.a.e);
        }
    }

    private static boolean a(ad adVar, long j) {
        return (j & adVar.a) != 0;
    }

    private Path b(y yVar) {
        Path path = new Path();
        path.moveTo(yVar.a[0], yVar.a[1]);
        for (int i = 2; i < yVar.a.length; i += 2) {
            path.lineTo(yVar.a[i], yVar.a[i + 1]);
        }
        if (yVar instanceof z) {
            path.close();
        }
        if (yVar.j == null) {
            yVar.j = apz.b(path);
        }
        path.setFillType(q());
        return path;
    }

    private static a b(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private void b(aj ajVar) {
        if (this.c.a.G != null && this.c.i) {
            am b = this.f.b(this.c.a.G);
            i();
            a((r) b, ajVar);
            Bitmap j = j();
            this.a = (Canvas) this.j.pop();
            this.a.save();
            this.a.setMatrix(new Matrix());
            this.a.drawBitmap(j, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, this.c.d);
            j.recycle();
            this.a.restore();
        }
        e();
    }

    private void b(am amVar) {
        if (amVar instanceof ak) {
            ak akVar = (ak) amVar;
            if (akVar.l != null) {
                this.c.h = akVar.l.booleanValue();
            }
        }
    }

    static void b(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private g c(am amVar) {
        g gVar = new g();
        a(gVar, ad.a());
        return a(amVar, gVar);
    }

    private void c(aj ajVar) {
        if (this.c.a.b instanceof t) {
            a(true, ajVar.j, (t) this.c.a.b);
        }
        if (this.c.a.e instanceof t) {
            a(false, ajVar.j, (t) this.c.a.e);
        }
    }

    private void d() {
        this.a.save();
        this.g.push(this.c);
        this.c = (g) this.c.clone();
    }

    private void d(aj ajVar) {
        a(ajVar, ajVar.j);
    }

    private void e() {
        this.a.restore();
        this.c = (g) this.g.pop();
    }

    private void f() {
        this.h.pop();
        this.i.pop();
    }

    private boolean g() {
        if (!h()) {
            return false;
        }
        this.a.saveLayerAlpha(null, apz.a(this.c.a.m.floatValue()), 4);
        this.g.push(this.c);
        this.c = (g) this.c.clone();
        if (this.c.a.G != null && this.c.i) {
            am b = this.f.b(this.c.a.G);
            if (b == null || !(b instanceof r)) {
                apz.b("Mask reference '%s' not found", this.c.a.G);
                this.c.a.G = null;
            } else {
                this.j.push(this.a);
                i();
            }
        }
        return true;
    }

    private boolean h() {
        if (!(this.c.a.G == null || this.c.i)) {
            apz.a("Masks are not supported when using getPicture()", new Object[0]);
        }
        return this.c.a.m.floatValue() < 1.0f || (this.c.a.G != null && this.c.i);
    }

    private void i() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.a.getWidth(), this.a.getHeight(), Config.ARGB_8888);
            this.k.push(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setMatrix(this.a.getMatrix());
            this.a = canvas;
        } catch (OutOfMemoryError e) {
            apz.b("Not enough memory to create temporary bitmaps for mask processing", new Object[0]);
            throw e;
        }
    }

    private Bitmap j() {
        Bitmap bitmap = (Bitmap) this.k.pop();
        Bitmap bitmap2 = (Bitmap) this.k.pop();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width];
        int[] iArr2 = new int[width];
        int i = 0;
        while (i < height) {
            bitmap.getPixels(iArr, 0, width, 0, i, width, 1);
            int i2 = i;
            bitmap2.getPixels(iArr2, 0, width, 0, i, width, 1);
            for (int i3 = 0; i3 < width; i3++) {
                int i4 = iArr[i3];
                int i5 = i4 & 255;
                int i6 = (i4 >> 8) & 255;
                int i7 = (i4 >> 16) & 255;
                i4 >>>= 24;
                if (i4 == 0) {
                    iArr2[i3] = 0;
                } else {
                    i7 = ((((i7 * 6963) + (i6 * 23442)) + (i5 * 2362)) * i4) / 8355840;
                    i4 = iArr2[i3];
                    iArr2[i3] = (i4 & 16777215) | ((((i4 >>> 24) * i7) / 255) << 24);
                }
            }
            bitmap2.setPixels(iArr2, 0, width, 0, i2, width, 1);
            i = i2 + 1;
        }
        bitmap.recycle();
        return bitmap2;
    }

    private static synchronized void k() {
        synchronized (apz.class) {
            HashSet hashSet = new HashSet();
            l = hashSet;
            hashSet.add("Structure");
            l.add("BasicStructure");
            l.add("ConditionalProcessing");
            l.add("Image");
            l.add("Style");
            l.add("ViewportAttribute");
            l.add("Shape");
            l.add("BasicText");
            l.add("PaintAttribute");
            l.add("BasicPaintAttribute");
            l.add("OpacityAttribute");
            l.add("BasicGraphicsAttribute");
            l.add("Marker");
            l.add("Gradient");
            l.add("Pattern");
            l.add("Clip");
            l.add("BasicClip");
            l.add("Mask");
            l.add("View");
        }
    }

    private int l() {
        return (this.c.a.t == 1 || this.c.a.u == 2) ? this.c.a.u : this.c.a.u == 1 ? 3 : 1;
    }

    private boolean m() {
        return this.c.a.A != null ? this.c.a.A.booleanValue() : true;
    }

    private void n() {
        apy.e eVar;
        if (this.c.a.J instanceof apy.e) {
            eVar = (apy.e) this.c.a.J;
        } else if (this.c.a.J instanceof f) {
            eVar = this.c.a.n;
        } else {
            return;
        }
        int i = eVar.a;
        if (this.c.a.K != null) {
            i |= apz.a(this.c.a.K.floatValue()) << 24;
        }
        this.a.drawColor(i);
    }

    private void o() {
        this.a.save(1);
        this.g.push(this.c);
        this.c = (g) this.c.clone();
    }

    private void p() {
        this.a.restore();
        this.c = (g) this.g.pop();
    }

    private FillType q() {
        return this.c.a.F == 0 ? FillType.WINDING : 1.d[this.c.a.F - 1] != 1 ? FillType.WINDING : FillType.EVEN_ODD;
    }

    /* Access modifiers changed, original: protected|final */
    public final float a() {
        return this.c.d.getTextSize();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(apy apy) {
        this.f = apy;
        this.e = false;
        am amVar = apy.a;
        if (amVar == null) {
            apz.a("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        this.c = new g();
        this.g = new Stack();
        a(this.c, ad.a());
        g gVar = this.c;
        gVar.f = this.d;
        gVar.h = false;
        gVar.i = false;
        this.g.push((g) gVar.clone());
        this.j = new Stack();
        this.k = new Stack();
        this.i = new Stack();
        this.h = new Stack();
        b(amVar);
        a(amVar, amVar.c, amVar.d, amVar.s, amVar.r);
    }

    /* Access modifiers changed, original: protected|final */
    public final a b() {
        return this.c.g != null ? this.c.g : this.c.f;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.c.a.B != null ? this.c.a.B.booleanValue() : true;
    }
}
