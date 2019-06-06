package defpackage;

import android.content.Context;
import com.snapchat.android.R;

/* renamed from: abzj */
public final class abzj {
    private final Context a;

    /* renamed from: abzj$a */
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

    public abzj(Context context) {
        akcr.b(context, "context");
        this.a = context;
    }

    public final aeer a() {
        aeer aeer = new aeer();
        aeer.a = "Classic";
        aeer.w = this.a.getString(R.string.classic_style_display_name);
        return aeer;
    }

    public final aeer b() {
        aeer aeer = new aeer();
        aeer.a = "Big Text";
        aeer.w = this.a.getString(R.string.big_text_style_display_name);
        return aeer;
    }
}
