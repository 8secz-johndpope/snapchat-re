package defpackage;

import com.snapchat.android.R;

/* renamed from: tto */
public enum tto implements zlw {
    STACKED_FILTERS_PAGE(R.layout.filter_page_visual, tua.class),
    VISUAL_FILTER_PAGE(R.layout.filter_page_visual, tuc.class),
    MOTION_FILTER_PAGE(R.layout.filter_page_motion, ttz.class),
    LENSES_FILTER_PAGE(R.layout.filter_page_lens, ttx.class),
    STREAK_FILTER_PAGE(R.layout.filter_page_streak, tub.class),
    ENABLE_LOCATION_FILTER_PAGE(R.layout.enable_location_filter_view, ttw.class);
    
    private final int layoutId;
    private final Class<? extends zmd<?>> viewBindingClass;

    private tto(int i, Class<? extends zmd<?>> cls) {
        this.layoutId = i;
        this.viewBindingClass = cls;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final Class<? extends zmd<?>> getViewBindingClass() {
        return this.viewBindingClass;
    }
}
