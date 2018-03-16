package holdem.server

import grails.rest.Resource

@Resource(uri="/game")
class Game {

    Date dateCreated = new Date()

    static constraints = {
    }
}
