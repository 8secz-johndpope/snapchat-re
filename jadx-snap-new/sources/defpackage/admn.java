package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;

/* renamed from: admn */
public final class admn {
    private final dib a;

    /* renamed from: admn$a */
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

    public admn(dib dib) {
        akcr.b(dib, "eventLogger");
        this.a = dib;
    }

    private void a(aami aami, boolean z, String str, Integer num, Integer num2, int i, int i2, long j, long j2, String str2) {
        akcr.b(aami, "apiName");
        akcr.b(str, "caller");
        akcr.b(str2, "failureReason");
        aacy aacy = new aacy();
        aacy.a(aami);
        aacy.b(str);
        if (z) {
            aacy.a(Boolean.TRUE);
            aacy.c(Long.valueOf((long) i));
            aacy.d(Long.valueOf((long) i2));
            aacy.a(Long.valueOf(j));
            aacy.b(Long.valueOf(j2));
        } else {
            aacy.a(str2);
        }
        if (!(num == null || num2 == null)) {
            aaxu aaxu = new aaxu();
            aaxu.b(Long.valueOf((long) num.intValue()));
            aaxu.a(Long.valueOf((long) num2.intValue()));
            aacy.a(aaxu);
        }
        this.a.a((aajt) aacy);
    }

    public static /* synthetic */ void a(admn admn, aami aami, boolean z, String str, Integer num, Integer num2, int i, int i2, long j, long j2, String str2, int i3) {
        int i4 = i3;
        admn.a(aami, z, str, num, num2, (i4 & 32) != 0 ? -1 : i, (i4 & 64) != 0 ? -1 : i2, (i4 & 128) != 0 ? -1 : j, (i4 & 256) != 0 ? -1 : j2, (i4 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? "" : str2);
    }
}
