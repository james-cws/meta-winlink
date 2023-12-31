#!/bin/sh

# Override these variables in sourced script(s) located
# in /usr/lib/swupdate/conf.d or /etc/swupdate/conf.d
SWUPDATE_ARGS="-v ${SWUPDATE_EXTRA_ARGS}"
SWUPDATE_WEBSERVER_ARGS=""

# source all files from /etc/swupdate/conf.d and /usr/lib/swupdate/conf.d/
# A file found in /etc replaces the same file in /usr
for f in `(test -d @LIBDIR@/swupdate/conf.d/ && ls -1 @LIBDIR@/swupdate/conf.d/; test -d /etc/swupdate/conf.d && ls -1 /etc/swupdate/conf.d) | sort -u`; do
  if [ -f /etc/swupdate/conf.d/$f ]; then
    . /etc/swupdate/conf.d/$f
  else
    . @LIBDIR@/swupdate/conf.d/$f
  fi
done

#  handle variable escaping in a simmple way. Use exec to forward open filedescriptors from systemd open.
if [ "$SWUPDATE_WEBSERVER_ARGS" != "" ]; then
  exec /usr/bin/swupdate $SWUPDATE_ARGS -w "$SWUPDATE_WEBSERVER_ARGS"
else
  exec /usr/bin/swupdate $SWUPDATE_ARGS
fi
