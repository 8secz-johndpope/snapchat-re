package defpackage;

import defpackage.gfl.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* renamed from: gig */
public final class gig extends ghm {
    final String a;
    private final a b = new a(this);

    /* renamed from: gig$a */
    public static final class a implements defpackage.gfl.a {
        private /* synthetic */ gig a;

        a(gig gig) {
            this.a = gig;
        }

        public final List<gdt> a(gez gez) {
            akcr.b(gez, "fileLease");
            if (gez.a() == 1) {
                return ajyl.a(new ggs(this.a.a, 0, gez));
            }
            throw new IllegalStateException("NamedAssetPayloadProcessor is used for content results with a single file");
        }
    }

    public gig(String str, akbl<? super InputStream, ? extends InputStream> akbl, akbl<? super OutputStream, ? extends OutputStream> akbl2) {
        akcr.b(str, "fileName");
        akcr.b(akbl, "inputOperator");
        akcr.b(akbl2, "outputOperator");
        super(akbl, akbl2, 4);
        this.a = str;
    }

    public final a a() {
        return this.b;
    }
}
