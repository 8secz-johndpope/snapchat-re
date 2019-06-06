package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.api.DbTransaction;

/* renamed from: adpm */
public final class adpm {
    private final adpb a;
    private final adpo b;
    private final adpq c;
    private final adpv d;
    private final adpi e;
    private final adpn f;
    private final adpe g;

    /* renamed from: adpm$a */
    public static final class a {
        public final long a;
        final long b;

        public /* synthetic */ a() {
            this(-1, -1);
        }

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) != null) {
                        if ((this.b == aVar.b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("MessageEntry(feedId=");
            stringBuilder.append(this.a);
            stringBuilder.append(", messageId=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public adpm(ihh ihh, gpb gpb, aipn<qvd> aipn, aipn<quk> aipn2, aipn<iqz> aipn3, aipn<iqx> aipn4, aipn<qup> aipn5, aipn<qvi> aipn6, aipn<hyq> aipn7, pru pru, ajwy<qus> ajwy, ajwy<ftl> ajwy2, ajwy<qpb> ajwy3, ajwy<qvo> ajwy4, ajwy<qvj> ajwy5) {
        akcr.b(ihh, "clock");
        akcr.b(gpb, "userAuth");
        akcr.b(aipn, "messagingRepository");
        akcr.b(aipn2, "conversationsRepository");
        akcr.b(aipn3, "friendmojiRepository");
        akcr.b(aipn4, "friendRepository");
        akcr.b(aipn5, "friendsFeedSnapDbLogger");
        akcr.b(aipn6, "networkMessageProcessor");
        akcr.b(aipn7, "fideliusManager");
        akcr.b(pru, "messageReleaseUpdatesProcessor");
        akcr.b(ajwy, "interactionMessagesRepository");
        akcr.b(ajwy2, "configProvider");
        akcr.b(ajwy3, "receivedSnapMetricsController");
        akcr.b(ajwy4, "sequenceNumberRepository");
        akcr.b(ajwy5, "networkMessageRepository");
        gpb gpb2 = gpb;
        aipn<qvd> aipn8 = aipn;
        aipn<quk> aipn9 = aipn2;
        aipn<iqx> aipn10 = aipn4;
        aipn<qup> aipn11 = aipn5;
        this.a = new adpb(ihh, gpb2, aipn8, aipn9, aipn10, aipn11, aipn6, ajwy2, ajwy4);
        Object obj = aipn6.get();
        akcr.a(obj, "networkMessageProcessor.get()");
        ihh ihh2 = ihh;
        this.b = new adpo(ihh2, gpb2, aipn8, aipn9, aipn10, aipn11, aipn3, aipn7, ajwy, (qvi) obj, ajwy2, ajwy3, ajwy4, ajwy5);
        this.c = new adpq(ihh2, gpb2, aipn8, aipn9, aipn10, aipn11, pru, ajwy4);
        this.d = new adpv(ihh2, gpb2, aipn8, aipn9, aipn10, aipn11, aipn7, aipn6, ajwy2, ajwy4);
        aipn<qvi> aipn12 = aipn6;
        ajwy<qvo> ajwy6 = ajwy4;
        this.e = new adpi(ihh2, gpb2, aipn8, aipn9, aipn10, aipn11, aipn12, ajwy6);
        this.f = new adpn(ihh2, gpb2, aipn8, aipn9, aipn10, aipn11, aipn12, ajwy6);
        this.g = new adpe(ihh2, gpb2, aipn8, aipn9, aipn10, aipn11, aipn12, ajwy6);
    }

    public final <T extends aeie> a a(DbTransaction dbTransaction, T t) {
        akcr.b(dbTransaction, "tx");
        akcr.b(t, ErrorFields.MESSAGE);
        return t instanceof aetd ? this.e.a(dbTransaction, (aeie) t) : t instanceof aegj ? this.a.a(dbTransaction, (aeie) t) : t instanceof aehb ? this.d.a(dbTransaction, (aeie) t) : t instanceof aeyr ? this.d.a(dbTransaction, (aeie) t) : t instanceof aegz ? this.c.a(dbTransaction, (aeie) t) : t instanceof aewe ? this.c.a(dbTransaction, (aeie) t) : t instanceof aevu ? this.b.a(dbTransaction, (aeie) t) : t instanceof aesx ? this.f.a(dbTransaction, (aeie) t) : t instanceof aesr ? this.g.a(dbTransaction, (aeie) t) : new a();
    }
}
