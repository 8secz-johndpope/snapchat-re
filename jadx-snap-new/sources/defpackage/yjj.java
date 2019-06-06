package defpackage;

import com.samsung.android.sdk.camera.SCamera;

/* renamed from: yjj */
public enum yjj {
    LIVE_STORY("0"),
    LOCAL_STORY(SCamera.CAMERA_ID_FRONT),
    USER_PUBLIC("2"),
    USER_PRIVATE("3"),
    UNKNOWN_SHARED_STORY("4"),
    EXPLORER_STORY("5"),
    ONBOARD_STORY("6"),
    OFFICIAL_STORY("7"),
    MOB("8"),
    SEARCH("9"),
    MAP("10"),
    BUSINESS("11"),
    APP("12"),
    OTHER("1023"),
    UNKNOWN("1024");
    
    public static final a Companion = null;
    final String value;

    /* renamed from: yjj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Companion = new a();
    }

    private yjj(String str) {
        akcr.b(str, "value");
        this.value = str;
    }
}
