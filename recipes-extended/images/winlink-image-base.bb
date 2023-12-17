SUMMARY = "A small CLI only image for lightweight headless devices"

LICENSE = "MIT"

IMAGE_FEATURES:append = " ssh-server-dropbear package-management"
IMAGE_INSTALL:append = " \
    packagegroup-meta-winlink \
    packagegroup-core-boot \ 
    packagegroup-core-full-cmdline \
    libconfig \
    e2fsprogs-resize2fs \
    util-linux-sfdisk \
    mtd-utils \
    mtd-utils-ubifs \
    parted \
    libubootenv-bin \
    u-boot-env \
    swupdate \
    swupdate-www \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_ROOTFS_SIZE ?= "8192"

IMAGE_FSTYPES = "ext4 ext4.gz wic"

inherit core-image

