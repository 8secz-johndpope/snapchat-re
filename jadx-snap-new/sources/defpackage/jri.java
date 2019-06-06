package defpackage;

import com.snapchat.android.R;

/* renamed from: jri */
public enum jri implements zlw {
    FRIENDS_FEED_QUICK_ADD_CAROUSEL(R.layout.ff_quick_add_carousel),
    FRIENDS_FEED_QUICK_ADD_CAROUSEL_ITEM(R.layout.ff_quick_add_carousel_item),
    DISCOVER_FEED_QUICK_ADD_CAROUSEL(R.layout.df_quick_add_carousel),
    DISCOVER_FEED_QUICK_ADD_CAROUSEL_ITEM(R.layout.df_quick_add_carousel_item),
    DISCOVER_FEED_QUICK_ADD_CAROUSEL_ITEM_V2(R.layout.df_quick_add_carousel_item_v2),
    QUICK_ADD_LIST_ITEM(R.layout.ff_quick_add_list_item),
    NO_FRIENDS_ITEM(R.layout.added_me_no_friends),
    HEADER_BLUE_LEFT(R.layout.ff_friends_feed_header),
    HEADER_BLACK_LEFT(R.layout.black_header),
    FRIENDS_VIEW_MORE_WHITE_ROUNDED(R.layout.view_more_light_rounded),
    CONTACTS_ON_SNAPCHAT_ITEM(R.layout.quick_add_list_item),
    CONTACTS_NOT_ON_SNAPCHAT_ITEM(R.layout.quick_add_list_item),
    FIND_FRIEND_SPLASH(R.layout.inapp_find_friends_splash),
    SET_PHONE(R.layout.set_phone_view),
    PROFILE_SEARCH_ITEM(R.layout.quick_add_list_item),
    MY_FRIEND_ITEM(R.layout.quick_add_list_item),
    MY_FRIENDS_SUBTEXT(R.layout.my_friends_subtext),
    MY_FRIENDS_VIEW_ALL(R.layout.my_friends_view_all),
    ADD_FRIENDS_TAKE_OVER_ITEM(R.layout.add_friends_takeover_item),
    ANCHOR(R.layout.top_anchor),
    ADD_FRIENDS_EMPTY_STATE(R.layout.add_friends_empty_state),
    PROFILE_MY_FRIENDS_HEADER(R.layout.profile_my_friends_header),
    EMPTY_SECTION(R.layout.empty_section),
    PROFILE_MY_FRIEND_ITEM(R.layout.profile_my_friend_item),
    QUICK_ADD_LIST_ITEM_V2(R.layout.quick_add_list_item),
    ADDED_ME_ITEM_V2(R.layout.added_me_item),
    CAMERA_ROLL_IMAGE(R.layout.camera_roll_image_layout),
    ADD_FRIENDS_BUTTONS_V2(R.layout.add_friends_buttons);
    
    private final int layoutId;

    private jri(int i) {
        this.layoutId = i;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final Class<? extends zmd<?>> getViewBindingClass() {
        switch (jrj.a[ordinal()]) {
            case 1:
                return juz.class;
            case 2:
                return jux.class;
            case 3:
                return juz.class;
            case 4:
                return jux.class;
            case 5:
                return jux.class;
            case 6:
                return jva.class;
            case 7:
                return jua.class;
            case 8:
                return juv.class;
            case 9:
                return juv.class;
            case 10:
                return juw.class;
            case 11:
                return jso.class;
            case 12:
                return jsi.class;
            case 13:
                return jtc.class;
            case 14:
                return jvr.class;
            case 15:
                return jvi.class;
            case 16:
                return jtr.class;
            case 17:
                return jtp.class;
            case 18:
                return juw.class;
            case 19:
                return jsc.class;
            case 20:
                return null;
            case 21:
                return jst.class;
            case 22:
                return jtm.class;
            case 23:
                return null;
            case 24:
                return jtw.class;
            case 25:
                return jva.class;
            case 26:
                return jrt.class;
            case 27:
                return jvu.class;
            case 28:
                return jrq.class;
            default:
                throw new ajxk();
        }
    }
}
