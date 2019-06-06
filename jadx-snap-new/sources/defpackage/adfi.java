package defpackage;

import android.media.AudioRecord;
import android.media.MediaFormat;
import com.google.common.base.Preconditions;
import java.util.HashSet;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: adfi */
public final class adfi {
    private static final int[] a = new int[]{8000, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};
    private static final String[] b = new String[]{"max-input-size", "bitrate", "channel-count", "sample-rate", "is-adts", "aac-profile", "aac-sbr-mode", "aac-target-ref-level", "aac-encoded-target-level", "aac-drc-boost-level", "aac-drc-cut-level", "aac-drc-heavy-compression", "aac-max-output-channel_count", "channel-mask", "flac-compression-level"};

    public static long a(int i, int i2, int i3) {
        boolean z = true;
        Preconditions.checkArgument(i >= 0, "size must be non-negative: ".concat(String.valueOf(i)));
        Preconditions.checkArgument(i2 > 0, "channelCount must be greater than 0: ".concat(String.valueOf(i2)));
        if (i3 <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "sampleRate must be greater than 0: ".concat(String.valueOf(i3)));
        return ((((long) ((i / 2) / i2)) * 1000) * 1000) / ((long) i3);
    }

    public static MediaFormat a(MediaFormat mediaFormat) {
        MediaFormat mediaFormat2 = new MediaFormat();
        String str = "mime";
        if (mediaFormat.containsKey(str)) {
            mediaFormat2.setString(str, mediaFormat.getString(str));
        }
        String[] strArr = b;
        for (int i = 0; i < 15; i++) {
            String str2 = strArr[i];
            if (mediaFormat.containsKey(str2)) {
                mediaFormat2.setInteger(str2, mediaFormat.getInteger(str2));
            }
        }
        return mediaFormat2;
    }

    public static boolean a(MediaFormat mediaFormat, double d) {
        double integer = (double) mediaFormat.getInteger("sample-rate");
        Double.isNaN(integer);
        int i = (int) (integer * d);
        HashSet hashSet = new HashSet();
        int i2 = mediaFormat.getInteger("channel-count") == 1 ? 16 : 12;
        int[] iArr = a;
        for (int i3 = 0; i3 < 19; i3++) {
            int i4 = iArr[i3];
            int minBufferSize = AudioRecord.getMinBufferSize(i4, i2, 2);
            if (!(minBufferSize == -1 || minBufferSize == -2 || minBufferSize <= 0)) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        return hashSet.contains(Integer.valueOf(i));
    }
}
