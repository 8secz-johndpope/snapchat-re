package defpackage;

import defpackage.ygm.b;
import java.util.ArrayList;

/* renamed from: ogv */
public final class ogv extends ieo {
    private final ArrayList<b<ygk, ygh>> a;
    private final String b;
    private final String c;
    private final ygi d;

    public ogv(abyi abyi, idd idd, ygi ygi) {
        akcr.b(abyi, "mediaPackage");
        akcr.b(idd, "caller");
        akcr.b(ygi, "fileManager");
        this(abyi.c, abyi.d, idd, ygi);
    }

    public ogv(String str, String str2, idd idd, ygi ygi) {
        akcr.b(str, "editsId");
        akcr.b(str2, "mediaId");
        akcr.b(idd, "caller");
        akcr.b(ygi, "fileManager");
        super((byte) 0);
        this.b = str;
        this.c = str2;
        this.d = ygi;
        this.a = new ArrayList();
        try {
            this.a.add(this.d.l(ohq.MEDIA, this.c));
            this.a.add(this.d.l(ohq.OVERLAY, this.b));
            this.a.add(this.d.l(ohq.EDITS, this.b));
        } catch (Exception e) {
            m();
            throw e;
        }
    }

    public final void a() {
        for (b a : this.a) {
            a.a();
        }
        this.d.g(ohq.MEDIA, this.c);
        this.d.g(ohq.OVERLAY, this.b);
        this.d.g(ohq.EDITS, this.b);
    }
}
