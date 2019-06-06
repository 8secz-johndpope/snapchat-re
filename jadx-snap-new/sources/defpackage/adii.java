package defpackage;

import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.adid.a;

/* renamed from: adii */
public class adii extends adiv {
    private final a a;
    private adhk b;
    int c;
    public adie d;
    private adid e;
    private adic f;
    private adie g;
    private adie h;
    private adhz i;

    public adii() {
        this(new a(), adhk.a);
    }

    private adii(a aVar, adhk adhk) {
        this.c = 1;
        this.a = aVar;
        this.b = adhk;
    }

    private adhy a(adic adic) {
        return this.i.a(d(), adic.mFragmentShaderDefinition);
    }

    /* Access modifiers changed, original: protected */
    public adie a(adie adie, adie adie2) {
        return adie.clone().a(adie2);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    /* Access modifiers changed, original: protected */
    public void a(int i) {
    }

    public void a(int i, int i2, adic adic) {
        Preconditions.checkState(this.c == 2, "Cannot change input. Not set up.");
        if (this.f != adic) {
            this.f = adic;
            this.e.a();
            this.e = new adid();
            this.e.a(this.i.a(R.raw.default_vertex_shader), a(adic));
        }
    }

    public void a(int i, long j, adie adie, adhu adhu) {
        Preconditions.checkState(this.c == 2, "Cannot render. Not set up.");
        this.g = a(this.h, this.d);
        if (b()) {
            f();
            GLES20.glClear(16640);
        }
        this.e.b();
        a();
        this.e.a(this.g, adie, i, this.f);
        if (c()) {
            GLES20.glFinish();
        }
    }

    public void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        i = this.c;
        boolean z = true;
        if (!(i == 1 || i == 3)) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot setup. Already set up.");
        this.f = adic;
        this.h = adie;
        this.d = adie2;
        this.i = adhz;
        this.e = new adid();
        this.e.a(adhz.a(R.raw.default_vertex_shader), a(adic));
        a(this.e.a);
        this.c = 2;
    }

    /* Access modifiers changed, original: protected */
    public int d() {
        return R.raw.default_fragment_shader;
    }

    public void e() {
        if (this.c == 2) {
            this.i.a();
            this.e.a();
            this.c = 3;
        }
    }

    /* Access modifiers changed, original: protected */
    public void f() {
        GLES20.glClearColor(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f);
    }
}
