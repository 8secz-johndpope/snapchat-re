package defpackage;

import android.opengl.GLES20;
import android.os.SystemClock;
import com.map.shared.HeatmapTextureRendererImpl;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.acup.a;
import defpackage.acup.b;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ackm */
public final class ackm implements a {
    private boolean A;
    private int B;
    private int C;
    boolean a = true;
    boolean b;
    boolean c = true;
    private final adce d;
    private final boolean e;
    private boolean f = true;
    private acww g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private float p;
    private float q;
    private float r;
    private final ackh s = new ackh();
    private final aclo t;
    private final adbv u;
    private final acyj v;
    private final acxs w;
    private acui x;
    private acra y;
    private boolean z = false;

    public ackm(aclo aclo, acxs acxs, adce adce, adbv adbv, acyj acyj, boolean z) {
        this.e = z;
        this.t = aclo;
        this.u = adbv;
        this.v = acyj;
        if (acxs != null) {
            this.w = acxs;
            this.d = adce;
            this.h = -1;
            this.i = -1;
            return;
        }
        throw new IllegalArgumentException("TileManager is missing, please check your SnapMapOption.");
    }

    private static void a(alje alje, ByteBuffer byteBuffer) {
        alje alje2 = alje;
        ByteBuffer byteBuffer2 = byteBuffer;
        int i = 1;
        int i2 = 0;
        double d = (double) (alje2.b[1] - alje2.b[0]);
        int i3 = 0;
        while (i2 < MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL) {
            double d2 = (double) i2;
            Double.isNaN(d2);
            d2 /= 1000.0d;
            int i4 = i3 + 1;
            if (d2 > ((double) alje2.b[i4]) && i3 < alje2.b.length - i) {
                d = (double) (alje2.b[i4 + 1] - alje2.b[i4]);
                i3 = i4;
            }
            double d3 = (double) alje2.b[i3];
            Double.isNaN(d3);
            d2 = (d2 - d3) / d;
            d3 = (double) alje2.a[i3].a;
            double d4 = 1.0d - d2;
            Double.isNaN(d3);
            d3 *= d4;
            int i5 = i3 + 1;
            double d5 = (double) alje2.a[i5].a;
            Double.isNaN(d5);
            byte b = (byte) ((int) ((d3 + (d5 * d2)) * 255.0d));
            d5 = (double) alje2.a[i3].b;
            Double.isNaN(d5);
            d5 *= d4;
            double d6 = d;
            d = (double) alje2.a[i5].b;
            Double.isNaN(d);
            byte b2 = (byte) ((int) ((d5 + (d * d2)) * 255.0d));
            d = (double) alje2.a[i3].c;
            Double.isNaN(d);
            d *= d4;
            int i6 = i2;
            double d7 = (double) alje2.a[i5].c;
            Double.isNaN(d7);
            byte b3 = (byte) ((int) ((d + (d7 * d2)) * 255.0d));
            double d8 = (double) alje2.a[i3].d;
            Double.isNaN(d8);
            d8 *= d4;
            d4 = (double) alje2.a[i5].d;
            Double.isNaN(d4);
            byte b4 = (byte) ((int) ((d8 + (d4 * d2)) * 255.0d));
            byteBuffer2.put(b);
            byteBuffer2.put(b2);
            byteBuffer2.put(b3);
            byteBuffer2.put(b4);
            i2 = i6 + 1;
            d = d6;
            i = 1;
        }
    }

    private boolean e() {
        if (this.g == null) {
            int glCreateProgram = GLES20.glCreateProgram();
            if (glCreateProgram <= 0) {
                acuk.a();
                return false;
            }
            acww acww = new acww();
            try {
                acww.a(glCreateProgram, "precision highp int;\nprecision highp float;\nattribute vec2 a_pos;\nvarying vec2 v_texCoord;\nuniform vec2 u_scale;\nvoid main() {\n    v_texCoord = vec2((a_pos.x + 1.0) / 2.0,\n                      (a_pos.y + 1.0) / 2.0);\n    gl_Position = vec4(a_pos.xy, 0, 1);\n}\n", "precision mediump int;\nprecision mediump float;\n\nvarying vec2 v_texCoord;\nuniform float layerAlpha;\nuniform sampler2D renderedTexture;\nuniform sampler2D gradientTexture;\nuniform sampler2D u_tap_texture;\nuniform int u_use_tap_texture;\nvoid main(){\n    float heatAlpha = max(0.0, texture2D(renderedTexture, v_texCoord).a);\n    float tapAlpha = texture2D(u_tap_texture, v_texCoord).a * float(u_use_tap_texture);\n    heatAlpha =\tclamp(heatAlpha * (1.0 + tapAlpha *0.2), 0.0, 1.0);\n    vec4 color = texture2D(gradientTexture, vec2(heatAlpha, 0.5));\n    gl_FragColor = vec4(color.rgb, heatAlpha * layerAlpha);\n}\n");
                this.j = acww.a("a_pos");
                this.l = acww.b("renderedTexture");
                this.m = acww.b("gradientTexture");
                this.k = acww.b("layerAlpha");
                this.n = acww.b("u_tap_texture");
                this.o = acww.b("u_use_tap_texture");
                this.g = acww;
            } catch (IOException | IllegalAccessException e) {
                acww.a();
                throw new RuntimeException(e);
            }
        }
        if (this.h == -1) {
            acyi b = this.v.b();
            GLES20.glGenTextures(1, b.a);
            this.h = b.c();
            this.v.a(b);
            if (this.h == -1) {
                return false;
            }
        }
        if (this.i == -1) {
            alkm b2 = this.w.b(acxv.HEAT);
            if (b2 == null || b2.b == null) {
                return false;
            }
            acyi b3 = this.v.b();
            GLES20.glGenTextures(1, b3.a);
            int c = b3.c();
            this.v.a(b3);
            if (c == -1) {
                return false;
            }
            acyf a = this.v.a();
            ByteBuffer byteBuffer = a.a;
            ackm.a(b2.b.a, byteBuffer);
            byteBuffer.rewind();
            this.i = c;
            GLES20.glBindTexture(3553, this.i);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10240, 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL, 1, 0, 6408, 5121, byteBuffer);
            acyj acyj = this.v;
            synchronized (acyj.a) {
                acyj.a.put(4000, a);
            }
            this.r = b2.b.c;
            this.q = b2.b.b;
            this.p = b2.b.d;
        }
        if (this.x == null) {
            this.x = new acui(this.v);
        }
        return true;
    }

    private boolean f() {
        return this.C >= 5;
    }

    private void g() {
        if (this.g != null) {
            GLES20.glDisable(2929);
            GLES20.glDisable(2884);
            GLES20.glEnable(3042);
            GLES20.glBlendEquation(32774);
            GLES20.glBlendFunc(770, 771);
            this.g.b();
            GLES20.glUniform1f(this.k, 1.0f);
            GLES20.glUniform1i(this.l, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.h);
            GLES20.glUniform1i(this.m, 1);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.i);
            if (this.t.y) {
                GLES20.glUniform1i(this.o, 1);
                GLES20.glActiveTexture(33986);
                GLES20.glUniform1i(this.n, 2);
                GLES20.glBindTexture(3553, this.t.x);
            } else {
                GLES20.glUniform1i(this.o, 0);
            }
            this.x.a(this.j);
            GLES20.glDrawArrays(4, 0, 6);
        }
    }

    private /* synthetic */ void h() {
        HeatmapTextureRendererImpl.preloadLibraries();
        this.u.m();
    }

    public final Object a(cgi cgi, float f, float f2) {
        return null;
    }

    public final void a() {
        acyi b;
        acww acww = this.g;
        if (acww != null) {
            acww.a();
            this.g = null;
        }
        if (this.h != -1) {
            b = this.v.b();
            b.a.put(this.h);
            b.a.rewind();
            GLES20.glDeleteTextures(1, b.a);
            this.v.a(b);
            this.h = -1;
        }
        if (this.i != -1) {
            b = this.v.b();
            b.a.put(this.i);
            b.a.rewind();
            GLES20.glDeleteTextures(1, b.a);
            this.v.a(b);
            this.i = -1;
        }
        acui acui = this.x;
        if (acui != null) {
            acui.a.a();
            this.x = null;
        }
        acra acra = this.t.A;
        if (acra != null) {
            acra.a.setLatitude(0.0d);
            acra.a.setLongitude(0.0d);
            acra.b.setLatitude(0.0d);
            acra.b.setLongitude(0.0d);
        }
    }

    public final void a(acmj acmj, b bVar) {
        acmj acmj2 = acmj;
        b bVar2 = bVar;
        this.b = true;
        if (this.t.B) {
            Object obj = (f() || this.B <= 5) ? null : 1;
            if (obj != null) {
                this.t.B = false;
            } else if (HeatmapTextureRendererImpl.isSnapMapLibraryLoaded() && HeatmapTextureRendererImpl.isHeatmapSupported()) {
                acra acra = this.t.A;
                if (!(acra == null || acra.c + acra.f[0] == 0)) {
                    this.y = acra;
                }
                acra = this.y;
                if (acra == null) {
                    this.t.N = true;
                    this.b = false;
                } else if (e()) {
                    b bVar3;
                    long j;
                    boolean z;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    cgi cgi = bVar2.e;
                    cgi cgi2 = bVar2.f;
                    int i = (cgi.equals(acra.a) && cgi2.equals(acra.b)) ? 1 : 0;
                    if (i == 0) {
                        acra.a.setLatitude(cgi.getLatitude());
                        acra.a.setLongitude(cgi.getLongitude());
                        acra.b.setLatitude(cgi2.getLatitude());
                        acra.b.setLongitude(cgi2.getLongitude());
                    }
                    int i2 = i ^ 1;
                    if (i2 == 0 && acra.h) {
                        bVar3 = bVar2;
                        j = elapsedRealtime;
                    } else {
                        float f = this.u.b.density;
                        if (i2 != 0) {
                            for (i2 = 0; i2 <= 0; i2++) {
                                i = acra.d[0];
                                if (i > 0) {
                                    acmj2.a(i, acra.e[0], f);
                                }
                            }
                            acmj2.a(acra.f[0], acra.g[0], f);
                        }
                        boolean z2 = this.a;
                        this.a = false;
                        boolean z3 = acra.d[0] + acra.f[0] != 0;
                        if (this.f || z3) {
                            j = elapsedRealtime;
                            boolean z4 = z3;
                            acra.h = HeatmapTextureRendererImpl.renderHeatToTexture((double) bVar2.a, (double) bVar2.b, acmj.i(), acra.e, acra.c, acra.g, acra.f[0], this.h, z2, this.p, this.q, this.r, 18.0d, false, this.z ^ 1);
                            z = z4;
                        } else {
                            j = elapsedRealtime;
                            z = z3;
                        }
                        this.f = z;
                        if (acra.h) {
                            bVar3 = bVar;
                        } else {
                            bVar3 = bVar;
                            bVar3.g = true;
                        }
                    }
                    int i3 = this.t.C;
                    if (i3 == -1 || f()) {
                        g();
                        z = true;
                    } else {
                        if (SystemClock.elapsedRealtime() - j > ((long) i3)) {
                            z = true;
                            this.B++;
                        } else {
                            z = true;
                            this.C++;
                        }
                        bVar3.g = z;
                    }
                    this.s.a();
                    if (this.s.b()) {
                        bVar3.g = z;
                    }
                } else {
                    this.b = false;
                }
            } else {
                if (!this.A) {
                    this.A = true;
                    this.d.a(new -$$Lambda$ackm$pf3Tl8EC6WXB7ooLTMyS30M40Nk(this));
                }
            }
        }
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final String b() {
        return "HeatmapRenderer";
    }

    public final boolean c() {
        return this.c;
    }

    public final void d() {
        this.z = true;
    }
}
