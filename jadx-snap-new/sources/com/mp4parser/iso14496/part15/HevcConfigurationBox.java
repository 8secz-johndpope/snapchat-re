package com.mp4parser.iso14496.part15;

import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.cgr;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.opencv.imgproc.Imgproc;

public class HevcConfigurationBox extends AbstractBox {
    public static final String TYPE = "hvcC";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_10 = null;
    private static final /* synthetic */ a ajc$tjp_11 = null;
    private static final /* synthetic */ a ajc$tjp_12 = null;
    private static final /* synthetic */ a ajc$tjp_13 = null;
    private static final /* synthetic */ a ajc$tjp_14 = null;
    private static final /* synthetic */ a ajc$tjp_15 = null;
    private static final /* synthetic */ a ajc$tjp_16 = null;
    private static final /* synthetic */ a ajc$tjp_17 = null;
    private static final /* synthetic */ a ajc$tjp_18 = null;
    private static final /* synthetic */ a ajc$tjp_19 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_20 = null;
    private static final /* synthetic */ a ajc$tjp_21 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    private cgr hevcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public HevcConfigurationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("HevcConfigurationBox.java", HevcConfigurationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord"), 36);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord", "hevcDecoderConfigurationRecord", "", "void"), 40);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGeneral_level_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 88);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMin_spatial_segmentation_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 92);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getParallelismType", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 96);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getChromaFormat", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 100);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 104);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 108);
        ajc$tjp_16 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAvgFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 112);
        ajc$tjp_17 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getNumTemporalLayers", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 116);
        ajc$tjp_18 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 120);
        ajc$tjp_19 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isTemporalIdNested", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", Event.BOOLEAN), 124);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "equals", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "java.lang.Object", "o", "", Event.BOOLEAN), 45);
        ajc$tjp_20 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getConstantFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 128);
        ajc$tjp_21 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getArrays", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "java.util.List"), (int) Imgproc.COLOR_BGR2YUV_YV12);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hashCode", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 58);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getConfigurationVersion", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 63);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGeneral_profile_space", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 67);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "isGeneral_tier_flag", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", Event.BOOLEAN), 71);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGeneral_profile_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 76);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGeneral_profile_compatibility_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "long"), 80);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGeneral_constraint_indicator_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "long"), 84);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.hevcDecoderConfigurationRecord = new cgr();
        cgr cgr = this.hevcDecoderConfigurationRecord;
        cgr.a = aqi.a(byteBuffer.get());
        int a = aqi.a(byteBuffer.get());
        cgr.b = (a & 192) >> 6;
        cgr.c = (a & 32) > 0;
        cgr.d = a & 31;
        cgr.e = aqi.a(byteBuffer);
        cgr.f = aqi.k(byteBuffer);
        cgr.x = ((cgr.f >> 44) & 8) > 0;
        cgr.y = ((cgr.f >> 44) & 4) > 0;
        cgr.z = ((cgr.f >> 44) & 2) > 0;
        cgr.A = ((cgr.f >> 44) & 1) > 0;
        cgr.f &= 140737488355327L;
        cgr.g = aqi.a(byteBuffer.get());
        a = aqi.c(byteBuffer);
        cgr.h = (61440 & a) >> 12;
        cgr.i = a & 4095;
        a = aqi.a(byteBuffer.get());
        cgr.j = (a & 252) >> 2;
        cgr.k = a & 3;
        a = aqi.a(byteBuffer.get());
        cgr.l = (a & 252) >> 2;
        cgr.m = a & 3;
        a = aqi.a(byteBuffer.get());
        cgr.n = (a & 248) >> 3;
        cgr.o = a & 7;
        a = aqi.a(byteBuffer.get());
        cgr.p = (a & 248) >> 3;
        cgr.q = a & 7;
        cgr.r = aqi.c(byteBuffer);
        a = aqi.a(byteBuffer.get());
        cgr.s = (a & 192) >> 6;
        cgr.t = (a & 56) >> 3;
        cgr.u = (a & 4) > 0;
        cgr.v = a & 3;
        a = aqi.a(byteBuffer.get());
        cgr.w = new ArrayList();
        for (int i = 0; i < a; i++) {
            cgr.a aVar = new cgr.a();
            int a2 = aqi.a(byteBuffer.get());
            aVar.a = (a2 & 128) > 0;
            aVar.b = (a2 & 64) > 0;
            aVar.c = a2 & 63;
            a2 = aqi.c(byteBuffer);
            aVar.d = new ArrayList();
            for (int i2 = 0; i2 < a2; i2++) {
                byte[] bArr = new byte[aqi.c(byteBuffer)];
                byteBuffer.get(bArr);
                aVar.d.add(bArr);
            }
            cgr.w.add(aVar);
        }
    }

    public boolean equals(Object obj) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HevcConfigurationBox hevcConfigurationBox = (HevcConfigurationBox) obj;
        cgr cgr = this.hevcDecoderConfigurationRecord;
        return cgr == null ? hevcConfigurationBox.hevcDecoderConfigurationRecord == null : cgr.equals(hevcConfigurationBox.hevcDecoderConfigurationRecord);
    }

    public List<cgr.a> getArrays() {
        cdb.a(akoe.a(ajc$tjp_21, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.w;
    }

    public int getAvgFrameRate() {
        cdb.a(akoe.a(ajc$tjp_16, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.r;
    }

    public int getBitDepthChromaMinus8() {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.q;
    }

    public int getBitDepthLumaMinus8() {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.o;
    }

    public int getChromaFormat() {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.m;
    }

    public int getConfigurationVersion() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.a;
    }

    public int getConstantFrameRate() {
        cdb.a(akoe.a(ajc$tjp_20, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.s;
    }

    public void getContent(ByteBuffer byteBuffer) {
        cgr cgr = this.hevcDecoderConfigurationRecord;
        aqk.c(byteBuffer, cgr.a);
        aqk.c(byteBuffer, ((cgr.b << 6) + (cgr.c ? 32 : 0)) + cgr.d);
        aqk.b(byteBuffer, cgr.e);
        long j = cgr.f;
        if (cgr.x) {
            j |= 140737488355328L;
        }
        if (cgr.y) {
            j |= 70368744177664L;
        }
        if (cgr.z) {
            j |= 35184372088832L;
        }
        if (cgr.A) {
            j |= 17592186044416L;
        }
        aqk.c(byteBuffer, j);
        aqk.c(byteBuffer, cgr.g);
        aqk.b(byteBuffer, (cgr.h << 12) + cgr.i);
        aqk.c(byteBuffer, (cgr.j << 2) + cgr.k);
        aqk.c(byteBuffer, (cgr.l << 2) + cgr.m);
        aqk.c(byteBuffer, (cgr.n << 3) + cgr.o);
        aqk.c(byteBuffer, (cgr.p << 3) + cgr.q);
        aqk.b(byteBuffer, cgr.r);
        aqk.c(byteBuffer, (((cgr.s << 6) + (cgr.t << 3)) + (cgr.u ? 4 : 0)) + cgr.v);
        aqk.c(byteBuffer, cgr.w.size());
        for (cgr.a aVar : cgr.w) {
            aqk.c(byteBuffer, ((aVar.a ? 128 : 0) + (aVar.b ? 64 : 0)) + aVar.c);
            aqk.b(byteBuffer, aVar.d.size());
            for (byte[] bArr : aVar.d) {
                aqk.b(byteBuffer, bArr.length);
                byteBuffer.put(bArr);
            }
        }
    }

    public long getContentSize() {
        int i = 23;
        for (cgr.a aVar : this.hevcDecoderConfigurationRecord.w) {
            i += 3;
            for (byte[] length : aVar.d) {
                i = (i + 2) + length.length;
            }
        }
        return (long) i;
    }

    public long getGeneral_constraint_indicator_flags() {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.f;
    }

    public int getGeneral_level_idc() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.g;
    }

    public long getGeneral_profile_compatibility_flags() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.e;
    }

    public int getGeneral_profile_idc() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.d;
    }

    public int getGeneral_profile_space() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.b;
    }

    public cgr getHevcDecoderConfigurationRecord() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord;
    }

    public int getLengthSizeMinusOne() {
        cdb.a(akoe.a(ajc$tjp_18, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.v;
    }

    public int getMin_spatial_segmentation_idc() {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.i;
    }

    public int getNumTemporalLayers() {
        cdb.a(akoe.a(ajc$tjp_17, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.t;
    }

    public int getParallelismType() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.k;
    }

    public int hashCode() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        cgr cgr = this.hevcDecoderConfigurationRecord;
        return cgr != null ? cgr.hashCode() : 0;
    }

    public boolean isGeneral_tier_flag() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.c;
    }

    public boolean isTemporalIdNested() {
        cdb.a(akoe.a(ajc$tjp_19, (Object) this, (Object) this));
        return this.hevcDecoderConfigurationRecord.u;
    }

    public void setHevcDecoderConfigurationRecord(cgr cgr) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) cgr));
        this.hevcDecoderConfigurationRecord = cgr;
    }
}
