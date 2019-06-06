package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.gdx.c;
import java.util.concurrent.TimeUnit;

/* renamed from: gfy */
public class gfy extends gfp {

    /* renamed from: gfy$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public gfy(String str, ide ide, gep gep, long j) {
        this(str, ide, gep, null, false, j, 0, null, 0, 960);
    }

    private gfy(String str, ide ide, gep gep, String str2, boolean z, long j, long j2, c cVar, long j3) {
        String str3 = str;
        akcr.b(str3, "name");
        ide ide2 = ide;
        akcr.b(ide2, "attributedFeature");
        gep gep2 = gep;
        akcr.b(gep2, "cofContentType");
        akcr.b(cVar, "cacheKeyTransformer");
        super(str3, str2, gep2, true, z, j, false, j2, Math.min(j3, 2147483648L), ide2, ryz.c.LARGE_MEDIA, cVar);
    }

    public /* synthetic */ gfy(String str, ide ide, gep gep, String str2, boolean z, long j, long j2, c cVar, long j3, int i) {
        int i2 = i;
        this(str, ide, gep, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? TimeUnit.DAYS.toMillis(1) : j, (i2 & 128) != 0 ? -1 : j2, (i2 & 256) != 0 ? new gjf() : cVar, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? 52428800 : j3);
    }
}
