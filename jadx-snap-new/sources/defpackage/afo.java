package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: afo */
public final class afo implements Callback {
    private static final a i = new 1();
    private volatile yn a;
    private Map<FragmentManager, afn> b = new HashMap();
    private Map<fz, SupportRequestManagerFragment> c = new HashMap();
    private final Handler d;
    private final a e;
    private final iv<View, fv> f = new iv();
    private final iv<View, Fragment> g = new iv();
    private final Bundle h = new Bundle();

    /* renamed from: afo$a */
    public interface a {
        yn a(yh yhVar, afk afk, afp afp, Context context);
    }

    /* renamed from: afo$1 */
    class 1 implements a {
        1() {
        }

        public final yn a(yh yhVar, afk afk, afp afp, Context context) {
            return new yn(yhVar, afk, afp, context);
        }
    }

    public afo(a aVar) {
        if (aVar == null) {
            aVar = i;
        }
        this.e = aVar;
        this.d = new Handler(Looper.getMainLooper(), this);
    }

    @Deprecated
    private yn a(Context context, FragmentManager fragmentManager, boolean z) {
        afn a = a(fragmentManager, z);
        yn ynVar = a.c;
        if (ynVar != null) {
            return ynVar;
        }
        ynVar = this.e.a(yh.a(context), a.a, a.b, context);
        a.c = ynVar;
        return ynVar;
    }

    private yn a(Context context, fz fzVar, boolean z) {
        SupportRequestManagerFragment a = a(fzVar, z);
        yn ynVar = a.c;
        if (ynVar != null) {
            return ynVar;
        }
        ynVar = this.e.a(yh.a(context), a.a, a.b, context);
        a.c = ynVar;
        return ynVar;
    }

    private yn a(FragmentActivity fragmentActivity) {
        if (ahm.c()) {
            return a(fragmentActivity.getApplicationContext());
        }
        afo.c(fragmentActivity);
        return a((Context) fragmentActivity, fragmentActivity.b(), afo.a((Activity) fragmentActivity));
    }

    public static boolean a(Activity activity) {
        return !activity.isFinishing();
    }

    private yn b(Activity activity) {
        if (ahm.c()) {
            return a(activity.getApplicationContext());
        }
        afo.c(activity);
        return a((Context) activity, activity.getFragmentManager(), afo.a(activity));
    }

    private yn b(Context context) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = this.e.a(yh.a(context.getApplicationContext()), new afe(), new afj(), context.getApplicationContext());
                }
            }
        }
        return this.a;
    }

    @TargetApi(17)
    private static void c(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* Access modifiers changed, original: 0000 */
    public afn a(FragmentManager fragmentManager, boolean z) {
        String str = "com.bumptech.glide.manager";
        afn afn = (afn) fragmentManager.findFragmentByTag(str);
        if (afn == null) {
            afn = (afn) this.b.get(fragmentManager);
            if (afn == null) {
                afn = new afn();
                afn.d = null;
                if (z) {
                    afn.a.a();
                }
                this.b.put(fragmentManager, afn);
                fragmentManager.beginTransaction().add(afn, str).commitAllowingStateLoss();
                this.d.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return afn;
    }

    public SupportRequestManagerFragment a(fz fzVar, boolean z) {
        String str = "com.bumptech.glide.manager";
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fzVar.a(str);
        if (supportRequestManagerFragment == null) {
            supportRequestManagerFragment = (SupportRequestManagerFragment) this.c.get(fzVar);
            if (supportRequestManagerFragment == null) {
                supportRequestManagerFragment = new SupportRequestManagerFragment();
                supportRequestManagerFragment.d = null;
                if (z) {
                    supportRequestManagerFragment.a.a();
                }
                this.c.put(fzVar, supportRequestManagerFragment);
                fzVar.a().a((fv) supportRequestManagerFragment, str).c();
                this.d.obtainMessage(2, fzVar).sendToTarget();
            }
        }
        return supportRequestManagerFragment;
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
    public final defpackage.yn a(android.content.Context r2) {
        /*
        r1 = this;
        if (r2 == 0) goto L_0x0032;
        r0 = defpackage.ahm.b();
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
        r2 = r1.b(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afo.a(android.content.Context):yn");
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
        r5 = r4.c;
        goto L_0x001b;
    L_0x0014:
        r5 = r5.obj;
        r1 = r5;
        r1 = (android.app.FragmentManager) r1;
        r5 = r4.b;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afo.handleMessage(android.os.Message):boolean");
    }
}
