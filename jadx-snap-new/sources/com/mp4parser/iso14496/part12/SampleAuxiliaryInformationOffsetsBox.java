package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;

public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox {
    public static final String TYPE = "saio";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private long[] offsets = new long[0];

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationOffsetsBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SampleAuxiliaryInformationOffsetsBox.java", SampleAuxiliaryInformationOffsetsBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 107);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoType", "", "void"), 111);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 115);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 119);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "[J"), 123);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "[J", "offsets", "", "void"), 127);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = aqi.j(byteBuffer);
            this.auxInfoTypeParameter = aqi.j(byteBuffer);
        }
        int a = ces.a(aqi.a(byteBuffer));
        this.offsets = new long[a];
        for (int i = 0; i < a; i++) {
            if (getVersion() == 0) {
                this.offsets[i] = aqi.a(byteBuffer);
            } else {
                this.offsets[i] = aqi.e(byteBuffer);
            }
        }
    }

    public String getAuxInfoType() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.auxInfoTypeParameter;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(aqh.a(this.auxInfoType));
            byteBuffer.put(aqh.a(this.auxInfoTypeParameter));
        }
        aqk.b(byteBuffer, (long) this.offsets.length);
        for (long valueOf : this.offsets) {
            Long valueOf2 = Long.valueOf(valueOf);
            if (getVersion() == 0) {
                aqk.b(byteBuffer, valueOf2.longValue());
            } else {
                aqk.a(byteBuffer, valueOf2.longValue());
            }
        }
    }

    public long getContentSize() {
        int i = 8;
        int length = (getVersion() == 0 ? this.offsets.length * 4 : this.offsets.length * 8) + 8;
        if ((getFlags() & 1) != 1) {
            i = 0;
        }
        return (long) (length + i);
    }

    public long[] getOffsets() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.offsets;
    }

    public void setAuxInfoType(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.auxInfoTypeParameter = str;
    }

    public void setOffsets(long[] jArr) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, (Object) jArr));
        this.offsets = jArr;
    }
}
