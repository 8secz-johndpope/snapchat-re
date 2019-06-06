package org.jcodec.containers.mp4.boxes;

import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.TrackBox;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;

public class MovieBox extends NodeBox {
    public MovieBox(Header header) {
        super(header);
    }

    private Size applyMatrix(TrakBox trakBox, Size size) {
        int[] matrix = trakBox.getTrackHeader().getMatrix();
        double width = (double) size.getWidth();
        double d = (double) matrix[0];
        Double.isNaN(width);
        Double.isNaN(d);
        int i = (int) ((width * d) / 65536.0d);
        double height = (double) size.getHeight();
        double d2 = (double) matrix[4];
        Double.isNaN(height);
        Double.isNaN(d2);
        return new Size(i, (int) ((height * d2) / 65536.0d));
    }

    public static MovieBox createMovieBox() {
        return new MovieBox(new Header(fourcc()));
    }

    public static String fourcc() {
        return com.coremedia.iso.boxes.MovieBox.TYPE;
    }

    private MovieHeaderBox getMovieHeader() {
        return (MovieHeaderBox) NodeBox.findFirst(this, MovieHeaderBox.class, MovieHeaderBox.TYPE);
    }

    private void setTimescale(int i) {
        ((MovieHeaderBox) NodeBox.findFirst(this, MovieHeaderBox.class, MovieHeaderBox.TYPE)).setTimescale(i);
    }

    public void appendTrack(TrakBox trakBox) {
        trakBox.getTrackHeader().setNo(getMovieHeader().getNextTrackId());
        getMovieHeader().setNextTrackId(getMovieHeader().getNextTrackId() + 1);
        this.boxes.add(trakBox);
    }

    public void fixTimescale(int i) {
        int timescale = getTimescale();
        setTimescale(i);
        TrakBox[] tracks = getTracks();
        for (TrakBox trakBox : tracks) {
            long j = (long) timescale;
            trakBox.setDuration(rescale(trakBox.getDuration(), j));
            List edits = trakBox.getEdits();
            if (edits != null) {
                ListIterator listIterator = edits.listIterator();
                while (listIterator.hasNext()) {
                    Edit edit = (Edit) listIterator.next();
                    listIterator.set(new Edit(rescale(edit.getDuration(), j), edit.getMediaTime(), edit.getRate()));
                }
            }
        }
        setDuration(rescale(getDuration(), (long) timescale));
    }

    public List<TrakBox> getAudioTracks() {
        ArrayList arrayList = new ArrayList();
        TrakBox[] tracks = getTracks();
        for (TrakBox trakBox : tracks) {
            if (trakBox.isAudio()) {
                arrayList.add(trakBox);
            }
        }
        return arrayList;
    }

    public Size getDisplaySize() {
        TrakBox videoTrack = getVideoTrack();
        if (videoTrack == null) {
            return null;
        }
        ClearApertureBox clearApertureBox = (ClearApertureBox) NodeBox.findFirstPath(videoTrack, ClearApertureBox.class, Box.path("tapt.clef"));
        if (clearApertureBox != null) {
            return applyMatrix(videoTrack, new Size((int) clearApertureBox.getWidth(), (int) clearApertureBox.getHeight()));
        }
        Box box = (Box) ((SampleDescriptionBox) NodeBox.findFirstPath(videoTrack, SampleDescriptionBox.class, Box.path("mdia.minf.stbl.stsd"))).getBoxes().get(0);
        if (box == null || !(box instanceof VideoSampleEntry)) {
            return null;
        }
        VideoSampleEntry videoSampleEntry = (VideoSampleEntry) box;
        Rational par = videoTrack.getPAR();
        return applyMatrix(videoTrack, new Size((videoSampleEntry.getWidth() * par.getNum()) / par.getDen(), videoSampleEntry.getHeight()));
    }

    public long getDuration() {
        return getMovieHeader().getDuration();
    }

    public Size getStoredSize() {
        TrakBox videoTrack = getVideoTrack();
        Size size = null;
        if (videoTrack == null) {
            return null;
        }
        EncodedPixelBox encodedPixelBox = (EncodedPixelBox) NodeBox.findFirstPath(videoTrack, EncodedPixelBox.class, Box.path("tapt.enof"));
        if (encodedPixelBox != null) {
            return new Size((int) encodedPixelBox.getWidth(), (int) encodedPixelBox.getHeight());
        }
        Box box = (Box) ((SampleDescriptionBox) NodeBox.findFirstPath(videoTrack, SampleDescriptionBox.class, Box.path("mdia.minf.stbl.stsd"))).getBoxes().get(0);
        if (box != null && (box instanceof VideoSampleEntry)) {
            VideoSampleEntry videoSampleEntry = (VideoSampleEntry) box;
            size = new Size(videoSampleEntry.getWidth(), videoSampleEntry.getHeight());
        }
        return size;
    }

    public TrakBox getTimecodeTrack() {
        TrakBox[] tracks = getTracks();
        for (TrakBox trakBox : tracks) {
            if (trakBox.isTimecode()) {
                return trakBox;
            }
        }
        return null;
    }

    public int getTimescale() {
        return getMovieHeader().getTimescale();
    }

    public TrakBox[] getTracks() {
        return (TrakBox[]) NodeBox.findAll(this, TrakBox.class, TrackBox.TYPE);
    }

    public TrakBox getVideoTrack() {
        TrakBox[] tracks = getTracks();
        for (TrakBox trakBox : tracks) {
            if (trakBox.isVideo()) {
                return trakBox;
            }
        }
        return null;
    }

    public TrakBox importTrack(MovieBox movieBox, TrakBox trakBox) {
        trakBox = (TrakBox) NodeBox.cloneBox(trakBox, 1048576, this.factory);
        List<Edit> edits = trakBox.getEdits();
        ArrayList arrayList = new ArrayList();
        if (edits != null) {
            for (Edit edit : edits) {
                arrayList.add(new Edit(rescale(edit.getDuration(), (long) movieBox.getTimescale()), edit.getMediaTime(), edit.getRate()));
            }
        }
        trakBox.setEdits(arrayList);
        return trakBox;
    }

    public boolean isPureRefMovie() {
        int i = 1;
        for (TrakBox isPureRef : getTracks()) {
            i &= isPureRef.isPureRef();
        }
        return i;
    }

    public long rescale(long j, long j2) {
        return (j * ((long) getTimescale())) / j2;
    }

    public void setDuration(long j) {
        getMovieHeader().setDuration(j);
    }

    public void updateDuration() {
        TrakBox[] tracks = getTracks();
        long j = 2147483647L;
        for (TrakBox trakBox : tracks) {
            if (trakBox.getDuration() < j) {
                j = trakBox.getDuration();
            }
        }
        getMovieHeader().setDuration(j);
    }
}
