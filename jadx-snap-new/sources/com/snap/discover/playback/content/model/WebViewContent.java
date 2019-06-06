package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.akcr;
import java.util.List;

@Keep
public final class WebViewContent {
    @SerializedName("allow_web_storage")
    private final Boolean allowWebStorage;
    @SerializedName("allowed_webview_macros")
    private final List<String> allowedWebviewMacros;
    @SerializedName("block_webview_preloading")
    private final Boolean blockWebviewPreloading;
    @SerializedName("js_bridge_capabilities")
    private final List<String> jsBridgeCapabilities;
    @SerializedName("sharing_audience")
    private final String sharingAudience;
    @SerializedName("sharing_method")
    private final String sharingMethod;
    @SerializedName("inject_bitmoji_avatar_id")
    private final boolean shouldInjectBitmojiAvatarId;
    @SerializedName("subscription_method")
    private final String subscriptionMethod;
    @SerializedName("url")
    private final String url;
    @SerializedName("webview_background_color")
    private final String webviewBackgroundColor;

    public WebViewContent(List<String> list, String str, String str2, String str3, List<String> list2, Boolean bool, String str4, boolean z, String str5, Boolean bool2) {
        akcr.b(str, "sharingMethod");
        akcr.b(str2, "subscriptionMethod");
        akcr.b(str3, "sharingAudience");
        akcr.b(str4, "url");
        this.allowedWebviewMacros = list;
        this.sharingMethod = str;
        this.subscriptionMethod = str2;
        this.sharingAudience = str3;
        this.jsBridgeCapabilities = list2;
        this.allowWebStorage = bool;
        this.url = str4;
        this.shouldInjectBitmojiAvatarId = z;
        this.webviewBackgroundColor = str5;
        this.blockWebviewPreloading = bool2;
    }

    public static /* synthetic */ WebViewContent copy$default(WebViewContent webViewContent, List list, String str, String str2, String str3, List list2, Boolean bool, String str4, boolean z, String str5, Boolean bool2, int i, Object obj) {
        WebViewContent webViewContent2 = webViewContent;
        int i2 = i;
        return webViewContent.copy((i2 & 1) != 0 ? webViewContent2.allowedWebviewMacros : list, (i2 & 2) != 0 ? webViewContent2.sharingMethod : str, (i2 & 4) != 0 ? webViewContent2.subscriptionMethod : str2, (i2 & 8) != 0 ? webViewContent2.sharingAudience : str3, (i2 & 16) != 0 ? webViewContent2.jsBridgeCapabilities : list2, (i2 & 32) != 0 ? webViewContent2.allowWebStorage : bool, (i2 & 64) != 0 ? webViewContent2.url : str4, (i2 & 128) != 0 ? webViewContent2.shouldInjectBitmojiAvatarId : z, (i2 & 256) != 0 ? webViewContent2.webviewBackgroundColor : str5, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? webViewContent2.blockWebviewPreloading : bool2);
    }

    public final List<String> component1() {
        return this.allowedWebviewMacros;
    }

    public final Boolean component10() {
        return this.blockWebviewPreloading;
    }

    public final String component2() {
        return this.sharingMethod;
    }

    public final String component3() {
        return this.subscriptionMethod;
    }

    public final String component4() {
        return this.sharingAudience;
    }

    public final List<String> component5() {
        return this.jsBridgeCapabilities;
    }

    public final Boolean component6() {
        return this.allowWebStorage;
    }

    public final String component7() {
        return this.url;
    }

    public final boolean component8() {
        return this.shouldInjectBitmojiAvatarId;
    }

    public final String component9() {
        return this.webviewBackgroundColor;
    }

    public final WebViewContent copy(List<String> list, String str, String str2, String str3, List<String> list2, Boolean bool, String str4, boolean z, String str5, Boolean bool2) {
        String str6 = str;
        akcr.b(str, "sharingMethod");
        String str7 = str2;
        akcr.b(str2, "subscriptionMethod");
        String str8 = str3;
        akcr.b(str8, "sharingAudience");
        String str9 = str4;
        akcr.b(str9, "url");
        return new WebViewContent(list, str6, str7, str8, list2, bool, str9, z, str5, bool2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WebViewContent) {
                WebViewContent webViewContent = (WebViewContent) obj;
                if (akcr.a(this.allowedWebviewMacros, webViewContent.allowedWebviewMacros) && akcr.a(this.sharingMethod, webViewContent.sharingMethod) && akcr.a(this.subscriptionMethod, webViewContent.subscriptionMethod) && akcr.a(this.sharingAudience, webViewContent.sharingAudience) && akcr.a(this.jsBridgeCapabilities, webViewContent.jsBridgeCapabilities) && akcr.a(this.allowWebStorage, webViewContent.allowWebStorage) && akcr.a(this.url, webViewContent.url)) {
                    if (!((this.shouldInjectBitmojiAvatarId == webViewContent.shouldInjectBitmojiAvatarId ? 1 : null) != null && akcr.a(this.webviewBackgroundColor, webViewContent.webviewBackgroundColor) && akcr.a(this.blockWebviewPreloading, webViewContent.blockWebviewPreloading))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean getAllowWebStorage() {
        return this.allowWebStorage;
    }

    public final List<String> getAllowedWebviewMacros() {
        return this.allowedWebviewMacros;
    }

    public final Boolean getBlockWebviewPreloading() {
        return this.blockWebviewPreloading;
    }

    public final List<String> getJsBridgeCapabilities() {
        return this.jsBridgeCapabilities;
    }

    public final String getSharingAudience() {
        return this.sharingAudience;
    }

    public final String getSharingMethod() {
        return this.sharingMethod;
    }

    public final boolean getShouldInjectBitmojiAvatarId() {
        return this.shouldInjectBitmojiAvatarId;
    }

    public final String getSubscriptionMethod() {
        return this.subscriptionMethod;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getWebviewBackgroundColor() {
        return this.webviewBackgroundColor;
    }

    public final int hashCode() {
        List list = this.allowedWebviewMacros;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.sharingMethod;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.subscriptionMethod;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.sharingAudience;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list2 = this.jsBridgeCapabilities;
        hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.allowWebStorage;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.url;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        int i2 = this.shouldInjectBitmojiAvatarId;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str = this.webviewBackgroundColor;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        bool = this.blockWebviewPreloading;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WebViewContent(allowedWebviewMacros=");
        stringBuilder.append(this.allowedWebviewMacros);
        stringBuilder.append(", sharingMethod=");
        stringBuilder.append(this.sharingMethod);
        stringBuilder.append(", subscriptionMethod=");
        stringBuilder.append(this.subscriptionMethod);
        stringBuilder.append(", sharingAudience=");
        stringBuilder.append(this.sharingAudience);
        stringBuilder.append(", jsBridgeCapabilities=");
        stringBuilder.append(this.jsBridgeCapabilities);
        stringBuilder.append(", allowWebStorage=");
        stringBuilder.append(this.allowWebStorage);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", shouldInjectBitmojiAvatarId=");
        stringBuilder.append(this.shouldInjectBitmojiAvatarId);
        stringBuilder.append(", webviewBackgroundColor=");
        stringBuilder.append(this.webviewBackgroundColor);
        stringBuilder.append(", blockWebviewPreloading=");
        stringBuilder.append(this.blockWebviewPreloading);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
