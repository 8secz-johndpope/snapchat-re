package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqq;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class TrackExtendsBox extends AbstractFullBox {
    public static final String TYPE = "trex";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_10 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private aqq defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackExtendsBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TrackExtendsBox.java", TrackExtendsBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 72);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 76);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 112);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 80);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 84);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 88);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultSampleFlagsStr", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "java.lang.String"), 92);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "trackId", "", "void"), 96);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDescriptionIndex", "", "void"), 100);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDuration", "", "void"), 104);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleSize", "", "void"), 108);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = aqi.a(byteBuffer);
        this.defaultSampleDescriptionIndex = aqi.a(byteBuffer);
        this.defaultSampleDuration = aqi.a(byteBuffer);
        this.defaultSampleSize = aqi.a(byteBuffer);
        this.defaultSampleFlags = new aqq(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.trackId);
        aqk.b(byteBuffer, this.defaultSampleDescriptionIndex);
        aqk.b(byteBuffer, this.defaultSampleDuration);
        aqk.b(byteBuffer, this.defaultSampleSize);
        this.defaultSampleFlags.a(byteBuffer);
    }

    public long getContentSize() {
        return 24;
    }

    public long getDefaultSampleDescriptionIndex() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.defaultSampleDescriptionIndex;
    }

    public long getDefaultSampleDuration() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.defaultSampleDuration;
    }

    public aqq getDefaultSampleFlags() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.defaultSampleFlags;
    }

    public String getDefaultSampleFlagsStr() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.defaultSampleFlags.toString();
    }

    public long getDefaultSampleSize() {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this));
        return this.defaultSampleSize;
    }

    public long getTrackId() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.trackId;
    }

    public void setDefaultSampleDescriptionIndex(long j) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, akoc.a(j)));
        this.defaultSampleDescriptionIndex = j;
    }

    public void setDefaultSampleDuration(long j) {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this, akoc.a(j)));
        this.defaultSampleDuration = j;
    }

    public void setDefaultSampleFlags(aqq aqq) {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this, (Object) aqq));
        this.defaultSampleFlags = aqq;
    }

    public void setDefaultSampleSize(long j) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, akoc.a(j)));
        this.defaultSampleSize = j;
    }

    public void setTrackId(long j) {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this, akoc.a(j)));
        this.trackId = j;
    }
}
