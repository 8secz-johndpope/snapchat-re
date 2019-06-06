package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class OriginalFormatBox extends AbstractBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "frma";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private String dataFormat = "    ";

    static {
        ajc$preClinit();
    }

    public OriginalFormatBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("OriginalFormatBox.java", OriginalFormatBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"), 47);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 67);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.dataFormat = aqi.j(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(aqh.a(this.dataFormat));
    }

    public long getContentSize() {
        return 4;
    }

    public String getDataFormat() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.dataFormat;
    }

    public void setDataFormat(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.dataFormat = str;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("OriginalFormatBox[dataFormat=");
        stringBuilder.append(getDataFormat());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
