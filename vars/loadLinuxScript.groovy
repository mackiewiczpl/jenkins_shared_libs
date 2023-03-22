def call(Map config = [:]) {
	def scriptcontent = libraryResource "org/foo/scripts/linux/${config.scriptName}"
	writeFile file: "${config.scriptName}", text: scriptcontent
	sh "chmod a+x ./${config.scriptName}"
	sh "pwd"
	sh "ls -la ./"
}