package com.snap.taskexecution.scoping.recipes;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import defpackage.ajej;
import defpackage.ajwl;
import defpackage.ajxs;
import defpackage.ajzm;
import defpackage.akcr;
import defpackage.zgk;
import java.util.Map;

public class ScopedFragmentActivity extends FragmentActivity {
    private static Map<b, b> j = ajzm.a(ajxs.a(b.ON_CREATE, b.ON_DESTROY), ajxs.a(b.ON_START, b.ON_STOP), ajxs.a(b.ON_RESUME, b.ON_PAUSE));
    protected final String C = getClass().getName();
    public final zgk<b> D;
    private final ajwl<b> i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY
    }

    static {
        a aVar = new a();
    }

    public ScopedFragmentActivity() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<LifecycleEvent>()");
        this.i = ajwl;
        this.D = new zgk(this.i, j);
    }

    public static /* synthetic */ ajej a(ScopedFragmentActivity scopedFragmentActivity, ajej ajej, ScopedFragmentActivity scopedFragmentActivity2, b bVar) {
        Object obj = scopedFragmentActivity.C;
        akcr.a(obj, "defaultName");
        akcr.b(ajej, "receiver$0");
        akcr.b(scopedFragmentActivity2, "scopedComponent");
        akcr.b(bVar, "lifecycleEvent");
        akcr.b(obj, "disposableName");
        scopedFragmentActivity2.a(ajej, bVar, obj);
        return ajej;
    }

    public final <D extends ajej> D a(D d, b bVar, String str) {
        akcr.b(d, "disposable");
        akcr.b(bVar, "event");
        akcr.b(str, "disposableName");
        Object a = this.D.a(d, bVar, str);
        akcr.a(a, "taskScoper.bind(disposable, event, disposableName)");
        return a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i.a(b.ON_CREATE);
    }

    public void onDestroy() {
        this.i.a(b.ON_DESTROY);
        super.onDestroy();
    }

    public void onPause() {
        this.i.a(b.ON_PAUSE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.i.a(b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        this.i.a(b.ON_START);
    }

    public void onStop() {
        this.i.a(b.ON_STOP);
        super.onStop();
    }
}
