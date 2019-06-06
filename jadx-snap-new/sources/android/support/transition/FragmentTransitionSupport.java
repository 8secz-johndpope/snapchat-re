package android.support.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.eo;
import defpackage.eo.b;
import defpackage.eo.c;
import defpackage.eq;
import defpackage.er;
import defpackage.gj;
import java.util.ArrayList;
import java.util.List;

public class FragmentTransitionSupport extends gj {
    private static boolean a(eo eoVar) {
        return (gj.a((List) eoVar.d) && gj.a(null) && gj.a(null)) ? false : true;
    }

    public final Object a(Object obj, Object obj2, Object obj3) {
        er erVar = new er();
        if (obj != null) {
            erVar.a((eo) obj);
        }
        if (obj2 != null) {
            erVar.a((eo) obj2);
        }
        if (obj3 != null) {
            erVar.a((eo) obj3);
        }
        return erVar;
    }

    public final void a(ViewGroup viewGroup, Object obj) {
        eq.a(viewGroup, (eo) obj);
    }

    public final void a(Object obj, final Rect rect) {
        if (obj != null) {
            ((eo) obj).a(new b() {
            });
        }
    }

    public final void a(Object obj, View view) {
        if (view != null) {
            eo eoVar = (eo) obj;
            final Rect rect = new Rect();
            gj.a(view, rect);
            eoVar.a(new b() {
            });
        }
    }

    public final void a(Object obj, View view, ArrayList<View> arrayList) {
        obj = (er) obj;
        ArrayList arrayList2 = obj.e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gj.a((List) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a(obj, (ArrayList) arrayList);
    }

    public final void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((eo) obj).a(new c() {
            public final void a() {
            }

            public final void a(eo eoVar) {
            }

            public final void b() {
            }

            public final void c() {
                Object obj = obj5;
                if (obj != null) {
                    FragmentTransitionSupport.this.b(obj, arrayList4, null);
                }
                obj = obj6;
                if (obj != null) {
                    FragmentTransitionSupport.this.b(obj, arrayList5, null);
                }
                obj = obj7;
                if (obj != null) {
                    FragmentTransitionSupport.this.b(obj, arrayList6, null);
                }
            }
        });
    }

    public final void a(Object obj, ArrayList<View> arrayList) {
        eo eoVar = (eo) obj;
        if (eoVar != null) {
            int i = 0;
            int size;
            if (eoVar instanceof er) {
                er erVar = (er) eoVar;
                size = erVar.a.size();
                while (i < size) {
                    a(erVar.a(i), (ArrayList) arrayList);
                    i++;
                }
                return;
            }
            if (!a(eoVar) && gj.a((List) eoVar.e)) {
                size = arrayList.size();
                while (i < size) {
                    eoVar.c((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public final void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        obj = (er) obj;
        if (obj != null) {
            obj.e.clear();
            obj.e.addAll(arrayList2);
            b(obj, (ArrayList) arrayList, (ArrayList) arrayList2);
        }
    }

    public final boolean a(Object obj) {
        return obj instanceof eo;
    }

    public final Object b(Object obj) {
        return obj != null ? ((eo) obj).clone() : null;
    }

    public final Object b(Object obj, Object obj2, Object obj3) {
        eo eoVar = (eo) obj;
        eo eoVar2 = (eo) obj2;
        eo eoVar3 = (eo) obj3;
        if (eoVar != null && eoVar2 != null) {
            eoVar = new er().a(eoVar).a(eoVar2);
            eoVar.i = false;
        } else if (eoVar == null) {
            eoVar = eoVar2 != null ? eoVar2 : null;
        }
        if (eoVar3 == null) {
            return eoVar;
        }
        er erVar = new er();
        if (eoVar != null) {
            erVar.a(eoVar);
        }
        erVar.a(eoVar3);
        return erVar;
    }

    public final void b(Object obj, View view) {
        if (obj != null) {
            ((eo) obj).c(view);
        }
    }

    public final void b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((eo) obj).a(new c() {
            public final void a() {
            }

            public final void a(eo eoVar) {
                eoVar.b((c) this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            public final void b() {
            }

            public final void c() {
            }
        });
    }

    public final void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        eo eoVar = (eo) obj;
        int i = 0;
        int size;
        if (eoVar instanceof er) {
            er erVar = (er) eoVar;
            size = erVar.a.size();
            while (i < size) {
                b(erVar.a(i), (ArrayList) arrayList, (ArrayList) arrayList2);
                i++;
            }
            return;
        }
        if (!a(eoVar)) {
            ArrayList arrayList3 = eoVar.e;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    eoVar.c((View) arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    eoVar.d((View) arrayList.get(size2));
                }
            }
        }
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        er erVar = new er();
        erVar.a((eo) obj);
        return erVar;
    }

    public final void c(Object obj, View view) {
        if (obj != null) {
            ((eo) obj).d(view);
        }
    }
}
