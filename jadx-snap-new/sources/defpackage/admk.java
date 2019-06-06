package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: admk */
public final class admk {
    private static final float[] i = new float[]{-1.0f, -1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, 1.0f, -1.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, 1.0f, -1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM};
    final FloatBuffer a;
    final float[] b = new float[16];
    final float[] c = new float[16];
    int d;
    int e;
    int f;
    int g;
    int h;
    private adhk j;

    public admk(adhk adhk) {
        this.j = adhk;
        this.a = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.a.put(i).position(0);
        Matrix.setIdentityM(this.c, 0);
        a();
    }

    private static int a(int i, String str) {
        int a = adhk.a(i);
        GLES20.glShaderSource(a, str);
        GLES20.glCompileShader(a);
        int[] iArr = new int[1];
        adhk.a(a, iArr);
        if (iArr[0] != 0) {
            return a;
        }
        GLES20.glDeleteShader(a);
        StringBuilder stringBuilder = new StringBuilder("Could not compile shader ");
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(GLES20.glGetShaderInfoLog(a));
        throw new adjw(stringBuilder.toString());
    }

    private int a(String str, String str2) {
        int a = admk.a(35633, str);
        int a2 = admk.a(35632, str2);
        int c = adhk.c();
        GLES20.glAttachShader(c, a);
        GLES20.glAttachShader(c, a2);
        GLES20.glLinkProgram(c);
        int[] iArr = new int[1];
        adhk.b(c, iArr);
        if (iArr[0] == 1) {
            return c;
        }
        GLES20.glDeleteProgram(c);
        StringBuilder stringBuilder = new StringBuilder("Could not link program: ");
        stringBuilder.append(GLES20.glGetProgramInfoLog(c));
        throw new adjw(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.d = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  vec2 texcoord = vTextureCoord;\n  vec3 normalColor = texture2D(sTexture, texcoord).rgb;\n  normalColor = vec3(normalColor.r, normalColor.g, normalColor.b);\n  gl_FragColor = vec4(normalColor.r, normalColor.g, normalColor.b, 1); \n}\n");
        this.g = GLES20.glGetAttribLocation(this.d, "aPosition");
        if (this.g != -1) {
            this.h = GLES20.glGetAttribLocation(this.d, "aTextureCoord");
            if (this.h != -1) {
                this.e = GLES20.glGetUniformLocation(this.d, "uMVPMatrix");
                if (this.e != -1) {
                    this.f = GLES20.glGetUniformLocation(this.d, "uSTMatrix");
                    if (this.f == -1) {
                        throw new adjw("Could not get attrib location for uSTMatrix");
                    }
                    return;
                }
                throw new adjw("Could not get attrib location for uMVPMatrix");
            }
            throw new adjw("Could not get attrib location for aTextureCoord");
        }
        throw new adjw("Could not get attrib location for aPosition");
    }
}
