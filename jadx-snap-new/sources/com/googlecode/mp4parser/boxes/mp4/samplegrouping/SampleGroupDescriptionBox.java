package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.brightcove.player.event.Event;
import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.aknv.a;
import defpackage.akoe;
import defpackage.aqh;
import defpackage.aqk;
import defpackage.cdb;
import defpackage.cdw;
import defpackage.cdx;
import defpackage.cdy;
import defpackage.cdz;
import defpackage.cea;
import defpackage.ceb;
import defpackage.cec;
import defpackage.cgs;
import defpackage.cgt;
import defpackage.cgu;
import defpackage.cgv;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

public class SampleGroupDescriptionBox extends AbstractFullBox {
    public static final String TYPE = "sgpd";
    private static final /* synthetic */ a ajc$tjp_0 = null;
    private static final /* synthetic */ a ajc$tjp_1 = null;
    private static final /* synthetic */ a ajc$tjp_2 = null;
    private static final /* synthetic */ a ajc$tjp_3 = null;
    private static final /* synthetic */ a ajc$tjp_4 = null;
    private static final /* synthetic */ a ajc$tjp_5 = null;
    private static final /* synthetic */ a ajc$tjp_6 = null;
    private int defaultLength;
    private List<cdx> groupEntries = new LinkedList();

    static {
        ajc$preClinit();
    }

    public SampleGroupDescriptionBox() {
        super(TYPE);
        setVersion(1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("SampleGroupDescriptionBox.java", SampleGroupDescriptionBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 145);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"), 149);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 153);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), 157);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", Event.BOOLEAN), 162);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "hashCode", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 183);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 191);
    }

    private cdx parseGroupEntry(ByteBuffer byteBuffer, String str) {
        cdx cdz = "roll".equals(str) ? new cdz() : "rash".equals(str) ? new cdy() : "seig".equals(str) ? new cdw() : "rap ".equals(str) ? new cec() : "tele".equals(str) ? new cea() : "sync".equals(str) ? new cgt() : "tscl".equals(str) ? new cgu() : "tsas".equals(str) ? new cgv() : "stsa".equals(str) ? new cgs() : new ceb(str);
        cdz.a(byteBuffer);
        return cdz;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x006b in {4, 8, 13, 14, 16, 18} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public void _parseDetails(java.nio.ByteBuffer r10) {
        /*
        r9 = this;
        r9.parseVersionAndFlags(r10);
        r0 = r9.getVersion();
        r1 = 1;
        if (r0 != r1) goto L_0x0063;
        r0 = defpackage.aqi.j(r10);
        r2 = r9.getVersion();
        if (r2 != r1) goto L_0x001e;
        r2 = defpackage.aqi.a(r10);
        r2 = defpackage.ces.a(r2);
        r9.defaultLength = r2;
        r2 = defpackage.aqi.a(r10);
        r4 = 1;
        r4 = r2 - r4;
        r6 = 0;
        r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r8 > 0) goto L_0x002d;
        return;
        r2 = r9.defaultLength;
        r3 = r9.getVersion();
        if (r3 != r1) goto L_0x005b;
        r3 = r9.defaultLength;
        if (r3 != 0) goto L_0x0041;
        r2 = defpackage.aqi.a(r10);
        r2 = defpackage.ces.a(r2);
        r3 = r10.position();
        r3 = r3 + r2;
        r6 = r10.slice();
        r6.limit(r2);
        r2 = r9.groupEntries;
        r6 = r9.parseGroupEntry(r6, r0);
        r2.add(r6);
        r10.position(r3);
        r2 = r4;
        goto L_0x0022;
        r10 = new java.lang.RuntimeException;
        r0 = "This should be implemented";
        r10.<init>(r0);
        throw r10;
        r10 = new java.lang.RuntimeException;
        r0 = "SampleGroupDescriptionBox are only supported in version 1";
        r10.<init>(r0);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox._parseDetails(java.nio.ByteBuffer):void");
    }

    public boolean equals(Object obj) {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleGroupDescriptionBox sampleGroupDescriptionBox = (SampleGroupDescriptionBox) obj;
        if (this.defaultLength != sampleGroupDescriptionBox.defaultLength) {
            return false;
        }
        List list = this.groupEntries;
        return list == null ? sampleGroupDescriptionBox.groupEntries == null : list.equals(sampleGroupDescriptionBox.groupEntries);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(aqh.a(((cdx) this.groupEntries.get(0)).a()));
        if (getVersion() == 1) {
            aqk.b(byteBuffer, (long) this.defaultLength);
        }
        aqk.b(byteBuffer, (long) this.groupEntries.size());
        for (cdx cdx : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                aqk.b(byteBuffer, (long) cdx.b().limit());
            }
            byteBuffer.put(cdx.b());
        }
    }

    public long getContentSize() {
        long j = (getVersion() == 1 ? 12 : 8) + 4;
        for (cdx cdx : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                j += 4;
            }
            j += (long) cdx.c();
        }
        return j;
    }

    public int getDefaultLength() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.defaultLength;
    }

    public List<cdx> getGroupEntries() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.groupEntries;
    }

    public int hashCode() {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this));
        int i = 0;
        int i2 = (this.defaultLength + 0) * 31;
        List list = this.groupEntries;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public void setDefaultLength(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.defaultLength = i;
    }

    public void setGroupEntries(List<cdx> list) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, (Object) list));
        this.groupEntries = list;
    }

    public String toString() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        StringBuilder stringBuilder = new StringBuilder("SampleGroupDescriptionBox{groupingType='");
        stringBuilder.append(this.groupEntries.size() > 0 ? ((cdx) this.groupEntries.get(0)).a() : "????");
        stringBuilder.append('\'');
        stringBuilder.append(", defaultLength=");
        stringBuilder.append(this.defaultLength);
        stringBuilder.append(", groupEntries=");
        stringBuilder.append(this.groupEntries);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
