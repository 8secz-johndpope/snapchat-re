package com.googlecode.mp4parser.boxes.basemediaformat;

import com.googlecode.mp4parser.AbstractBox;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqg;
import defpackage.cdb;
import defpackage.cgq;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class AvcNalUnitStorageBox extends AbstractBox {
    public static final String TYPE = "avcn";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    cgq avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public AvcNalUnitStorageBox() {
        super(TYPE);
    }

    public AvcNalUnitStorageBox(AvcConfigurationBox avcConfigurationBox) {
        super(TYPE);
        this.avcDecoderConfigurationRecord = avcConfigurationBox.getavcDecoderConfigurationRecord();
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AvcNalUnitStorageBox.java", AvcNalUnitStorageBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAvcDecoderConfigurationRecord", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 44);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLengthSizeMinusOne", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "int"), 49);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 53);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 57);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSequenceParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 61);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSequenceParameterSetExtsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 65);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPictureParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 69);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.lang.String"), 89);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new cgq(byteBuffer);
    }

    public cgq getAvcDecoderConfigurationRecord() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord;
    }

    public void getContent(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord.a(byteBuffer);
    }

    public long getContentSize() {
        return this.avcDecoderConfigurationRecord.a();
    }

    public int getLengthSizeMinusOne() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.e;
    }

    public String[] getPPS() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.b();
    }

    public List<String> getPictureParameterSetsAsStrings() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.e();
    }

    public String[] getSPS() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.c();
    }

    public List<String> getSequenceParameterSetExtsAsStrings() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        cgq cgq = this.avcDecoderConfigurationRecord;
        ArrayList arrayList = new ArrayList(cgq.l.size());
        for (byte[] a : cgq.l) {
            arrayList.add(aqg.a(a));
        }
        return arrayList;
    }

    public List<String> getSequenceParameterSetsAsStrings() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.avcDecoderConfigurationRecord.d();
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("AvcNalUnitStorageBox{SPS=");
        stringBuilder.append(this.avcDecoderConfigurationRecord.d());
        stringBuilder.append(",PPS=");
        stringBuilder.append(this.avcDecoderConfigurationRecord.e());
        stringBuilder.append(",lengthSize=");
        stringBuilder.append(this.avcDecoderConfigurationRecord.e + 1);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
