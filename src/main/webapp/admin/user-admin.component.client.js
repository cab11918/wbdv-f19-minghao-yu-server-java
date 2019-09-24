(function () {
    var $usernameFld, $passwordFld;
    var $removeBtn, $editBtn, $createBtn;
    var $firstNameFld, $lastNameFld;
    var $userRowTemplate, $tbody;
    var userService = new AdminUserServiceClient(), $roleFld;
    $(main);

    function main() {

        $usernameFld = $("#usernameFld");
        $passwordFld = $("#passwordFld");
        $firstNameFld = $("#firstNameFld");
        $lastNameFld = $('#lastNameFld');
        $roleFld = $("#roleFld");
        $removeBtn = $('.wbdv-remove');
        $createBtn = $('.wbdv-create');

        $userRowTemplate = $('.wbdv-template');
        $tbody = $('#tbody');


        $createBtn.click(createUser);


        $removeBtn.click(deleteUser);

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

        var user = {username, password, firstName, lastName, role};

        userService
            .createUser(user).then(findAllUsers);


    }

    function findAllUsers() {
        userService.findAllUsers().then(renderUsers);
    }

    function findUserById() {
    }

    function deleteUser() {

        userId = event.target.id
        userService.deleteUser(userId).then(findAllUsers)


    }

    function selectUser() {
    }

    function updateUser() {
    }

    function renderUser(user) {

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
            $tbody.append(rowClone);
        }


        $(".wbdv-remove").click(function () {
            deleteUser();
        });

    }


})();





