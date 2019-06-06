package defpackage;

import com.snapchat.android.R;
import defpackage.tzl.a;

/* renamed from: ujy */
public abstract class ujy {

    /* renamed from: ujy$a */
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

    public static final tzm a(ujw ujw) {
        akcr.b(ujw, "saveToolActivator");
        return ujw;
    }

    public static final ugi a(ugj ugj) {
        akcr.b(ugj, "toolContext");
        return new ugi("save_tool", R.drawable.preview_save, R.drawable.preview_save_check, false, false, ugj.a.getResources().getDimensionPixelSize(R.dimen.bottom_tool_button_padding), ugj.a.getResources().getDimensionPixelSize(R.dimen.bottom_tool_button_padding), a.BOTTOM_BAR, false, Integer.valueOf(R.string.save_button_hint_label_text), 256);
    }
}
