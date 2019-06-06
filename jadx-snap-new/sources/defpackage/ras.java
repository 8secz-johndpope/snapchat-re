package defpackage;

import com.snapchat.android.R;

/* renamed from: ras */
public enum ras implements zlw {
    ANCHOR(R.layout.ff_top_anchor),
    BOTTOM_PADDING(R.layout.ff_friends_bottom_padding),
    LOADING(R.layout.ff_friends_loading),
    MULTI_RECIPIENT_LIST_ITEM(R.layout.ff_friend_multi_recipient_item),
    FEED_LIST_ITEM(R.layout.ff_friends_item),
    FEED_LIST_ITEM_SDL(0),
    TOP_PROMPT(R.layout.ff_top_prompt_item),
    FOOTER(R.layout.ff_friends_footer),
    ADD_FRIENDS_BUTTONS(R.layout.identity_add_friends_buttons);
    
    private final int layoutId;

    private ras(int i) {
        this.layoutId = i;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final Class<? extends zmd<? extends zmy>> getViewBindingClass() {
        switch (rat.a[ordinal()]) {
            case 1:
                return rdk.class;
            case 2:
                return rdj.class;
            case 3:
                return rdq.class;
            case 4:
                return rds.class;
            case 5:
                return rdp.class;
            case 6:
                return jrq.class;
            case 7:
            case 8:
            case 9:
                return null;
            default:
                throw new ajxk();
        }
    }
}
