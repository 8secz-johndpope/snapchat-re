package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: acak */
public final class acak {
    public final String a;

    /* renamed from: acak$a */
    public enum a {
        NO_EFFECT("NONE"),
        MUTED(r3),
        HIGH_PITCH("HIGH PITCH"),
        LOW_PITCH("LOW PITCH"),
        ROBOT(r6),
        OWL(r7);
        
        @SerializedName(alternate = {"mEffectId"}, value = "effectId")
        private final String mEffectId;

        private a(String str) {
            this.mEffectId = str;
        }

        public static a a(String str) {
            for (a aVar : a.values()) {
                if (akly.a(aVar.mEffectId, (CharSequence) str)) {
                    return aVar;
                }
            }
            return NO_EFFECT;
        }

        public final String a() {
            return this.mEffectId;
        }
    }

    public acak(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final a b() {
        return a.a(this.a);
    }

    public final boolean c() {
        a a = a.a(this.a);
        return (a == a.NO_EFFECT || a == a.MUTED) ? false : true;
    }

    public final boolean d() {
        return a.a(this.a) == a.MUTED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acak)) {
            return false;
        }
        return akly.a(this.a, ((acak) obj).a);
    }

    public final int hashCode() {
        return new akmd().a(this.a).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("effect_id", this.a).toString();
    }
}
