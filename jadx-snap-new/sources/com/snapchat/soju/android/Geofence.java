package com.snapchat.soju.android;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import defpackage.aeiq;
import defpackage.aenf;
import defpackage.aezk;
import defpackage.aezl;
import defpackage.aezm;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aenf.class)
public class Geofence extends aezl implements aezk {
    @SerializedName("coordinates")
    public List<aeiq> coordinates;
    @SerializedName("id")
    public String id;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof Geofence)) {
            Geofence geofence = (Geofence) obj;
            return Objects.equal(this.id, geofence.id) && Objects.equal(this.coordinates, geofence.coordinates);
        }
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        List list = this.coordinates;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
