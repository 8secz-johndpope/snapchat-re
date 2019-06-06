package defpackage;

import java.util.Stack;

/* renamed from: tgh */
public final class tgh {
    public final Stack<String> a = new Stack();

    public final void a() {
        if (((String) this.a.peek()) != null) {
            this.a.pop();
            return;
        }
        throw new IllegalStateException("Page Stack should never be null when accessed");
    }

    public final void a(String str) {
        this.a.push(str);
    }

    public final String b() {
        return (String) this.a.peek();
    }
}
