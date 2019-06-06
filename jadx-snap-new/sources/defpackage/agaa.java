package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agab.class)
/* renamed from: agaa */
public class agaa extends aezl implements aezk {
    @SerializedName("upload_event_threshold")
    public Integer a;
    @SerializedName("overflow_remove_batch_size")
    public Integer b;
    @SerializedName("overflow_threshold_event_count")
    public Integer c;
    @SerializedName("event_upload_max_batch_size")
    public Integer d;
    @SerializedName("save_batch_size")
    public Integer e;
    @SerializedName("event_upload_timeout_millis")
    public Integer f;
    @SerializedName("event_upload_interval_millis")
    public Integer g;
    @SerializedName("blacklisted_events")
    public List<String> h;
    @SerializedName("critical_event_names")
    public List<String> i;
    @SerializedName("gce_collector_url")
    public String j;
    @SerializedName("gce_collector_traffic_percent")
    public Float k;
    @SerializedName("fire_and_forget_log_enabled")
    public Boolean l;
    @SerializedName("loggers")
    public List<agac> m;
    @SerializedName("default_loggers")
    public List<String> n;
    @SerializedName("version")
    public String o;
    @SerializedName("event_prefix_to_loggers_map")
    public Map<String, List<String>> p;
    @SerializedName("eventname_to_loggers_map")
    public Map<String, List<String>> q;
    @SerializedName("low_priority_thread")
    public Boolean r;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("upload_event_threshold is required to be initialized.");
        } else if (this.c == null) {
            throw new IllegalStateException("overflow_threshold_event_count is required to be initialized.");
        } else if (this.d == null) {
            throw new IllegalStateException("event_upload_max_batch_size is required to be initialized.");
        } else if (this.f == null) {
            throw new IllegalStateException("event_upload_timeout_millis is required to be initialized.");
        } else if (this.g == null) {
            throw new IllegalStateException("event_upload_interval_millis is required to be initialized.");
        } else if (this.o == null) {
            throw new IllegalStateException("version is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agaa)) {
            agaa agaa = (agaa) obj;
            return Objects.equal(this.a, agaa.a) && Objects.equal(this.b, agaa.b) && Objects.equal(this.c, agaa.c) && Objects.equal(this.d, agaa.d) && Objects.equal(this.e, agaa.e) && Objects.equal(this.f, agaa.f) && Objects.equal(this.g, agaa.g) && Objects.equal(this.h, agaa.h) && Objects.equal(this.i, agaa.i) && Objects.equal(this.j, agaa.j) && Objects.equal(this.k, agaa.k) && Objects.equal(this.l, agaa.l) && Objects.equal(this.m, agaa.m) && Objects.equal(this.n, agaa.n) && Objects.equal(this.o, agaa.o) && Objects.equal(this.p, agaa.p) && Objects.equal(this.q, agaa.q) && Objects.equal(this.r, agaa.r);
        }
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) + 527) * 31;
        Integer num2 = this.b;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.c;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.d;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.e;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.f;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        num2 = this.g;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.h;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.i;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.j;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.k;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.l;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list = this.m;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.n;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str = this.o;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.p;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.q;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        bool = this.r;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
