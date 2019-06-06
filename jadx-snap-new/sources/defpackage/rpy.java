package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import defpackage.rpw.a;

/* renamed from: rpy */
public abstract class rpy extends BroadcastReceiver implements a {
    boolean a;
    final b b;
    final boolean c;
    private final IntentFilter d;

    /* renamed from: rpy$b */
    public interface b {
        Handler a();

        void a(boolean z);

        Context b();

        void b(boolean z);

        boolean c();

        abmh d();

        rqb e();

        OnAudioFocusChangeListener f();

        Handler g();

        void h();

        void i();
    }

    /* renamed from: rpy$a */
    public interface a {
        abjc a();

        abjc b();

        boolean c();

        boolean d();

        defpackage.abix.a e();

        boolean f();

        boolean g();
    }

    /* renamed from: rpy$c */
    static final class c implements Runnable {
        private /* synthetic */ rpy a;
        private /* synthetic */ Context b;
        private /* synthetic */ Intent c;

        c(rpy rpy, Context context, Intent intent) {
            this.a = rpy;
            this.b = context;
            this.c = intent;
        }

        public final void run() {
            if (this.a.a) {
                this.a.a(this.b, this.c);
            }
        }
    }

    public /* synthetic */ rpy(b bVar) {
        this(bVar, false);
    }

    protected rpy(b bVar, boolean z) {
        akcr.b(bVar, "delegate");
        this.b = bVar;
        this.c = z;
        this.d = new IntentFilter();
    }

    public abstract String a();

    /* Access modifiers changed, original: protected */
    public void a(Context context, Intent intent) {
        akcr.b(context, "context");
        akcr.b(intent, "intent");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str) {
        akcr.b(str, "intent");
        this.d.addAction(str);
    }

    public void a(boolean z) {
    }

    public abstract boolean a(a aVar);

    /* Access modifiers changed, original: protected|final */
    public final void b(boolean z) {
        String str = "RoutingStrategy";
        if (!this.c) {
            acbm.d().a(str);
        } else if (this.a) {
            this.b.a(z);
        } else {
            acbm.d().a(str);
        }
    }

    public boolean b() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void c() {
    }

    /* Access modifiers changed, original: protected */
    public void d() {
    }

    public void e() {
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean g() {
        return this.c && this.b.c();
    }

    public void h() {
        acbm.a d = acbm.d();
        StringBuilder stringBuilder = new StringBuilder("Entering ");
        stringBuilder.append(a());
        String str = " audio routing";
        stringBuilder.append(str);
        String str2 = "RoutingStrategy";
        d.a(str2);
        this.b.b().getApplicationContext().registerReceiver(this, this.d);
        this.a = true;
        c();
        d = acbm.d();
        StringBuilder stringBuilder2 = new StringBuilder("Entered ");
        stringBuilder2.append(a());
        stringBuilder2.append(str);
        d.a(str2);
    }

    public final void i() {
        acbm.a d = acbm.d();
        StringBuilder stringBuilder = new StringBuilder("Leaving ");
        stringBuilder.append(a());
        String str = " audio routing";
        stringBuilder.append(str);
        String str2 = "RoutingStrategy";
        d.a(str2);
        this.b.b().getApplicationContext().unregisterReceiver(this);
        this.a = false;
        d();
        d = acbm.d();
        StringBuilder stringBuilder2 = new StringBuilder("Left ");
        stringBuilder2.append(a());
        stringBuilder2.append(str);
        d.a(str2);
    }

    public void onReceive(Context context, Intent intent) {
        akcr.b(context, "context");
        akcr.b(intent, "intent");
        this.b.a().post(new c(this, context, intent));
    }
}
