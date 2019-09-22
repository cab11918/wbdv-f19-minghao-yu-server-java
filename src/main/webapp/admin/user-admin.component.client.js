(function () {
    var $usernameFld, $passwordFld;
    var $removeBtn, $editBtn, $createBtn;
    var $firstNameFld, $lastNameFld;
    var $userRowTemplate, $tbody;
    var userService = new AdminUserServiceClient(), $roleFld;
    $(main);

    function main() {
        $(document).ready(function () {
            $usernameFld = document.getElementById("usernameFld");
            $passwordFld = document.getElementById("passwordFld");
            $removeBtn = document.getElementById("wbdv-remove");
            $editBtn = document.getElementById("wbdv-edit");
            $createBtn = document.getElementById("wbdv-create");
            $firstNameFld = document.getElementById("firstNameFld");
            $lastNameFld = document.getElementById("lastNameFld");
            $roleFld = document.getElementById("roleFld");
            $tbody = document.getElementById("tbody");

            $("#wbdv-create").click(function () {
                createUser();
            });

            $("#wbdv-create").mouseenter(function () {
                jQuery("#wbdv-create").css("color", "green");
            });
            $("#wbdv-create").mouseleave(function () {
                jQuery("#wbdv-create").css("color", "white");
            });
        });
    }

    function createUser() {
       var user = {
           userName: $usernameFld,
           passWord: $passwordFld,
           firstName: $firstNameFld,
           lastName: $lastNameFld,
           role: $roleFld
       };
       userService.createUser(user,"");


    }

    function findAllUsers() {
    }

    function findUserById() {
    }

    function deleteUser() {
    }

    function selectUser() {
    }

    function updateUser() {
    }

    function renderUser(user) {
    }

    function renderUsers(users) {
    }


})();





