package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.gdx.c;
import java.util.concurrent.TimeUnit;

/* renamed from: gfz */
public class gfz extends gfp {

    /* renamed from: gfz$a */
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

    public gfz(String str, ide ide) {
        this(str, ide, null, null, false, 0, 0, false, 0, null, 1020);
    }

    public gfz(String str, ide ide, gep gep) {
        this(str, ide, gep, null, false, 0, 0, false, 0, null, 1016);
    }

    private gfz(String str, ide ide, gep gep, String str2, boolean z, long j, long j2, boolean z2, long j3, c cVar) {
        String str3 = str;
        akcr.b(str3, "name");
        ide ide2 = ide;
        akcr.b(ide2, "attributedFeature");
        gep gep2 = gep;
        akcr.b(gep2, "cofContentType");
        akcr.b(cVar, "cacheKeyTransformer");
        super(str3, str2, gep2, true, z, j2, z2, j3, j, ide2, ryz.c.SMALL_MEDIA, cVar);
    }

    public /* synthetic */ gfz(String str, ide ide, gep gep, String str2, boolean z, long j, long j2, boolean z2, long j3, c cVar, int i) {
        int i2 = i;
        this(str, ide, (i2 & 4) != 0 ? gep.GENERIC_SMALL_TYPE : gep, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 5242880 : j, (i2 & 64) != 0 ? TimeUnit.DAYS.toMillis(7) : j2, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? -1 : j3, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? new gjf() : cVar);
    }
}
