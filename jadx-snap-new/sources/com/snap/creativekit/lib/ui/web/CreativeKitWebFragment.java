package com.snap.creativekit.lib.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.gue;

public final class CreativeKitWebFragment extends MainPageFragment implements gue {
    public CreativeKitWebPresenter a;
    private final ajxe b = ajxh.a(new b(this));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b extends akcs implements akbk<LoadingSpinnerView> {
        private /* synthetic */ CreativeKitWebFragment a;

        b(CreativeKitWebFragment creativeKitWebFragment) {
            this.a = creativeKitWebFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.a.getView();
            return view != null ? (LoadingSpinnerView) view.findViewById(R.id.creative_kit_loading_spinner) : null;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(CreativeKitWebFragment.class), "loadingSpinnerView", "getLoadingSpinnerView()Lcom/snap/ui/view/LoadingSpinnerView;");
        a aVar = new a();
    }

    public final LoadingSpinnerView a() {
        return (LoadingSpinnerView) this.b.b();
    }

    public final String b() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString("attachmentUrl") : null;
    }

    public final Context c() {
        return getActivity();
    }

    public final Boolean d() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("deeplink_uri");
            if (string != null) {
                Object parse = Uri.parse(string);
                akcr.a(parse, "Uri.parse(uri)");
                return Boolean.valueOf(akcr.a((String) parse.getPathSegments().get(0), (Object) "camera"));
            }
        }
        return Boolean.FALSE;
    }

    public final void onAttach(Context context) {
        aipx.a(this);
        CreativeKitWebPresenter creativeKitWebPresenter = this.a;
        if (creativeKitWebPresenter == null) {
            akcr.a("presenter");
        }
        creativeKitWebPresenter.takeTarget((gue) this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.creative_kit_loading, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        CreativeKitWebPresenter creativeKitWebPresenter = this.a;
        if (creativeKitWebPresenter == null) {
            akcr.a("presenter");
        }
        creativeKitWebPresenter.dropTarget();
    }
}
