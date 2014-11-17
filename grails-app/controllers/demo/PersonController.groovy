package demo

import grails.plugin.springsecurity.annotation.Secured

@Secured(value=["hasRole('ROLE_ADMIN')"])
class PersonController {
    static scaffold = true
}
