SUMMARY = "Meta-winlink client app packagegroups"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \
    packagegroup-meta-winlink \
"

RDEPENDS:packagegroup-meta-winlink = " \
     ${@bb.utils.contains("WINLINK_CLIENT", "pat", "pat", "", d)} \
"
