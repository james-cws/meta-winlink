SUMMARY = "A small CLI only image for lightweight headless devices"

LICENSE = "MIT"

IMAGE_FEATURES:append = " ssh-server-dropbear package-management"
IMAGE_INSTALL:append = " \
    packagegroup-meta-winlink \
    packagegroup-core-boot \ 
    packagegroup-core-full-cmdline \
    e2fsprogs-resize2fs \
    libubootenv \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_ROOTFS_SIZE ?= "8192"

IMAGE_FSTYPES = "jffs2 tar.gz"

inherit core-image

