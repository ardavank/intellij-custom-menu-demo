package com.example.custommenudemo

import com.intellij.openapi.actionSystem.Shortcut
import com.jetbrains.rd.actions.AccessRequirements
import com.jetbrains.rd.ide.model.AddToGroupRuleModel
import com.jetbrains.rdserver.actions.BackendDelegatingActionIdsProvider
import com.jetbrains.rdserver.core.RemoteProjectSession
class DemoBackendDelegatingActionIdsProvider : BackendDelegatingActionIdsProvider {
    // Gathered blocklisted actions by enabling all logs for
    // #com.jetbrains.rdserver.actions.BackendActionConverter:all then filter by "is not whitelisted
    // explicitly and is blacklisted explicitly"
    override fun getActionIds(session: RemoteProjectSession): Collection<String> {
        // NOTE: Currently we are not seeing any of the actions being blocked and
        // still actions are not shown under the right click menu
        return listOf()
    }

    override fun getEditorActionWithImmediateResultIds(
            session: RemoteProjectSession
    ): Collection<String> {
        return emptyList()
    }

    override fun getHintParentGroupIds(
            session: RemoteProjectSession
    ): Map<String, Collection<AddToGroupRuleModel>> {
        return emptyMap()
    }

    override fun isBlackListed(
            actionId: String,
            shortcut: Shortcut,
            session: RemoteProjectSession
    ): Boolean = false

    override fun isBlackListed(actionId: String, session: RemoteProjectSession): Boolean = false

    override fun getAccessRequirements(
            actionId: String,
            session: RemoteProjectSession
    ): AccessRequirements? = null
}