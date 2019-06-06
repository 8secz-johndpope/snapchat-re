package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class DataEntryUrlBox extends AbstractFullBox {
    public static final String TYPE = "url ";
    private static final /* synthetic */ a ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public DataEntryUrlBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("DataEntryUrlBox.java", DataEntryUrlBox.class);
        ajc$tjp_0 = akoe.a("method-execution", akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.DataEntryUrlBox", "", "", "", "java.lang.String"), 51);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
    }

    public long getContentSize() {
        return 4;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return "DataEntryUrlBox[]";
    }
}
