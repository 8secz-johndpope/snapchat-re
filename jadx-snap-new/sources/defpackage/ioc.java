package defpackage;

import defpackage.ily.a;

/* renamed from: ioc */
public enum ioc implements ily {
    MY_SAMPLE_FRIENDS_FEED_EVENT,
    MUTUAL_FRIEND_CONVO_NOT_READY,
    FEED_SNAP_TAP,
    AY_TRIGGERED_CONVO_SYNC,
    AY_TRIGGERED_CONVO_SYNC_LATENCY,
    AY_TRIGGERED_CONVO_SYNC_RESULT,
    SYNC_LATENCY;

    public final ilz a(String str, Enum<?> enumR) {
        akcr.b(str, "shortKey");
        akcr.b(enumR, "shortValue");
        return a.a((ily) this, str, (Enum) enumR);
    }

    public final ilz a(String str, String str2) {
        akcr.b(str, "shortKey");
        akcr.b(str2, "shortValue");
        return a.a((ily) this, str, str2);
    }

    public final ilz a(String str, boolean z) {
        akcr.b(str, "shortKey");
        return a.a((ily) this, str, z);
    }

    public final ink a() {
        return ink.FRIENDS_FEED;
    }

    public final ilz b() {
        return a.a(this);
    }
}
