DESCRIPTION = "Distributable SWUpdate Winlink image"
SECTION = ""

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://sw-description \
    file://emmcsetup.lua \
"

IMAGE_INSTALL:append = " \
    swupdate \
"

IMAGE_DEPENDS = "winlink-image-base virtual/kernel"

SWUPDATE_IMAGES = "winlink-image-base zImage"
SWUPDATE_IMAGES_FSTYPES[winlink-image-base] = ".tar.gz"
SWUPDATE_IMAGES_FSTYPES[zImage] = ""

inherit swupdate
