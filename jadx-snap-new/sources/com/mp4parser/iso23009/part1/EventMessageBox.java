package com.mp4parser.iso23009.part1;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class EventMessageBox extends AbstractFullBox {
    public static final String TYPE = "emsg";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_10 = null;
    private static final /* synthetic */ a ajc$tjp_11 = null;
    private static final /* synthetic */ a ajc$tjp_12 = null;
    private static final /* synthetic */ a ajc$tjp_13 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    long eventDuration;
    long id;
    byte[] messageData;
    long presentationTimeDelta;
    String schemeIdUri;
    long timescale;
    String value;

    static {
        ajc$preClinit();
    }

    public EventMessageBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("EventMessageBox.java", EventMessageBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 59);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "schemeIdUri", "", "void"), 63);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getId", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 99);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setId", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "id", "", "void"), 103);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "[B"), 107);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "[B", "messageData", "", "void"), 111);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getValue", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setValue", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "value", "", "void"), 71);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 75);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "timescale", "", "void"), 79);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 83);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "presentationTimeDelta", "", "void"), 87);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 91);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "eventDuration", "", "void"), 95);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeIdUri = aqi.d(byteBuffer);
        this.value = aqi.d(byteBuffer);
        this.timescale = aqi.a(byteBuffer);
        this.presentationTimeDelta = aqi.a(byteBuffer);
        this.eventDuration = aqi.a(byteBuffer);
        this.id = aqi.a(byteBuffer);
        this.messageData = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.messageData);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.c(byteBuffer, this.schemeIdUri);
        aqk.c(byteBuffer, this.value);
        aqk.b(byteBuffer, this.timescale);
        aqk.b(byteBuffer, this.presentationTimeDelta);
        aqk.b(byteBuffer, this.eventDuration);
        aqk.b(byteBuffer, this.id);
        byteBuffer.put(this.messageData);
    }

    public long getContentSize() {
        return (long) (((aqn.b(this.schemeIdUri) + 22) + aqn.b(this.value)) + this.messageData.length);
    }

    public long getEventDuration() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.eventDuration;
    }

    public long getId() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.id;
    }

    public byte[] getMessageData() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        return this.messageData;
    }

    public long getPresentationTimeDelta() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.presentationTimeDelta;
    }

    public String getSchemeIdUri() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.schemeIdUri;
    }

    public long getTimescale() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.timescale;
    }

    public String getValue() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.value;
    }

    public void setEventDuration(long j) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, akoc.a(j)));
        this.eventDuration = j;
    }

    public void setId(long j) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, akoc.a(j)));
        this.id = j;
    }

    public void setMessageData(byte[] bArr) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, (Object) bArr));
        this.messageData = bArr;
    }

    public void setPresentationTimeDelta(long j) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, akoc.a(j)));
        this.presentationTimeDelta = j;
    }

    public void setSchemeIdUri(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.schemeIdUri = str;
    }

    public void setTimescale(long j) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, akoc.a(j)));
        this.timescale = j;
    }

    public void setValue(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.value = str;
    }
}
