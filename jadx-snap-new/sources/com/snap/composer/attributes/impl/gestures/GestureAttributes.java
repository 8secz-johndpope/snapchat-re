package com.snap.composer.attributes.impl.gestures;

import android.content.Context;
import android.view.View;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.views.touches.DragGestureRecognizer;
import com.snap.composer.views.touches.GestureRecognizers;
import com.snap.composer.views.touches.LongPressGestureRecognizer;
import com.snap.composer.views.touches.PinchGestureRecognizer;
import com.snap.composer.views.touches.RotateGestureRecognizer;
import com.snap.composer.views.touches.TapGestureRecognizer;
import com.snap.composer.views.touches.TouchGestureRecognizer;
import com.snap.composer.views.touches.TouchGestureRecognizerListener;
import defpackage.akcr;

public final class GestureAttributes {
    private final Context a;

    public GestureAttributes(Context context) {
        akcr.b(context, "context");
        this.a = context;
    }

    private static TouchGestureRecognizer a(View view) {
        GestureRecognizers orCreateGestureRecognizers = ViewUtils.INSTANCE.getOrCreateGestureRecognizers(view);
        TouchGestureRecognizer touchGestureRecognizer = (TouchGestureRecognizer) orCreateGestureRecognizers.getGestureRecognizer(TouchGestureRecognizer.class);
        if (touchGestureRecognizer != null) {
            return touchGestureRecognizer;
        }
        touchGestureRecognizer = new TouchGestureRecognizer(view, new TouchContext());
        orCreateGestureRecognizers.addGestureRecognizer(touchGestureRecognizer);
        return touchGestureRecognizer;
    }

    private static void a(View view, Class<?> cls) {
        GestureRecognizers gestureRecognizers = ViewUtils.INSTANCE.getGestureRecognizers(view, false);
        if (gestureRecognizers != null) {
            gestureRecognizers.removeGestureRecognizer(cls);
        }
    }

    private static TouchGestureRecognizer b(View view) {
        GestureRecognizers gestureRecognizers = ViewUtils.INSTANCE.getGestureRecognizers(view, false);
        return gestureRecognizers != null ? (TouchGestureRecognizer) gestureRecognizers.getGestureRecognizer(TouchGestureRecognizer.class) : null;
    }

    private static void c(View view) {
        TouchGestureRecognizer b = b(view);
        if (b != null) {
            TouchGestureRecognizerListener listener = b.getListener();
            if (!(listener instanceof TouchContext)) {
                listener = null;
            }
            TouchContext touchContext = (TouchContext) listener;
            if (touchContext != null && touchContext.getAction() == null && touchContext.getStartAction() == null && touchContext.getEndAction() == null) {
                a(view, b.getClass());
            }
        }
    }

    public final void applyOnDrag(View view, ComposerAction composerAction) {
        akcr.b(view, "view");
        akcr.b(composerAction, "action");
        ViewUtils.INSTANCE.getOrCreateGestureRecognizers(view).addGestureRecognizer(new DragGestureRecognizer(view, new DragContext(composerAction)));
    }

    public final void applyOnLongPress(View view, ComposerAction composerAction) {
        akcr.b(view, "view");
        akcr.b(composerAction, "action");
        ViewUtils.INSTANCE.getOrCreateGestureRecognizers(view).addGestureRecognizer(new LongPressGestureRecognizer(view, new LongPressContext(composerAction)));
    }

    public final void applyOnPinch(View view, ComposerAction composerAction) {
        akcr.b(view, "view");
        akcr.b(composerAction, "action");
        ViewUtils.INSTANCE.getOrCreateGestureRecognizers(view).addGestureRecognizer(new PinchGestureRecognizer(view, new PinchContext(composerAction)));
    }

    public final void applyOnRotate(View view, ComposerAction composerAction) {
        akcr.b(view, "view");
        akcr.b(composerAction, "action");
        ViewUtils.INSTANCE.getOrCreateGestureRecognizers(view).addGestureRecognizer(new RotateGestureRecognizer(view, new RotateContext(composerAction)));
    }

    public final void applyOnTap(View view, ComposerAction composerAction) {
        akcr.b(view, "view");
        akcr.b(composerAction, "action");
        ViewUtils.INSTANCE.getOrCreateGestureRecognizers(view).addGestureRecognizer(new TapGestureRecognizer(view, new TapContext(composerAction)));
    }

    public final void applyOnTouch(View view, ComposerAction composerAction) {
        akcr.b(view, "view");
        akcr.b(composerAction, "action");
        TouchGestureRecognizerListener listener = a(view).getListener();
        if (!(listener instanceof TouchContext)) {
            listener = null;
        }
        TouchContext touchContext = (TouchContext) listener;
        if (touchContext != null) {
            touchContext.setAction(composerAction);
        }
    }

    public final void applyOnTouchEnd(View view, ComposerAction composerAction) {
        akcr.b(view, "view");
        akcr.b(composerAction, "action");
        TouchGestureRecognizerListener listener = a(view).getListener();
        if (!(listener instanceof TouchContext)) {
            listener = null;
        }
        TouchContext touchContext = (TouchContext) listener;
        if (touchContext != null) {
            touchContext.setEndAction(composerAction);
        }
    }

    public final void applyOnTouchStart(View view, ComposerAction composerAction) {
        akcr.b(view, "view");
        akcr.b(composerAction, "action");
        TouchGestureRecognizerListener listener = a(view).getListener();
        if (!(listener instanceof TouchContext)) {
            listener = null;
        }
        TouchContext touchContext = (TouchContext) listener;
        if (touchContext != null) {
            touchContext.setStartAction(composerAction);
        }
    }

    public final void resetOnDrag(View view) {
        akcr.b(view, "view");
        a(view, DragGestureRecognizer.class);
    }

    public final void resetOnLongPress(View view) {
        akcr.b(view, "view");
        a(view, LongPressGestureRecognizer.class);
    }

    public final void resetOnPinch(View view) {
        akcr.b(view, "view");
        a(view, PinchGestureRecognizer.class);
    }

    public final void resetOnRotate(View view) {
        akcr.b(view, "view");
        a(view, RotateGestureRecognizer.class);
    }

    public final void resetOnTap(View view) {
        akcr.b(view, "view");
        a(view, TapGestureRecognizer.class);
    }

    public final void resetOnTouch(View view) {
        akcr.b(view, "view");
        TouchGestureRecognizer b = b(view);
        TouchGestureRecognizerListener listener = b != null ? b.getListener() : null;
        if (!(listener instanceof TouchContext)) {
            listener = null;
        }
        TouchContext touchContext = (TouchContext) listener;
        if (touchContext != null) {
            touchContext.setAction(null);
        }
        c(view);
    }

    public final void resetOnTouchEnd(View view) {
        akcr.b(view, "view");
        TouchGestureRecognizer b = b(view);
        TouchGestureRecognizerListener listener = b != null ? b.getListener() : null;
        if (!(listener instanceof TouchContext)) {
            listener = null;
        }
        TouchContext touchContext = (TouchContext) listener;
        if (touchContext != null) {
            touchContext.setEndAction(null);
        }
        c(view);
    }

    public final void resetOnTouchStart(View view) {
        akcr.b(view, "view");
        TouchGestureRecognizer b = b(view);
        TouchGestureRecognizerListener listener = b != null ? b.getListener() : null;
        if (!(listener instanceof TouchContext)) {
            listener = null;
        }
        TouchContext touchContext = (TouchContext) listener;
        if (touchContext != null) {
            touchContext.setStartAction(null);
        }
        c(view);
    }
}
