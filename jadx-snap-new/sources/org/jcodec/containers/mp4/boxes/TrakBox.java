package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.EditBox;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.UserDataBox;
import com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom;
import com.googlecode.mp4parser.boxes.apple.TimeCodeBox;
import com.googlecode.mp4parser.boxes.apple.TrackApertureModeDimensionAtom;
import java.util.List;
import java.util.ListIterator;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.containers.mp4.MP4TrackType;
import org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry;

public class TrakBox extends NodeBox {
    public TrakBox(Header header) {
        super(header);
    }

    public static TrakBox createTrakBox() {
        return new TrakBox(new Header(fourcc()));
    }

    public static String fourcc() {
        return TrackBox.TYPE;
    }

    public static long getEditedDuration(TrakBox trakBox) {
        List<Edit> edits = trakBox.getEdits();
        if (edits == null) {
            return trakBox.getDuration();
        }
        long j = 0;
        for (Edit duration : edits) {
            j += duration.getDuration();
        }
        return j;
    }

    public static MP4TrackType getTrackType(TrakBox trakBox) {
        HandlerBox handlerBox = (HandlerBox) NodeBox.findFirstPath(trakBox, HandlerBox.class, Box.path("mdia.hdlr"));
        return handlerBox == null ? null : MP4TrackType.fromHandler(handlerBox.getComponentSubType());
    }

    public void fixMediaTimescale(int i) {
        MediaHeaderBox mediaHeaderBox = (MediaHeaderBox) NodeBox.findFirstPath(this, MediaHeaderBox.class, Box.path("mdia.mdhd"));
        int timescale = mediaHeaderBox.getTimescale();
        mediaHeaderBox.setTimescale(i);
        long j = (long) i;
        long j2 = (long) timescale;
        mediaHeaderBox.setDuration((mediaHeaderBox.getDuration() * j) / j2);
        List<Edit> edits = getEdits();
        if (edits != null) {
            for (Edit edit : edits) {
                edit.setMediaTime((edit.getMediaTime() * j) / j2);
            }
        }
        TimeToSampleEntry[] entries = ((TimeToSampleBox) NodeBox.findFirstPath(this, TimeToSampleBox.class, Box.path("mdia.minf.stbl.stts"))).getEntries();
        for (TimeToSampleEntry timeToSampleEntry : entries) {
            timeToSampleEntry.setSampleDuration((timeToSampleEntry.getSampleDuration() * i) / timescale);
        }
    }

    public ChunkOffsets64Box getCo64() {
        return (ChunkOffsets64Box) NodeBox.findFirstPath(this, ChunkOffsets64Box.class, Box.path("mdia.minf.stbl.co64"));
    }

    public Size getCodedSize() {
        SampleEntry sampleEntry = getSampleEntries()[0];
        if (sampleEntry instanceof VideoSampleEntry) {
            VideoSampleEntry videoSampleEntry = (VideoSampleEntry) sampleEntry;
            return new Size(videoSampleEntry.getWidth(), videoSampleEntry.getHeight());
        }
        throw new IllegalArgumentException("Not a video track");
    }

    public CompositionOffsetsBox getCtts() {
        return (CompositionOffsetsBox) NodeBox.findFirstPath(this, CompositionOffsetsBox.class, Box.path("mdia.minf.stbl.ctts"));
    }

    public long getDuration() {
        return getTrackHeader().getDuration();
    }

    public List<Edit> getEdits() {
        EditListBox editListBox = (EditListBox) NodeBox.findFirstPath(this, EditListBox.class, Box.path("edts.elst"));
        return editListBox == null ? null : editListBox.getEdits();
    }

    public int getFrameCount() {
        SampleSizesBox sampleSizesBox = (SampleSizesBox) NodeBox.findFirstPath(this, SampleSizesBox.class, Box.path("mdia.minf.stbl.stsz"));
        return sampleSizesBox.getDefaultSize() != 0 ? sampleSizesBox.getCount() : sampleSizesBox.getSizes().length;
    }

    public String getHandlerType() {
        HandlerBox handlerBox = (HandlerBox) NodeBox.findFirstPath(this, HandlerBox.class, Box.path("mdia.hdlr"));
        return handlerBox == null ? null : handlerBox.getComponentSubType();
    }

    public MediaBox getMdia() {
        return (MediaBox) NodeBox.findFirst(this, MediaBox.class, MediaBox.TYPE);
    }

    public long getMediaDuration() {
        return ((MediaHeaderBox) NodeBox.findFirstPath(this, MediaHeaderBox.class, Box.path("mdia.mdhd"))).getDuration();
    }

    public String getName() {
        NameBox nameBox = (NameBox) NodeBox.findFirstPath(this, NameBox.class, Box.path("udta.name"));
        return nameBox == null ? null : nameBox.getName();
    }

    public Rational getPAR() {
        PixelAspectExt pixelAspectExt = (PixelAspectExt) NodeBox.findFirstPath(this, PixelAspectExt.class, new String[]{MediaBox.TYPE, MediaInformationBox.TYPE, SampleTableBox.TYPE, SampleDescriptionBox.TYPE, null, PixelAspectRationAtom.TYPE});
        return pixelAspectExt == null ? new Rational(1, 1) : pixelAspectExt.getRational();
    }

    public long getSampleCount() {
        return (long) ((SampleSizesBox) NodeBox.findFirstPath(this, SampleSizesBox.class, Box.path("mdia.minf.stbl.stsz"))).getCount();
    }

    public SampleEntry[] getSampleEntries() {
        return (SampleEntry[]) NodeBox.findAllPath(this, SampleEntry.class, new String[]{MediaBox.TYPE, MediaInformationBox.TYPE, SampleTableBox.TYPE, SampleDescriptionBox.TYPE, null});
    }

    public ChunkOffsetsBox getStco() {
        return (ChunkOffsetsBox) NodeBox.findFirstPath(this, ChunkOffsetsBox.class, Box.path("mdia.minf.stbl.stco"));
    }

    public SampleToChunkBox getStsc() {
        return (SampleToChunkBox) NodeBox.findFirstPath(this, SampleToChunkBox.class, Box.path("mdia.minf.stbl.stsc"));
    }

    public SampleDescriptionBox getStsd() {
        return (SampleDescriptionBox) NodeBox.findFirstPath(this, SampleDescriptionBox.class, Box.path("mdia.minf.stbl.stsd"));
    }

    public SyncSamplesBox getStss() {
        return (SyncSamplesBox) NodeBox.findFirstPath(this, SyncSamplesBox.class, Box.path("mdia.minf.stbl.stss"));
    }

    public SampleSizesBox getStsz() {
        return (SampleSizesBox) NodeBox.findFirstPath(this, SampleSizesBox.class, Box.path("mdia.minf.stbl.stsz"));
    }

    public TimeToSampleBox getStts() {
        return (TimeToSampleBox) NodeBox.findFirstPath(this, TimeToSampleBox.class, Box.path("mdia.minf.stbl.stts"));
    }

    public int getTimescale() {
        return ((MediaHeaderBox) NodeBox.findFirstPath(this, MediaHeaderBox.class, Box.path("mdia.mdhd"))).getTimescale();
    }

    public TrackHeaderBox getTrackHeader() {
        return (TrackHeaderBox) NodeBox.findFirst(this, TrackHeaderBox.class, TrackHeaderBox.TYPE);
    }

    public boolean hasDataRef() {
        DataInfoBox dinf = getMdia().getMinf().getDinf();
        if (dinf == null) {
            return false;
        }
        DataRefBox dref = dinf.getDref();
        if (dref == null) {
            return false;
        }
        int i = 0;
        for (Box box : dref.boxes) {
            int i2 = 1;
            if ((((FullBox) box).getFlags() & 1) == 1) {
                i2 = 0;
            }
            i |= i2;
        }
        return i;
    }

    public boolean isAudio() {
        return "soun".equals(getHandlerType());
    }

    public boolean isPureRef() {
        DataInfoBox dinf = getMdia().getMinf().getDinf();
        if (dinf == null) {
            return false;
        }
        DataRefBox dref = dinf.getDref();
        if (dref == null) {
            return false;
        }
        for (Box box : dref.boxes) {
            if ((((FullBox) box).getFlags() & 1) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isTimecode() {
        return TimeCodeBox.TYPE.equals(getHandlerType());
    }

    public boolean isVideo() {
        return "vide".equals(getHandlerType());
    }

    public long rescale(long j, long j2) {
        return (j * ((long) getTimescale())) / j2;
    }

    public void setAperture(Size size, Size size2) {
        String str = TrackApertureModeDimensionAtom.TYPE;
        removeChildren(str);
        NodeBox nodeBox = new NodeBox(new Header(str));
        nodeBox.add(ClearApertureBox.createClearApertureBox(size2.getWidth(), size2.getHeight()));
        nodeBox.add(ProductionApertureBox.createProductionApertureBox(size2.getWidth(), size2.getHeight()));
        nodeBox.add(EncodedPixelBox.createEncodedPixelBox(size.getWidth(), size.getHeight()));
        add(nodeBox);
    }

    public void setClipRect(short s, short s2, short s3, short s4) {
        String str = "clip";
        NodeBox nodeBox = (NodeBox) NodeBox.findFirst(this, NodeBox.class, str);
        if (nodeBox == null) {
            nodeBox = new NodeBox(new Header(str));
            add(nodeBox);
        }
        nodeBox.replace("crgn", ClipRegionBox.createClipRegionBox(s, s2, s3, s4));
    }

    public void setDataRef(String str) {
        MediaInfoBox minf = getMdia().getMinf();
        DataInfoBox dinf = minf.getDinf();
        if (dinf == null) {
            dinf = DataInfoBox.createDataInfoBox();
            minf.add(dinf);
        }
        DataRefBox dref = dinf.getDref();
        UrlBox createUrlBox = UrlBox.createUrlBox(str);
        if (dref == null) {
            dref = DataRefBox.createDataRefBox();
            dinf.add(dref);
            dref.add(createUrlBox);
            return;
        }
        ListIterator listIterator = dref.boxes.listIterator();
        while (listIterator.hasNext()) {
            if ((((FullBox) listIterator.next()).getFlags() & 1) != 0) {
                listIterator.set(createUrlBox);
            }
        }
    }

    public void setDimensions(Size size) {
        getTrackHeader().setWidth((float) size.getWidth());
        getTrackHeader().setHeight((float) size.getHeight());
    }

    public void setDuration(long j) {
        getTrackHeader().setDuration(j);
    }

    public void setEdits(List<Edit> list) {
        String str = EditBox.TYPE;
        NodeBox nodeBox = (NodeBox) NodeBox.findFirst(this, NodeBox.class, str);
        if (nodeBox == null) {
            nodeBox = new NodeBox(new Header(str));
            add(nodeBox);
        }
        nodeBox.removeChildren(EditListBox.TYPE);
        nodeBox.add(EditListBox.createEditListBox(list));
        getTrackHeader().setDuration(getEditedDuration(this));
    }

    public void setName(String str) {
        String str2 = UserDataBox.TYPE;
        NodeBox nodeBox = (NodeBox) NodeBox.findFirst(this, NodeBox.class, str2);
        if (nodeBox == null) {
            nodeBox = new NodeBox(new Header(str2));
            add(nodeBox);
        }
        nodeBox.removeChildren("name");
        nodeBox.add(NameBox.createNameBox(str));
    }

    public void setPAR(Rational rational) {
        SampleEntry[] sampleEntries = getSampleEntries();
        for (SampleEntry sampleEntry : sampleEntries) {
            sampleEntry.removeChildren(PixelAspectRationAtom.TYPE);
            sampleEntry.add(PixelAspectExt.createPixelAspectExt(rational));
        }
    }

    public void setTimescale(int i) {
        ((MediaHeaderBox) NodeBox.findFirstPath(this, MediaHeaderBox.class, Box.path("mdia.mdhd"))).setTimescale(i);
    }
}
