package defpackage;

import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: absp */
public final class absp {
    public final AudioManager a;
    public final OnAudioFocusChangeListener b;
    public boolean c;

    /* renamed from: absp$a */
    public static class a {
        public static final absp a = new absp();
    }

    /* renamed from: absp$1 */
    class 1 implements OnAudioFocusChangeListener {
        1() {
        }

        public final void onAudioFocusChange(int i) {
            if (i == -1 || i == -2) {
                absp.this.c = false;
                return;
            }
            if (i == 1 || i == 2) {
                absp.this.c = true;
            }
        }
    }

    private absp() {
        this.a = (AudioManager) AppContext.get().getSystemService("audio");
        this.b = new 1();
    }

    /* synthetic */ absp(byte b) {
        this();
    }

    public final void a() {
        if (this.c && this.a.abandonAudioFocus(this.b) == 1) {
            this.c = false;
        }
    }
}
