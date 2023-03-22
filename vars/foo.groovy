def call(Map config = [:]) {
	loadLinuxScript(scriptName: 'hello-world.sh')
	sh "hello_world.sh ${config.name} ${config.date}"
}