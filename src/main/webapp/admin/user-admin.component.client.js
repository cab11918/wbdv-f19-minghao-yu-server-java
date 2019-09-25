(function () {
    var $usernameFld, $passwordFld;
    var $removeBtn, $editBtn, $createBtn;
    var $firstNameFld, $lastNameFld;
    var $userRowTemplate, $tbody;
    var $updateBtn;
    var userService = new AdminUserServiceClient(), $roleFld;
    var userId;
    $(main);

    function main() {

        $usernameFld = $("#usernameFld");
        $passwordFld = $("#passwordFld");
        $firstNameFld = $("#firstNameFld");
        $lastNameFld = $('#lastNameFld');
        $roleFld = $("#roleFld");
        $removeBtn = $('.wbdv-remove');
        $createBtn = $('.wbdv-create');
        $editBtn = $('.wbdv-edit');
        $updateBtn = $('.wbdv-update');

        $userRowTemplate = $('.wbdv-template');
        $tbody = $('#tbody');


        $createBtn.click(createUser);


        $removeBtn.click(deleteUser);

        $editBtn.click(selectUser);

        $updateBtn.click(updateUser);




        findAllUsers()


        // $(document).ready(function () {
        //     $("#wbdv-create").click(function () {
        //         createUser();
        //     });
        //
        //     $("#wbdv-create").mouseenter(function () {
        //         jQuery("#wbdv-create").css("color", "green");
        //     });
        //     $("#wbdv-create").mouseleave(function () {
        //         jQuery("#wbdv-create").css("color", "white");
        //     });
        // });


    }

    function createUser() {
        var username = $usernameFld.val();
        var password = $passwordFld.val();
        var firstName = $firstNameFld.val();
        var lastName = $lastNameFld.val();
        var role = $roleFld.val();

        var user = new User(username, password, firstName, lastName, role);

        userService
            .createUser(user).then(findAllUsers);

        $usernameFld.val('')
        $passwordFld.val('')
        $firstNameFld.val('')
        $lastNameFld.val('')
        $roleFld.val('FACULTY')


    }

    function findAllUsers() {
        userService.findAllUsers().then(renderUsers);
    }

    function findUserById() {
        userService.findUserById(userId).then(grabUp)
    }

    function deleteUser() {

        userId = event.target.id
        userService.deleteUser(userId).then(findAllUsers)


    }

    // function selectUser() {
    // }

    function updateUser() {
        var username = $usernameFld.val();
        var password = $passwordFld.val();
        var firstName = $firstNameFld.val();
        var lastName = $lastNameFld.val();
        var role = $roleFld.val();
        var updateUser = new User(username,password,firstName,lastName,role);
         renderUser(updateUser);




    }

    function renderUser(updateUser) {
        userService.updateUser(userId,updateUser).then(findAllUsers)

    }

    function renderUsers(users) {
        $tbody.empty();
        for (var i in users) {
            const user = users[i];
            const rowClone = $userRowTemplate.clone();
            rowClone.removeClass('wbdv-hidden');
            rowClone.find('.wbdv-username').html(user.username);
            rowClone.find('.wbdv-password').html(user.passWord);
            rowClone.find('.wbdv-first-name').html(user.firstName);
            rowClone.find('.wbdv-last-name').html(user.lastName);
            rowClone.find('.wbdv-role').html(user.role);
            rowClone.find(".wbdv-remove").attr('id', user.id)
            rowClone.find(".wbdv-edit").attr('id', user.id)
            rowClone.find(".wbdv-update").attr('id', user.id)
            $tbody.append(rowClone);
        }


        $(".wbdv-remove").click(function () {
            deleteUser();
        });

        $(".wbdv-edit").click(function () {
            selectUser();
        });

    }

    function selectUser() {
        userId = event.target.id

     findUserById()


    }

    function grabUp(user) {
        $usernameFld.val(user.username)
        $passwordFld.val(user.password)
        $firstNameFld.val(user.firstName)
        $lastNameFld.val(user.lastName)
        $roleFld.val(user.role)
    }


})();





