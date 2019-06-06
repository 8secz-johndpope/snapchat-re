package com.snap.composer.yoga;

import android.view.View;
import com.facebook.yoga.YogaNode;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.nodes.ComposerViewNode;
import defpackage.akcr;

public final class YogaUtils {
    public static final YogaUtils INSTANCE = new YogaUtils();

    private YogaUtils() {
    }

    public final YogaNode findYogaNode(View view) {
        akcr.b(view, "view");
        ComposerViewNode findViewNode = ViewUtils.INSTANCE.findViewNode(view);
        return findViewNode != null ? findViewNode.getYogaNode() : null;
    }
}
