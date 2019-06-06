package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.nab.a;
import defpackage.nab.a.b;

/* renamed from: mzu */
final class mzu implements nab {
    final View a;
    private final nab b;

    /* renamed from: mzu$a */
    static final class a extends akcs implements akbw<View, MotionEvent, Boolean> {
        private /* synthetic */ mzu a;
        private /* synthetic */ akbw b;

        a(mzu mzu, akbw akbw) {
            this.a = mzu;
            this.b = akbw;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            MotionEvent motionEvent = (MotionEvent) obj2;
            akcr.b(view, "view");
            akcr.b(motionEvent, "motionEvent");
            if (!((Boolean) this.b.invoke(view, motionEvent)).booleanValue()) {
                this.a.a.dispatchTouchEvent(motionEvent);
            }
            return Boolean.TRUE;
        }
    }

    public mzu(nab nab, View view) {
        akcr.b(nab, "touchView");
        akcr.b(view, "viewToDispatchTo");
        this.b = nab;
        this.a = view;
    }

    public final /* synthetic */ void accept(Object obj) {
        a aVar = (a) obj;
        akcr.b(aVar, MapboxEvent.KEY_MODEL);
        if (aVar instanceof a.a) {
            this.b.accept(aVar);
            return;
        }
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.b.accept(b.a(bVar, new a(this, bVar.a), null, 2));
        }
    }
}
