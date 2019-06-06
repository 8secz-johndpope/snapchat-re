package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.acq.a;
import java.io.InputStream;

/* renamed from: acd */
public final class acd<Data> implements acq<Uri, Data> {
    private final AssetManager a;
    private final a<Data> b;

    /* renamed from: acd$a */
    public interface a<Data> {
        zm<Data> a(AssetManager assetManager, String str);
    }

    /* renamed from: acd$b */
    public static class b implements a<ParcelFileDescriptor>, acr<Uri, ParcelFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        public final acq<Uri, ParcelFileDescriptor> a(acu acu) {
            return new acd(this.a, this);
        }

        public final zm<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new zq(assetManager, str);
        }
    }

    /* renamed from: acd$c */
    public static class c implements a<InputStream>, acr<Uri, InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        public final acq<Uri, InputStream> a(acu acu) {
            return new acd(this.a, this);
        }

        public final zm<InputStream> a(AssetManager assetManager, String str) {
            return new zv(assetManager, str);
        }
    }

    public acd(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    public final /* synthetic */ a a(Object obj, int i, int i2, zf zfVar) {
        Uri uri = (Uri) obj;
        return new a(new ahb(uri), this.b.a(this.a, uri.toString().substring(22)));
    }

    public final /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty()) {
            if ("android_asset".equals(uri.getPathSegments().get(0))) {
                return true;
            }
        }
        return false;
    }
}
