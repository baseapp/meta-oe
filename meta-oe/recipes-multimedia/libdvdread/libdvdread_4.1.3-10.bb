DESCRIPTION = "DVD access multimeda library"
SECTION = "libs/multimedia"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
SRC_URI = "git://sources.progress-linux.org/git/users/daniel/packages/${PN}.git;protocol=git;branch=debian"

SRCREV = "71988ed90e47e5e0091895809975d3f01326cdca"
S = "${WORKDIR}/git"

inherit autotools lib_package binconfig pkgconfig

do_unpackpost() {
        QUILT_PATCHES=debian/patches quilt push -a
}

addtask unpackpost after do_unpack before do_patch
