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
out_file=snapchat-patched.apk

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
       sget_count = 0
    }
    /apply/ {
       out = 0
       print
       print "    .locals 0"
       print ""
    }
    /sget-object/ {
	 sget_count += 1
	 if (sget_count == 2) {
	    out = 1
	 }
    }
    {
	if (out) {
	    print
	}
    }
' "$detection_file")"

printf '%s' "$patched_src" > "$detection_file"

echo "[*] Rebuilding apk"

apktool build "$scratch_dir" --output "$out_file"

echo "[*] Removing scratch directory"

rm -rf "$scratch_dir"

echo "[*] Signing apk"

jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore \
	  my-release-key.keystore "$out_file" alias_name
