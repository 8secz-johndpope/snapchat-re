package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.gdx.c;
import java.util.concurrent.TimeUnit;

/* renamed from: gfk */
public class gfk extends gfp {

    /* renamed from: gfk$a */
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

    private gfk(String str, ide ide, gep gep, gfk gfk) {
        gfk gfk2 = gfk;
        String str2 = str;
        akcr.b(str2, "extension");
        ide ide2 = ide;
        akcr.b(ide2, "attributedFeature");
        gep gep2 = gep;
        akcr.b(gep2, "cofContentType");
        akcr.b(gfk2, "group");
        this(gfk2.d, ide2, gep2, str2, false, 0, gfk2.c.a, 0, null, 928);
    }

    private gfk(String str, ide ide, gep gep, String str2, boolean z, long j, long j2, long j3, c cVar) {
        String str3 = str;
        akcr.b(str3, "name");
        ide ide2 = ide;
        akcr.b(ide2, "attributedFeature");
        gep gep2 = gep;
        akcr.b(gep2, "cofContentType");
        akcr.b(cVar, "cacheKeyTransformer");
        super(str3, str2, gep2, false, z, j2, false, j3, j, ide2, ryz.c.SMALL_MEDIA, cVar);
    }

    public /* synthetic */ gfk(String str, ide ide, gep gep, String str2, boolean z, long j, long j2, long j3, c cVar, int i) {
        int i2 = i;
        this(str, ide, (i2 & 4) != 0 ? gep.GENERIC_SMALL_TYPE : gep, (i2 & 8) != 0 ? null : str2, false, (i2 & 32) != 0 ? 5242880 : j, (i2 & 64) != 0 ? TimeUnit.DAYS.toMillis(7) : j2, (i2 & 256) != 0 ? -1 : j3, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? new gjf() : cVar);
    }

    public /* synthetic */ gfk(String str, ide ide, gfk gfk) {
        this(str, ide, gep.GENERIC_SMALL_TYPE, gfk);
    }
}
