package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.snapchat.android.R;

/* renamed from: uba */
public final class uba implements tpw {
    private final String a = "StatusAndSoftNavBarActivator";
    private final ajei b = new ajei();
    private zfw c;
    private final View d;
    private final zgb e;
    private final toc f;
    private final zkq g;
    private final ajdp<Integer> h;

    /* renamed from: uba$a */
    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ FrameLayout a;
        private /* synthetic */ FrameLayout b;

        a(FrameLayout frameLayout, FrameLayout frameLayout2) {
            this.a = frameLayout;
            this.b = frameLayout2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            Object obj2 = this.a;
            akcr.a(obj2, "statusBarBlackBackground");
            obj2.getLayoutParams().height = rect.top;
            obj2 = this.b;
            akcr.a(obj2, "softNavBarBlackBackground");
            obj2.getLayoutParams().height = rect.bottom;
        }
    }

    /* renamed from: uba$b */
    static final class b<T> implements ajfb<Integer> {
        private /* synthetic */ FrameLayout a;
        private /* synthetic */ FrameLayout b;

        b(FrameLayout frameLayout, FrameLayout frameLayout2) {
            this.a = frameLayout;
            this.b = frameLayout2;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            Object obj2 = this.a;
            akcr.a(obj2, "statusBarBlackBackground");
            akcr.a(obj, "it");
            obj2.setVisibility(obj.intValue());
            obj2 = this.b;
            akcr.a(obj2, "softNavBarBlackBackground");
            obj2.setVisibility(obj.intValue());
        }
    }

    public uba(View view, zgb zgb, toc toc, zkq zkq, ajdp<Integer> ajdp) {
        akcr.b(view, "rootView");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(zkq, "insetsDetector");
        akcr.b(ajdp, "statusAndNavBarVisibilityChangeObservable");
        this.d = view;
        this.e = zgb;
        this.f = toc;
        this.g = zkq;
        this.h = ajdp;
    }

    public final String a() {
        return this.a;
    }

    public final ajej start() {
        this.c = zgb.a(this.f.callsite("StatusAndSoftNavBarActivator"));
        FrameLayout frameLayout = (FrameLayout) this.d.findViewById(R.id.status_bar_black_background);
        FrameLayout frameLayout2 = (FrameLayout) this.d.findViewById(R.id.soft_nav_bar_black_background);
        ajej f = this.g.a().f((ajfb) new a(frameLayout, frameLayout2));
        akcr.a((Object) f, "insetsDetector.windowRec…t = rect.bottom\n        }");
        ajvv.a(f, this.b);
        ajej f2 = this.h.f((ajfb) new b(frameLayout, frameLayout2));
        akcr.a((Object) f2, "statusAndNavBarVisibilit…visibility = it\n        }");
        ajvv.a(f2, this.b);
        return this.b;
    }
}
