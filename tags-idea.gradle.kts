// For developers using IntelliJ IDEA, it can be useful to know whether a build was invoked from the IDE or from the CLI.
buildScan.tag(if (project.hasProperty("idea.executable")) "IDE" else "CLI")
