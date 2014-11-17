package demo

import grails.rest.RestfulController
import grails.plugin.springsecurity.annotation.Secured

@Secured(value=['IS_AUTHENTICATED_ANONYMOUSLY'])
class EmployeeController extends RestfulController<Employee>{

    static responseFormats = ['json', 'xml']


    EmployeeController(){
        super(Employee)
    }

}
