package defpackage;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ygg */
public final class ygg implements ygn<ygk, ygh> {
    private final aipn<igc> a;
    private final aipn<Set<ygh>> b;

    public ygg(aipn<igc> aipn, aipn<Set<ygh>> aipn2) {
        akcr.b(aipn, "storage");
        akcr.b(aipn2, "fileGroup");
        this.a = aipn;
        this.b = aipn2;
    }

    public final /* synthetic */ File a(ygl ygl) {
        ygh ygh = (ygh) ygl;
        akcr.b(ygh, "fileGroup");
        Object obj = this.a.get();
        akcr.a(obj, "storage.get()");
        File file = new File((File) ((igc) obj).b().b(), ygh.b().a);
        ygr.a(file);
        File file2 = new File(file, ygh.e());
        ygr.a(file2);
        return file2;
    }

    public final Set<ygh> a() {
        return new HashSet((Collection) this.b.get());
    }
}
