def call(Map config = [:]) {
	loadLinuxScript(scriptName: 'hello-world.sh')
	./hello_world.sh "${config.name}" "${config.date}"
}