package com.snap.composer.stories;

import com.snap.composer.actions.ComposerAction;
import com.snap.composer.actions.ComposerRunnableAction;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.akcs;
import java.util.LinkedHashMap;
import java.util.Map;

public interface StorySummaryInfoStoring extends ComposerJsConvertible {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        static final class a extends akcs implements akbl<Object[], ajxw> {
            private /* synthetic */ StorySummaryInfoStoring a;

            static final class a extends akcs implements akbw<Map<String, ? extends Object>, Map<String, ? extends Object>, ajxw> {
                private /* synthetic */ ComposerAction a;

                a(ComposerAction composerAction) {
                    this.a = composerAction;
                    super(2);
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    Map map = (Map) obj;
                    Map map2 = (Map) obj2;
                    Object[] objArr = new Object[2];
                    if (map == null) {
                        map = null;
                    }
                    objArr[0] = map;
                    if (map2 == null) {
                        map2 = null;
                    }
                    objArr[1] = map2;
                    this.a.perform(objArr);
                    return ajxw.a;
                }
            }

            a(StorySummaryInfoStoring storySummaryInfoStoring) {
                this.a = storySummaryInfoStoring;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "_params");
                Object parameterOrNull = JSConversions.INSTANCE.getParameterOrNull(objArr, 0);
                if (!(parameterOrNull instanceof ComposerAction)) {
                    parameterOrNull = null;
                }
                ComposerAction composerAction = (ComposerAction) parameterOrNull;
                if (composerAction != null) {
                    this.a.getStorySummaryInfos(new a(composerAction));
                    return ajxw.a;
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                stringBuilder.append(JSConversions.INSTANCE.getParameterOrNull(objArr, 0));
                stringBuilder.append(" to ComposerAction");
                throw new AttributeError(stringBuilder.toString());
            }
        }

        static final class b extends akcs implements akbl<Object[], ComposerRunnableAction> {
            private /* synthetic */ StorySummaryInfoStoring a;

            static final class a extends akcs implements akbk<ajxw> {
                private /* synthetic */ ComposerAction a;

                a(ComposerAction composerAction) {
                    this.a = composerAction;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    this.a.perform(new Object[0]);
                    return ajxw.a;
                }
            }

            b(StorySummaryInfoStoring storySummaryInfoStoring) {
                this.a = storySummaryInfoStoring;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "_params");
                Object parameterOrNull = JSConversions.INSTANCE.getParameterOrNull(objArr, 0);
                if (!(parameterOrNull instanceof ComposerAction)) {
                    parameterOrNull = null;
                }
                ComposerAction composerAction = (ComposerAction) parameterOrNull;
                if (composerAction != null) {
                    final akbk onStorySummaryInfosUpdated = this.a.onStorySummaryInfosUpdated(new a(composerAction));
                    return new ComposerRunnableAction(new akbl<Object[], ajxw>() {
                        public final /* synthetic */ Object invoke(Object obj) {
                            akcr.b((Object[]) obj, "_params");
                            onStorySummaryInfosUpdated.invoke();
                            return ajxw.a;
                        }
                    });
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                stringBuilder.append(JSConversions.INSTANCE.getParameterOrNull(objArr, 0));
                stringBuilder.append(" to ComposerAction");
                throw new AttributeError(stringBuilder.toString());
            }
        }

        private Companion() {
        }

        public final StorySummaryInfoStoring fromJavaScript(Object obj) {
            if (obj instanceof Map) {
                obj = JSConversions.INSTANCE.unwrapNativeInstance(((Map) obj).get("$nativeInstance"));
            }
            StorySummaryInfoStoring storySummaryInfoStoring = (StorySummaryInfoStoring) (!(obj instanceof StorySummaryInfoStoring) ? null : obj);
            if (storySummaryInfoStoring != null) {
                return storySummaryInfoStoring;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
            stringBuilder.append(obj);
            stringBuilder.append(" to StorySummaryInfoStoring");
            throw new AttributeError(stringBuilder.toString());
        }

        public final Map<String, Object> toJavaScript(StorySummaryInfoStoring storySummaryInfoStoring) {
            akcr.b(storySummaryInfoStoring, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("getStorySummaryInfos", new ComposerRunnableAction(new a(storySummaryInfoStoring)));
            linkedHashMap.put("onStorySummaryInfosUpdated", new ComposerRunnableAction(new b(storySummaryInfoStoring)));
            linkedHashMap.put("$nativeInstance", JSConversions.INSTANCE.wrapNativeInstance(storySummaryInfoStoring));
            return linkedHashMap;
        }
    }

    public static final class DefaultImpls {
        public static Object toJavaScript(StorySummaryInfoStoring storySummaryInfoStoring) {
            return StorySummaryInfoStoring.Companion.toJavaScript(storySummaryInfoStoring);
        }
    }

    void getStorySummaryInfos(akbw<? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, ajxw> akbw);

    akbk<ajxw> onStorySummaryInfosUpdated(akbk<ajxw> akbk);

    Object toJavaScript();
}
