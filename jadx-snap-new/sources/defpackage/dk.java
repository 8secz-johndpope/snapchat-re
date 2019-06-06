package defpackage;

import android.content.res.AssetManager.AssetInputStream;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: dk */
public final class dk {
    static final String[] a = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    static final int[] b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] c = new byte[]{(byte) 65, (byte) 83, (byte) 67, (byte) 73, (byte) 73, (byte) 0, (byte) 0, (byte) 0};
    static final Charset d = Charset.forName("US-ASCII");
    private static int[] e = new int[]{8, 8, 8};
    private static int[] f = new int[]{8};
    private static byte[] g = new byte[]{(byte) -1, (byte) -40, (byte) -1};
    private static final byte[] h = new byte[]{(byte) 79, (byte) 76, (byte) 89, (byte) 77, (byte) 80, (byte) 0};
    private static final byte[] i = new byte[]{(byte) 79, (byte) 76, (byte) 89, (byte) 77, (byte) 80, (byte) 85, (byte) 83, (byte) 0, (byte) 73, (byte) 73};
    private static final c[] j = new c[]{new c("NewSubfileType", 254, 4, (byte) 0), new c("SubfileType", 255, 4, (byte) 0), new c("ImageWidth", 256, (byte) 0), new c("ImageLength", 257, (byte) 0), new c("BitsPerSample", 258, 3, (byte) 0), new c("Compression", 259, 3, (byte) 0), new c("PhotometricInterpretation", 262, 3, (byte) 0), new c("ImageDescription", 270, 2, (byte) 0), new c("Make", 271, 2, (byte) 0), new c("Model", 272, 2, (byte) 0), new c("StripOffsets", (int) ModuleDescriptor.MODULE_VERSION, (byte) 0), new c("Orientation", 274, 3, (byte) 0), new c("SamplesPerPixel", 277, 3, (byte) 0), new c("RowsPerStrip", 278, (byte) 0), new c("StripByteCounts", 279, (byte) 0), new c("XResolution", 282, 5, (byte) 0), new c("YResolution", 283, 5, (byte) 0), new c("PlanarConfiguration", 284, 3, (byte) 0), new c("ResolutionUnit", 296, 3, (byte) 0), new c("TransferFunction", 301, 3, (byte) 0), new c("Software", 305, 2, (byte) 0), new c("DateTime", 306, 2, (byte) 0), new c("Artist", 315, 2, (byte) 0), new c("WhitePoint", 318, 5, (byte) 0), new c("PrimaryChromaticities", 319, 5, (byte) 0), new c("SubIFDPointer", 330, 4, (byte) 0), new c("JPEGInterchangeFormat", 513, 4, (byte) 0), new c("JPEGInterchangeFormatLength", 514, 4, (byte) 0), new c("YCbCrCoefficients", 529, 5, (byte) 0), new c("YCbCrSubSampling", 530, 3, (byte) 0), new c("YCbCrPositioning", 531, 3, (byte) 0), new c("ReferenceBlackWhite", 532, 5, (byte) 0), new c("Copyright", 33432, 2, (byte) 0), new c("ExifIFDPointer", 34665, 4, (byte) 0), new c("GPSInfoIFDPointer", 34853, 4, (byte) 0), new c("SensorTopBorder", 4, 4, (byte) 0), new c("SensorLeftBorder", 5, 4, (byte) 0), new c("SensorBottomBorder", 6, 4, (byte) 0), new c("SensorRightBorder", 7, 4, (byte) 0), new c("ISO", 23, 3, (byte) 0), new c("JpgFromRaw", 46, 7, (byte) 0)};
    private static final c[] k = new c[]{new c("ExposureTime", 33434, 5, (byte) 0), new c("FNumber", 33437, 5, (byte) 0), new c("ExposureProgram", 34850, 3, (byte) 0), new c("SpectralSensitivity", 34852, 2, (byte) 0), new c("PhotographicSensitivity", 34855, 3, (byte) 0), new c("OECF", 34856, 7, (byte) 0), new c("ExifVersion", 36864, 2, (byte) 0), new c("DateTimeOriginal", 36867, 2, (byte) 0), new c("DateTimeDigitized", 36868, 2, (byte) 0), new c("ComponentsConfiguration", 37121, 7, (byte) 0), new c("CompressedBitsPerPixel", 37122, 5, (byte) 0), new c("ShutterSpeedValue", 37377, 10, (byte) 0), new c("ApertureValue", 37378, 5, (byte) 0), new c("BrightnessValue", 37379, 10, (byte) 0), new c("ExposureBiasValue", 37380, 10, (byte) 0), new c("MaxApertureValue", 37381, 5, (byte) 0), new c("SubjectDistance", 37382, 5, (byte) 0), new c("MeteringMode", 37383, 3, (byte) 0), new c("LightSource", 37384, 3, (byte) 0), new c("Flash", 37385, 3, (byte) 0), new c("FocalLength", 37386, 5, (byte) 0), new c("SubjectArea", 37396, 3, (byte) 0), new c("MakerNote", 37500, 7, (byte) 0), new c("UserComment", 37510, 7, (byte) 0), new c("SubSecTime", 37520, 2, (byte) 0), new c("SubSecTimeOriginal", 37521, 2, (byte) 0), new c("SubSecTimeDigitized", 37522, 2, (byte) 0), new c("FlashpixVersion", 40960, 7, (byte) 0), new c("ColorSpace", 40961, 3, (byte) 0), new c("PixelXDimension", 40962, (byte) 0), new c("PixelYDimension", 40963, (byte) 0), new c("RelatedSoundFile", 40964, 2, (byte) 0), new c("InteroperabilityIFDPointer", 40965, 4, (byte) 0), new c("FlashEnergy", 41483, 5, (byte) 0), new c("SpatialFrequencyResponse", 41484, 7, (byte) 0), new c("FocalPlaneXResolution", 41486, 5, (byte) 0), new c("FocalPlaneYResolution", 41487, 5, (byte) 0), new c("FocalPlaneResolutionUnit", 41488, 3, (byte) 0), new c("SubjectLocation", 41492, 3, (byte) 0), new c("ExposureIndex", 41493, 5, (byte) 0), new c("SensingMethod", 41495, 3, (byte) 0), new c("FileSource", 41728, 7, (byte) 0), new c("SceneType", 41729, 7, (byte) 0), new c("CFAPattern", 41730, 7, (byte) 0), new c("CustomRendered", 41985, 3, (byte) 0), new c("ExposureMode", 41986, 3, (byte) 0), new c("WhiteBalance", 41987, 3, (byte) 0), new c("DigitalZoomRatio", 41988, 5, (byte) 0), new c("FocalLengthIn35mmFilm", 41989, 3, (byte) 0), new c("SceneCaptureType", 41990, 3, (byte) 0), new c("GainControl", 41991, 3, (byte) 0), new c("Contrast", 41992, 3, (byte) 0), new c("Saturation", 41993, 3, (byte) 0), new c("Sharpness", 41994, 3, (byte) 0), new c("DeviceSettingDescription", 41995, 7, (byte) 0), new c("SubjectDistanceRange", 41996, 3, (byte) 0), new c("ImageUniqueID", 42016, 2, (byte) 0), new c("DNGVersion", 50706, 1, (byte) 0), new c("DefaultCropSize", 50720, (byte) 0)};
    private static final c[] l = new c[]{new c("GPSVersionID", 0, 1, (byte) 0), new c("GPSLatitudeRef", 1, 2, (byte) 0), new c("GPSLatitude", 2, 5, (byte) 0), new c("GPSLongitudeRef", 3, 2, (byte) 0), new c("GPSLongitude", 4, 5, (byte) 0), new c("GPSAltitudeRef", 5, 1, (byte) 0), new c("GPSAltitude", 6, 5, (byte) 0), new c("GPSTimeStamp", 7, 5, (byte) 0), new c("GPSSatellites", 8, 2, (byte) 0), new c("GPSStatus", 9, 2, (byte) 0), new c("GPSMeasureMode", 10, 2, (byte) 0), new c("GPSDOP", 11, 5, (byte) 0), new c("GPSSpeedRef", 12, 2, (byte) 0), new c("GPSSpeed", 13, 5, (byte) 0), new c("GPSTrackRef", 14, 2, (byte) 0), new c("GPSTrack", 15, 5, (byte) 0), new c("GPSImgDirectionRef", 16, 2, (byte) 0), new c("GPSImgDirection", 17, 5, (byte) 0), new c("GPSMapDatum", 18, 2, (byte) 0), new c("GPSDestLatitudeRef", 19, 2, (byte) 0), new c("GPSDestLatitude", 20, 5, (byte) 0), new c("GPSDestLongitudeRef", 21, 2, (byte) 0), new c("GPSDestLongitude", 22, 5, (byte) 0), new c("GPSDestBearingRef", 23, 2, (byte) 0), new c("GPSDestBearing", 24, 5, (byte) 0), new c("GPSDestDistanceRef", 25, 2, (byte) 0), new c("GPSDestDistance", 26, 5, (byte) 0), new c("GPSProcessingMethod", 27, 7, (byte) 0), new c("GPSAreaInformation", 28, 7, (byte) 0), new c("GPSDateStamp", 29, 2, (byte) 0), new c("GPSDifferential", 30, 3, (byte) 0)};
    private static final c[] m = new c[]{new c("InteroperabilityIndex", 1, 2, (byte) 0)};
    private static final c[] n = new c[]{new c("NewSubfileType", 254, 4, (byte) 0), new c("SubfileType", 255, 4, (byte) 0), new c("ThumbnailImageWidth", 256, (byte) 0), new c("ThumbnailImageLength", 257, (byte) 0), new c("BitsPerSample", 258, 3, (byte) 0), new c("Compression", 259, 3, (byte) 0), new c("PhotometricInterpretation", 262, 3, (byte) 0), new c("ImageDescription", 270, 2, (byte) 0), new c("Make", 271, 2, (byte) 0), new c("Model", 272, 2, (byte) 0), new c("StripOffsets", (int) ModuleDescriptor.MODULE_VERSION, (byte) 0), new c("Orientation", 274, 3, (byte) 0), new c("SamplesPerPixel", 277, 3, (byte) 0), new c("RowsPerStrip", 278, (byte) 0), new c("StripByteCounts", 279, (byte) 0), new c("XResolution", 282, 5, (byte) 0), new c("YResolution", 283, 5, (byte) 0), new c("PlanarConfiguration", 284, 3, (byte) 0), new c("ResolutionUnit", 296, 3, (byte) 0), new c("TransferFunction", 301, 3, (byte) 0), new c("Software", 305, 2, (byte) 0), new c("DateTime", 306, 2, (byte) 0), new c("Artist", 315, 2, (byte) 0), new c("WhitePoint", 318, 5, (byte) 0), new c("PrimaryChromaticities", 319, 5, (byte) 0), new c("SubIFDPointer", 330, 4, (byte) 0), new c("JPEGInterchangeFormat", 513, 4, (byte) 0), new c("JPEGInterchangeFormatLength", 514, 4, (byte) 0), new c("YCbCrCoefficients", 529, 5, (byte) 0), new c("YCbCrSubSampling", 530, 3, (byte) 0), new c("YCbCrPositioning", 531, 3, (byte) 0), new c("ReferenceBlackWhite", 532, 5, (byte) 0), new c("Copyright", 33432, 2, (byte) 0), new c("ExifIFDPointer", 34665, 4, (byte) 0), new c("GPSInfoIFDPointer", 34853, 4, (byte) 0), new c("DNGVersion", 50706, 1, (byte) 0), new c("DefaultCropSize", 50720, (byte) 0)};
    private static final c o = new c("StripOffsets", ModuleDescriptor.MODULE_VERSION, 3, (byte) 0);
    private static final c[] p = new c[]{new c("ThumbnailImage", 256, 7, (byte) 0), new c("CameraSettingsIFDPointer", 8224, 4, (byte) 0), new c("ImageProcessingIFDPointer", 8256, 4, (byte) 0)};
    private static final c[] q = new c[]{new c("PreviewImageStart", 257, 4, (byte) 0), new c("PreviewImageLength", 258, 4, (byte) 0)};
    private static final c[] r = new c[]{new c("AspectFrame", 4371, 3, (byte) 0)};
    private static final c[] s = new c[]{new c("ColorSpace", 55, 3, (byte) 0)};
    private static c[][] t;
    private static final c[] u = new c[]{new c("SubIFDPointer", 330, 4, (byte) 0), new c("ExifIFDPointer", 34665, 4, (byte) 0), new c("GPSInfoIFDPointer", 34853, 4, (byte) 0), new c("InteroperabilityIFDPointer", 40965, 4, (byte) 0), new c("CameraSettingsIFDPointer", 8224, 1, (byte) 0), new c("ImageProcessingIFDPointer", 8256, 1, (byte) 0)};
    private static final HashMap<Integer, c>[] v = new HashMap[10];
    private static final HashMap<String, c>[] w = new HashMap[10];
    private static final HashSet<String> x = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    private static final HashMap<Integer, Integer> y = new HashMap();
    private static byte[] z = "Exif\u0000\u0000".getBytes(d);
    private final String A;
    private final AssetInputStream B;
    private int C;
    private final HashMap<String, b>[] D = new HashMap[10];
    private ByteOrder E = ByteOrder.BIG_ENDIAN;
    private boolean F;
    private int G;
    private int H;
    private byte[] I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;

    /* renamed from: dk$a */
    static class a extends InputStream implements DataInput {
        private static final ByteOrder d = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder e = ByteOrder.BIG_ENDIAN;
        ByteOrder a;
        final int b;
        int c;
        private DataInputStream f;

        public a(InputStream inputStream) {
            this.a = ByteOrder.BIG_ENDIAN;
            this.f = new DataInputStream(inputStream);
            this.b = this.f.available();
            this.c = 0;
            this.f.mark(this.b);
        }

        public a(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        public final long a() {
            return ((long) readInt()) & 4294967295L;
        }

        public final void a(long j) {
            int i = this.c;
            if (((long) i) > j) {
                this.c = 0;
                this.f.reset();
                this.f.mark(this.b);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public final int available() {
            return this.f.available();
        }

        public final int read() {
            this.c++;
            return this.f.read();
        }

        public final int read(byte[] bArr, int i, int i2) {
            int read = this.f.read(bArr, i, i2);
            this.c += read;
            return read;
        }

        public final boolean readBoolean() {
            this.c++;
            return this.f.readBoolean();
        }

        public final byte readByte() {
            this.c++;
            if (this.c <= this.b) {
                int read = this.f.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final char readChar() {
            this.c += 2;
            return this.f.readChar();
        }

        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public final void readFully(byte[] bArr) {
            this.c += bArr.length;
            if (this.c > this.b) {
                throw new EOFException();
            } else if (this.f.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public final void readFully(byte[] bArr, int i, int i2) {
            this.c += i2;
            if (this.c > this.b) {
                throw new EOFException();
            } else if (this.f.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public final int readInt() {
            this.c += 4;
            if (this.c <= this.b) {
                int read = this.f.read();
                int read2 = this.f.read();
                int read3 = this.f.read();
                int read4 = this.f.read();
                if ((((read | read2) | read3) | read4) >= 0) {
                    ByteOrder byteOrder = this.a;
                    if (byteOrder == d) {
                        return (((read4 << 24) + (read3 << 16)) + (read2 << 8)) + read;
                    }
                    if (byteOrder == e) {
                        return (((read << 24) + (read2 << 16)) + (read3 << 8)) + read4;
                    }
                    StringBuilder stringBuilder = new StringBuilder("Invalid byte order: ");
                    stringBuilder.append(this.a);
                    throw new IOException(stringBuilder.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public final long readLong() {
            this.c += 8;
            if (this.c <= this.b) {
                int read = this.f.read();
                int read2 = this.f.read();
                int read3 = this.f.read();
                int read4 = this.f.read();
                int read5 = this.f.read();
                int read6 = this.f.read();
                int read7 = this.f.read();
                int read8 = this.f.read();
                if ((((((((read | read2) | read3) | read4) | read5) | read6) | read7) | read8) >= 0) {
                    ByteOrder byteOrder = this.a;
                    if (byteOrder == d) {
                        return (((((((((long) read8) << 56) + (((long) read7) << 48)) + (((long) read6) << 40)) + (((long) read5) << 32)) + (((long) read4) << 24)) + (((long) read3) << 16)) + (((long) read2) << 8)) + ((long) read);
                    }
                    int i = read2;
                    if (byteOrder == e) {
                        return (((((((((long) read) << 56) + (((long) i) << 48)) + (((long) read3) << 40)) + (((long) read4) << 32)) + (((long) read5) << 24)) + (((long) read6) << 16)) + (((long) read7) << 8)) + ((long) read8);
                    }
                    StringBuilder stringBuilder = new StringBuilder("Invalid byte order: ");
                    stringBuilder.append(this.a);
                    throw new IOException(stringBuilder.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final short readShort() {
            this.c += 2;
            if (this.c <= this.b) {
                int read = this.f.read();
                int read2 = this.f.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.a;
                    if (byteOrder == d) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == e) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder stringBuilder = new StringBuilder("Invalid byte order: ");
                    stringBuilder.append(this.a);
                    throw new IOException(stringBuilder.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final String readUTF() {
            this.c += 2;
            return this.f.readUTF();
        }

        public final int readUnsignedByte() {
            this.c++;
            return this.f.readUnsignedByte();
        }

        public final int readUnsignedShort() {
            this.c += 2;
            if (this.c <= this.b) {
                int read = this.f.read();
                int read2 = this.f.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.a;
                    if (byteOrder == d) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == e) {
                        return (read << 8) + read2;
                    }
                    StringBuilder stringBuilder = new StringBuilder("Invalid byte order: ");
                    stringBuilder.append(this.a);
                    throw new IOException(stringBuilder.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final int skipBytes(int i) {
            i = Math.min(i, this.b - this.c);
            int i2 = 0;
            while (i2 < i) {
                i2 += this.f.skipBytes(i - i2);
            }
            this.c += i2;
            return i2;
        }
    }

    /* renamed from: dk$b */
    static class b {
        public final int a;
        public final byte[] b;
        private int c;

        private b(int i, int i2, byte[] bArr) {
            this.a = i;
            this.c = i2;
            this.b = bArr;
        }

        /* synthetic */ b(int i, int i2, byte[] bArr, byte b) {
            this(i, i2, bArr);
        }

        public static b a(int i, ByteOrder byteOrder) {
            return b.a(new int[]{i}, byteOrder);
        }

        public static b a(long j, ByteOrder byteOrder) {
            return b.a(new long[]{j}, byteOrder);
        }

        public static b a(d dVar, ByteOrder byteOrder) {
            return b.a(new d[]{dVar}, byteOrder);
        }

        public static b a(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(0);
            byte[] bytes = stringBuilder.toString().getBytes(dk.d);
            return new b(2, bytes.length, bytes);
        }

        private static b a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[dk.b[3]]);
            wrap.order(byteOrder);
            for (int i = 0; i <= 0; i++) {
                wrap.putShort((short) iArr[0]);
            }
            return new b(3, 1, wrap.array());
        }

        private static b a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[dk.b[4]]);
            wrap.order(byteOrder);
            for (int i = 0; i <= 0; i++) {
                wrap.putInt((int) jArr[0]);
            }
            return new b(4, 1, wrap.array());
        }

        private static b a(d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[dk.b[5]]);
            wrap.order(byteOrder);
            for (int i = 0; i <= 0; i++) {
                d dVar = dVarArr[0];
                wrap.putInt((int) dVar.a);
                wrap.putInt((int) dVar.b);
            }
            return new b(5, 1, wrap.array());
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:182:0x01b0 in {9, 15, 18, 20, 21, 27, 30, 32, 33, 39, 42, 44, 45, 51, 54, 56, 57, 63, 66, 68, 69, 75, 78, 80, 81, 87, 90, 92, 93, 99, 102, 104, 105, 113, 114, 116, 124, 125, 126, 130, 132, 133, 144, 146, 147, 152, 154, 155, 157, 158, 160, 162, 164, 170, 172, 173, 174, 178, 180, 181} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final java.lang.Object a(java.nio.ByteOrder r13) {
            /*
            r12 = this;
            r0 = "IOException occurred while closing InputStream";
            r1 = "ExifInterface";
            r2 = 0;
            r3 = new dk$a;	 Catch:{ IOException -> 0x0192, all -> 0x018f }
            r4 = r12.b;	 Catch:{ IOException -> 0x0192, all -> 0x018f }
            r3.<init>(r4);	 Catch:{ IOException -> 0x0192, all -> 0x018f }
            r3.a = r13;	 Catch:{ IOException -> 0x018d }
            r13 = r12.a;	 Catch:{ IOException -> 0x018d }
            r4 = 1;
            r5 = 0;
            switch(r13) {
                case 1: goto L_0x014c;
                case 2: goto L_0x0103;
                case 3: goto L_0x00e9;
                case 4: goto L_0x00cf;
                case 5: goto L_0x00aa;
                case 6: goto L_0x014c;
                case 7: goto L_0x0103;
                case 8: goto L_0x0090;
                case 9: goto L_0x0076;
                case 10: goto L_0x004f;
                case 11: goto L_0x0034;
                case 12: goto L_0x001a;
                default: goto L_0x0015;
            };
            r3.close();	 Catch:{ IOException -> 0x0188 }
            goto L_0x018c;
            r13 = r12.c;	 Catch:{ IOException -> 0x018d }
            r13 = new double[r13];	 Catch:{ IOException -> 0x018d }
            r4 = r12.c;	 Catch:{ IOException -> 0x018d }
            if (r5 >= r4) goto L_0x002b;	 Catch:{ IOException -> 0x018d }
            r6 = r3.readDouble();	 Catch:{ IOException -> 0x018d }
            r13[r5] = r6;	 Catch:{ IOException -> 0x018d }
            r5 = r5 + 1;
            goto L_0x001e;
            r3.close();	 Catch:{ IOException -> 0x002f }
            goto L_0x0033;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = r12.c;	 Catch:{ IOException -> 0x018d }
            r13 = new double[r13];	 Catch:{ IOException -> 0x018d }
            r4 = r12.c;	 Catch:{ IOException -> 0x018d }
            if (r5 >= r4) goto L_0x0046;	 Catch:{ IOException -> 0x018d }
            r4 = r3.readFloat();	 Catch:{ IOException -> 0x018d }
            r6 = (double) r4;	 Catch:{ IOException -> 0x018d }
            r13[r5] = r6;	 Catch:{ IOException -> 0x018d }
            r5 = r5 + 1;
            goto L_0x0038;
            r3.close();	 Catch:{ IOException -> 0x004a }
            goto L_0x004e;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = r12.c;	 Catch:{ IOException -> 0x018d }
            r13 = new defpackage.dk.d[r13];	 Catch:{ IOException -> 0x018d }
            r4 = r12.c;	 Catch:{ IOException -> 0x018d }
            if (r5 >= r4) goto L_0x006d;	 Catch:{ IOException -> 0x018d }
            r4 = r3.readInt();	 Catch:{ IOException -> 0x018d }
            r7 = (long) r4;	 Catch:{ IOException -> 0x018d }
            r4 = r3.readInt();	 Catch:{ IOException -> 0x018d }
            r9 = (long) r4;	 Catch:{ IOException -> 0x018d }
            r4 = new dk$d;	 Catch:{ IOException -> 0x018d }
            r11 = 0;	 Catch:{ IOException -> 0x018d }
            r6 = r4;	 Catch:{ IOException -> 0x018d }
            r6.<init>(r7, r9, r11);	 Catch:{ IOException -> 0x018d }
            r13[r5] = r4;	 Catch:{ IOException -> 0x018d }
            r5 = r5 + 1;
            goto L_0x0053;
            r3.close();	 Catch:{ IOException -> 0x0071 }
            goto L_0x0075;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = r12.c;	 Catch:{ IOException -> 0x018d }
            r13 = new int[r13];	 Catch:{ IOException -> 0x018d }
            r4 = r12.c;	 Catch:{ IOException -> 0x018d }
            if (r5 >= r4) goto L_0x0087;	 Catch:{ IOException -> 0x018d }
            r4 = r3.readInt();	 Catch:{ IOException -> 0x018d }
            r13[r5] = r4;	 Catch:{ IOException -> 0x018d }
            r5 = r5 + 1;
            goto L_0x007a;
            r3.close();	 Catch:{ IOException -> 0x008b }
            goto L_0x008f;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = r12.c;	 Catch:{ IOException -> 0x018d }
            r13 = new int[r13];	 Catch:{ IOException -> 0x018d }
            r4 = r12.c;	 Catch:{ IOException -> 0x018d }
            if (r5 >= r4) goto L_0x00a1;	 Catch:{ IOException -> 0x018d }
            r4 = r3.readShort();	 Catch:{ IOException -> 0x018d }
            r13[r5] = r4;	 Catch:{ IOException -> 0x018d }
            r5 = r5 + 1;
            goto L_0x0094;
            r3.close();	 Catch:{ IOException -> 0x00a5 }
            goto L_0x00a9;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = r12.c;	 Catch:{ IOException -> 0x018d }
            r13 = new defpackage.dk.d[r13];	 Catch:{ IOException -> 0x018d }
            r4 = r12.c;	 Catch:{ IOException -> 0x018d }
            if (r5 >= r4) goto L_0x00c6;	 Catch:{ IOException -> 0x018d }
            r7 = r3.a();	 Catch:{ IOException -> 0x018d }
            r9 = r3.a();	 Catch:{ IOException -> 0x018d }
            r4 = new dk$d;	 Catch:{ IOException -> 0x018d }
            r11 = 0;	 Catch:{ IOException -> 0x018d }
            r6 = r4;	 Catch:{ IOException -> 0x018d }
            r6.<init>(r7, r9, r11);	 Catch:{ IOException -> 0x018d }
            r13[r5] = r4;	 Catch:{ IOException -> 0x018d }
            r5 = r5 + 1;
            goto L_0x00ae;
            r3.close();	 Catch:{ IOException -> 0x00ca }
            goto L_0x00ce;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = r12.c;	 Catch:{ IOException -> 0x018d }
            r13 = new long[r13];	 Catch:{ IOException -> 0x018d }
            r4 = r12.c;	 Catch:{ IOException -> 0x018d }
            if (r5 >= r4) goto L_0x00e0;	 Catch:{ IOException -> 0x018d }
            r6 = r3.a();	 Catch:{ IOException -> 0x018d }
            r13[r5] = r6;	 Catch:{ IOException -> 0x018d }
            r5 = r5 + 1;
            goto L_0x00d3;
            r3.close();	 Catch:{ IOException -> 0x00e4 }
            goto L_0x00e8;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = r12.c;	 Catch:{ IOException -> 0x018d }
            r13 = new int[r13];	 Catch:{ IOException -> 0x018d }
            r4 = r12.c;	 Catch:{ IOException -> 0x018d }
            if (r5 >= r4) goto L_0x00fa;	 Catch:{ IOException -> 0x018d }
            r4 = r3.readUnsignedShort();	 Catch:{ IOException -> 0x018d }
            r13[r5] = r4;	 Catch:{ IOException -> 0x018d }
            r5 = r5 + 1;
            goto L_0x00ed;
            r3.close();	 Catch:{ IOException -> 0x00fe }
            goto L_0x0102;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = r12.c;	 Catch:{ IOException -> 0x018d }
            r6 = 8;	 Catch:{ IOException -> 0x018d }
            if (r13 < r6) goto L_0x011f;	 Catch:{ IOException -> 0x018d }
            r13 = 0;	 Catch:{ IOException -> 0x018d }
            if (r13 >= r6) goto L_0x011b;	 Catch:{ IOException -> 0x018d }
            r7 = r12.b;	 Catch:{ IOException -> 0x018d }
            r7 = r7[r13];	 Catch:{ IOException -> 0x018d }
            r8 = defpackage.dk.c;	 Catch:{ IOException -> 0x018d }
            r8 = r8[r13];	 Catch:{ IOException -> 0x018d }
            if (r7 == r8) goto L_0x0118;	 Catch:{ IOException -> 0x018d }
            r4 = 0;	 Catch:{ IOException -> 0x018d }
            goto L_0x011b;	 Catch:{ IOException -> 0x018d }
            r13 = r13 + 1;	 Catch:{ IOException -> 0x018d }
            goto L_0x010a;	 Catch:{ IOException -> 0x018d }
            if (r4 == 0) goto L_0x011f;	 Catch:{ IOException -> 0x018d }
            r5 = 8;	 Catch:{ IOException -> 0x018d }
            r13 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x018d }
            r13.<init>();	 Catch:{ IOException -> 0x018d }
            r4 = r12.c;	 Catch:{ IOException -> 0x018d }
            if (r5 >= r4) goto L_0x013f;	 Catch:{ IOException -> 0x018d }
            r4 = r12.b;	 Catch:{ IOException -> 0x018d }
            r4 = r4[r5];	 Catch:{ IOException -> 0x018d }
            if (r4 == 0) goto L_0x013f;	 Catch:{ IOException -> 0x018d }
            r6 = 32;	 Catch:{ IOException -> 0x018d }
            if (r4 < r6) goto L_0x0137;	 Catch:{ IOException -> 0x018d }
            r4 = (char) r4;	 Catch:{ IOException -> 0x018d }
            r13.append(r4);	 Catch:{ IOException -> 0x018d }
            goto L_0x013c;	 Catch:{ IOException -> 0x018d }
            r4 = 63;	 Catch:{ IOException -> 0x018d }
            r13.append(r4);	 Catch:{ IOException -> 0x018d }
            r5 = r5 + 1;	 Catch:{ IOException -> 0x018d }
            goto L_0x0124;	 Catch:{ IOException -> 0x018d }
            r13 = r13.toString();	 Catch:{ IOException -> 0x018d }
            r3.close();	 Catch:{ IOException -> 0x0147 }
            goto L_0x014b;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = r12.b;	 Catch:{ IOException -> 0x018d }
            r13 = r13.length;	 Catch:{ IOException -> 0x018d }
            if (r13 != r4) goto L_0x0176;	 Catch:{ IOException -> 0x018d }
            r13 = r12.b;	 Catch:{ IOException -> 0x018d }
            r13 = r13[r5];	 Catch:{ IOException -> 0x018d }
            if (r13 < 0) goto L_0x0176;	 Catch:{ IOException -> 0x018d }
            r13 = r12.b;	 Catch:{ IOException -> 0x018d }
            r13 = r13[r5];	 Catch:{ IOException -> 0x018d }
            if (r13 > r4) goto L_0x0176;	 Catch:{ IOException -> 0x018d }
            r13 = new java.lang.String;	 Catch:{ IOException -> 0x018d }
            r4 = new char[r4];	 Catch:{ IOException -> 0x018d }
            r6 = r12.b;	 Catch:{ IOException -> 0x018d }
            r6 = r6[r5];	 Catch:{ IOException -> 0x018d }
            r6 = r6 + 48;	 Catch:{ IOException -> 0x018d }
            r6 = (char) r6;	 Catch:{ IOException -> 0x018d }
            r4[r5] = r6;	 Catch:{ IOException -> 0x018d }
            r13.<init>(r4);	 Catch:{ IOException -> 0x018d }
            r3.close();	 Catch:{ IOException -> 0x0171 }
            goto L_0x0175;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = new java.lang.String;	 Catch:{ IOException -> 0x018d }
            r4 = r12.b;	 Catch:{ IOException -> 0x018d }
            r5 = defpackage.dk.d;	 Catch:{ IOException -> 0x018d }
            r13.<init>(r4, r5);	 Catch:{ IOException -> 0x018d }
            r3.close();	 Catch:{ IOException -> 0x0183 }
            goto L_0x0187;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            return r13;
            r13 = move-exception;
            android.util.Log.e(r1, r0, r13);
            return r2;
            r13 = move-exception;
            goto L_0x0194;
            r13 = move-exception;
            r3 = r2;
            goto L_0x01a5;
            r13 = move-exception;
            r3 = r2;
            r4 = "IOException occurred during reading a value";	 Catch:{ all -> 0x01a4 }
            android.util.Log.w(r1, r4, r13);	 Catch:{ all -> 0x01a4 }
            if (r3 == 0) goto L_0x01a3;
            r3.close();	 Catch:{ IOException -> 0x019f }
            goto L_0x01a3;
            r13 = move-exception;
            android.util.Log.e(r1, r0, r13);
            return r2;
            r13 = move-exception;
            if (r3 == 0) goto L_0x01af;
            r3.close();	 Catch:{ IOException -> 0x01ab }
            goto L_0x01af;
            r2 = move-exception;
            android.util.Log.e(r1, r0, r2);
            throw r13;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dk$b.a(java.nio.ByteOrder):java.lang.Object");
        }

        public final int b(ByteOrder byteOrder) {
            Object a = a(byteOrder);
            if (a == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (a instanceof String) {
                return Integer.parseInt((String) a);
            } else {
                String str = "There are more than one component";
                if (a instanceof long[]) {
                    long[] jArr = (long[]) a;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (a instanceof int[]) {
                    int[] iArr = (int[]) a;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public final String c(ByteOrder byteOrder) {
            Object a = a(byteOrder);
            if (a == null) {
                return null;
            }
            if (a instanceof String) {
                return (String) a;
            }
            StringBuilder stringBuilder = new StringBuilder();
            boolean z = a instanceof long[];
            String str = ppy.b;
            int i = 0;
            if (z) {
                long[] jArr = (long[]) a;
                while (i < jArr.length) {
                    stringBuilder.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        stringBuilder.append(str);
                    }
                }
                return stringBuilder.toString();
            } else if (a instanceof int[]) {
                int[] iArr = (int[]) a;
                while (i < iArr.length) {
                    stringBuilder.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        stringBuilder.append(str);
                    }
                }
                return stringBuilder.toString();
            } else if (a instanceof double[]) {
                double[] dArr = (double[]) a;
                while (i < dArr.length) {
                    stringBuilder.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        stringBuilder.append(str);
                    }
                }
                return stringBuilder.toString();
            } else if (!(a instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) a;
                while (i < dVarArr.length) {
                    stringBuilder.append(dVarArr[i].a);
                    stringBuilder.append('/');
                    stringBuilder.append(dVarArr[i].b);
                    i++;
                    if (i != dVarArr.length) {
                        stringBuilder.append(str);
                    }
                }
                return stringBuilder.toString();
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("(");
            stringBuilder.append(dk.a[this.a]);
            stringBuilder.append(", data length:");
            stringBuilder.append(this.b.length);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: dk$c */
    static class c {
        public final int a;
        public final String b;
        public final int c;
        private int d;

        private c(String str, int i) {
            this.b = str;
            this.a = i;
            this.c = 3;
            this.d = 4;
        }

        private c(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        /* synthetic */ c(String str, int i, int i2, byte b) {
            this(str, i, i2);
        }

        /* Access modifiers changed, original: final */
        public final boolean a(int i) {
            int i2 = this.c;
            if (!(i2 == 7 || i == 7 || i2 == i)) {
                int i3 = this.d;
                if (i3 != i) {
                    return ((i2 == 4 || i3 == 4) && i == 3) ? true : ((this.c == 9 || this.d == 9) && i == 8) ? true : (this.c == 12 || this.d == 12) && i == 11;
                }
            }
            return true;
        }
    }

    /* renamed from: dk$d */
    static class d {
        public final long a;
        public final long b;

        private d(long j, long j2) {
            if (j2 == 0) {
                this.a = 0;
                this.b = 1;
                return;
            }
            this.a = j;
            this.b = j2;
        }

        /* synthetic */ d(long j, long j2, byte b) {
            this(j, j2);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("/");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    static {
        Integer[] numArr = new Integer[4];
        Integer valueOf = Integer.valueOf(1);
        numArr[0] = valueOf;
        numArr[1] = Integer.valueOf(6);
        Integer valueOf2 = Integer.valueOf(3);
        Integer valueOf3 = Integer.valueOf(2);
        numArr[2] = valueOf2;
        Integer valueOf4 = Integer.valueOf(8);
        numArr[3] = valueOf4;
        Arrays.asList(numArr);
        numArr = new Integer[4];
        Integer valueOf5 = Integer.valueOf(7);
        numArr[1] = valueOf5;
        numArr[2] = Integer.valueOf(4);
        Integer valueOf6 = Integer.valueOf(5);
        numArr[3] = valueOf6;
        Arrays.asList(numArr);
        r2 = new c[10][];
        c[] cVarArr = j;
        r2[0] = cVarArr;
        r2[1] = k;
        r2[2] = l;
        r2[3] = m;
        r2[4] = n;
        r2[5] = cVarArr;
        r2[6] = p;
        r2[7] = q;
        r2[8] = r;
        r2[9] = s;
        t = r2;
        c cVar = new c("JPEGInterchangeFormat", 513, 4, (byte) 0);
        cVar = new c("JPEGInterchangeFormatLength", 514, 4, (byte) 0);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < 10; i++) {
            v[i] = new HashMap();
            w[i] = new HashMap();
            for (c cVar2 : t[i]) {
                v[i].put(Integer.valueOf(cVar2.a), cVar2);
                w[i].put(cVar2.b, cVar2);
            }
        }
        y.put(Integer.valueOf(u[0].a), valueOf6);
        y.put(Integer.valueOf(u[1].a), valueOf);
        y.put(Integer.valueOf(u[2].a), valueOf3);
        y.put(Integer.valueOf(u[3].a), valueOf2);
        y.put(Integer.valueOf(u[4].a), valueOf5);
        y.put(Integer.valueOf(u[5].a), valueOf4);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public dk(InputStream inputStream) {
        if (inputStream != null) {
            AssetInputStream assetInputStream = null;
            this.A = null;
            if (inputStream instanceof AssetInputStream) {
                assetInputStream = (AssetInputStream) inputStream;
            }
            this.B = assetInputStream;
            a(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    private b a(String str) {
        Object str2;
        if ("ISOSpeedRatings".equals(str2)) {
            str2 = "PhotographicSensitivity";
        }
        for (int i = 0; i < 10; i++) {
            b bVar = (b) this.D[i].get(str2);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    private void a() {
        String b = b("DateTimeOriginal");
        if (b != null) {
            String str = "DateTime";
            if (b(str) == null) {
                this.D[0].put(str, b.a(b));
            }
        }
        b = "ImageWidth";
        if (b(b) == null) {
            this.D[0].put(b, b.a(0, this.E));
        }
        b = "ImageLength";
        if (b(b) == null) {
            this.D[0].put(b, b.a(0, this.E));
        }
        b = "Orientation";
        if (b(b) == null) {
            this.D[0].put(b, b.a(0, this.E));
        }
        b = "LightSource";
        if (b(b) == null) {
            this.D[1].put(b, b.a(0, this.E));
        }
    }

    private void a(int i, int i2) {
        if (!this.D[i].isEmpty() && !this.D[i2].isEmpty()) {
            String str = "ImageLength";
            b bVar = (b) this.D[i].get(str);
            String str2 = "ImageWidth";
            b bVar2 = (b) this.D[i].get(str2);
            b bVar3 = (b) this.D[i2].get(str);
            b bVar4 = (b) this.D[i2].get(str2);
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int b = bVar.b(this.E);
                int b2 = bVar2.b(this.E);
                int b3 = bVar3.b(this.E);
                int b4 = bVar4.b(this.E);
                if (b < b3 && b2 < b4) {
                    HashMap[] hashMapArr = this.D;
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    private void a(a aVar) {
        a(aVar, aVar.available());
        b(aVar, 0);
        d(aVar, 0);
        d(aVar, 5);
        d(aVar, 4);
        b();
        if (this.C == 8) {
            b bVar = (b) this.D[1].get("MakerNote");
            if (bVar != null) {
                a aVar2 = new a(bVar.b);
                aVar2.a = this.E;
                aVar2.a(6);
                b(aVar2, 9);
                String str = "ColorSpace";
                bVar = (b) this.D[9].get(str);
                if (bVar != null) {
                    this.D[1].put(str, bVar);
                }
            }
        }
    }

    private void a(a aVar, int i) {
        this.E = dk.c(aVar);
        aVar.a = this.E;
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.C;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            readUnsignedShort = aVar.readInt();
            if (readUnsignedShort < 8 || readUnsignedShort >= i) {
                throw new IOException("Invalid first Ifd offset: ".concat(String.valueOf(readUnsignedShort)));
            }
            readUnsignedShort -= 8;
            if (readUnsignedShort > 0 && aVar.skipBytes(readUnsignedShort) != readUnsignedShort) {
                throw new IOException("Couldn't jump to first Ifd: ".concat(String.valueOf(readUnsignedShort)));
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid start code: ");
        stringBuilder.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:69:0x0168 in {21, 24, 26, 31, 32, 34, 44, 46, 48, 50, 54, 56, 58, 60, 62, 64, 66, 68} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void a(defpackage.dk.a r10, int r11, int r12) {
        /*
        r9 = this;
        r0 = java.nio.ByteOrder.BIG_ENDIAN;
        r10.a = r0;
        r0 = (long) r11;
        r10.a(r0);
        r0 = r10.readByte();
        r1 = "Invalid marker: ";
        r2 = -1;
        if (r0 != r2) goto L_0x0150;
        r3 = 1;
        r11 = r11 + r3;
        r4 = r10.readByte();
        r5 = -40;
        if (r4 != r5) goto L_0x0138;
        r11 = r11 + r3;
        r0 = r10.readByte();
        if (r0 != r2) goto L_0x011e;
        r11 = r11 + r3;
        r0 = r10.readByte();
        r11 = r11 + r3;
        r1 = -39;
        if (r0 == r1) goto L_0x0119;
        r1 = -38;
        if (r0 == r1) goto L_0x0119;
        r1 = r10.readUnsignedShort();
        r1 = r1 + -2;
        r11 = r11 + 2;
        r4 = "Invalid length";
        if (r1 < 0) goto L_0x0113;
        r5 = -31;
        r6 = 0;
        r7 = "Invalid exif";
        if (r0 == r5) goto L_0x00b7;
        r5 = -2;
        if (r0 == r5) goto L_0x008d;
        switch(r0) {
            case -64: goto L_0x0054;
            case -63: goto L_0x0054;
            case -62: goto L_0x0054;
            case -61: goto L_0x0054;
            default: goto L_0x0049;
        };
        switch(r0) {
            case -59: goto L_0x0054;
            case -58: goto L_0x0054;
            case -57: goto L_0x0054;
            default: goto L_0x004c;
        };
        switch(r0) {
            case -55: goto L_0x0054;
            case -54: goto L_0x0054;
            case -53: goto L_0x0054;
            default: goto L_0x004f;
        };
        switch(r0) {
            case -51: goto L_0x0054;
            case -50: goto L_0x0054;
            case -49: goto L_0x0054;
            default: goto L_0x0052;
        };
        goto L_0x00fa;
        r0 = r10.skipBytes(r3);
        if (r0 != r3) goto L_0x0085;
        r0 = r9.D;
        r0 = r0[r12];
        r5 = r10.readUnsignedShort();
        r5 = (long) r5;
        r7 = r9.E;
        r5 = defpackage.dk.b.a(r5, r7);
        r6 = "ImageLength";
        r0.put(r6, r5);
        r0 = r9.D;
        r0 = r0[r12];
        r5 = r10.readUnsignedShort();
        r5 = (long) r5;
        r7 = r9.E;
        r5 = defpackage.dk.b.a(r5, r7);
        r6 = "ImageWidth";
        r0.put(r6, r5);
        r1 = r1 + -5;
        goto L_0x00fa;
        r10 = new java.io.IOException;
        r11 = "Invalid SOFx";
        r10.<init>(r11);
        throw r10;
        r0 = new byte[r1];
        r5 = r10.read(r0);
        if (r5 != r1) goto L_0x00b1;
        r1 = "UserComment";
        r5 = r9.b(r1);
        if (r5 != 0) goto L_0x00af;
        r5 = r9.D;
        r5 = r5[r3];
        r7 = new java.lang.String;
        r8 = d;
        r7.<init>(r0, r8);
        r0 = defpackage.dk.b.a(r7);
        r5.put(r1, r0);
        r1 = 0;
        goto L_0x00fa;
        r10 = new java.io.IOException;
        r10.<init>(r7);
        throw r10;
        r0 = 6;
        if (r1 < r0) goto L_0x00fa;
        r5 = new byte[r0];
        r8 = r10.read(r5);
        if (r8 != r0) goto L_0x00f4;
        r11 = r11 + 6;
        r1 = r1 + -6;
        r0 = z;
        r0 = java.util.Arrays.equals(r5, r0);
        if (r0 == 0) goto L_0x00fa;
        if (r1 <= 0) goto L_0x00ee;
        r9.K = r11;
        r0 = new byte[r1];
        r5 = r10.read(r0);
        if (r5 != r1) goto L_0x00e8;
        r11 = r11 + r1;
        r1 = new dk$a;
        r1.<init>(r0);
        r0 = r0.length;
        r9.a(r1, r0);
        r9.b(r1, r12);
        goto L_0x00af;
        r10 = new java.io.IOException;
        r10.<init>(r7);
        throw r10;
        r10 = new java.io.IOException;
        r10.<init>(r7);
        throw r10;
        r10 = new java.io.IOException;
        r10.<init>(r7);
        throw r10;
        if (r1 < 0) goto L_0x010d;
        r0 = r10.skipBytes(r1);
        if (r0 != r1) goto L_0x0105;
        r11 = r11 + r1;
        goto L_0x001c;
        r10 = new java.io.IOException;
        r11 = "Invalid JPEG segment";
        r10.<init>(r11);
        throw r10;
        r10 = new java.io.IOException;
        r10.<init>(r4);
        throw r10;
        r10 = new java.io.IOException;
        r10.<init>(r4);
        throw r10;
        r11 = r9.E;
        r10.a = r11;
        return;
        r10 = new java.io.IOException;
        r11 = new java.lang.StringBuilder;
        r12 = "Invalid marker:";
        r11.<init>(r12);
        r12 = r0 & 255;
        r12 = java.lang.Integer.toHexString(r12);
        r11.append(r12);
        r11 = r11.toString();
        r10.<init>(r11);
        throw r10;
        r10 = new java.io.IOException;
        r11 = new java.lang.StringBuilder;
        r11.<init>(r1);
        r12 = r0 & 255;
        r12 = java.lang.Integer.toHexString(r12);
        r11.append(r12);
        r11 = r11.toString();
        r10.<init>(r11);
        throw r10;
        r10 = new java.io.IOException;
        r11 = new java.lang.StringBuilder;
        r11.<init>(r1);
        r12 = r0 & 255;
        r12 = java.lang.Integer.toHexString(r12);
        r11.append(r12);
        r11 = r11.toString();
        r10.<init>(r11);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk.a(dk$a, int, int):void");
    }

    private void a(a aVar, HashMap hashMap) {
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int b = bVar.b(this.E);
            int min = Math.min(bVar2.b(this.E), aVar.available() - b);
            int i = this.C;
            if (i == 4 || i == 9 || i == 10) {
                i = this.K;
            } else {
                if (i == 7) {
                    i = this.L;
                }
                if (b > 0 && min > 0) {
                    this.F = true;
                    this.G = b;
                    this.H = min;
                    if (this.B == null) {
                        byte[] bArr = new byte[min];
                        aVar.a((long) b);
                        aVar.readFully(bArr);
                        this.I = bArr;
                        return;
                    }
                    return;
                }
            }
            b += i;
            if (b > 0) {
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:108:0x024b in {4, 7, 10, 15, 16, 17, 19, 22, 23, 25, 26, 29, 32, 36, 37, 42, 45, 49, 56, 63, 64, 65, 66, 67, 74, 75, 80, 88, 92, 93, 95, 96, 99, 105, 107} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void a(java.io.InputStream r13) {
        /*
        r12 = this;
        r0 = "PhotographicSensitivity";
        r1 = 0;
        r2 = 0;
        r3 = 10;
        if (r2 >= r3) goto L_0x0014;
        r3 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r4 = new java.util.HashMap;	 Catch:{ IOException -> 0x0241 }
        r4.<init>();	 Catch:{ IOException -> 0x0241 }
        r3[r2] = r4;	 Catch:{ IOException -> 0x0241 }
        r2 = r2 + 1;	 Catch:{ IOException -> 0x0241 }
        goto L_0x0004;	 Catch:{ IOException -> 0x0241 }
        r2 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0241 }
        r4 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ IOException -> 0x0241 }
        r2.<init>(r13, r4);	 Catch:{ IOException -> 0x0241 }
        r13 = r2;	 Catch:{ IOException -> 0x0241 }
        r13 = (java.io.BufferedInputStream) r13;	 Catch:{ IOException -> 0x0241 }
        r13.mark(r4);	 Catch:{ IOException -> 0x0241 }
        r4 = new byte[r4];	 Catch:{ IOException -> 0x0241 }
        r13.read(r4);	 Catch:{ IOException -> 0x0241 }
        r13.reset();	 Catch:{ IOException -> 0x0241 }
        r13 = defpackage.dk.a(r4);	 Catch:{ IOException -> 0x0241 }
        r5 = 4;	 Catch:{ IOException -> 0x0241 }
        r6 = 7;	 Catch:{ IOException -> 0x0241 }
        r7 = 1;	 Catch:{ IOException -> 0x0241 }
        if (r13 == 0) goto L_0x0034;	 Catch:{ IOException -> 0x0241 }
        r13 = 4;	 Catch:{ IOException -> 0x0241 }
        goto L_0x0086;	 Catch:{ IOException -> 0x0241 }
        r13 = defpackage.dk.b(r4);	 Catch:{ IOException -> 0x0241 }
        if (r13 == 0) goto L_0x003d;	 Catch:{ IOException -> 0x0241 }
        r13 = 9;	 Catch:{ IOException -> 0x0241 }
        goto L_0x0086;	 Catch:{ IOException -> 0x0241 }
        r13 = new dk$a;	 Catch:{ IOException -> 0x0241 }
        r13.<init>(r4);	 Catch:{ IOException -> 0x0241 }
        r8 = defpackage.dk.c(r13);	 Catch:{ IOException -> 0x0241 }
        r12.E = r8;	 Catch:{ IOException -> 0x0241 }
        r8 = r12.E;	 Catch:{ IOException -> 0x0241 }
        r13.a = r8;	 Catch:{ IOException -> 0x0241 }
        r8 = r13.readShort();	 Catch:{ IOException -> 0x0241 }
        r13.close();	 Catch:{ IOException -> 0x0241 }
        r13 = 20306; // 0x4f52 float:2.8455E-41 double:1.00325E-319;	 Catch:{ IOException -> 0x0241 }
        if (r8 == r13) goto L_0x005e;	 Catch:{ IOException -> 0x0241 }
        r13 = 21330; // 0x5352 float:2.989E-41 double:1.05384E-319;	 Catch:{ IOException -> 0x0241 }
        if (r8 != r13) goto L_0x005c;	 Catch:{ IOException -> 0x0241 }
        goto L_0x005e;	 Catch:{ IOException -> 0x0241 }
        r13 = 0;	 Catch:{ IOException -> 0x0241 }
        goto L_0x005f;	 Catch:{ IOException -> 0x0241 }
        r13 = 1;	 Catch:{ IOException -> 0x0241 }
        if (r13 == 0) goto L_0x0063;	 Catch:{ IOException -> 0x0241 }
        r13 = 7;	 Catch:{ IOException -> 0x0241 }
        goto L_0x0086;	 Catch:{ IOException -> 0x0241 }
        r13 = new dk$a;	 Catch:{ IOException -> 0x0241 }
        r13.<init>(r4);	 Catch:{ IOException -> 0x0241 }
        r4 = defpackage.dk.c(r13);	 Catch:{ IOException -> 0x0241 }
        r12.E = r4;	 Catch:{ IOException -> 0x0241 }
        r4 = r12.E;	 Catch:{ IOException -> 0x0241 }
        r13.a = r4;	 Catch:{ IOException -> 0x0241 }
        r4 = r13.readShort();	 Catch:{ IOException -> 0x0241 }
        r13.close();	 Catch:{ IOException -> 0x0241 }
        r13 = 85;	 Catch:{ IOException -> 0x0241 }
        if (r4 != r13) goto L_0x007f;	 Catch:{ IOException -> 0x0241 }
        r13 = 1;	 Catch:{ IOException -> 0x0241 }
        goto L_0x0080;	 Catch:{ IOException -> 0x0241 }
        r13 = 0;	 Catch:{ IOException -> 0x0241 }
        if (r13 == 0) goto L_0x0085;	 Catch:{ IOException -> 0x0241 }
        r13 = 10;	 Catch:{ IOException -> 0x0241 }
        goto L_0x0086;	 Catch:{ IOException -> 0x0241 }
        r13 = 0;	 Catch:{ IOException -> 0x0241 }
        r12.C = r13;	 Catch:{ IOException -> 0x0241 }
        r13 = new dk$a;	 Catch:{ IOException -> 0x0241 }
        r13.<init>(r2);	 Catch:{ IOException -> 0x0241 }
        r2 = r12.C;	 Catch:{ IOException -> 0x0241 }
        r4 = 3;	 Catch:{ IOException -> 0x0241 }
        r8 = 5;	 Catch:{ IOException -> 0x0241 }
        r9 = 6;	 Catch:{ IOException -> 0x0241 }
        switch(r2) {
            case 0: goto L_0x01c4;
            case 1: goto L_0x01c4;
            case 2: goto L_0x01c4;
            case 3: goto L_0x01c4;
            case 4: goto L_0x01c0;
            case 5: goto L_0x01c4;
            case 6: goto L_0x01c4;
            case 7: goto L_0x00d5;
            case 8: goto L_0x01c4;
            case 9: goto L_0x00d0;
            case 10: goto L_0x0097;
            case 11: goto L_0x01c4;
            default: goto L_0x0095;
        };	 Catch:{ IOException -> 0x0241 }
        goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r12.a(r13);	 Catch:{ IOException -> 0x0241 }
        r2 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r2 = r2[r1];	 Catch:{ IOException -> 0x0241 }
        r3 = "JpgFromRaw";	 Catch:{ IOException -> 0x0241 }
        r2 = r2.get(r3);	 Catch:{ IOException -> 0x0241 }
        r2 = (defpackage.dk.b) r2;	 Catch:{ IOException -> 0x0241 }
        if (r2 == 0) goto L_0x00ad;	 Catch:{ IOException -> 0x0241 }
        r2 = r12.O;	 Catch:{ IOException -> 0x0241 }
        r12.a(r13, r2, r8);	 Catch:{ IOException -> 0x0241 }
        r2 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r2 = r2[r1];	 Catch:{ IOException -> 0x0241 }
        r3 = "ISO";	 Catch:{ IOException -> 0x0241 }
        r2 = r2.get(r3);	 Catch:{ IOException -> 0x0241 }
        r2 = (defpackage.dk.b) r2;	 Catch:{ IOException -> 0x0241 }
        r3 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r3 = r3[r7];	 Catch:{ IOException -> 0x0241 }
        r3 = r3.get(r0);	 Catch:{ IOException -> 0x0241 }
        r3 = (defpackage.dk.b) r3;	 Catch:{ IOException -> 0x0241 }
        if (r2 == 0) goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        if (r3 != 0) goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r3 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r3 = r3[r7];	 Catch:{ IOException -> 0x0241 }
        r3.put(r0, r2);	 Catch:{ IOException -> 0x0241 }
        goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r12.b(r13);	 Catch:{ IOException -> 0x0241 }
        goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r12.a(r13);	 Catch:{ IOException -> 0x0241 }
        r0 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r0 = r0[r7];	 Catch:{ IOException -> 0x0241 }
        r2 = "MakerNote";	 Catch:{ IOException -> 0x0241 }
        r0 = r0.get(r2);	 Catch:{ IOException -> 0x0241 }
        r0 = (defpackage.dk.b) r0;	 Catch:{ IOException -> 0x0241 }
        if (r0 == 0) goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r2 = new dk$a;	 Catch:{ IOException -> 0x0241 }
        r0 = r0.b;	 Catch:{ IOException -> 0x0241 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0241 }
        r0 = r12.E;	 Catch:{ IOException -> 0x0241 }
        r2.a = r0;	 Catch:{ IOException -> 0x0241 }
        r0 = new byte[r9];	 Catch:{ IOException -> 0x0241 }
        r2.readFully(r0);	 Catch:{ IOException -> 0x0241 }
        r10 = 0;	 Catch:{ IOException -> 0x0241 }
        r2.a(r10);	 Catch:{ IOException -> 0x0241 }
        r3 = new byte[r3];	 Catch:{ IOException -> 0x0241 }
        r2.readFully(r3);	 Catch:{ IOException -> 0x0241 }
        r10 = h;	 Catch:{ IOException -> 0x0241 }
        r0 = java.util.Arrays.equals(r0, r10);	 Catch:{ IOException -> 0x0241 }
        if (r0 == 0) goto L_0x010e;	 Catch:{ IOException -> 0x0241 }
        r10 = 8;	 Catch:{ IOException -> 0x0241 }
        r2.a(r10);	 Catch:{ IOException -> 0x0241 }
        goto L_0x011b;	 Catch:{ IOException -> 0x0241 }
        r0 = i;	 Catch:{ IOException -> 0x0241 }
        r0 = java.util.Arrays.equals(r3, r0);	 Catch:{ IOException -> 0x0241 }
        if (r0 == 0) goto L_0x011b;	 Catch:{ IOException -> 0x0241 }
        r10 = 12;	 Catch:{ IOException -> 0x0241 }
        r2.a(r10);	 Catch:{ IOException -> 0x0241 }
        r12.b(r2, r9);	 Catch:{ IOException -> 0x0241 }
        r0 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r0 = r0[r6];	 Catch:{ IOException -> 0x0241 }
        r2 = "PreviewImageStart";	 Catch:{ IOException -> 0x0241 }
        r0 = r0.get(r2);	 Catch:{ IOException -> 0x0241 }
        r0 = (defpackage.dk.b) r0;	 Catch:{ IOException -> 0x0241 }
        r2 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r2 = r2[r6];	 Catch:{ IOException -> 0x0241 }
        r3 = "PreviewImageLength";	 Catch:{ IOException -> 0x0241 }
        r2 = r2.get(r3);	 Catch:{ IOException -> 0x0241 }
        r2 = (defpackage.dk.b) r2;	 Catch:{ IOException -> 0x0241 }
        if (r0 == 0) goto L_0x014c;	 Catch:{ IOException -> 0x0241 }
        if (r2 == 0) goto L_0x014c;	 Catch:{ IOException -> 0x0241 }
        r3 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r3 = r3[r8];	 Catch:{ IOException -> 0x0241 }
        r10 = "JPEGInterchangeFormat";	 Catch:{ IOException -> 0x0241 }
        r3.put(r10, r0);	 Catch:{ IOException -> 0x0241 }
        r0 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r0 = r0[r8];	 Catch:{ IOException -> 0x0241 }
        r3 = "JPEGInterchangeFormatLength";	 Catch:{ IOException -> 0x0241 }
        r0.put(r3, r2);	 Catch:{ IOException -> 0x0241 }
        r0 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r2 = 8;	 Catch:{ IOException -> 0x0241 }
        r0 = r0[r2];	 Catch:{ IOException -> 0x0241 }
        r2 = "AspectFrame";	 Catch:{ IOException -> 0x0241 }
        r0 = r0.get(r2);	 Catch:{ IOException -> 0x0241 }
        r0 = (defpackage.dk.b) r0;	 Catch:{ IOException -> 0x0241 }
        if (r0 == 0) goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r2 = r12.E;	 Catch:{ IOException -> 0x0241 }
        r0 = r0.a(r2);	 Catch:{ IOException -> 0x0241 }
        r0 = (int[]) r0;	 Catch:{ IOException -> 0x0241 }
        if (r0 == 0) goto L_0x01a8;	 Catch:{ IOException -> 0x0241 }
        r2 = r0.length;	 Catch:{ IOException -> 0x0241 }
        if (r2 == r5) goto L_0x016a;	 Catch:{ IOException -> 0x0241 }
        goto L_0x01a8;	 Catch:{ IOException -> 0x0241 }
        r2 = 2;	 Catch:{ IOException -> 0x0241 }
        r3 = r0[r2];	 Catch:{ IOException -> 0x0241 }
        r8 = r0[r1];	 Catch:{ IOException -> 0x0241 }
        if (r3 <= r8) goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r3 = r0[r4];	 Catch:{ IOException -> 0x0241 }
        r8 = r0[r7];	 Catch:{ IOException -> 0x0241 }
        if (r3 <= r8) goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r2 = r0[r2];	 Catch:{ IOException -> 0x0241 }
        r3 = r0[r1];	 Catch:{ IOException -> 0x0241 }
        r2 = r2 - r3;	 Catch:{ IOException -> 0x0241 }
        r2 = r2 + r7;	 Catch:{ IOException -> 0x0241 }
        r3 = r0[r4];	 Catch:{ IOException -> 0x0241 }
        r0 = r0[r7];	 Catch:{ IOException -> 0x0241 }
        r3 = r3 - r0;	 Catch:{ IOException -> 0x0241 }
        r3 = r3 + r7;	 Catch:{ IOException -> 0x0241 }
        if (r2 >= r3) goto L_0x0189;	 Catch:{ IOException -> 0x0241 }
        r2 = r2 + r3;	 Catch:{ IOException -> 0x0241 }
        r3 = r2 - r3;	 Catch:{ IOException -> 0x0241 }
        r2 = r2 - r3;	 Catch:{ IOException -> 0x0241 }
        r0 = r12.E;	 Catch:{ IOException -> 0x0241 }
        r0 = defpackage.dk.b.a(r2, r0);	 Catch:{ IOException -> 0x0241 }
        r2 = r12.E;	 Catch:{ IOException -> 0x0241 }
        r2 = defpackage.dk.b.a(r3, r2);	 Catch:{ IOException -> 0x0241 }
        r3 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r3 = r3[r1];	 Catch:{ IOException -> 0x0241 }
        r8 = "ImageWidth";	 Catch:{ IOException -> 0x0241 }
        r3.put(r8, r0);	 Catch:{ IOException -> 0x0241 }
        r0 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r0 = r0[r1];	 Catch:{ IOException -> 0x0241 }
        r3 = "ImageLength";	 Catch:{ IOException -> 0x0241 }
        r0.put(r3, r2);	 Catch:{ IOException -> 0x0241 }
        goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r2 = "ExifInterface";	 Catch:{ IOException -> 0x0241 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0241 }
        r8 = "Invalid aspect frame values. frame=";	 Catch:{ IOException -> 0x0241 }
        r3.<init>(r8);	 Catch:{ IOException -> 0x0241 }
        r0 = java.util.Arrays.toString(r0);	 Catch:{ IOException -> 0x0241 }
        r3.append(r0);	 Catch:{ IOException -> 0x0241 }
        r0 = r3.toString();	 Catch:{ IOException -> 0x0241 }
        android.util.Log.w(r2, r0);	 Catch:{ IOException -> 0x0241 }
        goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r12.a(r13, r1, r1);	 Catch:{ IOException -> 0x0241 }
        goto L_0x01c7;	 Catch:{ IOException -> 0x0241 }
        r12.a(r13);	 Catch:{ IOException -> 0x0241 }
        r0 = r12.D;	 Catch:{ IOException -> 0x0241 }
        r0 = r0[r5];	 Catch:{ IOException -> 0x0241 }
        r2 = "Compression";	 Catch:{ IOException -> 0x0241 }
        r2 = r0.get(r2);	 Catch:{ IOException -> 0x0241 }
        r2 = (defpackage.dk.b) r2;	 Catch:{ IOException -> 0x0241 }
        if (r2 == 0) goto L_0x0236;	 Catch:{ IOException -> 0x0241 }
        r3 = r12.E;	 Catch:{ IOException -> 0x0241 }
        r2 = r2.b(r3);	 Catch:{ IOException -> 0x0241 }
        r12.J = r2;	 Catch:{ IOException -> 0x0241 }
        r2 = r12.J;	 Catch:{ IOException -> 0x0241 }
        if (r2 == r7) goto L_0x01ea;	 Catch:{ IOException -> 0x0241 }
        if (r2 == r9) goto L_0x01e6;	 Catch:{ IOException -> 0x0241 }
        if (r2 == r6) goto L_0x01ea;	 Catch:{ IOException -> 0x0241 }
        goto L_0x0239;	 Catch:{ IOException -> 0x0241 }
        r12.a(r13, r0);	 Catch:{ IOException -> 0x0241 }
        goto L_0x0239;	 Catch:{ IOException -> 0x0241 }
        r2 = "BitsPerSample";	 Catch:{ IOException -> 0x0241 }
        r2 = r0.get(r2);	 Catch:{ IOException -> 0x0241 }
        r2 = (defpackage.dk.b) r2;	 Catch:{ IOException -> 0x0241 }
        if (r2 == 0) goto L_0x022f;	 Catch:{ IOException -> 0x0241 }
        r3 = r12.E;	 Catch:{ IOException -> 0x0241 }
        r2 = r2.a(r3);	 Catch:{ IOException -> 0x0241 }
        r2 = (int[]) r2;	 Catch:{ IOException -> 0x0241 }
        r3 = e;	 Catch:{ IOException -> 0x0241 }
        r3 = java.util.Arrays.equals(r3, r2);	 Catch:{ IOException -> 0x0241 }
        if (r3 == 0) goto L_0x0206;	 Catch:{ IOException -> 0x0241 }
        r2 = 1;	 Catch:{ IOException -> 0x0241 }
        goto L_0x0230;	 Catch:{ IOException -> 0x0241 }
        r3 = r12.C;	 Catch:{ IOException -> 0x0241 }
        if (r3 != r4) goto L_0x022f;	 Catch:{ IOException -> 0x0241 }
        r3 = "PhotometricInterpretation";	 Catch:{ IOException -> 0x0241 }
        r3 = r0.get(r3);	 Catch:{ IOException -> 0x0241 }
        r3 = (defpackage.dk.b) r3;	 Catch:{ IOException -> 0x0241 }
        if (r3 == 0) goto L_0x022f;	 Catch:{ IOException -> 0x0241 }
        r4 = r12.E;	 Catch:{ IOException -> 0x0241 }
        r3 = r3.b(r4);	 Catch:{ IOException -> 0x0241 }
        if (r3 != r7) goto L_0x0224;	 Catch:{ IOException -> 0x0241 }
        r4 = f;	 Catch:{ IOException -> 0x0241 }
        r4 = java.util.Arrays.equals(r2, r4);	 Catch:{ IOException -> 0x0241 }
        if (r4 != 0) goto L_0x0204;	 Catch:{ IOException -> 0x0241 }
        if (r3 != r9) goto L_0x022f;	 Catch:{ IOException -> 0x0241 }
        r3 = e;	 Catch:{ IOException -> 0x0241 }
        r2 = java.util.Arrays.equals(r2, r3);	 Catch:{ IOException -> 0x0241 }
        if (r2 == 0) goto L_0x022f;	 Catch:{ IOException -> 0x0241 }
        goto L_0x0204;	 Catch:{ IOException -> 0x0241 }
        r2 = 0;	 Catch:{ IOException -> 0x0241 }
        if (r2 == 0) goto L_0x0239;	 Catch:{ IOException -> 0x0241 }
        r12.b(r13, r0);	 Catch:{ IOException -> 0x0241 }
        goto L_0x0239;	 Catch:{ IOException -> 0x0241 }
        r12.J = r9;	 Catch:{ IOException -> 0x0241 }
        goto L_0x01e6;	 Catch:{ IOException -> 0x0241 }
        r12.P = r7;	 Catch:{ IOException -> 0x0241 }
        r12.a();
        return;
        r13 = move-exception;
        goto L_0x0247;
    L_0x0241:
        r12.P = r1;	 Catch:{ all -> 0x023f }
        r12.a();
        return;
        r12.a();
        throw r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk.a(java.io.InputStream):void");
    }

    private boolean a(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (!(bVar == null || bVar2 == null)) {
            int b = bVar.b(this.E);
            int b2 = bVar2.b(this.E);
            if (b <= RasterSource.DEFAULT_TILE_SIZE && b2 <= RasterSource.DEFAULT_TILE_SIZE) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(byte[] bArr) {
        for (int i = 0; i < 3; i++) {
            if (bArr[i] != g[i]) {
                return false;
            }
        }
        return true;
    }

    private static long[] a(Object obj) {
        if (!(obj instanceof int[])) {
            return obj instanceof long[] ? (long[]) obj : null;
        } else {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        }
    }

    private String b(String str) {
        b a = a(str);
        if (a != null) {
            if (!x.contains(str)) {
                return a.c(this.E);
            }
            d[] dVarArr;
            if (str.equals("GPSTimeStamp")) {
                String str2 = "ExifInterface";
                if (a.a == 5 || a.a == 10) {
                    dVarArr = (d[]) a.a(this.E);
                    if (dVarArr == null || dVarArr.length != 3) {
                        StringBuilder stringBuilder = new StringBuilder("Invalid GPS Timestamp array. array=");
                        stringBuilder.append(Arrays.toString(dVarArr));
                        str = stringBuilder.toString();
                    } else {
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].b)))});
                    }
                }
                StringBuilder stringBuilder2 = new StringBuilder("GPS Timestamp format is not rational. format=");
                stringBuilder2.append(a.a);
                str = stringBuilder2.toString();
                Log.w(str2, str);
                return null;
            }
            try {
                Object a2 = a.a(this.E);
                if (a2 != null) {
                    double parseDouble;
                    if (a2 instanceof String) {
                        parseDouble = Double.parseDouble((String) a2);
                    } else {
                        String str3 = "There are more than one component";
                        if (a2 instanceof long[]) {
                            long[] jArr = (long[]) a2;
                            if (jArr.length == 1) {
                                parseDouble = (double) jArr[0];
                            } else {
                                throw new NumberFormatException(str3);
                            }
                        } else if (a2 instanceof int[]) {
                            int[] iArr = (int[]) a2;
                            if (iArr.length == 1) {
                                parseDouble = (double) iArr[0];
                            } else {
                                throw new NumberFormatException(str3);
                            }
                        } else if (a2 instanceof double[]) {
                            double[] dArr = (double[]) a2;
                            if (dArr.length == 1) {
                                parseDouble = dArr[0];
                            } else {
                                throw new NumberFormatException(str3);
                            }
                        } else if (a2 instanceof d[]) {
                            dVarArr = (d[]) a2;
                            if (dVarArr.length == 1) {
                                d dVar = dVarArr[0];
                                parseDouble = (double) dVar.a;
                                double d = (double) dVar.b;
                                Double.isNaN(parseDouble);
                                Double.isNaN(d);
                                parseDouble /= d;
                            } else {
                                throw new NumberFormatException(str3);
                            }
                        } else {
                            throw new NumberFormatException("Couldn't find a double value");
                        }
                    }
                    return Double.toString(parseDouble);
                }
                throw new NumberFormatException("NULL can't be converted to a double value");
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private void b() {
        a(0, 5);
        a(0, 4);
        a(5, 4);
        b bVar = (b) this.D[1].get("PixelXDimension");
        b bVar2 = (b) this.D[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.D[0].put("ImageWidth", bVar);
            this.D[0].put("ImageLength", bVar2);
        }
        if (this.D[4].isEmpty() && a(this.D[5])) {
            HashMap[] hashMapArr = this.D;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!a(this.D[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    private void b(a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        a(aVar, i, 5);
        aVar.a((long) i2);
        aVar.a = ByteOrder.BIG_ENDIAN;
        i = aVar.readInt();
        for (int i3 = 0; i3 < i; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == o.a) {
                i = aVar.readShort();
                int readShort = aVar.readShort();
                b a = b.a(i, this.E);
                b a2 = b.a(readShort, this.E);
                this.D[0].put("ImageLength", a);
                this.D[0].put("ImageWidth", a2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARNING: Missing block: B:86:0x0213, code skipped:
            if ("Model".equals(r6.b) != false) goto L_0x0215;
     */
    /* JADX WARNING: Missing block: B:88:0x0221, code skipped:
            if (r5.c(r0.E).contains("PENTAX") == false) goto L_0x0223;
     */
    /* JADX WARNING: Missing block: B:90:0x022b, code skipped:
            if (r26.equals(r6.b) == false) goto L_0x023c;
     */
    /* JADX WARNING: Missing block: B:92:0x0236, code skipped:
            if (r5.b(r0.E) != 65535) goto L_0x023c;
     */
    /* JADX WARNING: Missing block: B:93:0x0238, code skipped:
            r0.C = 8;
     */
    /* JADX WARNING: Missing block: B:95:0x0241, code skipped:
            if (((long) r1.c) == r12) goto L_0x0246;
     */
    /* JADX WARNING: Missing block: B:96:0x0243, code skipped:
            r1.a(r12);
     */
    private void b(defpackage.dk.a r28, int r29) {
        /*
        r27 = this;
        r0 = r27;
        r1 = r28;
        r4 = r29;
    L_0x0006:
        r5 = r1.c;
        r5 = r5 + 2;
        r6 = r1.b;
        if (r5 <= r6) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r5 = r28.readShort();
        r6 = r1.c;
        r7 = r5 * 12;
        r6 = r6 + r7;
        r7 = r1.b;
        if (r6 <= r7) goto L_0x001d;
    L_0x001c:
        return;
    L_0x001d:
        r7 = 0;
    L_0x001e:
        if (r7 >= r5) goto L_0x024e;
    L_0x0020:
        r9 = r28.readUnsignedShort();
        r10 = r28.readUnsignedShort();
        r11 = r28.readInt();
        r12 = r1.c;
        r12 = (long) r12;
        r14 = 4;
        r12 = r12 + r14;
        r16 = v;
        r2 = r16[r4];
        r6 = java.lang.Integer.valueOf(r9);
        r2 = r2.get(r6);
        r2 = (defpackage.dk.c) r2;
        r6 = 7;
        r17 = 0;
        r8 = "ExifInterface";
        if (r2 != 0) goto L_0x0057;
    L_0x0047:
        r3 = java.lang.String.valueOf(r9);
        r14 = "Skip the tag entry since tag number is not defined: ";
        r3 = r14.concat(r3);
    L_0x0051:
        android.util.Log.w(r8, r3);
        r22 = r7;
        goto L_0x00b9;
    L_0x0057:
        if (r10 <= 0) goto L_0x00aa;
    L_0x0059:
        r3 = 14;
        if (r10 < r3) goto L_0x005e;
    L_0x005d:
        goto L_0x00aa;
    L_0x005e:
        r3 = r2.a(r10);
        if (r3 != 0) goto L_0x0081;
    L_0x0064:
        r3 = new java.lang.StringBuilder;
        r14 = "Skip the tag entry since data format (";
        r3.<init>(r14);
        r14 = a;
        r14 = r14[r10];
        r3.append(r14);
        r14 = ") is unexpected for tag: ";
        r3.append(r14);
        r14 = r2.b;
        r3.append(r14);
        r3 = r3.toString();
        goto L_0x0051;
    L_0x0081:
        if (r10 != r6) goto L_0x0085;
    L_0x0083:
        r10 = r2.c;
    L_0x0085:
        r14 = (long) r11;
        r3 = b;
        r3 = r3[r10];
        r22 = r7;
        r6 = (long) r3;
        r6 = r6 * r14;
        r3 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1));
        if (r3 < 0) goto L_0x009c;
    L_0x0092:
        r14 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
        if (r3 <= 0) goto L_0x009a;
    L_0x0099:
        goto L_0x009c;
    L_0x009a:
        r3 = 1;
        goto L_0x00bc;
    L_0x009c:
        r3 = java.lang.String.valueOf(r11);
        r14 = "Skip the tag entry since the number of components is invalid: ";
        r3 = r14.concat(r3);
        android.util.Log.w(r8, r3);
        goto L_0x00bb;
    L_0x00aa:
        r22 = r7;
        r3 = java.lang.String.valueOf(r10);
        r6 = "Skip the tag entry since data format is invalid: ";
        r3 = r6.concat(r3);
        android.util.Log.w(r8, r3);
    L_0x00b9:
        r6 = r17;
    L_0x00bb:
        r3 = 0;
    L_0x00bc:
        if (r3 != 0) goto L_0x00c6;
    L_0x00be:
        r1.a(r12);
        r20 = r5;
    L_0x00c3:
        r7 = 0;
        goto L_0x0246;
    L_0x00c6:
        r3 = "Compression";
        r14 = 4;
        r20 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
        if (r20 <= 0) goto L_0x0175;
    L_0x00ce:
        r14 = r28.readInt();
        r15 = r0.C;
        r20 = r5;
        r5 = 7;
        if (r15 != r5) goto L_0x0138;
    L_0x00d9:
        r5 = r2.b;
        r15 = "MakerNote";
        r5 = r15.equals(r5);
        if (r5 == 0) goto L_0x00e6;
    L_0x00e3:
        r0.L = r14;
        goto L_0x0131;
    L_0x00e6:
        r5 = 6;
        if (r4 != r5) goto L_0x0131;
    L_0x00e9:
        r15 = r2.b;
        r5 = "ThumbnailImage";
        r5 = r5.equals(r15);
        if (r5 == 0) goto L_0x0131;
    L_0x00f3:
        r0.M = r14;
        r0.N = r11;
        r5 = r0.E;
        r15 = 6;
        r5 = defpackage.dk.b.a(r15, r5);
        r15 = r0.M;
        r23 = r10;
        r21 = r11;
        r10 = (long) r15;
        r15 = r0.E;
        r10 = defpackage.dk.b.a(r10, r15);
        r11 = r0.N;
        r24 = r12;
        r11 = (long) r11;
        r13 = r0.E;
        r11 = defpackage.dk.b.a(r11, r13);
        r12 = r0.D;
        r13 = 4;
        r12 = r12[r13];
        r12.put(r3, r5);
        r5 = r0.D;
        r5 = r5[r13];
        r12 = "JPEGInterchangeFormat";
        r5.put(r12, r10);
        r5 = r0.D;
        r5 = r5[r13];
        r10 = "JPEGInterchangeFormatLength";
        r5.put(r10, r11);
        goto L_0x014e;
    L_0x0131:
        r23 = r10;
        r21 = r11;
        r24 = r12;
        goto L_0x014e;
    L_0x0138:
        r23 = r10;
        r21 = r11;
        r24 = r12;
        r5 = 10;
        if (r15 != r5) goto L_0x014e;
    L_0x0142:
        r5 = r2.b;
        r10 = "JpgFromRaw";
        r5 = r10.equals(r5);
        if (r5 == 0) goto L_0x014e;
    L_0x014c:
        r0.O = r14;
    L_0x014e:
        r10 = (long) r14;
        r12 = r10 + r6;
        r5 = r1.b;
        r15 = r2;
        r26 = r3;
        r2 = (long) r5;
        r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r5 > 0) goto L_0x0161;
    L_0x015b:
        r1.a(r10);
        r12 = r24;
        goto L_0x017e;
    L_0x0161:
        r2 = java.lang.String.valueOf(r14);
        r3 = "Skip the tag entry since data offset is invalid: ";
        r2 = r3.concat(r2);
        android.util.Log.w(r8, r2);
        r12 = r24;
    L_0x0170:
        r1.a(r12);
        goto L_0x00c3;
    L_0x0175:
        r15 = r2;
        r26 = r3;
        r20 = r5;
        r23 = r10;
        r21 = r11;
    L_0x017e:
        r2 = y;
        r3 = java.lang.Integer.valueOf(r9);
        r2 = r2.get(r3);
        r2 = (java.lang.Integer) r2;
        r3 = 3;
        if (r2 == 0) goto L_0x01db;
    L_0x018d:
        r5 = -1;
        r10 = r23;
        if (r10 == r3) goto L_0x01b2;
    L_0x0193:
        r3 = 4;
        if (r10 == r3) goto L_0x01ad;
    L_0x0196:
        r3 = 8;
        if (r10 == r3) goto L_0x01a8;
    L_0x019a:
        r3 = 9;
        if (r10 == r3) goto L_0x01a3;
    L_0x019e:
        r3 = 13;
        if (r10 == r3) goto L_0x01a3;
    L_0x01a2:
        goto L_0x01b7;
    L_0x01a3:
        r3 = r28.readInt();
        goto L_0x01b6;
    L_0x01a8:
        r3 = r28.readShort();
        goto L_0x01b6;
    L_0x01ad:
        r5 = r28.a();
        goto L_0x01b7;
    L_0x01b2:
        r3 = r28.readUnsignedShort();
    L_0x01b6:
        r5 = (long) r3;
    L_0x01b7:
        r3 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1));
        if (r3 <= 0) goto L_0x01cd;
    L_0x01bb:
        r3 = r1.b;
        r9 = (long) r3;
        r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r3 >= 0) goto L_0x01cd;
    L_0x01c2:
        r1.a(r5);
        r2 = r2.intValue();
        r0.b(r1, r2);
        goto L_0x0170;
    L_0x01cd:
        r2 = java.lang.String.valueOf(r5);
        r3 = "Skip jump into the IFD since its offset is invalid: ";
        r2 = r3.concat(r2);
        android.util.Log.w(r8, r2);
        goto L_0x0170;
    L_0x01db:
        r10 = r23;
        r2 = (int) r6;
        r2 = new byte[r2];
        r1.readFully(r2);
        r5 = new dk$b;
        r6 = r21;
        r7 = 0;
        r5.<init>(r10, r6, r2, r7);
        r2 = r0.D;
        r2 = r2[r4];
        r6 = r15;
        r8 = r6.b;
        r2.put(r8, r5);
        r2 = r6.b;
        r8 = "DNGVersion";
        r2 = r8.equals(r2);
        if (r2 == 0) goto L_0x0201;
    L_0x01ff:
        r0.C = r3;
    L_0x0201:
        r2 = r6.b;
        r3 = "Make";
        r2 = r3.equals(r2);
        if (r2 != 0) goto L_0x0215;
    L_0x020b:
        r2 = r6.b;
        r3 = "Model";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x0223;
    L_0x0215:
        r2 = r0.E;
        r2 = r5.c(r2);
        r3 = "PENTAX";
        r2 = r2.contains(r3);
        if (r2 != 0) goto L_0x0238;
    L_0x0223:
        r2 = r6.b;
        r3 = r26;
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x023c;
    L_0x022d:
        r2 = r0.E;
        r2 = r5.b(r2);
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r2 != r3) goto L_0x023c;
    L_0x0238:
        r2 = 8;
        r0.C = r2;
    L_0x023c:
        r2 = r1.c;
        r2 = (long) r2;
        r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r5 == 0) goto L_0x0246;
    L_0x0243:
        r1.a(r12);
    L_0x0246:
        r2 = r22 + 1;
        r2 = (short) r2;
        r7 = r2;
        r5 = r20;
        goto L_0x001e;
    L_0x024e:
        r2 = r1.c;
        r13 = 4;
        r2 = r2 + r13;
        r3 = r1.b;
        if (r2 > r3) goto L_0x0282;
    L_0x0256:
        r2 = r28.readInt();
        r3 = 8;
        if (r2 <= r3) goto L_0x0282;
    L_0x025e:
        r3 = r1.b;
        if (r2 >= r3) goto L_0x0282;
    L_0x0262:
        r2 = (long) r2;
        r1.a(r2);
        r2 = r0.D;
        r2 = r2[r13];
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0273;
    L_0x0270:
        r4 = 4;
        goto L_0x0006;
    L_0x0273:
        r2 = r0.D;
        r19 = 5;
        r2 = r2[r19];
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0282;
    L_0x027f:
        r4 = 5;
        goto L_0x0006;
    L_0x0282:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk.b(dk$a, int):void");
    }

    private void b(a aVar, HashMap hashMap) {
        b bVar = (b) hashMap.get("StripOffsets");
        b bVar2 = (b) hashMap.get("StripByteCounts");
        if (!(bVar == null || bVar2 == null)) {
            String str;
            long[] a = dk.a(bVar.a(this.E));
            long[] a2 = dk.a(bVar2.a(this.E));
            String str2 = "ExifInterface";
            if (a == null) {
                str = "stripOffsets should not be null.";
            } else if (a2 == null) {
                str = "stripByteCounts should not be null.";
            } else {
                long j = 0;
                for (long j2 : a2) {
                    j += j2;
                }
                byte[] bArr = new byte[((int) j)];
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a.length; i3++) {
                    int i4 = (int) a2[i3];
                    int i5 = ((int) a[i3]) - i;
                    if (i5 < 0) {
                        Log.d(str2, "Invalid strip offset value");
                    }
                    aVar.a((long) i5);
                    i += i5;
                    byte[] bArr2 = new byte[i4];
                    aVar.read(bArr2);
                    i += i4;
                    System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                    i2 += bArr2.length;
                }
                this.F = true;
                this.I = bArr;
                this.H = bArr.length;
            }
            Log.w(str2, str);
        }
    }

    private static boolean b(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private static ByteOrder c(a aVar) {
        short readShort = aVar.readShort();
        if (readShort == (short) 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == (short) 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid byte order: ");
        stringBuilder.append(Integer.toHexString(readShort));
        throw new IOException(stringBuilder.toString());
    }

    private void c(a aVar, int i) {
        b bVar = (b) this.D[i].get("ImageWidth");
        if (((b) this.D[i].get("ImageLength")) == null || bVar == null) {
            b bVar2 = (b) this.D[i].get("JPEGInterchangeFormat");
            if (bVar2 != null) {
                a(aVar, bVar2.b(this.E), i);
            }
        }
    }

    private void d(a aVar, int i) {
        b bVar = (b) this.D[i].get("DefaultCropSize");
        b bVar2 = (b) this.D[i].get("SensorTopBorder");
        b bVar3 = (b) this.D[i].get("SensorLeftBorder");
        b bVar4 = (b) this.D[i].get("SensorBottomBorder");
        b bVar5 = (b) this.D[i].get("SensorRightBorder");
        String str = "ImageLength";
        String str2 = "ImageWidth";
        if (bVar != null) {
            Object a;
            Object a2;
            String str3 = "Invalid crop size values. cropSize=";
            String str4 = "ExifInterface";
            StringBuilder stringBuilder;
            if (bVar.a == 5) {
                d[] dVarArr = (d[]) bVar.a(this.E);
                if (dVarArr == null || dVarArr.length != 2) {
                    stringBuilder = new StringBuilder(str3);
                    stringBuilder.append(Arrays.toString(dVarArr));
                    Log.w(str4, stringBuilder.toString());
                    return;
                }
                a = b.a(dVarArr[0], this.E);
                a2 = b.a(dVarArr[1], this.E);
            } else {
                int[] iArr = (int[]) bVar.a(this.E);
                if (iArr == null || iArr.length != 2) {
                    stringBuilder = new StringBuilder(str3);
                    stringBuilder.append(Arrays.toString(iArr));
                    Log.w(str4, stringBuilder.toString());
                    return;
                }
                a = b.a(iArr[0], this.E);
                a2 = b.a(iArr[1], this.E);
            }
            this.D[i].put(str2, a);
            this.D[i].put(str, a2);
        } else if (bVar2 == null || bVar3 == null || bVar4 == null || bVar5 == null) {
            c(aVar, i);
        } else {
            int b = bVar2.b(this.E);
            int b2 = bVar4.b(this.E);
            int b3 = bVar5.b(this.E);
            int b4 = bVar3.b(this.E);
            if (b2 > b && b3 > b4) {
                b3 -= b4;
                b a3 = b.a(b2 - b, this.E);
                bVar = b.a(b3, this.E);
                this.D[i].put(str, a3);
                this.D[i].put(str2, bVar);
            }
        }
    }

    public final int a(String str, int i) {
        b a = a(str);
        if (a == null) {
            return i;
        }
        try {
            return a.b(this.E);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
