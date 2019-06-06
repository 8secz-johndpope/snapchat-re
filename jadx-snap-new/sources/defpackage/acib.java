package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: acib */
final class acib implements achn {
    final int a;
    b b;
    int c;
    private final GestureDetector d;

    /* renamed from: acib$b */
    interface b {
        int a();

        boolean a(int i, int i2);

        boolean a(int i, int i2, int i3);

        boolean a(int i, int i2, int i3, MotionEvent motionEvent);

        float b();

        boolean c();

        void d();

        boolean e();
    }

    /* renamed from: acib$a */
    class a extends SimpleOnGestureListener {
        private a() {
        }

        /* synthetic */ a(acib acib, byte b) {
            this();
        }

        public final boolean onDown(MotionEvent motionEvent) {
            acib acib = acib.this;
            acib.c = 0;
            return acib.b.c();
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent == null) {
                return false;
            }
            acib.this.c = Math.abs(f) > Math.abs(f2) ? 2 : 3;
            if (acib.this.b.a() != 1) {
                acib acib = acib.this;
                acib.c = acib.b.a();
            }
            b bVar = acib.this.b;
            int i = acib.this.c;
            if (acib.this.c != 2) {
                f = f2;
            }
            boolean a = bVar.a(i, -((int) f));
            acib.this.c = 0;
            return a;
        }

        public final void onLongPress(MotionEvent motionEvent) {
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z = false;
            if (motionEvent == null) {
                return false;
            }
            if (acib.this.c == 0) {
                float abs = Math.abs(motionEvent2.getX() - motionEvent.getX());
                float abs2 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                if (abs <= ((float) acib.this.a) && abs2 <= ((float) acib.this.a)) {
                    return false;
                }
                acib acib;
                int i = 2;
                if (abs <= ((float) acib.this.a) || abs2 > ((float) acib.this.a)) {
                    if (abs > ((float) acib.this.a) || abs2 <= ((float) acib.this.a)) {
                        acib acib2 = acib.this;
                        acib = abs > acib2.b.b() * abs2 ? acib2 : acib2;
                    } else {
                        acib = acib.this;
                    }
                    i = 3;
                } else {
                    acib = acib.this;
                }
                acib.c = i;
                z = true;
            }
            return z ? acib.this.b.a(acib.this.c, (int) f, (int) f2, motionEvent2) : acib.this.b.a(acib.this.c, (int) f, (int) f2);
        }

        public final void onShowPress(MotionEvent motionEvent) {
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public acib(Context context) {
        this.d = new GestureDetector(context, new a(this, (byte) 0));
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.d.setIsLongpressEnabled(false);
        this.d.setOnDoubleTapListener(null);
    }

    public final boolean a(MotionEvent motionEvent) {
        boolean onTouchEvent = this.d.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 5) {
            this.b.d();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && !onTouchEvent) {
            this.b.e();
            if (this.c != 0) {
                this.c = 0;
            }
        }
        return onTouchEvent;
    }
}
