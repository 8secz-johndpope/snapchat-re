package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.opencv.imgproc.Imgproc;

public class SegmentTypeBox extends AbstractBox {
    public static final String TYPE = "styp";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private List<String> compatibleBrands = Collections.emptyList();
    private String majorBrand;
    private long minorVersion;

    static {
        ajc$preClinit();
    }

    public SegmentTypeBox() {
        super(TYPE);
    }

    public SegmentTypeBox(String str, long j, List<String> list) {
        super(TYPE);
        this.majorBrand = str;
        this.minorVersion = j;
        this.compatibleBrands = list;
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SegmentTypeBox.java", SegmentTypeBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.lang.String"), 85);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "long", "minorVersion", "", "void"), 103);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "long"), 113);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.util.List"), (int) Imgproc.COLOR_YUV2BGRA_YVYU);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.majorBrand = aqi.j(byteBuffer);
        this.minorVersion = aqi.a(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.compatibleBrands.add(aqi.j(byteBuffer));
        }
    }

    public List<String> getCompatibleBrands() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.compatibleBrands;
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(aqh.a(this.majorBrand));
        aqk.b(byteBuffer, this.minorVersion);
        for (String a : this.compatibleBrands) {
            byteBuffer.put(aqh.a(a));
        }
    }

    public long getContentSize() {
        return (long) ((this.compatibleBrands.size() << 2) + 8);
    }

    public String getMajorBrand() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.majorBrand;
    }

    public long getMinorVersion() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.minorVersion;
    }

    public void setCompatibleBrands(List<String> list) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, (Object) list));
        this.compatibleBrands = list;
    }

    public void setMajorBrand(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.majorBrand = str;
    }

    public void setMinorVersion(long j) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, akoc.a(j)));
        this.minorVersion = j;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SegmentTypeBox[");
        stringBuilder.append("majorBrand=");
        stringBuilder.append(getMajorBrand());
        String str = ";";
        stringBuilder.append(str);
        stringBuilder.append("minorVersion=");
        stringBuilder.append(getMinorVersion());
        for (String str2 : this.compatibleBrands) {
            stringBuilder.append(str);
            stringBuilder.append("compatibleBrand=");
            stringBuilder.append(str2);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
