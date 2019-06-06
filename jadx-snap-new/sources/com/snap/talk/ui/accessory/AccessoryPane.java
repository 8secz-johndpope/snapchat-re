package com.snap.talk.ui.accessory;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.snapchat.android.R;
import defpackage.abjc;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.idc;
import defpackage.iho;
import defpackage.zbj;
import defpackage.zbn;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public final class AccessoryPane extends LinearLayout {
    public final View a;
    public final View b;
    public final View c;
    public final View d;
    final ImageView e;
    public final Map<c, View[]> f;
    public zbj g = new zbj();
    private final ajxe h = ajxh.a(l.a);
    private final View i;

    public static final class a extends AnimatorListenerAdapter {
        private /* synthetic */ View[] a;

        public a(View[] viewArr) {
            this.a = viewArr;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            iho.a(this.a, 8);
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        private /* synthetic */ View[] a;

        public b(View[] viewArr) {
            this.a = viewArr;
        }

        public final void onAnimationStart(Animator animator) {
            iho.a(this.a, 0);
        }
    }

    public enum c {
        START,
        JOIN,
        END,
        NONE
    }

    public static final class d extends AnimatorListenerAdapter {
        private /* synthetic */ AccessoryPane a;
        private /* synthetic */ zbj b;

        public d(AccessoryPane accessoryPane, zbj zbj) {
            this.a = accessoryPane;
            this.b = zbj;
        }

        public final void onAnimationStart(Animator animator) {
            this.a.e.setImageResource(this.b.b == abjc.VIDEO ? R.drawable.start_videocall : R.drawable.start_audiocall);
        }
    }

    public static final class e extends AnimatorListenerAdapter {
        private /* synthetic */ AccessoryPane a;
        private /* synthetic */ zbj b;

        public e(AccessoryPane accessoryPane, zbj zbj) {
            this.a = accessoryPane;
            this.b = zbj;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            this.a.g = this.b;
        }
    }

    public static final class f implements OnClickListener {
        private /* synthetic */ AccessoryPane a;
        private /* synthetic */ akbl b;
        private /* synthetic */ akbl c;

        public f(AccessoryPane accessoryPane, akbl akbl, akbl akbl2) {
            this.a = accessoryPane;
            this.b = akbl;
            this.c = akbl2;
        }

        public final void onClick(View view) {
            (this.a.g.d ? this.b : this.c).invoke(abjc.AUDIO);
        }
    }

    public static final class g implements OnClickListener {
        private /* synthetic */ AccessoryPane a;
        private /* synthetic */ akbl b;
        private /* synthetic */ akbl c;

        public g(AccessoryPane accessoryPane, akbl akbl, akbl akbl2) {
            this.a = accessoryPane;
            this.b = akbl;
            this.c = akbl2;
        }

        public final void onClick(View view) {
            (this.a.g.d ? this.b : this.c).invoke(abjc.VIDEO);
        }
    }

    public static final class h implements OnClickListener {
        private /* synthetic */ akbl a;

        public h(akbl akbl) {
            this.a = akbl;
        }

        public final void onClick(View view) {
            this.a.invoke(abjc.NONE);
        }
    }

    public static final class i implements OnClickListener {
        private /* synthetic */ AccessoryPane a;
        private /* synthetic */ akbl b;

        public i(AccessoryPane accessoryPane, akbl akbl) {
            this.a = accessoryPane;
            this.b = akbl;
        }

        public final void onClick(View view) {
            this.b.invoke(this.a.g.b);
        }
    }

    public static final class j extends AnimatorListenerAdapter {
        private /* synthetic */ View[] a;

        public j(View[] viewArr) {
            this.a = viewArr;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            iho.a(this.a);
        }
    }

    public static final class k implements AnimatorUpdateListener {
        private /* synthetic */ View[] a;

        public k(View[] viewArr) {
            this.a = viewArr;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            akcr.a((Object) valueAnimator, "a");
            for (View view : this.a) {
                view.setScaleX(idc.a(valueAnimator));
                view.setScaleY(idc.a(valueAnimator));
            }
        }
    }

    static final class l extends akcs implements akbk<zbn> {
        public static final l a = new l();

        l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zbn();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(AccessoryPane.class), "springInterpolator", "getSpringInterpolator()Lcom/snap/talk/ui/animation/SpringInterpolator;");
    }

    public AccessoryPane(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.accessory_pane_internal, this);
        Object findViewById = findViewById(R.id.start_call_container);
        akcr.a(findViewById, "findViewById(R.id.start_call_container)");
        this.i = findViewById;
        findViewById = findViewById(R.id.start_audio);
        akcr.a(findViewById, "findViewById(R.id.start_audio)");
        this.a = findViewById;
        findViewById = findViewById(R.id.start_video);
        akcr.a(findViewById, "findViewById(R.id.start_video)");
        this.b = findViewById;
        findViewById = findViewById(R.id.end_call);
        akcr.a(findViewById, "findViewById(R.id.end_call)");
        this.c = findViewById;
        findViewById = findViewById(R.id.join_call);
        akcr.a(findViewById, "findViewById(R.id.join_call)");
        this.d = findViewById;
        findViewById = findViewById(R.id.join_call_media_type);
        akcr.a(findViewById, "findViewById(R.id.join_call_media_type)");
        this.e = (ImageView) findViewById;
        setOrientation(0);
        setGravity(16);
        setClipChildren(false);
        setClipToPadding(false);
        EnumMap enumMap = new EnumMap(c.class);
        enumMap.put(c.START, new View[]{this.i});
        enumMap.put(c.END, new View[]{this.c});
        enumMap.put(c.JOIN, new View[]{this.d});
        enumMap.put(c.NONE, new View[0]);
        this.f = enumMap;
    }

    public static c a(zbj zbj) {
        return (zbj.c || zbj.f) ? c.NONE : (zbj.d && zbj.a == abjc.NONE) ? c.JOIN : zbj.d ? c.END : c.START;
    }

    private final zbn a() {
        return (zbn) this.h.b();
    }

    public final ValueAnimator a(c cVar) {
        View[] viewArr = (View[]) this.f.get(cVar);
        if (viewArr == null) {
            return null;
        }
        Animator a = akcr.b((View[]) Arrays.copyOf(viewArr, viewArr.length), "views");
        a.addListener(new b(viewArr));
        return (ValueAnimator) a;
    }

    public final ValueAnimator a(View[] viewArr, float f, float f2) {
        Object ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setInterpolator(a());
        akcr.a(ofFloat, "ValueAnimator.ofFloat(st…nterpolator\n            }");
        ofFloat.addUpdateListener(new k(viewArr));
        Animator animator = (Animator) ofFloat;
        animator.addListener(new j(viewArr));
        return (ValueAnimator) animator;
    }
}
