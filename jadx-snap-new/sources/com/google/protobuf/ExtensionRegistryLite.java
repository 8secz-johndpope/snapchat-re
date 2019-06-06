package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite.GeneratedExtension;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite {
    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static volatile boolean eagerlyParseMessageSets;
    private static final Class<?> extensionClass = resolveExtensionClass();
    private final Map<ObjectIntPair, GeneratedExtension<?, ?>> extensionsByNumber;

    static final class ObjectIntPair {
        private final int number;
        private final Object object;

        ObjectIntPair(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.object == objectIntPair.object && this.number == objectIntPair.number;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }
    }

    ExtensionRegistryLite() {
        this.extensionsByNumber = new HashMap();
    }

    ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        this.extensionsByNumber = extensionRegistryLite == EMPTY_REGISTRY_LITE ? Collections.emptyMap() : Collections.unmodifiableMap(extensionRegistryLite.extensionsByNumber);
    }

    ExtensionRegistryLite(boolean z) {
        this.extensionsByNumber = Collections.emptyMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        return ExtensionRegistryFactory.createEmpty();
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static ExtensionRegistryLite newInstance() {
        return ExtensionRegistryFactory.create();
    }

    static Class<?> resolveExtensionClass() {
        try {
            return Class.forName(EXTENSION_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        eagerlyParseMessageSets = z;
    }

    public final void add(ExtensionLite<?, ?> extensionLite) {
        if (GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((GeneratedExtension) extensionLite);
        }
        if (ExtensionRegistryFactory.isFullRegistry(this)) {
            try {
                getClass().getMethod("add", new Class[]{extensionClass}).invoke(this, new Object[]{extensionLite});
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", new Object[]{extensionLite}), e);
            }
        }
    }

    public final void add(GeneratedExtension<?, ?> generatedExtension) {
        this.extensionsByNumber.put(new ObjectIntPair(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingType, int i) {
        return (GeneratedExtension) this.extensionsByNumber.get(new ObjectIntPair(containingType, i));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }
}
