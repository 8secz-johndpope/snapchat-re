package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* renamed from: zym */
public class zym {
    @SerializedName("minTimeBetweenSessions")
    public Long a;
    @SerializedName("lowPriorityThreadEnabled")
    public Boolean b;
    @SerializedName("blacklistedEvents")
    public List<String> c;
    @SerializedName("logQueueDefinitions")
    public List<zyq> d;
    @SerializedName("qosToLogQueueNameMap")
    public Map<aavd, List<String>> e;
    @SerializedName("minPerUserSamplingRate")
    public Double f;
    @SerializedName("version")
    public String g;
    @SerializedName("appApplicationForegroundLogInitialDelay")
    private Long h;
    @SerializedName("appApplicationForegroundLogInterval")
    private Long i;

    public zym(Long l, Boolean bool, List<String> list, List<zyq> list2, Map<aavd, List<String>> map, Double d, String str, Long l2, Long l3) {
        this.a = l;
        this.b = bool;
        this.c = list;
        this.d = list2;
        this.e = map;
        this.f = d;
        this.g = str;
        this.h = l2;
        this.i = l3;
    }

    public final Map<aavd, List<String>> a() {
        return this.e;
    }

    public final String b() {
        return this.g;
    }

    public int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l != null ? l.hashCode() : 0) + 381486) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        List list = this.c;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.d;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Map map = this.e;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Double d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.g;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l2 = this.h;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        l2 = this.i;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }
}
