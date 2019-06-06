package defpackage;

import defpackage.fth.a;

/* renamed from: qpy */
public enum qpy implements fth {
    FORCE_FAILURE(a.a(a.NONE)),
    FORCE_FAILURE_STEP(a.a(psr.SEND)),
    ENABLE_SNAP_DATA_REFACTOR(a.a(false)),
    SHOW_AUDIO_NOTE_ICON_ON_INPUT_BAR(a.a(true)),
    USE_DIRECT_DOWNLOAD_URL_FOR_SNAPS(a.a(false)),
    USE_DIRECT_DOWNLOAD_URL_FOR_CHAT_MEDIA(a.a(false)),
    PRE_PROCESS_MEDIA_COUNT(a.a(1)),
    CHAT_MEDIA_PREFETCH_NUM(a.a(3)),
    ENABLE_CUSTOM_RETENTION_TIME(a.a(false)),
    CUSTOM_RETENTION_TIME(a.a(1440)),
    SHOW_BITMOJI_INAPP_NOTIFICATION(a.a(false)),
    ENABLE_STATIC_MEDIA_THUMBNAILS(a.a(false)),
    EXOPLAYER_IN_CHAT(a.a(true)),
    GROUP_INVITES(a.a(false)),
    HAS_SEEN_LEARN_MORE_DIALOG(a.a(false)),
    UPDATE_SEQUENCE_NUMBERS_ON_GROUP_VERSION_CHANGE(a.a(false)),
    PRELOAD_CHAT_VIEW_MODELS(a.a(false)),
    ENABLE_ADD_FRIEND_FOR_SHARE(a.a(false));
    
    private final a<?> delegate;

    /* renamed from: qpy$a */
    public enum a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a NONE = null;
        public static final a RETRYABLE = null;
        public static final a UNRECOVERABLE = null;

        static {
            NONE = new a("NONE", 0);
            RETRYABLE = new a("RETRYABLE", 1);
            UNRECOVERABLE = new a("UNRECOVERABLE", 2);
            $VALUES = new a[]{NONE, RETRYABLE, UNRECOVERABLE};
        }

        private a(String str, int i) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private qpy(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.MESSAGING;
    }
}
