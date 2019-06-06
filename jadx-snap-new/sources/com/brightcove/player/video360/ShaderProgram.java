package com.brightcove.player.video360;

import android.opengl.GLES20;
import android.util.Log;

public class ShaderProgram {
    public static final String TAG = "ShaderProgram";
    private int a;

    public ShaderProgram(String str, String str2) {
        int b = b(35633, str);
        int b2 = b(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        GlUtil.checkGlError("glCreateProgram");
        int i = 0;
        if (glCreateProgram == 0) {
            Log.e(TAG, "Could not create program");
        } else {
            GLES20.glAttachShader(glCreateProgram, b);
            str = "glAttachShader";
            GlUtil.checkGlError(str);
            GLES20.glAttachShader(glCreateProgram, b2);
            GlUtil.checkGlError(str);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.e(TAG, "Could not link program: ");
                Log.e(TAG, GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
        }
        this.a = i;
    }

    private static void a(int i, String str) {
        if (i < 0) {
            throw new RuntimeException("Could not find location for ".concat(String.valueOf(str)));
        }
    }

    private static int b(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GlUtil.checkGlError("glCreateShader type=".concat(String.valueOf(i)));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        str = TAG;
        StringBuilder stringBuilder = new StringBuilder("Could not compile shader ");
        stringBuilder.append(i);
        stringBuilder.append(":");
        Log.e(str, stringBuilder.toString());
        String str2 = TAG;
        StringBuilder stringBuilder2 = new StringBuilder(" ");
        stringBuilder2.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e(str2, stringBuilder2.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public int getAttribute(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        a(glGetAttribLocation, str);
        return glGetAttribLocation;
    }

    public int getShaderHandle() {
        return this.a;
    }

    public int getUniform(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, str);
        a(glGetUniformLocation, str);
        return glGetUniformLocation;
    }

    public void release() {
        GLES20.glDeleteProgram(this.a);
        this.a = -1;
    }
}
