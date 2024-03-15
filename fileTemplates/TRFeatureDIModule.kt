package de.traderepublic.${PACKAGE_NAME}.di

#set ($name_prefix = ${StringUtils.removeAndHump(${MODULE_NAME}, "-")})

import dagger.Module
import dagger.Provides
import de.traderepublic.${PACKAGE_NAME}.navigation.${name_prefix}Navigator
import de.traderepublic.${PACKAGE_NAME}.navigation.${name_prefix}NavigatorImpl

@Module
class ${name_prefix}Module {

    @Provides
    fun provide${name_prefix}Navigator(): ${name_prefix}Navigator {
        return ${name_prefix}NavigatorImpl()
    }
}