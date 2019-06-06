package org.jcodec.containers.mp4;

import org.jcodec.containers.mp4.boxes.AudioSampleEntry;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.SampleDescriptionBox;
import org.jcodec.containers.mp4.boxes.SampleSizesBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;
import org.jcodec.platform.Platform;

public class ChunkReader {
    private long[] chunkOffsets;
    private long chunkTv = 0;
    private int curChunk;
    private int s2cIndex;
    private int sampleNo;
    private SampleToChunkEntry[] sampleToChunk;
    private SampleDescriptionBox stsd;
    private SampleSizesBox stsz;
    private TimeToSampleEntry[] tts;
    private int ttsInd = 0;
    private int ttsSubInd = 0;

    public ChunkReader(TrakBox trakBox) {
        this.tts = trakBox.getStts().getEntries();
        ChunkOffsetsBox stco = trakBox.getStco();
        ChunkOffsets64Box co64 = trakBox.getCo64();
        this.stsz = trakBox.getStsz();
        SampleToChunkBox stsc = trakBox.getStsc();
        this.chunkOffsets = stco != null ? stco.getChunkOffsets() : co64.getChunkOffsets();
        this.sampleToChunk = stsc.getSampleToChunk();
        this.stsd = trakBox.getStsd();
    }

    private int getFrameSize() {
        Box box = (Box) this.stsd.getBoxes().get(this.sampleToChunk[this.s2cIndex].getEntry() - 1);
        return box instanceof AudioSampleEntry ? ((AudioSampleEntry) box).calcFrameSize() : this.stsz.getDefaultSize();
    }

    public Chunk next() {
        int i = this.curChunk;
        if (i >= this.chunkOffsets.length) {
            return null;
        }
        int i2;
        int[] iArr;
        int[] iArr2;
        int frameSize;
        int[] iArr3;
        int i3 = this.s2cIndex;
        int i4 = i3 + 1;
        SampleToChunkEntry[] sampleToChunkEntryArr = this.sampleToChunk;
        if (i4 < sampleToChunkEntryArr.length && ((long) (i + 1)) == sampleToChunkEntryArr[i3 + 1].getFirst()) {
            this.s2cIndex++;
        }
        i = this.sampleToChunk[this.s2cIndex].getCount();
        if (this.ttsSubInd + i <= this.tts[this.ttsInd].getSampleCount()) {
            i3 = this.tts[this.ttsInd].getSampleDuration();
            this.ttsSubInd += i;
            i2 = i3;
            iArr = null;
        } else {
            iArr2 = new int[i];
            for (i4 = 0; i4 < i; i4++) {
                if (this.ttsSubInd >= this.tts[this.ttsInd].getSampleCount()) {
                    int i5 = this.ttsInd;
                    if (i5 < this.tts.length - 1) {
                        this.ttsSubInd = 0;
                        this.ttsInd = i5 + 1;
                    }
                }
                iArr2[i4] = this.tts[this.ttsInd].getSampleDuration();
                this.ttsSubInd++;
            }
            iArr = iArr2;
            i2 = 0;
        }
        if (this.stsz.getDefaultSize() > 0) {
            frameSize = getFrameSize();
            iArr3 = null;
        } else {
            iArr2 = this.stsz.getSizes();
            int i6 = this.sampleNo;
            iArr3 = Platform.copyOfRangeI(iArr2, i6, i6 + i);
            frameSize = 0;
        }
        Chunk chunk = new Chunk(this.chunkOffsets[this.curChunk], this.chunkTv, i, frameSize, iArr3, i2, iArr, this.sampleToChunk[this.s2cIndex].getEntry());
        this.chunkTv += (long) chunk.getDuration();
        this.sampleNo += i;
        this.curChunk++;
        return chunk;
    }

    public int size() {
        return this.chunkOffsets.length;
    }
}
