package com.snap.ui.deck;

import com.google.common.collect.ImmutableMap;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import defpackage.achi;
import defpackage.ajej;
import defpackage.ajwl;
import defpackage.akcr;
import defpackage.zgk;
import defpackage.zjk;
import defpackage.zjm;

public class ScopedMainPageFragment extends ScopedFragment {
    private static final ImmutableMap<b, b> d = ImmutableMap.builder().put(b.ON_VISIBLE, b.ON_HIDDEN).build();
    private static final b e = b.ON_HIDDEN;
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
        ON_VISIBLE,
        ON_HIDDEN
    }

    static {
        a aVar = new a();
    }

    public ScopedMainPageFragment() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<LifecycleEvent>()");
        this.b = ajwl;
        this.c = new zgk(this.b, d);
    }

    private static <D extends ajej> D a(D d, ScopedMainPageFragment scopedMainPageFragment, b bVar, String str) {
        akcr.b(d, "receiver$0");
        akcr.b(scopedMainPageFragment, "scopedComponent");
        akcr.b(bVar, "lifecycleEvent");
        String str2 = "disposableName";
        akcr.b(str, str2);
        akcr.b(d, "disposable");
        akcr.b(bVar, "event");
        akcr.b(str, str2);
        akcr.a(scopedMainPageFragment.c.a(d, bVar, str), "taskScoper.bind(disposable, event, disposableName)");
        return d;
    }

    public static /* synthetic */ ajej a(ScopedMainPageFragment scopedMainPageFragment, ajej ajej, ScopedMainPageFragment scopedMainPageFragment2, b bVar, String str, int i) {
        if ((i & 2) != 0) {
            bVar = e;
        }
        if ((i & 4) != 0) {
            str = scopedMainPageFragment.a;
            akcr.a((Object) str, "defaultName");
        }
        return a(ajej, scopedMainPageFragment2, bVar, str);
    }

    public void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        this.b.a(b.ON_VISIBLE);
    }

    public void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        this.b.a(b.ON_HIDDEN);
    }
}
