package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

/* renamed from: aite */
public final class aite implements aitd {
    private final SharedPreferences a;
    private final String b;
    private final Context c;

    @Deprecated
    public aite(aiqo aiqo) {
        this(aiqo.f, aiqo.getClass().getName());
    }

    public aite(Context context, String str) {
        if (context != null) {
            this.c = context;
            this.b = str;
            this.a = this.c.getSharedPreferences(this.b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public final SharedPreferences a() {
        return this.a;
    }

    @TargetApi(9)
    public final boolean a(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    public final Editor b() {
        return this.a.edit();
    }
}
