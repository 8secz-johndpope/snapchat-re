package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;
import com.google.android.gms.common.api.GoogleApiClient;
import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: nes */
public final class nes implements aiqc<ndm> {
    private final ajwy<Context> a;
    private final ajwy<abkb> b;
    private final ajwy<GoogleApiClient> c;
    private final ajwy<abka> d;
    private final ajwy<zgb> e;
    private final ajwy<nbt> f;
    private final ajwy<ftl> g;
    private final ajwy<ncc> h;

    public static ndm a(Context context, abkb abkb, GoogleApiClient googleApiClient, abka abka, ajwy<nbt> ajwy, ftl ftl, ncc ncc) {
        LocationManager locationManager = (LocationManager) context.getSystemService(MapboxEvent.TYPE_LOCATION);
        zgb.a(nbz.a.callsite("location-listener-setup-manager"));
        Handler r = zfw.r();
        if (ftl.a(nfg.ANDROID_ONLY_FUSED_LOCATION_PROVIDER)) {
            nds nds = new nds(abkb, googleApiClient, abka, ajwy, ncc, r);
        } else {
            ndt ndt = new ndt(locationManager, abkb, googleApiClient, r, abka, ajwy, ncc);
        }
        return (ndm) aiqf.a(r9, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        ajwy ajwy6 = this.f;
        ajwy ajwy7 = this.g;
        ajwy ajwy8 = this.h;
        Context context = (Context) ajwy.get();
        abkb abkb = (abkb) ajwy2.get();
        GoogleApiClient googleApiClient = (GoogleApiClient) ajwy3.get();
        abka abka = (abka) ajwy4.get();
        ajwy5.get();
        return nes.a(context, abkb, googleApiClient, abka, ajwy6, (ftl) ajwy7.get(), (ncc) ajwy8.get());
    }
}
