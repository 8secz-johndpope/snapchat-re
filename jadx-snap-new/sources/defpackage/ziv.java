package defpackage;

import android.support.v7.widget.DefaultItemAnimator;

/* renamed from: ziv */
public final class ziv extends DefaultItemAnimator {
    private final String a;

    public ziv(String str) {
        akcr.b(str, "tag");
        this.a = str;
    }

    public final void runPendingAnimations() {
        try {
            super.runPendingAnimations();
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Found exception in ");
            stringBuilder.append(this.a);
            throw new Exception(stringBuilder.toString(), e);
        }
    }
}
