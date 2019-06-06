package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: -$$Lambda$gpd$vImqgF-p18yTkO6exU9rdmLZghs */
public final /* synthetic */ class -$$Lambda$gpd$vImqgF-p18yTkO6exU9rdmLZghs implements Callable {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$gpd$vImqgF-p18yTkO6exU9rdmLZghs(Context context) {
        this.f$0 = context;
    }

    public final Object call() {
        return this.f$0.getSharedPreferences("user_session_shared_pref", 0);
    }
}
