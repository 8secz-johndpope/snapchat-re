package defpackage;

import android.graphics.Rect;
import defpackage.acix.a;

/* renamed from: zja */
public abstract class zja implements acgx, zjk {
    private final ajei a;
    private final zjm b;
    private acgv<zjm> c;
    private final zkq d;

    /* renamed from: zja$a */
    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ zja a;

        a(zja zja) {
            this.a = zja;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            this.a.getContentView().setPadding(0, rect.top, 0, rect.bottom);
        }
    }

    public zja(zjm zjm, acgv<zjm> acgv, zkq zkq) {
        akcr.b(zjm, "deckPageType");
        this.b = zjm;
        this.c = acgv;
        this.d = zkq;
        this.a = new ajei();
    }

    public /* synthetic */ zja(zjm zjm, acgv acgv, zkq zkq, int i, akco akco) {
        if ((i & 4) != 0) {
            zkq = null;
        }
        this(zjm, acgv, zkq);
    }

    public zjm getDeckPageType() {
        return this.b;
    }

    public final ajei getDisposable() {
        return this.a;
    }

    public acgv<zjm> getNavigationActionSpec() {
        return this.c;
    }

    public void onNewPayload(acih acih) {
        akcr.b(acih, "payload");
    }

    public void onPageAdded() {
        zkq zkq = this.d;
        if (zkq != null) {
            ajej f = zkq.a().f((ajfb) new a(this));
            akcr.a((Object) f, "it.windowRectObservable.…ect.bottom)\n            }");
            ajvv.a(f, this.a);
        }
    }

    public boolean onPageBackPressed() {
        return false;
    }

    public void onPageHidden(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public void onPageNavigate(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public void onPageNavigateUnsuccessful(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public void onPagePartialVisibilityChanged(achi<zjm, zjk> achi, a aVar) {
        akcr.b(achi, "navigationEvent");
        akcr.b(aVar, "pageStateTransition");
        int i = zjb.a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                onPageHidden(achi);
            }
            return;
        }
        onPageVisible(achi);
    }

    public void onPageRemoved() {
        this.a.a();
    }

    public void onPageStacked() {
    }

    public void onPageUnstacked() {
    }

    public void onPageVisible(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public void setNavigationActionSpec(acgv<zjm> acgv) {
        this.c = acgv;
    }

    public <R> R traceRenderingEvent(String str, akbk<? extends R> akbk) {
        akcr.b(str, "name");
        akcr.b(akbk, "section");
        return zjk.a.a(this, str, akbk);
    }
}
