package com.googlecode.mp4parser.boxes.threegpp26244;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.cdj;
import defpackage.cdk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.opencv.imgproc.Imgproc;

public class SegmentIndexBox extends AbstractFullBox {
    public static final String TYPE = "sidx";
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_10 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_11 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_12 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_2 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_3 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_4 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_5 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_6 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_7 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_8 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_9 = null;
    long earliestPresentationTime;
    List<a> entries = new ArrayList();
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    public static class a {
        byte a;
        int b;
        long c;
        byte d;
        byte e;
        int f;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.f == aVar.f && this.e == aVar.e && this.d == aVar.d && this.c == aVar.c;
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            long j = this.c;
            return ((((((i + ((int) (j ^ (j >>> 32)))) * 31) + this.d) * 31) + this.e) * 31) + this.f;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{referenceType=");
            stringBuilder.append(this.a);
            stringBuilder.append(", referencedSize=");
            stringBuilder.append(this.b);
            stringBuilder.append(", subsegmentDuration=");
            stringBuilder.append(this.c);
            stringBuilder.append(", startsWithSap=");
            stringBuilder.append(this.d);
            stringBuilder.append(", sapType=");
            stringBuilder.append(this.e);
            stringBuilder.append(", sapDeltaTime=");
            stringBuilder.append(this.f);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public SegmentIndexBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SegmentIndexBox.java", SegmentIndexBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.util.List"), 128);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "java.util.List", "entries", "", "void"), (int) Imgproc.COLOR_BGR2YUV_YV12);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "int"), 168);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "int", "reserved", "", "void"), 172);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.lang.String"), 298);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 136);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "referenceId", "", "void"), 140);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 144);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "timeScale", "", "void"), 148);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 152);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "earliestPresentationTime", "", "void"), 156);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 160);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "firstOffset", "", "void"), 164);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        long a;
        parseVersionAndFlags(byteBuffer);
        this.referenceId = aqi.a(byteBuffer);
        this.timeScale = aqi.a(byteBuffer);
        if (getVersion() == 0) {
            this.earliestPresentationTime = aqi.a(byteBuffer);
            a = aqi.a(byteBuffer);
        } else {
            this.earliestPresentationTime = aqi.e(byteBuffer);
            a = aqi.e(byteBuffer);
        }
        this.firstOffset = a;
        this.reserved = aqi.c(byteBuffer);
        int c = aqi.c(byteBuffer);
        for (int i = 0; i < c; i++) {
            cdj cdj = new cdj(byteBuffer);
            a aVar = new a();
            aVar.a = (byte) cdj.a(1);
            aVar.b = cdj.a(31);
            aVar.c = aqi.a(byteBuffer);
            cdj = new cdj(byteBuffer);
            aVar.d = (byte) cdj.a(1);
            aVar.e = (byte) cdj.a(3);
            aVar.f = cdj.a(28);
            this.entries.add(aVar);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.referenceId);
        aqk.b(byteBuffer, this.timeScale);
        if (getVersion() == 0) {
            aqk.b(byteBuffer, this.earliestPresentationTime);
            aqk.b(byteBuffer, this.firstOffset);
        } else {
            aqk.a(byteBuffer, this.earliestPresentationTime);
            aqk.a(byteBuffer, this.firstOffset);
        }
        aqk.b(byteBuffer, this.reserved);
        aqk.b(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            cdk cdk = new cdk(byteBuffer);
            cdk.a(aVar.a, 1);
            cdk.a(aVar.b, 31);
            aqk.b(byteBuffer, aVar.c);
            cdk = new cdk(byteBuffer);
            cdk.a(aVar.d, 1);
            cdk.a(aVar.e, 3);
            cdk.a(aVar.f, 28);
        }
    }

    public long getContentSize() {
        return (((((long) (getVersion() == 0 ? 8 : 16)) + 12) + 2) + 2) + ((long) (this.entries.size() * 12));
    }

    public long getEarliestPresentationTime() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.earliestPresentationTime;
    }

    public List<a> getEntries() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public long getFirstOffset() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.firstOffset;
    }

    public long getReferenceId() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.referenceId;
    }

    public int getReserved() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.reserved;
    }

    public long getTimeScale() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.timeScale;
    }

    public void setEarliestPresentationTime(long j) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, akoc.a(j)));
        this.earliestPresentationTime = j;
    }

    public void setEntries(List<a> list) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setFirstOffset(long j) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, akoc.a(j)));
        this.firstOffset = j;
    }

    public void setReferenceId(long j) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, akoc.a(j)));
        this.referenceId = j;
    }

    public void setReserved(int i) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, Integer.valueOf(i)));
        this.reserved = i;
    }

    public void setTimeScale(long j) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, akoc.a(j)));
        this.timeScale = j;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SegmentIndexBox{entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append(", referenceId=");
        stringBuilder.append(this.referenceId);
        stringBuilder.append(", timeScale=");
        stringBuilder.append(this.timeScale);
        stringBuilder.append(", earliestPresentationTime=");
        stringBuilder.append(this.earliestPresentationTime);
        stringBuilder.append(", firstOffset=");
        stringBuilder.append(this.firstOffset);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.reserved);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
