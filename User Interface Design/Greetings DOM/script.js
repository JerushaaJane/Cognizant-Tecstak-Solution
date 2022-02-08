function display(){
    var studentName = document.getElementById("sname").value;
    var cName = document.getElementById("course").value;
    if(studentName ===""){
        document.getElementById("greet").innerHTML = "Name cannot be empty";
    }
    else{
       document.getElementById("greet").innerHTML ="Hi,"+studentName+".You have successfully registered for the"+cName+" course.";
    }
}
