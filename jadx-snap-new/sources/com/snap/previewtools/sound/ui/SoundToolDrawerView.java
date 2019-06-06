package com.snap.previewtools.sound.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.google.common.base.Optional;
import com.snapchat.android.R;
import defpackage.ajdv;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.azs;
import defpackage.azt;
import defpackage.ulg;

public final class SoundToolDrawerView extends LinearLayout {
    public azt a;
    final int b;
    final int c;
    public final ajei d = new ajei();
    public ajdv<Optional<defpackage.acak.a>> e;
    public final c f = new c(this);
    private int g = 8;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b<T> implements ajfb<MotionEvent> {
        private /* synthetic */ SoundToolDrawerView a;

        public b(SoundToolDrawerView soundToolDrawerView) {
            this.a = soundToolDrawerView;
        }

        /* JADX WARNING: Missing block: B:7:0x0018, code skipped:
            if (r1 != 3) goto L_0x003c;
     */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
            r7 = this;
            r8 = (android.view.MotionEvent) r8;
            r0 = r7.a;
            r1 = "event";
            defpackage.akcr.a(r8, r1);
            r1 = r8.getAction();
            r2 = "overlayObserver";
            if (r1 == 0) goto L_0x003d;
        L_0x0011:
            r3 = 1;
            if (r1 == r3) goto L_0x001b;
        L_0x0014:
            r3 = 2;
            if (r1 == r3) goto L_0x003d;
        L_0x0017:
            r3 = 3;
            if (r1 == r3) goto L_0x001b;
        L_0x001a:
            goto L_0x003c;
        L_0x001b:
            r8 = r8.getY();
            r1 = r0.c;
            r1 = (float) r1;
            r8 = r8 / r1;
            r8 = (int) r8;
            r8 = r0.a(r8);
            if (r8 == 0) goto L_0x002e;
        L_0x002a:
            r8.a();
            return;
        L_0x002e:
            r8 = r0.e;
            if (r8 != 0) goto L_0x0035;
        L_0x0032:
            defpackage.akcr.a(r2);
        L_0x0035:
            r0 = com.google.common.base.Optional.absent();
            r8.a(r0);
        L_0x003c:
            return;
        L_0x003d:
            r8 = r8.getY();
            r1 = r0.c;
            r1 = (float) r1;
            r8 = r8 / r1;
            r8 = (int) r8;
            r8 = r0.a(r8);
            if (r8 == 0) goto L_0x00a2;
        L_0x004c:
            r0 = r0.e;
            if (r0 != 0) goto L_0x0053;
        L_0x0050:
            defpackage.akcr.a(r2);
        L_0x0053:
            r1 = r8.d;
            r1 = com.google.common.base.Optional.of(r1);
            r0.a(r1);
            r0 = r8.c;
            r1 = r8.d;
            r2 = "soundToolType";
            defpackage.akcr.b(r1, r2);
            r3 = defpackage.ukv.k;
            r3 = r3.iterator();
        L_0x006b:
            r4 = r3.hasNext();
            if (r4 == 0) goto L_0x009b;
        L_0x0071:
            r4 = r3.next();
            r4 = (defpackage.acak.a) r4;
            if (r4 == r1) goto L_0x0086;
        L_0x0079:
            r5 = r0.o();
            r6 = "type";
            defpackage.akcr.a(r4, r6);
            r5.b(r4);
            goto L_0x006b;
        L_0x0086:
            r5 = r0.o();
            defpackage.akcr.b(r4, r2);
            r5 = r5.a;
            r4 = r5.get(r4);
            r4 = (defpackage.ulg) r4;
            if (r4 == 0) goto L_0x006b;
        L_0x0097:
            r4.c();
            goto L_0x006b;
        L_0x009b:
            r0 = r8.c;
            r8 = r8.d;
            r0.a(r8);
        L_0x00a2:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.previewtools.sound.ui.SoundToolDrawerView$b.accept(java.lang.Object):void");
        }
    }

    public static final class c extends azs {
        private /* synthetic */ SoundToolDrawerView a;

        c(SoundToolDrawerView soundToolDrawerView) {
            this.a = soundToolDrawerView;
        }

        public final void onSpringUpdate(azt azt) {
            akcr.b(azt, "spring");
            float f = 1.0f - ((float) azt.d.a);
            SoundToolDrawerView soundToolDrawerView = this.a;
            soundToolDrawerView.setTranslationY(f * ((float) soundToolDrawerView.b));
        }
    }

    static {
        a aVar = new a();
    }

    public SoundToolDrawerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        this.b = context.getResources().getDimensionPixelOffset(R.dimen.sound_tool_drawer_height);
        this.c = (int) context.getResources().getDimension(R.dimen.sound_tool_button_size);
    }

    /* Access modifiers changed, original: final */
    public final ulg a(int i) {
        int childCount = getChildCount();
        if (i < 0 || childCount <= i) {
            return null;
        }
        View childAt = getChildAt(i);
        if (childAt != null) {
            return (ulg) childAt;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.previewtools.sound.ui.SoundEffectDrawerButton");
    }

    public final void b(int i) {
        this.g = i;
        String str = "spring";
        azt azt;
        if (i == 0) {
            setVisibility(0);
            azt = this.a;
            if (azt == null) {
                akcr.a(str);
            }
            azt.b(1.0d);
            azt = this.a;
            if (azt == null) {
                akcr.a(str);
            }
            azt.b = false;
            setEnabled(true);
            return;
        }
        azt = this.a;
        if (azt == null) {
            akcr.a(str);
        }
        azt.b(0.0d);
        azt = this.a;
        if (azt == null) {
            akcr.a(str);
        }
        azt.b = true;
        setEnabled(false);
    }
}
