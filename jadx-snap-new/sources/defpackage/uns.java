package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snapchat.android.R;
import defpackage.tzl.a;

/* renamed from: uns */
public abstract class uns {

    /* renamed from: uns$a */
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

    public static final tzm a(unp unp) {
        akcr.b(unp, "trashCanToolActivator");
        return unp;
    }

    public static final ugi a() {
        return new ugi("trash_can", R.drawable.preview_trash, R.drawable.preview_trash, false, false, -1, 0, a.VERTICAL_BAR, false, null, RasterSource.DEFAULT_TILE_SIZE);
    }
}
