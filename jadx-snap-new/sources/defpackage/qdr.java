package defpackage;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.NetworkMessageRecord;

/* renamed from: qdr */
public final class qdr {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final MessageClientStatus f;
    public final String g;
    public final puk h;
    public final gcj i;
    public final gcm j;
    public final boolean k;
    public final Long l;
    public final ScreenshottedOrReplayedState m;
    public final SnapServerStatus n;
    public final yfj o;
    public final Long p;

    /* renamed from: qdr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static qdr a(NetworkMessageRecord networkMessageRecord, puk puk) {
            akcr.b(networkMessageRecord, "networkMessageRecord");
            akcr.b(puk, "serializableParcelContent");
            Object messageId = networkMessageRecord.messageId();
            akcr.a(messageId, "networkMessageRecord.messageId()");
            Object conversationId = networkMessageRecord.conversationId();
            if (conversationId == null) {
                akcr.a();
            }
            akcr.a(conversationId, "networkMessageRecord.conversationId()!!");
            long sentTimestamp = networkMessageRecord.sentTimestamp();
            long senderId = networkMessageRecord.senderId();
            Object sequenceNumber = networkMessageRecord.sequenceNumber();
            if (sequenceNumber == null) {
                akcr.a();
            }
            akcr.a(sequenceNumber, "networkMessageRecord.sequenceNumber()!!");
            long longValue = sequenceNumber.longValue();
            Object clientStatus = networkMessageRecord.clientStatus();
            if (clientStatus == null) {
                akcr.a();
            }
            akcr.a(clientStatus, "networkMessageRecord.clientStatus()!!");
            sequenceNumber = networkMessageRecord.messageType();
            String str = sequenceNumber;
            akcr.a(sequenceNumber, "networkMessageRecord.messageType()");
            sequenceNumber = networkMessageRecord.preserved();
            gcj gcj = sequenceNumber;
            akcr.a(sequenceNumber, "networkMessageRecord.preserved()");
            return new qdr(messageId, conversationId, sentTimestamp, senderId, longValue, clientStatus, str, puk, gcj, networkMessageRecord.savedStates(), networkMessageRecord.released(), networkMessageRecord.seenTimestamp(), networkMessageRecord.screenshottedOrReplayed(), networkMessageRecord.snapServerStatus(), networkMessageRecord.viewerList(), networkMessageRecord.lastInteractionTimestamp());
        }

        public static qdr a(qdx qdx, long j, long j2) {
            qdx qdx2 = qdx;
            akcr.b(qdx2, "sentMessageParcel");
            Object obj = null;
            Object obj2 = (qdx2.d == MessageClientStatus.OK || qdx2.d == MessageClientStatus.PENDING) ? 1 : null;
            if (obj2 != null) {
                SnapServerStatus snapServerStatus;
                puk puk = qdx2.c.d;
                if (puk instanceof ptp) {
                    ptp ptp = (ptp) puk;
                    prm prm = ptp.b;
                    if (prm != null) {
                        if (ptp.c != null) {
                            obj = 1;
                        }
                        if (obj != null) {
                            String str = ptp.c;
                            if (str == null) {
                                akcr.a();
                            }
                            ptp = ptp.a(new prm(str, ptf.a(prm.b), prm.c, prm.d, prm.e, prm.f, prm.g, false, null, false, null, 1920));
                        } else {
                            throw new IllegalStateException("A media id returned by loq/story_reply should have been set on this context reply!".toString());
                        }
                    }
                    puk = ptp;
                }
                String str2 = qdx2.a;
                String id = qdx2.b.getId();
                long j3 = qdx2.f;
                MessageClientStatus messageClientStatus = qdx2.d;
                String str3 = qdx2.c.a;
                puk pvn = new pvn(puk.b());
                gcj gcj = gcj.INITIAL;
                boolean z = puk instanceof pun;
                ScreenshottedOrReplayedState empty = z ? ScreenshottedOrReplayedState.Companion.empty() : null;
                if (z) {
                    snapServerStatus = qdx2.d == MessageClientStatus.OK ? SnapServerStatus.DELIVERED : SnapServerStatus.PENDING;
                } else {
                    snapServerStatus = null;
                }
                return new qdr(str2, id, j2, j, j3, messageClientStatus, str3, pvn, gcj, null, empty, snapServerStatus, null, 52224);
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    static {
        a aVar = new a();
    }

    public /* synthetic */ qdr(String str, String str2, long j, long j2, long j3, MessageClientStatus messageClientStatus, String str3, puk puk, gcj gcj, gcm gcm, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, yfj yfj, int i) {
        int i2 = i;
        this(str, str2, j, j2, j3, messageClientStatus, str3, puk, gcj, gcm, false, null, (i2 & 4096) != 0 ? null : screenshottedOrReplayedState, (i2 & 8192) != 0 ? null : snapServerStatus, (i2 & 16384) != 0 ? null : yfj, null);
    }

    public qdr(String str, String str2, long j, long j2, long j3, MessageClientStatus messageClientStatus, String str3, puk puk, gcj gcj, gcm gcm, boolean z, Long l, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, yfj yfj, Long l2) {
        String str4 = str;
        String str5 = str2;
        MessageClientStatus messageClientStatus2 = messageClientStatus;
        String str6 = str3;
        puk puk2 = puk;
        gcj gcj2 = gcj;
        akcr.b(str, "id");
        akcr.b(str2, "conversationId");
        akcr.b(messageClientStatus2, "clientStatus");
        akcr.b(str6, "messageType");
        akcr.b(puk2, "content");
        akcr.b(gcj2, "preservationState");
        this.a = str4;
        this.b = str5;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = messageClientStatus2;
        this.g = str6;
        this.h = puk2;
        this.i = gcj2;
        this.j = gcm;
        this.k = z;
        this.l = l;
        this.m = screenshottedOrReplayedState;
        this.n = snapServerStatus;
        this.o = yfj;
        this.p = l2;
        puk puk3 = this.h;
        if (!(puk3 instanceof pvn)) {
            if (!(puk3 instanceof pun)) {
                Object obj = 1;
                if ((this.m == null ? 1 : null) != null) {
                    if ((this.n == null ? 1 : null) != null) {
                        if (this.o != null) {
                            obj = null;
                        }
                        if (obj == null) {
                            throw new IllegalStateException("Only snaps should have a viewer list".toString());
                        }
                    }
                    throw new IllegalStateException("Only snaps can have a snap server status".toString());
                }
                throw new IllegalStateException("Only snaps can have a screenshotted or replayed state".toString());
            } else if (this.m == null) {
                throw new IllegalStateException("Snaps must have a screenshotted or replayed state".toString());
            } else if (this.n == null) {
                throw new IllegalStateException("Snaps must have a snap server status".toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qdr) {
                qdr qdr = (qdr) obj;
                if (akcr.a(this.a, qdr.a) && akcr.a(this.b, qdr.b)) {
                    if ((this.c == qdr.c ? 1 : null) != null) {
                        if ((this.d == qdr.d ? 1 : null) != null) {
                            if ((this.e == qdr.e ? 1 : null) != null && akcr.a(this.f, qdr.f) && akcr.a(this.g, qdr.g) && akcr.a(this.h, qdr.h) && akcr.a(this.i, qdr.i) && akcr.a(this.j, qdr.j)) {
                                if (!((this.k == qdr.k ? 1 : null) != null && akcr.a(this.l, qdr.l) && akcr.a(this.m, qdr.m) && akcr.a(this.n, qdr.n) && akcr.a(this.o, qdr.o) && akcr.a(this.p, qdr.p))) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.c;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.d;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.e;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        MessageClientStatus messageClientStatus = this.f;
        hashCode = (hashCode + (messageClientStatus != null ? messageClientStatus.hashCode() : 0)) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        puk puk = this.h;
        hashCode = (hashCode + (puk != null ? puk.hashCode() : 0)) * 31;
        gcj gcj = this.i;
        hashCode = (hashCode + (gcj != null ? gcj.hashCode() : 0)) * 31;
        gcm gcm = this.j;
        hashCode = (hashCode + (gcm != null ? gcm.hashCode() : 0)) * 31;
        int i2 = this.k;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        Long l = this.l;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.m;
        hashCode = (hashCode + (screenshottedOrReplayedState != null ? screenshottedOrReplayedState.hashCode() : 0)) * 31;
        SnapServerStatus snapServerStatus = this.n;
        hashCode = (hashCode + (snapServerStatus != null ? snapServerStatus.hashCode() : 0)) * 31;
        yfj yfj = this.o;
        hashCode = (hashCode + (yfj != null ? yfj.hashCode() : 0)) * 31;
        l = this.p;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkMessage(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", conversationId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.c);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.d);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.e);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.f);
        stringBuilder.append(", messageType=");
        stringBuilder.append(this.g);
        stringBuilder.append(", content=");
        stringBuilder.append(this.h);
        stringBuilder.append(", preservationState=");
        stringBuilder.append(this.i);
        stringBuilder.append(", savedStates=");
        stringBuilder.append(this.j);
        stringBuilder.append(", released=");
        stringBuilder.append(this.k);
        stringBuilder.append(", seenTimestamp=");
        stringBuilder.append(this.l);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.m);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.n);
        stringBuilder.append(", viewerList=");
        stringBuilder.append(this.o);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.p);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
