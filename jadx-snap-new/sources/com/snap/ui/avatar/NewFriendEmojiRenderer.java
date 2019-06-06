package com.snap.ui.avatar;

import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.abpz;
import defpackage.abqi;
import defpackage.akcr;

public final class NewFriendEmojiRenderer {
    private TextView newFriendEmojiView;
    private final AvatarView parentView;

    public NewFriendEmojiRenderer(AvatarView avatarView) {
        akcr.b(avatarView, "parentView");
        this.parentView = avatarView;
    }

    public final void hide() {
        TextView textView = this.newFriendEmojiView;
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    public final void show() {
        TextView textView = this.newFriendEmojiView;
        if (textView == null) {
            textView = new TextView(this.parentView.getContext());
            textView.setId(R.id.avatar_new_friend);
            textView.setGravity(17);
            textView.setLayoutParams(new LayoutParams(-1, -1));
            textView.setTextSize(0, this.parentView.getResources().getDimension(R.dimen.text_size_small_medium));
            textView.setText(abqi.a(abpz.WAVING_HAND));
            this.parentView.addView(textView);
            this.newFriendEmojiView = textView;
        }
        textView.setVisibility(0);
    }
}
