SUMMARY = "pat Winlink client"
DESCRIPTION = "Pat is a cross platform Winlink client with basic messaging capabilities."
HOMEPAGE = "https://getpat.io/"
GO_IMPORT = "github.com/la5nta/pat"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c68285de5604d4299551faf5e66ee5c8"

DEPENDS = "libax25"

SRC_URI = "git://github.com/la5nta/pat;protocol=https;branch=master"
SRCREV = "ae8ce001d3cd1e15a662647a45ababf88d72bb61"

GO_INSTALL = "${GO_IMPORT}"
do_compile[network] = "1"

GO_LINKSHARED = ""
GOBUILDFLAGS:remove = "-buildmode=pie"

inherit go-mod

FILES:${PN} += "/usr/local/bin"
RDEPENDS:${PN} += "libax25"

do_configure:prepend() {
    rm -r ${S}/src/${GO_IMPORT}/debian
}
