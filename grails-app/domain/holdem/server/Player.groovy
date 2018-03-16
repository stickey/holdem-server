package holdem.server

import grails.rest.Resource

@Resource(uri = "/player")
class Player {

    String name

    Date dateCreated = new Date()

    static constraints = {
        name nullable: false, blank: false
        dateCreated nullable: false
    }
}
