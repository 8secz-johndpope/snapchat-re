package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class MovieFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "mfhd";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private long sequenceNumber;

    static {
        ajc$preClinit();
    }

    public MovieFragmentHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("MovieFragmentHeaderBox.java", MovieFragmentHeaderBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "long"), 59);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "long", "sequenceNumber", "", "void"), 63);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "java.lang.String"), 68);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sequenceNumber = aqi.a(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, this.sequenceNumber);
    }

    public long getContentSize() {
        return 8;
    }

    public long getSequenceNumber() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.sequenceNumber;
    }

    public void setSequenceNumber(long j) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, akoc.a(j)));
        this.sequenceNumber = j;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("MovieFragmentHeaderBox{sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
