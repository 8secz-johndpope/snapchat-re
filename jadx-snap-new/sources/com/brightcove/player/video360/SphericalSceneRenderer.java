package com.brightcove.player.video360;

import android.annotation.TargetApi;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.brightcove.player.R;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;

@TargetApi(17)
public class SphericalSceneRenderer {
    public static final int SPHERE_SLICES = 180;
    private ShaderProgram a;
    private int b;
    private int c;
    private int d;
    private int e;
    private float[] f = new float[16];
    private float[] g = new float[16];
    private Sphere h;
    private boolean i = false;

    public SphericalSceneRenderer(Context context) {
        this.a = new ShaderProgram(GlUtil.readRawTextFile(context, R.raw.video_vertex_shader), GlUtil.readRawTextFile(context, R.raw.video_fragment_shader));
        this.b = this.a.getAttribute("aPosition");
        this.c = this.a.getUniform("uMVPMatrix");
        this.d = this.a.getUniform("uTextureMatrix");
        this.e = this.a.getAttribute("aTextureCoord");
        GLES20.glDisable(2929);
        this.h = new Sphere(180, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 500.0f, 1);
        GLES20.glUseProgram(this.a.getShaderHandle());
        GLES20.glEnableVertexAttribArray(this.b);
        String str = "glEnableVertexAttribArray";
        GlUtil.checkGlError(str);
        GLES20.glVertexAttribPointer(this.b, 3, 5126, false, this.h.getVerticesStride(), this.h.getVertices());
        String str2 = "glVertexAttribPointer";
        GlUtil.checkGlError(str2);
        GLES20.glEnableVertexAttribArray(this.e);
        GlUtil.checkGlError(str);
        GLES20.glVertexAttribPointer(this.e, 2, 5126, false, this.h.getVerticesStride(), this.h.getVertices().duplicate().position(3));
        GlUtil.checkGlError(str2);
    }

    private void a(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMM(this.f, 0, fArr3, 0, fArr2, 0);
        Matrix.multiplyMM(this.g, 0, this.f, 0, fArr, 0);
        GLES20.glUniformMatrix4fv(this.c, 1, false, this.g, 0);
        this.h.draw();
    }

    public boolean isVrMode() {
        return this.i;
    }

    public void onDrawFrame(int i, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        GLES20.glClear(16384);
        GLES20.glBindTexture(36197, i);
        Matrix.translateM(fArr, 0, MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM);
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr, 0);
        if (this.i) {
            int[] iArr = new int[4];
            GLES20.glGetIntegerv(2978, iArr, 0);
            GlUtil.checkGlError("Failed to get current view port size!");
            int i2 = iArr[2];
            i = iArr[3];
            int i3 = i2 / 2;
            Matrix.perspectiveM(Arrays.copyOf(fArr4, fArr4.length), 0, 70.0f, ((float) i3) / ((float) i), 1.0f, 1000.0f);
            GLES20.glViewport(0, 0, i3, i);
            a(fArr2, fArr3, fArr4);
            GLES20.glViewport(i3, 0, i3, i);
            a(fArr2, fArr3, fArr4);
            GLES20.glViewport(0, 0, i2, i);
            return;
        }
        a(fArr2, fArr3, fArr4);
    }

    public void release() {
        this.a.release();
    }

    public void setVrMode(boolean z) {
        this.i = z;
    }
}
