package com.snap.identity.ui.settings.customemojis;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.jna;

public final class SettingsCustomizeEmojisFragment extends BaseIdentitySettingsFragment implements jna {
    public SettingsCustomizeEmojisPresenter a;
    private RecyclerView b;

    public final RecyclerView a() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            akcr.a("emojiPickerView");
        }
        return recyclerView;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter = this.a;
        if (settingsCustomizeEmojisPresenter == null) {
            akcr.a("presenter");
        }
        settingsCustomizeEmojisPresenter.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_custom_emojis_main, viewGroup, false);
    }

    public final void onDetach() {
        SettingsCustomizeEmojisPresenter settingsCustomizeEmojisPresenter = this.a;
        if (settingsCustomizeEmojisPresenter == null) {
            akcr.a("presenter");
        }
        settingsCustomizeEmojisPresenter.dropTarget();
        super.onDetach();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.friendmoji_item_view);
        akcr.a(findViewById, "it.findViewById(R.id.friendmoji_item_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        akcr.b(recyclerView, "<set-?>");
        this.b = recyclerView;
    }
}
