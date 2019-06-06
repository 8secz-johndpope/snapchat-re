package defpackage;

/* renamed from: ifo */
public class ifo<PayloadType> implements ifj {
    PayloadType a;
    private final Class<? extends PayloadType> b;
    private final PayloadType c;

    /* renamed from: ifo$a */
    static final class a extends akcq implements akbl<iff<? extends PayloadType>, ajxw> {
        a(ifo ifo) {
            super(1, ifo);
        }

        public final String getName() {
            return "onEventUpdated";
        }

        public final akej getOwner() {
            return akde.a(ifo.class);
        }

        public final String getSignature() {
            return "onEventUpdated(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            ((ifo) this.receiver).a = iff.a;
            return ajxw.a;
        }
    }

    private ifo(Class<? extends PayloadType> cls, PayloadType payloadType) {
        akcr.b(cls, "payloadType");
        akcr.b(payloadType, "defaultValue");
        this.b = cls;
        this.c = payloadType;
    }

    public ifo(PayloadType payloadType) {
        akcr.b(payloadType, "defaultValue");
        this(payloadType.getClass(), payloadType);
    }

    public final PayloadType a() {
        Object obj = this.a;
        return obj == null ? this.c : obj;
    }

    public final void a(ifg ifg) {
        akcr.b(ifg, "netEventBus");
        ifh.a(ifg, this.b, new a(this));
    }
}
