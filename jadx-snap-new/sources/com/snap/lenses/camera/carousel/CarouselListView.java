package com.snap.lenses.camera.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.snap.ui.view.recycler.RecyclerViewCenterViewLock;
import defpackage.ajwo;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.lsr;

public final class CarouselListView extends RecyclerView {
    int a;
    int b;
    int c;
    final ajwo<Integer> d;
    int e;
    final SmoothScrollerLinearLayoutManager f;
    private lsr g;
    private int h;
    private final a i;

    public static final class a implements OnPreDrawListener {
        private /* synthetic */ CarouselListView a;

        a(CarouselListView carouselListView) {
            this.a = carouselListView;
        }

        public final boolean onPreDraw() {
            Object viewTreeObserver = this.a.getViewTreeObserver();
            akcr.a(viewTreeObserver, "vto");
            if (viewTreeObserver.isAlive()) {
                this.a.setVisibility(4);
                CarouselListView carouselListView = this.a;
                carouselListView.post(new b(carouselListView));
                carouselListView = this.a;
                carouselListView.scrollToPosition(carouselListView.e);
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            return true;
        }
    }

    /* renamed from: com.snap.lenses.camera.carousel.CarouselListView$2 */
    static final class AnonymousClass2 extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ CarouselListView a;

        AnonymousClass2(CarouselListView carouselListView) {
            this.a = carouselListView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            if (view != null) {
                int childAdapterPosition = this.a.getChildAdapterPosition(view);
                if (childAdapterPosition != -1) {
                    this.a.a(childAdapterPosition, true);
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: com.snap.lenses.camera.carousel.CarouselListView$1 */
    static final class AnonymousClass1 extends akcq implements akbk<Integer> {
        AnonymousClass1(CarouselListView carouselListView) {
            super(0, carouselListView);
        }

        public final String getName() {
            return "calculateOffset";
        }

        public final akej getOwner() {
            return akde.a(CarouselListView.class);
        }

        public final String getSignature() {
            return "calculateOffset()I";
        }

        public final /* synthetic */ Object invoke() {
            CarouselListView carouselListView = (CarouselListView) this.receiver;
            return Integer.valueOf(((carouselListView.c - carouselListView.a) - (carouselListView.b << 1)) / 2);
        }
    }

    static final class b implements Runnable {
        private /* synthetic */ CarouselListView a;
        private /* synthetic */ int b = 0;

        b(CarouselListView carouselListView) {
            this.a = carouselListView;
        }

        public final void run() {
            this.a.setVisibility(0);
        }
    }

    public CarouselListView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private CarouselListView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Int>()");
        this.d = ajwo;
        this.e = -1;
        this.i = new a(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.mnx.a.a);
            try {
                this.b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
                this.a = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
                this.h = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Object context2 = getContext();
        akcr.a(context2, "getContext()");
        this.f = new SmoothScrollerLinearLayoutManager(context2, 0, false, new AnonymousClass1(this));
        setLayoutManager(this.f);
        addOnScrollListener(new RecyclerViewCenterViewLock(0, new AnonymousClass2(this)));
        setLayoutDirection(0);
        setItemAnimator(null);
    }

    private final void b(int i, boolean z) {
        if (i != -1) {
            if (z) {
                smoothScrollToPosition(i);
            } else {
                scrollToPosition(i);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, boolean z) {
        this.e = i;
        if (z) {
            this.d.a(Integer.valueOf(i));
        }
    }

    public final void a(int i, boolean z, boolean z2) {
        b(i, z);
        a(i, z2);
    }

    public final void a(boolean z) {
        this.f.a = z;
        if (!z) {
            stopScroll();
            this.f.scrollToPosition(this.e);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.i);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i > 0) {
                lsr lsr = this.g;
                if (lsr != null) {
                    removeItemDecoration(lsr);
                }
                this.c = i;
                Rect rect = new Rect();
                rect.offset((i - this.a) / 2, 0);
                this.g = new lsr(rect, this.b);
                lsr lsr2 = this.g;
                if (lsr2 == null) {
                    akcr.a();
                }
                addItemDecoration(lsr2);
            }
            if (i3 == 0) {
                b(this.e, false);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
