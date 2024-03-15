package de.traderepublic.${PACKAGE_NAME}.di

#set ($name_prefix = ${StringUtils.removeAndHump(${MODULE_NAME}, "-")})

abstract class ${name_prefix}Scope private constructor()
