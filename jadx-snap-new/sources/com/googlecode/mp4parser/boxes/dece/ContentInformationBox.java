package com.googlecode.mp4parser.boxes.dece;

import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ContentInformationBox extends AbstractFullBox {
    public static final String TYPE = "cinf";
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
    Map<String, String> brandEntries = new LinkedHashMap();
    String codecs;
    Map<String, String> idEntries = new LinkedHashMap();
    String languages;
    String mimeSubtypeName;
    String profileLevelIdc;
    String protection;

    static {
        ajc$preClinit();
    }

    public ContentInformationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("ContentInformationBox.java", ContentInformationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 144);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "mimeSubtypeName", "", "void"), 148);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 184);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "brandEntries", "", "void"), 188);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 192);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "idEntries", "", "void"), 196);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 152);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "profileLevelIdc", "", "void"), 156);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 160);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "codecs", "", "void"), 164);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 168);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "protection", "", "void"), 172);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 176);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", Event.LANGUAGES, "", "void"), 180);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        int i;
        parseVersionAndFlags(byteBuffer);
        this.mimeSubtypeName = aqi.d(byteBuffer);
        this.profileLevelIdc = aqi.d(byteBuffer);
        this.codecs = aqi.d(byteBuffer);
        this.protection = aqi.d(byteBuffer);
        this.languages = aqi.d(byteBuffer);
        int a = aqi.a(byteBuffer.get());
        while (true) {
            i = a - 1;
            if (a <= 0) {
                break;
            }
            this.brandEntries.put(aqi.d(byteBuffer), aqi.d(byteBuffer));
            a = i;
        }
        a = aqi.a(byteBuffer.get());
        while (true) {
            i = a - 1;
            if (a > 0) {
                this.idEntries.put(aqi.d(byteBuffer), aqi.d(byteBuffer));
                a = i;
            } else {
                return;
            }
        }
    }

    public Map<String, String> getBrandEntries() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.brandEntries;
    }

    public String getCodecs() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.codecs;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.mimeSubtypeName);
        aqk.b(byteBuffer, this.profileLevelIdc);
        aqk.b(byteBuffer, this.codecs);
        aqk.b(byteBuffer, this.protection);
        aqk.b(byteBuffer, this.languages);
        aqk.c(byteBuffer, this.brandEntries.size());
        for (Entry entry : this.brandEntries.entrySet()) {
            aqk.b(byteBuffer, (String) entry.getKey());
            aqk.b(byteBuffer, (String) entry.getValue());
        }
        aqk.c(byteBuffer, this.idEntries.size());
        for (Entry entry2 : this.idEntries.entrySet()) {
            aqk.b(byteBuffer, (String) entry2.getKey());
            aqk.b(byteBuffer, (String) entry2.getValue());
        }
    }

    public long getContentSize() {
        long b = (((((((long) (aqn.b(this.mimeSubtypeName) + 1)) + 4) + ((long) (aqn.b(this.profileLevelIdc) + 1))) + ((long) (aqn.b(this.codecs) + 1))) + ((long) (aqn.b(this.protection) + 1))) + ((long) (aqn.b(this.languages) + 1))) + 1;
        for (Entry entry : this.brandEntries.entrySet()) {
            b = (b + ((long) (aqn.b((String) entry.getKey()) + 1))) + ((long) (aqn.b((String) entry.getValue()) + 1));
        }
        b++;
        for (Entry entry2 : this.idEntries.entrySet()) {
            b = (b + ((long) (aqn.b((String) entry2.getKey()) + 1))) + ((long) (aqn.b((String) entry2.getValue()) + 1));
        }
        return b;
    }

    public Map<String, String> getIdEntries() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        return this.idEntries;
    }

    public String getLanguages() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.languages;
    }

    public String getMimeSubtypeName() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.mimeSubtypeName;
    }

    public String getProfileLevelIdc() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.profileLevelIdc;
    }

    public String getProtection() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.protection;
    }

    public void setBrandEntries(Map<String, String> map) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, (Object) map));
        this.brandEntries = map;
    }

    public void setCodecs(String str) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, (Object) str));
        this.codecs = str;
    }

    public void setIdEntries(Map<String, String> map) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, (Object) map));
        this.idEntries = map;
    }

    public void setLanguages(String str) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, (Object) str));
        this.languages = str;
    }

    public void setMimeSubtypeName(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.mimeSubtypeName = str;
    }

    public void setProfileLevelIdc(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.profileLevelIdc = str;
    }

    public void setProtection(String str) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, (Object) str));
        this.protection = str;
    }
}
