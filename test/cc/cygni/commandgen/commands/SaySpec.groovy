package cc.cygni.commandgen.commands

import spock.lang.Specification;

class SaySpec extends Specification {
	def "test Say.compile"() {
		given:
		Say say = new Say("hi")
		
		when:
		def compilation = say.compile()
		
		then:
		compilation == '/say hi '
	}
}
