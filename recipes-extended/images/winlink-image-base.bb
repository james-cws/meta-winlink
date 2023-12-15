SUMMARY = "A small CLI only image for lightweight headless devices"

LICENSE = "MIT"

IMAGE_FEATURES:append = " ssh-server-dropbear package-management"
IMAGE_INSTALL = " \
    packagegroup-core-boot \ 
    packagegroup-core-full-cmdline \
    e2fsprogs-resize2fs \
    libubootenv \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_ROOTFS_SIZE ?= "8192"

inherit core-image

