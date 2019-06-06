package org.jcodec.common;

public enum Codec {
    H264(TrackType.VIDEO),
    MPEG2(TrackType.VIDEO),
    MPEG4(TrackType.VIDEO),
    PRORES(TrackType.VIDEO),
    DV(TrackType.VIDEO),
    VC1(TrackType.VIDEO),
    VC3(TrackType.VIDEO),
    V210(TrackType.VIDEO),
    SORENSON(TrackType.VIDEO),
    FLASH_SCREEN_VIDEO(TrackType.VIDEO),
    FLASH_SCREEN_V2(TrackType.VIDEO),
    PNG(TrackType.VIDEO),
    JPEG(TrackType.VIDEO),
    J2K(TrackType.VIDEO),
    VP6(TrackType.VIDEO),
    VP8(TrackType.VIDEO),
    VP9(TrackType.VIDEO),
    VORBIS(TrackType.VIDEO),
    AAC(TrackType.AUDIO),
    MP3(TrackType.AUDIO),
    MP2(TrackType.AUDIO),
    MP1(TrackType.AUDIO),
    AC3(TrackType.AUDIO),
    DTS(TrackType.AUDIO),
    TRUEHD(TrackType.AUDIO),
    PCM_DVD(TrackType.AUDIO),
    PCM(TrackType.AUDIO),
    ADPCM(TrackType.AUDIO),
    ALAW(TrackType.AUDIO),
    NELLYMOSER(TrackType.AUDIO),
    G711(TrackType.AUDIO),
    SPEEX(TrackType.AUDIO),
    RAW(null),
    TIMECODE(TrackType.OTHER);
    
    private TrackType type;

    private Codec(TrackType trackType) {
        this.type = trackType;
    }
}
