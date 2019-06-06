package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;

/* renamed from: ogj */
public final class ogj implements gfs {
    private final odu a;

    /* renamed from: ogj$a */
    static final class a<T, R> implements ajfc<T, ajdn<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "fallbackUri");
            return optional.isPresent() ? ajdj.b(optional.get()) : ajvo.a(ajlu.a);
        }
    }

    /* renamed from: ogj$b */
    static final class b<T> implements ajfb<Uri> {
        private /* synthetic */ Uri a;

        b(Uri uri) {
            this.a = uri;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public ogj(odu odu) {
        akcr.b(odu, "mediaPackageManager");
        this.a = odu;
    }

    public final ajdj<Uri> a(Uri uri) {
        akcr.b(uri, "primaryUri");
        Object c = this.a.a(uri).b((ajfc) a.a).c((ajfb) new b(uri));
        akcr.a(c, "mediaPackageManager.look…ckUri\")\n                }");
        return c;
    }
}
