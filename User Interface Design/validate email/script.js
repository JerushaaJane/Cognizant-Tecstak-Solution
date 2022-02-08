function validateEmail(email) {
 var emailCheck= /^\w+([\.-]?\w+)@\w+([\.-]?\w+)(\.\w{2,3})+$/;
if(emailCheck.test(email)){
    return "Valid email address!";

}
else{
    return "Invalid email address!";
}
}
console.log(validateEmail('info123@example.com'));
