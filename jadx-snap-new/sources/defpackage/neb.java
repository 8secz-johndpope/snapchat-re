package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.location.LocationServices;

/* renamed from: neb */
public final class neb implements aiqc<GoogleApiClient> {
    private final ajwy<Context> a;
    private final ajwy<zgb> b;

    public static GoogleApiClient a(Context context) {
        Object obj = (Handler) zgb.a(nbz.a.callsite("LocationModule")).a.b();
        akcr.a(obj, "locationBgThreadHandler");
        return (GoogleApiClient) aiqf.a(new Builder(context).addApi(LocationServices.API).setHandler(obj).build(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        Context context = (Context) ajwy.get();
        this.b.get();
        return neb.a(context);
    }
}
