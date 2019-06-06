package com.snap.composer.views.touches;

import defpackage.akcr;
import java.util.ArrayList;
import java.util.List;

public final class GestureRecognizers {
    private final List<ComposerGestureRecognizer> a = new ArrayList();

    private final int a(Class<?> cls) {
        int i = 0;
        for (ComposerGestureRecognizer composerGestureRecognizer : this.a) {
            if (akcr.a(composerGestureRecognizer.getClass(), (Object) cls)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void a(int i) {
        ((ComposerGestureRecognizer) this.a.remove(i)).destroy();
    }

    public final void addGestureRecognizer(ComposerGestureRecognizer composerGestureRecognizer) {
        akcr.b(composerGestureRecognizer, "gestureRecognizer");
        removeGestureRecognizer(composerGestureRecognizer.getClass());
        this.a.add(composerGestureRecognizer);
    }

    public final <T> T getGestureRecognizer(Class<T> cls) {
        akcr.b(cls, "gestureRecognizerClass");
        int a = a((Class) cls);
        return a >= 0 ? this.a.get(a) : null;
    }

    public final List<ComposerGestureRecognizer> getGestureRecognizers() {
        return this.a;
    }

    public final boolean hasGestureRecognizer(Class<?> cls) {
        akcr.b(cls, "gestureRecognizerClass");
        return a((Class) cls) >= 0;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final void removeAllGestureRecognizers() {
        while (!isEmpty()) {
            a(this.a.size() - 1);
        }
    }

    public final void removeGestureRecognizer(Class<?> cls) {
        akcr.b(cls, "gestureRecognizerClass");
        int a = a((Class) cls);
        if (a >= 0) {
            a(a);
        }
    }
}
