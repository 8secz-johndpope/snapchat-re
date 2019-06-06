package com.coremedia.iso.boxes.vodafone;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class CoverUriBox extends AbstractFullBox {
    public static final String TYPE = "cvru";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private String coverUri;

    static {
        ajc$preClinit();
    }

    public CoverUriBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("CoverUriBox.java", CoverUriBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "java.lang.String", "coverUri", "", "void"), 42);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 64);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.coverUri = aqi.d(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(aqn.a(this.coverUri));
        byteBuffer.put((byte) 0);
    }

    public long getContentSize() {
        return (long) (aqn.b(this.coverUri) + 5);
    }

    public String getCoverUri() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.coverUri;
    }

    public void setCoverUri(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.coverUri = str;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("CoverUriBox[coverUri=");
        stringBuilder.append(getCoverUri());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
