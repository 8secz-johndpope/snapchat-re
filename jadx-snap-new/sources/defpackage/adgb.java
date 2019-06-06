package defpackage;

/* renamed from: adgb */
public final class adgb implements adge {
    private ftl a;

    public adgb(ftl ftl) {
        this.a = ftl;
    }

    public final boolean a() {
        return this.a.a(adgf.SHOULD_COMPENSATE_SILENT_BUFFER);
    }

    public final int b() {
        return this.a.f(adgf.PLAYER_VIDEO_DECODER_OPERATING_RATE);
    }

    public final int c() {
        return this.a.f(adgf.TRANSCODING_VIDEO_DECODER_OPERATING_RATE);
    }

    public final boolean d() {
        return this.a.a(adgf.THUMBNAILS_FORCE_HARDWARE);
    }

    public final boolean e() {
        return this.a.a(adgf.SHOULD_CODEC_DROP_FRAME);
    }

    public final boolean f() {
        return this.a.a(adgf.ENABLE_NEW_IMAGE_PLAYER);
    }

    public final ajdx<Boolean> g() {
        return this.a.b(adgf.MEDIA_PLAYER_USE_MP4METADATA_DEFAULT);
    }
}
