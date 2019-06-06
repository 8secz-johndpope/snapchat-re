package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: clb */
public enum clb {
    TOP_SNAP_ONLY("416a461c-f182-4f10-900e-f6e18ac21e1c"),
    REMOTE_WEBVIEW("f4e63f22-7c3c-4797-8095-18290e020c65"),
    LONGFORM_VIDEO("cbbcafc9-8d97-4c1e-ba04-4716c8dadadb"),
    APP_INSTALL("bca3b14f-8d0a-420a-b3cb-419829c313c2"),
    DEEP_LINK("3a2cdec1-c33a-4674-acb6-95c882173c94"),
    NO_FILL("xxxx-xxxxx-xxxxx-xxxxx"),
    NOT_APPLICABLE("");
    
    public final String adId;

    private clb(String str) {
        akcr.b(str, Event.AD_ID);
        this.adId = str;
    }
}
