package com.brightcove.player.event;

import com.brightcove.player.util.ErrorUtil;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractComponent implements Component {
    private Map<String, Integer> a;
    public EventEmitter eventEmitter;

    public AbstractComponent(EventEmitter eventEmitter) {
        this(eventEmitter, null);
    }

    public AbstractComponent(EventEmitter eventEmitter, Class<? extends Component> cls) {
        this.a = new HashMap();
        if (eventEmitter != null) {
            if (cls != null) {
                eventEmitter = RegisteringEventEmitter.build(eventEmitter, cls);
            }
            this.eventEmitter = eventEmitter;
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.EVENT_EMITTER_REQUIRED));
    }

    public void addListener(String str, EventListener eventListener) {
        this.a.put(str, Integer.valueOf(this.eventEmitter.on(str, eventListener)));
    }

    public void addOnceListener(String str, EventListener eventListener) {
        this.a.put(str, Integer.valueOf(this.eventEmitter.once(str, eventListener)));
    }

    public EventEmitter getEventEmitter() {
        return this.eventEmitter;
    }

    public void removeListener(String str) {
        if (this.a.containsKey(str)) {
            this.eventEmitter.off(str, ((Integer) this.a.get(str)).intValue());
        }
    }

    public void removeListeners() {
        for (String str : this.a.keySet()) {
            this.eventEmitter.off(str, ((Integer) this.a.get(str)).intValue());
        }
        this.a.clear();
    }
}
