import org.gradle.api.Plugin
import org.gradle.api.Project

class TransformPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        println("插件")
    }
}