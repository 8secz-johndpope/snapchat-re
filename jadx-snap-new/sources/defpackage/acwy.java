package defpackage;

import android.opengl.GLES20;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.core.db.DbConstantsKt;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: acwy */
public final class acwy {
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public final acyj J;
    public acww a;
    public acyi b;
    public acyi c;
    public acyi d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int z = -1;

    /* renamed from: acwy$a */
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

    public acwy(acyj acyj) {
        akcr.b(acyj, "mMemoryPool");
        this.J = acyj;
    }

    private final void a(acld acld) {
        if (this.a != null) {
            GLES20.glUniform1f(this.r, acld.b);
            GLES20.glUniform1f(this.s, acld.c);
            GLES20.glUniform1f(this.t, acld.d);
            GLES20.glUniform1f(this.u, acld.e);
            GLES20.glUniform1f(this.v, acld.f);
            GLES20.glUniform1f(this.w, acld.g);
            GLES20.glUniform1f(this.y, acld.i);
            GLES20.glUniform1f(this.z, acld.j);
            GLES20.glUniform1f(this.A, acld.k);
            GLES20.glUniform1f(this.B, acld.l);
            GLES20.glUniform1f(this.C, acld.m);
            GLES20.glUniform1f(this.i, acld.n);
            GLES20.glUniform1f(this.j, acld.o);
            GLES20.glUniform1f(this.m, acld.p);
            GLES20.glUniform1f(this.n, acld.q);
            GLES20.glUniform1f(this.o, acld.r);
            GLES20.glUniform1f(this.D, acld.s);
            GLES20.glUniform1f(this.k, acld.t);
            GLES20.glUniform1f(this.E, acld.u);
            GLES20.glUniform1f(this.l, acld.w);
            GLES20.glUniform4f(this.x, acld.h[0], acld.h[1], acld.h[2], acld.h[3]);
            GLES20.glUniform4f(this.q, acld.v[0], acld.v[1], acld.v[2], acld.v[3]);
            GLES20.glUniform1i(this.H, acld.x);
            GLES20.glUniform1f(this.I, acld.y == MapboxConstants.MINIMUM_ZOOM ? 1.0f : acld.y);
            return;
        }
        throw new Exception("Trying to set particle simulation params before initializing Program");
    }

    public final void a() {
        acyi b = this.J.b();
        GLES20.glGenBuffers(1, b.d());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= DbConstantsKt.MAX_QUERY_VARIABLE_COUNT; i++) {
            float f = ((float) i) / 1000.0f;
            arrayList.add(Float.valueOf(f));
            arrayList.add(Float.valueOf(f));
            arrayList.add(Float.valueOf(f));
            arrayList.add(Float.valueOf(f));
        }
        acyg b2 = this.J.b(arrayList.size());
        b2.c().put(ajyu.e((Collection) arrayList)).position(0);
        GLES20.glBindBuffer(34962, b.c());
        GLES20.glBufferData(34962, b2.a(), b2.c(), 35044);
        GLES20.glBindBuffer(34962, 0);
        this.J.a(b2);
        this.b = b;
    }

    public final void a(acld acld, acxn acxn, float f, float f2, int i, float f3) {
        acld acld2 = acld;
        acxn acxn2 = acxn;
        akcr.b(acld, "simulationParams");
        akcr.b(acxn, "textureEntry");
        acww acww = this.a;
        if (acww != null) {
            acyi acyi = this.c;
            if (acyi != null) {
                acyi acyi2 = this.b;
                if (acyi2 != null) {
                    acyi acyi3 = this.d;
                    if (acyi3 != null && acxn.a()) {
                        acww.b();
                        GLES20.glBindBuffer(34962, acyi.c());
                        GLES20.glVertexAttribPointer(this.F, 1, 5126, false, 4, 0);
                        GLES20.glEnableVertexAttribArray(this.F);
                        GLES20.glBindBuffer(34962, acyi2.c());
                        GLES20.glEnableVertexAttribArray(this.G);
                        GLES20.glVertexAttribPointer(this.G, 1, 5126, false, 4, 0);
                        GLES20.glBindBuffer(34963, acyi3.c());
                        GLES20.glBindTexture(3553, acxn2.a.a);
                        GLES20.glActiveTexture(33984);
                        a(acld);
                        GLES20.glUniform1f(this.h, f2);
                        GLES20.glUniform1f(this.e, f);
                        GLES20.glUniform1f(this.f, f3);
                        GLES20.glUniform1f(this.p, ((float) i) * 0.16f);
                        GLES20.glUniform1f(this.g, ((float) acld2.a) / 1000.0f);
                        GLES20.glDrawElements(4, acld2.a * 6, 5125, 0);
                    }
                }
            }
        }
    }

    public final void b() {
        acyi b = this.J.b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= DbConstantsKt.MAX_QUERY_VARIABLE_COUNT; i++) {
            int i2 = i << 2;
            arrayList.add(Integer.valueOf(i2));
            int i3 = i2 + 2;
            arrayList.add(Integer.valueOf(i3));
            int i4 = i2 + 1;
            arrayList.add(Integer.valueOf(i4));
            arrayList.add(Integer.valueOf(i3));
            arrayList.add(Integer.valueOf(i2 + 3));
            arrayList.add(Integer.valueOf(i4));
        }
        GLES20.glGenBuffers(1, b.d());
        acyh a = this.J.a(arrayList.size());
        a.c().put(ajyu.f((Collection) arrayList)).position(0);
        GLES20.glBindBuffer(34963, b.c());
        GLES20.glBufferData(34963, a.a(), a.c(), 35044);
        GLES20.glBindBuffer(34963, 0);
        this.J.a(a);
        this.d = b;
    }
}
