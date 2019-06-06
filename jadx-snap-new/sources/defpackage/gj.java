package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: gj */
public abstract class gj {

    /* renamed from: gj$2 */
    class 2 implements Runnable {
        private /* synthetic */ ArrayList a;
        private /* synthetic */ Map b;

        2(ArrayList arrayList, Map map) {
            this.a = arrayList;
            this.b = map;
        }

        public final void run() {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.a.get(i);
                String s = kb.a.s(view);
                if (s != null) {
                    for (Entry entry : this.b.entrySet()) {
                        if (s.equals(entry.getValue())) {
                            s = (String) entry.getKey();
                            break;
                        }
                    }
                    s = null;
                    kb.a(view, s);
                }
            }
        }
    }

    /* renamed from: gj$3 */
    class 3 implements Runnable {
        private /* synthetic */ ArrayList a;
        private /* synthetic */ Map b;

        3(ArrayList arrayList, Map map) {
            this.a = arrayList;
            this.b = map;
        }

        public final void run() {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.a.get(i);
                kb.a(view, (String) this.b.get(kb.a.s(view)));
            }
        }
    }

    static ArrayList<String> a(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(kb.a.s(view));
            kb.a(view, null);
        }
        return arrayList2;
    }

    protected static void a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    protected static void a(List<View> list, View view) {
        int size = list.size();
        if (!gj.a((List) list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!gj.a((List) list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    private static boolean a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract Object a(Object obj, Object obj2, Object obj3);

    /* Access modifiers changed, original: final */
    public final void a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String s = kb.a.s(view2);
            arrayList4.add(s);
            if (s != null) {
                kb.a(view2, null);
                String str = (String) map.get(s);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        kb.a((View) arrayList2.get(i2), s);
                        break;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        gs.a(view, new Runnable() {
            public final void run() {
                for (int i = 0; i < size; i++) {
                    kb.a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    kb.a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }

    public abstract void a(ViewGroup viewGroup, Object obj);

    public abstract void a(Object obj, Rect rect);

    public abstract void a(Object obj, View view);

    public abstract void a(Object obj, View view, ArrayList<View> arrayList);

    public abstract void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public abstract void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* Access modifiers changed, original: final */
    public final void a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (kd.a.a(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a((ArrayList) arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String s = kb.a.s(view);
            if (s != null) {
                map.put(s, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a((Map) map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object b(Object obj, Object obj2, Object obj3);

    public abstract void b(Object obj, View view);

    public abstract void b(Object obj, View view, ArrayList<View> arrayList);

    public abstract void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object c(Object obj);

    public abstract void c(Object obj, View view);
}
