package defpackage;

import android.text.TextUtils;
import com.snap.core.model.FriendMessageRecipient;
import com.snap.core.model.GroupMessageRecipient;
import com.snap.core.model.MessageRecipient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* renamed from: adpa */
public final class adpa {

    /* renamed from: adpa$a */
    static final class a<T> implements Comparator<String> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str = (String) obj;
            obj2 = (String) obj2;
            akcr.a(obj2, "o");
            return str.compareTo(obj2);
        }
    }

    public static final String a(Collection<? extends MessageRecipient> collection) {
        akcr.b(collection, "receiver$0");
        List b = adpa.b(collection);
        if (b.isEmpty()) {
            return null;
        }
        Iterable<MessageRecipient> iterable = b;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (MessageRecipient id : iterable) {
            arrayList.add(id.getId());
        }
        return TextUtils.join(ppy.d, ajyu.a((Iterable) (List) arrayList, (Comparator) a.a));
    }

    public static final List<MessageRecipient> b(Collection<? extends MessageRecipient> collection) {
        akcr.b(collection, "receiver$0");
        Collection arrayList = new ArrayList();
        for (Object next : collection) {
            MessageRecipient messageRecipient = (MessageRecipient) next;
            Object obj = ((messageRecipient instanceof FriendMessageRecipient) || (messageRecipient instanceof GroupMessageRecipient)) ? 1 : null;
            if (obj != null) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
