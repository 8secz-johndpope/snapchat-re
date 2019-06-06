package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.AbstractFullBox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

public class SampleToGroupBox extends AbstractFullBox {
    public static final String TYPE = "sbgp";
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_2 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_3 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_4 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_5 = null;
    List<a> entries = new LinkedList();
    private String groupingType;
    private String groupingTypeParameter;

    public static class a {
        long a;
        int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.a == aVar.a;
        }

        public final int hashCode() {
            long j = this.a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.b;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{sampleCount=");
            stringBuilder.append(this.a);
            stringBuilder.append(", groupDescriptionIndex=");
            stringBuilder.append(this.b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToGroupBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SampleToGroupBox.java", SampleToGroupBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), (int) MapboxConstants.ANIMATION_DURATION_SHORT);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", "void"), 154);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 158);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", "void"), 162);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"), 166);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.util.List", "entries", "", "void"), 170);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.groupingType = aqi.j(byteBuffer);
        if (getVersion() == 1) {
            this.groupingTypeParameter = aqi.j(byteBuffer);
        }
        long a = aqi.a(byteBuffer);
        while (true) {
            long j = a - 1;
            if (a > 0) {
                this.entries.add(new a((long) ces.a(aqi.a(byteBuffer)), ces.a(aqi.a(byteBuffer))));
                a = j;
            } else {
                return;
            }
        }
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (getVersion() == 1) {
            byteBuffer.put(this.groupingTypeParameter.getBytes());
        }
        aqk.b(byteBuffer, (long) this.entries.size());
        for (a aVar : this.entries) {
            aqk.b(byteBuffer, aVar.a);
            aqk.b(byteBuffer, (long) aVar.b);
        }
    }

    public long getContentSize() {
        return (long) (getVersion() == 1 ? (this.entries.size() << 3) + 16 : (this.entries.size() << 3) + 12);
    }

    public List<a> getEntries() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.entries;
    }

    public String getGroupingType() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.groupingType;
    }

    public String getGroupingTypeParameter() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.groupingTypeParameter;
    }

    public void setEntries(List<a> list) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setGroupingType(String str) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) str));
        this.groupingType = str;
    }

    public void setGroupingTypeParameter(String str) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) str));
        this.groupingTypeParameter = str;
    }
}
