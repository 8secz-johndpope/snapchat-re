package defpackage;

import defpackage.aesm.a;
import java.util.List;

/* renamed from: adqs */
public final class adqs {
    public static <T extends aeie> T a(String str, a aVar, String str2, List<String> list, boolean z, Long l, aexp aexp) {
        aeof aeof = new aeof();
        aeof.c = str;
        aeof.a = str2;
        aeof.b = list;
        aeof.d = Boolean.valueOf(z);
        aeof.f = l;
        aeof.e = aexp;
        aeie aeie = (aeie) adqs.b(aVar);
        if (aeie != null) {
            aeie.i = aeof;
            return aeie;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid message type ");
        stringBuilder.append(aVar);
        stringBuilder.append(" requested for creation");
        throw new RuntimeException(stringBuilder.toString());
    }

    public static Class<? extends aesm> a(a aVar) {
        switch (aVar) {
            case CASH_RAIN:
                return aefa.class;
            case PRESENCE:
            case PRESENCE_V2:
                return aeuw.class;
            case CONNECTED_CALL:
                return aehr.class;
            case MESSAGE_RELEASE:
                return aewe.class;
            case SNAP_STATE:
                return aeyr.class;
            case CHAT_MESSAGE:
                return aegj.class;
            case CASH_STATE:
                return aefc.class;
            case MESSAGE_STATE:
                return aesx.class;
            case CHATV3_MESSAGE_RELEASE:
                return aegz.class;
            case CHATV3_SNAP_STATE:
                return aehb.class;
            case MESSAGE_PRESERVATION:
                return aesv.class;
            case MESSAGE_ERASE:
                return aesr.class;
            case CHATV3_UPDATE_MESSAGE:
                return aetd.class;
            case RECEIVED_SNAP:
                return aevu.class;
            case ERROR:
                return aeke.class;
            case PROTOCOL_ERROR:
                return aevi.class;
            case CONVERSATION_MESSAGE_RESPONSE:
                return aeig.class;
            case CONNECT:
                return aehn.class;
            case CONNECT_RESPONSE:
                return aehp.class;
            case DISCONNECT:
                return aejm.class;
            case DISCONNECT_CLIENT:
                return aejk.class;
            case PING:
                return aeuk.class;
            case PING_RESPONSE:
                return aeum.class;
            case NOTIFICATION:
                return aett.class;
            case VOLATILE_MESSAGE:
                return afgh.class;
            default:
                return null;
        }
    }

    private static <T> T a(Class<T> cls) {
        try {
            Object newInstance = cls.newInstance();
            if (newInstance instanceof aesm) {
                ((aesm) newInstance).p = iig.a().toString();
            }
            return newInstance;
        } catch (IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    public static boolean a(aesm aesm) {
        int i = 1.a[a.a(aesm.o).ordinal()];
        if (!(i == 5 || i == 7)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static <T extends aesm> T b(a aVar) {
        Class a = adqs.a(aVar);
        if (a == null) {
            return null;
        }
        aesm aesm = (aesm) adqs.a(a);
        aesm.o = aVar.toString();
        return aesm;
    }
}
