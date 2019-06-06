package defpackage;

import com.snap.core.db.record.CharmsModel;
import com.snap.core.db.record.UploadedMediaModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aajt */
public abstract class aajt implements abic, abid, Cloneable {
    private Double A;
    private String B;
    private Long C;
    private abgn D;
    private Boolean E;
    private String F;
    private Long G;
    private Double H;
    private String I;
    private Long a;
    private String b;
    private Long c;
    private Double d;
    private Double e;
    private Double f;
    private Double g;
    private Double h;
    private Double i;
    private String j;
    private String k;
    private String l;
    private String m;
    private aagy n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private aabd v;
    private String w;
    private Boolean x;
    private aabe y;
    private aabb z;

    public aajt(aajt aajt) {
        setSequenceId(aajt.a);
        setUserAgent(aajt.b);
        setFriendCount(aajt.c);
        setClientTs(aajt.d);
        setClientUploadTs(aajt.e);
        setFirstUploadAttemptTs(aajt.f);
        setServerTs(aajt.g);
        setEventTs(aajt.h);
        setEventHourTs(aajt.i);
        setCountry(aajt.j);
        setCity(aajt.k);
        setRegion(aajt.l);
        setDeviceModel(aajt.m);
        setDeviceConnectivity(aajt.n);
        setClientId(aajt.o);
        setLocale(aajt.p);
        setOsType(aajt.q);
        setOsVersion(aajt.r);
        setOsMinorVersion(aajt.s);
        setAppVersion(aajt.t);
        setAppBuild(aajt.u);
        setAppType(aajt.v);
        setSessionId(aajt.w);
        setAppTravelMode(aajt.x);
        setAppVariant(aajt.y);
        setAppStartupType(aajt.z);
        setEventTime(aajt.A);
        setReferrer(aajt.B);
        setConnectionDownloadBandwidthBps(aajt.C);
        setTokenStatus(aajt.D);
        setHasBitmoji(aajt.E);
        setLogQueueName(aajt.F);
        setLogQueueSequenceId(aajt.G);
        setTransformerProcessingTime(aajt.H);
        setTransformerVersion(aajt.I);
    }

    public Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Long l = this.a;
        if (l != null) {
            hashMap.put("sequence_id", l);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("user_agent", str);
        }
        l = this.c;
        if (l != null) {
            hashMap.put("friend_count", l);
        }
        Double d = this.d;
        if (d != null) {
            hashMap.put("client_ts", d);
        }
        d = this.e;
        if (d != null) {
            hashMap.put("client_upload_ts", d);
        }
        d = this.f;
        if (d != null) {
            hashMap.put("first_upload_attempt_ts", d);
        }
        d = this.g;
        if (d != null) {
            hashMap.put("server_ts", d);
        }
        d = this.h;
        if (d != null) {
            hashMap.put("event_ts", d);
        }
        d = this.i;
        if (d != null) {
            hashMap.put("event_hour_ts", d);
        }
        str = this.j;
        if (str != null) {
            hashMap.put("country", str);
        }
        str = this.k;
        if (str != null) {
            hashMap.put("city", str);
        }
        str = this.l;
        if (str != null) {
            hashMap.put("region", str);
        }
        str = this.m;
        if (str != null) {
            hashMap.put("device_model", str);
        }
        aagy aagy = this.n;
        if (aagy != null) {
            hashMap.put("device_connectivity", aagy.toString());
        }
        str = this.o;
        if (str != null) {
            hashMap.put("client_id", str);
        }
        str = this.p;
        if (str != null) {
            hashMap.put(CharmsModel.LOCALE, str);
        }
        str = this.q;
        if (str != null) {
            hashMap.put("os_type", str);
        }
        str = this.r;
        if (str != null) {
            hashMap.put("os_version", str);
        }
        str = this.s;
        if (str != null) {
            hashMap.put("os_minor_version", str);
        }
        str = this.t;
        if (str != null) {
            hashMap.put("app_version", str);
        }
        str = this.u;
        if (str != null) {
            hashMap.put("app_build", str);
        }
        aabd aabd = this.v;
        if (aabd != null) {
            hashMap.put("app_type", aabd.toString());
        }
        str = this.w;
        if (str != null) {
            hashMap.put(UploadedMediaModel.SESSION_ID, str);
        }
        Boolean bool = this.x;
        if (bool != null) {
            hashMap.put("app_travel_mode", bool);
        }
        aabe aabe = this.y;
        if (aabe != null) {
            hashMap.put("app_variant", aabe.toString());
        }
        aabb aabb = this.z;
        if (aabb != null) {
            hashMap.put("app_startup_type", aabb.toString());
        }
        d = this.A;
        if (d != null) {
            hashMap.put("event_time", d);
        }
        str = this.B;
        if (str != null) {
            hashMap.put("referrer", str);
        }
        l = this.C;
        if (l != null) {
            hashMap.put("connection_download_bandwidth_bps", l);
        }
        abgn abgn = this.D;
        if (abgn != null) {
            hashMap.put("token_status", abgn.toString());
        }
        bool = this.E;
        if (bool != null) {
            hashMap.put("has_bitmoji", bool);
        }
        str = this.F;
        if (str != null) {
            hashMap.put("log_queue_name", str);
        }
        l = this.G;
        if (l != null) {
            hashMap.put("log_queue_sequence_id", l);
        }
        d = this.H;
        if (d != null) {
            hashMap.put("transformer_processing_time", d);
        }
        str = this.I;
        if (str != null) {
            hashMap.put("transformer_version", str);
        }
        return hashMap;
    }

    public aajt clone() {
        aajt aajt = (aajt) super.clone();
        Long l = this.a;
        if (l != null) {
            aajt.setSequenceId(l);
        }
        String str = this.b;
        if (str != null) {
            aajt.setUserAgent(str);
        }
        l = this.c;
        if (l != null) {
            aajt.setFriendCount(l);
        }
        Double d = this.d;
        if (d != null) {
            aajt.setClientTs(d);
        }
        d = this.e;
        if (d != null) {
            aajt.setClientUploadTs(d);
        }
        d = this.f;
        if (d != null) {
            aajt.setFirstUploadAttemptTs(d);
        }
        d = this.g;
        if (d != null) {
            aajt.setServerTs(d);
        }
        d = this.h;
        if (d != null) {
            aajt.setEventTs(d);
        }
        d = this.i;
        if (d != null) {
            aajt.setEventHourTs(d);
        }
        str = this.j;
        if (str != null) {
            aajt.setCountry(str);
        }
        str = this.k;
        if (str != null) {
            aajt.setCity(str);
        }
        str = this.l;
        if (str != null) {
            aajt.setRegion(str);
        }
        str = this.m;
        if (str != null) {
            aajt.setDeviceModel(str);
        }
        aagy aagy = this.n;
        if (aagy != null) {
            aajt.setDeviceConnectivity(aagy);
        }
        str = this.o;
        if (str != null) {
            aajt.setClientId(str);
        }
        str = this.p;
        if (str != null) {
            aajt.setLocale(str);
        }
        str = this.q;
        if (str != null) {
            aajt.setOsType(str);
        }
        str = this.r;
        if (str != null) {
            aajt.setOsVersion(str);
        }
        str = this.s;
        if (str != null) {
            aajt.setOsMinorVersion(str);
        }
        str = this.t;
        if (str != null) {
            aajt.setAppVersion(str);
        }
        str = this.u;
        if (str != null) {
            aajt.setAppBuild(str);
        }
        aabd aabd = this.v;
        if (aabd != null) {
            aajt.setAppType(aabd);
        }
        str = this.w;
        if (str != null) {
            aajt.setSessionId(str);
        }
        Boolean bool = this.x;
        if (bool != null) {
            aajt.setAppTravelMode(bool);
        }
        aabe aabe = this.y;
        if (aabe != null) {
            aajt.setAppVariant(aabe);
        }
        aabb aabb = this.z;
        if (aabb != null) {
            aajt.setAppStartupType(aabb);
        }
        d = this.A;
        if (d != null) {
            aajt.setEventTime(d);
        }
        str = this.B;
        if (str != null) {
            aajt.setReferrer(str);
        }
        l = this.C;
        if (l != null) {
            aajt.setConnectionDownloadBandwidthBps(l);
        }
        abgn abgn = this.D;
        if (abgn != null) {
            aajt.setTokenStatus(abgn);
        }
        bool = this.E;
        if (bool != null) {
            aajt.setHasBitmoji(bool);
        }
        str = this.F;
        if (str != null) {
            aajt.setLogQueueName(str);
        }
        l = this.G;
        if (l != null) {
            aajt.setLogQueueSequenceId(l);
        }
        d = this.H;
        if (d != null) {
            aajt.setTransformerProcessingTime(d);
        }
        str = this.I;
        if (str != null) {
            aajt.setTransformerVersion(str);
        }
        return aajt;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aajt) obj).asDictionary());
    }

    public String getAppBuild() {
        return this.u;
    }

    public aabb getAppStartupType() {
        return this.z;
    }

    public Boolean getAppTravelMode() {
        return this.x;
    }

    public aabd getAppType() {
        return this.v;
    }

    public aabe getAppVariant() {
        return this.y;
    }

    public String getAppVersion() {
        return this.t;
    }

    public String getCity() {
        return this.k;
    }

    public String getClientId() {
        return this.o;
    }

    public Double getClientTs() {
        return this.d;
    }

    public Double getClientUploadTs() {
        return this.e;
    }

    public Long getConnectionDownloadBandwidthBps() {
        return this.C;
    }

    public String getCountry() {
        return this.j;
    }

    public aagy getDeviceConnectivity() {
        return this.n;
    }

    public String getDeviceModel() {
        return this.m;
    }

    public Double getEventHourTs() {
        return this.i;
    }

    public Double getEventTime() {
        return this.A;
    }

    public Double getEventTs() {
        return this.h;
    }

    public Double getFirstUploadAttemptTs() {
        return this.f;
    }

    public Long getFriendCount() {
        return this.c;
    }

    public Boolean getHasBitmoji() {
        return this.E;
    }

    public String getLocale() {
        return this.p;
    }

    public String getLogQueueName() {
        return this.F;
    }

    public Long getLogQueueSequenceId() {
        return this.G;
    }

    public String getOsMinorVersion() {
        return this.s;
    }

    public String getOsType() {
        return this.q;
    }

    public String getOsVersion() {
        return this.r;
    }

    public double getPerEventSamplingRate() {
        return 1.0d;
    }

    public double getPerUserSamplingRate() {
        return 1.0d;
    }

    public String getReferrer() {
        return this.B;
    }

    public String getRegion() {
        return this.l;
    }

    public Long getSequenceId() {
        return this.a;
    }

    public Double getServerTs() {
        return this.g;
    }

    public String getSessionId() {
        return this.w;
    }

    public abgn getTokenStatus() {
        return this.D;
    }

    public Double getTransformerProcessingTime() {
        return this.H;
    }

    public String getTransformerVersion() {
        return this.I;
    }

    public String getUserAgent() {
        return this.b;
    }

    public int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l != null ? l.hashCode() : 0) + 381486) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l2 = this.c;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Double d = this.d;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.e;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.f;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.g;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.h;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.i;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.k;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.m;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aagy aagy = this.n;
        hashCode = (hashCode + (aagy != null ? aagy.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.u;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabd aabd = this.v;
        hashCode = (hashCode + (aabd != null ? aabd.hashCode() : 0)) * 31;
        str = this.w;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.x;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        aabe aabe = this.y;
        hashCode = (hashCode + (aabe != null ? aabe.hashCode() : 0)) * 31;
        aabb aabb = this.z;
        hashCode = (hashCode + (aabb != null ? aabb.hashCode() : 0)) * 31;
        d = this.A;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.B;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l2 = this.C;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        abgn abgn = this.D;
        hashCode = (hashCode + (abgn != null ? abgn.hashCode() : 0)) * 31;
        bool = this.E;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str = this.F;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        l2 = this.G;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        d = this.H;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        str = this.I;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public void setAppBuild(String str) {
        this.u = str;
    }

    public void setAppStartupType(aabb aabb) {
        this.z = aabb;
    }

    public void setAppTravelMode(Boolean bool) {
        this.x = bool;
    }

    public void setAppType(aabd aabd) {
        this.v = aabd;
    }

    public void setAppVariant(aabe aabe) {
        this.y = aabe;
    }

    public void setAppVersion(String str) {
        this.t = str;
    }

    public void setCity(String str) {
        this.k = str;
    }

    public void setClientId(String str) {
        this.o = str;
    }

    public void setClientTs(Double d) {
        this.d = d;
    }

    public void setClientUploadTs(Double d) {
        this.e = d;
    }

    public void setConnectionDownloadBandwidthBps(Long l) {
        this.C = l;
    }

    public void setCountry(String str) {
        this.j = str;
    }

    public void setDeviceConnectivity(aagy aagy) {
        this.n = aagy;
    }

    public void setDeviceModel(String str) {
        this.m = str;
    }

    public void setEventHourTs(Double d) {
        this.i = d;
    }

    public void setEventTime(Double d) {
        this.A = d;
    }

    public void setEventTs(Double d) {
        this.h = d;
    }

    public void setFirstUploadAttemptTs(Double d) {
        this.f = d;
    }

    public void setFriendCount(Long l) {
        this.c = l;
    }

    public void setHasBitmoji(Boolean bool) {
        this.E = bool;
    }

    public void setLocale(String str) {
        this.p = str;
    }

    public void setLogQueueName(String str) {
        this.F = str;
    }

    public void setLogQueueSequenceId(Long l) {
        this.G = l;
    }

    public void setOsMinorVersion(String str) {
        this.s = str;
    }

    public void setOsType(String str) {
        this.q = str;
    }

    public void setOsVersion(String str) {
        this.r = str;
    }

    public void setReferrer(String str) {
        this.B = str;
    }

    public void setRegion(String str) {
        this.l = str;
    }

    public void setSequenceId(Long l) {
        this.a = l;
    }

    public void setServerTs(Double d) {
        this.g = d;
    }

    public void setSessionId(String str) {
        this.w = str;
    }

    public void setTokenStatus(abgn abgn) {
        this.D = abgn;
    }

    public void setTransformerProcessingTime(Double d) {
        this.H = d;
    }

    public void setTransformerVersion(String str) {
        this.I = str;
    }

    public void setUserAgent(String str) {
        this.b = str;
    }
}
