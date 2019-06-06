package com.coremedia.iso.boxes.apple;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;

public class AppleDataReferenceBox extends AbstractFullBox {
    public static final String TYPE = "rdrf";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;

    static {
        ajc$preClinit();
    }

    public AppleDataReferenceBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AppleDataReferenceBox.java", AppleDataReferenceBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDataReferenceSize", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "long"), 63);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDataReferenceType", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDataReference", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 71);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.dataReferenceType = aqi.j(byteBuffer);
        this.dataReferenceSize = ces.a(aqi.a(byteBuffer));
        this.dataReference = aqi.a(byteBuffer, this.dataReferenceSize);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(aqh.a(this.dataReferenceType));
        aqk.b(byteBuffer, (long) this.dataReferenceSize);
        byteBuffer.put(aqn.a(this.dataReference));
    }

    public long getContentSize() {
        return (long) (this.dataReferenceSize + 12);
    }

    public String getDataReference() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.dataReference;
    }

    public long getDataReferenceSize() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return (long) this.dataReferenceSize;
    }

    public String getDataReferenceType() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.dataReferenceType;
    }
}
