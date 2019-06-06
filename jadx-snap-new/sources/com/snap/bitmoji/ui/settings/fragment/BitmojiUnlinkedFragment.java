package com.snap.bitmoji.ui.settings.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snap.bitmoji.ui.settings.presenter.BitmojiUnlinkedPresenter;
import com.snap.bitmoji.ui.settings.view.CreateBitmojiButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.aipx;
import defpackage.ajdj;
import defpackage.ajdn;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.ddv;
import defpackage.dfo;
import defpackage.dfp;
import defpackage.dfp.o;
import defpackage.dfp.p;
import defpackage.dfp.q;
import defpackage.dfp.r;
import defpackage.dhp;
import defpackage.zkq;
import java.io.Serializable;
import java.util.concurrent.Callable;

public final class BitmojiUnlinkedFragment extends MainPageFragment implements dhp {
    public BitmojiUnlinkedPresenter a;
    public zkq b;
    public dfp c;
    private View d;
    private final ajei e = new ajei();

    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ View a;
        private /* synthetic */ View b;

        a(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), rect.top, this.a.getPaddingRight(), this.a.getPaddingBottom());
            view = this.b;
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = rect.bottom;
            view.setLayoutParams(layoutParams);
        }
    }

    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                View findViewById = this.a.findViewById(R.id.bitmoji_unlink_alert);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.view.View");
            }
        }
    }

    public final CreateBitmojiButton a() {
        View view = this.d;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_unlinked_button);
        akcr.a(findViewById, "layout.findViewById(R.id.bitmoji_unlinked_button)");
        return (CreateBitmojiButton) findViewById;
    }

    public final aaua b() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("SourcePageType") : null;
        if (serializable != null) {
            return (aaua) serializable;
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.analytics.types.PageType");
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        BitmojiUnlinkedPresenter bitmojiUnlinkedPresenter = this.a;
        if (bitmojiUnlinkedPresenter == null) {
            akcr.a("presenter");
        }
        bitmojiUnlinkedPresenter.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bitmoji_v3_unlinked_fragment, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.e.a();
    }

    public final void onDetach() {
        BitmojiUnlinkedPresenter bitmojiUnlinkedPresenter = this.a;
        if (bitmojiUnlinkedPresenter == null) {
            akcr.a("presenter");
        }
        bitmojiUnlinkedPresenter.dropTarget();
        super.onDetach();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        aaua b;
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.bitmoji_unlinked_page);
        akcr.a(findViewById, "view.findViewById(R.id.bitmoji_unlinked_page)");
        this.d = findViewById;
        findViewById = view.findViewById(R.id.navbar_inset);
        akcr.a(findViewById, "view.findViewById(R.id.navbar_inset)");
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zkq.a().f((ajfb) new a(view, findViewById)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        dfp dfp = this.c;
        if (dfp == null) {
            akcr.a("avatarBuilderGateway");
        }
        if (b() != null) {
            b = b();
            if (b == null) {
                akcr.a();
            }
        } else {
            b = aaua.EXTERNAL;
        }
        akcr.b(b, "source");
        findViewById = ajdj.a((Callable) new o(dfp)).b((ajdn) ajdj.a((Callable) new p(dfp))).b((ajdn) ajdj.a((Callable) new q(dfp, defpackage.dgc.a.a(dfp.a(b, dfo.CREATE))))).d(ddv.WEB_BUILDER).f(r.a);
        akcr.a(findViewById, "Maybe.defer{ selectBitmo…BUILDER\n                }");
        ajej e = findViewById.e((ajfb) new b(view));
        akcr.a((Object) e, "avatarBuilderGateway.isC…      }\n                }");
        ajvv.a(e, this.e);
    }
}
