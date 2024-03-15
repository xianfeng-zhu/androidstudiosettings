package de.traderepublic.${PACKAGE_NAME}.publicapi

#set ($name_prefix = ${StringUtils.removeAndHump(${MODULE_NAME}, "-")})

import de.traderepublic.navigation.node.Node
import de.traderepublic.navigation.node.NodeContext

interface ${name_prefix}NodeFactory {
    fun create(nodeContext: NodeContext): Node
}
