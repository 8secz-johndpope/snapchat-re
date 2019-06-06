package com.snap.cognac.internal.opera;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import defpackage.akcr;
import defpackage.jo;
import defpackage.zpj;

public final class MessagesRecyclerView extends RecyclerView {
    private final SimpleOnGestureListener a;
    private final jo b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b extends SimpleOnGestureListener {
        private final int a;
        private /* synthetic */ Context b;

        b(Context context) {
            this.b = context;
            Object obj = ViewConfiguration.get(context);
            akcr.a(obj, "ViewConfiguration.get(context)");
            this.a = obj.getScaledPagingTouchSlop();
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return (motionEvent == null || motionEvent2 == null || motionEvent2.getY() - motionEvent.getY() <= ((float) this.a)) ? false : true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        a aVar = new a();
    }

    public MessagesRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private MessagesRecyclerView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.a = new b(context);
        this.b = new jo(context, this.a);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent != null ? findChildViewUnder(motionEvent.getX(), motionEvent.getY()) : null) == null && this.b.a(motionEvent)) {
            zpj.a(getContext(), getWindowToken());
        }
        return super.onTouchEvent(motionEvent);
    }
}
