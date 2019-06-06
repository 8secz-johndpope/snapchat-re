package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.aqi;
import defpackage.aqj;
import defpackage.aqk;
import defpackage.aql;
import defpackage.cdb;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.opencv.imgproc.Imgproc;

public class ItemLocationBox extends AbstractFullBox {
    public static final String TYPE = "iloc";
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_0 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_1 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_10 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_11 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_2 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_3 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_4 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_5 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_6 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_7 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_8 = null;
    private static final /* synthetic */ defpackage.aknv.a ajc$tjp_9 = null;
    public int baseOffsetSize = 8;
    public int indexSize = 0;
    public List<b> items = new LinkedList();
    public int lengthSize = 8;
    public int offsetSize = 8;

    public class a {
        public long a;
        public long b;
        public long c;

        public a(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public a(ByteBuffer byteBuffer) {
            if (ItemLocationBox.this.getVersion() == 1 && ItemLocationBox.this.indexSize > 0) {
                this.c = aqj.a(byteBuffer, ItemLocationBox.this.indexSize);
            }
            this.a = aqj.a(byteBuffer, ItemLocationBox.this.offsetSize);
            this.b = aqj.a(byteBuffer, ItemLocationBox.this.lengthSize);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b == aVar.b && this.a == aVar.a;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            j2 = this.c;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Extent");
            stringBuilder.append("{extentOffset=");
            stringBuilder.append(this.a);
            stringBuilder.append(", extentLength=");
            stringBuilder.append(this.b);
            stringBuilder.append(", extentIndex=");
            stringBuilder.append(this.c);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public class b {
        public int a;
        public int b;
        public int c;
        public long d;
        public List<a> e = new LinkedList();

        public b(int i, int i2, int i3, long j, List<a> list) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = j;
            this.e = list;
        }

        public b(ByteBuffer byteBuffer) {
            this.a = aqi.c(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.b = aqi.c(byteBuffer) & 15;
            }
            this.c = aqi.c(byteBuffer);
            this.d = ItemLocationBox.this.baseOffsetSize > 0 ? aqj.a(byteBuffer, ItemLocationBox.this.baseOffsetSize) : 0;
            int c = aqi.c(byteBuffer);
            for (int i = 0; i < c; i++) {
                this.e.add(new a(byteBuffer));
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.d != bVar.d || this.b != bVar.b || this.c != bVar.c || this.a != bVar.a) {
                return false;
            }
            List list = this.e;
            return list == null ? bVar.e == null : list.equals(bVar.e);
        }

        public final int hashCode() {
            int i = ((((this.a * 31) + this.b) * 31) + this.c) * 31;
            long j = this.d;
            i = (i + ((int) (j ^ (j >>> 32)))) * 31;
            List list = this.e;
            return i + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Item{baseOffset=");
            stringBuilder.append(this.d);
            stringBuilder.append(", itemId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", constructionMethod=");
            stringBuilder.append(this.b);
            stringBuilder.append(", dataReferenceIndex=");
            stringBuilder.append(this.c);
            stringBuilder.append(", extents=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static {
        ajc$preClinit();
    }

    public ItemLocationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        akoe akoe = new akoe("ItemLocationBox.java", ItemLocationBox.class);
        String str = "method-execution";
        ajc$tjp_0 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 119);
        ajc$tjp_1 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", "", "void"), 123);
        ajc$tjp_10 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 127);
        ajc$tjp_3 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", "", "void"), (int) Imgproc.COLOR_RGB2YUV_YV12);
        ajc$tjp_4 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 135);
        ajc$tjp_5 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", "", "void"), (int) Imgproc.COLOR_COLORCVT_MAX);
        ajc$tjp_6 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 143);
        ajc$tjp_7 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", "", "void"), 147);
        ajc$tjp_8 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_9 = akoe.a(str, akoe.a(SCamera.CAMERA_ID_FRONT, "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"), 155);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a = aqi.a(byteBuffer.get());
        this.offsetSize = a >>> 4;
        this.lengthSize = a & 15;
        a = aqi.a(byteBuffer.get());
        this.baseOffsetSize = a >>> 4;
        if (getVersion() == 1) {
            this.indexSize = a & 15;
        }
        a = aqi.c(byteBuffer);
        for (int i = 0; i < a; i++) {
            this.items.add(new b(byteBuffer));
        }
    }

    public a createExtent(long j, long j2, long j3) {
        cdb.a(akoe.a(ajc$tjp_11, (Object) this, (Object) this, new Object[]{akoc.a(j), akoc.a(j2), akoc.a(j3)}));
        return new a(j, j2, j3);
    }

    /* Access modifiers changed, original: 0000 */
    public a createExtent(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    public b createItem(int i, int i2, int i3, long j, List<a> list) {
        cdb.a(akoe.a(ajc$tjp_10, (Object) this, (Object) this, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), akoc.a(j), list}));
        return new b(i, i2, i3, j, list);
    }

    /* Access modifiers changed, original: 0000 */
    public b createItem(ByteBuffer byteBuffer) {
        return new b(byteBuffer);
    }

    public int getBaseOffsetSize() {
        cdb.a(akoe.a(ajc$tjp_4, (Object) this, (Object) this));
        return this.baseOffsetSize;
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        aqk.c(byteBuffer, (this.offsetSize << 4) | this.lengthSize);
        aqk.c(byteBuffer, getVersion() == 1 ? (this.baseOffsetSize << 4) | this.indexSize : this.baseOffsetSize << 4);
        aqk.b(byteBuffer, this.items.size());
        for (b bVar : this.items) {
            aqk.b(byteBuffer, bVar.a);
            if (ItemLocationBox.this.getVersion() == 1) {
                aqk.b(byteBuffer, bVar.b);
            }
            aqk.b(byteBuffer, bVar.c);
            if (ItemLocationBox.this.baseOffsetSize > 0) {
                aql.a(bVar.d, byteBuffer, ItemLocationBox.this.baseOffsetSize);
            }
            aqk.b(byteBuffer, bVar.e.size());
            for (a aVar : bVar.e) {
                if (ItemLocationBox.this.getVersion() == 1 && ItemLocationBox.this.indexSize > 0) {
                    aql.a(aVar.c, byteBuffer, ItemLocationBox.this.indexSize);
                }
                aql.a(aVar.a, byteBuffer, ItemLocationBox.this.offsetSize);
                aql.a(aVar.b, byteBuffer, ItemLocationBox.this.lengthSize);
            }
        }
    }

    public long getContentSize() {
        long j = 8;
        for (b bVar : this.items) {
            int i = (((ItemLocationBox.this.getVersion() == 1 ? 4 : 2) + 2) + ItemLocationBox.this.baseOffsetSize) + 2;
            for (a aVar : bVar.e) {
                i += ((ItemLocationBox.this.indexSize > 0 ? ItemLocationBox.this.indexSize : 0) + ItemLocationBox.this.offsetSize) + ItemLocationBox.this.lengthSize;
            }
            j += (long) i;
        }
        return j;
    }

    public int getIndexSize() {
        cdb.a(akoe.a(ajc$tjp_6, (Object) this, (Object) this));
        return this.indexSize;
    }

    public List<b> getItems() {
        cdb.a(akoe.a(ajc$tjp_8, (Object) this, (Object) this));
        return this.items;
    }

    public int getLengthSize() {
        cdb.a(akoe.a(ajc$tjp_2, (Object) this, (Object) this));
        return this.lengthSize;
    }

    public int getOffsetSize() {
        cdb.a(akoe.a(ajc$tjp_0, (Object) this, (Object) this));
        return this.offsetSize;
    }

    public void setBaseOffsetSize(int i) {
        cdb.a(akoe.a(ajc$tjp_5, (Object) this, (Object) this, Integer.valueOf(i)));
        this.baseOffsetSize = i;
    }

    public void setIndexSize(int i) {
        cdb.a(akoe.a(ajc$tjp_7, (Object) this, (Object) this, Integer.valueOf(i)));
        this.indexSize = i;
    }

    public void setItems(List<b> list) {
        cdb.a(akoe.a(ajc$tjp_9, (Object) this, (Object) this, (Object) list));
        this.items = list;
    }

    public void setLengthSize(int i) {
        cdb.a(akoe.a(ajc$tjp_3, (Object) this, (Object) this, Integer.valueOf(i)));
        this.lengthSize = i;
    }

    public void setOffsetSize(int i) {
        cdb.a(akoe.a(ajc$tjp_1, (Object) this, (Object) this, Integer.valueOf(i)));
        this.offsetSize = i;
    }
}
