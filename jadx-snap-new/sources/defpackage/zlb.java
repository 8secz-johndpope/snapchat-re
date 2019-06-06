package defpackage;

import org.greenrobot.eventbus.ThreadMode;

/* renamed from: zlb */
public final class zlb {
    final ajwo<zlf> a;
    public zlc b;
    public achb<zjm, zjk> c;
    public ajei d = new ajei();

    /* renamed from: zlb$a */
    static final class a<T> implements ajfb<zlf> {
        private /* synthetic */ zlb a;

        a(zlb zlb) {
            this.a = zlb;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.a((zlf) obj);
        }
    }

    public zlb() {
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<UiMutationEvent>()");
        this.a = ajwo;
    }

    public final void a(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        if (this.d.isDisposed()) {
            this.d = new ajei();
        }
        this.b = new zlc();
        zlc zlc = this.b;
        String str = "navSubscriber";
        if (zlc == null) {
            akcr.a(str);
        }
        zlc.a.f((ajfb) new a(this));
        this.c = achb;
        achb achb2 = this.c;
        if (achb2 != null) {
            zlc = this.b;
            if (zlc == null) {
                akcr.a(str);
            }
            achb2.a((achk) zlc);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onStateChange(zlf zlf) {
        akcr.b(zlf, "event");
        this.a.a((Object) zlf);
    }
}
