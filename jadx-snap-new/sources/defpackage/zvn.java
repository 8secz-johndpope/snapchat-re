package defpackage;

import com.snapchat.android.R;

/* renamed from: zvn */
public enum zvn implements zlw {
    VENUE_FILTER_PAGE(zvo.class);
    
    private final int layoutId;
    private final Class<? extends zmd<?>> viewBindingClass;

    private zvn(int i) {
        this.layoutId = R.layout.filter_page_venue;
        this.viewBindingClass = i;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final Class<? extends zmd<?>> getViewBindingClass() {
        return this.viewBindingClass;
    }
}
