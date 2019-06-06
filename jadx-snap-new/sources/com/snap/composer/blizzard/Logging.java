package com.snap.composer.blizzard;

import com.snap.composer.actions.ComposerRunnableAction;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import java.util.LinkedHashMap;
import java.util.Map;

public interface Logging extends ComposerJsConvertible {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        static final class a extends akcs implements akbl<Object[], ajxw> {
            private /* synthetic */ Logging a;

            a(Logging logging) {
                this.a = logging;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "_params");
                this.a.logBlizzardEvent(Event.Companion.fromJavaScript(JSConversions.INSTANCE.getParameterOrNull(objArr, 0)));
                return ajxw.a;
            }
        }

        private Companion() {
        }

        public final Logging fromJavaScript(Object obj) {
            if (obj instanceof Map) {
                obj = JSConversions.INSTANCE.unwrapNativeInstance(((Map) obj).get("$nativeInstance"));
            }
            Logging logging = (Logging) (!(obj instanceof Logging) ? null : obj);
            if (logging != null) {
                return logging;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
            stringBuilder.append(obj);
            stringBuilder.append(" to Logging");
            throw new AttributeError(stringBuilder.toString());
        }

        public final Map<String, Object> toJavaScript(Logging logging) {
            akcr.b(logging, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("logBlizzardEvent", new ComposerRunnableAction(new a(logging)));
            linkedHashMap.put("$nativeInstance", JSConversions.INSTANCE.wrapNativeInstance(logging));
            return linkedHashMap;
        }
    }

    public static final class DefaultImpls {
        public static Object toJavaScript(Logging logging) {
            return Logging.Companion.toJavaScript(logging);
        }
    }

    void logBlizzardEvent(Event event);

    Object toJavaScript();
}
