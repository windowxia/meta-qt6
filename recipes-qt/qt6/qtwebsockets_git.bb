LICENSE = "GFDL-1.3 & (GPL-3 | LGPL-3.0) | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSE.GPL3-EXCEPT;md5=763d8c535a234d9a3fb682c7ecb6c073 \
    file://LICENSE.LGPL3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit qt6-cmake

include recipes-qt/qt6/qt6-git.inc
include recipes-qt/qt6/qt6.inc

PACKAGECONFIG ?= "translations"
PACKAGECONFIG[translations] = ",,,qttranslations-${BPN}"

DEPENDS += "qtbase qtdeclarative"

SRCREV = "d6790a4330256fbef578274fe3e5b0547b55c9d0"
