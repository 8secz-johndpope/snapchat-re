package com.snap.camera.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.snapchat.android.R;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class CameraLongPressParticleView extends FrameLayout {
    public final Context a;
    public final float b;
    public final Supplier<List<Drawable>> c = Suppliers.memoize(new -$$Lambda$CameraLongPressParticleView$tVG1teW-UN3jp9qXrGGF9aUKmLA(this));
    public final Supplier<List<Drawable>> d = Suppliers.memoize(new -$$Lambda$CameraLongPressParticleView$t8Gatm5vdw6h8Ei_XfMWzS4N5yA(this));
    public final Supplier<List<Drawable>> e = Suppliers.memoize(new -$$Lambda$CameraLongPressParticleView$duCzbkrUFN8LQWFn8iGz5gHomSA(this));
    public final Random f = new Random();
    public int g;
    public final Queue<WeakReference<ImageView>> h = new LinkedList();

    /* renamed from: com.snap.camera.view.CameraLongPressParticleView$1 */
    public class AnonymousClass1 implements AnimatorListener {
        private /* synthetic */ ImageView a;

        public AnonymousClass1(ImageView imageView) {
            this.a = imageView;
        }

        public final void onAnimationCancel(Animator animator) {
            this.a.setVisibility(8);
            CameraLongPressParticleView.this.removeView(this.a);
            this.a.setBackground(null);
        }

        public final void onAnimationEnd(Animator animator) {
            this.a.setVisibility(8);
            CameraLongPressParticleView.this.removeView(this.a);
            this.a.setBackground(null);
            CameraLongPressParticleView cameraLongPressParticleView = CameraLongPressParticleView.this;
            cameraLongPressParticleView.post(new AnonymousClass2(this.a));
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.snap.camera.view.CameraLongPressParticleView$2 */
    class AnonymousClass2 implements Runnable {
        private /* synthetic */ View a;

        AnonymousClass2(View view) {
            this.a = view;
        }

        public final void run() {
            CameraLongPressParticleView.this.removeView(this.a);
            CameraLongPressParticleView.this.h.add(new WeakReference((ImageView) this.a));
        }
    }

    public CameraLongPressParticleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        this.b = context.getResources().getDisplayMetrics().density;
    }

    private List<Drawable> a() {
        return ImmutableList.of(this.a.getResources().getDrawable(R.mipmap.particle2));
    }

    private List<Drawable> b() {
        Resources resources = this.a.getResources();
        return ImmutableList.of(resources.getDrawable(R.mipmap.particle1), resources.getDrawable(R.mipmap.particle3));
    }

    private /* synthetic */ List c() {
        return Lists.newArrayList(Iterables.concat((Iterable) this.c.get(), (Iterable) this.d.get()));
    }
}
