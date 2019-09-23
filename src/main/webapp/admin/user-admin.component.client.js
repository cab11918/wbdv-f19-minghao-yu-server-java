(function () {
    var $usernameFld, $passwordFld;
    var $removeBtn, $editBtn, $createBtn;
    var $firstNameFld, $lastNameFld;
    var $userRowTemplate, $tbody;
    var userService = new AdminUserServiceClient(), $roleFld;
    $(main);

    function main() {

        $userRowTemplate = $('.wbdv-template');
        $tbody = $('tbody');
        $createBtn = $('.wbdv-create');
        $createBtn.click(createUser);

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

        findAllUsers()

    }

    function createUser() {
        $usernameFld = $("#usernameFld").val();
        $passwordFld = $("#passwordFld").val();
        $firstNameFld = $("#firstNameFld").val();
        $lastNameFld = $("#lastNameFld").val();
        $roleFld = $("#roleFld").val();
       var user = new User($usernameFld,$passwordFld,$firstNameFld,$lastNameFld,$roleFld);
       userService
           .createUser(user)
           .then(renderUsers);



    }

    function findAllUsers() {
        userService.findAllUsers().then(renderUsers);
    }

    function findUserById() {
    }

    function deleteUser() {
        $removeBtn = $(event.currentTarget)
        const id = $removeBtn.attr('id')
    }

    function selectUser() {
    }

    function updateUser() {
    }

    function renderUser(user) {

    }

    function renderUsers(users) {
        $tbody.empty();
        for(var i in users) {
            const user = users[i];
            const rowClone = $userRowTemplate.clone();
            rowClone.removeClass('wbdv-hidden');
            rowClone.find('.wbdv-username').html(user.username);
            $tbody.append();
        }
    }


})();





