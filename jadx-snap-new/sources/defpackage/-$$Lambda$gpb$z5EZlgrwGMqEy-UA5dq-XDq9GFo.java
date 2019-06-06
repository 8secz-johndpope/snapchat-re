package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: -$$Lambda$gpb$z5EZlgrwGMqEy-UA5dq-XDq9GFo */
public final /* synthetic */ class -$$Lambda$gpb$z5EZlgrwGMqEy-UA5dq-XDq9GFo implements Callable {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$gpb$z5EZlgrwGMqEy-UA5dq-XDq9GFo(Context context) {
        this.f$0 = context;
    }

    public final Object call() {
        return this.f$0.getSharedPreferences("user_session_shared_pref", 0);
    }
}
