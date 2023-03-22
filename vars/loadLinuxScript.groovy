def call(Map config = [:]) {
	def scriptcontent = libraryResource "org/foo/scripts/linux/${config.scriptName}"
	writeFile file: "${config.scriptName}", text: scriptcontent
	bat "chmod a+x ./${config.scriptName}"
}