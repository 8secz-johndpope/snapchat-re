package com.brightcove.player.util;

public class LayoutUtil {
    public static String getSpecMode(int i) {
        return i != Integer.MIN_VALUE ? i != 0 ? i != AudioPlayer.INFINITY_LOOP_COUNT ? null : "MeasureSpec.EXACTLY" : "MeasureSpec.UNSPECIFIED" : "MeasureSpec.AT_MOST";
    }
}
