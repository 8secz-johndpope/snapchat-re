package defpackage;

import android.view.View;
import com.snap.hova.HovaNavIconContainerView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: ipl */
public final class ipl {
    final HashMap<zjm, WeakReference<View>> a = new HashMap();
    final HashMap<zjm, WeakReference<View>> b = new HashMap();
    boolean c;
    boolean d;

    static void a(View view, boolean z) {
        if (!(view instanceof HovaNavIconContainerView)) {
            view = null;
        }
        HovaNavIconContainerView hovaNavIconContainerView = (HovaNavIconContainerView) view;
        if (hovaNavIconContainerView != null) {
            hovaNavIconContainerView.b(z);
        }
    }
}
