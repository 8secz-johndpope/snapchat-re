package com.snap.composer.foundation;

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

public interface Cancelable extends ComposerJsConvertible {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        static final class a extends akcs implements akbl<Object[], ajxw> {
            private /* synthetic */ Cancelable a;

            a(Cancelable cancelable) {
                this.a = cancelable;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((Object[]) obj, "_params");
                this.a.cancel();
                return ajxw.a;
            }
        }

        private Companion() {
        }

        public final Cancelable fromJavaScript(Object obj) {
            if (obj instanceof Map) {
                obj = JSConversions.INSTANCE.unwrapNativeInstance(((Map) obj).get("$nativeInstance"));
            }
            Cancelable cancelable = (Cancelable) (!(obj instanceof Cancelable) ? null : obj);
            if (cancelable != null) {
                return cancelable;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
            stringBuilder.append(obj);
            stringBuilder.append(" to Cancelable");
            throw new AttributeError(stringBuilder.toString());
        }

        public final Map<String, Object> toJavaScript(Cancelable cancelable) {
            akcr.b(cancelable, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("cancel", new ComposerRunnableAction(new a(cancelable)));
            linkedHashMap.put("$nativeInstance", JSConversions.INSTANCE.wrapNativeInstance(cancelable));
            return linkedHashMap;
        }
    }

    public static final class DefaultImpls {
        public static Object toJavaScript(Cancelable cancelable) {
            return Cancelable.Companion.toJavaScript(cancelable);
        }
    }

    void cancel();

    Object toJavaScript();
}
