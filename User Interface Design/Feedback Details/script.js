
var FeedbackArray=[];
function addFeedback(){
    var string=document.getElementById("feedback").value;
    FeedbackArray.push(string);
    document.getElementById("feedback").value = "";
    document.getElementById("result").innerHTML = "<h2>" + "Feedback Details " + "</h2>" +"Successfully Added Feedback Details!";

    "<h2>"
}

function displayFeedback(){
  document.getElementById("result").innerHTML="";
  document.getElementById("result").innerHTML += "<h2>" + "Feedback Details " + "</h2>";
    for (var i=0;i<FeedbackArray.length;i++) {
        document.getElementById("result").innerHTML += "Feedback " + (i+1) + "<br>"+FeedbackArray[i]+"<br>";
    }
    FeedbackArray=[];
}
