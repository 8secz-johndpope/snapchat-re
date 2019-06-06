package defpackage;

import android.widget.Toast;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: ieg */
public final class ieg {
    private static final a a;
    private static final zfw b;

    /* renamed from: ieg$a */
    public static final class a extends ide {
        a(String str, idi idi) {
            super(str, idi);
        }
    }

    /* renamed from: ieg$b */
    static final class b implements Runnable {
        private /* synthetic */ String a;
        private /* synthetic */ int b;

        b(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public final void run() {
            Toast.makeText(AppContext.get(), this.a, this.b).show();
        }
    }

    static {
        ieg ieg = new ieg();
        String str = "Toasts";
        a = new a(str, idi.APP_PLATFORM);
        b = new zfw(a.callsite(str));
    }

    private ieg() {
    }

    public static void a(String str, boolean z, int i) {
        if (!z || ieg.b()) {
            b.l().a((Runnable) new b(str, i));
        }
    }

    public static final boolean b() {
        Object a = abss.a();
        akcr.a(a, "ReleaseManager.getInstance()");
        return a.k();
    }
}
