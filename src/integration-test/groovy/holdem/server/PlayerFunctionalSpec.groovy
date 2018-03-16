package holdem.server

import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse
import grails.testing.mixin.integration.Integration
import grails.transaction.*
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

@Integration
@Rollback
@Stepwise
class PlayerFunctionalSpec extends Specification {

    @Shared
    RestBuilder rest = new RestBuilder()

    void "create"() {
        when:
        RestResponse response = rest.post("http://localhost:${serverPort}/player") {
            json([name:"Matt"])
        }

        then:
        response.status == 201
    }

    void "list"() {
        when:
        RestResponse response = rest.get("http://localhost:${serverPort}/player")

        then:
        response.status == 200
    }
}
