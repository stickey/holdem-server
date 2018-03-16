package holdem.server

import grails.rest.Resource

@Resource(uri = "/game")
class Game {

    Float pot = 0.00F

    Date dateCreated = new Date()

    static constraints = {
        pot nullable: false
    }
}
