package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.SystemClock;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.doo.3;
import defpackage.dzc.a;
import defpackage.dzc.b;
import defpackage.dzc.c;
import java.util.concurrent.TimeUnit;

/* renamed from: dyo */
public final class dyo {
    private static final adie e = new adie();
    public final dov a;
    public Runnable b;
    public dzd c;
    public dzd d;
    private final ecu f;
    private final dya g;
    private final dpo h;
    private final adnw i;
    private final float[] j = new float[16];
    private final doo k;
    private adhu l;
    private dzc m;
    private long n = -1;
    private int o = 0;

    public dyo(ecu ecu, dya dya, dov dov) {
        this.f = ecu;
        this.g = dya;
        this.h = ecu.d;
        this.i = new adnw(dya.a().b(), dya.a().c());
        this.a = dov;
        this.k = doo.a();
    }

    private long a(long j) {
        return this.f.b == 3 ? TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) : this.o == 0 ? 0 : j - this.n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079 A:{SYNTHETIC, Splitter:B:25:0x0079} */
    private defpackage.dzd a(defpackage.adic r11) {
        /*
        r10 = this;
        r1 = defpackage.adic.TEXTURE_2D;
        if (r11 != r1) goto L_0x0009;
    L_0x0004:
        r1 = r10.c;
        if (r1 == 0) goto L_0x0009;
    L_0x0008:
        return r1;
    L_0x0009:
        r1 = defpackage.adic.EXTERNAL_OES;
        if (r11 != r1) goto L_0x0012;
    L_0x000d:
        r1 = r10.d;
        if (r1 == 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r1 = 0;
        r8 = new adhu;	 Catch:{ adjz -> 0x0076 }
        r2 = r10.i;	 Catch:{ adjz -> 0x0076 }
        r3 = r2.a;	 Catch:{ adjz -> 0x0076 }
        r2 = r10.i;	 Catch:{ adjz -> 0x0076 }
        r4 = r2.b;	 Catch:{ adjz -> 0x0076 }
        r2 = r10.g;	 Catch:{ adjz -> 0x0076 }
        r5 = r2.f();	 Catch:{ adjz -> 0x0076 }
        r2 = 4;
        r6 = new int[r2];	 Catch:{ adjz -> 0x0076 }
        r2 = 0;
        r6[r2] = r2;	 Catch:{ adjz -> 0x0076 }
        r7 = 1;
        r6[r7] = r2;	 Catch:{ adjz -> 0x0076 }
        r2 = 2;
        r7 = r10.i;	 Catch:{ adjz -> 0x0076 }
        r7 = r7.a;	 Catch:{ adjz -> 0x0076 }
        r6[r2] = r7;	 Catch:{ adjz -> 0x0076 }
        r2 = 3;
        r7 = r10.i;	 Catch:{ adjz -> 0x0076 }
        r7 = r7.b;	 Catch:{ adjz -> 0x0076 }
        r6[r2] = r7;	 Catch:{ adjz -> 0x0076 }
        r7 = 0;
        r2 = r8;
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ adjz -> 0x0076 }
        r10.l = r8;	 Catch:{ adjz -> 0x0076 }
        r9 = new dzd;	 Catch:{ adjz -> 0x0076 }
        r9.<init>();	 Catch:{ adjz -> 0x0076 }
        r2 = e;	 Catch:{ adjz -> 0x0073 }
        r1 = r10.h;	 Catch:{ adjz -> 0x0073 }
        r3 = r1.a();	 Catch:{ adjz -> 0x0073 }
        r1 = r10.i;	 Catch:{ adjz -> 0x0073 }
        r4 = r1.a;	 Catch:{ adjz -> 0x0073 }
        r1 = r10.i;	 Catch:{ adjz -> 0x0073 }
        r5 = r1.b;	 Catch:{ adjz -> 0x0073 }
        r7 = 0;
        r8 = new adhz;	 Catch:{ adjz -> 0x0073 }
        r1 = defpackage.abyb.a.a;	 Catch:{ adjz -> 0x0073 }
        r1 = r1.a;	 Catch:{ adjz -> 0x0073 }
        r8.<init>(r1);	 Catch:{ adjz -> 0x0073 }
        r1 = r9;
        r6 = r11;
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ adjz -> 0x0073 }
        r1 = defpackage.adic.TEXTURE_2D;
        if (r11 != r1) goto L_0x006e;
    L_0x0069:
        r10.c = r9;
        r0 = r10.c;
        return r0;
    L_0x006e:
        r10.d = r9;
        r0 = r10.d;
        return r0;
    L_0x0073:
        r0 = move-exception;
        r1 = r9;
        goto L_0x0077;
    L_0x0076:
        r0 = move-exception;
    L_0x0077:
        if (r1 == 0) goto L_0x007c;
    L_0x0079:
        r1.e();	 Catch:{ adjw -> 0x007c }
    L_0x007c:
        r1 = new dxx;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyo.a(adic):dzd");
    }

    public final void a() {
        dzc dzc = this.m;
        if (dzc != null) {
            dzc.a();
            this.m = null;
        }
    }

    public final void a(int i, adic adic, long j, adie adie, adie adie2, boolean z, eda eda, boolean z2, float f) {
        adic adic2 = adic;
        long j2 = j;
        eda eda2 = eda;
        boolean z3 = z2;
        float f2 = f;
        if (this.f.f.a(a(j2))) {
            long j3;
            if (this.o == 0) {
                this.o = 1;
                this.n = j2;
                doo doo = this.k;
                dov dov = this.a;
                if (dov != null) {
                    ((Handler) doo.b.get()).post(new 3(dov, System.currentTimeMillis()));
                }
            }
            long a = a(j2);
            if (eda2 != null) {
                eda2.a(this.f.a, TimeUnit.NANOSECONDS.toMillis(a));
            }
            this.g.b();
            if (i == -1) {
                j3 = a;
            } else if (f2 > MapboxConstants.MINIMUM_ZOOM) {
                int a2;
                int a3;
                b bVar;
                float[] fArr = adie.b;
                float[] fArr2 = adie2.b;
                if (this.m == null) {
                    int i2;
                    this.m = new dzc();
                    dzc dzc = this.m;
                    int i3 = this.i.a;
                    int i4 = this.i.b;
                    Preconditions.checkState(dzc.d ^ 1, "Cannot setup. Already set up.");
                    dzc.k = new a();
                    int max = Math.max(i3, i4);
                    int i5 = 1;
                    while (true) {
                        max >>= 1;
                        if (max == 0) {
                            break;
                        }
                        i5++;
                    }
                    max = 1 << Math.max(0, i5 - 1);
                    float f3 = 720.0f;
                    float f4 = 1280.0f;
                    if (i4 * 720 < i3 * 1280) {
                        f4 = (((float) i4) * 720.0f) / ((float) i3);
                    } else {
                        f3 = (((float) i3) * 1280.0f) / ((float) i4);
                    }
                    adnw adnw = new adnw((int) (f3 / 8.0f), (int) (f4 / 8.0f));
                    dzc.l = new c[]{new c(true, max, max), new c(false, adnw.a, adnw.b), new c(false, adnw.a, adnw.b)};
                    int[] iArr = new int[dzc.l.length];
                    GLES20.glGenTextures(iArr.length, iArr, 0);
                    for (max = 0; max < iArr.length; max++) {
                        dzc.l[max].d = iArr[max];
                    }
                    c[] cVarArr = dzc.l;
                    max = cVarArr.length;
                    i4 = 0;
                    while (i4 < max) {
                        c[] cVarArr2;
                        c cVar = cVarArr[i4];
                        GLES20.glActiveTexture(cVar.d);
                        GLES20.glBindTexture(3553, cVar.d);
                        if (cVar.a) {
                            cVarArr2 = cVarArr;
                            i2 = 3553;
                            i5 = 10241;
                            i3 = 9987;
                        } else {
                            cVarArr2 = cVarArr;
                            i2 = 3553;
                            i5 = 10241;
                            i3 = 9729;
                        }
                        GLES20.glTexParameteri(i2, i5, i3);
                        GLES20.glTexParameteri(i2, 10240, 9729);
                        GLES20.glTexParameteri(i2, 10242, 33071);
                        GLES20.glTexParameteri(i2, 10243, 33071);
                        GLES20.glTexImage2D(3553, 0, 6408, cVar.b, cVar.c, 0, 6408, 5121, null);
                        i4++;
                        cVarArr = cVarArr2;
                    }
                    GLES20.glBindTexture(3553, 0);
                    dzc.m = adht.a(dzc.a);
                    dzc.n = adht.a(dzc.b);
                    dzc.o = adht.a(dzc.c);
                    max = dzc.a(35633, "#version 100\nattribute vec2 aPosition;\nattribute vec2 aTexCoord;\nvarying vec2 vTexCoord;\nuniform mat4 uViewTransform;\nuniform mat4 uTextureTransform;\nvoid main() {\n    gl_Position = uViewTransform * vec4(aPosition, 0.0, 1.0);\n    vTexCoord = (uTextureTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n}\n");
                    a2 = dzc.a(35633, "#version 100\nattribute vec2 aPosition;\nattribute vec2 aTexCoord;\nvarying vec2 vTexCoord0;\nvarying vec2 vTexCoord1;\nvarying vec2 vTexCoord2;\nvarying vec2 vTexCoord3;\nvarying vec2 vTexCoord4;\nuniform vec2 uImageSize;\nconst vec2 offset = vec2(1.3846153846, 3.2307692308);\nvoid main() {\n   gl_Position = vec4(aPosition, 0.0, 1.0);\n   vTexCoord0 = aTexCoord;\n   vTexCoord1 = aTexCoord + vec2(0.0, offset.x/uImageSize.y);\n   vTexCoord2 = aTexCoord - vec2(0.0, offset.x/uImageSize.y);\n   vTexCoord3 = aTexCoord + vec2(0.0, offset.y/uImageSize.y);\n   vTexCoord4 = aTexCoord - vec2(0.0, offset.y/uImageSize.y);\n}\n");
                    i5 = dzc.a(35633, "#version 100\nattribute vec2 aPosition;\nattribute vec2 aTexCoord;\nvarying vec2 vTexCoord0;\nvarying vec2 vTexCoord1;\nvarying vec2 vTexCoord2;\nvarying vec2 vTexCoord3;\nvarying vec2 vTexCoord4;\nuniform vec2 uImageSize;\nconst vec2 offset = vec2(1.3846153846, 3.2307692308);\nvoid main() {\n   gl_Position = vec4(aPosition, 0.0, 1.0);\n   vTexCoord0 = aTexCoord;\n   vTexCoord1 = aTexCoord + vec2(offset.x/uImageSize.x, 0);\n   vTexCoord2 = aTexCoord - vec2(offset.x/uImageSize.x, 0);\n   vTexCoord3 = aTexCoord + vec2(offset.y/uImageSize.x, 0);\n   vTexCoord4 = aTexCoord - vec2(offset.y/uImageSize.x, 0);\n}\n");
                    i2 = dzc.a(35633, "#version 100\nattribute vec2 aPosition;\nattribute vec2 aTexCoord;\nvarying vec2 vTexCoord;\nvoid main() {\n   gl_Position = vec4(aPosition, 0.0, 1.0);\n   vTexCoord = aTexCoord;\n}\n");
                    i4 = dzc.a(35632, "#version 100\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTexCoord;\nuniform samplerExternalOES sTexture;\nuniform bool isLowLightOn;\nvoid main() {\n   if (isLowLightOn) {\n       float gamma = 0.667;\n       vec3 videoSample = texture2D(sTexture, vTexCoord).rgb;\n       vec3 rgbFactor = pow(videoSample, vec3(gamma));\n       gl_FragColor = vec4(rgbFactor, 1.0);\n   } else {\n       gl_FragColor = texture2D(sTexture, vTexCoord);\n   }\n}\n");
                    int a4 = dzc.a(35632, "#version 100\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTexCoord;\nuniform sampler2D sTexture;\nuniform bool isLowLightOn;\nvoid main() {\n   if (isLowLightOn) {\n       float gamma = 0.667;\n       vec3 videoSample = texture2D(sTexture, vTexCoord).rgb;\n       vec3 rgbFactor = pow(videoSample, vec3(gamma));\n       gl_FragColor = vec4(rgbFactor, 1.0);\n   } else {\n       gl_FragColor = texture2D(sTexture, vTexCoord);\n   }\n}\n");
                    j3 = a;
                    a3 = dzc.a(35632, "#version 100\nprecision mediump float;\nvarying vec2 vTexCoord0;\nvarying vec2 vTexCoord1;\nvarying vec2 vTexCoord2;\nvarying vec2 vTexCoord3;\nvarying vec2 vTexCoord4;\nuniform sampler2D sTexture;\nconst vec3 weight = vec3(0.2270270270, 0.3162162162, 0.0702702703);\nvoid main() {\n    gl_FragColor = vec4( \n       texture2D( sTexture, vTexCoord0 ).rgb * weight.x + \n       texture2D( sTexture, vTexCoord1 ).rgb * weight.y + \n       texture2D( sTexture, vTexCoord2 ).rgb * weight.y + \n       texture2D( sTexture, vTexCoord3 ).rgb * weight.z + \n       texture2D( sTexture, vTexCoord4 ).rgb * weight.z, 1.0); \n}\n");
                    int a5 = dzc.a(35632, "#version 100\nprecision mediump float;\nvarying vec2 vTexCoord;\nuniform sampler2D sTexture;\nuniform sampler2D sUnblurredTexture;\nuniform float uBlurPercent;\nvoid main() {\n   gl_FragColor = mix(texture2D(sUnblurredTexture, vTexCoord), texture2D(sTexture, vTexCoord), uBlurPercent);\n}\n");
                    int a6 = dzc.a(35632, "#version 100\nprecision mediump float;\nvarying vec2 vTexCoord;\nuniform sampler2D sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTexCoord);\n}\n");
                    dzc.e = new b(max, i4);
                    dzc.f = new b(max, a4);
                    dzc.g = new b(a2, a3);
                    dzc.h = new b(i5, a3);
                    dzc.i = new b(i2, a5);
                    dzc.j = new b(i2, a6);
                    dzc.d = true;
                } else {
                    j3 = a;
                }
                Matrix.multiplyMM(this.j, 0, this.h.a().b, 0, fArr2, 0);
                dzc dzc2 = this.m;
                float[] fArr3 = this.j;
                a2 = this.i.a;
                a3 = this.i.b;
                Preconditions.checkState(dzc2.d, "Cannot render. Not initialized.");
                GLES20.glBindFramebuffer(36160, dzc2.k.a[0]);
                b bVar2 = adic2.equals(adic.EXTERNAL_OES) ? dzc2.e : dzc2.f;
                a.a(dzc2.l[0]);
                b b = bVar2.a().a(dzc2.m).b(adic2.equals(adic.EXTERNAL_OES) ? dzc2.n : dzc2.o);
                GLES20.glUniform1i(GLES20.glGetUniformLocation(b.a, "isLowLightOn"), z3);
                b = b.a(i, adic, false, "sTexture", 0);
                GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(b.a, "uViewTransform"), 1, false, fArr3, 0);
                GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(b.a, "uTextureTransform"), 1, false, fArr, 0);
                GLES20.glDrawArrays(6, 0, 4);
                bVar2.b();
                a.a(dzc2.l[1]);
                dzc2.g.a().a(dzc2.m).b(dzc2.n).a(dzc2.l[0]).a((float) dzc2.l[1].b, (float) dzc2.l[1].c);
                GLES20.glDrawArrays(6, 0, 4);
                dzc2.g.b();
                a.a(dzc2.l[2]);
                dzc2.h.a().a(dzc2.m).b(dzc2.n).a(dzc2.l[1]).a((float) dzc2.l[2].b, (float) dzc2.l[2].c);
                GLES20.glDrawArrays(6, 0, 4);
                dzc2.h.b();
                GLES20.glViewport(0, 0, a2, a3);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                float f5 = f;
                if (f5 < 1.0f) {
                    b a7 = dzc2.i.a().a(dzc2.m).b(dzc2.n).a(dzc2.l[2]);
                    c cVar2 = dzc2.l[0];
                    GLES20.glUniform1f(GLES20.glGetUniformLocation(a7.a(cVar2.d, adic.TEXTURE_2D, cVar2.a, "sUnblurredTexture", 1).a, "uBlurPercent"), f5);
                    GLES20.glDrawArrays(6, 0, 4);
                    bVar = dzc2.i;
                } else {
                    dzc2.j.a().a(dzc2.m).b(dzc2.n).a(dzc2.l[2]);
                    GLES20.glDrawArrays(6, 0, 4);
                    bVar = dzc2.j;
                }
                bVar.b();
            } else {
                adie adie3 = adie;
                adie adie4 = adie2;
                j3 = a;
                a();
                try {
                    dzd a8 = a(adic2);
                    a8.a = adie2.clone();
                    a8.b = z3;
                    a8.a(i, 0, adie, this.l);
                } catch (adjz e) {
                    throw new dxx(e);
                }
            }
            if (this.f.b != 1 && this.g.e()) {
                this.g.a(j3);
            }
            if (z) {
                this.g.g();
                if (this.o == 1) {
                    this.o = 2;
                }
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                }
            }
            eda eda3 = eda;
            if (eda3 != null) {
                eda3.b(this.f.a, SystemClock.elapsedRealtime());
            }
            return;
        }
        if (eda2 != null) {
            eda2.a(this.f.a, -1);
            eda2.b(this.f.a, -1);
        }
    }
}
