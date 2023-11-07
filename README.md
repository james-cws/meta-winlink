# meta-winlink
Yocto layer to provide winlink clients for embedded Linux targets.

This layer does not provide any machine specific support.


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
