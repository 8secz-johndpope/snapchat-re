package com.snap.ui.tileactionmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.actionmenu.ActionMenuOptionsContainerView;
import defpackage.akcr;

public final class TileActionMenuView extends FrameLayout {
    private SnapImageView a;
    private ActionMenuOptionsContainerView b;

    public TileActionMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private TileActionMenuView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final SnapImageView a() {
        SnapImageView snapImageView = this.a;
        if (snapImageView == null) {
            akcr.a("thumbnailView");
        }
        return snapImageView;
    }

    public final ActionMenuOptionsContainerView b() {
        ActionMenuOptionsContainerView actionMenuOptionsContainerView = this.b;
        if (actionMenuOptionsContainerView == null) {
            akcr.a("optionsView");
        }
        return actionMenuOptionsContainerView;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.tile_action_menu_thumbnail);
        akcr.a(findViewById, "findViewById(R.id.tile_action_menu_thumbnail)");
        this.a = (SnapImageView) findViewById;
        findViewById = findViewById(R.id.tile_action_menu_options);
        akcr.a(findViewById, "findViewById(R.id.tile_action_menu_options)");
        this.b = (ActionMenuOptionsContainerView) findViewById;
    }
}
