package com.addlive.impl;

import android.opengl.GLES20;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class VideoTextureRenderer {
    private static final int SIZE_FLOAT = 4;
    private static final String mFragmentShaderSrc = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES u_Tex;\nvarying vec2 v_TexCoord;\nvoid main() {\n    gl_FragColor = texture2D(u_Tex, v_TexCoord);\n}";
    private static final String mFragmentShaderYuvSrc = "precision mediump float;\nuniform sampler2D u_TexY;\nuniform sampler2D u_TexU;\nuniform sampler2D u_TexV;\nuniform vec3 u_WidthScale;\nuniform vec2 u_TextureSize;\nvarying vec2 v_TexCoord;\nconst mat3 yuv2rgb = mat3(\n    1.00000,  1.00000, 1.0000,\n    0.00000, -0.18732, 1.8556,\n    1.57481, -0.46813, 0.0000);\nvoid main() {\n    vec2 texCoordMaxY = vec2((u_TextureSize.x - 0.5) / u_TextureSize.x, 1.0);\n    vec2 texCoordMaxUV = vec2((u_TextureSize.x - 1.0) / u_TextureSize.x, 1.0);\n    vec2 texCoordY = min(texCoordMaxY, v_TexCoord) * vec2(u_WidthScale.x, 1.0);\n    vec2 texCoordUV = min(texCoordMaxUV, v_TexCoord) * vec2(u_WidthScale.y, 1.0);\n    vec3 yuv = vec3(texture2D(u_TexY, texCoordY).r,\n                    texture2D(u_TexU, texCoordUV).r,\n                    texture2D(u_TexV, texCoordUV).r);\n    yuv -= vec3(0.0, 0.5, 0.5);\n    gl_FragColor = vec4(yuv2rgb*yuv, 1.0);\n}";
    private static final String mVertexShaderSrc = "attribute vec4 a_Position;\nvarying vec2 v_TexCoord;\nuniform mat4 u_Transform;\nuniform vec2 u_AspectCorrection;\nuniform vec4 u_yFlip;\nvoid main() {\n    gl_Position = a_Position * vec4(u_AspectCorrection, 1.0, 1.0);\n    vec4 uv = (a_Position * u_yFlip + 1.0) / 2.0;\n    v_TexCoord = (u_Transform * uv).st;\n}";
    private static final float[] vertices = new float[]{-1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, -1.0f, -1.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, -1.0f, MapboxConstants.MINIMUM_ZOOM};
    private int mAspectCorrectionUniform = -1;
    private int mProgram;
    private float mTextureAspectRatio = 0.5625f;
    private final TextureType mTextureType;
    private float[] mTransformMatrix = new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f};
    private int mTransformMatrixUniform = -1;

    public enum TextureType {
        External,
        YUV
    }

    public VideoTextureRenderer(TextureType textureType) {
        this.mTextureType = textureType;
    }

    private void buildPrograms() {
        String str = this.mTextureType == TextureType.External ? mFragmentShaderSrc : mFragmentShaderYuvSrc;
        int compileShader = compileShader(35633, mVertexShaderSrc);
        int compileShader2 = compileShader(35632, str);
        this.mProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(this.mProgram, compileShader);
        GLES20.glAttachShader(this.mProgram, compileShader2);
        GLES20.glLinkProgram(this.mProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.mProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            StringBuilder stringBuilder = new StringBuilder("Error linking program: ");
            stringBuilder.append(GLES20.glGetProgramInfoLog(this.mProgram));
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private int compileShader(int i, String str) {
        i = GLES20.glCreateShader(i);
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder("Error compiling shader: ");
        stringBuilder.append(GLES20.glGetShaderInfoLog(i));
        throw new RuntimeException(stringBuilder.toString());
    }

    private void createPlaneTexture(int i, int i2, int i3, ByteBuffer byteBuffer) {
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexImage2D(3553, 0, 6409, i, i2, 0, 6409, 5121, byteBuffer);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    private void renderGL() {
        GLES20.glUniformMatrix4fv(this.mTransformMatrixUniform, 1, false, this.mTransformMatrix, 0);
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void setupGLES() {
        buildPrograms();
        GLES20.glUseProgram(this.mProgram);
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.mProgram, "a_Position");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(vertices.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(vertices).rewind();
        int[] iArr = new int[]{0};
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(34962, iArr[0]);
        GLES20.glBufferData(34962, vertices.length << 2, asFloatBuffer, 35044);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, 0);
        if (this.mTextureType == TextureType.External) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.mProgram, "u_Tex"), 0);
        } else {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.mProgram, "u_TexY"), 0);
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.mProgram, "u_TexU"), 1);
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.mProgram, "u_TexV"), 2);
        }
        GLES20.glUniform4f(GLES20.glGetUniformLocation(this.mProgram, "u_yFlip"), 1.0f, -1.0f, 1.0f, 1.0f);
        this.mTransformMatrixUniform = GLES20.glGetUniformLocation(this.mProgram, "u_Transform");
        this.mAspectCorrectionUniform = GLES20.glGetUniformLocation(this.mProgram, "u_AspectCorrection");
    }

    public void bindYuvTextures(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 3; i3++) {
            GLES20.glActiveTexture(33984 + i3);
            GLES20.glBindTexture(3553, iArr2[i3]);
        }
        float f = (float) i;
        float f2 = (float) (i / 2);
        GLES20.glUniform3f(GLES20.glGetUniformLocation(this.mProgram, "u_WidthScale"), f / ((float) iArr[0]), f2 / ((float) iArr[1]), f2 / ((float) iArr[2]));
        float f3 = (float) i2;
        GLES20.glUniform2f(GLES20.glGetUniformLocation(this.mProgram, "u_TextureSize"), f, f3);
        setVideoTextureAspectRatio(f / f3);
    }

    public void createYuvTextures(int i, int[] iArr, int[] iArr2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        createPlaneTexture(iArr[0], i, iArr2[0], byteBuffer);
        i /= 2;
        createPlaneTexture(iArr[1], i, iArr2[1], byteBuffer2);
        createPlaneTexture(iArr[2], i, iArr2[2], byteBuffer3);
    }

    public void draw() {
        GLES20.glUniform4f(GLES20.glGetUniformLocation(this.mProgram, "u_yFlip"), 1.0f, -1.0f, 1.0f, 1.0f);
        renderGL();
    }

    public void drawFlipped() {
        GLES20.glUniform4f(GLES20.glGetUniformLocation(this.mProgram, "u_yFlip"), 1.0f, 1.0f, 1.0f, 1.0f);
        renderGL();
    }

    public void initialize() {
        setupGLES();
    }

    public void reshape(int i, int i2) {
        reshape(i, i2, this.mTextureAspectRatio);
    }

    public void reshape(int i, int i2, float f) {
        GLES20.glViewport(0, 0, i, i2);
        float f2 = this.mTextureAspectRatio;
        if (f > f2) {
            GLES20.glUniform2f(this.mAspectCorrectionUniform, 1.0f, f / f2);
        } else {
            GLES20.glUniform2f(this.mAspectCorrectionUniform, f2 / f, 1.0f);
        }
    }

    public void setMatrix(float[] fArr) {
        System.arraycopy(fArr, 0, this.mTransformMatrix, 0, 16);
    }

    public void setVideoTextureAspectRatio(float f) {
        this.mTextureAspectRatio = f;
    }

    public void updateYuvTextures(int i, int[] iArr, int[] iArr2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glTexImage2D(3553, 0, 6409, iArr[0], i, 0, 6409, 5121, byteBuffer);
        GLES20.glBindTexture(3553, iArr2[1]);
        int i2 = i / 2;
        GLES20.glTexImage2D(3553, 0, 6409, iArr[1], i2, 0, 6409, 5121, byteBuffer2);
        GLES20.glBindTexture(3553, iArr2[2]);
        GLES20.glTexImage2D(3553, 0, 6409, iArr[2], i2, 0, 6409, 5121, byteBuffer3);
    }
}
