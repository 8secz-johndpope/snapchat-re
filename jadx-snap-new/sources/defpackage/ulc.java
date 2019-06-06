package defpackage;

import com.snapchat.android.R;
import defpackage.tzl.a;

/* renamed from: ulc */
public abstract class ulc {

    /* renamed from: ulc$a */
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

    public static final tzm a(ukw ukw) {
        akcr.b(ukw, "soundToolActivator");
        return ukw;
    }

    public static final ugi a(ugj ugj) {
        akcr.b(ugj, "toolContext");
        return new ugi("sound_tool", R.drawable.sound_tools_subtool_standard, R.drawable.sound_tools_subtool_standard_button, false, false, 0, ugj.a.getResources().getDimensionPixelSize(R.dimen.bottom_tool_button_padding), a.BOTTOM_BAR, false, Integer.valueOf(R.string.sound_button_hint_label_text), 256);
    }
}
