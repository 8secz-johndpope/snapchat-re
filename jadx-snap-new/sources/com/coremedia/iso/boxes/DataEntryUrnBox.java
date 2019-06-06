package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class DataEntryUrnBox extends AbstractFullBox {
    public static final String TYPE = "urn ";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private String location;
    private String name;

    static {
        ajc$preClinit();
    }

    public DataEntryUrnBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("DataEntryUrnBox.java", DataEntryUrnBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getName", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLocation", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.DataEntryUrnBox", "", "", "", "java.lang.String"), 67);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.name = aqi.d(byteBuffer);
        this.location = aqi.d(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(aqn.a(this.name));
        byteBuffer.put((byte) 0);
        byteBuffer.put(aqn.a(this.location));
        byteBuffer.put((byte) 0);
    }

    public long getContentSize() {
        return (long) (((aqn.b(this.name) + 1) + aqn.b(this.location)) + 1);
    }

    public String getLocation() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.location;
    }

    public String getName() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.name;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("DataEntryUrlBox[name=");
        stringBuilder.append(getName());
        stringBuilder.append(";location=");
        stringBuilder.append(getLocation());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
