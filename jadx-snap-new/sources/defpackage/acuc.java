package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.opengl.GLES20;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: acuc */
public final class acuc {
    public final acyj a;
    public final a b;
    public acww c;
    public acui d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    private final boolean q;

    /* renamed from: acuc$a */
    public interface a {
        void a(Context context);
    }

    public acuc(acyj acyj, boolean z, a aVar) {
        this.a = acyj;
        this.q = z;
        this.b = aVar;
    }

    public static void b() {
        GLES20.glDrawArrays(6, 0, 6);
    }

    public final acuc a(float f) {
        if (f == MapboxConstants.MINIMUM_ZOOM) {
            GLES20.glUniform2f(this.o, MapboxConstants.MINIMUM_ZOOM, 1.0f);
        } else {
            double d = (double) f;
            GLES20.glUniform2f(this.o, (float) Math.sin(d), (float) Math.cos(d));
        }
        return this;
    }

    public final acuc a(float f, float f2) {
        GLES20.glUniform2f(this.f, f, f2);
        return this;
    }

    public final acuc a(int i) {
        GLES20.glUniform4f(this.p, ((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f, ((float) Color.alpha(i)) / 255.0f);
        return this;
    }

    public final boolean a() {
        acww acww = this.c;
        if (acww == null) {
            return false;
        }
        acww.b();
        acui acui = this.d;
        if (acui != null) {
            acui.a(this.e);
        }
        GLES20.glUniform1i(this.h, 0);
        GLES20.glUniform2f(this.o, MapboxConstants.MINIMUM_ZOOM, 1.0f);
        GLES20.glBlendEquation(32774);
        GLES20.glBlendFunc(1, 771);
        GLES20.glUniform2f(this.j, 0.5f, 0.5f);
        GLES20.glUniform4f(this.p, 1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glActiveTexture(33984);
        return true;
    }

    public final boolean a(acur acur, float f) {
        acxn acxn = acur.g;
        if (acxn == null || !acxn.a()) {
            return false;
        }
        b(acur.m, acur.n).b(1).c(acur.f * f).a(acur.i, acur.j).a(acur.o).a(acur.l()).c(acxn.a.a);
        acuc.b();
        return true;
    }

    public final acuc b(float f) {
        GLES20.glUniform2f(this.j, 0.5f, f);
        return this;
    }

    public final acuc b(float f, float f2) {
        GLES20.glUniform2f(this.g, f, f2);
        return this;
    }

    public final acuc b(int i) {
        GLES20.glUniform1i(this.k, i);
        return this;
    }

    public final acuc c(float f) {
        GLES20.glUniform1f(this.i, f);
        return this;
    }

    public final acuc c(int i) {
        GLES20.glBindTexture(3553, i);
        return this;
    }
}
