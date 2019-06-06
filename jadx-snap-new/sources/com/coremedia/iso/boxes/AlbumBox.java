package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class AlbumBox extends AbstractFullBox {
    public static final String TYPE = "albm";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private String albumTitle;
    private String language;
    private int trackNumber;

    static {
        ajc$preClinit();
    }

    public AlbumBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("AlbumBox.java", AlbumBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLanguage", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 51);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 55);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "int"), 59);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLanguage", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "language", "", "void"), 63);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setAlbumTitle", "com.coremedia.iso.boxes.AlbumBox", "java.lang.String", "albumTitle", "", "void"), 67);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setTrackNumber", "com.coremedia.iso.boxes.AlbumBox", "int", "trackNumber", "", "void"), 71);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.AlbumBox", "", "", "", "java.lang.String"), 103);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = aqi.i(byteBuffer);
        this.albumTitle = aqi.d(byteBuffer);
        this.trackNumber = byteBuffer.remaining() > 0 ? aqi.a(byteBuffer.get()) : -1;
    }

    public String getAlbumTitle() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.albumTitle;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.a(byteBuffer, this.language);
        byteBuffer.put(aqn.a(this.albumTitle));
        byteBuffer.put((byte) 0);
        int i = this.trackNumber;
        if (i != -1) {
            aqk.c(byteBuffer, i);
        }
    }

    public long getContentSize() {
        int i = 1;
        int b = (aqn.b(this.albumTitle) + 6) + 1;
        if (this.trackNumber == -1) {
            i = 0;
        }
        return (long) (b + i);
    }

    public String getLanguage() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public int getTrackNumber() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.trackNumber;
    }

    public void setAlbumTitle(String str) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, (Object) str));
        this.albumTitle = str;
    }

    public void setLanguage(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public void setTrackNumber(int i) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Integer.valueOf(i)));
        this.trackNumber = i;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AlbumBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";");
        stringBuilder.append("albumTitle=");
        stringBuilder.append(getAlbumTitle());
        if (this.trackNumber >= 0) {
            stringBuilder.append(";trackNumber=");
            stringBuilder.append(getTrackNumber());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
