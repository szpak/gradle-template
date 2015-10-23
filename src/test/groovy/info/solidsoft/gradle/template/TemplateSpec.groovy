package info.solidsoft.gradle.template

import spock.lang.Specification

class TemplateSpec extends Specification {

    def "should execute Spock test"() {
        expect:
            new Template().return1() == 1
    }
}
