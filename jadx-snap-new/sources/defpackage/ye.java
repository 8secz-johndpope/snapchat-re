package defpackage;

import android.content.Context;
import android.util.Log;
import com.snap.imageloading.internal.glide4.setup.Glide4GlideModule;
import defpackage.afo.a;
import java.util.Collections;
import java.util.Set;

/* renamed from: ye */
final class ye extends yd {
    private final Glide4GlideModule a = new Glide4GlideModule();

    ye() {
        String str = "Glide";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Discovered AppGlideModule from annotation: com.snap.imageloading.internal.glide4.setup.Glide4GlideModule");
        }
    }

    public final Set<Class<?>> a() {
        return Collections.emptySet();
    }

    public final void a(Context context, yh yhVar, yl ylVar) {
        this.a.a(context, yhVar, ylVar);
    }

    public final void a(Context context, yi yiVar) {
        this.a.a(context, yiVar);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ a b() {
        return new yf();
    }

    public final boolean c() {
        return false;
    }
}
