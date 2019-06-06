package com.brightcove.player.event;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.brightcove.player.util.ErrorUtil;
import defpackage.yb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventEmitterImpl implements EventEmitter {
    String a;
    private Map<String, ArrayList<yb>> b;
    private boolean c;
    private Handler d;
    private List<Object> e;

    @SuppressLint({"HandlerLeak"})
    public EventEmitterImpl() {
        this.a = "EventEmitterImpl";
        this.c = true;
        this.e = new ArrayList();
        this.a = toString();
        this.d = new Handler() {
            public final void handleMessage(Message message) {
                Map map = (Map) message.obj;
                String str = (String) map.get("event");
                Event event = new Event(str);
                for (String str2 : map.keySet()) {
                    if (str2.startsWith("prop_")) {
                        event.properties.put(str2.substring(5), map.get(str2));
                    }
                }
                EventEmitterImpl.this.a(event, EventType.ANY);
                if (str.equals(EventType.RESPONSE)) {
                    EventEmitterImpl eventEmitterImpl = EventEmitterImpl.this;
                    List a = eventEmitterImpl.a(event.getType());
                    int integerProperty = event.getIntegerProperty(Event.REQUEST_TOKEN);
                    int a2 = EventEmitterImpl.a(a, integerProperty);
                    yb ybVar = null;
                    if (a2 >= 0) {
                        ybVar = (yb) a.get(a2);
                    }
                    if (ybVar != null) {
                        try {
                            ybVar.c.processEvent(event);
                        } catch (Throwable th) {
                            Log.e(eventEmitterImpl.a, "processEvent() threw a throwable.", th);
                        }
                        eventEmitterImpl.off(event.getType(), integerProperty);
                    }
                    return;
                }
                EventEmitterImpl.this.a(event, event.getType());
            }
        };
        this.b = new HashMap();
    }

    private int a(String str, EventListener eventListener, boolean z) {
        if (!this.c) {
            return -1;
        }
        if (str == null || eventListener == null) {
            String str2 = this.a;
            StringBuilder stringBuilder = new StringBuilder("Invalid input provided to on: evenType = ");
            stringBuilder.append(str);
            stringBuilder.append(", listener = ");
            stringBuilder.append(eventListener);
            Log.e(str2, stringBuilder.toString());
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.EVENT_TYPE_AND_LISTENER_REQUIRED));
        }
        ArrayList a = a(str);
        yb ybVar = new yb(eventListener, z);
        if (ybVar.b || a.isEmpty() || !((yb) a.get(a.size() - 1)).b) {
            a.add(ybVar);
        } else {
            int size = a.size();
            for (int i = 0; i < size; i++) {
                if (((yb) a.get(i)).b) {
                    a.add(i, ybVar);
                    break;
                }
            }
        }
        return ybVar.a;
    }

    static int a(List<yb> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((yb) list.get(i2)).a == i) {
                return i2;
            }
        }
        return -1;
    }

    private static void a(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            map2.put("prop_".concat(String.valueOf(str)), map.get(str));
        }
    }

    /* Access modifiers changed, original: final */
    public final ArrayList<yb> a(String str) {
        if (this.b.containsKey(str)) {
            return (ArrayList) this.b.get(str);
        }
        ArrayList<yb> arrayList = new ArrayList();
        this.b.put(str, arrayList);
        return arrayList;
    }

    /* Access modifiers changed, original: final */
    public final void a(Event event, String str) {
        ArrayList a = a(str);
        for (yb ybVar : (List) a.clone()) {
            if (!(ybVar.b || event.isStopped()) || (ybVar.b && !event.isPrevented())) {
                try {
                    ybVar.c.processEvent(event);
                } catch (Throwable th) {
                    Log.e(this.a, "processEvent() threw a throwable.", th);
                }
                if (ybVar.d) {
                    a.remove(ybVar);
                }
            }
        }
    }

    public void disable() {
        this.c = false;
    }

    public void emit(String str) {
        emit(str, Collections.emptyMap());
    }

    public void emit(String str, Map<String, Object> map) {
        if (!this.c) {
            return;
        }
        if (str != null) {
            Message obtain = Message.obtain();
            Map hashMap = new HashMap();
            hashMap.put("event", str);
            if (!map.isEmpty()) {
                a((Map) map, hashMap);
            }
            obtain.obj = hashMap;
            this.d.sendMessage(obtain);
            return;
        }
        Log.e(this.a, "Received an emit without an EventType");
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.INVALID_EMIT));
    }

    public void enable() {
        this.c = true;
    }

    public void off() {
        this.b.clear();
    }

    public void off(String str, int i) {
        if (i >= 0) {
            List a = a(str);
            i = a(a, i);
            if (i >= 0) {
                a.remove(i);
            }
            return;
        }
        Log.w(this.a, "Off attempted for invalid token of ".concat(String.valueOf(i)));
    }

    public int on(String str, EventListener eventListener) {
        return a(str, eventListener, false);
    }

    public int once(String str, EventListener eventListener) {
        return a(str, eventListener, true);
    }

    public void request(String str, EventListener eventListener) {
        request(str, new HashMap(), eventListener);
    }

    public void request(String str, Map<String, Object> map, EventListener eventListener) {
        String str2 = Event.REQUEST_TOKEN;
        if (this.c) {
            Map map2;
            int once = once(EventType.RESPONSE, eventListener);
            if (map2 == null) {
                map2 = new HashMap();
            }
            try {
                map2.put(str2, Integer.valueOf(once));
            } catch (UnsupportedOperationException unused) {
                HashMap hashMap = new HashMap(map2);
                hashMap.put(str2, Integer.valueOf(once));
                map2 = hashMap;
            }
            emit(str, map2);
        }
    }

    public void respond(Event event) {
        respond(event.properties);
    }

    public void respond(Map<String, Object> map) {
        if (this.c) {
            if (map.containsKey(Event.REQUEST_TOKEN)) {
                emit(EventType.RESPONSE, map);
                return;
            }
            Log.d(this.a, "Respond attempted without an requestToken");
        }
    }
}
