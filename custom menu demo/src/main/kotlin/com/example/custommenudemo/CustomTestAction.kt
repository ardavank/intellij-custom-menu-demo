package com.example.custommenudemo

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class CustomTestAction : AnAction("### Custom Demo Action (Ardavan) ###") {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showWarningDialog("Demo Action: $e", "Custom Action Clicked!", )
    }
}