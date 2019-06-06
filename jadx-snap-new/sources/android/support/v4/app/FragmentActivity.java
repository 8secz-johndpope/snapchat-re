package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import defpackage.fq;
import defpackage.fv;
import defpackage.fx;
import defpackage.fy;
import defpackage.fz;
import defpackage.ga;
import defpackage.gb;
import defpackage.gl;
import defpackage.j;
import defpackage.ji;
import defpackage.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity extends BaseFragmentActivityApi16 implements defpackage.fq.a, defpackage.fq.b {
    public final Handler c = new Handler() {
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    super.handleMessage(message);
                } else {
                    FragmentActivity.this.d.b();
                    FragmentActivity.this.d.d();
                }
            } else if (FragmentActivity.this.g) {
                FragmentActivity.this.a(false);
            }
        }
    };
    public final fx d = new fx(new a());
    public gl e;
    public y f;
    boolean g = true;
    boolean h;
    private boolean i;
    private boolean j;
    private boolean k = true;
    private boolean l;
    private int m;
    private ji<String> n;

    static final class b {
        Object a;
        y b;
        gb c;

        b() {
        }
    }

    class a extends fy<FragmentActivity> {
        public a() {
            super(FragmentActivity.this);
        }

        public final View a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        public final void a(fv fvVar, Intent intent, int i, Bundle bundle) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            fragmentActivity.b = true;
            if (i == -1) {
                try {
                    fq.a(fragmentActivity, intent, -1, bundle);
                } finally {
                    fragmentActivity.b = false;
                }
            } else {
                BaseFragmentActivityApi14.b(i);
                fq.a(fragmentActivity, intent, ((fragmentActivity.a(fvVar) + 1) << 16) + (i & 65535), bundle);
                fragmentActivity.b = false;
            }
        }

        public final void a(fv fvVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            int i5 = i;
            Activity activity = FragmentActivity.this;
            activity.a = true;
            if (i5 == -1) {
                try {
                    fq.a(activity, intentSender, i, intent, i2, i3, i4, bundle);
                } finally {
                    activity.a = false;
                }
            } else {
                BaseFragmentActivityApi14.b(i);
                fv fvVar2 = fvVar;
                fq.a(activity, intentSender, ((activity.a(fvVar) + 1) << 16) + (i5 & 65535), intent, i2, i3, i4, bundle);
                activity.a = false;
            }
        }

        public final void a(fv fvVar, String[] strArr, int i) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            if (i == -1) {
                fq.a(fragmentActivity, strArr, i);
                return;
            }
            BaseFragmentActivityApi14.b(i);
            try {
                fragmentActivity.h = true;
                fq.a(fragmentActivity, strArr, ((fragmentActivity.a(fvVar) + 1) << 16) + (i & 65535));
            } finally {
                fragmentActivity.h = false;
            }
        }

        public final void a(String str, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, null, printWriter, strArr);
        }

        public final boolean a() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public final boolean a(String str) {
            return fq.a(FragmentActivity.this, str);
        }

        public final boolean b() {
            return !FragmentActivity.this.isFinishing();
        }

        public final LayoutInflater c() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        public final void d() {
            FragmentActivity.this.a();
        }

        public final boolean e() {
            return FragmentActivity.this.getWindow() != null;
        }

        public final int f() {
            Window window = FragmentActivity.this.getWindow();
            return window == null ? 0 : window.getAttributes().windowAnimations;
        }

        public final /* bridge */ /* synthetic */ Object g() {
            return FragmentActivity.this;
        }
    }

    private static boolean a(fz fzVar, defpackage.j.b bVar) {
        boolean z = false;
        for (fv fvVar : fzVar.d()) {
            if (fvVar != null) {
                if (fvVar.getLifecycle().a().a(defpackage.j.b.STARTED)) {
                    fvVar.mLifecycleRegistry.b(bVar);
                    z = true;
                }
                fz peekChildFragmentManager = fvVar.peekChildFragmentManager();
                if (peekChildFragmentManager != null) {
                    z |= a(peekChildFragmentManager, bVar);
                }
            }
        }
        return z;
    }

    private void d() {
        do {
        } while (a(b(), defpackage.j.b.CREATED));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0041 in {4, 7, 9, 11} preds:[]
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
    final int a(defpackage.fv r5) {
        /*
        r4 = this;
        r0 = r4.n;
        r0 = r0.b();
        r1 = 65534; // 0xfffe float:9.1833E-41 double:3.2378E-319;
        if (r0 >= r1) goto L_0x0039;
        r0 = r4.n;
        r2 = r4.m;
        r3 = r0.a;
        if (r3 == 0) goto L_0x0016;
        r0.a();
        r3 = r0.b;
        r0 = r0.d;
        r0 = defpackage.ix.a(r3, r0, r2);
        if (r0 < 0) goto L_0x0028;
        r0 = r4.m;
        r0 = r0 + 1;
        r0 = r0 % r1;
        r4.m = r0;
        goto L_0x000b;
        r0 = r4.m;
        r2 = r4.n;
        r5 = r5.mWho;
        r2.b(r0, r5);
        r5 = r4.m;
        r5 = r5 + 1;
        r5 = r5 % r1;
        r4.m = r5;
        return r0;
        r5 = new java.lang.IllegalStateException;
        r0 = "Too many pending Fragment activity results.";
        r5.<init>(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentActivity.a(fv):int");
    }

    /* Access modifiers changed, original: final */
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.d.a.d.onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void a() {
        invalidateOptionsMenu();
    }

    public final void a(int i) {
        if (!this.h && i != -1) {
            BaseFragmentActivityApi14.b(i);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (!this.k) {
            this.k = true;
            this.l = z;
            this.c.removeMessages(1);
            this.d.c();
        }
    }

    public final fz b() {
        return this.d.a.d;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("  ");
        String stringBuilder2 = stringBuilder.toString();
        printWriter.print(stringBuilder2);
        printWriter.print("mCreated=");
        printWriter.print(this.i);
        printWriter.print("mResumed=");
        printWriter.print(this.j);
        printWriter.print(" mStopped=");
        printWriter.print(this.g);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.k);
        gl glVar = this.e;
        if (glVar != null) {
            glVar.a(stringBuilder2, fileDescriptor, printWriter, strArr);
        }
        this.d.a.d.a(str, fileDescriptor, printWriter, strArr);
    }

    public j getLifecycle() {
        return super.getLifecycle();
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.d.a();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            String str = (String) this.n.a(i3, null);
            this.n.a(i3);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            fv a = this.d.a(str);
            if (a == null) {
                Log.w(str2, "Activity result no fragment exists for who: ".concat(String.valueOf(str)));
                return;
            }
            a.onActivityResult(i & 65535, i2, intent);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        ga gaVar = this.d.a.d;
        boolean e = gaVar.e();
        if (!e || VERSION.SDK_INT > 25) {
            if (e || !gaVar.c()) {
                super.onBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.a();
        this.d.a.d.a(configuration);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        fx fxVar = this.d;
        gb gbVar = null;
        fxVar.a.d.a(fxVar.a, fxVar.a, null);
        super.onCreate(bundle);
        b bVar = (b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.f = bVar.b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            fx fxVar2 = this.d;
            if (bVar != null) {
                gbVar = bVar.c;
            }
            fxVar2.a.d.a(parcelable, gbVar);
            String str = "android:support:next_request_index";
            if (bundle.containsKey(str)) {
                this.m = bundle.getInt(str);
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.n = new ji(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.n.b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.n == null) {
            this.n = new ji();
            this.m = 0;
        }
        this.d.a.d.j();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        fx fxVar = this.d;
        return onCreatePanelMenu | fxVar.a.d.a(menu, getMenuInflater());
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
        a(false);
        y yVar = this.f;
        if (!(yVar == null || this.l)) {
            yVar.a();
        }
        this.d.a.d.o();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.d.a.d.p();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return super.onMenuItemSelected(i, menuItem) ? true : i != 0 ? i != 6 ? false : this.d.a.d.b(menuItem) : this.d.a.d.a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.d.a.d.a(z);
    }

    /* Access modifiers changed, original: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.d.a();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.d.a.d.b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        super.onPause();
        this.j = false;
        if (this.c.hasMessages(2)) {
            this.c.removeMessages(2);
            this.d.b();
        }
        this.d.a.d.b(4);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.d.a.d.b(z);
    }

    /* Access modifiers changed, original: protected */
    public void onPostResume() {
        super.onPostResume();
        this.c.removeMessages(2);
        this.d.b();
        this.d.d();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : super.onPreparePanel(0, view, menu) | this.d.a.d.a(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.d.a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            String str;
            i2--;
            String str2 = (String) this.n.a(i2, null);
            this.n.a(i2);
            String str3 = "FragmentActivity";
            if (str2 == null) {
                str = "Activity result delivered for unknown Fragment.";
            } else {
                fv a = this.d.a(str2);
                if (a == null) {
                    str = "Activity result no fragment exists for who: ".concat(String.valueOf(str2));
                } else {
                    a.onRequestPermissionsResult(i & 65535, strArr, iArr);
                }
            }
            Log.w(str3, str);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        this.c.sendEmptyMessage(2);
        this.j = true;
        this.d.d();
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.g) {
            a(true);
        }
        ga gaVar = this.d.a.d;
        ga.a(gaVar.i);
        gb gbVar = gaVar.i;
        if (gbVar == null && this.f == null) {
            return null;
        }
        b bVar = new b();
        bVar.a = null;
        bVar.b = this.f;
        bVar.c = gbVar;
        return bVar;
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        d();
        Parcelable h = this.d.a.d.h();
        if (h != null) {
            bundle.putParcelable("android:support:fragments", h);
        }
        if (this.n.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.m);
            int[] iArr = new int[this.n.b()];
            String[] strArr = new String[this.n.b()];
            for (int i = 0; i < this.n.b(); i++) {
                iArr[i] = this.n.b(i);
                strArr[i] = (String) this.n.c(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        this.g = false;
        this.k = false;
        this.c.removeMessages(1);
        if (!this.i) {
            this.i = true;
            this.d.a.d.k();
        }
        this.d.a();
        this.d.d();
        this.d.a.d.l();
    }

    public void onStateNotSaved() {
        this.d.a();
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        this.g = true;
        d();
        this.c.sendEmptyMessage(1);
        this.d.a.d.n();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.b || i == -1)) {
            BaseFragmentActivityApi14.b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
