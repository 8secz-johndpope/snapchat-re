package defpackage;

import com.google.gson.reflect.TypeToken;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.fth.a;
import java.util.List;
import org.opencv.imgproc.Imgproc;

/* renamed from: xjd */
public enum xjd implements fth {
    SPECTACLES_USER_ID(a.a(r1)),
    HAS_USED_SPECTACLES(a.a(false)),
    SPECTACLES_LAST_EXPORT_TYPE(a.a(vjm.SPECTACLES_CIRCLE_WHITE)),
    CONTEXT_NOTIFICATION_ENABLED(a.a(false)),
    CONTEXT_NOTIFICATION_FRIEND_SELECTION(a.a(xiz.ALL_FRIENDS)),
    CONTEXT_NOTIFICATION_CUSTOM_USER_WHITELIST(a.a(new 1().getType(), "[]")),
    ENFORCE_MALIBU_DEV_KEY(a.a(false)),
    MALIBU_HEVC(a.a(true)),
    ENABLE_NEWPORT(a.a(false)),
    ENABLE_NEWPORT_VIEWER(a.a(false)),
    BATTERY_MOCK(a.a(0)),
    ALWAYS_SHOW_ONBOARDING(a.a(false)),
    FIRMWARE_UPDATE_TAG(a.a("DEFAULT")),
    TRANSFER_RCV_BUFFER_SIZE(a.a(b.TRANSFER_RCV_BUFFER_SIZE_DEFAULT)),
    HAS_SEEN_LAGUNA_ONBOARDING_FLOW(a.a(false)),
    HAS_SEEN_MALIBU_ONBOARDING_FLOW(a.a(false)),
    HAS_SEEN_NEPTUNE_ONBOARDING_FLOW(a.a(false)),
    HAS_SEEN_PSYCHOMANTIS_ONBOARDING_FLOW(a.a(false)),
    SPECTACLES_SNAP_STORE_ENABLED(a.a(false)),
    SPECTACLES_SNAP_STORE_DEEPLINK(a.a(r1)),
    MALIBU_CAMERA_ENABLED(a.a(true)),
    MEMORIES_DECODE_HEVC_MAIN_LEVEL51(a.a(true)),
    FAKE_ERROR_REPORT_IN_5_S(a.a(xja.DISABLED)),
    PASSIVE_OTA_JOB_INTERVAL(a.a(a.PASSIVE_OTA_JOB_INTERVAL_DEFAULT));
    
    private final a<?> delegate;

    /* renamed from: xjd$1 */
    static class 1 extends TypeToken<List<xjk>> {
        1() {
        }
    }

    /* renamed from: xjd$b */
    public enum b {
        private static final /* synthetic */ b[] $VALUES = null;
        public static final b TRANSFER_RCV_BUFFER_SIZE_DEFAULT = null;
        public static final b TRANSFER_RCV_BUFFER_SIZE_SLOW = null;
        public static final b TRANSFER_RCV_BUFFER_SIZE_UNBEARABLY_SLOW = null;
        public static final b TRANSFER_RCV_BUFFER_SIZE_VERY_SLOW = null;
        private int mBufferSize;

        static {
            TRANSFER_RCV_BUFFER_SIZE_DEFAULT = new b("TRANSFER_RCV_BUFFER_SIZE_DEFAULT", 0, 0);
            TRANSFER_RCV_BUFFER_SIZE_SLOW = new b("TRANSFER_RCV_BUFFER_SIZE_SLOW", 1, 512000);
            TRANSFER_RCV_BUFFER_SIZE_VERY_SLOW = new b("TRANSFER_RCV_BUFFER_SIZE_VERY_SLOW", 2, Imgproc.INTER_TAB_SIZE2);
            TRANSFER_RCV_BUFFER_SIZE_UNBEARABLY_SLOW = new b("TRANSFER_RCV_BUFFER_SIZE_UNBEARABLY_SLOW", 3, RasterSource.DEFAULT_TILE_SIZE);
            $VALUES = new b[]{TRANSFER_RCV_BUFFER_SIZE_DEFAULT, TRANSFER_RCV_BUFFER_SIZE_SLOW, TRANSFER_RCV_BUFFER_SIZE_VERY_SLOW, TRANSFER_RCV_BUFFER_SIZE_UNBEARABLY_SLOW};
        }

        private b(String str, int i, int i2) {
            this.mBufferSize = i2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int a() {
            return this.mBufferSize;
        }
    }

    /* renamed from: xjd$a */
    public enum a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a PASSIVE_OTA_JOB_INTERVAL_DEFAULT = null;
        public static final a PASSIVE_OTA_JOB_INTERVAL_ONE = null;
        public static final a PASSIVE_OTA_JOB_INTERVAL_SIX = null;
        public static final a PASSIVE_OTA_JOB_INTERVAL_TWO = null;
        private long mJobInterval;

        static {
            PASSIVE_OTA_JOB_INTERVAL_DEFAULT = new a("PASSIVE_OTA_JOB_INTERVAL_DEFAULT", 0, 12);
            PASSIVE_OTA_JOB_INTERVAL_ONE = new a("PASSIVE_OTA_JOB_INTERVAL_ONE", 1, 1);
            PASSIVE_OTA_JOB_INTERVAL_TWO = new a("PASSIVE_OTA_JOB_INTERVAL_TWO", 2, 2);
            PASSIVE_OTA_JOB_INTERVAL_SIX = new a("PASSIVE_OTA_JOB_INTERVAL_SIX", 3, 6);
            $VALUES = new a[]{PASSIVE_OTA_JOB_INTERVAL_DEFAULT, PASSIVE_OTA_JOB_INTERVAL_ONE, PASSIVE_OTA_JOB_INTERVAL_TWO, PASSIVE_OTA_JOB_INTERVAL_SIX};
        }

        private a(String str, int i, long j) {
            this.mJobInterval = j;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final long a() {
            return this.mJobInterval;
        }
    }

    private xjd(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.SPECTACLES;
    }
}
