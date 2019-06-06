package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.gel.b;
import defpackage.gih.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/* renamed from: ggy */
public final class ggy implements gel {
    private final int a = MapboxConstants.ANIMATION_DURATION_SHORT;
    private final ggq b;
    private final gih c;

    public ggy(ggq ggq, gih gih) {
        akcr.b(ggq, "trackerController");
        akcr.b(gih, "metricsReporter");
        this.b = ggq;
        this.c = gih;
    }

    private b a(String str, int i) {
        akcr.b(str, "attribution");
        b a = this.b.a(str, i);
        a((int) MapboxConstants.ANIMATION_DURATION_SHORT, a.ON_CONTENT_RESULT_CREATED);
        return a;
    }

    private final void a(int i, a aVar) {
        if (this.b.b() > i) {
            List a = this.b.a();
            this.b.c();
            this.c.a(a, aVar);
        }
    }

    public final gej a(ajxe<? extends InputStream> ajxe, String str, long j, String str2) {
        akcr.b(ajxe, "inputStream");
        akcr.b(str, "assetName");
        akcr.b(str2, "attribution");
        return new gdr(ajxe, str, j, a(str2, 0));
    }

    public final gej a(gez gez, gfl.a aVar, gff gff, String str) {
        akcr.b(gez, "fileLease");
        akcr.b(aVar, "assetDescriptorListFactory");
        akcr.b(gff, "metrics");
        akcr.b(str, "attribution");
        return new ggx(gez, aVar, gff, a(str, gez.a()));
    }

    public final gej a(File file, String str) {
        String str2 = "file";
        akcr.b(file, str2);
        String str3 = "attribution";
        akcr.b(str, str3);
        akcr.b(file, str2);
        akcr.b(str, str3);
        Object name = file.getName();
        akcr.a(name, "file.name");
        return a(name, file, str);
    }

    public final gej a(Iterable<? extends gej> iterable, String str) {
        akcr.b(iterable, "contentResults");
        akcr.b(str, "attribution");
        return new ggi(iterable, a(str, 0));
    }

    public final gej a(String str, File file, String str2) {
        String str3 = "assetName";
        akcr.b(str, str3);
        String str4 = "file";
        akcr.b(file, str4);
        akcr.b(str2, "attribution");
        b a = a(str2, 1);
        akcr.b(file, str4);
        akcr.b(str, str3);
        akcr.b(a, "resultTracker");
        if (file.exists()) {
            return new gib(file, str, a);
        }
        Throwable fileNotFoundException = new FileNotFoundException(file.getName());
        akcr.b(fileNotFoundException, "throwable");
        return ghx.a.a(fileNotFoundException, null);
    }

    public final void a() {
        a(0, a.ON_APP_BACKGROUND);
    }
}
