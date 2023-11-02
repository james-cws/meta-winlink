SUMMARY = "AX.25 library for hamradio applications"
DESCRIPTION = "Ham Radio - library for AX.25, ROSE, 6PACK, KISS and NETROM protocols."
HOMEPAGE = "https://linux-ax25.in-berlin.de/wiki/Main_Page"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=3f4e3b0d2d0cff4fafc1ac182f4f22dd"

DEPENDS = "glibc"
PROVIDES = "libax25"

SRC_URI = "git://linux-ax25.in-berlin.de/cgit/libax25.git;protocol=https;branch=master"
SRCREV = "1d4372367c56ae167e4c8c70f96cf0e9246d8a1a"

S = "${WORKDIR}/git"

inherit autotools
