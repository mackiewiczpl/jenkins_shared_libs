def call(Map config = [:]) {
	loadLinuxScript(scriptName: 'hello-world.sh')
	bash "./hello_world.sh ${config.name} ${config.date}"
}