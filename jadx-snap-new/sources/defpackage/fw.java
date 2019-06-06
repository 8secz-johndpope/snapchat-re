package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: fw */
public abstract class fw {
    public abstract View a(int i);

    public fv a(Context context, String str, Bundle bundle) {
        return fv.instantiate(context, str, bundle);
    }

    public abstract boolean a();
}
