package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoe;
import defpackage.cdb;
import defpackage.cdj;
import defpackage.cdk;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

public class EC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dec3";
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_2 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_3 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_4 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_5 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_6 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_7 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_8 = null;
    int dataRate;
    List<a> entries = new LinkedList();
    int numIndSub;

    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Entry{fscod=");
            stringBuilder.append(this.a);
            stringBuilder.append(", bsid=");
            stringBuilder.append(this.b);
            stringBuilder.append(", bsmod=");
            stringBuilder.append(this.c);
            stringBuilder.append(", acmod=");
            stringBuilder.append(this.d);
            stringBuilder.append(", lfeon=");
            stringBuilder.append(this.e);
            stringBuilder.append(", reserved=");
            stringBuilder.append(this.f);
            stringBuilder.append(", num_dep_sub=");
            stringBuilder.append(this.g);
            stringBuilder.append(", chan_loc=");
            stringBuilder.append(this.h);
            stringBuilder.append(", reserved2=");
            stringBuilder.append(this.i);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public EC3SpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("EC3SpecificBox.java", EC3SpecificBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getContentSize", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "long"), 25);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getContent", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 65);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "java.util.List"), 86);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.util.List", "entries", "", "void"), 90);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "addEntry", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry", "entry", "", "void"), 94);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 98);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "dataRate", "", "void"), 102);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 106);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "numIndSub", "", "void"), 110);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        cdj cdj = new cdj(byteBuffer);
        this.dataRate = cdj.a(13);
        this.numIndSub = cdj.a(3) + 1;
        for (int i = 0; i < this.numIndSub; i++) {
            a aVar = new a();
            aVar.a = cdj.a(2);
            aVar.b = cdj.a(5);
            aVar.c = cdj.a(5);
            aVar.d = cdj.a(3);
            aVar.e = cdj.a(1);
            aVar.f = cdj.a(3);
            aVar.g = cdj.a(4);
            if (aVar.g > 0) {
                aVar.h = cdj.a(9);
            } else {
                aVar.i = cdj.a(1);
            }
            this.entries.add(aVar);
        }
    }

    public void addEntry(a aVar) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, (Object) aVar));
        this.entries.add(aVar);
    }

    public void getContent(ByteBuffer byteBuffer) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, (Object) byteBuffer));
        cdk cdk = new cdk(byteBuffer);
        cdk.a(this.dataRate, 13);
        cdk.a(this.entries.size() - 1, 3);
        for (a aVar : this.entries) {
            cdk.a(aVar.a, 2);
            cdk.a(aVar.b, 5);
            cdk.a(aVar.c, 5);
            cdk.a(aVar.d, 3);
            cdk.a(aVar.e, 1);
            cdk.a(aVar.f, 3);
            cdk.a(aVar.g, 4);
            if (aVar.g > 0) {
                cdk.a(aVar.h, 9);
            } else {
                cdk.a(aVar.i, 1);
            }
        }
    }

    public long getContentSize() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        long j = 2;
        for (a aVar : this.entries) {
            j += aVar.g > 0 ? 4 : 3;
        }
        return j;
    }

    public int getDataRate() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        return this.dataRate;
    }

    public List<a> getEntries() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.entries;
    }

    public int getNumIndSub() {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this));
        return this.numIndSub;
    }

    public void setDataRate(int i) {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this, Integer.valueOf(i)));
        this.dataRate = i;
    }

    public void setEntries(List<a> list) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) list));
        this.entries = list;
    }

    public void setNumIndSub(int i) {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this, Integer.valueOf(i)));
        this.numIndSub = i;
    }
}
