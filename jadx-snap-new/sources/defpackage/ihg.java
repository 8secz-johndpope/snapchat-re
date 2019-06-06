package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import com.snap.framework.startup.BackgroundService;
import com.snap.framework.startup.BackgroundService.a;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: ihg */
public final class ihg extends zgi {
    private final Context a;
    private final abss b;
    private final a c;

    public ihg(Context context, zgk<b> zgk, abss abss, a aVar) {
        super(zgk);
        this.a = context;
        this.b = abss;
        this.c = aVar;
    }

    public final ajej a() {
        Context context = this.a;
        abss abss = this.b;
        a aVar = this.c;
        if (!(BackgroundService.a || (abss.b() && ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()))) {
            Intent intent = new Intent(context, BackgroundService.class);
            intent.putExtra("sba", true);
            try {
                context.startService(intent);
            } catch (IllegalStateException e) {
                if (abss.m()) {
                    throw e;
                }
                aVar.onException(e);
            }
        }
        return ajfq.INSTANCE;
    }
}
