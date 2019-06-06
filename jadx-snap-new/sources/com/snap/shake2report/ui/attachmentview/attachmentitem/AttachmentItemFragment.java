package com.snap.shake2report.ui.attachmentview.attachmentitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.wwb;
import defpackage.wwc;

public final class AttachmentItemFragment extends MainPageFragment {
    private final wwb a;

    public static final class a implements wwc {
        private final View a;
        private final SnapImageView b;
        private final View c;
        private /* synthetic */ View d;
        private /* synthetic */ SnapImageView e;
        private /* synthetic */ View f;

        a(View view, SnapImageView snapImageView, View view2) {
            this.d = view;
            this.e = snapImageView;
            this.f = view2;
            this.a = view;
            this.b = snapImageView;
            this.c = view2;
        }

        public final View a() {
            return this.a;
        }

        public final SnapImageView b() {
            return this.b;
        }

        public final View c() {
            return this.c;
        }
    }

    public AttachmentItemFragment(wwb wwb) {
        akcr.b(wwb, "attachmentItemPresenter");
        this.a = wwb;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.s2r_attachment_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.s2r_attachment_fragment_image);
        if (findViewById != null) {
            SnapImageView snapImageView = (SnapImageView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.s2r_attachment_fragment_footer);
            if (findViewById2 != null) {
                this.a.takeTarget(new a(inflate, snapImageView, findViewById2));
                return inflate;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.View");
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.imageloading.view.SnapImageView");
    }
}
