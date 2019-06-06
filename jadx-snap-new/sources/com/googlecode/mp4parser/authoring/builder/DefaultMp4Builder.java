package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import defpackage.aqf;
import defpackage.aqh;
import defpackage.aqk;
import defpackage.aqo;
import defpackage.aqp;
import defpackage.ccy;
import defpackage.cdc;
import defpackage.cdd;
import defpackage.cde;
import defpackage.ces;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class DefaultMp4Builder {
    HashMap<cde, List<cdd>> a = new HashMap();
    private Set<StaticChunkOffsetBox> b = new HashSet();
    private Set<SampleAuxiliaryInformationOffsetsBox> c = new HashSet();
    private HashMap<cde, long[]> d = new HashMap();

    class InterleaveChunkMdat implements aqo {
        List<List<cdd>> chunkList;
        long contentSize;
        aqp parent;
        List<cde> tracks;

        private InterleaveChunkMdat(cdc cdc, Map<cde, int[]> map, long j) {
            this.chunkList = new ArrayList();
            this.contentSize = j;
            this.tracks = null;
            for (int i = 0; i < ((int[]) map.values().iterator().next()).length; i++) {
                for (cde cde : this.tracks) {
                    int[] iArr = (int[]) map.get(cde);
                    long j2 = 0;
                    for (int i2 = 0; i2 < i; i2++) {
                        j2 += (long) iArr[i2];
                    }
                    this.chunkList.add(((List) DefaultMp4Builder.this.a.get(cde)).subList(ces.a(j2), ces.a(j2 + ((long) iArr[i]))));
                }
            }
        }

        /* synthetic */ InterleaveChunkMdat(DefaultMp4Builder defaultMp4Builder, cdc cdc, Map map, long j, InterleaveChunkMdat interleaveChunkMdat) {
            this(cdc, map, j);
        }

        private boolean isSmallBox(long j) {
            return j + 8 < 4294967296L;
        }

        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                aqk.b(allocate, size);
            } else {
                aqk.b(allocate, 1);
            }
            allocate.put(aqh.a(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                aqk.a(allocate, size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
            for (List it : this.chunkList) {
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }

        public long getDataOffset() {
            long j = 16;
            aqp aqp = this;
            while (aqp instanceof aqo) {
                aqo aqo = (aqo) aqp;
                for (Object obj : aqo.getParent().getBoxes()) {
                    if (aqp == obj) {
                        break;
                    }
                    j += obj.getSize();
                }
                aqp = aqo.getParent();
            }
            return j;
        }

        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        public aqp getParent() {
            return this.parent;
        }

        public long getSize() {
            return this.contentSize + 16;
        }

        public String getType() {
            return MediaDataBox.TYPE;
        }

        public void parse(ccy ccy, ByteBuffer byteBuffer, long j, aqf aqf) {
        }

        public void setParent(aqp aqp) {
            this.parent = aqp;
        }
    }

    static {
        DefaultMp4Builder.class.desiredAssertionStatus();
        Logger.getLogger(DefaultMp4Builder.class.getName());
    }
}
