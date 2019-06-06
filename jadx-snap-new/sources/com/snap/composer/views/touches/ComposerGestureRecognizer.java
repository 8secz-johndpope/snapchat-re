package com.snap.composer.views.touches;

import android.view.MotionEvent;
import android.view.View;
import defpackage.akcr;
import defpackage.akdp;

public abstract class ComposerGestureRecognizer {
    private ComposerGestureRecognizerState a = ComposerGestureRecognizerState.POSSIBLE;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private final View f;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerGestureRecognizerState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ComposerGestureRecognizerState.BEGAN.ordinal()] = 1;
            $EnumSwitchMapping$0[ComposerGestureRecognizerState.CHANGED.ordinal()] = 2;
            $EnumSwitchMapping$0[ComposerGestureRecognizerState.ENDED.ordinal()] = 3;
        }
    }

    public ComposerGestureRecognizer(View view) {
        akcr.b(view, "view");
        this.f = view;
    }

    public boolean canRecognizeSimultaneously(ComposerGestureRecognizer composerGestureRecognizer) {
        akcr.b(composerGestureRecognizer, "other");
        return false;
    }

    public final void cancel() {
        if (this.e && this.a != ComposerGestureRecognizerState.ENDED) {
            this.a = ComposerGestureRecognizerState.ENDED;
            process();
        }
        this.e = false;
        this.a = ComposerGestureRecognizerState.POSSIBLE;
        this.b = 0;
        this.c = 0;
        onReset();
    }

    public final void destroy() {
        if (!this.d) {
            this.d = true;
            onDestroy();
        }
    }

    public final boolean getDestroyed() {
        return this.d;
    }

    public final ComposerGestureRecognizerState getState() {
        return this.a;
    }

    public final View getView() {
        return this.f;
    }

    public final int getX() {
        return this.b;
    }

    public final int getY() {
        return this.c;
    }

    public final boolean isActive() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.a.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public void onDestroy() {
    }

    public abstract void onProcess();

    public void onReset() {
    }

    public abstract void onUpdate(MotionEvent motionEvent);

    public final void process() {
        this.e = true;
        onProcess();
    }

    /* Access modifiers changed, original: protected|final */
    public final void setState(ComposerGestureRecognizerState composerGestureRecognizerState) {
        akcr.b(composerGestureRecognizerState, "<set-?>");
        this.a = composerGestureRecognizerState;
    }

    public final void update(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        if (this.a == ComposerGestureRecognizerState.BEGAN) {
            this.a = ComposerGestureRecognizerState.CHANGED;
        }
        onUpdate(motionEvent);
        if (isActive()) {
            this.b = akdp.a(motionEvent.getX());
            this.c = akdp.a(motionEvent.getY());
        }
    }
}
