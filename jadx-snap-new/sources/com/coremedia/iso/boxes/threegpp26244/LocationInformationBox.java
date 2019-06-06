package com.coremedia.iso.boxes.threegpp26244;

import com.googlecode.mp4parser.AbstractFullBox;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class LocationInformationBox extends AbstractFullBox {
    public static final String TYPE = "loci";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_10 = null;
    private static final /* synthetic */ a ajc$tjp_11 = null;
    private static final /* synthetic */ a ajc$tjp_12 = null;
    private static final /* synthetic */ a ajc$tjp_13 = null;
    private static final /* synthetic */ a ajc$tjp_14 = null;
    private static final /* synthetic */ a ajc$tjp_15 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private static final /* synthetic */ a ajc$tjp_7 = null;
    private static final /* synthetic */ a ajc$tjp_8 = null;
    private static final /* synthetic */ a ajc$tjp_9 = null;
    private String additionalNotes;
    private double altitude;
    private String astronomicalBody;
    private String language;
    private double latitude;
    private double longitude;
    private String name;
    private int role;

    static {
        ajc$preClinit();
    }

    public LocationInformationBox() {
        super(TYPE);
        String str = "";
        this.name = str;
        this.astronomicalBody = str;
        this.additionalNotes = str;
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("LocationInformationBox.java", LocationInformationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "language", "", "void"), 34);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 70);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", MapboxEvent.KEY_ALTITUDE, "", "void"), 74);
        ajc$tjp_12 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_13 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"), 82);
        ajc$tjp_14 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        ajc$tjp_15 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"), 90);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "name", "", "void"), 42);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "int"), 46);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "int", "role", "", "void"), 50);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 54);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "longitude", "", "void"), 58);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 62);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "latitude", "", "void"), 66);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = aqi.i(byteBuffer);
        this.name = aqi.d(byteBuffer);
        this.role = aqi.a(byteBuffer.get());
        this.longitude = aqi.f(byteBuffer);
        this.latitude = aqi.f(byteBuffer);
        this.altitude = aqi.f(byteBuffer);
        this.astronomicalBody = aqi.d(byteBuffer);
        this.additionalNotes = aqi.d(byteBuffer);
    }

    public String getAdditionalNotes() {
        cdb.a(akoe.a(ajc$tjp_14, (Object) this, (Object) this));
        return this.additionalNotes;
    }

    public double getAltitude() {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this));
        return this.altitude;
    }

    public String getAstronomicalBody() {
        cdb.a(akoe.a(ajc$tjp_12, (Object) this, (Object) this));
        return this.astronomicalBody;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.a(byteBuffer, this.language);
        byteBuffer.put(aqn.a(this.name));
        byteBuffer.put((byte) 0);
        aqk.c(byteBuffer, this.role);
        aqk.a(byteBuffer, this.longitude);
        aqk.a(byteBuffer, this.latitude);
        aqk.a(byteBuffer, this.altitude);
        byteBuffer.put(aqn.a(this.astronomicalBody));
        byteBuffer.put((byte) 0);
        byteBuffer.put(aqn.a(this.additionalNotes));
        byteBuffer.put((byte) 0);
    }

    public long getContentSize() {
        return (long) (((aqn.a(this.name).length + 22) + aqn.a(this.astronomicalBody).length) + aqn.a(this.additionalNotes).length);
    }

    public String getLanguage() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public double getLatitude() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.latitude;
    }

    public double getLongitude() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.longitude;
    }

    public String getName() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.name;
    }

    public int getRole() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.role;
    }

    public void setAdditionalNotes(String str) {
        cdb.a(akoe.a(ajc$tjp_15, (Object) this, (Object) this, (Object) str));
        this.additionalNotes = str;
    }

    public void setAltitude(double d) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, Double.valueOf(d)));
        this.altitude = d;
    }

    public void setAstronomicalBody(String str) {
        cdb.a(akoe.a(ajc$tjp_13, (Object) this, (Object) this, (Object) str));
        this.astronomicalBody = str;
    }

    public void setLanguage(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public void setLatitude(double d) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, Double.valueOf(d)));
        this.latitude = d;
    }

    public void setLongitude(double d) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, Double.valueOf(d)));
        this.longitude = d;
    }

    public void setName(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.name = str;
    }

    public void setRole(int i) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Integer.valueOf(i)));
        this.role = i;
    }
}
