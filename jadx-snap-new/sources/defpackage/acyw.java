package defpackage;

import com.mapbox.mapboxsdk.BitmapFactory;
import com.mapbox.mapboxsdk.http.HTTPRequest;
import defpackage.acmx.a;

/* renamed from: acyw */
public final class acyw implements acml {
    public static final acyw a = new acyw();
    private static aczb b;
    private static acmx c;

    private acyw() {
    }

    public final void a() {
        acmx acmx = c;
        if (acmx != null) {
            acmx.a();
        }
    }

    public final synchronized void a(a aVar) {
        akcr.b(aVar, "requestMakerFactory");
        if (b == null) {
            aczb aczb = new aczb();
            b = aczb;
            BitmapFactory.setAlternativeProvider(aczb);
        }
        if (c == null) {
            acmx acmx = c;
            if (acmx == null) {
                acmx = aVar.a();
            }
            c = acmx;
            HTTPRequest.setImpl(new aczm(acmx));
        }
    }
}
