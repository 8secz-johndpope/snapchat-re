package com.coremedia.iso.boxes.vodafone;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class ContentDistributorIdBox extends AbstractFullBox {
    public static final String TYPE = "cdis";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private String contentDistributorId;
    private String language;

    static {
        ajc$preClinit();
    }

    public ContentDistributorIdBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("ContentDistributorIdBox.java", ContentDistributorIdBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLanguage", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getContentDistributorId", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 68);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = aqi.i(byteBuffer);
        this.contentDistributorId = aqi.d(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.a(byteBuffer, this.language);
        byteBuffer.put(aqn.a(this.contentDistributorId));
        byteBuffer.put((byte) 0);
    }

    public String getContentDistributorId() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.contentDistributorId;
    }

    public long getContentSize() {
        return (long) ((aqn.b(this.contentDistributorId) + 2) + 5);
    }

    public String getLanguage() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("ContentDistributorIdBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";contentDistributorId=");
        stringBuilder.append(getContentDistributorId());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
