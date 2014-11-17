package demo

class Person {

    static mapWith = "mongo"

    String firstName
    String lastName
    String emailId
    Integer age
    Address address

    static embedded = ['address']

    static constraints = {
        firstName maxSize: 100, blank: false
        lastName()
        age()
        emailId nullable: true, email: true
    }
}
