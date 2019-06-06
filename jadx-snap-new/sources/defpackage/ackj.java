package defpackage;

import android.opengl.GLES20;
import android.os.SystemClock;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.acup.a;
import defpackage.acup.b;
import java.io.IOException;

/* renamed from: ackj */
public final class ackj implements a {
    private final aclo a;
    private final adbv b;
    private final acyj c;
    private acuf d;
    private float e;
    private float f;
    private float g;
    private float h;

    public ackj(aclo aclo, adbv adbv, acyj acyj) {
        this.a = aclo;
        this.b = adbv;
        this.c = acyj;
    }

    public final Object a(cgi cgi, float f, float f2) {
        return null;
    }

    public final void a() {
        acuf acuf = this.d;
        if (acuf != null) {
            if (acuf.a != null) {
                acuf.a.a();
            }
            if (acuf.d != null) {
                acuf.d.a.a();
            }
            this.d = null;
        }
    }

    public final void a(float f) {
        if (this.h != f) {
            this.e = MapboxConstants.MINIMUM_ZOOM;
            this.f = MapboxConstants.MINIMUM_ZOOM;
            this.g = MapboxConstants.MINIMUM_ZOOM;
            this.h = f;
            this.b.m();
        }
    }

    public final void a(acmj acmj, b bVar) {
        aclo aclo = this.a;
        cgi cgi = bVar.e;
        cgi cgi2 = bVar.f;
        Object obj = (cgi.equals(aclo.j) && cgi2.equals(aclo.k)) ? 1 : null;
        if (obj == null) {
            aclo.j.setLatitude(cgi.getLatitude());
            aclo.j.setLongitude(cgi.getLongitude());
            aclo.k.setLatitude(cgi2.getLatitude());
            aclo.k.setLongitude(cgi2.getLongitude());
            aclo.J = true;
        }
        aclo.K = SystemClock.elapsedRealtime();
        if (this.h != MapboxConstants.MINIMUM_ZOOM) {
            acuf acuf;
            if (this.d == null) {
                this.d = new acuf();
                acuf = this.d;
                acyj acyj = this.c;
                if (acuf.a == null) {
                    int glCreateProgram = GLES20.glCreateProgram();
                    if (glCreateProgram > 0) {
                        acww acww = new acww();
                        try {
                            acww.a(glCreateProgram, "precision highp int;\nprecision highp float;\nattribute vec2 a_pos;\n\nvoid main() {\n    gl_Position = vec4(a_pos.xy, 0.0, 1.0);\n}\n", "precision highp int;\nprecision highp float;\nuniform vec4 u_color;\n\nvoid main() {\n    gl_FragColor = u_color;\n}\n");
                            acuf.b = acww.a("a_pos");
                            acuf.c = acww.b("u_color");
                            acuf.a = acww;
                            acuf.d = new acui(acyj);
                        } catch (IOException | IllegalAccessException e) {
                            acww.a();
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            acuf = this.d;
            float f = this.h;
            if (acuf.a != null) {
                acuf.a.b();
                acuf.d.a(acuf.b);
                if (acuf.h != f) {
                    acuf.e = MapboxConstants.MINIMUM_ZOOM;
                    acuf.f = MapboxConstants.MINIMUM_ZOOM;
                    acuf.g = MapboxConstants.MINIMUM_ZOOM;
                    acuf.h = f;
                    GLES20.glUniform4f(acuf.c, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f);
                }
                GLES20.glDrawArrays(6, 0, 6);
            }
        }
    }

    public final String b() {
        return "BottomRenderer";
    }

    public final boolean c() {
        return true;
    }
}
