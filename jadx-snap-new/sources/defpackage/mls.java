package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.touch.PanGestureDetector;
import com.looksery.sdk.touch.RotateGestureDetector;
import com.looksery.sdk.touch.Touch.State;
import com.looksery.sdk.touch.TouchEvent;
import java.util.HashSet;

/* renamed from: mls */
public final class mls implements mpa {
    private final Handler a;
    private final mpm b;
    private final ScaleGestureDetector c;
    private final PanGestureDetector d;
    private final RotateGestureDetector e;
    private final GestureDetector f;
    private final HashSet<Integer> g;
    private final mkx h;
    private final akbk<abpq> i;

    /* renamed from: mls$1 */
    static final class 1 extends akcs implements akbk<abpq> {
        public static final 1 a = new 1();

        1() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abpq(0, 0);
        }
    }

    /* renamed from: mls$a */
    static final class a extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ TouchEvent a;

        a(TouchEvent touchEvent) {
            this.a = touchEvent;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.processTouch(this.a);
            return ajxw.a;
        }
    }

    public /* synthetic */ mls(Context context, mkx mkx, mmh mmh, zfw zfw) {
        this(context, mkx, mmh, zfw, 1.a);
    }

    public mls(Context context, mkx mkx, mmh mmh, zfw zfw, akbk<? extends abpq> akbk) {
        akcr.b(mkx, "lensCore");
        akcr.b(mmh, "fallbackGestureHandler");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(akbk, "inputImageSizeProvider");
        this.h = mkx;
        this.i = akbk;
        this.a = zfw.k();
        this.b = new mpm();
        this.c = new ScaleGestureDetector(context, new moo(this.h, this.b), this.a);
        this.d = new PanGestureDetector(context, new mno(this.h, this.b));
        this.e = new RotateGestureDetector(new mon(this.h, this.b));
        this.f = new GestureDetector(context, new mme(this.h, this.b, mmh), this.a);
        this.g = new HashSet();
    }

    public final boolean a() {
        return this.g.size() > 0;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        akcr.b(view, "view");
        akcr.b(motionEvent, "motionEvent");
        mpm mpm = this.b;
        abpq abpq = (abpq) this.i.invoke();
        mpm.a.a(view.getWidth());
        mpm.a.b(view.getHeight());
        mpm.b.a(abpq.a());
        mpm.b.b(abpq.b());
        Object create = TouchEvent.create(mpm.toTouches(null, motionEvent), motionEvent.getEventTime());
        akcr.a(create, "touchEvent");
        if (create.isValid()) {
            for (Object obj : create.getTouchesArray()) {
                akcr.a(obj, "touch");
                State state = obj.getState();
                if (state != null) {
                    int i = mlt.a[state.ordinal()];
                    if (i == 1) {
                        mkx mkx = this.h;
                        if (akcr.a((1 ^ mkx.isDisposed()) != 0 ? Boolean.valueOf(((mpn) mkx.a.b()).b.shouldBlockTouch(obj)) : null, Boolean.TRUE)) {
                            this.g.add(Integer.valueOf(obj.getId()));
                        }
                    } else if (i == 2 || i == 3) {
                        this.g.remove(Integer.valueOf(obj.getId()));
                    }
                }
            }
            this.h.b(new a(create));
        }
        this.c.onTouchEvent(motionEvent);
        this.d.onTouchEvent(motionEvent);
        this.e.onTouchEvent(motionEvent);
        this.f.onTouchEvent(motionEvent);
        return a();
    }
}
