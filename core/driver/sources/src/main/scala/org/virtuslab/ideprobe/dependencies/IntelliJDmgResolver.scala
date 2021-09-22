package org.virtuslab.ideprobe.dependencies

import java.net.URI
import org.virtuslab.ideprobe.Extensions._

class IntelliJDmgResolver(baseUri: URI) extends IntelliJPatternResolver(s"$baseUri/[artifact]-[revision].dmg")

object OfficialIntelliJDmgResolver extends IntelliJDmgResolver(URI.create("https://download.jetbrains.com/idea"))
object OfficialNightlyIntelliJDmgResolver
    extends IntelliJDmgResolver(URI.create("https://download.jetbrains.com/idea/nightly"))
