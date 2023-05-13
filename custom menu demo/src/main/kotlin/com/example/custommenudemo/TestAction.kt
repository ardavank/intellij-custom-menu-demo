package com.example.custommenudemo

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

open class TestAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showWarningDialog("Demo Action: $e", "Demo Action Clicked!")
    }
}