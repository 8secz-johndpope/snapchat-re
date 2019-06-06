package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class TfrfBox extends AbstractFullBox {
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_2 = null;
    public List<a> entries = new ArrayList();

    public class a {
        long a;
        long b;

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Entry");
            stringBuilder.append("{fragmentAbsoluteTime=");
            stringBuilder.append(this.a);
            stringBuilder.append(", fragmentAbsoluteDuration=");
            stringBuilder.append(this.b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public TfrfBox() {
        super("uuid");
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("TfrfBox.java", TfrfBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getFragmentCount", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "long"), 91);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.util.List"), 95);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.lang.String"), 100);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a = aqi.a(byteBuffer.get());
        for (int i = 0; i < a; i++) {
            long e;
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.a = aqi.e(byteBuffer);
                e = aqi.e(byteBuffer);
            } else {
                aVar.a = aqi.a(byteBuffer);
                e = aqi.a(byteBuffer);
            }
            aVar.b = e;
            this.entries.add(aVar);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.c(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            if (getVersion() == 1) {
                aqk.a(byteBuffer, aVar.a);
                aqk.a(byteBuffer, aVar.b);
            } else {
                aqk.b(byteBuffer, aVar.a);
                aqk.b(byteBuffer, aVar.b);
            }
        }
    }

    public long getContentSize() {
        return (long) ((this.entries.size() * (getVersion() == 1 ? 16 : 8)) + 5);
    }

    public List<a> getEntries() {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this));
        return this.entries;
    }

    public long getFragmentCount() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return (long) this.entries.size();
    }

    public byte[] getUserType() {
        return new byte[]{(byte) -44, Byte.MIN_VALUE, (byte) 126, (byte) -14, (byte) -54, (byte) 57, (byte) 70, (byte) -107, (byte) -114, (byte) 84, (byte) 38, (byte) -53, (byte) -98, (byte) 70, (byte) -89, (byte) -97};
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TfrfBox");
        stringBuilder.append("{entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
