package defpackage;

import com.snapchat.android.R;
import defpackage.tzl.a;

/* renamed from: ujs */
public abstract class ujs {

    /* renamed from: ujs$a */
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

    public static final tzm a(ujl ujl) {
        akcr.b(ujl, "postToolActivator");
        return ujl;
    }

    public static final ugi a(ugj ugj) {
        akcr.b(ugj, "toolContext");
        return new ugi("post_tool", R.drawable.preview_story, R.drawable.preview_story, false, false, ugj.a.getResources().getDimensionPixelSize(R.dimen.bottom_tool_button_padding), ugj.a.getResources().getDimensionPixelSize(R.dimen.bottom_tool_button_padding), a.BOTTOM_BAR, false, Integer.valueOf(R.string.post_button_hint_label_text), 256);
    }
}
