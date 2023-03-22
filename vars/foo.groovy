def call(Map config = [:]) {
	loadLinuxScript(scriptName: 'hello-world.sh')
	bat "./hello_world.sh ${config.name} ${config.date}"
}