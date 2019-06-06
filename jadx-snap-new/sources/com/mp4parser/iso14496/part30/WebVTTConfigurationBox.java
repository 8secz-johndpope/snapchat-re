package com.mp4parser.iso14496.part30;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class WebVTTConfigurationBox extends AbstractBox {
    public static final String TYPE = "vttC";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    String config;

    static {
        ajc$preClinit();
    }

    public WebVTTConfigurationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("WebVTTConfigurationBox.java", WebVTTConfigurationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "", "", "", "java.lang.String"), 36);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setConfig", "com.mp4parser.iso14496.part30.WebVTTConfigurationBox", "java.lang.String", "config", "", "void"), 40);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.config = aqi.a(byteBuffer, byteBuffer.remaining());
    }

    public String getConfig() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.config;
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(aqn.a(this.config));
    }

    public long getContentSize() {
        return (long) aqn.b(this.config);
    }

    public void setConfig(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.config = str;
    }
}
