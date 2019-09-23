function User(username, password, firstName, lastName, role) {
    this.username = username;
    this.passWord = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.role = role;

    this.setUsername = setUsername;
    this.getUsername = getUsername;
    this.setPassword = setPassword;
    this.getPassword = getPassword;
    this.setFirstName = setFirstName;
    this.getFirstName = getFirstName;
    this.setLastName = setLastName;
    this.getLastName = getLastName;
    this.setEmail = setEmail;
    this.getEmail = getEmail;
    this.setPhone = setPhone;
    this.getPhone = getPhone;
    this.setRole = setRole;
    this.getRole = getRole;
    this.setDateOfBirth = setDateOfBirth;
    this.getDateOfBirth = getDateOfBirth;


    function setUsername(username) {
        this.username = username;
    }

    function getUsername() {
        return this.username;
    }

    function setPassword(password) {
        this.passWord = password;
    }

    function getPassword() {
        return this.passWord;
    }

    function setFirstName(firstName) {
        this.firstName = firstName;
    }

    function getFirstName() {
        return this.firstName;
    }

    function setLastName(lastName) {
        this.lastName = lastName;
    }

    function getLastName() {
        return this.lastName;
    }

    function setEmail(email) {
        this.email = email;
    }

    function getEmail() {
        return this.email;
    }

    function setPhone(phone) {
        this.phone = phone;
    }

    function getPhone() {
        return this.phone;
    }

    function setRole(role) {
        this.role = role;
    }

    function getRole() {
        return this.role;
    }

    function setDateOfBirth(dob) {
        this.dateOfBirth = dob;
    }

    function getDateOfBirth() {
        return this.dateOfBirth;
    }
}
