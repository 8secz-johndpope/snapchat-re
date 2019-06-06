package defpackage;

import defpackage.abmh.a;

/* renamed from: rpr */
public final class rpr {
    static final a a(abis abis, boolean z) {
        if (abis == null) {
            return null;
        }
        int i = rps.c[abis.ordinal()];
        if (i == 1) {
            return z ? rqd.INCOMING_RINGTONE_IN_CALL : rqd.INCOMING_RINGTONE;
        } else if (i != 2) {
            rqd rqd;
            if (i == 3) {
                rqd = rqd.OUTGOING_RINGTONE;
            } else if (i != 4) {
                return null;
            } else {
                rqd = rqd.OUTGOING_BEST_FRIEND_RINGTONE;
            }
            return rqd;
        } else {
            return z ? rqd.INCOMING_RINGTONE_IN_CALL : rqd.INCOMING_RINGTONE_BEST_FRIEND;
        }
    }

    static final boolean a(abix.a aVar) {
        return aVar == abix.a.IN_CALL_OR_ANSWERED;
    }

    static final abis b(abix.a aVar) {
        int i = rps.a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i == 3) {
            return abis.INCOMING;
        }
        if (i == 4) {
            return abis.OUTGOING;
        }
        throw new ajxk();
    }
}
