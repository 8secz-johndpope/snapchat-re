package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: ghq */
public final class ghq {
    static final akbk<String> a = a.a;

    /* renamed from: ghq$a */
    static final class a extends akcs implements akbk<String> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return defpackage.gfr.a.a();
        }
    }

    static final FileNotFoundException a(Uri uri) {
        return new FileNotFoundException("No uri handler found for ".concat(String.valueOf(uri)));
    }
}
