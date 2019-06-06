package defpackage;

import java.io.Serializable;

/* renamed from: aklb */
public enum aklb implements Serializable {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM("System", akla.a() ^ 1);
    
    private static final long serialVersionUID = -6343169151696340687L;
    private final String name;
    private final transient boolean sensitive;

    private aklb(String str, boolean z) {
        this.name = str;
        this.sensitive = z;
    }

    public final boolean a(String str, String str2) {
        if (str != null && str2 != null) {
            return this.sensitive ? str.equals(str2) : str.equalsIgnoreCase(str2);
        } else {
            throw new NullPointerException("The strings must not be null");
        }
    }

    public final String toString() {
        return this.name;
    }
}
