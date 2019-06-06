package com.snap.previewtools.attachment.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.ajdp;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajwo;
import defpackage.akcr;
import defpackage.uda;
import defpackage.udb;

public class ScrollablePullDownBaseView extends FrameLayout {
    public final ajwo<MotionEvent> a;
    public final ajei b = new ajei();
    boolean c;

    static final class a<T> implements ajfb<udb> {
        private /* synthetic */ ScrollablePullDownBaseView a;

        a(ScrollablePullDownBaseView scrollablePullDownBaseView) {
            this.a = scrollablePullDownBaseView;
        }

        public final /* synthetic */ void accept(Object obj) {
            int i = uda.a[((udb) obj).a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.a.c = false;
                    }
                    return;
                }
                this.a.c = true;
            }
        }
    }

    public ScrollablePullDownBaseView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.a = ajwo;
    }

    public final void a(ajdp<udb> ajdp) {
        akcr.b(ajdp, "pullDownEventObservable");
        this.b.a(ajdp.f((ajfb) new a(this)));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "ev");
        this.a.a((Object) motionEvent);
        if (!this.c) {
            super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
