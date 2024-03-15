package de.traderepublic.${PACKAGE_NAME}.di

#set ($name_prefix = ${StringUtils.removeAndHump(${MODULE_NAME}, "-")})

import com.squareup.anvil.annotations.ContributesSubcomponent
import com.squareup.anvil.annotations.ContributesTo
import de.traderepublic.coreandroid.di.scopes.AppScope
import de.traderepublic.coreandroid.di.scopes.SingleIn

@SingleIn(${name_prefix}Scope::class)
@ContributesSubcomponent(
    scope = ${name_prefix}Scope::class,
    parentScope = AppScope::class
)
interface ${name_prefix}Component {

    @ContributesSubcomponent.Factory
    interface Factory {
        fun create(): ${name_prefix}Component
    }

    @ContributesTo(AppScope::class)
    interface Parent {
        fun get${name_prefix}ComponentFactory(): Factory
    }
}