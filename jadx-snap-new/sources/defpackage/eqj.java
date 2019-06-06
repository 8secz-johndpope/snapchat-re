package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import java.util.List;

/* renamed from: eqj */
public final class eqj extends epx<eps> {

    /* renamed from: eqj$a */
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

    public eqj(ContentResolver contentResolver, ifs ifs) {
        akcr.b(contentResolver, "contentResolver");
        akcr.b(ifs, "permissionHelper");
        super(contentResolver, new eqk(contentResolver, ifs));
    }

    public final String a() {
        return null;
    }

    public final List<Uri> b() {
        return ajyl.a(Media.EXTERNAL_CONTENT_URI);
    }
}
