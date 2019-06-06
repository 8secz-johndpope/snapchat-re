package defpackage;

import android.os.Handler;
import com.snapchat.talkcorev3.PresenceMessage;
import com.snapchat.talkcorev3.PresenceServiceDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: yxc */
public final class yxc extends PresenceServiceDelegate {
    private final yxv a;
    private final Handler b;
    private final abji c;

    public yxc(yxv yxv, Handler handler, abji abji) {
        akcr.b(yxv, "talkManager");
        akcr.b(handler, "talkCoreHandler");
        akcr.b(abji, "chatTransportServices");
        this.a = yxv;
        this.b = handler;
        this.c = abji;
    }

    public final ArrayList<String> getParticipantUsernames(String str) {
        akcr.b(str, "conversationId");
        return new ArrayList(this.a.c(str).keySet());
    }

    public final HashMap<String, String> getUserIdMap(ArrayList<String> arrayList, String str) {
        akcr.b(arrayList, "usernames");
        akcr.b(str, "conversationId");
        Set m = ajyu.m(arrayList);
        Object c = this.a.c(str);
        akcr.a(c, "talkManager.getParticipants(conversationId)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : c.entrySet()) {
            if (m.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map map = linkedHashMap;
        Map linkedHashMap2 = new LinkedHashMap(ajzm.a(map.size()));
        for (Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            Object obj = (abjv) entry2.getValue();
            akcr.a(obj, "participant");
            linkedHashMap2.put(key, obj.f());
        }
        Map hashMap = new HashMap();
        akcr.b(linkedHashMap2, "receiver$0");
        akcr.b(hashMap, "destination");
        hashMap.putAll(linkedHashMap2);
        return (HashMap) hashMap;
    }

    public final void notifyActiveConversationsChanged() {
        this.a.d();
    }

    public final void sendPresenceMessage(PresenceMessage presenceMessage) {
        akcr.b(presenceMessage, "presenceMessage");
        try {
            abji abji = this.c;
            String conversationId = presenceMessage.getConversationId();
            List recipients = presenceMessage.getRecipients();
            Map legacyPresences = presenceMessage.getLegacyPresences();
            Map extendedPresences = presenceMessage.getExtendedPresences();
            Object presencesMetadata = presenceMessage.getPresencesMetadata();
            akcr.a(presencesMetadata, "presenceMessage.presencesMetadata");
            Map map = (Map) presencesMetadata;
            Map linkedHashMap = new LinkedHashMap(ajzm.a(map.size()));
            for (Object next : map.entrySet()) {
                Object key = ((Entry) next).getKey();
                ArrayList arrayList = (ArrayList) ((Entry) next).getValue();
                if (arrayList != null) {
                    linkedHashMap.put(key, arrayList);
                } else {
                    throw new ajxt("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
            }
            abji.a(conversationId, recipients, legacyPresences, extendedPresences, linkedHashMap);
        } catch (Exception unused) {
        }
    }
}
