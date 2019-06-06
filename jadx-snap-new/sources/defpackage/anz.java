package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import com.bumptech.glide3.manager.SupportRequestManagerFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: anz */
public final class anz implements Callback {
    public static final anz a = new anz();
    private volatile aib b;
    private Map<FragmentManager, any> c = new HashMap();
    private Map<fz, SupportRequestManagerFragment> d = new HashMap();
    private final Handler e = new Handler(Looper.getMainLooper(), this);

    anz() {
    }

    @TargetApi(11)
    private aib a(Activity activity) {
        if (aps.c()) {
            return a(activity.getApplicationContext());
        }
        if (anz.b(activity)) {
            if (!ahx.a) {
                return b((Context) activity);
            }
            anz.a();
        }
        return a((Context) activity, activity.getFragmentManager());
    }

    @TargetApi(11)
    private aib a(Context context, FragmentManager fragmentManager) {
        any a = a(fragmentManager);
        aib aib = a.c;
        if (aib != null) {
            return aib;
        }
        aib = new aib(context, a.a, a.b);
        a.c = aib;
        return aib;
    }

    private aib a(Context context, fz fzVar) {
        SupportRequestManagerFragment a = a(fzVar);
        aib aib = a.a;
        if (aib != null) {
            return aib;
        }
        aib = new aib(context, a.b, a.c);
        a.a = aib;
        return aib;
    }

    private aib a(FragmentActivity fragmentActivity) {
        if (aps.c()) {
            return a(fragmentActivity.getApplicationContext());
        }
        if (anz.b((Activity) fragmentActivity)) {
            if (!ahx.a) {
                return b((Context) fragmentActivity);
            }
            anz.a();
        }
        return a((Context) fragmentActivity, fragmentActivity.b());
    }

    private static void a() {
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    private aib b(Context context) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = new aib(context.getApplicationContext(), new anq(), new anu());
                }
            }
        }
        return this.b;
    }

    @TargetApi(17)
    private static boolean b(Activity activity) {
        return VERSION.SDK_INT >= 17 && activity.isDestroyed();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x003a in {8, 12, 15, 17, 19} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.aib a(android.content.Context r2) {
        /*
        r1 = this;
        if (r2 == 0) goto L_0x0032;
        r0 = defpackage.aps.b();
        if (r0 == 0) goto L_0x002d;
        r0 = r2 instanceof android.app.Application;
        if (r0 != 0) goto L_0x002d;
        r0 = r2 instanceof android.support.v4.app.FragmentActivity;
        if (r0 == 0) goto L_0x0017;
        r2 = (android.support.v4.app.FragmentActivity) r2;
        r2 = r1.a(r2);
        return r2;
        r0 = r2 instanceof android.app.Activity;
        if (r0 == 0) goto L_0x0022;
        r2 = (android.app.Activity) r2;
        r2 = r1.a(r2);
        return r2;
        r0 = r2 instanceof android.content.ContextWrapper;
        if (r0 == 0) goto L_0x002d;
        r2 = (android.content.ContextWrapper) r2;
        r2 = r2.getBaseContext();
        goto L_0x0000;
        r2 = r1.b(r2);
        return r2;
        r2 = new java.lang.IllegalArgumentException;
        r0 = "You cannot start a load on a null Context";
        r2.<init>(r0);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anz.a(android.content.Context):aib");
    }

    /* Access modifiers changed, original: final */
    @TargetApi(17)
    public final any a(FragmentManager fragmentManager) {
        String str = "com.bumptech.glide3.manager";
        any any = (any) fragmentManager.findFragmentByTag(str);
        if (any != null) {
            return any;
        }
        any = (any) this.c.get(fragmentManager);
        if (any != null) {
            return any;
        }
        any = new any();
        this.c.put(fragmentManager, any);
        fragmentManager.beginTransaction().add(any, str).commitAllowingStateLoss();
        this.e.obtainMessage(1, fragmentManager).sendToTarget();
        return any;
    }

    public final SupportRequestManagerFragment a(fz fzVar) {
        String str = "com.bumptech.glide3.manager";
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fzVar.a(str);
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        supportRequestManagerFragment = (SupportRequestManagerFragment) this.d.get(fzVar);
        if (supportRequestManagerFragment != null) {
            return supportRequestManagerFragment;
        }
        fv supportRequestManagerFragment2 = new SupportRequestManagerFragment();
        this.d.put(fzVar, supportRequestManagerFragment2);
        fzVar.a().a(supportRequestManagerFragment2, str).c();
        this.e.obtainMessage(2, fzVar).sendToTarget();
        return supportRequestManagerFragment2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    public final boolean handleMessage(android.os.Message r5) {
        /*
        r4 = this;
        r0 = r5.what;
        r1 = 0;
        r2 = 1;
        if (r0 == r2) goto L_0x0014;
    L_0x0006:
        r3 = 2;
        if (r0 == r3) goto L_0x000c;
    L_0x0009:
        r2 = 0;
        r5 = r1;
        goto L_0x001f;
    L_0x000c:
        r5 = r5.obj;
        r1 = r5;
        r1 = (defpackage.fz) r1;
        r5 = r4.d;
        goto L_0x001b;
    L_0x0014:
        r5 = r5.obj;
        r1 = r5;
        r1 = (android.app.FragmentManager) r1;
        r5 = r4.c;
    L_0x001b:
        r5 = r5.remove(r1);
    L_0x001f:
        if (r2 == 0) goto L_0x0039;
    L_0x0021:
        if (r5 != 0) goto L_0x0039;
    L_0x0023:
        r5 = 5;
        r0 = "RMRetriever";
        r5 = android.util.Log.isLoggable(r0, r5);
        if (r5 == 0) goto L_0x0039;
    L_0x002c:
        r5 = java.lang.String.valueOf(r1);
        r1 = "Failed to remove expected request manager fragment, manager: ";
        r5 = r1.concat(r5);
        android.util.Log.w(r0, r5);
    L_0x0039:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anz.handleMessage(android.os.Message):boolean");
    }
}
