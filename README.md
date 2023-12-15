# meta-winlink
Yocto layer to provide winlink clients for embedded Linux targets.

This layer does not provide any machine specific support.

Dependencies
============

This layer depends on:

* URI: git://git.yoctoproject.org/poky
  * branch: kirkstone
  * revision: HEAD

* URI: git://git.openembedded.org/openembedded-core
  * branch: kirkstone
  * revision: HEAD

* URI: git://git.yoctoproject.org/meta-arm
  * branch: kirkstone
  * revision: HEAD

* URI: git://github.com/sbabic/meta-swupdate.git
  * branch: kirkstone
  * revision: HEAD

For usage with Raspberry Pi boards an additional layer is required:

* URI: git://git.yoctoproject.org/meta-raspberrypi
  * branch: kirkstone
  * revision: HEAD

or

For usage with Beaglebone boards an additional layer is required:

* URI: git://git.yoctoproject.org/meta-ti
  * branch: kirkstone
  * revision: HEAD


Contributing
============

Please submit any patches against the winlink layer to the mailing list (meta-winlink@coastwide.systems)


Adding the winlink layer to your build
=================================================

Run `bitbake-layers add-layer winlink`

To use the reference winlink.conf distro, add `DISTRO = winlink` to your local.conf


Maintainer(s)
=============
* james-cws VA7ADG <james@coastwide.systems>
