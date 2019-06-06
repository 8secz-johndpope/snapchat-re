package com.snap.composer.context;

import android.content.Context;
import android.view.View;
import com.snap.composer.nodes.ComposerViewNode;

public interface ComposerViewOwner {
    View createViewForClass(Context context, Class<?> cls, ComposerViewNode composerViewNode);

    void onRendered(View view);
}
