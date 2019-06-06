package defpackage;

import com.snap.lenses.camera.textinput.DefaultTextInputView;
import defpackage.mgk.a;

/* renamed from: mgl */
public final class mgl extends ajdp<a> {
    private final DefaultTextInputView a;

    /* renamed from: mgl$a */
    static final class a extends ajed implements com.snap.lenses.camera.textinput.DefaultTextInputView.a {
        private final DefaultTextInputView a;
        private final ajdv<? super defpackage.mgk.a> b;

        public a(DefaultTextInputView defaultTextInputView, ajdv<? super defpackage.mgk.a> ajdv) {
            akcr.b(defaultTextInputView, "view");
            akcr.b(ajdv, "observer");
            this.a = defaultTextInputView;
            this.b = ajdv;
        }

        public final void a(defpackage.mgk.a aVar) {
            akcr.b(aVar, "event");
            try {
                if (!isDisposed()) {
                    this.b.a((Object) aVar);
                }
            } catch (Exception e) {
                if (!isDisposed()) {
                    this.b.a((Throwable) e);
                    dispose();
                }
            }
        }

        public final void onDispose() {
            DefaultTextInputView defaultTextInputView = this.a;
            defaultTextInputView.c = null;
            defaultTextInputView.accept(defpackage.mgk.b.a.a);
        }
    }

    public mgl(DefaultTextInputView defaultTextInputView) {
        akcr.b(defaultTextInputView, "view");
        this.a = defaultTextInputView;
    }

    public final void a_(ajdv<? super a> ajdv) {
        akcr.b(ajdv, "observer");
        if (mig.a(ajdv)) {
            a aVar = new a(this.a, ajdv);
            ajdv.a((ajej) aVar);
            this.a.c = aVar;
        }
    }
}
