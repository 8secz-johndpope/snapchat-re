package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.common.base.Preconditions;
import com.snapchat.android.R;
import com.snapchat.android.framework.misc.AppContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dwg */
public final class dwg implements dos {
    final AccessibilityManager a;
    final Context b;
    private final int c;
    private final long d;
    private final long e;
    private final Handler f;
    private final abqo g;
    private final Rect h;
    private long i;
    private List<Rect> j;
    private a k;

    /* renamed from: dwg$a */
    enum a {
        TWO_FACES(R.string.face_accessibility_two_faces),
        NEAR_LEFT(R.string.face_accessibility_near_left_edge),
        MIDDLE_SCREEN(R.string.face_accessibility_middle_of_screen),
        NEAR_RIGHT(R.string.face_accessibility_near_right_edge),
        MULTIPLE_FACES(-2),
        NO_FACE(-1);
        
        public final int translationResId;

        private a(int i) {
            this.translationResId = i;
        }
    }

    public dwg() {
        this(AppContext.get(), new Handler(abmq.a()), new abqo(), dpg.a());
    }

    private dwg(Context context, Handler handler, abqo abqo, dpf dpf) {
        this.j = new ArrayList();
        this.k = a.NO_FACE;
        this.b = context;
        this.f = handler;
        this.g = abqo;
        this.i = SystemClock.elapsedRealtime();
        this.a = (AccessibilityManager) Preconditions.checkNotNull((AccessibilityManager) this.b.getSystemService("accessibility"));
        abse abse = new abse();
        this.h = new Rect(0, 0, abse.widthPixels, abse.heightPixels);
        this.c = dpf.ah();
        this.d = dpf.ai();
        this.e = dpf.aj();
    }

    private void a(final int i) {
        this.f.removeCallbacksAndMessages(null);
        this.f.postDelayed(new Runnable() {
            public final void run() {
                String string = dwg.this.b.getString(i);
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.setClassName(getClass().getName());
                obtain.setPackageName(dwg.this.b.getPackageName());
                obtain.getText().add(string);
                dwg.this.a.sendAccessibilityEvent(obtain);
            }
        }, this.e);
    }

    private void a(a aVar) {
        if (this.k != aVar) {
            this.k = aVar;
            if (aVar.translationResId > 0) {
                a(aVar.translationResId);
            }
        }
    }

    public static boolean a() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) AppContext.get().getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public final void a(List<Rect> list) {
        if (!list.isEmpty()) {
            this.j = list;
        }
        if ((this.i + this.d < SystemClock.elapsedRealtime() ? 1 : null) != null) {
            a aVar;
            this.i = SystemClock.elapsedRealtime();
            if (this.j.isEmpty()) {
                aVar = a.NO_FACE;
            } else if (this.j.size() > 2) {
                aVar = a.MULTIPLE_FACES;
            } else if (this.j.size() == 2) {
                aVar = a.TWO_FACES;
            } else {
                Rect rect = (Rect) this.j.get(0);
                if (Math.abs(rect.left - this.h.left) < this.c) {
                    aVar = a.NEAR_LEFT;
                } else if (Math.abs(this.h.right - rect.right) < this.c) {
                    aVar = a.NEAR_RIGHT;
                } else {
                    if (rect.contains(this.h.centerX(), this.h.centerY())) {
                        a(a.MIDDLE_SCREEN);
                    }
                    return;
                }
            }
            a(aVar);
        }
    }
}
