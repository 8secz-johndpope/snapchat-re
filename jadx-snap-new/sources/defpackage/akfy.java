package defpackage;

/* renamed from: akfy */
public class akfy extends akfx {
    public static final <T> void a(Appendable appendable, T t, akbl<? super T, ? extends CharSequence> akbl) {
        akcr.b(appendable, "receiver$0");
        if (akbl != null) {
            appendable.append((CharSequence) akbl.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
