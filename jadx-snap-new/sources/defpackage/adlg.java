package defpackage;

import java.util.EnumMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: adlg */
public final class adlg {
    UUID a;
    ide b;
    adgw c;
    Map<adlh, Long> d;
    long e;
    adkz f;

    public /* synthetic */ adlg() {
        this(null, null, null, new EnumMap(adlh.class), 0, null);
    }

    public adlg(UUID uuid, ide ide, adgw adgw, Map<adlh, Long> map, long j, adkz adkz) {
        akcr.b(map, "playerEventTimeMap");
        this.a = uuid;
        this.b = ide;
        this.c = adgw;
        this.d = map;
        this.e = j;
        this.f = adkz;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof adlg) {
                adlg adlg = (adlg) obj;
                if (akcr.a(this.a, adlg.a) && akcr.a(this.b, adlg.b) && akcr.a(this.c, adlg.c) && akcr.a(this.d, adlg.d)) {
                    if ((this.e == adlg.e ? 1 : null) == null || !akcr.a(this.f, adlg.f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        UUID uuid = this.a;
        int i = 0;
        int hashCode = (uuid != null ? uuid.hashCode() : 0) * 31;
        ide ide = this.b;
        hashCode = (hashCode + (ide != null ? ide.hashCode() : 0)) * 31;
        adgw adgw = this.c;
        hashCode = (hashCode + (adgw != null ? adgw.hashCode() : 0)) * 31;
        Map map = this.d;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j = this.e;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        adkz adkz = this.f;
        if (adkz != null) {
            i = adkz.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackSessionRecord(playerSessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", caller=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mediaSource=");
        stringBuilder.append(this.c);
        stringBuilder.append(", playerEventTimeMap=");
        stringBuilder.append(this.d);
        stringBuilder.append(", loopCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", failureEvent=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
