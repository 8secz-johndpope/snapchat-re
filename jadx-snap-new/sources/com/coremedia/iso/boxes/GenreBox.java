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

public class GenreBox extends AbstractFullBox {
    public static final String TYPE = "gnre";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private String genre;
    private String language;

    static {
        ajc$preClinit();
    }

    public GenreBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("GenreBox.java", GenreBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLanguage", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGenre", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLanguage", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "language", "", "void"), 50);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setGenre", "com.coremedia.iso.boxes.GenreBox", "java.lang.String", "genre", "", "void"), 54);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.GenreBox", "", "", "", "java.lang.String"), 77);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = aqi.i(byteBuffer);
        this.genre = aqi.d(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.a(byteBuffer, this.language);
        byteBuffer.put(aqn.a(this.genre));
        byteBuffer.put((byte) 0);
    }

    public long getContentSize() {
        return (long) (aqn.b(this.genre) + 7);
    }

    public String getGenre() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.genre;
    }

    public String getLanguage() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.language;
    }

    public void setGenre(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.genre = str;
    }

    public void setLanguage(String str) {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this, (Object) str));
        this.language = str;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("GenreBox[language=");
        stringBuilder.append(getLanguage());
        stringBuilder.append(";genre=");
        stringBuilder.append(getGenre());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
