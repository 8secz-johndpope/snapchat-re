package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class SchemeTypeBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "schm";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    String schemeType = "    ";
    String schemeUri = null;
    long schemeVersion;

    static {
        ajc$preClinit();
    }

    public SchemeTypeBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SchemeTypeBox.java", SchemeTypeBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "long"), 48);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"), 56);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "int", "schemeVersion", "", "void"), 61);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"), 65);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeType = aqi.j(byteBuffer);
        this.schemeVersion = aqi.a(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.schemeUri = aqi.d(byteBuffer);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(aqh.a(this.schemeType));
        aqk.b(byteBuffer, this.schemeVersion);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(aqn.a(this.schemeUri));
        }
    }

    public long getContentSize() {
        return (long) (((getFlags() & 1) == 1 ? aqn.b(this.schemeUri) + 1 : 0) + 12);
    }

    public String getSchemeType() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.schemeType;
    }

    public String getSchemeUri() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.schemeUri;
    }

    public long getSchemeVersion() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.schemeVersion;
    }

    public void setSchemeType(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.schemeType = str;
    }

    public void setSchemeUri(String str) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, (Object) str));
        this.schemeUri = str;
    }

    public void setSchemeVersion(int i) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, Integer.valueOf(i)));
        this.schemeVersion = (long) i;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Schema Type Box[");
        stringBuilder.append("schemeUri=");
        stringBuilder.append(this.schemeUri);
        String str = "; ";
        stringBuilder.append(str);
        stringBuilder.append("schemeType=");
        stringBuilder.append(this.schemeType);
        stringBuilder.append(str);
        stringBuilder.append("schemeVersion=");
        stringBuilder.append(this.schemeVersion);
        stringBuilder.append(str);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
