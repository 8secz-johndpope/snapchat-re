package defpackage;

import android.graphics.Bitmap;
import com.snap.core.db.record.MessageMediaRefModel;

/* renamed from: mhg */
public interface mhg {

    /* renamed from: mhg$a */
    public static final class a implements mhg {
        public static final a a = new a();

        private a() {
        }

        public final ajdp<Bitmap> a(miq miq, mhf mhf) {
            akcr.b(miq, MessageMediaRefModel.URI);
            akcr.b(mhf, "config");
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }
    }

    ajdp<Bitmap> a(miq miq, mhf mhf);
}
