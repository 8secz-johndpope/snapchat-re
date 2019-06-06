package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;
import org.opencv.imgproc.Imgproc;

public class AssetInformationBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "ainf";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    String apid = "";
    String profileVersion = "0000";

    static {
        ajc$preClinit();
    }

    public AssetInformationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AssetInformationBox.java", AssetInformationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), (int) Imgproc.COLOR_RGB2YUV_YV12);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "apid", "", "void"), 135);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), (int) Imgproc.COLOR_COLORCVT_MAX);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"), 143);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.profileVersion = aqi.a(byteBuffer, 4);
        this.apid = aqi.d(byteBuffer);
    }

    public String getApid() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.apid;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 0) {
            byteBuffer.put(aqn.a(this.profileVersion), 0, 4);
            byteBuffer.put(aqn.a(this.apid));
            byteBuffer.put((byte) 0);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Unknown ainf version ");
        stringBuilder.append(getVersion());
        throw new RuntimeException(stringBuilder.toString());
    }

    public long getContentSize() {
        return (long) (aqn.b(this.apid) + 9);
    }

    public String getProfileVersion() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.profileVersion;
    }

    public boolean isHidden() {
        return (getFlags() & 1) == 1;
    }

    public void setApid(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.apid = str;
    }

    public void setHidden(boolean z) {
        int flags = getFlags();
        if ((isHidden() ^ z) != 0) {
            if (z) {
                setFlags(flags | 1);
                return;
            }
            setFlags(16777214 & flags);
        }
    }

    public void setProfileVersion(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.profileVersion = str;
    }
}
