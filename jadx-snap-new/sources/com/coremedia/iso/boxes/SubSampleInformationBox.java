package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class SubSampleInformationBox extends AbstractFullBox {
    public static final String TYPE = "subs";
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_2 = null;
    private List<a> entries = new ArrayList();

    public static class a {
        long a;
        List<a> b = new ArrayList();

        public static class a {
            long a;
            int b;
            int c;
            long d;

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("SubsampleEntry{subsampleSize=");
                stringBuilder.append(this.a);
                stringBuilder.append(", subsamplePriority=");
                stringBuilder.append(this.b);
                stringBuilder.append(", discardable=");
                stringBuilder.append(this.c);
                stringBuilder.append(", reserved=");
                stringBuilder.append(this.d);
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("SampleEntry{sampleDelta=");
            stringBuilder.append(this.a);
            stringBuilder.append(", subsampleCount=");
            stringBuilder.append(this.b.size());
            stringBuilder.append(", subsampleEntries=");
            stringBuilder.append(this.b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public SubSampleInformationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SubSampleInformationBox.java", SubSampleInformationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 50);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 54);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 124);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long a = aqi.a(byteBuffer);
        for (int i = 0; ((long) i) < a; i++) {
            a aVar = new a();
            aVar.a = aqi.a(byteBuffer);
            int c = aqi.c(byteBuffer);
            for (int i2 = 0; i2 < c; i2++) {
                a aVar2 = new a();
                aVar2.a = getVersion() == 1 ? aqi.a(byteBuffer) : (long) aqi.c(byteBuffer);
                aVar2.b = aqi.a(byteBuffer.get());
                aVar2.c = aqi.a(byteBuffer.get());
                aVar2.d = aqi.a(byteBuffer);
                aVar.b.add(aVar2);
            }
            this.entries.add(aVar);
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.b(byteBuffer, (long) this.entries.size());
        for (a aVar : this.entries) {
            aqk.b(byteBuffer, aVar.a);
            aqk.b(byteBuffer, aVar.b.size());
            for (a aVar2 : aVar.b) {
                if (getVersion() == 1) {
                    aqk.b(byteBuffer, aVar2.a);
                } else {
                    aqk.b(byteBuffer, ces.a(aVar2.a));
                }
                aqk.c(byteBuffer, aVar2.b);
                aqk.c(byteBuffer, aVar2.c);
                aqk.b(byteBuffer, aVar2.d);
            }
        }
    }

    public long getContentSize() {
        long j = 8;
        for (a aVar : this.entries) {
            j = (j + 4) + 2;
            for (int i = 0; i < aVar.b.size(); i++) {
                j = ((getVersion() == 1 ? j + 4 : j + 2) + 2) + 4;
            }
        }
        return j;
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
        StringBuilder stringBuilder = new StringBuilder("SubSampleInformationBox{entryCount=");
        stringBuilder.append(this.entries.size());
        stringBuilder.append(", entries=");
        stringBuilder.append(this.entries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
