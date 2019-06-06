package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.fragment.TrackRunBox;
import java.nio.ByteBuffer;

public class TrunBox extends FullBox {
    private static final int DATA_OFFSET_AVAILABLE = 1;
    private static final int FIRST_SAMPLE_FLAGS_AVAILABLE = 4;
    private static final int SAMPLE_COMPOSITION_OFFSET_AVAILABLE = 2048;
    private static final int SAMPLE_DURATION_AVAILABLE = 256;
    private static final int SAMPLE_FLAGS_AVAILABLE = 1024;
    private static final int SAMPLE_SIZE_AVAILABLE = 512;
    private int dataOffset;
    private int firstSampleFlags;
    private int[] sampleCompositionOffset;
    private int sampleCount;
    private int[] sampleDuration;
    private int[] sampleFlags;
    private int[] sampleSize;

    public static class Factory {
        private TrunBox box;

        protected Factory(TrunBox trunBox) {
            this.box = trunBox;
        }
    }

    public TrunBox(Header header) {
        super(header);
    }

    public static Factory copy(TrunBox trunBox) {
        TrunBox createTrunBox2 = createTrunBox2(trunBox.sampleCount, trunBox.dataOffset, trunBox.firstSampleFlags, trunBox.sampleDuration, trunBox.sampleSize, trunBox.sampleFlags, trunBox.sampleCompositionOffset);
        createTrunBox2.setFlags(trunBox.getFlags());
        createTrunBox2.setVersion(trunBox.getVersion());
        return new Factory(createTrunBox2);
    }

    public static Factory create(int i) {
        return new Factory(createTrunBox1(i));
    }

    public static TrunBox createTrunBox() {
        return new TrunBox(new Header(fourcc()));
    }

    public static TrunBox createTrunBox1(int i) {
        TrunBox trunBox = new TrunBox(new Header(fourcc()));
        trunBox.sampleCount = i;
        return trunBox;
    }

    public static TrunBox createTrunBox2(int i, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        TrunBox trunBox = new TrunBox(new Header(fourcc()));
        trunBox.sampleCount = i;
        trunBox.dataOffset = i2;
        trunBox.firstSampleFlags = i3;
        trunBox.sampleDuration = iArr;
        trunBox.sampleSize = iArr2;
        trunBox.sampleFlags = iArr3;
        trunBox.sampleCompositionOffset = iArr4;
        return trunBox;
    }

    public static int flagsGetSampleDegradationPriority(int i) {
        return (i >> 16) & 65535;
    }

    public static int flagsGetSampleDependsOn(int i) {
        return (i >> 6) & 3;
    }

    public static int flagsGetSampleHasRedundancy(int i) {
        return (i >> 10) & 3;
    }

    public static int flagsGetSampleIsDependedOn(int i) {
        return (i >> 8) & 3;
    }

    public static int flagsGetSampleIsDifferentSample(int i) {
        return (i >> 15) & 1;
    }

    public static int flagsGetSamplePaddingValue(int i) {
        return (i >> 12) & 7;
    }

    public static String fourcc() {
        return TrackRunBox.TYPE;
    }

    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(this.sampleCount);
        if (isDataOffsetAvailable()) {
            byteBuffer.putInt(this.dataOffset);
        }
        if (isFirstSampleFlagsAvailable()) {
            byteBuffer.putInt(this.firstSampleFlags);
        }
        for (int i = 0; i < this.sampleCount; i++) {
            if (isSampleDurationAvailable()) {
                byteBuffer.putInt(this.sampleDuration[i]);
            }
            if (isSampleSizeAvailable()) {
                byteBuffer.putInt(this.sampleSize[i]);
            }
            if (isSampleFlagsAvailable()) {
                byteBuffer.putInt(this.sampleFlags[i]);
            }
            if (isSampleCompositionOffsetAvailable()) {
                byteBuffer.putInt(this.sampleCompositionOffset[i]);
            }
        }
    }

    public int estimateSize() {
        return (this.sampleCount << 4) + 24;
    }

    public int getDataOffset() {
        return this.dataOffset;
    }

    public int getFirstSampleFlags() {
        return this.firstSampleFlags;
    }

    public long getSampleCompositionOffset(int i) {
        return ((long) this.sampleCompositionOffset[i]) & 4294967295L;
    }

    public int[] getSampleCompositionOffsets() {
        return this.sampleCompositionOffset;
    }

    public long getSampleCount() {
        return ((long) this.sampleCount) & 4294967295L;
    }

    public long getSampleDuration(int i) {
        return ((long) this.sampleDuration[i]) & 4294967295L;
    }

    public int[] getSampleDurations() {
        return this.sampleDuration;
    }

    public int getSampleFlags(int i) {
        return this.sampleFlags[i];
    }

    public long getSampleSize(int i) {
        return ((long) this.sampleSize[i]) & 4294967295L;
    }

    public int[] getSampleSizes() {
        return this.sampleSize;
    }

    public int[] getSamplesFlags() {
        return this.sampleFlags;
    }

    public boolean isDataOffsetAvailable() {
        return (this.flags & 1) != 0;
    }

    public boolean isFirstSampleFlagsAvailable() {
        return (this.flags & 4) != 0;
    }

    public boolean isSampleCompositionOffsetAvailable() {
        return (this.flags & 2048) != 0;
    }

    public boolean isSampleDurationAvailable() {
        return (this.flags & SAMPLE_DURATION_AVAILABLE) != 0;
    }

    public boolean isSampleFlagsAvailable() {
        return (this.flags & 1024) != 0;
    }

    public boolean isSampleSizeAvailable() {
        return (this.flags & 512) != 0;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        if (isSampleFlagsAvailable() && isFirstSampleFlagsAvailable()) {
            throw new RuntimeException("Broken stream");
        }
        this.sampleCount = byteBuffer.getInt();
        if (isDataOffsetAvailable()) {
            this.dataOffset = byteBuffer.getInt();
        }
        if (isFirstSampleFlagsAvailable()) {
            this.firstSampleFlags = byteBuffer.getInt();
        }
        if (isSampleDurationAvailable()) {
            this.sampleDuration = new int[this.sampleCount];
        }
        if (isSampleSizeAvailable()) {
            this.sampleSize = new int[this.sampleCount];
        }
        if (isSampleFlagsAvailable()) {
            this.sampleFlags = new int[this.sampleCount];
        }
        if (isSampleCompositionOffsetAvailable()) {
            this.sampleCompositionOffset = new int[this.sampleCount];
        }
        for (int i = 0; i < this.sampleCount; i++) {
            if (isSampleDurationAvailable()) {
                this.sampleDuration[i] = byteBuffer.getInt();
            }
            if (isSampleSizeAvailable()) {
                this.sampleSize[i] = byteBuffer.getInt();
            }
            if (isSampleFlagsAvailable()) {
                this.sampleFlags[i] = byteBuffer.getInt();
            }
            if (isSampleCompositionOffsetAvailable()) {
                this.sampleCompositionOffset[i] = byteBuffer.getInt();
            }
        }
    }

    public void setDataOffset(int i) {
        this.dataOffset = i;
    }
}
