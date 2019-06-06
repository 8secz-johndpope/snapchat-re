package defpackage;

import java.util.Set;

/* renamed from: muz */
public enum muz {
    LIVE_CAMERA,
    PREVIEW,
    PREVIEW_NO_FACE,
    MEMORIES,
    VIDEO_CHAT,
    REPLY_CAMERA,
    SPECTACLES,
    AD_TO_LENS,
    STORY_REPLY,
    SNAP_3D;
    
    public static final a Companion = null;
    public static final Set<muz> SUPPORTED_CONTEXTS = null;

    /* renamed from: muz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static muz a(String str) {
            akcr.b(str, "string");
            for (muz muz : muz.values()) {
                if (akgb.a(muz.name(), str, true)) {
                    return muz;
                }
            }
            return null;
        }
    }

    static {
        Companion = new a();
        SUPPORTED_CONTEXTS = ajzt.a((Object[]) new muz[]{LIVE_CAMERA, VIDEO_CHAT, REPLY_CAMERA, AD_TO_LENS, SNAP_3D});
    }
}
