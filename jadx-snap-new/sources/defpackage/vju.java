package defpackage;

import defpackage.fth.a;

/* renamed from: vju */
public enum vju implements fth {
    ANIMATED_IMAGE_MAX_DIMENSION(a.a(1280)),
    ENABLE_SOFTWARE_CODEC_ALLTIME(a.a(false)),
    ENABLE_SOFTWARE_CODEC_RETRY(a.a(false)),
    MEMORIES_BACKUP_BITRATE(a.a(-1)),
    CUSTOM_EXPORT_TYPE(a.a(vjm.DEFAULT)),
    RAW_CONTENT_EXPORT(a.a(false)),
    HIGH_QUALITY_EXPORT(a.a(false)),
    ENABLE_SOFTWARE_ENCODE_CODEC(a.a(0)),
    ENABLE_SOFTWARE_DECODE_CODEC(a.a(0)),
    TRANSCODING_MAX_ATTEMPTS(a.a(5)),
    ENABLE_SERIAL_TASK_EXECUTION(a.a(true)),
    FORCE_TASK_FAIL(a.a(false)),
    LAGUNA_HD_SENDING_RESOLUTION(a.a(800)),
    LAGUNA_SENDING_BITRATE(a.a(2000000)),
    MALIBU_SENDING_RESOLUTION(a.a(800));
    
    private final a<?> delegate;

    private vju(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.MEDIA;
    }
}
