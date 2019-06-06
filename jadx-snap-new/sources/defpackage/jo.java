package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: jo */
public final class jo {
    public final a a;

    /* renamed from: jo$a */
    public interface a {
        void a();

        boolean a(MotionEvent motionEvent);
    }

    /* renamed from: jo$b */
    static class b implements a {
        private static final int l = ViewConfiguration.getLongPressTimeout();
        private static final int m = ViewConfiguration.getTapTimeout();
        private static final int n = ViewConfiguration.getDoubleTapTimeout();
        final Handler a = new a();
        final OnGestureListener b;
        OnDoubleTapListener c;
        boolean d;
        boolean e;
        boolean f;
        MotionEvent g;
        private int h;
        private int i;
        private int j;
        private int k;
        private boolean o;
        private boolean p;
        private MotionEvent q;
        private boolean r;
        private float s;
        private float t;
        private float u;
        private float v;
        private boolean w;
        private VelocityTracker x;

        /* renamed from: jo$b$a */
        class a extends Handler {
            a() {
            }

            public final void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    b.this.b.onShowPress(b.this.g);
                } else if (i == 2) {
                    b bVar = b.this;
                    bVar.a.removeMessages(3);
                    bVar.e = false;
                    bVar.f = true;
                    bVar.b.onLongPress(bVar.g);
                } else if (i == 3) {
                    if (b.this.c != null) {
                        if (b.this.d) {
                            b.this.e = true;
                        } else {
                            b.this.c.onSingleTapConfirmed(b.this.g);
                        }
                    }
                } else {
                    throw new RuntimeException("Unknown message ".concat(String.valueOf(message)));
                }
            }
        }

        b(Context context, OnGestureListener onGestureListener) {
            this.b = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                this.c = (OnDoubleTapListener) onGestureListener;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.b != null) {
                this.w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.j = viewConfiguration.getScaledMinimumFlingVelocity();
                this.k = viewConfiguration.getScaledMaximumFlingVelocity();
                this.h = scaledTouchSlop * scaledTouchSlop;
                this.i = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        public final void a() {
            this.w = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x026a  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0281  */
        public final boolean a(android.view.MotionEvent r14) {
            /*
            r13 = this;
            r0 = r14.getAction();
            r1 = r13.x;
            if (r1 != 0) goto L_0x000e;
        L_0x0008:
            r1 = android.view.VelocityTracker.obtain();
            r13.x = r1;
        L_0x000e:
            r1 = r13.x;
            r1.addMovement(r14);
            r0 = r0 & 255;
            r1 = 6;
            r2 = 1;
            r3 = 0;
            if (r0 != r1) goto L_0x001c;
        L_0x001a:
            r4 = 1;
            goto L_0x001d;
        L_0x001c:
            r4 = 0;
        L_0x001d:
            if (r4 == 0) goto L_0x0024;
        L_0x001f:
            r5 = r14.getActionIndex();
            goto L_0x0025;
        L_0x0024:
            r5 = -1;
        L_0x0025:
            r6 = r14.getPointerCount();
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r10 = 0;
        L_0x002d:
            if (r8 >= r6) goto L_0x003e;
        L_0x002f:
            if (r5 == r8) goto L_0x003b;
        L_0x0031:
            r11 = r14.getX(r8);
            r9 = r9 + r11;
            r11 = r14.getY(r8);
            r10 = r10 + r11;
        L_0x003b:
            r8 = r8 + 1;
            goto L_0x002d;
        L_0x003e:
            if (r4 == 0) goto L_0x0043;
        L_0x0040:
            r4 = r6 + -1;
            goto L_0x0044;
        L_0x0043:
            r4 = r6;
        L_0x0044:
            r4 = (float) r4;
            r9 = r9 / r4;
            r10 = r10 / r4;
            r4 = 2;
            r5 = 3;
            if (r0 == 0) goto L_0x01f1;
        L_0x004b:
            r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r11 = 0;
            if (r0 == r2) goto L_0x0164;
        L_0x0050:
            if (r0 == r4) goto L_0x00f1;
        L_0x0052:
            if (r0 == r5) goto L_0x00cc;
        L_0x0054:
            r11 = 5;
            if (r0 == r11) goto L_0x00a5;
        L_0x0057:
            if (r0 == r1) goto L_0x005b;
        L_0x0059:
            goto L_0x02b0;
        L_0x005b:
            r13.s = r9;
            r13.u = r9;
            r13.t = r10;
            r13.v = r10;
            r0 = r13.x;
            r1 = r13.k;
            r1 = (float) r1;
            r0.computeCurrentVelocity(r8, r1);
            r0 = r14.getActionIndex();
            r1 = r14.getPointerId(r0);
            r2 = r13.x;
            r2 = r2.getXVelocity(r1);
            r4 = r13.x;
            r1 = r4.getYVelocity(r1);
            r4 = 0;
        L_0x0080:
            if (r4 >= r6) goto L_0x02b0;
        L_0x0082:
            if (r4 == r0) goto L_0x00a2;
        L_0x0084:
            r5 = r14.getPointerId(r4);
            r8 = r13.x;
            r8 = r8.getXVelocity(r5);
            r8 = r8 * r2;
            r9 = r13.x;
            r5 = r9.getYVelocity(r5);
            r5 = r5 * r1;
            r8 = r8 + r5;
            r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1));
            if (r5 >= 0) goto L_0x00a2;
        L_0x009b:
            r14 = r13.x;
            r14.clear();
            goto L_0x02b0;
        L_0x00a2:
            r4 = r4 + 1;
            goto L_0x0080;
        L_0x00a5:
            r13.s = r9;
            r13.u = r9;
            r13.t = r10;
            r13.v = r10;
            r14 = r13.a;
            r14.removeMessages(r2);
            r14 = r13.a;
            r14.removeMessages(r4);
            r14 = r13.a;
            r14.removeMessages(r5);
            r13.r = r3;
            r13.o = r3;
            r13.p = r3;
            r13.e = r3;
            r14 = r13.f;
            if (r14 == 0) goto L_0x02b0;
        L_0x00c8:
            r13.f = r3;
            goto L_0x02b0;
        L_0x00cc:
            r14 = r13.a;
            r14.removeMessages(r2);
            r14 = r13.a;
            r14.removeMessages(r4);
            r14 = r13.a;
            r14.removeMessages(r5);
            r14 = r13.x;
            r14.recycle();
            r13.x = r11;
            r13.r = r3;
            r13.d = r3;
            r13.o = r3;
            r13.p = r3;
            r13.e = r3;
            r14 = r13.f;
            if (r14 == 0) goto L_0x02b0;
        L_0x00f0:
            goto L_0x00c8;
        L_0x00f1:
            r0 = r13.f;
            if (r0 != 0) goto L_0x02b0;
        L_0x00f5:
            r0 = r13.s;
            r0 = r0 - r9;
            r1 = r13.t;
            r1 = r1 - r10;
            r6 = r13.r;
            if (r6 == 0) goto L_0x0108;
        L_0x00ff:
            r0 = r13.c;
            r14 = r0.onDoubleTapEvent(r14);
            r3 = r3 | r14;
            goto L_0x02b0;
        L_0x0108:
            r6 = r13.o;
            if (r6 == 0) goto L_0x0144;
        L_0x010c:
            r6 = r13.u;
            r6 = r9 - r6;
            r6 = (int) r6;
            r7 = r13.v;
            r7 = r10 - r7;
            r7 = (int) r7;
            r6 = r6 * r6;
            r7 = r7 * r7;
            r6 = r6 + r7;
            r7 = r13.h;
            if (r6 <= r7) goto L_0x013b;
        L_0x011d:
            r7 = r13.b;
            r8 = r13.g;
            r14 = r7.onScroll(r8, r14, r0, r1);
            r13.s = r9;
            r13.t = r10;
            r13.o = r3;
            r0 = r13.a;
            r0.removeMessages(r5);
            r0 = r13.a;
            r0.removeMessages(r2);
            r0 = r13.a;
            r0.removeMessages(r4);
            goto L_0x013c;
        L_0x013b:
            r14 = 0;
        L_0x013c:
            r0 = r13.h;
            if (r6 <= r0) goto L_0x01ee;
        L_0x0140:
            r13.p = r3;
            goto L_0x01ee;
        L_0x0144:
            r2 = java.lang.Math.abs(r0);
            r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r2 >= 0) goto L_0x0156;
        L_0x014e:
            r2 = java.lang.Math.abs(r1);
            r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r2 < 0) goto L_0x02b0;
        L_0x0156:
            r2 = r13.b;
            r3 = r13.g;
            r3 = r2.onScroll(r3, r14, r0, r1);
            r13.s = r9;
            r13.t = r10;
            goto L_0x02b0;
        L_0x0164:
            r13.d = r3;
            r0 = android.view.MotionEvent.obtain(r14);
            r1 = r13.r;
            if (r1 == 0) goto L_0x0176;
        L_0x016e:
            r1 = r13.c;
            r14 = r1.onDoubleTapEvent(r14);
            r14 = r14 | r3;
            goto L_0x01ce;
        L_0x0176:
            r1 = r13.f;
            if (r1 == 0) goto L_0x0182;
        L_0x017a:
            r14 = r13.a;
            r14.removeMessages(r5);
            r13.f = r3;
            goto L_0x01c4;
        L_0x0182:
            r1 = r13.o;
            if (r1 == 0) goto L_0x0199;
        L_0x0186:
            r1 = r13.b;
            r1 = r1.onSingleTapUp(r14);
            r5 = r13.e;
            if (r5 == 0) goto L_0x0197;
        L_0x0190:
            r5 = r13.c;
            if (r5 == 0) goto L_0x0197;
        L_0x0194:
            r5.onSingleTapConfirmed(r14);
        L_0x0197:
            r14 = r1;
            goto L_0x01ce;
        L_0x0199:
            r1 = r13.x;
            r5 = r14.getPointerId(r3);
            r6 = r13.k;
            r6 = (float) r6;
            r1.computeCurrentVelocity(r8, r6);
            r6 = r1.getYVelocity(r5);
            r1 = r1.getXVelocity(r5);
            r5 = java.lang.Math.abs(r6);
            r7 = r13.j;
            r7 = (float) r7;
            r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r5 > 0) goto L_0x01c6;
        L_0x01b8:
            r5 = java.lang.Math.abs(r1);
            r7 = r13.j;
            r7 = (float) r7;
            r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r5 <= 0) goto L_0x01c4;
        L_0x01c3:
            goto L_0x01c6;
        L_0x01c4:
            r14 = 0;
            goto L_0x01ce;
        L_0x01c6:
            r5 = r13.b;
            r7 = r13.g;
            r14 = r5.onFling(r7, r14, r1, r6);
        L_0x01ce:
            r1 = r13.q;
            if (r1 == 0) goto L_0x01d5;
        L_0x01d2:
            r1.recycle();
        L_0x01d5:
            r13.q = r0;
            r0 = r13.x;
            if (r0 == 0) goto L_0x01e0;
        L_0x01db:
            r0.recycle();
            r13.x = r11;
        L_0x01e0:
            r13.r = r3;
            r13.e = r3;
            r0 = r13.a;
            r0.removeMessages(r2);
            r0 = r13.a;
            r0.removeMessages(r4);
        L_0x01ee:
            r3 = r14;
            goto L_0x02b0;
        L_0x01f1:
            r0 = r13.c;
            if (r0 == 0) goto L_0x025d;
        L_0x01f5:
            r0 = r13.a;
            r0 = r0.hasMessages(r5);
            if (r0 == 0) goto L_0x0202;
        L_0x01fd:
            r1 = r13.a;
            r1.removeMessages(r5);
        L_0x0202:
            r1 = r13.g;
            if (r1 == 0) goto L_0x0255;
        L_0x0206:
            r6 = r13.q;
            if (r6 == 0) goto L_0x0255;
        L_0x020a:
            if (r0 == 0) goto L_0x0255;
        L_0x020c:
            r0 = r13.p;
            if (r0 == 0) goto L_0x023f;
        L_0x0210:
            r7 = r14.getEventTime();
            r11 = r6.getEventTime();
            r7 = r7 - r11;
            r0 = n;
            r11 = (long) r0;
            r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
            if (r0 > 0) goto L_0x023f;
        L_0x0220:
            r0 = r1.getX();
            r0 = (int) r0;
            r6 = r14.getX();
            r6 = (int) r6;
            r0 = r0 - r6;
            r1 = r1.getY();
            r1 = (int) r1;
            r6 = r14.getY();
            r6 = (int) r6;
            r1 = r1 - r6;
            r0 = r0 * r0;
            r1 = r1 * r1;
            r0 = r0 + r1;
            r1 = r13.i;
            if (r0 >= r1) goto L_0x023f;
        L_0x023d:
            r0 = 1;
            goto L_0x0240;
        L_0x023f:
            r0 = 0;
        L_0x0240:
            if (r0 == 0) goto L_0x0255;
        L_0x0242:
            r13.r = r2;
            r0 = r13.c;
            r1 = r13.g;
            r0 = r0.onDoubleTap(r1);
            r0 = r0 | r3;
            r1 = r13.c;
            r1 = r1.onDoubleTapEvent(r14);
            r0 = r0 | r1;
            goto L_0x025e;
        L_0x0255:
            r0 = r13.a;
            r1 = n;
            r6 = (long) r1;
            r0.sendEmptyMessageDelayed(r5, r6);
        L_0x025d:
            r0 = 0;
        L_0x025e:
            r13.s = r9;
            r13.u = r9;
            r13.t = r10;
            r13.v = r10;
            r1 = r13.g;
            if (r1 == 0) goto L_0x026d;
        L_0x026a:
            r1.recycle();
        L_0x026d:
            r1 = android.view.MotionEvent.obtain(r14);
            r13.g = r1;
            r13.o = r2;
            r13.p = r2;
            r13.d = r2;
            r13.f = r3;
            r13.e = r3;
            r1 = r13.w;
            if (r1 == 0) goto L_0x0299;
        L_0x0281:
            r1 = r13.a;
            r1.removeMessages(r4);
            r1 = r13.a;
            r3 = r13.g;
            r5 = r3.getDownTime();
            r3 = m;
            r7 = (long) r3;
            r5 = r5 + r7;
            r3 = l;
            r7 = (long) r3;
            r5 = r5 + r7;
            r1.sendEmptyMessageAtTime(r4, r5);
        L_0x0299:
            r1 = r13.a;
            r3 = r13.g;
            r3 = r3.getDownTime();
            r5 = m;
            r5 = (long) r5;
            r3 = r3 + r5;
            r1.sendEmptyMessageAtTime(r2, r3);
            r1 = r13.b;
            r14 = r1.onDown(r14);
            r3 = r0 | r14;
        L_0x02b0:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jo$b.a(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: jo$c */
    static class c implements a {
        private final GestureDetector a;

        c(Context context, OnGestureListener onGestureListener) {
            this.a = new GestureDetector(context, onGestureListener, null);
        }

        public final void a() {
            this.a.setIsLongpressEnabled(true);
        }

        public final boolean a(MotionEvent motionEvent) {
            return this.a.onTouchEvent(motionEvent);
        }
    }

    public jo(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    private jo(Context context, OnGestureListener onGestureListener, byte b) {
        this.a = VERSION.SDK_INT > 17 ? new c(context, onGestureListener) : new b(context, onGestureListener);
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }
}
