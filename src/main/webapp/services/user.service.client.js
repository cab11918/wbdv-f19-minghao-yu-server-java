function AdminUserServiceClient() {
    this.createUser = createUser;
    this.findAllUsers = findAllUsers;
    this.findUserById = findUserById;
    this.deleteUser = deleteUser;
    this.updateUser = updateUser;
    this.url = 'https://wbdv-generic-server.herokuapp.com/api/001248197/users';
    var self = this;

    var userList = new Array();


    function createUser(user, callback) {
        console.log(user)
        return fetch(this.url, {
            method: 'POST',
            body: JSON.stringify(user),
            headers: {
                'content-type': 'application/json'
            }
        }).then(function (response) {
            return response.json()
        })




    }

    function findAllUsers() {
        return fetch(this.url).then(function (response) {
            return response.json()
        })

    }

    function findUserById(userId, callback) {
    }

    function updateUser(userId, user, callback) {
    }

    function deleteUser(userId, callback) {

    }
}
