package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: ddy */
public final class ddy implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "BITMOJI_EDIT_AVATAR_WEB_BUILDER_ANDROID";
            builder.put(ddx.WEB_BUILDER_OVERRIDES_BITMOJI_APP, new hxh(str, "web_overrides_native", true));
            builder.put(ddx.EDIT_AVATAR_WEB_BUILDER, new hxh(str, "should_use_web_builder", true));
            String str2 = "min_webview_version";
            builder.put(ddx.EDIT_MIN_WEBVIEW_VERSION, new hxh(str, str2, true));
            str = "BITMOJI_CREATE_AVATAR_ANDROID";
            builder.put(ddx.CREATE_AVATAR_BUILDER_TYPE, new hxh(str, "avatar_builder_type", true));
            builder.put(ddx.CREATE_MIN_WEBVIEW_VERSION, new hxh(str, str2, true));
            str = "BITMOJI_CHANGE_OUTFIT_WEB_BUILDER_MUSHROOM";
            builder.put(ddx.CHANGE_OUTFIT_IN_SNAPCHAT, new hxh(str, "enabled", true));
            builder.put(ddx.CHANGE_OUTFIT_MIN_WEBVIEW_VERSION, new hxh(str, str2, true));
            builder.put(ddx.MDP_MROOM_BITMOJI_NON_USER_SCOPE_ENABLED, new hxh("MDP_MROOM_BITMOJI_NON_USER_SCOPE", "ENABLED", true));
            str = "BITMOJI_VIDEO_STREAMING_ANDROID";
            builder.put(ddx.STREAMING_PROTOCOL, new hxh(str, "protocol", true));
            builder.put(ddx.STREAMING_VIDEO_URL_OVERRIDE, new hxh(str, "url", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
