package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.platform.Platform;

public class SegmentIndexBox extends FullBox {
    public long earliest_presentation_time;
    public long first_offset;
    public long reference_ID;
    public int reference_count;
    public Reference[] references;
    public int reserved;
    public long timescale;

    public static class Reference {
        public long SAP_delta_time;
        public int SAP_type;
        public boolean reference_type;
        public long referenced_size;
        public boolean starts_with_SAP;
        public long subsegment_duration;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Reference [reference_type=");
            stringBuilder.append(this.reference_type);
            stringBuilder.append(", referenced_size=");
            stringBuilder.append(this.referenced_size);
            stringBuilder.append(", subsegment_duration=");
            stringBuilder.append(this.subsegment_duration);
            stringBuilder.append(", starts_with_SAP=");
            stringBuilder.append(this.starts_with_SAP);
            stringBuilder.append(", SAP_type=");
            stringBuilder.append(this.SAP_type);
            stringBuilder.append(", SAP_delta_time=");
            stringBuilder.append(this.SAP_delta_time);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public SegmentIndexBox(Header header) {
        super(header);
    }

    public static SegmentIndexBox createSegmentIndexBox() {
        return new SegmentIndexBox(new Header(fourcc()));
    }

    public static String fourcc() {
        return com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox.TYPE;
    }

    /* Access modifiers changed, original: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt((int) this.reference_ID);
        byteBuffer.putInt((int) this.timescale);
        if (this.version == (byte) 0) {
            byteBuffer.putInt((int) this.earliest_presentation_time);
            byteBuffer.putInt((int) this.first_offset);
        } else {
            byteBuffer.putLong(this.earliest_presentation_time);
            byteBuffer.putLong(this.first_offset);
        }
        byteBuffer.putShort((short) this.reserved);
        byteBuffer.putShort((short) this.reference_count);
        for (int i = 0; i < this.reference_count; i++) {
            Reference reference = this.references[i];
            int i2 = (int) (((long) (reference.reference_type << 31)) | reference.referenced_size);
            int i3 = (int) reference.subsegment_duration;
            int i4 = (int) (((long) ((reference.starts_with_SAP ? Integer.MIN_VALUE : 0) | ((reference.SAP_type & 7) << 28))) | (reference.SAP_delta_time & 268435455));
            byteBuffer.putInt(i2);
            byteBuffer.putInt(i3);
            byteBuffer.putInt(i4);
        }
    }

    public int estimateSize() {
        return (this.reference_count * 12) + 40;
    }

    public void parse(ByteBuffer byteBuffer) {
        long j;
        super.parse(byteBuffer);
        this.reference_ID = ((long) byteBuffer.getInt()) & 4294967295L;
        this.timescale = ((long) byteBuffer.getInt()) & 4294967295L;
        if (this.version == (byte) 0) {
            this.earliest_presentation_time = ((long) byteBuffer.getInt()) & 4294967295L;
            j = ((long) byteBuffer.getInt()) & 4294967295L;
        } else {
            this.earliest_presentation_time = byteBuffer.getLong();
            j = byteBuffer.getLong();
        }
        this.first_offset = j;
        this.reserved = byteBuffer.getShort();
        this.reference_count = byteBuffer.getShort() & 65535;
        this.references = new Reference[this.reference_count];
        for (int i = 0; i < this.reference_count; i++) {
            long j2 = ((long) byteBuffer.getInt()) & 4294967295L;
            long j3 = ((long) byteBuffer.getInt()) & 4294967295L;
            long j4 = ((long) byteBuffer.getInt()) & 4294967295L;
            Reference reference = new Reference();
            reference.reference_type = (j2 >> 31) == 1;
            reference.referenced_size = j2 & 2147483647L;
            reference.subsegment_duration = j3;
            reference.starts_with_SAP = (j4 >> 31) == 1;
            reference.SAP_type = (int) ((j4 >> 28) & 7);
            reference.SAP_delta_time = 268435455 & j4;
            this.references[i] = reference;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SegmentIndexBox [reference_ID=");
        stringBuilder.append(this.reference_ID);
        stringBuilder.append(", timescale=");
        stringBuilder.append(this.timescale);
        stringBuilder.append(", earliest_presentation_time=");
        stringBuilder.append(this.earliest_presentation_time);
        stringBuilder.append(", first_offset=");
        stringBuilder.append(this.first_offset);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.reserved);
        stringBuilder.append(", reference_count=");
        stringBuilder.append(this.reference_count);
        stringBuilder.append(", references=");
        stringBuilder.append(Platform.arrayToString(this.references));
        stringBuilder.append(", version=");
        stringBuilder.append(this.version);
        stringBuilder.append(", flags=");
        stringBuilder.append(this.flags);
        stringBuilder.append(", header=");
        stringBuilder.append(this.header);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
