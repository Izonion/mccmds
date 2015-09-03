package cc.cygni.commandgen.NBT.TAG

import spock.lang.Specification

class TAGCompoundSpec extends Specification {
	def "test Equipment TagCompound"() {
		when:
		TAGCompound tc = new TAGCompound()
		tc.put("Equipment",
				new TAGList<TAG>(
				2,
				new TAGCompound()
				.put("1", new TAGString("2"))
				.put("23", new TAGString("24")),
				new TAGCompound()
				.put("2", new TAGString("2"))))
		
		
		then:
		tc.toString() == '{Equipment:[{1:"2",23:"24"},{2:"2"}]}'
	}
}
