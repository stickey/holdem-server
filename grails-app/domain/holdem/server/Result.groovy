package holdem.server

import grails.rest.Resource

@Resource(uri="/result")
class Result {

    Player player

    Game game

    Integer position

    Float winnings

    static constraints = {
        player nullable: false
        game nullable: false
        position nullable:false, min: 1
        winnings nullable: false, min: 0F
    }
}
