package com.github.brayancaro.boringblade.services

import com.intellij.openapi.project.Project
import com.github.brayancaro.boringblade.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
