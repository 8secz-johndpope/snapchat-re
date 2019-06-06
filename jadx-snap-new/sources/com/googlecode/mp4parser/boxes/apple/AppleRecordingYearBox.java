package com.googlecode.mp4parser.boxes.apple;

import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class AppleRecordingYearBox extends AppleDataBox {
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    Date date = new Date();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ssZ");

    static {
        ajc$preClinit();
    }

    public AppleRecordingYearBox() {
        super("©day", 1);
        this.df.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AppleRecordingYearBox.java", AppleRecordingYearBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "", "", "", "java.util.Date"), 27);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "java.util.Date", "date", "", "void"), 31);
    }

    protected static String iso8601toRfc822Date(String str) {
        return str.replaceAll("Z$", "+0000").replaceAll("([0-9][0-9]):([0-9][0-9])$", "$1$2");
    }

    protected static String rfc822toIso8601Date(String str) {
        return str.replaceAll("\\+0000$", "Z");
    }

    /* Access modifiers changed, original: protected */
    public int getDataLength() {
        return aqn.a(rfc822toIso8601Date(this.df.format(this.date))).length;
    }

    public Date getDate() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.date;
    }

    /* Access modifiers changed, original: protected */
    public void parseData(ByteBuffer byteBuffer) {
        try {
            this.date = this.df.parse(iso8601toRfc822Date(aqi.a(byteBuffer, byteBuffer.remaining())));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void setDate(Date date) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) date));
        this.date = date;
    }

    /* Access modifiers changed, original: protected */
    public byte[] writeData() {
        return aqn.a(rfc822toIso8601Date(this.df.format(this.date)));
    }
}
