package defpackage;

import com.brightcove.player.captioning.TTMLParser.Tags;
import com.brightcove.player.event.Event;
import java.util.List;

/* renamed from: znk */
public final class znk {
    public static final zne<Object> a = new zne();

    static {
        znk znk = new znk();
    }

    private znk() {
    }

    public static final <T> znh<T> a(T t) {
        return new znf(ajyl.a(t));
    }

    public static final <T> znh<T> a(List<? extends T> list) {
        akcr.b(list, Event.LIST);
        return new znf(ajyu.k(list));
    }

    public static final <T> znh<T> a(znh<T> znh, znh<T> znh2) {
        akcr.b(znh, Tags.HEAD);
        akcr.b(znh2, "tail");
        return new znc(znh, znh2);
    }

    public static final <T> znh<T> b(List<? extends znh<T>> list) {
        akcr.b(list, "seekables");
        return new znd(list);
    }
}
