package com.example.custommenudemo

import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.DefaultActionGroup
import com.intellij.openapi.diagnostic.thisLogger

class CustomEditorPopupActionsGroup : DefaultActionGroup() {
    override fun update(e: AnActionEvent) {
        super.update(e)
        if (this.childrenCount > 0) return
        addStaticActions()
        addCustomActions()
    }

    private fun addCustomActions() {
        this.addSeparator()
        this.addAction(CustomTestAction())
        this.addSeparator()
    }

    private fun addStaticActions() {
        val tasks = ActionManager.getInstance().getAction("demo.StaticMenu") as DefaultActionGroup
        addAll(tasks)
    }
}