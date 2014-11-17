import demo.Employee
import demo.auth.Role
import demo.auth.User
import demo.auth.UserRole

class BootStrap {

    def init = { servletContext ->
        def u = new User(username: 'admin', password: 'secret').save()
        def adminRole = new Role(authority: 'ROLE_ADMIN').save()
        UserRole.create(u, adminRole)

        new Employee(firstName: 'Adam', lastName: 'Mark').save()
        new Employee(firstName: 'George', lastName: 'DSouza').save()

    }
    def destroy = {
    }
}
