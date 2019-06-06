package com.mp4parser.iso14496.part30;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class WebVTTSourceLabelBox extends AbstractBox {
    public static final String TYPE = "vlab";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    String sourceLabel;

    static {
        ajc$preClinit();
    }

    public WebVTTSourceLabelBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("WebVTTSourceLabelBox.java", WebVTTSourceLabelBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSourceLabel", "com.mp4parser.iso14496.part30.WebVTTSourceLabelBox", "", "", "", "java.lang.String"), 37);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSourceLabel", "com.mp4parser.iso14496.part30.WebVTTSourceLabelBox", "java.lang.String", "sourceLabel", "", "void"), 41);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.sourceLabel = aqi.a(byteBuffer, byteBuffer.remaining());
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(aqn.a(this.sourceLabel));
    }

    public long getContentSize() {
        return (long) aqn.b(this.sourceLabel);
    }

    public String getSourceLabel() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.sourceLabel;
    }

    public void setSourceLabel(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.sourceLabel = str;
    }
}
