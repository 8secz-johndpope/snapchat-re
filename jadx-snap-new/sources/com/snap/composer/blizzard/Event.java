package com.snap.composer.blizzard;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Event implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;
    private final Map<String, Object> b;
    private final boolean c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Event fromJavaScript(Object obj) {
            if (obj instanceof Event) {
                return (Event) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String asString = JSConversions.INSTANCE.asString(map.get("name"));
                String str = "parameters";
                Object obj2 = map.get(str);
                if (!(obj2 instanceof Map)) {
                    obj2 = null;
                }
                Map map2 = (Map) obj2;
                if (map2 != null) {
                    return new Event(asString, map2, JSConversions.INSTANCE.asBoolean(map.get("userTracked")));
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                stringBuilder.append(map.get(str));
                stringBuilder.append(" to Map<String, Any?>");
                throw new AttributeError(stringBuilder.toString());
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(Event event) {
            akcr.b(event, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("name", event.getName());
            linkedHashMap.put("parameters", event.getParameters());
            linkedHashMap.put("userTracked", Boolean.valueOf(event.getUserTracked()));
            return linkedHashMap;
        }
    }

    public Event(String str, Map<String, ? extends Object> map, boolean z) {
        akcr.b(str, "name");
        akcr.b(map, "parameters");
        this.a = str;
        this.b = map;
        this.c = z;
    }

    public static /* synthetic */ Event copy$default(Event event, String str, Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = event.a;
        }
        if ((i & 2) != 0) {
            map = event.b;
        }
        if ((i & 4) != 0) {
            z = event.c;
        }
        return event.copy(str, map, z);
    }

    public final String component1() {
        return this.a;
    }

    public final Map<String, Object> component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final Event copy(String str, Map<String, ? extends Object> map, boolean z) {
        akcr.b(str, "name");
        akcr.b(map, "parameters");
        return new Event(str, map, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Event) {
                Event event = (Event) obj;
                if (akcr.a(this.a, event.a) && akcr.a(this.b, event.b)) {
                    if ((this.c == event.c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getName() {
        return this.a;
    }

    public final Map<String, Object> getParameters() {
        return this.b;
    }

    public final boolean getUserTracked() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.b;
        if (map != null) {
            i = map.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.c;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Event(name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", parameters=");
        stringBuilder.append(this.b);
        stringBuilder.append(", userTracked=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
