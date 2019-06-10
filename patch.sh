#!/bin/sh

# Script to patch away the screenshot detection in a Snapchat apk; it
# should work as long as Snapchat doesn't drastically change the
# detection mechanism

set -ue

if [ "$#" -ne 1 ]; then
    echo "Usage: $0: <file-to-patch.apk>"
    exit 1
fi

in_file="$1"

echo "[*] Using '$in_file' as apk to patch"

scratch_dir="$(mktemp -d -t snapchat-patch-XXXXXXXX)"

echo "[*] Using '$scratch_dir' as scratch directory"

echo "[*] decoding apk to scratch directory with apktool"

apktool decode "$in_file" --output "$scratch_dir" --force

detection_file="$(grep -RIl WhatsApp "$scratch_dir")"

echo "[*] Patching file '$detection_file'"

patched_src="$(awk '
    BEGIN {
       out = 1
    }
    /apply/ {
       out = 0
       print
       print "    .locals 0"
       print ""
       print "    const/4 v0, 0x0"
       print ""
       print "    return-object v0"
    }
    /end method/ {
	 out = 1
    }
    {
	if (out) {
	    print
	}
    }
' "$detection_file")"

printf '%s' "$patched_src" > "$detection_file"

echo "[*] Rebuilding apk"

apktool build "$scratch_dir" --output snapchat-patched.apk

echo "[*] Removing scratch directory"

rm -rf "$scratch_dir"
