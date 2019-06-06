package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ced;
import defpackage.ces;
import defpackage.cfa;
import java.nio.ByteBuffer;
import java.util.UUID;

public class UuidBasedProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    public static byte[] USER_TYPE = new byte[]{(byte) -48, (byte) -118, (byte) 79, (byte) 24, (byte) 16, (byte) -13, (byte) 74, (byte) -126, (byte) -74, (byte) -56, (byte) 50, (byte) -40, (byte) -85, (byte) -95, (byte) -125, (byte) -45};
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    ced protectionSpecificHeader;
    UUID systemId;

    static {
        ajc$preClinit();
    }

    public UuidBasedProtectionSystemSpecificHeaderBox() {
        super("uuid", USER_TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("UuidBasedProtectionSystemSpecificHeaderBox.java", UuidBasedProtectionSystemSpecificHeaderBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.util.UUID"), 67);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "java.util.UUID", "systemId", "", "void"), 71);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSystemIdString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 75);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader"), 79);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getProtectionSpecificHeaderString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader", "protectionSpecificHeader", "", "void"), 87);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 92);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.systemId = cfa.a(bArr);
        ces.a(aqi.a(byteBuffer));
        this.protectionSpecificHeader = ced.a(this.systemId, byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.a(byteBuffer, this.systemId.getMostSignificantBits());
        aqk.a(byteBuffer, this.systemId.getLeastSignificantBits());
        ByteBuffer a = this.protectionSpecificHeader.a();
        a.rewind();
        aqk.b(byteBuffer, (long) a.limit());
        byteBuffer.put(a);
    }

    public long getContentSize() {
        return (long) (this.protectionSpecificHeader.a().limit() + 24);
    }

    public ced getProtectionSpecificHeader() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.protectionSpecificHeader;
    }

    public String getProtectionSpecificHeaderString() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.protectionSpecificHeader.toString();
    }

    public UUID getSystemId() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.systemId;
    }

    public String getSystemIdString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.systemId.toString();
    }

    public byte[] getUserType() {
        return USER_TYPE;
    }

    public void setProtectionSpecificHeader(ced ced) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, (Object) ced));
        this.protectionSpecificHeader = ced;
    }

    public void setSystemId(UUID uuid) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) uuid));
        this.systemId = uuid;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UuidBasedProtectionSystemSpecificHeaderBox");
        stringBuilder.append("{systemId=");
        stringBuilder.append(this.systemId.toString());
        stringBuilder.append(", dataSize=");
        stringBuilder.append(this.protectionSpecificHeader.a().limit());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
