SUMMARY = "A small CLI only image for lightweight headless devices"

IMAGE_INSTALL = "packagegroup-core-boot"

LICENSE = "MIT"

inherit core-image

IAMGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"
