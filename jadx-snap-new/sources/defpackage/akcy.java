package defpackage;

/* renamed from: akcy */
public abstract class akcy extends akck implements aken {
    public akcy(Object obj) {
        super(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final aken b() {
        return (aken) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akcy)) {
            return obj instanceof aken ? obj.equals(compute()) : false;
        } else {
            akcy akcy = (akcy) obj;
            return getOwner().equals(akcy.getOwner()) && getName().equals(akcy.getName()) && getSignature().equals(akcy.getSignature()) && akcr.a(getBoundReceiver(), akcy.getBoundReceiver());
        }
    }

    /* Access modifiers changed, original: protected|bridge|synthetic */
    public /* bridge */ /* synthetic */ akeh getReflected() {
        return (aken) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        akcy compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder stringBuilder = new StringBuilder("property ");
        stringBuilder.append(getName());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}
