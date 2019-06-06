package com.snap.composer.people;

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
import java.util.List;
import java.util.Map;

public interface GroupStoring extends ComposerJsConvertible {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        static final class a extends akcs implements akbl<Object[], ajxw> {
            private /* synthetic */ GroupStoring a;

            static final class a extends akcs implements akbw<List<? extends Group>, Map<String, ? extends Object>, ajxw> {
                private /* synthetic */ ComposerAction a;

                a(ComposerAction composerAction) {
                    this.a = composerAction;
                    super(2);
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    List list = (List) obj;
                    Map map = (Map) obj2;
                    akcr.b(list, "groups");
                    Object[] objArr = new Object[2];
                    int size = list.size();
                    Group[] groupArr = new Group[size];
                    for (int i = 0; i < size; i++) {
                        groupArr[i] = (Group) list.get(i);
                    }
                    objArr[0] = groupArr;
                    if (map == null) {
                        map = null;
                    }
                    objArr[1] = map;
                    this.a.perform(objArr);
                    return ajxw.a;
                }
            }

            a(GroupStoring groupStoring) {
                this.a = groupStoring;
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
                    this.a.getGroups(new a(composerAction));
                    return ajxw.a;
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                stringBuilder.append(JSConversions.INSTANCE.getParameterOrNull(objArr, 0));
                stringBuilder.append(" to ComposerAction");
                throw new AttributeError(stringBuilder.toString());
            }
        }

        static final class b extends akcs implements akbl<Object[], ComposerRunnableAction> {
            private /* synthetic */ GroupStoring a;

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

            b(GroupStoring groupStoring) {
                this.a = groupStoring;
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
                    final akbk onGroupsUpdated = this.a.onGroupsUpdated(new a(composerAction));
                    return new ComposerRunnableAction(new akbl<Object[], ajxw>() {
                        public final /* synthetic */ Object invoke(Object obj) {
                            akcr.b((Object[]) obj, "_params");
                            onGroupsUpdated.invoke();
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

        public final GroupStoring fromJavaScript(Object obj) {
            if (obj instanceof Map) {
                obj = JSConversions.INSTANCE.unwrapNativeInstance(((Map) obj).get("$nativeInstance"));
            }
            GroupStoring groupStoring = (GroupStoring) (!(obj instanceof GroupStoring) ? null : obj);
            if (groupStoring != null) {
                return groupStoring;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
            stringBuilder.append(obj);
            stringBuilder.append(" to GroupStoring");
            throw new AttributeError(stringBuilder.toString());
        }

        public final Map<String, Object> toJavaScript(GroupStoring groupStoring) {
            akcr.b(groupStoring, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("getGroups", new ComposerRunnableAction(new a(groupStoring)));
            linkedHashMap.put("onGroupsUpdated", new ComposerRunnableAction(new b(groupStoring)));
            linkedHashMap.put("$nativeInstance", JSConversions.INSTANCE.wrapNativeInstance(groupStoring));
            return linkedHashMap;
        }
    }

    public static final class DefaultImpls {
        public static Object toJavaScript(GroupStoring groupStoring) {
            return GroupStoring.Companion.toJavaScript(groupStoring);
        }
    }

    void getGroups(akbw<? super List<Group>, ? super Map<String, ? extends Object>, ajxw> akbw);

    akbk<ajxw> onGroupsUpdated(akbk<ajxw> akbk);

    Object toJavaScript();
}
