package com.snap.discover.playback.content.model;

import android.support.annotation.Keep;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.akco;
import defpackage.akcr;
import org.opencv.imgproc.Imgproc;

@Keep
public final class ItemContent {
    private final AdToLensContent adToLensContent;
    private final AppInstallContent appInstallContent;
    private final CameraAttachmentContent cameraAttachmentContent;
    private final CommerceContent commerceContent;
    private final DeepLinkContent deepLinkContent;
    private final LocalWebContent localWebContent;
    private final OverlayContent overlay;
    private final SnapContent snapContent;
    private final SubscriptionContent subscription;
    private final String type;
    private final VideoViewContent videoViewContent;
    private final WebViewContent webViewContent;

    public ItemContent(String str, WebViewContent webViewContent, SnapContent snapContent, VideoViewContent videoViewContent, SubscriptionContent subscriptionContent, OverlayContent overlayContent, CommerceContent commerceContent, LocalWebContent localWebContent, AppInstallContent appInstallContent, DeepLinkContent deepLinkContent, AdToLensContent adToLensContent, CameraAttachmentContent cameraAttachmentContent) {
        akcr.b(str, "type");
        this.type = str;
        this.webViewContent = webViewContent;
        this.snapContent = snapContent;
        this.videoViewContent = videoViewContent;
        this.subscription = subscriptionContent;
        this.overlay = overlayContent;
        this.commerceContent = commerceContent;
        this.localWebContent = localWebContent;
        this.appInstallContent = appInstallContent;
        this.deepLinkContent = deepLinkContent;
        this.adToLensContent = adToLensContent;
        this.cameraAttachmentContent = cameraAttachmentContent;
    }

    public /* synthetic */ ItemContent(String str, WebViewContent webViewContent, SnapContent snapContent, VideoViewContent videoViewContent, SubscriptionContent subscriptionContent, OverlayContent overlayContent, CommerceContent commerceContent, LocalWebContent localWebContent, AppInstallContent appInstallContent, DeepLinkContent deepLinkContent, AdToLensContent adToLensContent, CameraAttachmentContent cameraAttachmentContent, int i, akco akco) {
        int i2 = i;
        CameraAttachmentContent cameraAttachmentContent2 = null;
        WebViewContent webViewContent2 = (i2 & 2) != 0 ? null : webViewContent;
        SnapContent snapContent2 = (i2 & 4) != 0 ? null : snapContent;
        VideoViewContent videoViewContent2 = (i2 & 8) != 0 ? null : videoViewContent;
        SubscriptionContent subscriptionContent2 = (i2 & 16) != 0 ? null : subscriptionContent;
        OverlayContent overlayContent2 = (i2 & 32) != 0 ? null : overlayContent;
        CommerceContent commerceContent2 = (i2 & 64) != 0 ? null : commerceContent;
        LocalWebContent localWebContent2 = (i2 & 128) != 0 ? null : localWebContent;
        AppInstallContent appInstallContent2 = (i2 & 256) != 0 ? null : appInstallContent;
        DeepLinkContent deepLinkContent2 = (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? null : deepLinkContent;
        AdToLensContent adToLensContent2 = (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? null : adToLensContent;
        if ((i2 & ItemAnimator.FLAG_MOVED) == 0) {
            cameraAttachmentContent2 = cameraAttachmentContent;
        }
        this(str, webViewContent2, snapContent2, videoViewContent2, subscriptionContent2, overlayContent2, commerceContent2, localWebContent2, appInstallContent2, deepLinkContent2, adToLensContent2, cameraAttachmentContent2);
    }

    public static /* synthetic */ ItemContent copy$default(ItemContent itemContent, String str, WebViewContent webViewContent, SnapContent snapContent, VideoViewContent videoViewContent, SubscriptionContent subscriptionContent, OverlayContent overlayContent, CommerceContent commerceContent, LocalWebContent localWebContent, AppInstallContent appInstallContent, DeepLinkContent deepLinkContent, AdToLensContent adToLensContent, CameraAttachmentContent cameraAttachmentContent, int i, Object obj) {
        ItemContent itemContent2 = itemContent;
        int i2 = i;
        return itemContent.copy((i2 & 1) != 0 ? itemContent2.type : str, (i2 & 2) != 0 ? itemContent2.webViewContent : webViewContent, (i2 & 4) != 0 ? itemContent2.snapContent : snapContent, (i2 & 8) != 0 ? itemContent2.videoViewContent : videoViewContent, (i2 & 16) != 0 ? itemContent2.subscription : subscriptionContent, (i2 & 32) != 0 ? itemContent2.overlay : overlayContent, (i2 & 64) != 0 ? itemContent2.commerceContent : commerceContent, (i2 & 128) != 0 ? itemContent2.localWebContent : localWebContent, (i2 & 256) != 0 ? itemContent2.appInstallContent : appInstallContent, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? itemContent2.deepLinkContent : deepLinkContent, (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? itemContent2.adToLensContent : adToLensContent, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? itemContent2.cameraAttachmentContent : cameraAttachmentContent);
    }

    public final String component1() {
        return this.type;
    }

    public final DeepLinkContent component10() {
        return this.deepLinkContent;
    }

    public final AdToLensContent component11() {
        return this.adToLensContent;
    }

    public final CameraAttachmentContent component12() {
        return this.cameraAttachmentContent;
    }

    public final WebViewContent component2() {
        return this.webViewContent;
    }

    public final SnapContent component3() {
        return this.snapContent;
    }

    public final VideoViewContent component4() {
        return this.videoViewContent;
    }

    public final SubscriptionContent component5() {
        return this.subscription;
    }

    public final OverlayContent component6() {
        return this.overlay;
    }

    public final CommerceContent component7() {
        return this.commerceContent;
    }

    public final LocalWebContent component8() {
        return this.localWebContent;
    }

    public final AppInstallContent component9() {
        return this.appInstallContent;
    }

    public final ItemContent copy(String str, WebViewContent webViewContent, SnapContent snapContent, VideoViewContent videoViewContent, SubscriptionContent subscriptionContent, OverlayContent overlayContent, CommerceContent commerceContent, LocalWebContent localWebContent, AppInstallContent appInstallContent, DeepLinkContent deepLinkContent, AdToLensContent adToLensContent, CameraAttachmentContent cameraAttachmentContent) {
        String str2 = str;
        akcr.b(str, "type");
        return new ItemContent(str2, webViewContent, snapContent, videoViewContent, subscriptionContent, overlayContent, commerceContent, localWebContent, appInstallContent, deepLinkContent, adToLensContent, cameraAttachmentContent);
    }

    /* JADX WARNING: Missing block: B:26:0x007e, code skipped:
            if (defpackage.akcr.a(r2.cameraAttachmentContent, r3.cameraAttachmentContent) != false) goto L_0x0083;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0083;
    L_0x0002:
        r0 = r3 instanceof com.snap.discover.playback.content.model.ItemContent;
        if (r0 == 0) goto L_0x0081;
    L_0x0006:
        r3 = (com.snap.discover.playback.content.model.ItemContent) r3;
        r0 = r2.type;
        r1 = r3.type;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x0012:
        r0 = r2.webViewContent;
        r1 = r3.webViewContent;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x001c:
        r0 = r2.snapContent;
        r1 = r3.snapContent;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x0026:
        r0 = r2.videoViewContent;
        r1 = r3.videoViewContent;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x0030:
        r0 = r2.subscription;
        r1 = r3.subscription;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x003a:
        r0 = r2.overlay;
        r1 = r3.overlay;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x0044:
        r0 = r2.commerceContent;
        r1 = r3.commerceContent;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x004e:
        r0 = r2.localWebContent;
        r1 = r3.localWebContent;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x0058:
        r0 = r2.appInstallContent;
        r1 = r3.appInstallContent;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x0062:
        r0 = r2.deepLinkContent;
        r1 = r3.deepLinkContent;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x006c:
        r0 = r2.adToLensContent;
        r1 = r3.adToLensContent;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0081;
    L_0x0076:
        r0 = r2.cameraAttachmentContent;
        r3 = r3.cameraAttachmentContent;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0081;
    L_0x0080:
        goto L_0x0083;
    L_0x0081:
        r3 = 0;
        return r3;
    L_0x0083:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.model.ItemContent.equals(java.lang.Object):boolean");
    }

    public final AdToLensContent getAdToLensContent() {
        return this.adToLensContent;
    }

    public final AppInstallContent getAppInstallContent() {
        return this.appInstallContent;
    }

    public final CameraAttachmentContent getCameraAttachmentContent() {
        return this.cameraAttachmentContent;
    }

    public final CommerceContent getCommerceContent() {
        return this.commerceContent;
    }

    public final DeepLinkContent getDeepLinkContent() {
        return this.deepLinkContent;
    }

    public final LocalWebContent getLocalWebContent() {
        return this.localWebContent;
    }

    public final OverlayContent getOverlay() {
        return this.overlay;
    }

    public final SnapContent getSnapContent() {
        return this.snapContent;
    }

    public final SubscriptionContent getSubscription() {
        return this.subscription;
    }

    public final String getType() {
        return this.type;
    }

    public final VideoViewContent getVideoViewContent() {
        return this.videoViewContent;
    }

    public final WebViewContent getWebViewContent() {
        return this.webViewContent;
    }

    public final int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        WebViewContent webViewContent = this.webViewContent;
        hashCode = (hashCode + (webViewContent != null ? webViewContent.hashCode() : 0)) * 31;
        SnapContent snapContent = this.snapContent;
        hashCode = (hashCode + (snapContent != null ? snapContent.hashCode() : 0)) * 31;
        VideoViewContent videoViewContent = this.videoViewContent;
        hashCode = (hashCode + (videoViewContent != null ? videoViewContent.hashCode() : 0)) * 31;
        SubscriptionContent subscriptionContent = this.subscription;
        hashCode = (hashCode + (subscriptionContent != null ? subscriptionContent.hashCode() : 0)) * 31;
        OverlayContent overlayContent = this.overlay;
        hashCode = (hashCode + (overlayContent != null ? overlayContent.hashCode() : 0)) * 31;
        CommerceContent commerceContent = this.commerceContent;
        hashCode = (hashCode + (commerceContent != null ? commerceContent.hashCode() : 0)) * 31;
        LocalWebContent localWebContent = this.localWebContent;
        hashCode = (hashCode + (localWebContent != null ? localWebContent.hashCode() : 0)) * 31;
        AppInstallContent appInstallContent = this.appInstallContent;
        hashCode = (hashCode + (appInstallContent != null ? appInstallContent.hashCode() : 0)) * 31;
        DeepLinkContent deepLinkContent = this.deepLinkContent;
        hashCode = (hashCode + (deepLinkContent != null ? deepLinkContent.hashCode() : 0)) * 31;
        AdToLensContent adToLensContent = this.adToLensContent;
        hashCode = (hashCode + (adToLensContent != null ? adToLensContent.hashCode() : 0)) * 31;
        CameraAttachmentContent cameraAttachmentContent = this.cameraAttachmentContent;
        if (cameraAttachmentContent != null) {
            i = cameraAttachmentContent.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ItemContent(type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", webViewContent=");
        stringBuilder.append(this.webViewContent);
        stringBuilder.append(", snapContent=");
        stringBuilder.append(this.snapContent);
        stringBuilder.append(", videoViewContent=");
        stringBuilder.append(this.videoViewContent);
        stringBuilder.append(", subscription=");
        stringBuilder.append(this.subscription);
        stringBuilder.append(", overlay=");
        stringBuilder.append(this.overlay);
        stringBuilder.append(", commerceContent=");
        stringBuilder.append(this.commerceContent);
        stringBuilder.append(", localWebContent=");
        stringBuilder.append(this.localWebContent);
        stringBuilder.append(", appInstallContent=");
        stringBuilder.append(this.appInstallContent);
        stringBuilder.append(", deepLinkContent=");
        stringBuilder.append(this.deepLinkContent);
        stringBuilder.append(", adToLensContent=");
        stringBuilder.append(this.adToLensContent);
        stringBuilder.append(", cameraAttachmentContent=");
        stringBuilder.append(this.cameraAttachmentContent);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
