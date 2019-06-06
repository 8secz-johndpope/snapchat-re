package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import com.looksery.sdk.InstrumentationDelegatesFactory;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.domain.CoreConfiguration.CoreConfigurationBuilder;
import com.looksery.sdk.domain.Size;
import com.looksery.sdk.lenses.resources.BuildConfig;
import com.looksery.sdk.listener.LookseryNativeExceptionListener;
import com.snapchat.android.R;
import java.util.concurrent.TimeUnit;

/* renamed from: myq */
public final class myq extends adiv {
    private static final adie a = new adie().a(180.0f);
    private final adia b = new adia();
    private final Context c;
    private final adhk d = adhk.a;
    private adie e;
    private adic f;
    private LSCoreManagerWrapper g;
    private Size h;
    private final a i;
    private final gqr j;
    private final ide k;

    /* renamed from: myq$a */
    public interface a {
        LookseryNativeExceptionListener a();

        InstrumentationDelegatesFactory b();
    }

    public myq(Context context, a aVar, gqr gqr) {
        this.c = context.getApplicationContext();
        this.i = aVar;
        this.j = gqr;
        this.k = new ide("Lenses", idi.CAMERA_PLATFORM) {
        };
    }

    private static Size a(int i, int i2) {
        return new Size(Math.min(i2, i), Math.max(i2, i));
    }

    private void a() {
        try {
            this.g = new LSCoreManagerWrapper(this.c, new CoreConfigurationBuilder(this.c).setDisableTracking(true).setInstrumentationDelegatesFactory(this.i.b()).build());
            this.g.setShouldCatchNativeExceptions(true);
            this.g.setNativeExceptionListener(this.i.a());
            this.g.applyComplexEffect("smoothing", BuildConfig.SMOOTHING_LENS_CONTENT_PATH, BuildConfig.SMOOTHING_CONFIG_FILENAME);
        } catch (Exception e) {
            this.j.a(gqt.NORMAL, e, this.k.callsite("SmoothingRenderPass"));
            throw new adjz(e);
        }
    }

    private static void b(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameteri(i, 10241, 9729);
        GLES20.glTexParameteri(i, 10240, 9729);
        GLES20.glBindTexture(i, 0);
    }

    private boolean d() {
        return this.g != null;
    }

    public final void a(int i, int i2, adic adic) {
        Size a = myq.a(i, i2);
        if (!a.equals(this.h) || adic != this.f) {
            this.h = a;
            this.f = adic;
            if (d()) {
                this.g.release();
                a();
            }
        }
    }

    public final void a(int i, long j, adie adie, adhu adhu) {
        int i2 = i;
        adhu adhu2 = adhu;
        int[] iArr = adhu2.d;
        int[] iArr2 = adhu2.e;
        if (iArr2 != null) {
            GLES20.glDisable(3089);
        }
        myq.b(this.f.mBindValue, i2);
        int processTextureToTexture = this.g.processTextureToTexture(i, TimeUnit.MICROSECONDS.toNanos(j), this.f.mBindValue, adie.b, this.e.b, this.h.width, this.h.height);
        GLES20.glBindFramebuffer(36160, adhu2.c);
        adhk.c(iArr);
        if (iArr2 != null) {
            GLES20.glEnable(3089);
            adhk.d(iArr2);
        }
        myq.b(3553, processTextureToTexture);
        adhk.c(iArr);
        if (this.f == adic.TEXTURE_2D) {
            adia adia = this.b;
            adic adic = adic.TEXTURE_2D;
            Preconditions.checkState(adia.c == 2, "Cannot render. Not set up.");
            GLES20.glUseProgram(adia.d);
            adhk.a(adia.g, 3, 0, adia.e);
            GLES20.glEnableVertexAttribArray(adia.g);
            adhk.a(adia.h, 2, 0, adia.f);
            GLES20.glEnableVertexAttribArray(adia.h);
            GLES20.glActiveTexture(33984);
            adhk.a(adia.i, 0);
            GLES20.glBindTexture(adic.mBindValue, processTextureToTexture);
            adic adic2 = adic.TEXTURE_2D;
            GLES20.glActiveTexture(33985);
            adhk.a(adia.j, 1);
            GLES20.glBindTexture(adic2.mBindValue, i2);
            adhk.b(5);
            GLES20.glDisableVertexAttribArray(adia.h);
            GLES20.glDisableVertexAttribArray(adia.g);
            GLES20.glUseProgram(0);
            return;
        }
        this.g.drawTexture(processTextureToTexture, iArr[2], iArr[3], a.b);
    }

    public final void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        adia adia = this.b;
        adhy a = adhz.a(R.raw.smoothing_vertex_shader);
        boolean z = true;
        adhy a2 = adhz.a(R.raw.smoothing_flip_plus_alpha_mix_fragment_shader, adic.mFragmentShaderDefinition);
        if (!(adia.c == 1 || adia.c == 3)) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot setup. Already set up.");
        adia.e = adht.a(adia.a);
        adia.f = adht.a(adia.b);
        adia.d = adhk.c();
        GLES20.glAttachShader(adia.d, a.a());
        GLES20.glAttachShader(adia.d, a2.a());
        GLES20.glLinkProgram(adia.d);
        adia.g = GLES20.glGetAttribLocation(adia.d, "aPosition");
        if (adia.g != -1) {
            adia.h = GLES20.glGetAttribLocation(adia.d, "aTexCoord");
            if (adia.h != -1) {
                adia.i = GLES20.glGetUniformLocation(adia.d, "sVideoTexture");
                if (adia.i != -1) {
                    adia.j = GLES20.glGetUniformLocation(adia.d, "uAlphaTexture");
                    if (adia.j != -1) {
                        adhk.a("SmoothingTexturedQuad.setup");
                        adia.c = 2;
                        this.e = new adie().a(adie).a(adie2);
                        this.f = adic;
                        this.h = myq.a(i, i2);
                        a();
                        return;
                    }
                    throw new adkd("No alpha texture uniform");
                }
                throw new adkd("No video texture uniform");
            }
            throw new adkd("No tex coord attribute");
        }
        throw new adkd("No position attribute");
    }

    public final void e() {
        if (d()) {
            this.g.release();
        }
        adia adia = this.b;
        if (adia.c == 2) {
            adia.e = null;
            adia.f = null;
            GLES20.glDeleteProgram(adia.d);
            adia.g = -1;
            adia.h = -1;
            adia.i = -1;
            adia.j = -1;
            adia.c = 3;
        }
    }
}
