package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;

public class TrackReferenceTypeBox extends AbstractBox {
    public static final String TYPE1 = "hint";
    public static final String TYPE2 = "cdsc";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private long[] trackIds;

    static {
        ajc$preClinit();
    }

    public TrackReferenceTypeBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TrackReferenceTypeBox.java", TrackReferenceTypeBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getTrackIds", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "[J"), 40);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "java.lang.String"), 65);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining() / 4;
        this.trackIds = new long[remaining];
        for (int i = 0; i < remaining; i++) {
            this.trackIds[i] = aqi.a(byteBuffer);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        for (long b : this.trackIds) {
            aqk.b(byteBuffer, b);
        }
    }

    public long getContentSize() {
        return (long) (this.trackIds.length << 2);
    }

    public long[] getTrackIds() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.trackIds;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackReferenceTypeBox[type=");
        stringBuilder.append(getType());
        for (int i = 0; i < this.trackIds.length; i++) {
            stringBuilder.append(";trackId");
            stringBuilder.append(i);
            stringBuilder.append("=");
            stringBuilder.append(this.trackIds[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
