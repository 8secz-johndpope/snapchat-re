package android.support.customtabs;

import android.app.Service;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import defpackage.cf;
import defpackage.cg;
import defpackage.ch.a;
import defpackage.iv;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service {
    final Map<IBinder, DeathRecipient> a = new iv();
    private a b = new a() {
        public final int a(cg cgVar, String str, Bundle bundle) {
            CustomTabsService customTabsService = CustomTabsService.this;
            cf cfVar = new cf(cgVar);
            return customTabsService.g();
        }

        public final Bundle a(String str, Bundle bundle) {
            return CustomTabsService.this.d();
        }

        public final boolean a(long j) {
            return CustomTabsService.this.a();
        }

        public final boolean a(cg cgVar) {
            final cf cfVar = new cf(cgVar);
            try {
                AnonymousClass1 anonymousClass1 = new DeathRecipient() {
                    public final void binderDied() {
                        CustomTabsService.this.a(cfVar);
                    }
                };
                synchronized (CustomTabsService.this.a) {
                    cgVar.asBinder().linkToDeath(anonymousClass1, 0);
                    CustomTabsService.this.a.put(cgVar.asBinder(), anonymousClass1);
                }
                return CustomTabsService.this.b();
            } catch (RemoteException unused) {
                return false;
            }
        }

        public final boolean a(cg cgVar, int i, Uri uri, Bundle bundle) {
            CustomTabsService customTabsService = CustomTabsService.this;
            cf cfVar = new cf(cgVar);
            return customTabsService.h();
        }

        public final boolean a(cg cgVar, Uri uri) {
            CustomTabsService customTabsService = CustomTabsService.this;
            cf cfVar = new cf(cgVar);
            return customTabsService.f();
        }

        public final boolean a(cg cgVar, Uri uri, Bundle bundle, List<Bundle> list) {
            CustomTabsService customTabsService = CustomTabsService.this;
            cf cfVar = new cf(cgVar);
            return customTabsService.c();
        }

        public final boolean a(cg cgVar, Bundle bundle) {
            CustomTabsService customTabsService = CustomTabsService.this;
            cf cfVar = new cf(cgVar);
            return customTabsService.e();
        }
    };

    public abstract boolean a();

    /* Access modifiers changed, original: protected|final */
    public final boolean a(cf cfVar) {
        try {
            synchronized (this.a) {
                IBinder a = cfVar.a();
                a.unlinkToDeath((DeathRecipient) this.a.get(a), 0);
                this.a.remove(a);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract Bundle d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract int g();

    public abstract boolean h();
}
