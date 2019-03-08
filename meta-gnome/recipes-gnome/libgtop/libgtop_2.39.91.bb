SUMMARY = "LibGTop2"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

inherit gnomebase lib_package gtk-doc distro_features_check gobject-introspection gettext

# depends on libxau
REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI[archive.md5sum] = "b50a24e8c70af532c5616f42f4ec71b7"
SRC_URI[archive.sha256sum] = "3428e3901c80a572d7f7bdf29cc0ecb733cc314038ba3d45093a84f314271f0f"

DEPENDS = "glib-2.0 libxau"

EXTRA_OEMAKE += "LIBGTOP_LIBS="
