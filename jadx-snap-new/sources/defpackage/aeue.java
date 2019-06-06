package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.Geofence;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeuf.class)
/* renamed from: aeue */
public class aeue extends aezl implements aezk {
    @SerializedName("story_id")
    public String a;
    @SerializedName("account")
    public String b;
    @SerializedName("display_name")
    public String c;
    @SerializedName("geofence")
    public Geofence d;
    @SerializedName("my_stories_display_name")
    public String e;
    @SerializedName("venue")
    public String f;
    @SerializedName("friend_name")
    public String g;
    @SerializedName("local_story")
    public Boolean h;
    @SerializedName("is_whitelisted")
    public Boolean i;
    @SerializedName("time_left")
    public Long j = Long.valueOf(0);
    @SerializedName("substory_display_names")
    public List<String> k;
    @SerializedName("substory_location_ids")
    public Map<String, String> l;
    @SerializedName("laguna_story")
    public Boolean m;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeue)) {
            aeue aeue = (aeue) obj;
            return Objects.equal(this.a, aeue.a) && Objects.equal(this.b, aeue.b) && Objects.equal(this.c, aeue.c) && Objects.equal(this.d, aeue.d) && Objects.equal(this.e, aeue.e) && Objects.equal(this.f, aeue.f) && Objects.equal(this.g, aeue.g) && Objects.equal(this.h, aeue.h) && Objects.equal(this.i, aeue.i) && Objects.equal(this.j, aeue.j) && Objects.equal(this.k, aeue.k) && Objects.equal(this.l, aeue.l) && Objects.equal(this.m, aeue.m);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Geofence geofence = this.d;
        hashCode = (hashCode + (geofence == null ? 0 : geofence.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.h;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.i;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.j;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.k;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.l;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        bool = this.m;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
