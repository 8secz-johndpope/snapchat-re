package defpackage;

import com.snapchat.android.R;

/* renamed from: iky */
public enum iky implements zlw {
    GEO_FILTER_PAGE(R.layout.filter_page_geo, ild.class),
    ANIMATED_GEO_FILTER_PAGE(R.layout.filter_page_geo_animated, ilb.class);
    
    private final int layoutId;
    private final Class<? extends zmd<?>> viewBindingClass;

    private iky(int i, Class<? extends zmd<?>> cls) {
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
