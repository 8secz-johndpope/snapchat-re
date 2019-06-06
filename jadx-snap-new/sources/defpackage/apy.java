package defpackage;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Picture;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.apt.f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xml.sax.SAXException;

/* renamed from: apy */
public final class apy {
    ae a = null;
    String b;
    String c;
    f d;
    private aqa e;
    private float f;
    private Map<String, ak> g;

    /* renamed from: apy$a */
    public static class a implements Cloneable {
        public float a;
        public float b;
        public float c;
        public float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public static a a(float f, float f2, float f3, float f4) {
            return new a(f, f2, f3 - f, f4 - f2);
        }

        public final float a() {
            return this.a + this.c;
        }

        public final void a(a aVar) {
            float f = aVar.a;
            if (f < this.a) {
                this.a = f;
            }
            f = aVar.b;
            if (f < this.b) {
                this.b = f;
            }
            if (aVar.a() > a()) {
                this.c = aVar.a() - this.a;
            }
            if (aVar.b() > b()) {
                this.d = aVar.b() - this.b;
            }
        }

        public final float b() {
            return this.b + this.d;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("[");
            stringBuilder.append(this.a);
            String str = " ";
            stringBuilder.append(str);
            stringBuilder.append(this.b);
            stringBuilder.append(str);
            stringBuilder.append(this.c);
            stringBuilder.append(str);
            stringBuilder.append(this.d);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: apy$ad */
    public static class ad implements Cloneable {
        public Boolean A;
        public Boolean B;
        public an C;
        public Float D;
        public String E;
        public int F;
        public String G;
        public an H;
        public Float I;
        public an J;
        public Float K;
        public int L;
        public long a = 0;
        public an b;
        public int c;
        public Float d;
        public an e;
        public Float f;
        public o g;
        public int h;
        public int i;
        public Float j;
        public o[] k;
        public o l;
        public Float m;
        public e n;
        public List<String> o;
        public o p;
        public Integer q;
        public int r;
        public int s;
        public int t;
        public int u;
        public Boolean v;
        public b w;
        public String x;
        public String y;
        public String z;

        /* renamed from: apy$ad$a */
        public enum a {
            ;

            static {
                a = new int[]{1, 2};
            }

            public static int[] a() {
                return (int[]) a.clone();
            }
        }

        /* renamed from: apy$ad$b */
        public enum b {
            ;
            
            public static final int a = 1;
            public static final int b = 2;
            public static final int c = 3;

            static {
                d = new int[]{a, b, c};
            }
        }

        /* renamed from: apy$ad$c */
        public enum c {
            ;

            static {
                a = new int[]{1, 2, 3};
            }

            public static int[] a() {
                return (int[]) a.clone();
            }
        }

        /* renamed from: apy$ad$d */
        public enum d {
            ;

            static {
                a = new int[]{1, 2, 3};
            }

            public static int[] a() {
                return (int[]) a.clone();
            }
        }

        protected ad() {
        }

        public static ad a() {
            ad adVar = new ad();
            adVar.a = -1;
            adVar.b = e.b;
            adVar.c = 1;
            Float valueOf = Float.valueOf(1.0f);
            adVar.d = valueOf;
            adVar.e = null;
            adVar.f = valueOf;
            adVar.g = new o(1.0f);
            adVar.h = 1;
            adVar.i = 1;
            adVar.j = Float.valueOf(4.0f);
            adVar.k = null;
            adVar.l = new o(MapboxConstants.MINIMUM_ZOOM);
            adVar.m = valueOf;
            adVar.n = e.b;
            adVar.o = null;
            adVar.p = new o(12.0f, bc.pt);
            adVar.q = Integer.valueOf(400);
            adVar.r = b.a;
            adVar.s = 1;
            adVar.t = 1;
            adVar.u = 1;
            adVar.v = Boolean.TRUE;
            adVar.w = null;
            adVar.x = null;
            adVar.y = null;
            adVar.z = null;
            adVar.A = Boolean.TRUE;
            adVar.B = Boolean.TRUE;
            adVar.C = e.b;
            adVar.D = valueOf;
            adVar.E = null;
            adVar.F = 1;
            adVar.G = null;
            adVar.H = null;
            adVar.I = valueOf;
            adVar.J = null;
            adVar.K = valueOf;
            adVar.L = 1;
            return adVar;
        }

        public final void a(boolean z) {
            this.A = Boolean.TRUE;
            this.v = z ? Boolean.TRUE : Boolean.FALSE;
            this.w = null;
            this.E = null;
            this.m = Float.valueOf(1.0f);
            this.C = e.b;
            this.D = Float.valueOf(1.0f);
            this.G = null;
            this.H = null;
            this.I = Float.valueOf(1.0f);
            this.J = null;
            this.K = Float.valueOf(1.0f);
            this.L = 1;
        }

        /* Access modifiers changed, original: protected|final */
        public final Object clone() {
            try {
                ad adVar = (ad) super.clone();
                if (this.k != null) {
                    adVar.k = (o[]) this.k.clone();
                }
                return adVar;
            } catch (CloneNotSupportedException e) {
                throw new InternalError(e.toString());
            }
        }
    }

    /* renamed from: apy$af */
    public interface af {
        void a(String str);

        void a(Set<String> set);

        Set<String> b();

        void b(Set<String> set);

        String c();

        void c(Set<String> set);

        Set<String> d();

        void d(Set<String> set);

        Set<String> e();

        Set<String> f();
    }

    /* renamed from: apy$ai */
    public interface ai {
        List<am> a();

        void a(am amVar);
    }

    /* renamed from: apy$am */
    public static class am {
        public apy p;
        public ai q;

        protected am() {
        }

        public String toString() {
            return getClass().getSimpleName();
        }
    }

    /* renamed from: apy$an */
    public static abstract class an implements Cloneable {
        protected an() {
        }
    }

    /* renamed from: apy$aw */
    public interface aw {
        ba g();
    }

    /* renamed from: apy$b */
    public static class b {
        public o a;
        public o b;
        public o c;
        public o d;

        public b(o oVar, o oVar2, o oVar3, o oVar4) {
            this.a = oVar;
            this.b = oVar2;
            this.c = oVar3;
            this.d = oVar4;
        }
    }

    /* renamed from: apy$ba */
    public interface ba {
    }

    /* renamed from: apy$bc */
    public enum bc {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* renamed from: apy$j */
    public enum j {
        pad,
        reflect,
        repeat
    }

    /* renamed from: apy$m */
    public interface m {
        void a(Matrix matrix);
    }

    /* renamed from: apy$o */
    public static class o implements Cloneable {
        float a = MapboxConstants.MINIMUM_ZOOM;
        private bc b = bc.px;

        public o(float f) {
            this.a = f;
            this.b = bc.px;
        }

        public o(float f, bc bcVar) {
            this.a = f;
            this.b = bcVar;
        }

        public final float a(float f) {
            int i = 1.a[this.b.ordinal()];
            if (i == 1) {
                return this.a;
            }
            switch (i) {
                case 4:
                    return this.a * f;
                case 5:
                    return (this.a * f) / 2.54f;
                case 6:
                    return (this.a * f) / 25.4f;
                case 7:
                    return (this.a * f) / 72.0f;
                case 8:
                    return (this.a * f) / 6.0f;
                default:
                    return this.a;
            }
        }

        public final float a(apz apz) {
            switch (this.b) {
                case px:
                    return this.a;
                case em:
                    return this.a * apz.a();
                case ex:
                    return this.a * (apz.c.d.getTextSize() / 2.0f);
                case in:
                    return this.a * apz.b;
                case cm:
                    return (this.a * apz.b) / 2.54f;
                case mm:
                    return (this.a * apz.b) / 25.4f;
                case pt:
                    return (this.a * apz.b) / 72.0f;
                case pc:
                    return (this.a * apz.b) / 6.0f;
                case percent:
                    a b = apz.b();
                    return b == null ? this.a : (this.a * b.c) / 100.0f;
                default:
                    return this.a;
            }
        }

        public final float a(apz apz, float f) {
            return this.b == bc.percent ? (this.a * f) / 100.0f : a(apz);
        }

        public final boolean a() {
            return this.a == MapboxConstants.MINIMUM_ZOOM;
        }

        public final float b(apz apz) {
            if (this.b != bc.percent) {
                return a(apz);
            }
            a b = apz.b();
            return b == null ? this.a : (this.a * b.d) / 100.0f;
        }

        public final boolean b() {
            return this.a < MapboxConstants.MINIMUM_ZOOM;
        }

        public final float c(apz apz) {
            if (this.b != bc.percent) {
                return a(apz);
            }
            a b = apz.b();
            if (b == null) {
                return this.a;
            }
            float f = b.c;
            float f2 = b.d;
            if (f == f2) {
                return (this.a * f) / 100.0f;
            }
            return (this.a * ((float) (Math.sqrt((double) ((f * f) + (f2 * f2))) / 1.414213562373095d))) / 100.0f;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(this.a));
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    /* renamed from: apy$s */
    public interface s {
    }

    /* renamed from: apy$w */
    public interface w {
        void a();

        void a(float f, float f2);

        void a(float f, float f2, float f3, float f4);

        void a(float f, float f2, float f3, float f4, float f5, float f6);

        void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void b(float f, float f2);
    }

    /* renamed from: apy$ak */
    public static class ak extends am {
        public String k = null;
        public Boolean l = null;
        public ad m = null;
        public ad n = null;
        public List<String> o = null;

        protected ak() {
        }
    }

    /* renamed from: apy$bb */
    public static class bb extends am implements aw {
        public String a;

        public bb(String str) {
            this.a = str;
        }

        public final ba g() {
            return null;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" '");
            stringBuilder.append(this.a);
            stringBuilder.append("'");
            return stringBuilder.toString();
        }
    }

    /* renamed from: apy$e */
    public static class e extends an {
        public static final e b = new e(0);
        public int a;

        public e(int i) {
            this.a = i;
        }

        public final String toString() {
            return String.format("#%06x", new Object[]{Integer.valueOf(this.a)});
        }
    }

    /* renamed from: apy$f */
    public static class f extends an {
        static f a = new f();

        private f() {
        }
    }

    /* renamed from: apy$t */
    public static class t extends an {
        public String a;
        public an b;

        public t(String str, an anVar) {
            this.a = str;
            this.b = anVar;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(" ");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    /* renamed from: apy$v */
    public static class v implements w {
        int a;
        private byte[] b;
        private float[] c;
        private int d;

        public v() {
            this.b = null;
            this.a = 0;
            this.c = null;
            this.d = 0;
            this.b = new byte[8];
            this.c = new float[16];
        }

        private void a(int i) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[(fArr.length << 1)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        public final void a() {
            a((byte) 8);
        }

        /* Access modifiers changed, original: final */
        public final void a(byte b) {
            byte[] bArr;
            int i = this.a;
            byte[] bArr2 = this.b;
            if (i == bArr2.length) {
                bArr = new byte[(bArr2.length << 1)];
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                this.b = bArr;
            }
            bArr = this.b;
            int i2 = this.a;
            this.a = i2 + 1;
            bArr[i2] = b;
        }

        public final void a(float f, float f2) {
            a((byte) 0);
            a(2);
            float[] fArr = this.c;
            int i = this.d;
            this.d = i + 1;
            fArr[i] = f;
            int i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f2;
        }

        public final void a(float f, float f2, float f3, float f4) {
            a((byte) 3);
            a(4);
            float[] fArr = this.c;
            int i = this.d;
            this.d = i + 1;
            fArr[i] = f;
            int i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f2;
            i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f3;
            i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f4;
        }

        public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
            a((byte) 2);
            a(6);
            float[] fArr = this.c;
            int i = this.d;
            this.d = i + 1;
            fArr[i] = f;
            int i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f2;
            i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f3;
            i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f4;
            i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f5;
            i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f6;
        }

        public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            a((byte) (((z ? 2 : 0) | 4) | z2));
            a(5);
            float[] fArr = this.c;
            int i = this.d;
            this.d = i + 1;
            fArr[i] = f;
            int i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f2;
            i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f3;
            i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f4;
            i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f5;
        }

        public final void a(w wVar) {
            int i = 0;
            for (int i2 = 0; i2 < this.a; i2++) {
                int i3;
                byte b = this.b[i2];
                float[] fArr;
                int i4;
                if (b == (byte) 0) {
                    fArr = this.c;
                    i4 = i + 1;
                    i3 = i4 + 1;
                    wVar.a(fArr[i], fArr[i4]);
                } else if (b != (byte) 1) {
                    float f;
                    float f2;
                    float f3;
                    if (b == (byte) 2) {
                        fArr = this.c;
                        i4 = i + 1;
                        float f4 = fArr[i];
                        i = i4 + 1;
                        f = fArr[i4];
                        i4 = i + 1;
                        f2 = fArr[i];
                        i = i4 + 1;
                        f3 = fArr[i4];
                        i4 = i + 1;
                        float f5 = fArr[i];
                        i = i4 + 1;
                        wVar.a(f4, f, f2, f3, f5, fArr[i4]);
                    } else if (b == (byte) 3) {
                        fArr = this.c;
                        i4 = i + 1;
                        i3 = i4 + 1;
                        int i5 = i3 + 1;
                        int i6 = i5 + 1;
                        wVar.a(fArr[i], fArr[i4], fArr[i3], fArr[i5]);
                        i = i6;
                    } else if (b != (byte) 8) {
                        boolean z = (b & 2) != 0;
                        boolean z2 = (b & 1) != 0;
                        fArr = this.c;
                        i4 = i + 1;
                        f = fArr[i];
                        i = i4 + 1;
                        f2 = fArr[i4];
                        i4 = i + 1;
                        f3 = fArr[i];
                        i = i4 + 1;
                        float f6 = fArr[i4];
                        i4 = i + 1;
                        wVar.a(f, f2, f3, z, z2, f6, fArr[i]);
                        i = i4;
                    } else {
                        wVar.a();
                    }
                } else {
                    fArr = this.c;
                    i4 = i + 1;
                    i3 = i4 + 1;
                    wVar.b(fArr[i], fArr[i4]);
                }
                i = i3;
            }
        }

        public final void b(float f, float f2) {
            a((byte) 1);
            a(2);
            float[] fArr = this.c;
            int i = this.d;
            this.d = i + 1;
            fArr[i] = f;
            int i2 = this.d;
            this.d = i2 + 1;
            fArr[i2] = f2;
        }
    }

    /* renamed from: apy$ab */
    public static class ab extends ak implements ai {
        protected ab() {
        }

        public final List<am> a() {
            return Collections.emptyList();
        }

        public final void a(am amVar) {
        }
    }

    /* renamed from: apy$ac */
    public static class ac extends ak implements ai {
        public Float a;

        protected ac() {
        }

        public final List<am> a() {
            return Collections.emptyList();
        }

        public final void a(am amVar) {
        }
    }

    /* renamed from: apy$aj */
    public static class aj extends ak {
        public a j = null;

        protected aj() {
        }
    }

    /* renamed from: apy$i */
    public static class i extends ak implements ai {
        public List<am> a = new ArrayList();
        public Boolean b;
        public Matrix c;
        public j d;
        public String e;

        protected i() {
        }

        public final List<am> a() {
            return this.a;
        }

        public final void a(am amVar) {
            if (amVar instanceof ac) {
                this.a.add(amVar);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Gradient elements cannot contain ");
            stringBuilder.append(amVar);
            stringBuilder.append(" elements.");
            throw new SAXException(stringBuilder.toString());
        }
    }

    /* renamed from: apy$ag */
    public static class ag extends aj implements af, ai {
        private Set<String> a = null;
        private String b = null;
        private Set<String> c = null;
        private Set<String> d = null;
        private Set<String> e = null;
        public List<am> i = new ArrayList();

        protected ag() {
        }

        public final List<am> a() {
            return this.i;
        }

        public void a(am amVar) {
            this.i.add(amVar);
        }

        public final void a(String str) {
            this.b = str;
        }

        public final void a(Set<String> set) {
            this.a = set;
        }

        public final Set<String> b() {
            return this.a;
        }

        public final void b(Set<String> set) {
            this.c = set;
        }

        public final String c() {
            return this.b;
        }

        public final void c(Set<String> set) {
            this.d = set;
        }

        public final Set<String> d() {
            return null;
        }

        public final void d(Set<String> set) {
            this.e = set;
        }

        public final Set<String> e() {
            return this.d;
        }

        public final Set<String> f() {
            return this.e;
        }
    }

    /* renamed from: apy$ah */
    public static class ah extends aj implements af {
        private Set<String> a = null;
        private String b = null;
        private Set<String> c = null;
        private Set<String> d = null;
        private Set<String> e = null;

        protected ah() {
        }

        public final void a(String str) {
            this.b = str;
        }

        public final void a(Set<String> set) {
            this.a = set;
        }

        public final Set<String> b() {
            return this.a;
        }

        public final void b(Set<String> set) {
            this.c = set;
        }

        public final String c() {
            return this.b;
        }

        public final void c(Set<String> set) {
            this.d = set;
        }

        public final Set<String> d() {
            return this.c;
        }

        public final void d(Set<String> set) {
            this.e = set;
        }

        public final Set<String> e() {
            return this.d;
        }

        public final Set<String> f() {
            return this.e;
        }
    }

    /* renamed from: apy$al */
    public static class al extends i {
        public o f;
        public o g;
        public o h;
        public o i;

        protected al() {
        }
    }

    /* renamed from: apy$ap */
    public static class ap extends i {
        public o f;
        public o g;
        public o h;
        public o i;
        public o j;

        protected ap() {
        }
    }

    /* renamed from: apy$ao */
    public static class ao extends ag {
        public apw r = null;

        protected ao() {
        }
    }

    /* renamed from: apy$ax */
    public static class ax extends ag {
        protected ax() {
        }

        public final void a(am amVar) {
            if (amVar instanceof aw) {
                this.i.add(amVar);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Text content elements cannot contain ");
            stringBuilder.append(amVar);
            stringBuilder.append(" elements.");
            throw new SAXException(stringBuilder.toString());
        }
    }

    /* renamed from: apy$k */
    public static abstract class k extends ah implements m {
        public Matrix e;

        protected k() {
        }

        public final void a(Matrix matrix) {
            this.e = matrix;
        }
    }

    /* renamed from: apy$l */
    public static class l extends ag implements m {
        public Matrix b;

        protected l() {
        }

        public final void a(Matrix matrix) {
            this.b = matrix;
        }
    }

    /* renamed from: apy$r */
    public static class r extends ag implements s {
        public Boolean a;
        public Boolean b;
        public o c;
        public o d;
        public o e;
        public o f;

        protected r() {
        }
    }

    /* renamed from: apy$aa */
    public static class aa extends k {
        public o a;
        public o b;
        public o c;
        public o d;
        public o f;
        public o g;

        protected aa() {
        }
    }

    /* renamed from: apy$aq */
    public static class aq extends ao {
        public a s;

        protected aq() {
        }
    }

    /* renamed from: apy$ar */
    public static class ar extends l {
        protected ar() {
        }
    }

    /* renamed from: apy$at */
    public static class at extends ax implements aw {
        public String a;
        ba b;

        protected at() {
        }

        public final ba g() {
            return this.b;
        }
    }

    /* renamed from: apy$ay */
    public static class ay extends ax implements aw {
        public String a;
        public o b;
        ba c;

        protected ay() {
        }

        public final ba g() {
            return this.c;
        }
    }

    /* renamed from: apy$az */
    public static class az extends ax {
        public List<o> b;
        public List<o> c;
        public List<o> d;
        public List<o> e;

        protected az() {
        }
    }

    /* renamed from: apy$bd */
    public static class bd extends l {
        public String a;
        public o c;
        public o d;
        public o e;
        public o f;

        protected bd() {
        }
    }

    /* renamed from: apy$c */
    public static class c extends k {
        public o a;
        public o b;
        public o c;

        protected c() {
        }
    }

    /* renamed from: apy$d */
    public static class d extends l implements s {
        public Boolean a;

        protected d() {
        }
    }

    /* renamed from: apy$g */
    public static class g extends l implements s {
        protected g() {
        }
    }

    /* renamed from: apy$h */
    public static class h extends k {
        public o a;
        public o b;
        public o c;
        public o d;

        protected h() {
        }
    }

    /* renamed from: apy$n */
    public static class n extends ao implements m {
        public String a;
        public o b;
        public o c;
        public o d;
        public o e;
        public Matrix f;

        protected n() {
        }

        public final void a(Matrix matrix) {
            this.f = matrix;
        }
    }

    /* renamed from: apy$p */
    public static class p extends k {
        public o a;
        public o b;
        public o c;
        public o d;

        protected p() {
        }
    }

    /* renamed from: apy$u */
    public static class u extends k {
        public v a;
        public Float b;

        protected u() {
        }
    }

    /* renamed from: apy$y */
    public static class y extends k {
        public float[] a;

        protected y() {
        }
    }

    /* renamed from: apy$ae */
    public static class ae extends aq {
        public o a;
        public o b;
        public o c;
        public o d;
        public String e;

        protected ae() {
        }
    }

    /* renamed from: apy$as */
    public static class as extends aq implements s {
        protected as() {
        }
    }

    /* renamed from: apy$au */
    public static class au extends az implements aw {
        ba a;

        protected au() {
        }

        public final ba g() {
            return this.a;
        }
    }

    /* renamed from: apy$av */
    public static class av extends az implements ba, m {
        public Matrix a;

        protected av() {
        }

        public final void a(Matrix matrix) {
            this.a = matrix;
        }
    }

    /* renamed from: apy$be */
    public static class be extends aq implements s {
        protected be() {
        }
    }

    /* renamed from: apy$q */
    public static class q extends aq implements s {
        public boolean a;
        public o b;
        public o c;
        public o d;
        public o e;
        public Float f;

        protected q() {
        }
    }

    /* renamed from: apy$x */
    public static class x extends aq implements s {
        public Boolean a;
        public Boolean b;
        public Matrix c;
        public o d;
        public o e;
        public o f;
        public o g;
        public String h;

        protected x() {
        }
    }

    /* renamed from: apy$z */
    public static class z extends y {
        protected z() {
        }
    }

    protected apy() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = null;
        this.f = 96.0f;
        this.d = new f();
        this.g = new HashMap();
    }

    private Picture a(int i, int i2) {
        Picture picture = new Picture();
        new apz(picture.beginRecording(i, i2), new a(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) i, (float) i2), this.f).a(this);
        picture.endRecording();
        return picture;
    }

    private ak a(ai aiVar, String str) {
        ak akVar = (ak) aiVar;
        if (str.equals(akVar.k)) {
            return akVar;
        }
        for (am amVar : aiVar.a()) {
            if (amVar instanceof ak) {
                ak akVar2 = (ak) amVar;
                if (str.equals(akVar2.k)) {
                    return akVar2;
                }
                if (amVar instanceof ai) {
                    akVar = a((ai) amVar, str);
                    if (akVar != null) {
                        return akVar;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public static apy a(AssetManager assetManager, String str) {
        aqc aqc = new aqc();
        InputStream open = assetManager.open(str);
        try {
            apy a = aqc.a(open);
            return a;
        } finally {
            try {
                open.close();
            } catch (IOException unused) {
            }
        }
    }

    public static apy a(Resources resources, int i) {
        aqc aqc = new aqc();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            apy a = aqc.a(openRawResource);
            return a;
        } finally {
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static apy a(InputStream inputStream) {
        return new aqc().a(inputStream);
    }

    public static apy a(String str) {
        return new aqc().a(new ByteArrayInputStream(str.getBytes()));
    }

    public final Picture a() {
        o oVar = this.a.c;
        if (oVar == null) {
            return a((int) RasterSource.DEFAULT_TILE_SIZE, (int) RasterSource.DEFAULT_TILE_SIZE);
        }
        float f;
        float a = oVar.a(this.f);
        a aVar = this.a.s;
        if (aVar != null) {
            f = (aVar.d * a) / aVar.c;
        } else {
            o oVar2 = this.a.d;
            f = oVar2 != null ? oVar2.a(this.f) : a;
        }
        return a((int) Math.ceil((double) a), (int) Math.ceil((double) f));
    }

    /* Access modifiers changed, original: protected|final */
    public final am b(String str) {
        am amVar = null;
        if (str == null) {
            return null;
        }
        if (str.length() > 1 && str.startsWith("#")) {
            str = str.substring(1);
            if (!(str == null || str.length() == 0)) {
                if (str.equals(this.a.k)) {
                    return this.a;
                }
                if (this.g.containsKey(str)) {
                    return (am) this.g.get(str);
                }
                amVar = a(this.a, str);
                this.g.put(str, amVar);
            }
        }
        return amVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        f fVar = this.d;
        Object obj = (fVar.a == null || fVar.a.isEmpty()) ? 1 : null;
        return obj == null;
    }
}
