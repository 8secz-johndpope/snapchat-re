package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

public class EditListBox extends AbstractFullBox {
    public static final String TYPE = "elst";
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_2 = null;
    private List<a> entries = new LinkedList();

    public static class a {
        EditListBox a;
        long b;
        long c;
        double d;

        public a(EditListBox editListBox, ByteBuffer byteBuffer) {
            long j;
            if (editListBox.getVersion() == 1) {
                this.b = aqi.e(byteBuffer);
                j = byteBuffer.getLong();
            } else {
                this.b = aqi.a(byteBuffer);
                j = (long) byteBuffer.getInt();
            }
            this.c = j;
            this.d = aqi.f(byteBuffer);
            this.a = editListBox;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b == aVar.b;
        }

        public final int hashCode() {
            long j = this.b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.c;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{segmentDuration=");
            stringBuilder.append(this.b);
            stringBuilder.append(", mediaTime=");
            stringBuilder.append(this.c);
            stringBuilder.append(", mediaRate=");
            stringBuilder.append(this.d);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public EditListBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("EditListBox.java", EditListBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"), 72);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a = ces.a(aqi.a(byteBuffer));
        this.entries = new LinkedList();
        for (int i = 0; i < a; i++) {
            this.entries.add(new a(this, byteBuffer));
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, (long) this.entries.size());
        for (a aVar : this.entries) {
            if (aVar.a.getVersion() == 1) {
                aqk.a(byteBuffer, aVar.b);
                byteBuffer.putLong(aVar.c);
            } else {
                aqk.b(byteBuffer, (long) ces.a(aVar.b));
                byteBuffer.putInt(ces.a(aVar.c));
            }
            aqk.a(byteBuffer, aVar.d);
        }
    }

    public long getContentSize() {
        return ((long) (getVersion() == 1 ? this.entries.size() * 20 : this.entries.size() * 12)) + 8;
    }

    public List<a> getEntries() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("EditListBox{entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
