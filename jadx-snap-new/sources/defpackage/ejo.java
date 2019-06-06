package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.camera.subcomponents.capture.view.HandsFreeRecordingLockView;
import com.snap.ui.view.TakeSnapButton;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;

/* renamed from: ejo */
public final class ejo implements ejl {
    private final ajwy<ejn> a;
    private final ajwy<HandsFreeRecordingLockView> b;
    private final ajwy<TakeSnapButton> c;
    private a d;

    /* renamed from: ejo$a */
    static class a implements OnLayoutChangeListener {
        private final TakeSnapButton a;
        private final HandsFreeRecordingLockView b;

        public a(TakeSnapButton takeSnapButton, HandsFreeRecordingLockView handsFreeRecordingLockView) {
            this.a = takeSnapButton;
            this.b = handsFreeRecordingLockView;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            this.b.a((int) (this.a.getX() + ((((float) this.a.getWidth()) * this.a.getScaleX()) / 2.0f)), (int) (this.a.getY() + ((((float) this.a.getHeight()) * this.a.getScaleY()) / 2.0f)));
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            a();
        }
    }

    public ejo(ViewFinder viewFinder, ajwy<ejn> ajwy) {
        this.a = ajwy;
        this.b = aiqg.a(new -$$Lambda$ejo$Ly1LR4UsmQkml3Q8fHEGZkuZKVk(viewFinder));
        this.c = aiqg.a(new -$$Lambda$ejo$PyQQZu18SUW6QWATwt9YGy5Ov54(viewFinder));
    }

    private static /* synthetic */ HandsFreeRecordingLockView b(ViewFinder viewFinder) {
        View findViewById = viewFinder.findViewById(R.id.camera_hands_free_recording_lock);
        if (!(findViewById instanceof ViewStub)) {
            return (HandsFreeRecordingLockView) findViewById;
        }
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(R.layout.hands_free_recording_layout);
        return (HandsFreeRecordingLockView) viewStub.inflate();
    }

    public final Rect a() {
        int dimension = (int) ((TakeSnapButton) this.c.get()).getContext().getResources().getDimension(R.dimen.camera_hands_free_recording_lock_region_width);
        int width = (int) (((float) ((TakeSnapButton) this.c.get()).getWidth()) * ((TakeSnapButton) this.c.get()).getScaleX());
        r3 = new int[2];
        ((TakeSnapButton) this.c.get()).getLocationOnScreen(r3);
        r3[0] = (int) (((float) r3[0]) + ((((float) ((TakeSnapButton) this.c.get()).getWidth()) * ((TakeSnapButton) this.c.get()).getScaleX()) / 2.0f));
        r3[1] = (int) (((float) r3[1]) + ((((float) ((TakeSnapButton) this.c.get()).getHeight()) * ((TakeSnapButton) this.c.get()).getScaleY()) / 2.0f));
        dimension /= 2;
        return new Rect(0, r3[1] - dimension, r3[0] - (width / 2), r3[1] + dimension);
    }

    public final void b() {
        ((HandsFreeRecordingLockView) this.b.get()).setVisibility(0);
        HandsFreeRecordingLockView handsFreeRecordingLockView = (HandsFreeRecordingLockView) this.b.get();
        handsFreeRecordingLockView.a.setAlpha(0.6f);
        if (handsFreeRecordingLockView.a.getBackground() != null) {
            handsFreeRecordingLockView.a.getBackground().setColorFilter(null);
        }
        if (handsFreeRecordingLockView.c != null) {
            handsFreeRecordingLockView.c.cancel();
            handsFreeRecordingLockView.c.removeAllUpdateListeners();
            handsFreeRecordingLockView.c = null;
        }
        if (handsFreeRecordingLockView.d != null) {
            handsFreeRecordingLockView.d.cancel();
            handsFreeRecordingLockView.d.removeAllUpdateListeners();
            handsFreeRecordingLockView.d = null;
        }
        handsFreeRecordingLockView = (HandsFreeRecordingLockView) this.b.get();
        if (handsFreeRecordingLockView.f != null) {
            handsFreeRecordingLockView.f.a(0.0d);
            handsFreeRecordingLockView.f.c();
        }
        if (handsFreeRecordingLockView.e != null) {
            handsFreeRecordingLockView.e.cancel();
            handsFreeRecordingLockView.e.removeAllUpdateListeners();
            handsFreeRecordingLockView.e = null;
        }
        handsFreeRecordingLockView.b.setAlpha(MapboxConstants.MINIMUM_ZOOM);
    }

    public final void c() {
        ((HandsFreeRecordingLockView) this.b.get()).setVisibility(4);
    }

    public final void d() {
        TakeSnapButton takeSnapButton = (TakeSnapButton) this.c.get();
        this.d = new a(takeSnapButton, (HandsFreeRecordingLockView) this.b.get());
        if (!(takeSnapButton.getX() == MapboxConstants.MINIMUM_ZOOM && takeSnapButton.getY() == MapboxConstants.MINIMUM_ZOOM)) {
            this.d.a();
        }
        takeSnapButton.addOnLayoutChangeListener(this.d);
        ((HandsFreeRecordingLockView) this.b.get()).setOnTouchListener((OnTouchListener) this.a.get());
    }

    public final void e() {
        if (this.d != null) {
            ((TakeSnapButton) this.c.get()).removeOnLayoutChangeListener(this.d);
            this.d = null;
        }
        ((HandsFreeRecordingLockView) this.b.get()).setOnTouchListener(null);
    }

    public final void f() {
        ((TakeSnapButton) this.c.get()).onFingerMoveInLockRegion();
        HandsFreeRecordingLockView handsFreeRecordingLockView = (HandsFreeRecordingLockView) this.b.get();
        handsFreeRecordingLockView.d = zpi.a(handsFreeRecordingLockView.d, ValueAnimator.ofInt(new int[]{255, 0}), zpi.b(handsFreeRecordingLockView.a));
        handsFreeRecordingLockView = (HandsFreeRecordingLockView) this.b.get();
        handsFreeRecordingLockView.e = zpi.a(handsFreeRecordingLockView.e, ValueAnimator.ofFloat(new float[]{handsFreeRecordingLockView.b.getAlpha(), 1.0f}), zpi.a(handsFreeRecordingLockView.b));
        handsFreeRecordingLockView = (HandsFreeRecordingLockView) this.b.get();
        if (handsFreeRecordingLockView.f != null) {
            handsFreeRecordingLockView.f.c(10.0d);
            handsFreeRecordingLockView.f.b(1.0d);
        }
    }

    public final void g() {
        ((TakeSnapButton) this.c.get()).onFingerMoveOutLockRegion();
        HandsFreeRecordingLockView handsFreeRecordingLockView = (HandsFreeRecordingLockView) this.b.get();
        handsFreeRecordingLockView.d = zpi.a(handsFreeRecordingLockView.d, ValueAnimator.ofInt(new int[]{0, 255}), zpi.b(handsFreeRecordingLockView.a));
        ((HandsFreeRecordingLockView) this.b.get()).a();
        handsFreeRecordingLockView = (HandsFreeRecordingLockView) this.b.get();
        if (handsFreeRecordingLockView.f != null) {
            handsFreeRecordingLockView.f.c(10.0d);
            handsFreeRecordingLockView.f.b(0.0d);
        }
    }

    public final void h() {
        ((TakeSnapButton) this.c.get()).onEnterHandsFreeMode();
        ((HandsFreeRecordingLockView) this.b.get()).a();
        HandsFreeRecordingLockView handsFreeRecordingLockView = (HandsFreeRecordingLockView) this.b.get();
        handsFreeRecordingLockView.c = zpi.a(handsFreeRecordingLockView.c, ValueAnimator.ofFloat(new float[]{handsFreeRecordingLockView.a.getAlpha(), MapboxConstants.MINIMUM_ZOOM}), zpi.a(handsFreeRecordingLockView.a));
    }

    public final void i() {
        ((TakeSnapButton) this.c.get()).onExitHandsFreeMode();
    }

    public final void j() {
        ((TakeSnapButton) this.c.get()).onEnterHandsFreeMode();
    }
}
