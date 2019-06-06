package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import defpackage.zm.a;
import java.io.IOException;

/* renamed from: zk */
public abstract class zk<T> implements zm<T> {
    private final String a;
    private final AssetManager b;
    private T c;

    public zk(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    public abstract T a(AssetManager assetManager, String str);

    public abstract void a(T t);

    public final void a(yk ykVar, a<? super T> aVar) {
        try {
            this.c = a(this.b, this.a);
            aVar.a(this.c);
        } catch (IOException e) {
            String str = "AssetPathFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to load data from asset manager", e);
            }
            aVar.a(e);
        }
    }

    public final void b() {
        Object obj = this.c;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException unused) {
            }
        }
    }

    public final void c() {
    }

    public final yx d() {
        return yx.LOCAL;
    }
}
