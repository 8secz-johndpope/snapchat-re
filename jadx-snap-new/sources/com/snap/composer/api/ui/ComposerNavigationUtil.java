package com.snap.composer.api.ui;

import android.view.MotionEvent;
import android.view.View;
import com.google.common.base.Predicate;
import com.snap.composer.views.ComposerScrollUtil;
import com.snap.composer.views.ComposerView;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;

public final class ComposerNavigationUtil {
    private final ComposerScrollUtil a;
    private boolean b;
    private final Predicate<Void> c;
    private final Direction d;

    public enum Direction {
        DOWN(AnonymousClass1.a),
        LEFT(AnonymousClass2.a);
        
        private final akbl<View, Boolean> check;

        protected Direction(akbl<? super View, Boolean> akbl) {
            akcr.b(akbl, "check");
            this.check = akbl;
        }

        public final akbl<View, Boolean> getCheck() {
            return this.check;
        }
    }

    static final class a<T> implements Predicate<Void> {
        private /* synthetic */ ComposerNavigationUtil a;

        a(ComposerNavigationUtil composerNavigationUtil) {
            this.a = composerNavigationUtil;
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return this.a.b;
        }
    }

    public ComposerNavigationUtil() {
        this(null, 1, null);
    }

    public ComposerNavigationUtil(Direction direction) {
        akcr.b(direction, "direction");
        this.d = direction;
        this.a = new ComposerScrollUtil();
        this.b = true;
        this.c = new a(this);
    }

    public /* synthetic */ ComposerNavigationUtil(Direction direction, int i, akco akco) {
        if ((i & 1) != 0) {
            direction = Direction.DOWN;
        }
        this(direction);
    }

    public final Predicate<Void> getNavigationEnabledPredicate() {
        return this.c;
    }

    public final void rootViewTouchListener(ComposerView composerView, MotionEvent motionEvent) {
        akcr.b(composerView, "view");
        akcr.b(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.b = this.a.canViewScroll(composerView, motionEvent, this.d.getCheck()) ^ 1;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.b = true;
        }
    }
}
