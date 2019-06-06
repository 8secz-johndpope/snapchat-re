package defpackage;

import defpackage.fth.a;

/* renamed from: adgf */
public enum adgf implements fth {
    MEDIA_PLAYER_USE_MP4METADATA_DEFAULT(a.a(false)),
    SHOULD_COMPENSATE_SILENT_BUFFER(a.a(false)),
    PLAYER_VIDEO_DECODER_OPERATING_RATE(a.a(120)),
    TRANSCODING_VIDEO_DECODER_OPERATING_RATE(a.a(120)),
    SHOULD_CODEC_DROP_FRAME(a.a(false)),
    ENABLE_NEW_IMAGE_PLAYER(a.a(false)),
    THUMBNAILS_FORCE_HARDWARE(a.a(false));
    
    private final a<?> delegate;

    private adgf(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.MEDIA_ENGINE;
    }
}
