package com.snap.lenses.camera.hint;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abtw;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.lzw;
import defpackage.maf;
import defpackage.mgw;
import defpackage.mgx;

public final class DefaultHintView extends TextView implements maf {
    a a;
    private final Handler b;
    private final ajxe c;
    private final akbk<ajxw> d;

    static abstract class a implements mgw {

        public static final class b extends a {
            private final Animator a;

            public /* synthetic */ b() {
                this(null);
            }

            public b(Animator animator) {
                super();
                this.a = animator;
            }

            public final Animator a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((com.snap.lenses.camera.hint.DefaultHintView.a.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof com.snap.lenses.camera.hint.DefaultHintView.a.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (com.snap.lenses.camera.hint.DefaultHintView.a.b) r2;
                r0 = r1.a;
                r2 = r2.a;
                r2 = defpackage.akcr.a(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.hint.DefaultHintView$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Animator animator = this.a;
                return animator != null ? animator.hashCode() : 0;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Hidden(animator=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        public static final class a extends a {
            private final String a;
            private final Animator b;

            public /* synthetic */ a(String str) {
                this(str, null);
            }

            public a(String str, Animator animator) {
                akcr.b(str, TrackReferenceTypeBox.TYPE1);
                super();
                this.a = str;
                this.b = animator;
            }

            public final Animator a() {
                return this.b;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof com.snap.lenses.camera.hint.DefaultHintView.a.a;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (com.snap.lenses.camera.hint.DefaultHintView.a.a) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x001d;
            L_0x0012:
                r0 = r2.b;
                r3 = r3.b;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x001d;
            L_0x001c:
                goto L_0x001f;
            L_0x001d:
                r3 = 0;
                return r3;
            L_0x001f:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.hint.DefaultHintView$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Animator animator = this.b;
                if (animator != null) {
                    i = animator.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Displayed(hint=");
                stringBuilder.append(this.a);
                stringBuilder.append(", animator=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class d extends akcs implements akbk<Boolean> {
        private /* synthetic */ DefaultHintView a;

        d(DefaultHintView defaultHintView) {
            this.a = defaultHintView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(abtw.a(this.a.getContext()) ^ 1);
        }
    }

    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ DefaultHintView a;

        b(DefaultHintView defaultHintView) {
            this.a = defaultHintView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a(false);
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ DefaultHintView a;

        c(DefaultHintView defaultHintView) {
            this.a = defaultHintView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a(false);
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbk<ajxw> {
        private /* synthetic */ AnimatorSet a;
        private /* synthetic */ DefaultHintView b;

        e(AnimatorSet animatorSet, DefaultHintView defaultHintView) {
            this.a = animatorSet;
            this.b = defaultHintView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.a = new b(this.a);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultHintView.class), "isAnimationEnabled", "isAnimationEnabled()Z");
    }

    public DefaultHintView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultHintView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.b = new Handler(Looper.getMainLooper());
        this.c = ajxh.a(new d(this));
        this.d = new b(this);
        this.a = new b();
    }

    private final ObjectAnimator a(float f) {
        View view = this;
        long j = ((long) (1.0f - f)) * 250;
        akcr.b(view, "target");
        return mgx.a(view, 1.0f, j);
    }

    private final void a(a aVar) {
        Animator a = this.a.a();
        if (a != null) {
            a.cancel();
        }
        a = aVar.a();
        if (a != null) {
            a.start();
        }
        this.a = aVar;
    }

    private final void a(String str, boolean z, boolean z2) {
        this.b.removeCallbacks(new lzw(this.d));
        if (z2) {
            Animator a = this.a.a();
            if (a != null && a.isRunning()) {
                a(false);
            }
            a((a) new a(str, z ? b() : a(getAlpha())));
        } else {
            setAlpha(1.0f);
            a((a) new a(str));
            if (z) {
                this.b.postDelayed(new lzw(this.d), 1000);
            }
        }
        setVisibility(0);
        setText(str);
    }

    private final boolean a() {
        return ((Boolean) this.c.b()).booleanValue();
    }

    private final AnimatorSet b() {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = a(getAlpha());
        Object b = b(getAlpha());
        akcr.a(b, "hide()");
        animatorArr[1] = mgx.b(mgx.a((Animator) b), new e(animatorSet, this));
        animatorSet.playSequentially(animatorArr);
        return animatorSet;
    }

    private final ObjectAnimator b(float f) {
        View view = this;
        long j = (long) (f * 250.0f);
        akcr.b(view, "target");
        return mgx.a(view, MapboxConstants.MINIMUM_ZOOM, j);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        b bVar;
        this.b.removeCallbacks(new lzw(this.d));
        if (z) {
            Object b = b(getAlpha());
            akcr.a(b, "hide()");
            bVar = new b(mgx.a((Animator) b, (akbk) new c(this)));
        } else {
            setVisibility(8);
            setAlpha(MapboxConstants.MINIMUM_ZOOM);
            bVar = new b();
        }
        a((a) bVar);
    }

    public final /* synthetic */ void accept(Object obj) {
        defpackage.maf.a aVar = (defpackage.maf.a) obj;
        akcr.b(aVar, "viewModel");
        if (aVar instanceof defpackage.maf.a.a.b) {
            defpackage.maf.a.a.b bVar = (defpackage.maf.a.a.b) aVar;
            a(bVar.a, bVar.b, a());
        } else if (aVar instanceof defpackage.maf.a.a.a) {
            String string;
            defpackage.maf.a.a.a aVar2 = (defpackage.maf.a.a.a) aVar;
            defpackage.mhs.b bVar2 = aVar2.a;
            Resources resources = getResources();
            String str = bVar2.a;
            Object context = getContext();
            akcr.a(context, "context");
            int identifier = resources.getIdentifier(str, "string", context.getPackageName());
            if (identifier != 0) {
                string = getResources().getString(identifier);
                akcr.a((Object) string, "resources.getString(stringId)");
            } else {
                StringBuilder stringBuilder = new StringBuilder("Missing translation for [");
                stringBuilder.append(bVar2);
                stringBuilder.append(']');
                string = stringBuilder.toString();
            }
            a(string, aVar2.b, a());
        } else {
            if (aVar instanceof defpackage.maf.a.b) {
                boolean z = a() && ((defpackage.maf.a.b) aVar).a;
                a(z);
            }
        }
    }
}
