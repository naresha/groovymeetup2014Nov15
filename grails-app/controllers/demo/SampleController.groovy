package demo

import grails.plugin.springsecurity.annotation.Secured

@Secured(value=["hasRole('ROLE_ADMIN')"])
class SampleController {

    def index() { }

    def searchPerson(){
        switch (request.method){
            case "GET":
                return

            case "POST":
                String firstName = params.firstName
                def people = Person.where{
                    firstName == firstName
                }.list()
                def model = [people: people]
                render model: model, view : 'result'
                return
        }
    }

    def createPerson(){
        def p = new Person(firstName: 'James', lastName: 'AAA', age: 30,
            address: new Address(city: 'Bengaluru')
        )
        p.save()
    }
}
