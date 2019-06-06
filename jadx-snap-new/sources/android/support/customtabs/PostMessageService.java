package android.support.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import defpackage.cg;
import defpackage.ci.a;

public class PostMessageService extends Service {
    private a a = new a() {
        public final void a(cg cgVar, Bundle bundle) {
            cgVar.a(bundle);
        }

        public final void a(cg cgVar, String str, Bundle bundle) {
            cgVar.b(str, bundle);
        }
    };

    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
