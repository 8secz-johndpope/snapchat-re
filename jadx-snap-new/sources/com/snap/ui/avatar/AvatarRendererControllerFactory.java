package com.snap.ui.avatar;

import android.content.res.TypedArray;
import android.util.AttributeSet;

public interface AvatarRendererControllerFactory {
    AvatarRendererController newController(AvatarView avatarView, AttributeSet attributeSet, TypedArray typedArray);
}
