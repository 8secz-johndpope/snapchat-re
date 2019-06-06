package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* renamed from: zyq */
public final class zyq {
    @SerializedName("name")
    public String a;
    @SerializedName("collectorUrls")
    public Map<zyo, String> b;
    @SerializedName("uploadThreshold")
    public Long c;
    @SerializedName("overflowThreshold")
    public Long d;
    @SerializedName("uploadInterval")
    public Long e;
    @SerializedName("uploadTimeout")
    public Long f;
    @SerializedName("maxInMemoryBufferInterval")
    public Long g;
    @SerializedName("burstDebounceInterval")
    public Long h;
    @SerializedName("uploadBatchMax")
    public Long i;
    @SerializedName("fireAndForgetEnabled")
    public Boolean j;
    @SerializedName("blacklistedEvents")
    public List<String> k;
    @SerializedName("initialProcessingDelay")
    private Long l;
    @SerializedName("backoffUploadInBackground")
    private Long m;
    @SerializedName("backoffUploadOnError")
    private Long n;
    @SerializedName("backoffUploadOnUnreachable")
    private Long o;
    @SerializedName("backoffUploadOnWWAN")
    private Long p;
    @SerializedName("backoffUploadOnPowerSaver")
    private Long q;
    @SerializedName("flushOnBackgrounding")
    private zyp r;
    @SerializedName("eventRemoveBatchSize")
    private Long s;
    @SerializedName("eventSaveBatchSize")
    private Long t;
    @SerializedName("queuePriority")
    private Long u;

    public zyq(String str, Map<zyo, String> map, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, zyp zyp, Long l13, Long l14, Long l15, Boolean bool, List<String> list, Long l16) {
        this.a = str;
        this.b = map;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.l = l5;
        this.g = l6;
        this.h = l7;
        this.m = l8;
        this.n = l9;
        this.o = l10;
        this.p = l11;
        this.q = l12;
        this.r = zyp;
        this.i = l13;
        this.s = l14;
        this.t = l15;
        this.j = bool;
        this.k = list;
        this.u = l16;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 381486) * 31;
        Map map = this.b;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.g;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.h;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.m;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.n;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.o;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.p;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.q;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        zyp zyp = this.r;
        hashCode = (hashCode + (zyp != null ? zyp.hashCode() : 0)) * 31;
        l = this.i;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.s;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.t;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.j;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        List list = this.k;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        l = this.u;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
