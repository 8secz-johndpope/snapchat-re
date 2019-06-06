package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqj;
import defpackage.aqk;
import defpackage.aql;
import defpackage.cdb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrackFragmentRandomAccessBox extends AbstractFullBox {
    public static final String TYPE = "tfra";
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
    private List<a> entries = Collections.emptyList();
    private int lengthSizeOfSampleNum = 2;
    private int lengthSizeOfTrafNum = 2;
    private int lengthSizeOfTrunNum = 2;
    private int reserved;
    private long trackId;

    public static class a {
        long a;
        long b;
        long c;
        long d;
        long e;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.e == aVar.e && this.a == aVar.a && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            j2 = this.c;
            i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            j2 = this.d;
            i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            j2 = this.e;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{time=");
            stringBuilder.append(this.a);
            stringBuilder.append(", moofOffset=");
            stringBuilder.append(this.b);
            stringBuilder.append(", trafNumber=");
            stringBuilder.append(this.c);
            stringBuilder.append(", trunNumber=");
            stringBuilder.append(this.d);
            stringBuilder.append(", sampleNumber=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackFragmentRandomAccessBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TrackFragmentRandomAccessBox.java", TrackFragmentRandomAccessBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"), 145);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 149);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 185);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), 189);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 153);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 157);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 161);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 165);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 169);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 173);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 177);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 181);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = aqi.a(byteBuffer);
        long a = aqi.a(byteBuffer);
        this.reserved = (int) (a >> 6);
        this.lengthSizeOfTrafNum = (((int) (63 & a)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int) (12 & a)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int) (a & 3)) + 1;
        a = aqi.a(byteBuffer);
        this.entries = new ArrayList();
        for (int i = 0; ((long) i) < a; i++) {
            long e;
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.a = aqi.e(byteBuffer);
                e = aqi.e(byteBuffer);
            } else {
                aVar.a = aqi.a(byteBuffer);
                e = aqi.a(byteBuffer);
            }
            aVar.b = e;
            aVar.c = aqj.a(byteBuffer, this.lengthSizeOfTrafNum);
            aVar.d = aqj.a(byteBuffer, this.lengthSizeOfTrunNum);
            aVar.e = aqj.a(byteBuffer, this.lengthSizeOfSampleNum);
            this.entries.add(aVar);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.trackId);
        aqk.b(byteBuffer, ((((long) (this.reserved << 6)) | ((long) (((this.lengthSizeOfTrafNum - 1) & 3) << 4))) | ((long) (((this.lengthSizeOfTrunNum - 1) & 3) << 2))) | ((long) ((this.lengthSizeOfSampleNum - 1) & 3)));
        aqk.b(byteBuffer, (long) this.entries.size());
        for (a aVar : this.entries) {
            if (getVersion() == 1) {
                aqk.a(byteBuffer, aVar.a);
                aqk.a(byteBuffer, aVar.b);
            } else {
                aqk.b(byteBuffer, aVar.a);
                aqk.b(byteBuffer, aVar.b);
            }
            aql.a(aVar.c, byteBuffer, this.lengthSizeOfTrafNum);
            aql.a(aVar.d, byteBuffer, this.lengthSizeOfTrunNum);
            aql.a(aVar.e, byteBuffer, this.lengthSizeOfSampleNum);
        }
    }

    public long getContentSize() {
        return (((((long) (getVersion() == 1 ? this.entries.size() * 16 : this.entries.size() * 8)) + 16) + ((long) (this.lengthSizeOfTrafNum * this.entries.size()))) + ((long) (this.lengthSizeOfTrunNum * this.entries.size()))) + ((long) (this.lengthSizeOfSampleNum * this.entries.size()));
    }

    public List<a> getEntries() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return Collections.unmodifiableList(this.entries);
    }

    public int getLengthSizeOfSampleNum() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        return this.lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries() {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this));
        return (long) this.entries.size();
    }

    public int getReserved() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.reserved;
    }

    public long getTrackId() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.trackId;
    }

    public void setEntries(List<a> list) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setLengthSizeOfSampleNum(int i) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, Integer.valueOf(i)));
        this.lengthSizeOfSampleNum = i;
    }

    public void setLengthSizeOfTrafNum(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.lengthSizeOfTrafNum = i;
    }

    public void setLengthSizeOfTrunNum(int i) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, Integer.valueOf(i)));
        this.lengthSizeOfTrunNum = i;
    }

    public void setTrackId(long j) {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this, akoc.a(j)));
        this.trackId = j;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("TrackFragmentRandomAccessBox{trackId=");
        stringBuilder.append(this.trackId);
        stringBuilder.append(", entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
