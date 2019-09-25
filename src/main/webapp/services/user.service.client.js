function AdminUserServiceClient() {
    this.createUser = createUser;
    this.findAllUsers = findAllUsers;
    this.findUserById = findUserById;
    this.deleteUser = deleteUser;
    this.updateUser = updateUser;
    var self = this;

    var userList = new Array();


    function createUser(user) {
        return fetch('https://wbdv-generic-server.herokuapp.com/api/001248197/users', {
            method: 'POST',
            body: JSON.stringify(user),
            headers: {
                'content-type': 'application/json'
            }
        })

    }

    function findAllUsers() {
        return fetch('https://wbdv-generic-server.herokuapp.com/api/001248197/users')
            .then(function (response) {
                return response.json();
            })
    }

    function findUserById(userId) {


        return fetch('https://wbdv-generic-server.herokuapp.com/api/001248197/users/' + userId, {
            method: 'GET',

        }).then(function (response) {
            return response.json();
        })


    }

    function updateUser(userId, user) {


    }

    function deleteUser(userId) {
        return fetch('https://wbdv-generic-server.herokuapp.com/api/001248197/users/' + userId, {
            method: 'DELETE',

        })


    }
}
