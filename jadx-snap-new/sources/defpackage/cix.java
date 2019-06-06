package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.util.concurrent.Callable;

/* renamed from: cix */
public final class cix implements ciy {
    final Context a;

    /* renamed from: cix$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ cix a;

        a(cix cix) {
            this.a = cix;
        }

        public final /* synthetic */ Object call() {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.a.a);
        }
    }

    public cix(Context context) {
        akcr.b(context, "context");
        this.a = context;
    }

    public final ajdx<Info> a() {
        Object c = ajdx.c((Callable) new a(this));
        akcr.a(c, "Single.fromCallable { Ad…ertisingIdInfo(context) }");
        return c;
    }
}
