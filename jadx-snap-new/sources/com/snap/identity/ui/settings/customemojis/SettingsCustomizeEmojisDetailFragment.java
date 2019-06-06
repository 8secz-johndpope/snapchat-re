package com.snap.identity.ui.settings.customemojis;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.ui.view.emoji.SnapEmojiTextView;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajwl;
import defpackage.akcr;
import defpackage.jmh;
import defpackage.jmz;

public final class SettingsCustomizeEmojisDetailFragment extends BaseIdentitySettingsFragment implements jmz {
    public SettingsCustomizeEmojisDetailPresenter a;
    public String b;
    public String c;
    public String d;
    public String e;
    final ajwl<jmh> f;
    private SnapEmojiTextView j;
    private RecyclerView k;

    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    static {
        b bVar = new b();
    }

    public SettingsCustomizeEmojisDetailFragment() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.f = ajwl;
    }

    public final SnapEmojiTextView a() {
        SnapEmojiTextView snapEmojiTextView = this.j;
        if (snapEmojiTextView == null) {
            akcr.a("headerTextView");
        }
        return snapEmojiTextView;
    }

    public final RecyclerView b() {
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            akcr.a("emojiDetailPickerView");
        }
        return recyclerView;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        SettingsCustomizeEmojisDetailPresenter settingsCustomizeEmojisDetailPresenter = this.a;
        String str = "presenter";
        if (settingsCustomizeEmojisDetailPresenter == null) {
            akcr.a(str);
        }
        String str2 = this.b;
        if (str2 == null) {
            akcr.a("selectedEmojiCategory");
        }
        akcr.b(str2, "emojiCategory");
        settingsCustomizeEmojisDetailPresenter.c = str2;
        settingsCustomizeEmojisDetailPresenter = this.a;
        if (settingsCustomizeEmojisDetailPresenter == null) {
            akcr.a(str);
        }
        str2 = this.d;
        if (str2 == null) {
            akcr.a("selectedEmojiUnicode");
        }
        akcr.b(str2, "selectedEmoji");
        settingsCustomizeEmojisDetailPresenter.e = str2;
        settingsCustomizeEmojisDetailPresenter = this.a;
        if (settingsCustomizeEmojisDetailPresenter == null) {
            akcr.a(str);
        }
        str2 = this.e;
        if (str2 == null) {
            akcr.a("defaultEmojiUnicode");
        }
        akcr.b(str2, "emojiUnicode");
        settingsCustomizeEmojisDetailPresenter.f = str2;
        settingsCustomizeEmojisDetailPresenter = this.a;
        if (settingsCustomizeEmojisDetailPresenter == null) {
            akcr.a(str);
        }
        settingsCustomizeEmojisDetailPresenter.d = this.c;
        settingsCustomizeEmojisDetailPresenter = this.a;
        if (settingsCustomizeEmojisDetailPresenter == null) {
            akcr.a(str);
        }
        ajwl ajwl = this.f;
        akcr.b(ajwl, "updateDataSubject");
        settingsCustomizeEmojisDetailPresenter.b = ajwl;
        settingsCustomizeEmojisDetailPresenter = this.a;
        if (settingsCustomizeEmojisDetailPresenter == null) {
            akcr.a(str);
        }
        settingsCustomizeEmojisDetailPresenter.takeTarget((jmz) this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_custom_emojis_detail, viewGroup, false);
    }

    public final void onDetach() {
        SettingsCustomizeEmojisDetailPresenter settingsCustomizeEmojisDetailPresenter = this.a;
        if (settingsCustomizeEmojisDetailPresenter == null) {
            akcr.a("presenter");
        }
        settingsCustomizeEmojisDetailPresenter.dropTarget();
        super.onDetach();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.friendmoji_picker_view);
        akcr.a(findViewById, "it.findViewById(R.id.friendmoji_picker_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        String str = "<set-?>";
        akcr.b(recyclerView, str);
        this.k = recyclerView;
        Object findViewById2 = view.findViewById(R.id.friendmoji_picker_title);
        akcr.a(findViewById2, "it.findViewById(R.id.friendmoji_picker_title)");
        SnapEmojiTextView snapEmojiTextView = (SnapEmojiTextView) findViewById2;
        akcr.b(snapEmojiTextView, str);
        this.j = snapEmojiTextView;
    }
}
