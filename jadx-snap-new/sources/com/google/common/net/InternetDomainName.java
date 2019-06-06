package com.google.common.net;

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import defpackage.cco;
import defpackage.ccp;
import java.util.List;

public final class InternetDomainName {
    private static final CharMatcher DASH_MATCHER = CharMatcher.anyOf("-_");
    private static final CharMatcher DOTS_MATCHER = CharMatcher.anyOf(".。．｡");
    private static final Joiner DOT_JOINER = Joiner.on('.');
    private static final Splitter DOT_SPLITTER = Splitter.on('.');
    private static final CharMatcher PART_CHAR_MATCHER = CharMatcher.javaLetterOrDigit().or(DASH_MATCHER);
    private final String name;
    private final ImmutableList<String> parts;
    private final int publicSuffixIndex;
    private final int registrySuffixIndex;

    InternetDomainName(String str) {
        Object toLowerCase = Ascii.toLowerCase(DOTS_MATCHER.replaceFrom(str, '.'));
        boolean z = true;
        if (toLowerCase.endsWith(".")) {
            toLowerCase = toLowerCase.substring(0, toLowerCase.length() - 1);
        }
        Preconditions.checkArgument(toLowerCase.length() <= 253, "Domain name too long: '%s':", toLowerCase);
        this.name = toLowerCase;
        this.parts = ImmutableList.copyOf(DOT_SPLITTER.split(toLowerCase));
        if (this.parts.size() > 127) {
            z = false;
        }
        Preconditions.checkArgument(z, "Domain has too many parts: '%s'", toLowerCase);
        Preconditions.checkArgument(validateSyntax(this.parts), "Not a valid domain name: '%s'", toLowerCase);
        this.publicSuffixIndex = findSuffixOfType(Optional.absent());
        this.registrySuffixIndex = findSuffixOfType(Optional.of(ccp.REGISTRY));
    }

    private InternetDomainName ancestor(int i) {
        Joiner joiner = DOT_JOINER;
        ImmutableList immutableList = this.parts;
        return from(joiner.join(immutableList.subList(i, immutableList.size())));
    }

    private int findSuffixOfType(Optional<ccp> optional) {
        int size = this.parts.size();
        for (int i = 0; i < size; i++) {
            String join = DOT_JOINER.join(this.parts.subList(i, size));
            if (matchesType(optional, Optional.fromNullable(cco.a.get(join)))) {
                return i;
            }
            if (cco.c.containsKey(join)) {
                return i + 1;
            }
            if (matchesWildcardSuffixType(optional, join)) {
                return i;
            }
        }
        return -1;
    }

    public static InternetDomainName from(String str) {
        return new InternetDomainName((String) Preconditions.checkNotNull(str));
    }

    private static boolean matchesType(Optional<ccp> optional, Optional<ccp> optional2) {
        return optional.isPresent() ? optional.equals(optional2) : optional2.isPresent();
    }

    private static boolean matchesWildcardSuffixType(Optional<ccp> optional, String str) {
        List splitToList = DOT_SPLITTER.limit(2).splitToList(str);
        return splitToList.size() == 2 && matchesType(optional, Optional.fromNullable(cco.b.get(splitToList.get(1))));
    }

    private static boolean validatePart(String str, boolean z) {
        if (str.length() > 0 && str.length() <= 63) {
            if (!(!PART_CHAR_MATCHER.matchesAllOf(CharMatcher.ascii().retainFrom(str)) || DASH_MATCHER.matches(str.charAt(0)) || DASH_MATCHER.matches(str.charAt(str.length() - 1)))) {
                return (z && CharMatcher.digit().matches(str.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    private static boolean validateSyntax(List<String> list) {
        int size = list.size() - 1;
        if (!validatePart((String) list.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!validatePart((String) list.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InternetDomainName)) {
            return false;
        }
        return this.name.equals(((InternetDomainName) obj).name);
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final boolean isTopPrivateDomain() {
        return this.publicSuffixIndex == 1;
    }

    public final boolean isUnderPublicSuffix() {
        return this.publicSuffixIndex > 0;
    }

    public final String toString() {
        return this.name;
    }

    public final InternetDomainName topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.name);
        return ancestor(this.publicSuffixIndex - 1);
    }
}
