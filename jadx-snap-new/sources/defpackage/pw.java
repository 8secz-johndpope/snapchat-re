package defpackage;

import android.content.Context;

/* renamed from: pw */
public abstract class pw {
    protected pw() {
    }

    public static pw a() {
        qg b = qg.b();
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void a(Context context, pl plVar) {
        synchronized (qg.l) {
            if (qg.j != null) {
                if (qg.k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (qg.j == null) {
                context = context.getApplicationContext();
                if (qg.k == null) {
                    qg.k = new qg(context, plVar, new sp());
                }
                qg.j = qg.k;
            }
        }
    }

    public abstract ps a(String str);

    public abstract ps a(String str, int i, pt ptVar);
}
