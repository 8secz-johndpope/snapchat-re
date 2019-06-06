package com.googlecode.mp4parser.boxes.threegpp26245;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqn;
import defpackage.cdb;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

public class FontTableBox extends AbstractBox {
    public static final String TYPE = "ftab";
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    List<a> entries = new LinkedList();

    public static class a {
        int a;
        String b;

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("FontRecord{fontId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", fontname='");
            stringBuilder.append(this.b);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public FontTableBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("FontTableBox.java", FontTableBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "", "", "", "java.util.List"), 52);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "java.util.List", "entries", "", "void"), 56);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        int c = aqi.c(byteBuffer);
        for (int i = 0; i < c; i++) {
            a aVar = new a();
            aVar.a = aqi.c(byteBuffer);
            aVar.b = aqi.a(byteBuffer, aqi.a(byteBuffer.get()));
            this.entries.add(aVar);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        aqk.b(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            aqk.b(byteBuffer, aVar.a);
            aqk.c(byteBuffer, aVar.b.length());
            byteBuffer.put(aqn.a(aVar.b));
        }
    }

    public long getContentSize() {
        int i = 2;
        for (a aVar : this.entries) {
            i += aqn.b(aVar.b) + 3;
        }
        return (long) i;
    }

    public List<a> getEntries() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }
}
