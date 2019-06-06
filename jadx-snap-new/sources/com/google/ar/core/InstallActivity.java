package com.google.ar.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.brightcove.player.media.ErrorFields;
import com.google.ar.core.ArCoreApk.a;
import com.google.ar.core.ArCoreApk.c;
import com.google.ar.core.ArCoreApk.d;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.caa;
import defpackage.cab;
import defpackage.cab.b;
import defpackage.caf;
import defpackage.caj;
import defpackage.cam;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(24)
public class InstallActivity extends Activity {
    int a = 2;
    boolean b;
    private final ContextThemeWrapper c = new ContextThemeWrapper(this, 16974394);
    private d d;
    private c e;
    private boolean f;

    /* renamed from: com.google.ar.core.InstallActivity$4 */
    class AnonymousClass4 implements AnimatorUpdateListener {
        private /* synthetic */ int a;
        private /* synthetic */ int b;
        private /* synthetic */ int c;

        AnonymousClass4(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
            float animatedFraction2 = valueAnimator.getAnimatedFraction();
            float f = ((float) this.a) * animatedFraction;
            int i = this.b;
            InstallActivity.this.getWindow().setLayout((int) (f + (((float) i) * animatedFraction2)), (int) ((((float) this.c) * animatedFraction) + (((float) i) * animatedFraction2)));
            InstallActivity.this.getWindow().getDecorView().refreshDrawableState();
        }
    }

    /* renamed from: com.google.ar.core.InstallActivity$7 */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] a = new int[a.values().length];
        static final /* synthetic */ int[] b = new int[d.values().length];
        static final /* synthetic */ int[] c = new int[cab.a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|8|9|11|12|(2:13|14)|15|17|18|(3:19|20|22)) */
        static {
            /*
            r0 = defpackage.cab.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            c = r0;
            r0 = 1;
            r1 = c;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = c;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = c;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 3;
            r2[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r2 = com.google.ar.core.ArCoreApk.d.values();
            r2 = r2.length;
            r2 = new int[r2];
            b = r2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x002c }
            r3 = com.google.ar.core.ArCoreApk.d.FEATURE;	 Catch:{ NoSuchFieldError -> 0x002c }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x002c }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x002c }
        L_0x002c:
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r3 = com.google.ar.core.ArCoreApk.d.APPLICATION;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0036 }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0036 }
        L_0x0036:
            r2 = com.google.ar.core.ArCoreApk.a.values();
            r2 = r2.length;
            r2 = new int[r2];
            a = r2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0049 }
            r3 = com.google.ar.core.ArCoreApk.a.UNSUPPORTED_DEVICE_NOT_CAPABLE;	 Catch:{ NoSuchFieldError -> 0x0049 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0049 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r2 = com.google.ar.core.ArCoreApk.a.UNKNOWN_ERROR;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.InstallActivity$AnonymousClass7.<clinit>():void");
        }
    }

    private boolean c() {
        return this.e == c.OPTIONAL;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (displayMetrics.density * 280.0f);
        getWindow().setLayout(i, i);
        RelativeLayout relativeLayout = new RelativeLayout(this.c);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(this.c);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = (int) (displayMetrics.density * 30.0f);
        TextView textView = new TextView(this.c);
        textView.setText(R.string.__arcore_installing);
        textView.setLayoutParams(layoutParams);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);
        getWindow().setLayout(i, i);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.f = true;
        this.a = 2;
        caa.a.a(this).a((Activity) this, new b() {
            private boolean a = false;

            /* JADX WARNING: Missing block: B:22:0x004c, code skipped:
            return;
     */
            public final void a(int r5) {
                /*
                r4 = this;
                r0 = com.google.ar.core.InstallActivity.this;
                monitor-enter(r0);
                r1 = r4.a;	 Catch:{ all -> 0x004f }
                if (r1 == 0) goto L_0x0009;
            L_0x0007:
                monitor-exit(r0);	 Catch:{ all -> 0x004f }
                return;
            L_0x0009:
                r1 = com.google.ar.core.InstallActivity.this;	 Catch:{ all -> 0x004f }
                r1.a = r5;	 Catch:{ all -> 0x004f }
                r1 = com.google.ar.core.InstallActivity.AnonymousClass7.c;	 Catch:{ all -> 0x004f }
                r2 = 1;
                r5 = r5 - r2;
                r5 = r1[r5];	 Catch:{ all -> 0x004f }
                if (r5 == r2) goto L_0x004d;
            L_0x0015:
                r1 = 2;
                if (r5 == r1) goto L_0x0035;
            L_0x0018:
                r1 = 3;
                if (r5 == r1) goto L_0x001c;
            L_0x001b:
                goto L_0x003e;
            L_0x001c:
                r5 = com.google.ar.core.InstallActivity.this;	 Catch:{ all -> 0x004f }
                r5 = r5.b;	 Catch:{ all -> 0x004f }
                if (r5 != 0) goto L_0x003e;
            L_0x0022:
                r5 = com.google.ar.core.InstallActivity.this;	 Catch:{ all -> 0x004f }
                r1 = new android.content.Intent;	 Catch:{ all -> 0x004f }
                r3 = com.google.ar.core.InstallActivity.class;
                r1.<init>(r5, r3);	 Catch:{ all -> 0x004f }
                r3 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
                r1 = r1.setFlags(r3);	 Catch:{ all -> 0x004f }
                r5.startActivity(r1);	 Catch:{ all -> 0x004f }
                goto L_0x003e;
            L_0x0035:
                r5 = defpackage.caa.a;	 Catch:{ all -> 0x004f }
                r1 = new cam;	 Catch:{ all -> 0x004f }
                r1.<init>();	 Catch:{ all -> 0x004f }
                r5.b = r1;	 Catch:{ all -> 0x004f }
            L_0x003e:
                r4.a = r2;	 Catch:{ all -> 0x004f }
                r5 = com.google.ar.core.InstallActivity.this;	 Catch:{ all -> 0x004f }
                r5 = r5.b;	 Catch:{ all -> 0x004f }
                if (r5 == 0) goto L_0x004b;
            L_0x0046:
                r5 = com.google.ar.core.InstallActivity.this;	 Catch:{ all -> 0x004f }
                r5.finish();	 Catch:{ all -> 0x004f }
            L_0x004b:
                monitor-exit(r0);	 Catch:{ all -> 0x004f }
                return;
            L_0x004d:
                monitor-exit(r0);	 Catch:{ all -> 0x004f }
                return;
            L_0x004f:
                r5 = move-exception;
                monitor-exit(r0);	 Catch:{ all -> 0x004f }
                throw r5;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.InstallActivity$AnonymousClass6.a(int):void");
            }

            public final void a(Exception exception) {
                synchronized (InstallActivity.this) {
                    if (this.a) {
                        return;
                    }
                    caa.a.b = (caf) exception;
                    this.a = true;
                    InstallActivity.this.a = 2;
                    InstallActivity.this.finish();
                }
            }
        });
    }

    public void finish() {
        super.finish();
        caa.a.a();
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder stringBuilder = new StringBuilder(27);
        stringBuilder.append("activityResult: ");
        stringBuilder.append(i2);
        Log.i("ARCore-IA", stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                caa.a.b = new caf("Install activity was suspended and recreated.");
                finish();
                return;
            } catch (RuntimeException e) {
                caa.a.b = new caf("Exception starting install flow", e);
                finish();
                return;
            }
        }
        this.d = (d) getIntent().getSerializableExtra(ErrorFields.MESSAGE);
        this.e = (c) getIntent().getSerializableExtra("behavior");
        String str = "ARCore-IA";
        if (this.d != null) {
            if (this.e != null) {
                setTheme(16974394);
                getWindow().requestFeature(1);
                setFinishOnTouchOutside(c());
                if (this.d == d.USER_ALREADY_INFORMED) {
                    a();
                } else {
                    final AtomicReference atomicReference = new AtomicReference(a.UNKNOWN_CHECKING);
                    caa.a.a(this).a((Context) this, new ArCoreApk.b() {
                        public final void a(a aVar) {
                            atomicReference.set(aVar);
                        }
                    });
                    int i = AnonymousClass7.a[((a) atomicReference.get()).ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            Log.w(str, "Preliminary compatibility check failed.");
                        }
                        setContentView(R.layout.__arcore_education);
                        findViewById(R.id.__arcore_cancelButton).setOnClickListener(new OnClickListener() {
                            public final void onClick(View view) {
                                InstallActivity.this.finish();
                            }
                        });
                        if (!c()) {
                            findViewById(R.id.__arcore_cancelButton).setVisibility(8);
                        }
                        findViewById(R.id.__arcore_continueButton).setOnClickListener(new OnClickListener() {
                            public final void onClick(View view) {
                                InstallActivity installActivity = InstallActivity.this;
                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                installActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                int i = (int) (displayMetrics.density * 280.0f);
                                int width = installActivity.getWindow().getDecorView().getWidth();
                                int height = installActivity.getWindow().getDecorView().getHeight();
                                installActivity.setContentView(new RelativeLayout(installActivity));
                                installActivity.getWindow().getDecorView().setMinimumWidth(i);
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
                                ofFloat.setDuration(300);
                                ofFloat.addUpdateListener(new AnonymousClass4(width, i, height));
                                ofFloat.addListener(new AnimatorListenerAdapter() {
                                    public final void onAnimationEnd(Animator animator) {
                                        InstallActivity.this.a();
                                    }
                                });
                                ofFloat.start();
                                InstallActivity.this.b();
                            }
                        });
                        TextView textView = (TextView) findViewById(R.id.__arcore_messageText);
                        if (AnonymousClass7.b[this.d.ordinal()] != 1) {
                            textView.setText(R.string.__arcore_install_app);
                        } else {
                            textView.setText(R.string.__arcore_install_feature);
                        }
                    } else {
                        caa.a.b = new caj();
                        finish();
                        return;
                    }
                }
                caa.a.b = new cam();
                return;
            }
        }
        Log.e(str, "missing intent data.");
        finish();
    }

    /* Access modifiers changed, original: protected */
    public void onNewIntent(Intent intent) {
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        if (this.f) {
            synchronized (this) {
                if (this.a == 1) {
                    this.b = true;
                } else {
                    finish();
                }
            }
            return;
        }
        if (this.d == d.USER_ALREADY_INFORMED) {
            b();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("didResume", true);
    }
}
