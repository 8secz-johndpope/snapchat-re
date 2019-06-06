package com.snap.messaging.friendsfeed.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.azs;
import defpackage.azt;
import defpackage.azu;
import defpackage.azx;
import defpackage.rbw;
import java.util.ArrayList;

public class TypingIndicatorView extends FrameLayout {
    View a;
    Animator b;
    AnimatorSet c;
    private final azu d;
    private final Handler e;
    private final View[] f;
    private rbw g;
    private azt h;
    private azt i;
    private azt j;

    /* renamed from: com.snap.messaging.friendsfeed.ui.view.TypingIndicatorView$8 */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] a = new int[rbw.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.rbw.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.rbw.ENTER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.rbw.TYPING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.rbw.PAUSE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.rbw.CANCEL;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = defpackage.rbw.RECEIVE;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.friendsfeed.ui.view.TypingIndicatorView$AnonymousClass8.<clinit>():void");
        }
    }

    public TypingIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private TypingIndicatorView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.d = new azu(420.0d, 28.0d);
        this.e = new Handler();
        this.f = new View[3];
        this.h = null;
        this.i = null;
        this.j = null;
    }

    static /* synthetic */ void a(TypingIndicatorView typingIndicatorView, float f) {
        typingIndicatorView.setScaleX(f);
        typingIndicatorView.setScaleY(f);
    }

    private void b() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setTranslationY(1.0f);
        setRotation(1.0f);
    }

    private void c() {
        Animator animator = this.b;
        if (animator != null) {
            animator.cancel();
            this.b.removeAllListeners();
        }
        AnimatorSet animatorSet = this.c;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.c.removeAllListeners();
        }
        d();
    }

    private void d() {
        azt azt = this.h;
        if (azt != null) {
            azt.c();
            this.h.d();
        }
        azt = this.i;
        if (azt != null) {
            azt.c();
            this.i.d();
        }
        azt = this.j;
        if (azt != null) {
            azt.c();
            this.j.d();
        }
    }

    private /* synthetic */ void e() {
        if (this.i == null) {
            this.i = azx.b().a();
        }
        azt a = this.i.a(this.d).a(45.0d);
        a.b = false;
        a.a(new azs() {
            public final void onSpringAtRest(azt azt) {
                TypingIndicatorView.this.a(rbw.TYPING);
            }

            public final void onSpringUpdate(azt azt) {
                TypingIndicatorView.this.setRotation((float) azt.d.a);
            }
        });
        this.i.b(0.0d);
    }

    public final void a() {
        c();
        b();
        setVisibility(4);
        setAlpha(MapboxConstants.MINIMUM_ZOOM);
    }

    public final void a(rbw rbw) {
        if (rbw != this.g) {
            this.g = rbw;
            c();
            setVisibility(0);
            setAlpha(1.0f);
            int i = AnonymousClass8.a[rbw.ordinal()];
            azt a;
            if (i != 1) {
                String str = "alpha";
                String str2 = "scaleY";
                String str3 = "scaleX";
                ObjectAnimator ofPropertyValuesHolder;
                if (i == 2) {
                    b();
                    ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.a, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(str3, new float[]{0.95f, 1.0f}), PropertyValuesHolder.ofFloat(str2, new float[]{0.95f, 1.0f})});
                    ofPropertyValuesHolder.setDuration(350);
                    ofPropertyValuesHolder.setRepeatMode(2);
                    ofPropertyValuesHolder.setRepeatCount(-1);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < 3; i2++) {
                        Object obj = this.f[i2];
                        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
                        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(str, new float[]{0.5f, 1.0f, 0.5f});
                        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat("translationY", new float[]{MapboxConstants.MINIMUM_ZOOM, -3.0f, MapboxConstants.MINIMUM_ZOOM});
                        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValuesHolderArr);
                        ofPropertyValuesHolder2.setDuration(700);
                        arrayList.add(ofPropertyValuesHolder2);
                    }
                    animatorSet.playSequentially(arrayList);
                    this.b = ofPropertyValuesHolder;
                    this.c = animatorSet;
                    this.c.addListener(new AnimatorListenerAdapter() {
                        private boolean a;

                        public final void onAnimationCancel(Animator animator) {
                            this.a = true;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!this.a) {
                                TypingIndicatorView.this.c.start();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            this.a = false;
                        }
                    });
                    this.b.start();
                    this.c.start();
                    return;
                } else if (i != 3) {
                    String str4 = "rotation";
                    if (i == 4) {
                        r13 = new PropertyValuesHolder[3];
                        r13[0] = PropertyValuesHolder.ofFloat(str3, new float[]{getScaleX(), MapboxConstants.MINIMUM_ZOOM});
                        r13[1] = PropertyValuesHolder.ofFloat(str2, new float[]{getScaleY(), MapboxConstants.MINIMUM_ZOOM});
                        r13[2] = PropertyValuesHolder.ofFloat(str4, new float[]{MapboxConstants.MINIMUM_ZOOM, -15.0f});
                        ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, r13);
                        ofPropertyValuesHolder.setDuration(400);
                        this.b = ofPropertyValuesHolder;
                        this.b.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                TypingIndicatorView.this.a();
                            }
                        });
                        this.b.start();
                        return;
                    } else if (i != 5) {
                        a();
                        return;
                    } else {
                        b();
                        ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(str3, new float[]{1.0f, 1.5f}), PropertyValuesHolder.ofFloat(str2, new float[]{1.0f, 1.5f}), PropertyValuesHolder.ofFloat(str4, new float[]{MapboxConstants.MINIMUM_ZOOM, 15.0f}), PropertyValuesHolder.ofFloat(str, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM})});
                        ofPropertyValuesHolder.setDuration(400);
                        this.b = ofPropertyValuesHolder;
                        this.b.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                TypingIndicatorView.this.a();
                            }
                        });
                        this.b.start();
                        return;
                    }
                } else {
                    b();
                    if (this.j == null) {
                        this.j = azx.b().a();
                    }
                    a = this.j.a(this.d).a(1.0d);
                    a.b = false;
                    a.a(new azs() {
                        public final void onSpringUpdate(azt azt) {
                            TypingIndicatorView.a(TypingIndicatorView.this, (float) azt.d.a);
                        }
                    }).a(new azs() {
                        public final void onSpringAtRest(azt azt) {
                            View view = TypingIndicatorView.this.a;
                            r1 = new PropertyValuesHolder[2];
                            r1[0] = PropertyValuesHolder.ofFloat("scaleX", new float[]{0.95f, 1.0f});
                            r1[1] = PropertyValuesHolder.ofFloat("scaleY", new float[]{0.95f, 1.0f});
                            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, r1);
                            ofPropertyValuesHolder.setDuration(350);
                            ofPropertyValuesHolder.setRepeatMode(2);
                            ofPropertyValuesHolder.setRepeatCount(-1);
                            TypingIndicatorView typingIndicatorView = TypingIndicatorView.this;
                            typingIndicatorView.b = ofPropertyValuesHolder;
                            typingIndicatorView.b.start();
                        }
                    });
                    this.j.b(0.75d);
                    return;
                }
            }
            b();
            if (this.h == null) {
                this.h = azx.b().a();
            }
            a = this.h.a(this.d);
            a.b = false;
            a.a(new azs() {
                public final void onSpringUpdate(azt azt) {
                    float f = (float) azt.d.a;
                    TypingIndicatorView.a(TypingIndicatorView.this, f);
                    TypingIndicatorView.this.setTranslationY((1.0f - f) * 16.0f);
                }
            });
            this.h.b(1.0d);
            this.e.postDelayed(new -$$Lambda$TypingIndicatorView$sTJ5VqsmohufMarb8qjgHe1uZC8(this), 50);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.ff_typing_bubble);
        this.f[0] = findViewById(R.id.ff_typing_dot_one);
        this.f[1] = findViewById(R.id.ff_typing_dot_two);
        this.f[2] = findViewById(R.id.ff_typing_dot_three);
    }
}
