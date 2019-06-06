package defpackage;

/* renamed from: adiy */
public final class adiy {
    public final String a;
    private a b;

    /* renamed from: adiy$a */
    public enum a {
        AUDIO,
        VIDEO
    }

    public adiy(a aVar, String str) {
        this.b = aVar;
        this.a = str;
    }

    public static adiy a(a aVar) {
        return new adiy(aVar, aVar == a.AUDIO ? "OMX.google.aac.encoder" : "OMX.google.h264.encoder");
    }

    public final String toString() {
        return String.format("CodecInfo{codecName=%s,type=%s}", new Object[]{this.a, this.b});
    }
}
