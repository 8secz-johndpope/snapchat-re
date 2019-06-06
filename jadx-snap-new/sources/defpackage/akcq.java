package defpackage;

/* renamed from: akcq */
public class akcq extends akck implements akcp, akek {
    private final int arity;

    public akcq(int i) {
        this.arity = i;
    }

    public akcq(int i, Object obj) {
        super(obj);
        this.arity = i;
    }

    /* Access modifiers changed, original: protected */
    public akeh computeReflected() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akcq)) {
            return obj instanceof akek ? obj.equals(compute()) : false;
        } else {
            akcq akcq = (akcq) obj;
            if (getOwner() != null ? !getOwner().equals(akcq.getOwner()) : akcq.getOwner() != null) {
                return getName().equals(akcq.getName()) && getSignature().equals(akcq.getSignature()) && akcr.a(getBoundReceiver(), akcq.getBoundReceiver());
            }
        }
    }

    public int getArity() {
        return this.arity;
    }

    /* Access modifiers changed, original: protected */
    public akek getReflected() {
        return (akek) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        akcq compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder stringBuilder = new StringBuilder("function ");
        stringBuilder.append(getName());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}
