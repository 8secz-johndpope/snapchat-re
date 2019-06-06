package com.snap.contextcards.lib;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.fuv;
import defpackage.fuw;
import defpackage.fva;
import defpackage.fvb;
import defpackage.fvg;
import defpackage.fvg.d;
import defpackage.fvu;
import defpackage.gvp;
import defpackage.std;
import defpackage.zfw;
import defpackage.zgb;
import java.io.Serializable;

public final class ContextCardsStandAloneFragment extends MainPageFragment implements fva {
    public fuv a;
    public fuw b;
    public zgb c;
    private ajei d = new ajei();
    private View e;
    private LinearLayout f;
    private String g;
    private final ajxe h = ajxh.a(new c(this));

    static final class a<T> implements ajfb<fvb> {
        private /* synthetic */ ContextCardsStandAloneFragment a;

        a(ContextCardsStandAloneFragment contextCardsStandAloneFragment) {
            this.a = contextCardsStandAloneFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            fvb fvb = (fvb) obj;
            fuw a = this.a.a();
            akcr.a((Object) fvb, "it");
            a.a(fvb);
        }
    }

    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ ContextCardsStandAloneFragment a;

        b(ContextCardsStandAloneFragment contextCardsStandAloneFragment) {
            this.a = contextCardsStandAloneFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a().d();
        }
    }

    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ ContextCardsStandAloneFragment a;

        c(ContextCardsStandAloneFragment contextCardsStandAloneFragment) {
            this.a = contextCardsStandAloneFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.a.c == null) {
                akcr.a("schedulersProvider");
            }
            return zgb.a(fvu.a.callsite("context-cards"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ContextCardsStandAloneFragment.class), "scheduler", "getScheduler()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    private final zfw b() {
        return (zfw) this.h.b();
    }

    private final void h() {
        fvg fvg = new fvg();
        String str = this.g;
        if (str == null) {
            akcr.a("venueId");
        }
        fvg.e = new d("dummySnapId", str, null, null, null, null, null, null, null, null, 2044);
        fuw fuw = this.b;
        if (fuw == null) {
            akcr.a("contextCardsViewBinding");
        }
        fuw.a(null);
        fuv fuv = this.a;
        if (fuv == null) {
            akcr.a("contextCardsNetworkManager");
        }
        Object a = fuv.b(fvg).a((ajdw) b().l()).a((ajfb) new a(this), (ajfb) new b(this));
        akcr.a(a, "contextCardsNetworkManag…orCardsModel()\n        })");
        std.a(a, this.d);
    }

    public final Uri a(Uri uri, gvp gvp) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(gvp, "deepLinkUriMatcher");
        return uri;
    }

    public final fuw a() {
        fuw fuw = this.b;
        if (fuw == null) {
            akcr.a("contextCardsViewBinding");
        }
        return fuw;
    }

    public final void a(String str, String str2) {
    }

    public final void c() {
    }

    public final void g() {
        super.o_();
    }

    public final void i() {
        h();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        fuw fuw = this.b;
        if (fuw == null) {
            akcr.a("contextCardsViewBinding");
        }
        fuw.a(context, this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.context_card_fragment, viewGroup, false);
        akcr.a(inflate, "view");
        this.e = inflate;
        Object findViewById = inflate.findViewById(R.id.cards_container);
        akcr.a(findViewById, "view.findViewById(R.id.cards_container)");
        this.f = (LinearLayout) findViewById;
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            akcr.a("cardsContainer");
        }
        fuw fuw = this.b;
        if (fuw == null) {
            akcr.a("contextCardsViewBinding");
        }
        linearLayout.addView(fuw.b());
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("VENUE_ID_KEY");
            if (serializable != null) {
                this.g = (String) serializable;
            } else {
                throw new ajxt("null cannot be cast to non-null type kotlin.String");
            }
        }
        h();
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        fuw fuw = this.b;
        if (fuw == null) {
            akcr.a("contextCardsViewBinding");
        }
        fuw.c();
        this.d.dispose();
        this.d = new ajei();
    }

    public final void z_() {
    }
}
