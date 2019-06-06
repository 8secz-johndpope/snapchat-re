package defpackage;

import com.coremedia.iso.boxes.ChunkOffset64BitBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.EditBox;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MetaBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.ProtectionSchemeInformationBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SchemeInformationBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.UserDataBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.apple.AppleItemListBox;
import com.coremedia.iso.boxes.apple.AppleWaveBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.TextSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.DTSSpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom;
import com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.mp4parser.iso14496.part15.HevcConfigurationBox;
import com.mp4parser.iso14496.part30.WebVTTSampleEntry;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;
import com.mp4parser.iso23009.part1.EventMessageBox;
import com.snap.core.db.record.UnlockablesModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bol */
abstract class bol {
    public static final int A = bzo.f(SegmentIndexBox.TYPE);
    public static final int B = bzo.f(MovieBox.TYPE);
    public static final int C = bzo.f(MovieHeaderBox.TYPE);
    public static final int D = bzo.f(TrackBox.TYPE);
    public static final int E = bzo.f(MediaBox.TYPE);
    public static final int F = bzo.f(MediaInformationBox.TYPE);
    public static final int G = bzo.f(SampleTableBox.TYPE);
    public static final int H = bzo.f(AvcConfigurationBox.TYPE);
    public static final int I = bzo.f(HevcConfigurationBox.TYPE);
    public static final int J = bzo.f(ESDescriptorBox.TYPE);
    public static final int K = bzo.f(MovieFragmentBox.TYPE);
    public static final int L = bzo.f(TrackFragmentBox.TYPE);
    public static final int M = bzo.f(MovieExtendsBox.TYPE);
    public static final int N = bzo.f(MovieExtendsHeaderBox.TYPE);
    public static final int O = bzo.f(TrackHeaderBox.TYPE);
    public static final int P = bzo.f(EditBox.TYPE);
    public static final int Q = bzo.f(EditListBox.TYPE);
    public static final int R = bzo.f(MediaHeaderBox.TYPE);
    public static final int S = bzo.f(HandlerBox.TYPE);
    public static final int T = bzo.f(SampleDescriptionBox.TYPE);
    public static final int U = bzo.f(ProtectionSystemSpecificHeaderBox.TYPE);
    public static final int V = bzo.f(ProtectionSchemeInformationBox.TYPE);
    public static final int W = bzo.f(SchemeTypeBox.TYPE);
    public static final int X = bzo.f(SchemeInformationBox.TYPE);
    public static final int Y = bzo.f(TrackEncryptionBox.TYPE);
    public static final int Z = bzo.f(VisualSampleEntry.TYPE_ENCRYPTED);
    public static final int a = bzo.f(FileTypeBox.TYPE);
    public static final int aA = bzo.f(MetaBox.TYPE);
    public static final int aB = bzo.f(AppleItemListBox.TYPE);
    public static final int aC = bzo.f("mean");
    public static final int aD = bzo.f("name");
    public static final int aE = bzo.f(UnlockablesModel.DATA);
    public static final int aF = bzo.f(EventMessageBox.TYPE);
    public static final int aG = bzo.f("st3d");
    public static final int aH = bzo.f("sv3d");
    public static final int aI = bzo.f("proj");
    public static final int aJ = bzo.f("vp08");
    public static final int aK = bzo.f("vp09");
    public static final int aL = bzo.f("vpcC");
    public static final int aM = bzo.f("camm");
    public static final int aN = bzo.f("alac");
    public static final int aa = bzo.f(AudioSampleEntry.TYPE_ENCRYPTED);
    public static final int ab = bzo.f(OriginalFormatBox.TYPE);
    public static final int ac = bzo.f(SampleAuxiliaryInformationSizesBox.TYPE);
    public static final int ad = bzo.f(SampleAuxiliaryInformationOffsetsBox.TYPE);
    public static final int ae = bzo.f(SampleToGroupBox.TYPE);
    public static final int af = bzo.f(SampleGroupDescriptionBox.TYPE);
    public static final int ag = bzo.f("uuid");
    public static final int ah = bzo.f(SampleEncryptionBox.TYPE);
    public static final int ai = bzo.f(PixelAspectRationAtom.TYPE);
    public static final int aj = bzo.f("TTML");
    public static final int ak = bzo.f(VisualSampleEntry.TYPE1);
    public static final int al = bzo.f(TimeToSampleBox.TYPE);
    public static final int am = bzo.f("stss");
    public static final int an = bzo.f(CompositionTimeToSample.TYPE);
    public static final int ao = bzo.f(SampleToChunkBox.TYPE);
    public static final int ap = bzo.f(SampleSizeBox.TYPE);
    public static final int aq = bzo.f("stz2");
    public static final int ar = bzo.f(StaticChunkOffsetBox.TYPE);
    public static final int as = bzo.f(ChunkOffset64BitBox.TYPE);
    public static final int at = bzo.f(TextSampleEntry.TYPE1);
    public static final int au = bzo.f(WebVTTSampleEntry.TYPE);
    public static final int av = bzo.f(XMLSubtitleSampleEntry.TYPE);
    public static final int aw = bzo.f("c608");
    public static final int ax = bzo.f(AudioSampleEntry.TYPE1);
    public static final int ay = bzo.f(AudioSampleEntry.TYPE2);
    public static final int az = bzo.f(UserDataBox.TYPE);
    public static final int b = bzo.f(VisualSampleEntry.TYPE3);
    public static final int c = bzo.f(VisualSampleEntry.TYPE4);
    public static final int d = bzo.f(VisualSampleEntry.TYPE6);
    public static final int e = bzo.f(VisualSampleEntry.TYPE7);
    public static final int f = bzo.f(VisualSampleEntry.TYPE2);
    public static final int g = bzo.f("d263");
    public static final int h = bzo.f(MediaDataBox.TYPE);
    public static final int i = bzo.f(AudioSampleEntry.TYPE3);
    public static final int j = bzo.f(".mp3");
    public static final int k = bzo.f(AppleWaveBox.TYPE);
    public static final int l = bzo.f("lpcm");
    public static final int m = bzo.f("sowt");
    public static final int n = bzo.f(AudioSampleEntry.TYPE8);
    public static final int o = bzo.f(AC3SpecificBox.TYPE);
    public static final int p = bzo.f(AudioSampleEntry.TYPE9);
    public static final int q = bzo.f(EC3SpecificBox.TYPE);
    public static final int r = bzo.f("dtsc");
    public static final int s = bzo.f(AudioSampleEntry.TYPE12);
    public static final int t = bzo.f(AudioSampleEntry.TYPE11);
    public static final int u = bzo.f(AudioSampleEntry.TYPE13);
    public static final int v = bzo.f(DTSSpecificBox.TYPE);
    public static final int w = bzo.f(TrackFragmentBaseMediaDecodeTimeBox.TYPE);
    public static final int x = bzo.f(TrackFragmentHeaderBox.TYPE);
    public static final int y = bzo.f(TrackExtendsBox.TYPE);
    public static final int z = bzo.f(TrackRunBox.TYPE);
    public final int aO;

    /* renamed from: bol$a */
    static final class a extends bol {
        public final long aP;
        public final List<b> aQ = new ArrayList();
        public final List<a> aR = new ArrayList();

        public a(int i, long j) {
            super(i);
            this.aP = j;
        }

        public final void a(a aVar) {
            this.aR.add(aVar);
        }

        public final void a(b bVar) {
            this.aQ.add(bVar);
        }

        public final b c(int i) {
            int size = this.aQ.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.aQ.get(i2);
                if (bVar.aO == i) {
                    return bVar;
                }
            }
            return null;
        }

        public final a d(int i) {
            int size = this.aR.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.aR.get(i2);
                if (aVar.aO == i) {
                    return aVar;
                }
            }
            return null;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(bol.b(this.aO));
            stringBuilder.append(" leaves: ");
            stringBuilder.append(Arrays.toString(this.aQ.toArray()));
            stringBuilder.append(" containers: ");
            stringBuilder.append(Arrays.toString(this.aR.toArray()));
            return stringBuilder.toString();
        }
    }

    /* renamed from: bol$b */
    static final class b extends bol {
        public final bzc aP;

        public b(int i, bzc bzc) {
            super(i);
            this.aP = bzc;
        }
    }

    static {
        bzo.f(VideoMediaHeaderBox.TYPE);
    }

    public bol(int i) {
        this.aO = i;
    }

    public static int a(int i) {
        return (i >> 24) & 255;
    }

    public static String b(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((char) (i >>> 24));
        stringBuilder.append((char) ((i >> 16) & 255));
        stringBuilder.append((char) ((i >> 8) & 255));
        stringBuilder.append((char) (i & 255));
        return stringBuilder.toString();
    }

    public String toString() {
        return bol.b(this.aO);
    }
}
