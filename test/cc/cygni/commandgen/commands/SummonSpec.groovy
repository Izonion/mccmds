package cc.cygni.commandgen.commands

import spock.lang.Specification
import cc.cygni.commandgen.NBT.TAG.TAGCompound
import cc.cygni.commandgen.NBT.TAG.TAGString

class SummonSpec extends Specification {

	def "try to summon a zombie"() {
		given:
		Summon sum = new Summon(Entity.Zombie, -1, 2, 3, new TAGCompound().put("WEIJ", new TAGString("ewjio")));
		
		when:
		def compilation = sum.compile()
		
		then:
		compilation == '/summon Zombie -1 2 3 {WEIJ:"ewjio"} '
	}
	
}
