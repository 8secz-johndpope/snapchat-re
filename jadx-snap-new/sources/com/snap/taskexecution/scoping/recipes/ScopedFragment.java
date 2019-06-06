package com.snap.taskexecution.scoping.recipes;

import android.os.Bundle;
import android.view.View;
import com.google.common.collect.ImmutableMap;
import defpackage.ajej;
import defpackage.ajwl;
import defpackage.akcr;
import defpackage.fv;
import defpackage.zgk;

public class ScopedFragment extends fv {
    private static final ImmutableMap<b, b> d = ImmutableMap.builder().put(b.ON_CREATE, b.ON_DESTROY).put(b.ON_VIEW_CREATED, b.ON_DESTROY_VIEW).put(b.ON_START, b.ON_STOP).put(b.ON_RESUME, b.ON_PAUSE).build();
    private final String a = getClass().getName();
    private final ajwl<b> b;
    private final zgk<b> c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public enum b {
        ON_CREATE,
        ON_VIEW_CREATED,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY_VIEW,
        ON_DESTROY
    }

    static {
        a aVar = new a();
    }

    public ScopedFragment() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<LifecycleEvent>()");
        this.b = ajwl;
        this.c = new zgk(this.b, d);
    }

    private static <D extends ajej> D a(D d, ScopedFragment scopedFragment, b bVar, String str) {
        akcr.b(d, "receiver$0");
        akcr.b(scopedFragment, "scopedComponent");
        akcr.b(bVar, "lifecycleEvent");
        akcr.b(str, "disposableName");
        scopedFragment.a((ajej) d, bVar, str);
        return d;
    }

    public final <D extends ajej> D a(D d, b bVar, String str) {
        akcr.b(d, "disposable");
        akcr.b(bVar, "event");
        akcr.b(str, "disposableName");
        Object a = this.c.a(d, bVar, str);
        akcr.a(a, "taskScoper.bind(disposable, event, disposableName)");
        return a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.a(b.ON_CREATE);
    }

    public void onDestroy() {
        this.b.a(b.ON_DESTROY);
        super.onDestroy();
    }

    public void onDestroyView() {
        this.b.a(b.ON_DESTROY_VIEW);
        super.onDestroyView();
    }

    public void onPause() {
        this.b.a(b.ON_PAUSE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.b.a(b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        this.b.a(b.ON_START);
    }

    public void onStop() {
        this.b.a(b.ON_STOP);
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        this.b.a(b.ON_VIEW_CREATED);
    }
}
