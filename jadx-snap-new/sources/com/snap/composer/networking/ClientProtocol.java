package com.snap.composer.networking;

import com.snap.composer.actions.ComposerAction;
import com.snap.composer.actions.ComposerRunnableAction;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.foundation.Cancelable;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.akcs;
import java.util.LinkedHashMap;
import java.util.Map;

public interface ClientProtocol extends ComposerJsConvertible {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        static final class a extends akcs implements akbl<Object[], Cancelable> {
            private /* synthetic */ ClientProtocol a;

            static final class a extends akcs implements akbw<Response, Map<String, ? extends Object>, ajxw> {
                private /* synthetic */ ComposerAction a;

                a(ComposerAction composerAction) {
                    this.a = composerAction;
                    super(2);
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    Response response = (Response) obj;
                    Map map = (Map) obj2;
                    Object[] objArr = new Object[2];
                    if (response == null) {
                        response = null;
                    }
                    objArr[0] = response;
                    if (map == null) {
                        map = null;
                    }
                    objArr[1] = map;
                    this.a.perform(objArr);
                    return ajxw.a;
                }
            }

            a(ClientProtocol clientProtocol) {
                this.a = clientProtocol;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "_params");
                Request fromJavaScript = Request.Companion.fromJavaScript(JSConversions.INSTANCE.getParameterOrNull(objArr, 0));
                Object parameterOrNull = JSConversions.INSTANCE.getParameterOrNull(objArr, 1);
                if (!(parameterOrNull instanceof ComposerAction)) {
                    parameterOrNull = null;
                }
                ComposerAction composerAction = (ComposerAction) parameterOrNull;
                if (composerAction != null) {
                    return this.a.makeRequest(fromJavaScript, new a(composerAction));
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                stringBuilder.append(JSConversions.INSTANCE.getParameterOrNull(objArr, 1));
                stringBuilder.append(" to ComposerAction");
                throw new AttributeError(stringBuilder.toString());
            }
        }

        private Companion() {
        }

        public final ClientProtocol fromJavaScript(Object obj) {
            if (obj instanceof Map) {
                obj = JSConversions.INSTANCE.unwrapNativeInstance(((Map) obj).get("$nativeInstance"));
            }
            ClientProtocol clientProtocol = (ClientProtocol) (!(obj instanceof ClientProtocol) ? null : obj);
            if (clientProtocol != null) {
                return clientProtocol;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
            stringBuilder.append(obj);
            stringBuilder.append(" to ClientProtocol");
            throw new AttributeError(stringBuilder.toString());
        }

        public final Map<String, Object> toJavaScript(ClientProtocol clientProtocol) {
            akcr.b(clientProtocol, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("makeRequest", new ComposerRunnableAction(new a(clientProtocol)));
            linkedHashMap.put("$nativeInstance", JSConversions.INSTANCE.wrapNativeInstance(clientProtocol));
            return linkedHashMap;
        }
    }

    public static final class DefaultImpls {
        public static Object toJavaScript(ClientProtocol clientProtocol) {
            return ClientProtocol.Companion.toJavaScript(clientProtocol);
        }
    }

    Cancelable makeRequest(Request request, akbw<? super Response, ? super Map<String, ? extends Object>, ajxw> akbw);

    Object toJavaScript();
}
