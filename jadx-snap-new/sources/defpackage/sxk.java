package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.acaz.a;
import defpackage.acaz.b;
import defpackage.acaz.c;
import defpackage.acaz.d;
import defpackage.acaz.e;
import defpackage.acaz.f;
import defpackage.acaz.g;
import defpackage.acaz.i;
import java.util.Map;

/* renamed from: sxk */
public final class sxk extends acbb implements tbo {
    private final taf d = new taf();

    public sxk(Context context) {
        super(context, new ide("Opera", idi.OPERA) {
        });
    }

    public final void H_() {
        this.c.a(0, false);
    }

    public final void a(double d) {
        this.c.a(d);
    }

    public final void a(abnb abnb) {
    }

    public final void a(abqy abqy) {
    }

    public final void a(a aVar) {
        this.c.a(aVar);
    }

    public final void a(b bVar) {
        this.c.a(bVar);
    }

    public final void a(c cVar) {
        this.c.a(cVar);
    }

    public final void a(d dVar) {
    }

    public final void a(e eVar) {
        this.c.a(eVar);
    }

    public final void a(f fVar) {
        this.c.a(fVar);
    }

    public final void a(g gVar) {
    }

    public final void a(i iVar) {
        this.c.a(iVar);
    }

    public final void a(adfh adfh) {
        this.c.a(adfh);
    }

    public final void a(adiv adiv) {
        this.c.a(adiv);
    }

    public final void a(adkn adkn) {
        this.c.a = adkn;
    }

    public final void a(String str) {
    }

    public final void a(String str, Map<String, String> map) {
        this.c.a(getContext(), Uri.parse(str), map);
        e();
    }

    public final void a(syu syu) {
    }

    public final void a(boolean z) {
        acba acba;
        float f;
        if (z) {
            acba = this.c;
            f = MapboxConstants.MINIMUM_ZOOM;
        } else {
            acba = this.c;
            f = 1.0f;
        }
        acba.a(f, f);
    }

    public final void b() {
    }

    public final void b(boolean z) {
    }

    public final sra c() {
        return this.d.a();
    }

    public final void c(boolean z) {
        this.c.a(z);
    }

    public final aaun d() {
        return aaun.SC_MEDIA_PLAYER;
    }

    public final Bitmap getBitmap(Bitmap bitmap) {
        return this.a != null ? this.a.getBitmap(bitmap) : bitmap;
    }

    public final int getCurrentPosition() {
        return this.c.k();
    }

    public final boolean isAvailable() {
        return this.c.b != null;
    }

    public final void pause() {
        this.c.b();
    }

    public final void seekTo(int i) {
        this.c.a(i);
    }

    public final void start() {
        this.c.a();
    }
}
