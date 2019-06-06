package defpackage;

import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.nio.FloatBuffer;

/* renamed from: adid */
public final class adid {
    private static final float[] b = new float[]{-1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, -1.0f, -1.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, -1.0f, MapboxConstants.MINIMUM_ZOOM};
    private static final float[] c = new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, 1.0f, 1.0f};
    public int a;
    private final adhk d;
    private final adht e;
    private int f;
    private FloatBuffer g;
    private FloatBuffer h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    /* renamed from: adid$a */
    public static class a {
        public static adid a() {
            return new adid();
        }
    }

    public adid() {
        this(adhk.a, adht.a);
    }

    private adid(adhk adhk, adht adht) {
        this.f = 1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.d = adhk;
        this.e = adht;
    }

    private void a(int i, adic adic) {
        GLES20.glActiveTexture(33984);
        adhk.a(this.k, 0);
        GLES20.glBindTexture(adic.mBindValue, i);
    }

    private void a(adie adie) {
        adhk.a(this.l, adie.b);
    }

    private void b(adhy adhy, adhy adhy2) {
        this.a = adhk.c();
        GLES20.glAttachShader(this.a, adhy.a());
        GLES20.glAttachShader(this.a, adhy2.a());
        GLES20.glLinkProgram(this.a);
    }

    private void b(adie adie) {
        adhk.a(this.m, adie.b);
    }

    private void c() {
        this.i = GLES20.glGetAttribLocation(this.a, "aPosition");
        if (this.i != -1) {
            this.j = GLES20.glGetAttribLocation(this.a, "aTexCoord");
            if (this.j != -1) {
                this.k = GLES20.glGetUniformLocation(this.a, "sVideoTexture");
                if (this.k != -1) {
                    this.l = GLES20.glGetUniformLocation(this.a, "uModelViewProjectionMatrix");
                    if (this.l != -1) {
                        this.m = GLES20.glGetUniformLocation(this.a, "uTexCoordMatrix");
                        if (this.m == -1) {
                            throw new adkd("Could not get attribute location for uTexCoordMatrix");
                        }
                        return;
                    }
                    throw new adkd("Could not get attribute location for uModelViewProjectionMatrix");
                }
                throw new adkd("No video texture uniform");
            }
            throw new adkd("No tex coord attribute");
        }
        throw new adkd("No position attribute");
    }

    private void d() {
        adhk.a(this.i, 3, 0, this.g);
        GLES20.glEnableVertexAttribArray(this.i);
    }

    private void e() {
        adhk.a(this.j, 2, 0, this.h);
        GLES20.glEnableVertexAttribArray(this.j);
    }

    private void f() {
        GLES20.glDisableVertexAttribArray(this.j);
        GLES20.glDisableVertexAttribArray(this.i);
    }

    private void g() {
        this.g = adht.a(b);
    }

    private void h() {
        this.h = adht.a(c);
    }

    private void i() {
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
    }

    public final void a() {
        if (this.f == 2) {
            this.g = null;
            this.h = null;
            GLES20.glDeleteProgram(this.a);
            i();
            this.f = 3;
        }
    }

    public final void a(adhy adhy, adhy adhy2) {
        int i = this.f;
        boolean z = true;
        if (!(i == 1 || i == 3)) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot setup. Already set up.");
        g();
        h();
        b(adhy, adhy2);
        c();
        adhk.a("TexturedQuad.setup");
        this.f = 2;
    }

    public final void a(adie adie, adie adie2, int i, adic adic) {
        Preconditions.checkState(this.f == 2, "Cannot render. Not set up.");
        d();
        e();
        a(i, adic);
        a(adie);
        b(adie2);
        adhk.b(5);
        f();
    }

    public final void b() {
        Preconditions.checkState(this.f == 2, "Cannot bind. Not set up.");
        GLES20.glUseProgram(this.a);
    }
}
