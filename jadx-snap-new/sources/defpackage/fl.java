package defpackage;

import android.view.View;
import android.view.WindowId;

/* renamed from: fl */
final class fl implements fm {
    private final WindowId a;

    fl(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fl) && ((fl) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
