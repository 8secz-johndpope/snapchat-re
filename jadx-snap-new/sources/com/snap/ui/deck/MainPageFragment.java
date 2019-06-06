package com.snap.ui.deck;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import defpackage.achi;
import defpackage.acih;
import defpackage.akcr;
import defpackage.icz;
import defpackage.zgm;
import defpackage.zjk;
import defpackage.zjl;
import defpackage.zjm;
import defpackage.zjr;

public class MainPageFragment extends ScopedMainPageFragment {
    public zjr U;
    private final String a;

    static final class a implements Runnable {
        private /* synthetic */ zjr a;

        a(zjr zjr) {
            this.a = zjr;
        }

        public final void run() {
            zjr zjr = this.a;
            zgm zgm = zjr.a;
            if (zgm != null) {
                zgm.a();
            }
            zgm = null;
            zjr.a = null;
            zjr.c = Long.valueOf(zjr.f.a());
            int contains = zjr.h.contains(zjr.d) ^ 1;
            if (contains != 0) {
                zjr.h.add(zjr.d);
            }
            Long l = zjr.c;
            if (l != null) {
                zgm = Long.valueOf(l.longValue() - zjr.b);
            }
            if (zgm != null) {
                ((icz) zjr.e.get()).a(((Number) zgm).longValue(), zjr.d, contains, zjr.g);
            }
        }
    }

    public MainPageFragment() {
        Object simpleName = getClass().getSimpleName();
        akcr.a(simpleName, "javaClass.simpleName");
        this.a = simpleName;
    }

    public void a(achi<zjm, zjk> achi, defpackage.acix.a aVar) {
        akcr.b(achi, "navigationEvent");
        akcr.b(aVar, "pageStateTransition");
        int i = zjl.a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                b((achi) achi);
            }
            return;
        }
        a_(achi);
    }

    public void a(acih acih) {
    }

    public void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        this.U = null;
        super.b(achi);
    }

    public void b(acih acih) {
        akcr.b(acih, "payload");
    }

    public void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public void d(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public Context getContext() {
        Context context = super.getContext();
        if (context == null) {
            akcr.a();
        }
        return context;
    }

    public void n_() {
    }

    public boolean o_() {
        return false;
    }

    public void onPause() {
        this.U = null;
        super.onPause();
    }

    public void p_() {
    }

    public void q_() {
    }

    public void s_() {
    }

    public final void w() {
        zjr zjr = this.U;
        if (zjr != null) {
            View view = getView();
            if (view != null) {
                Handler handler = view.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new a(zjr));
                }
            }
        }
        this.U = null;
    }
}
