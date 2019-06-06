package defpackage;

import defpackage.fv.c;
import defpackage.ga.g;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: fs */
final class fs extends gg implements g {
    final ga a;
    ArrayList<a> b = new ArrayList();
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    String j;
    int k = -1;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList<String> p;
    ArrayList<String> q;
    boolean r = false;
    private boolean s = true;
    private boolean t;

    /* renamed from: fs$a */
    static final class a {
        int a;
        fv b;
        int c;
        int d;
        int e;
        int f;

        a() {
        }

        a(int i, fv fvVar) {
            this.a = i;
            this.b = fvVar;
        }
    }

    public fs(ga gaVar) {
        this.a = gaVar;
    }

    private void a(int i, fv fvVar, String str, int i2) {
        Class cls = fvVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder stringBuilder = new StringBuilder("Fragment ");
            stringBuilder.append(cls.getCanonicalName());
            stringBuilder.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2;
        fvVar.mFragmentManager = this.a;
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            if (fvVar.mTag == null || str.equals(fvVar.mTag)) {
                fvVar.mTag = str;
            } else {
                stringBuilder2 = new StringBuilder("Can't change tag of fragment ");
                stringBuilder2.append(fvVar);
                stringBuilder2.append(str3);
                stringBuilder2.append(fvVar.mTag);
                stringBuilder2.append(str2);
                stringBuilder2.append(str);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        if (i != 0) {
            if (i == -1) {
                stringBuilder2 = new StringBuilder("Can't add fragment ");
                stringBuilder2.append(fvVar);
                stringBuilder2.append(" with tag ");
                stringBuilder2.append(str);
                stringBuilder2.append(" to container view with no id");
                throw new IllegalArgumentException(stringBuilder2.toString());
            } else if (fvVar.mFragmentId == 0 || fvVar.mFragmentId == i) {
                fvVar.mFragmentId = i;
                fvVar.mContainerId = i;
            } else {
                stringBuilder2 = new StringBuilder("Can't change container ID of fragment ");
                stringBuilder2.append(fvVar);
                stringBuilder2.append(str3);
                stringBuilder2.append(fvVar.mFragmentId);
                stringBuilder2.append(str2);
                stringBuilder2.append(i);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        a(new a(i2, fvVar));
    }

    private int b(boolean z) {
        if (this.t) {
            throw new IllegalStateException("commit already called");
        }
        this.t = true;
        this.k = this.i ? this.a.a(this) : -1;
        this.a.a((g) this, z);
        return this.k;
    }

    static boolean b(a aVar) {
        fv fvVar = aVar.b;
        return (fvVar == null || !fvVar.mAdded || fvVar.mView == null || fvVar.mDetached || fvVar.mHidden || !fvVar.isPostponed()) ? false : true;
    }

    private gg g() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.s = false;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final fv a(ArrayList<fv> arrayList, fv fvVar) {
        ArrayList<fv> arrayList2 = arrayList;
        fv fvVar2 = fvVar;
        int i = 0;
        while (i < this.b.size()) {
            a aVar = (a) this.b.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    fv fvVar3 = aVar.b;
                    int i3 = fvVar3.mContainerId;
                    fv fvVar4 = fvVar2;
                    int i4 = i;
                    Object obj = null;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        fv fvVar5 = (fv) arrayList2.get(size);
                        if (fvVar5.mContainerId == i3) {
                            if (fvVar5 == fvVar3) {
                                obj = 1;
                            } else {
                                if (fvVar5 == fvVar4) {
                                    this.b.add(i4, new a(9, fvVar5));
                                    i4++;
                                    fvVar4 = null;
                                }
                                a aVar2 = new a(3, fvVar5);
                                aVar2.c = aVar.c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.b.add(i4, aVar2);
                                arrayList2.remove(fvVar5);
                                i4++;
                            }
                        }
                    }
                    if (obj != null) {
                        this.b.remove(i4);
                        i = i4 - 1;
                    } else {
                        aVar.a = 1;
                        arrayList2.add(fvVar3);
                        i = i4;
                    }
                    fvVar2 = fvVar4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.b);
                    if (aVar.b == fvVar2) {
                        this.b.add(i, new a(9, aVar.b));
                        i++;
                        fvVar2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.b.add(i, new a(9, fvVar2));
                        i++;
                        fvVar2 = aVar.b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.b);
            i++;
        }
        return fvVar2;
    }

    public final gg a() {
        if (this.s) {
            this.i = true;
            this.j = null;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final gg a(int i, fv fvVar) {
        a(i, fvVar, null, 1);
        return this;
    }

    public final gg a(int i, fv fvVar, String str) {
        a(i, fvVar, str, 1);
        return this;
    }

    public final gg a(fv fvVar) {
        a(new a(3, fvVar));
        return this;
    }

    public final gg a(fv fvVar, String str) {
        a(0, fvVar, str, 1);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (this.i) {
            int size = this.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.b.get(i2);
                if (aVar.b != null) {
                    fv fvVar = aVar.b;
                    fvVar.mBackStackNesting += i;
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        this.b.add(aVar);
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
    }

    /* Access modifiers changed, original: final */
    public final void a(c cVar) {
        for (int i = 0; i < this.b.size(); i++) {
            a aVar = (a) this.b.get(i);
            if (fs.b(aVar)) {
                aVar.b.setOnStartEnterTransitionListener(cVar);
            }
        }
    }

    public final void a(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mName=");
        printWriter.print(this.j);
        printWriter.print(" mIndex=");
        printWriter.print(this.k);
        printWriter.print(" mCommitted=");
        printWriter.println(this.t);
        if (this.g != 0) {
            printWriter.print(str);
            printWriter.print("mTransition=#");
            printWriter.print(Integer.toHexString(this.g));
            printWriter.print(" mTransitionStyle=#");
            printWriter.println(Integer.toHexString(this.h));
        }
        if (!(this.c == 0 && this.d == 0)) {
            printWriter.print(str);
            printWriter.print("mEnterAnim=#");
            printWriter.print(Integer.toHexString(this.c));
            printWriter.print(" mExitAnim=#");
            printWriter.println(Integer.toHexString(this.d));
        }
        if (!(this.e == 0 && this.f == 0)) {
            printWriter.print(str);
            printWriter.print("mPopEnterAnim=#");
            printWriter.print(Integer.toHexString(this.e));
            printWriter.print(" mPopExitAnim=#");
            printWriter.println(Integer.toHexString(this.f));
        }
        if (!(this.l == 0 && this.m == null)) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbTitleRes=#");
            printWriter.print(Integer.toHexString(this.l));
            printWriter.print(" mBreadCrumbTitleText=");
            printWriter.println(this.m);
        }
        if (!(this.n == 0 && this.o == null)) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbShortTitleRes=#");
            printWriter.print(Integer.toHexString(this.n));
            printWriter.print(" mBreadCrumbShortTitleText=");
            printWriter.println(this.o);
        }
        if (!this.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("    ");
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                String str2;
                a aVar = (a) this.b.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder stringBuilder2 = new StringBuilder("cmd=");
                        stringBuilder2.append(aVar.a);
                        str2 = stringBuilder2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (!(aVar.c == 0 && aVar.d == 0)) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.b.get(size);
            fv fvVar = aVar.b;
            if (fvVar != null) {
                int i = this.g;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                fvVar.setNextTransition(i2, this.h);
            }
            switch (aVar.a) {
                case 1:
                    fvVar.setNextAnim(aVar.f);
                    this.a.e(fvVar);
                    break;
                case 3:
                    fvVar.setNextAnim(aVar.e);
                    this.a.a(fvVar, false);
                    break;
                case 4:
                    fvVar.setNextAnim(aVar.e);
                    ga.g(fvVar);
                    break;
                case 5:
                    fvVar.setNextAnim(aVar.f);
                    ga.f(fvVar);
                    break;
                case 6:
                    fvVar.setNextAnim(aVar.e);
                    this.a.i(fvVar);
                    break;
                case 7:
                    fvVar.setNextAnim(aVar.f);
                    this.a.h(fvVar);
                    break;
                case 8:
                    this.a.j(null);
                    break;
                case 9:
                    this.a.j(fvVar);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unknown cmd: ");
                    stringBuilder.append(aVar.a);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (!(this.r || aVar.a == 3 || fvVar == null)) {
                this.a.c(fvVar);
            }
        }
        if (!this.r && z) {
            ga gaVar = this.a;
            gaVar.a(gaVar.d, true);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(ArrayList<fs> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) this.b.get(i4);
            int i5 = aVar.b != null ? aVar.b.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (i3 = i; i3 < i2; i3++) {
                    fs fsVar = (fs) arrayList.get(i3);
                    int size2 = fsVar.b.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        a aVar2 = (a) fsVar.b.get(i6);
                        if ((aVar2.b != null ? aVar2.b.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public final boolean a(ArrayList<fs> arrayList, ArrayList<Boolean> arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.i) {
            ga gaVar = this.a;
            if (gaVar.c == null) {
                gaVar.c = new ArrayList();
            }
            gaVar.c.add(this);
        }
        return true;
    }

    public final int b() {
        return b(false);
    }

    /* Access modifiers changed, original: final */
    public final fv b(ArrayList<fv> arrayList, fv fvVar) {
        for (int i = 0; i < this.b.size(); i++) {
            a aVar = (a) this.b.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fvVar = null;
                            break;
                        case 9:
                            fvVar = aVar.b;
                            break;
                        default:
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fvVar;
    }

    public final gg b(int i, fv fvVar) {
        if (i != 0) {
            a(i, fvVar, null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final gg b(fv fvVar) {
        a(new a(4, fvVar));
        return this;
    }

    /* Access modifiers changed, original: final */
    public final boolean b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) this.b.get(i2);
            int i3 = aVar.b != null ? aVar.b.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public final int c() {
        return b(true);
    }

    public final gg c(fv fvVar) {
        a(new a(5, fvVar));
        return this;
    }

    public final gg d(fv fvVar) {
        a(new a(6, fvVar));
        return this;
    }

    public final void d() {
        g();
        this.a.b((g) this, false);
    }

    public final gg e(fv fvVar) {
        a(new a(7, fvVar));
        return this;
    }

    public final void e() {
        g();
        this.a.b((g) this, true);
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.b.get(i);
            fv fvVar = aVar.b;
            if (fvVar != null) {
                fvVar.setNextTransition(this.g, this.h);
            }
            switch (aVar.a) {
                case 1:
                    fvVar.setNextAnim(aVar.c);
                    this.a.a(fvVar, false);
                    break;
                case 3:
                    fvVar.setNextAnim(aVar.d);
                    this.a.e(fvVar);
                    break;
                case 4:
                    fvVar.setNextAnim(aVar.d);
                    ga.f(fvVar);
                    break;
                case 5:
                    fvVar.setNextAnim(aVar.c);
                    ga.g(fvVar);
                    break;
                case 6:
                    fvVar.setNextAnim(aVar.d);
                    this.a.h(fvVar);
                    break;
                case 7:
                    fvVar.setNextAnim(aVar.c);
                    this.a.i(fvVar);
                    break;
                case 8:
                    this.a.j(fvVar);
                    break;
                case 9:
                    this.a.j(null);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unknown cmd: ");
                    stringBuilder.append(aVar.a);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (!(this.r || aVar.a == 1 || fvVar == null)) {
                this.a.c(fvVar);
            }
        }
        if (!this.r) {
            ga gaVar = this.a;
            gaVar.a(gaVar.d, true);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.k >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.k);
        }
        if (this.j != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.j);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
