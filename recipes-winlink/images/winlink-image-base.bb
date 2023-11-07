SUMMARY = "A small CLI only image for lightweight headless devices"

LICENSE = "MIT"

IMAGE_FEATURES:append = " ssh-server-dropbear"
IMAGE_INSTALL = " \
    packagegroup-core-boot \ 
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

inherit core-image

