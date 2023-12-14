SUMMARY = "pat Winlink client"
DESCRIPTION = "Pat is a cross platform Winlink client with basic messaging capabilities."
HOMEPAGE = "https://getpat.io/"
GO_IMPORT = "github.com/la5nta/pat"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c68285de5604d4299551faf5e66ee5c8"

DEPENDS = "libax25"

SRC_URI = "git://github.com/la5nta/pat;protocol=https;branch=master"
SRCREV = "b9f4b0002b94402c759c8ab3243f256493bc99c5"

GO_INSTALL = "${GO_IMPORT}"
do_compile[network] = "1"

GOVERSION="1.19%"
GO_LINKSHARED = ""
GOBUILDFLAGS:remove = "-buildmode=pie"

inherit go-mod

FILES:${PN} += "/usr/local/bin ${systemd_user_unitdir}"
RDEPENDS:${PN} += "libax25"

do_configure:prepend() {
    mv ${S}/src/${GO_IMPORT}/debian/pat@.service ${S}/src/${GO_IMPORT}/
    rm -r ${S}/src/${GO_IMPORT}/debian
}

do_install:append() {
    install -d ${D}${systemd_user_unitdir}
    install -m 0644 ${S}/src/${GO_IMPORT}/pat@.service ${D}${systemd_user_unitdir}
}
