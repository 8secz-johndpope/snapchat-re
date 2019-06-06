package com.snap.messaging.chat.ui.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.abtz;
import defpackage.ajxk;
import defpackage.ajxt;
import defpackage.akcr;

public final class MessageListRecyclerView extends RecyclerView {
    float a;
    boolean b;
    boolean c;
    boolean d;
    private float e;
    private final float f;
    private ValueAnimator g;
    private GestureDetector h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    final class b extends SimpleOnGestureListener {
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x005c in {2, 6, 8, 12, 13, 15, 17, 19, 21} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final boolean onScroll(android.view.MotionEvent r2, android.view.MotionEvent r3, float r4, float r5) {
            /*
            r1 = this;
            r4 = "e1";
            defpackage.akcr.b(r2, r4);
            r4 = "e2";
            defpackage.akcr.b(r3, r4);
            r4 = r3.getX();
            r5 = r2.getX();
            r4 = r4 - r5;
            r3 = r3.getY();
            r2 = r2.getY();
            r3 = r3 - r2;
            r2 = com.snap.messaging.chat.ui.view.MessageListRecyclerView.this;
            r2 = r2.b;
            r5 = 0;
            r0 = 1;
            if (r2 != r0) goto L_0x0025;
            return r5;
            if (r2 != 0) goto L_0x0056;
            r2 = com.snap.messaging.chat.ui.view.MessageListRecyclerView.this;
            r2 = r2.c;
            if (r2 != r0) goto L_0x0033;
            r2 = com.snap.messaging.chat.ui.view.MessageListRecyclerView.this;
            com.snap.messaging.chat.ui.view.MessageListRecyclerView.a(r2, r4);
            return r0;
            if (r2 != 0) goto L_0x0050;
            r2 = java.lang.Math.abs(r4);
            r3 = java.lang.Math.abs(r3);
            r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
            if (r2 <= 0) goto L_0x0043;
            r2 = 1;
            goto L_0x0044;
            r2 = 0;
            if (r2 != r0) goto L_0x004b;
            r2 = com.snap.messaging.chat.ui.view.MessageListRecyclerView.this;
            r2.c = r0;
            goto L_0x002f;
            r2 = com.snap.messaging.chat.ui.view.MessageListRecyclerView.this;
            r2.b = r0;
            return r5;
            r2 = new ajxk;
            r2.<init>();
            throw r2;
            r2 = new ajxk;
            r2.<init>();
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.chat.ui.view.MessageListRecyclerView$b.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }
    }

    static final class c implements AnimatorUpdateListener {
        private /* synthetic */ MessageListRecyclerView a;

        c(MessageListRecyclerView messageListRecyclerView) {
            this.a = messageListRecyclerView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MessageListRecyclerView messageListRecyclerView = this.a;
            akcr.a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                messageListRecyclerView.a((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public static final class d extends abtz {
        private /* synthetic */ MessageListRecyclerView a;

        d(MessageListRecyclerView messageListRecyclerView) {
            this.a = messageListRecyclerView;
        }

        public final void a() {
            MessageListRecyclerView messageListRecyclerView = this.a;
            messageListRecyclerView.a = MapboxConstants.MINIMUM_ZOOM;
            messageListRecyclerView.d = false;
        }
    }

    static {
        a aVar = new a();
    }

    public MessageListRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private MessageListRecyclerView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet, 0);
        this.f = context.getResources().getDimension(R.dimen.chat_time_max_shift_distance);
    }

    public static final /* synthetic */ void a(MessageListRecyclerView messageListRecyclerView, float f) {
        float f2 = messageListRecyclerView.e;
        if (f > f2) {
            messageListRecyclerView.a = Math.min(f, messageListRecyclerView.f);
        } else {
            messageListRecyclerView.a -= f2 - f;
        }
        messageListRecyclerView.e = f;
        messageListRecyclerView.a = Math.max(messageListRecyclerView.a, MapboxConstants.MINIMUM_ZOOM);
        messageListRecyclerView.a(messageListRecyclerView.a);
        messageListRecyclerView.d = true;
    }

    /* Access modifiers changed, original: final */
    public final void a(float f) {
        LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            akcr.a();
        }
        int i = 0;
        int childCount = layoutManager.getChildCount();
        if (childCount >= 0) {
            while (true) {
                View childAt = layoutManager.getChildAt(i);
                if (childAt instanceof SwipeableMessageLinearLayout) {
                    ((SwipeableMessageLinearLayout) childAt).setTranslationX(f);
                }
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return i > 0 ? this.a > MapboxConstants.MINIMUM_ZOOM : this.a < this.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = new GestureDetector(getContext(), new b());
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "ev");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        GestureDetector gestureDetector = this.h;
        if (gestureDetector == null) {
            akcr.a("gestureDetector");
        }
        return gestureDetector.onTouchEvent(motionEvent) || onInterceptTouchEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "ev");
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.c) {
                ValueAnimator valueAnimator;
                String str = "shiftBackAnimator";
                if (this.g != null) {
                    valueAnimator = this.g;
                    if (valueAnimator == null) {
                        akcr.a(str);
                    }
                    if (valueAnimator.isStarted()) {
                        valueAnimator = this.g;
                        if (valueAnimator == null) {
                            akcr.a(str);
                        }
                        valueAnimator.cancel();
                    }
                }
                Object duration = ValueAnimator.ofInt(new int[]{(int) this.a, 0}).setDuration(250);
                akcr.a(duration, "ValueAnimator.ofInt(tran…LIDE_BACK_ANIMATION_TIME)");
                this.g = duration;
                valueAnimator = this.g;
                if (valueAnimator == null) {
                    akcr.a(str);
                }
                valueAnimator.addUpdateListener(new c(this));
                valueAnimator = this.g;
                if (valueAnimator == null) {
                    akcr.a(str);
                }
                valueAnimator.addListener(new d(this));
                valueAnimator = this.g;
                if (valueAnimator == null) {
                    akcr.a(str);
                }
                valueAnimator.start();
                this.e = MapboxConstants.MINIMUM_ZOOM;
            }
            this.b = false;
            this.c = false;
        }
        String str2 = "gestureDetector";
        GestureDetector gestureDetector;
        if (this.d) {
            gestureDetector = this.h;
            if (gestureDetector == null) {
                akcr.a(str2);
            }
            gestureDetector.onTouchEvent(motionEvent);
            return true;
        }
        boolean z = this.b;
        if (z) {
            return super.onTouchEvent(motionEvent);
        }
        if (z) {
            throw new ajxk();
        }
        z = this.c;
        if (z) {
            gestureDetector = this.h;
            if (gestureDetector == null) {
                akcr.a(str2);
            }
            return gestureDetector.onTouchEvent(motionEvent);
        } else if (z) {
            throw new ajxk();
        } else {
            gestureDetector = this.h;
            if (gestureDetector == null) {
                akcr.a(str2);
            }
            z = gestureDetector.onTouchEvent(motionEvent);
            if (z) {
                return true;
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            throw new ajxk();
        }
    }
}
